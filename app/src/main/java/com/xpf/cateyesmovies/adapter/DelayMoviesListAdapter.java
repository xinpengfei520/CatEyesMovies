package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.domain.DelayMovieListBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by xpf on 2016/12/2 :)
 * Wechat:18091383534
 * Function:待映页面ListView数据的适配器
 */

public class DelayMoviesListAdapter extends BaseAdapter {

    private Context mContext;
    private List<DelayMovieListBean.DataBean.ComingBean> comingMovieBean;

    public DelayMoviesListAdapter(Context mContext, List<DelayMovieListBean.DataBean.ComingBean> comingMovieBean) {
        this.mContext = mContext;
        this.comingMovieBean = comingMovieBean;
    }

    @Override
    public int getCount() {
        return comingMovieBean.size();
    }

    @Override
    public Object getItem(int position) {
        return comingMovieBean.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_delaymovie, null);
            ButterKnife.bind(convertView);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        DelayMovieListBean.DataBean.ComingBean comingBean = comingMovieBean.get(position);
        Glide.with(mContext).load(comingBean.getImg()).into(holder.ivImage);
        holder.tvDate.setText(comingBean.getComingTitle());
        holder.tvName.setText(comingBean.getNm());
//        holder.tvNumber.setText(comingBean.getWish());
        holder.tvDes.setText(comingBean.getScm());
        holder.tvZhuyan.setText(comingBean.getStar());

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.iv_image)
        ImageView ivImage;
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_number)
        TextView tvNumber;
        @BindView(R.id.tv_des)
        TextView tvDes;
        @BindView(R.id.tv_zhuyan)
        TextView tvZhuyan;
        @BindView(R.id.tv_yushou)
        TextView tvYushou;
        @BindView(R.id.tv_date)
        TextView tvDate;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
