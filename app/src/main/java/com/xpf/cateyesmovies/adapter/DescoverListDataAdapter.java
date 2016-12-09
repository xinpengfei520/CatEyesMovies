package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSONObject;
import com.bumptech.glide.Glide;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.activity.MallActivity;
import com.xpf.cateyesmovies.activity.QuickActivity;
import com.xpf.cateyesmovies.activity.SevenTypeDetailsActivity;
import com.xpf.cateyesmovies.activity.TicketsActivity;
import com.xpf.cateyesmovies.activity.TopActivity;
import com.xpf.cateyesmovies.activity.TwoTypeDetailsActivity;
import com.xpf.cateyesmovies.domain.DescoverListBean;
import com.xpf.cateyesmovies.domain.FindFourPictureBean;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;


/**
 * Created by xpf on 2016/12/5 :)
 * GitHub:xinpengfei520
 * Function:发现页面数据的适配器
 */

public class DescoverListDataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int PICTURE = -1; // 顶部4个图片类型
    private static final int TYPEONE = 1;  // feedType = 1的类型
    private static final int TYPETWO = 2;  // feedType = 2的类型
    private static final int TYPEFOUR = 4; // feedType = 4的类型
    private static final int TYPESEVEN = 7;// feedType = 7的类型
    private static final int TYPEEIGHT = 8;// feedType = 8的类型
    private static final int LOADTYPE = 100;     // 加载更多类型
    private static final int LOADING = 101;      // 正在加载更多
    private static final int LOADERROR = 102;    // 加载更多失败
    private static final int LOADCOMPLETE = 103; // 加载更多完成
    private static final int LOADNODATA = 104;   // 没有更多数据了

    private Context mContext;
    private List<DescoverListBean.DataBean.FeedsBean> feedsBeanList;
    private LayoutInflater mLayoutInflater; // 初始化布局加载器
    private int currentType = -1; // 默认为-1(图片类型)
    private static List<FindFourPictureBean.DataBean> pictureData; // 图片数据集合

    private int currentState = 101; // 当前的加载更多类型的状态(默认滑到底为加载)
    private int currentMaxPosition;
    private int loadViewPosition = 14;

    // 设置当前的加载类型的状态
    public void setCurrentState(int currentState) {
        this.currentState = currentState;
        notifyDataSetChanged(); // 刷新适配器
    }

    // 在原来集合的指定位置插入一组集合数据
    public void addData(List<DescoverListBean.DataBean.FeedsBean> feeds) {
        // 把新的集合数据添加到旧的集合的最后一个Item的位置(应该减去头部的4个位置)
        feedsBeanList.addAll(currentMaxPosition - 4, feeds);
        // 每次添加完数据后加载视图的位置 + 10
        loadViewPosition += 10;
    }

    public void setCurrentMaxPosition(int position) {
        currentMaxPosition = position;
    }

    public DescoverListDataAdapter(Context mContext, List<DescoverListBean.DataBean.FeedsBean> feedsBeanList) {
        this.mContext = mContext;
        this.feedsBeanList = feedsBeanList;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.e("TAG", "onCreateViewHolder()==viewType==" + viewType);
        if (viewType == TYPETWO) {
            return new TypeTwoViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_typetwo, null));
        } else if (viewType == TYPESEVEN) {
            return new TypeSevenViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_typeseven, null));
        } else if (viewType == TYPEEIGHT) {
            return new TypeEightViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_typeeight, null));
        } else if (viewType == PICTURE) {
            return new FindFourViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_fourpicture, null));
        } else if (viewType == TYPEFOUR) {
            return new TypeFourViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_typefour, null));
        } else if (viewType == TYPEONE) {
            return new TypeOneViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_typeone, null));
        } else if (viewType == LOADTYPE) {
            return new TypeLoadViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_loadmore, null));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == TYPETWO) {
            TypeTwoViewHolder typeTwoViewHolder = (TypeTwoViewHolder) holder;
            typeTwoViewHolder.setData(feedsBeanList.get(position - 4), position);
        } else if (getItemViewType(position) == TYPESEVEN) {
            TypeSevenViewHolder typeSevenViewHolder = (TypeSevenViewHolder) holder;
            typeSevenViewHolder.setData(feedsBeanList.get(position - 4), position);
        } else if (getItemViewType(position) == TYPEEIGHT) {
            TypeEightViewHolder typeEightViewHolder = (TypeEightViewHolder) holder;
            typeEightViewHolder.setData(feedsBeanList.get(position - 4), position);
        } else if (getItemViewType(position) == TYPEFOUR) {
            TypeFourViewHolder typeFourViewHolder = (TypeFourViewHolder) holder;
            typeFourViewHolder.setData(feedsBeanList.get(position - 4), position);
        } else if (getItemViewType(position) == TYPEONE) {
            TypeOneViewHolder typeOneViewHolder = (TypeOneViewHolder) holder;
            typeOneViewHolder.setData(feedsBeanList.get(position - 4), position);
        } else if (getItemViewType(position) == PICTURE) {
            FindFourViewHolder findFourViewHolder = (FindFourViewHolder) holder;
            findFourViewHolder.setData(position);
        } else if (getItemViewType(position) == LOADTYPE) {
            TypeLoadViewHolder typeLoadViewHolder = (TypeLoadViewHolder) holder;
            typeLoadViewHolder.setData(position);
        }
    }

    @Override
    public int getItemCount() {
        return feedsBeanList.size() + 5; // 本身集合的数量 + 4个图片 + 1个刷新类型
    }

    // 根据位置获取当前Item的类型
    @Override
    public int getItemViewType(int position) {

        if (position <= 3) { // 让前4个返回图片类型
            currentType = -1;
            return currentType;
        }

        // 判断是否是加载视图的位置来返回加载类型
        if (position == loadViewPosition) {
            return currentType = LOADTYPE;
        }

        // 根据位置获取下面RecyclerView数据的类型(位置要4个Item图片的位置)
        if (feedsBeanList != null && feedsBeanList.size() > 0) {
            currentType = feedsBeanList.get(position - 4).getFeedType();
        }
        return currentType;
    }

    // 加载更多类型的ViewHolder
    class TypeLoadViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.progressBar)
        ProgressBar progressBar;
        @BindView(R.id.tv_state)
        TextView tvState;
        @BindView(R.id.ll_loadMore)
        LinearLayout llLoadMore;

        public TypeLoadViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        // 根据不同的状态显示不同的视图
        public void setData(int position) {
            if (currentState == LOADING) {              // 加载中
                llLoadMore.setVisibility(View.VISIBLE);
                tvState.setText("努力加载中...");
            } else if (currentState == LOADCOMPLETE) {  // 加载完成
                llLoadMore.setVisibility(View.GONE);
                Toast.makeText(mContext, "加载更多成功", Toast.LENGTH_SHORT).show();
            } else if (currentState == LOADERROR) {     // 加载错误
                progressBar.setVisibility(View.GONE);
                tvState.setText("加载失败!");
            } else if (currentState == LOADNODATA) {    // 没有更多数据了
                progressBar.setVisibility(View.GONE);
                tvState.setText("没有更多数据了!");
            }
        }
    }

    // feedType = 1 的类型
    static class TypeOneViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.tv_today)
        TextView tvToday;
        @BindView(R.id.iv_figure)
        ImageView ivFigure;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_category)
        TextView tvCategory;
        @BindView(R.id.ll_one)
        LinearLayout llOne;

        public TypeOneViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(DescoverListBean.DataBean.FeedsBean feedsBean, final int position) {
            Glide.with(mContext).load(feedsBean.getImages().get(0).getUrl()).into(ivFigure);
            tvTitle.setText(feedsBean.getTitle());
            tvCategory.setText(feedsBean.getUser().getNickName());
            if (position == 4) {
                tvToday.setVisibility(View.VISIBLE);
            } else {
                tvToday.setVisibility(View.GONE);
            }
            // 给Item设置点击事件
            llOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "position===" + position, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    // feedType = 4 的类型
    static class TypeFourViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.tv_today)
        TextView tvToday;
        @BindView(R.id.iv_figure)
        ImageView ivFigure;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_category)
        TextView tvCategory;
        @BindView(R.id.tv_comment)
        TextView tvComment;
        @BindView(R.id.tv_looked)
        TextView tvLooked;
        @BindView(R.id.ll_four)
        LinearLayout llFour;

        public TypeFourViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(final DescoverListBean.DataBean.FeedsBean feedsBean, final int position) {
            Glide.with(mContext).load(feedsBean.getImages().get(0).getUrl()).into(ivFigure);
            tvTitle.setText(feedsBean.getTitle());
            tvCategory.setText(feedsBean.getUser().getNickName());
            tvLooked.setText(feedsBean.getViewCount() + "");
            tvComment.setText(feedsBean.getCommentCount() + "");
            if (position == 4) {
                tvToday.setVisibility(View.VISIBLE);
            } else {
                tvToday.setVisibility(View.GONE);
            }
            // 给Item设置点击事件
            llFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "position===" + position, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    // 发现页面顶部4个图片的ViewHolder
    static class FindFourViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.iv_top)
        ImageView ivTop;
        @BindView(R.id.tv_top)
        TextView tvTop;
        @BindView(R.id.ll_pic)
        LinearLayout llPic;

        public FindFourViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(final int position) {
            if (pictureData != null && pictureData.size() > 0) {
                Glide.with(mContext).load(pictureData.get(position).getImage().getUrl()).into(ivTop);
                tvTop.setText(pictureData.get(position).getTitle());
            } else {
                OkHttpUtils
                        .get()
                        .url(AppNetConfig.FINDFOURPICTURE)
                        .build()
                        .execute(new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                Log.e("TAG", "FindFourViewHolder onError()" + e.toString());
                            }

                            @Override
                            public void onResponse(String response, int id) {
//                                Log.e("TAG", "FindFourViewHolder联网请求成功" + response);
                                FindFourPictureBean findFourPictureBean = JSONObject.parseObject(response, FindFourPictureBean.class);
                                pictureData = findFourPictureBean.getData();
                            }
                        });
                if (pictureData != null && pictureData.size() > 0) {
                    Glide.with(mContext).load(pictureData.get(position).getImage().getUrl()).into(ivTop);
                    tvTop.setText(pictureData.get(position).getTitle());
                }
            }
            llPic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (position) {
                        case 0:
                            Intent intent0 = new Intent(mContext, TopActivity.class);
                            mContext.startActivity(intent0);
                            break;
                        case 1:
                            Intent intent1 = new Intent(mContext, QuickActivity.class);
                            mContext.startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(mContext, MallActivity.class);
                            mContext.startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(mContext, TicketsActivity.class);
                            mContext.startActivity(intent3);
                            break;
                    }
                }
            });
        }
    }

    // feedType = 8 的类型
    static class TypeEightViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.iv_img1)
        ImageView ivImg1;
        @BindView(R.id.iv_img2)
        ImageView ivImg2;
        @BindView(R.id.iv_img3)
        ImageView ivImg3;
        @BindView(R.id.tv_category)
        TextView tvCategory;
        @BindView(R.id.tv_comment)
        TextView tvComment;
        @BindView(R.id.tv_looked)
        TextView tvLooked;
        @BindView(R.id.tv_today)
        TextView tvToday;

        public TypeEightViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(DescoverListBean.DataBean.FeedsBean feedsBean, int position) {
            tvTitle.setText(feedsBean.getTitle());
            Glide.with(mContext).load(feedsBean.getImages().get(0).getUrl()).into(ivImg1);
            Glide.with(mContext).load(feedsBean.getImages().get(1).getUrl()).into(ivImg2);
            Glide.with(mContext).load(feedsBean.getImages().get(2).getUrl()).into(ivImg3);
            tvCategory.setText(feedsBean.getUser().getNickName());
            tvComment.setText(feedsBean.getCommentCount() + "");
            tvLooked.setText(feedsBean.getViewCount() + "");
            if (position == 4) {
                tvToday.setVisibility(View.VISIBLE);
            } else {
                tvToday.setVisibility(View.GONE);
            }
        }
    }

    // feedType = 7 的类型
    static class TypeSevenViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.iv_figure)
        ImageView ivFigure;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_category)
        TextView tvCategory;
        @BindView(R.id.tv_comment)
        TextView tvComment;
        @BindView(R.id.tv_looked)
        TextView tvLooked;
        @BindView(R.id.tv_today)
        TextView tvToday;
        @BindView(R.id.ll_seven)
        LinearLayout llSeven;

        public TypeSevenViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(final DescoverListBean.DataBean.FeedsBean feedsBean, final int position) {
            Glide.with(mContext).load(feedsBean.getImages().get(0).getUrl()).into(ivFigure);
            tvTitle.setText(feedsBean.getTitle());
            // 此处feedType = 7中又有两种情况,一种没有NickName字段,先判断防止报空
            if (feedsBean.getUser() != null) {
                tvCategory.setText(feedsBean.getUser().getNickName());
            }
            tvComment.setText(feedsBean.getCommentCount() + "");
            tvLooked.setText(feedsBean.getViewCount() + "");
            if (position == 4) {
                tvToday.setVisibility(View.VISIBLE);
            } else {
                tvToday.setVisibility(View.GONE);
            }

            // 给Item设置点击事件
            llSeven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, SevenTypeDetailsActivity.class);
                    intent.putExtra("url", feedsBean.getUrl());
                    mContext.startActivity(intent);
                }
            });
        }
    }

    // feedType = 2 的类型
    static class TypeTwoViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.iv_img1)
        ImageView ivImg1;
        @BindView(R.id.iv_img2)
        ImageView ivImg2;
        @BindView(R.id.iv_img3)
        ImageView ivImg3;
        @BindView(R.id.tv_comment)
        TextView tvComment;
        @BindView(R.id.tv_looked)
        TextView tvLooked;
        @BindView(R.id.tv_today)
        TextView tvToday;
        @BindView(R.id.ll_two)
        LinearLayout llTwo;
        List<ImageView> imgs;

        public TypeTwoViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
            initImgs();
        }

        // 初始化ImageView的集合
        private void initImgs() {
            imgs = new ArrayList<>();
            imgs.add(ivImg1);
            imgs.add(ivImg2);
            imgs.add(ivImg3);
        }

        public void setData(final DescoverListBean.DataBean.FeedsBean feedsBean, int position) {
            tvTitle.setText(feedsBean.getTitle());
            // 此处当feedType = 2时,img会有一个图片的情形和大于3个图片的情形,而布局文件最多只有3张图片,因此做如下处理
            for (int i = 0; i < (feedsBean.getImages().size() >= 3 ? 3 : feedsBean.getImages().size()); i++) {
                Glide.with(mContext).load(feedsBean.getImages().get(i).getUrl()).into(imgs.get(i));
            }
            tvLooked.setText(feedsBean.getViewCount() + ""); // 此处注意获取的类型,设置TextView应为String
            tvComment.setText(feedsBean.getCommentCount() + "");
            if (position == 4) {
                tvToday.setVisibility(View.VISIBLE);
            } else {
                tvToday.setVisibility(View.GONE);
            }

            // 设置feedType = 2的点击事件
            llTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 考虑将整个bean对象传递过去,通过获取其feedType来加载对应的url(类型不同url不同)
                    Intent intent = new Intent(mContext, TwoTypeDetailsActivity.class);
                    intent.putExtra("url", feedsBean.getUrl());
                    mContext.startActivity(intent);
                }
            });
        }
    }

//    思考:能否用接口回调实现加载更多呢 ? :)
//    private OnLoadingMoreListener onLoadingMoreListener;
//
//    public void setOnLoadingMoreListener(OnLoadingMoreListener onLoadingMoreListener) {
//        this.onLoadingMoreListener = onLoadingMoreListener;
//    }
//
//    // 加载更多的监听器
//    public interface OnLoadingMoreListener {
//        void loadMore(); // 加载更多
//    }

}
