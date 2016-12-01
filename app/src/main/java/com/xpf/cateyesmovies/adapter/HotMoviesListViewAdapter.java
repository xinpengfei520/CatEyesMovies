package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.domain.HotMovieListViewBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by xpf on 2016/12/1 :)
 * Wechat:18091383534
 * Function:热映界面ListView的适配器
 */

public class HotMoviesListViewAdapter extends BaseAdapter {

    private Context mContext;
    private List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean;

    public HotMoviesListViewAdapter(Context mContext, List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean) {
        this.mContext = mContext;
        this.moviesBean = moviesBean;
    }

    @Override
    public int getCount() {
        return moviesBean == null ? 0 : moviesBean.size();
    }

    @Override
    public Object getItem(int position) {
        return moviesBean.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_subject, null);
            ButterKnife.bind(convertView);
            holder = new ViewHolder(convertView);
            holder.ivFigure = (ImageView) convertView.findViewById(R.id.iv_figure);
            holder.tvTitle = (TextView) convertView.findViewById(R.id.tv_title);
            holder.tvChangci = (TextView) convertView.findViewById(R.id.tv_changci);
            holder.tvJianjie = (TextView) convertView.findViewById(R.id.tv_jianjie);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        HotMovieListViewBean.DataBean.MoviesBean movie = moviesBean.get(position);
        Log.e("TAG", "movieBeanSize===" + moviesBean.size());
        Glide.with(mContext).load(movie.getImg()).into(holder.ivFigure);
        holder.tvTitle.setText(movie.getNm());
        holder.tvChangci.setText(movie.getShowInfo());
        holder.tvJianjie.setText(movie.getScm());

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.iv_figure)
        ImageView ivFigure;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_guanzhong)
        TextView tvGuanzhong;
        @BindView(R.id.tv_zhuanye)
        TextView tvZhuanye;
        @BindView(R.id.tv_jianjie)
        TextView tvJianjie;
        @BindView(R.id.tv_changci)
        TextView tvChangci;
        @BindView(R.id.tv_buy)
        TextView tvBuy;
        @BindView(R.id.tv_zhuanti1)
        TextView tvZhuanti1;
        @BindView(R.id.tv_zhuanti2)
        TextView tvZhuanti2;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
