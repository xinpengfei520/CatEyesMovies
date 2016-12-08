package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.domain.TopDataBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by xpf on 2016/12/8 :)
 * GitHub:xinpengfei520
 * Function:Top100数据的适配器
 */

public class TopMovieAdapter extends RecyclerView.Adapter<TopMovieAdapter.MyViewHolder> {

    private Context mContext;
    private List<TopDataBean.DataBean.MoviesBean> movies;
    private LayoutInflater mLayoutInflater;

    public TopMovieAdapter(Context mContext, List<TopDataBean.DataBean.MoviesBean> movies) {
        this.mContext = mContext;
        this.movies = movies;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_topmovies, null));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.setData(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.iv_cover)
        ImageView ivCover;
        @BindView(R.id.tv_dir)
        TextView tvDir;
        @BindView(R.id.tv_star)
        TextView tvStar;
        @BindView(R.id.tv_date)
        TextView tvDate;

        public MyViewHolder(Context mContext, View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.mContext = mContext;
        }

        public void setData(TopDataBean.DataBean.MoviesBean moviesBean) {
            Glide.with(mContext).load(moviesBean.getImg().replace("w.h", "80.100")).into(ivCover);
            tvName.setText(moviesBean.getNm());
            tvDir.setText(moviesBean.getDir());
            tvStar.setText(moviesBean.getStar());
            tvDate.setText(moviesBean.getPubDesc());
        }
    }

}
