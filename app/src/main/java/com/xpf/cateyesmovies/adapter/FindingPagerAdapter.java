package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.domain.FindAwardsMovieBean;
import com.xpf.cateyesmovies.domain.FindTagDataBean;
import com.xpf.cateyesmovies.domain.FindingPicDataBean;
import com.xpf.cateyesmovies.utils.AppNetConfig;
import com.xpf.cateyesmovies.utils.DensityUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * Created by xpf on 2016/12/8 :)
 * GitHub:xinpengfei520
 * Function:找片页面数据的适配器(实现方式二)
 */

public class FindingPagerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int TAG = 1;   // TAG类型
    public static final int PIC = 2;   // PIC类型
    public static final int AWARD = 3; // AWARD类型
    private Context mContext;
    private List<FindTagDataBean.DataBean> tagData;
    private LayoutInflater mLayoutInflater;
    private int currentType = 1;
    private static List<FindingPicDataBean.DataBean> picList; // 图文数据集合
    private static List<FindAwardsMovieBean.DataBean> dataBeen;

    public FindingPagerAdapter(Context mContext, List<FindTagDataBean.DataBean> tagData) {
        this.mContext = mContext;
        this.tagData = tagData;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TAG) {
            return new TagViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_tag, null));
        } else if (viewType == PIC) {
            return new PicViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_pic, null));
        } else if (viewType == AWARD) {
            return new AwardViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_award, null));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == TAG) {
            TagViewHolder tagViewHolder = (TagViewHolder) holder;
            tagViewHolder.setData(tagData.get(position), position);
        } else if (getItemViewType(position) == PIC) {
            PicViewHolder picViewHolder = (PicViewHolder) holder;
            picViewHolder.setData(position - 3);
        } else if (getItemViewType(position) == AWARD) {
            AwardViewHolder awardViewHolder = (AwardViewHolder) holder;
            awardViewHolder.setData(position - 7);
        }
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    @Override
    public int getItemViewType(int position) {
        if (position < 3) {
            currentType = TAG;
            return currentType;
        } else if (position < 7) {
            currentType = PIC;
            return currentType;
        }
        return currentType = AWARD;
    }

    // 获奖类型的ViewHolder
    class AwardViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.linearLayout)
        LinearLayout linearLayout;
        @BindView(R.id.horizontalScrollView)
        HorizontalScrollView horizontalScrollView;
        @BindView(R.id.tv_allAwards)
        TextView tvAllAwards;

        public AwardViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(int position) {
            if (dataBeen != null && dataBeen.size() > 0) {
                bindData(position);
            } else {
                OkHttpUtils
                        .get()
                        .url(AppNetConfig.FINDMOVIEAWARDSURL)
                        .build()
                        .execute(new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                Log.e("TAG", "联网请求失败===" + e.toString());
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                Log.e("TAG", "联网请求成功===" + response);
                                FindAwardsMovieBean findAwardsMovieBean = JSONObject.parseObject(response, FindAwardsMovieBean.class);
                                dataBeen = findAwardsMovieBean.getData();
                            }
                        });
                bindData(position);
            }
        }

        private void bindData(int position) {
            if (dataBeen != null && dataBeen.size() > 0) {

                for (int i = 0; i < dataBeen.size(); i++) {

                    // new a vertical params , that is virtual , it must use with widget
                    LinearLayout.LayoutParams verticalLp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT);
                    verticalLp.setMargins(5, 5, 5, 5);

                    // new a vertical LinearLayout
                    LinearLayout verticalLayout = new LinearLayout(mContext);
                    verticalLayout.setOrientation(LinearLayout.VERTICAL);
                    verticalLayout.setGravity(Gravity.CENTER_HORIZONTAL);

                    // add verticalLayout to linearLayout of horizontal
                    verticalLayout.setTag(i);
                    linearLayout.addView(verticalLayout, verticalLp);

                    // new a textLp
                    LinearLayout.LayoutParams textLp = new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                    // new a textView widget
                    TextView bigText = new TextView(mContext);
                    bigText.setText(dataBeen.get(i).getPrizeName());
                    bigText.setPadding(2, 2, 2, 2);
                    bigText.setGravity(Gravity.CENTER);
                    verticalLayout.addView(bigText, textLp);

                    // new a textView widget
                    TextView smallText = new TextView(mContext);
                    smallText.setText(dataBeen.get(i).getHeldDate());
                    smallText.setPadding(2, 2, 2, 2);
                    smallText.setGravity(Gravity.CENTER);
                    smallText.setTextSize(10);
                    verticalLayout.addView(smallText, textLp);

                    // new a imageLp
                    LinearLayout.LayoutParams imageLp = new LinearLayout.LayoutParams(
                            DensityUtil.dp2px(mContext, 80), DensityUtil.dp2px(mContext, 100));
                    ImageView imageView = new ImageView(mContext);
                    Glide.with(mContext).load(dataBeen.get(i).getImg().replace("w.h", "80.100")).into(imageView);
                    imageLp.setMargins(0, 0, 0, DensityUtil.dp2px(mContext, 10));
                    verticalLayout.addView(imageView, imageLp);

                    // new a nameText widget
                    TextView nameText = new TextView(mContext);
                    nameText.setText(dataBeen.get(i).getMovieName());
                    nameText.setPadding(2, 2, 2, 2);
                    nameText.setGravity(Gravity.CENTER);
                    verticalLayout.addView(nameText, textLp);
                }
            }
        }
    }

    // PIC类型的ViewHolder
    static class PicViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.tv_big)
        TextView tvBig;
        @BindView(R.id.tv_small)
        TextView tvSmall;
        @BindView(R.id.iv_bg)
        ImageView ivBg;
        @BindView(R.id.iv_src)
        ImageView ivSrc;

        public PicViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(int position) {
            if (picList != null && picList.size() > 0) { // 有数据
                Glide.with(mContext).load(picList.get(position).getMovieImgs()
                        .get(0).replace("w.h", "80.100")).into(ivSrc);
                Glide.with(mContext).load(picList.get(position).getMovieImgs()
                        .get(1).replace("w.h", "90.80")).into(ivBg);
                tvBig.setText(picList.get(position).getBoardName());
                tvSmall.setText(picList.get(position).getMovieName());

            } else { // 没有数据
                OkHttpUtils
                        .get()
                        .url(AppNetConfig.FINDINGPIC)
                        .build()
                        .execute(new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                Log.e("TAG", "PIC数据联网请求失败" + e.toString());
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                Log.e("TAG", "PIC数据联网请求成功" + response);
                                FindingPicDataBean findingPicDataBean = new Gson().fromJson(response, FindingPicDataBean.class);
                                picList = findingPicDataBean.getData();
                            }
                        });
                if (picList != null && picList.size() > 0) {
                    Glide.with(mContext).load(picList.get(position).getMovieImgs()
                            .get(0).replace("w.h", "80.100")).into(ivSrc);
                    Glide.with(mContext).load(picList.get(position).getMovieImgs()
                            .get(1).replace("w.h", "90.80")).into(ivBg);
                    tvBig.setText(picList.get(position).getBoardName());
                    tvSmall.setText(picList.get(position).getMovieName());
                }
            }
        }
    }

    // TAG类型的ViewHolder
    static class TagViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.linearLayout)
        LinearLayout linearLayout;
        @BindView(R.id.gray_view)
        View grayView;
        @BindView(R.id.horizontalScrollView)
        HorizontalScrollView horizontalScrollView;

        public TagViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(FindTagDataBean.DataBean dataBean, int position) {
            TextView type = new TextView(mContext);
            if ("cat".equals(dataBean.getTagTypeName())) {
                type.setText("类型");
            } else if ("source".equals(dataBean.getTagTypeName())) {
                type.setText("地区");
            } else if ("year".equals(dataBean.getTagTypeName())) {
                type.setText("年代");
            }
            type.setGravity(Gravity.CENTER);
            type.setPadding(5, 5, 5, 5);
            linearLayout.addView(type); // 将文本和参数添加到到线性布局中

            for (int i = 0; i < dataBean.getTagList().size(); i++) {
                // 定义一个线性的参数类型
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
                // 设置边距
                params.setMargins(10, 5, 10, 5);
                TextView textView = new TextView(mContext);
                textView.setText(dataBean.getTagList().get(i).getTagName());
                textView.setGravity(Gravity.CENTER);
                textView.setPadding(5, 5, 5, 5);
                textView.setBackgroundResource(R.drawable.tagtext_shape);
                linearLayout.addView(textView, params); // 将文本和参数添加到到线性布局中
            }
            if (position == 2) {
                grayView.setVisibility(View.VISIBLE);
            } else {
                grayView.setVisibility(View.GONE);
            }
        }
    }

}
