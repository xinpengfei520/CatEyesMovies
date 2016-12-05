package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.bumptech.glide.Glide;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.domain.DescoverListBean;
import com.xpf.cateyesmovies.domain.FindFourPictureBean;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

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

    private static final int PICTURE = -1; // 顶部图片类型
    private static final int TYPETWO = 2;  // feedType = 2的类型
    private static final int TYPESEVEN = 7;// feedType = 7的类型
    private static final int TYPEEIGHT = 8;// feedType = 8的类型

    private Context mContext;
    private List<DescoverListBean.DataBean.FeedsBean> feedsBeanList;
    private LayoutInflater mLayoutInflater; // 初始化布局加载器
    private int currentType = -1; // 默认为-1(图片类型)
    private static List<FindFourPictureBean.DataBean> pictureData; // 图片数据集合

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
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == TYPETWO) {
            TypeTwoViewHolder typeTwoViewHolder = (TypeTwoViewHolder) holder;
            typeTwoViewHolder.setData(feedsBeanList.get(position), position);
        } else if (getItemViewType(position) == TYPESEVEN) {
            TypeSevenViewHolder typeSevenViewHolder = (TypeSevenViewHolder) holder;
            typeSevenViewHolder.setData(feedsBeanList.get(position), position);
        } else if (getItemViewType(position) == TYPEEIGHT) {
            TypeEightViewHolder typeEightViewHolder = (TypeEightViewHolder) holder;
            typeEightViewHolder.setData(feedsBeanList.get(position), position);
        } else if (getItemViewType(position) == PICTURE) {
            FindFourViewHolder findFourViewHolder = (FindFourViewHolder) holder;
            findFourViewHolder.setData(position);
        }
    }

    @Override
    public int getItemCount() {
        return feedsBeanList.size(); // + 4 ? Why OutOfIndex ?
    }

    // 根据位置获取当前Item的类型
    @Override
    public int getItemViewType(int position) {

        if (position <= 3) { // 让前4个返回图片类型
            currentType = -1;
            return currentType;
        }

        if (feedsBeanList != null && feedsBeanList.size() > 0) {
            currentType = feedsBeanList.get(position).getFeedType();
            Log.e("TAG", "position===" + position + ",feedsBeanList size===" + feedsBeanList.size() + ",FeedType===" + feedsBeanList.get(position).getFeedType());
        }
        return currentType;
    }

    // 发现页面顶部4个图片的ViewHolder
    static class FindFourViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.iv_top)
        ImageView ivTop;
        @BindView(R.id.tv_top)
        TextView tvTop;

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
                                Log.e("TAG", "FindFourViewHolder联网请求成功" + response);
                                FindFourPictureBean findFourPictureBean = JSONObject.parseObject(response, FindFourPictureBean.class);
                                pictureData = findFourPictureBean.getData();
                            }
                        });
                if (pictureData != null && pictureData.size() > 0) {
                    Glide.with(mContext).load(pictureData.get(position).getImage().getUrl()).into(ivTop);
                    tvTop.setText(pictureData.get(position).getTitle());
                }
            }
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

        public TypeSevenViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(DescoverListBean.DataBean.FeedsBean feedsBean, int position) {
            Glide.with(mContext).load(feedsBean.getImages().get(0).getUrl()).into(ivFigure);
            tvTitle.setText(feedsBean.getTitle());
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

        public TypeTwoViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(DescoverListBean.DataBean.FeedsBean feedsBean, int position) {
            tvTitle.setText(feedsBean.getTitle());
            Glide.with(mContext).load(feedsBean.getImages().get(0).getUrl()).into(ivImg1);
            Glide.with(mContext).load(feedsBean.getImages().get(1).getUrl()).into(ivImg2);
            Glide.with(mContext).load(feedsBean.getImages().get(2).getUrl()).into(ivImg3);
            tvLooked.setText(feedsBean.getViewCount() + "");
            tvComment.setText(feedsBean.getCommentCount() + "");
            if (position == 4) {
                tvToday.setVisibility(View.VISIBLE);
            } else {
                tvToday.setVisibility(View.GONE);
            }
        }
    }

}
