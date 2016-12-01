package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.domain.HotMovieListViewBean;
import com.xpf.cateyesmovies.domain.HotMovieViewPagerBean;
import com.youth.banner.Banner;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerClickListener;
import com.youth.banner.listener.OnLoadImageListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xpf on 2016/11/30 :)
 * Wechat:18091383534
 * Function:热映页面数据的适配器
 */

public class HotMoviesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int BANNER = 0;   // 广告类型
    public static final int SUBJECT = 1;  // 专题类型
    public static final int NORMAL = 2;   // 普通类型
    private int currentType = 0;          // 默认类型为0
    private final Context mContext;
    private List<HotMovieViewPagerBean.DataBean> datas; // banners
    private List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean;

    public void setMoviesBean(List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean) {
        this.moviesBean = moviesBean;
    }

    private LayoutInflater mLayoutInflater;

    public HotMoviesAdapter(Context mContext, List<HotMovieViewPagerBean.DataBean> datas) {
        this.mContext = mContext;
        this.datas = datas;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.e("TAG", "onCreateViewHolder()==viewType==" + viewType);
        if (viewType == BANNER) {
            return new VP_ViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_hotviewpager, null));
        } else if (viewType == SUBJECT) {
            return new Subject_ViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_subject, null));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == BANNER) {
            VP_ViewHolder vp_ViewHolder = (VP_ViewHolder) holder;
            vp_ViewHolder.setData(datas);
        } else if (getItemViewType(position) == BANNER) {
            Subject_ViewHolder subject_ViewHolder = (Subject_ViewHolder) holder;
            subject_ViewHolder.setData(moviesBean);
        }
    }

    @Override
    public int getItemCount() {
        return moviesBean == null ? 2 : moviesBean.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {

        switch (position) {
            case BANNER:
                currentType = BANNER;
                break;
            case SUBJECT:
                currentType = SUBJECT;
                break;
            case NORMAL:
                currentType = SUBJECT;
                break;
        }
        return currentType;
    }

    static class Subject_ViewHolder extends RecyclerView.ViewHolder {

        private final Context mContext;
        ImageView iv_figure;
        TextView tv_title;
        TextView tv_guanzhong;
        TextView tv_zhuanye;
        TextView tv_jianjie;
        TextView tv_changci;
        TextView tv_buy;
        TextView tv_zhuanti1;
        TextView tv_zhuanti2;

        public Subject_ViewHolder(Context mContext, View itemView) {
            super(itemView);
            this.mContext = mContext;
            iv_figure = (ImageView) itemView.findViewById(R.id.iv_figure);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            tv_guanzhong = (TextView) itemView.findViewById(R.id.tv_guanzhong);
            tv_zhuanye = (TextView) itemView.findViewById(R.id.tv_zhuanye);
            tv_jianjie = (TextView) itemView.findViewById(R.id.tv_jianjie);
            tv_changci = (TextView) itemView.findViewById(R.id.tv_changci);
            tv_buy = (TextView) itemView.findViewById(R.id.tv_buy);
            tv_zhuanti1 = (TextView) itemView.findViewById(R.id.tv_zhuanti1);
            tv_zhuanti2 = (TextView) itemView.findViewById(R.id.tv_zhuanti2);
        }

        public void setData(List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean) {
            if (moviesBean != null && moviesBean.size() > 0) {
                for (int i = 0; i < moviesBean.size(); i++) {
                    Glide.with(mContext).load(moviesBean.get(i).getImg()).into(iv_figure);
                    tv_changci.setText(moviesBean.get(i).getShowInfo());
                    tv_title.setText(moviesBean.get(i).getNm());
                    tv_jianjie.setText(moviesBean.get(i).getScm());
                    tv_changci.setText(moviesBean.get(i).getScm());
                }
            }
        }
    }

    // 热映界面ViewPager的ViewHolder
    static class VP_ViewHolder extends RecyclerView.ViewHolder {

        private final Context mContext;
        private Banner banner;

        public VP_ViewHolder(Context mContext, View itemView) {
            super(itemView);
            this.mContext = mContext;
            banner = (Banner) itemView.findViewById(R.id.banner);
        }

        public void setData(final List<HotMovieViewPagerBean.DataBean> datas) {
            final List<String> imageUrls = new ArrayList<>();
            if (datas != null && datas.size() > 0) {
                for (int i = 0; i < datas.size(); i++) {
                    imageUrls.add(datas.get(i).getImgUrl());
                }
            }

            // 设置BANNER的切换的样式
            banner.setBannerAnimation(Transformer.DepthPage);
            // 设置加载banner的图片显示
            banner.setImages(imageUrls, new OnLoadImageListener() {
                @Override
                public void OnLoadImage(ImageView view, Object url) {
                    // 异步联网请求图片
                    Glide.with(mContext).load(url).into(view);
                }
            });

            // 设置banner的点击事件
            banner.setOnBannerClickListener(new OnBannerClickListener() {
                @Override
                public void OnBannerClick(int position) {
                    Toast.makeText(mContext, "position===" + position, Toast.LENGTH_SHORT).show();

                    // 预留跳转到详情页面-------------
                }
            });
        }
    }

}
