package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.domain.FindAwardsMovieBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by xpf on 2016/12/2 :)
 * Wechat:18091383534
 * Function:发现页面的获奖电影数据的适配器
 */

public class AwardsMoviesAdapter extends BaseAdapter {

    private Context mContext;
    private List<FindAwardsMovieBean.DataBean> awardsDataBean;

    public AwardsMoviesAdapter(Context mContext, List<FindAwardsMovieBean.DataBean> awardsDataBean) {
        this.mContext = mContext;
        this.awardsDataBean = awardsDataBean;
    }

    @Override
    public int getCount() {
        return awardsDataBean.size();
    }

    @Override
    public Object getItem(int position) {
        return awardsDataBean.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_awardsmovies, null);
            ButterKnife.bind(convertView);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        FindAwardsMovieBean.DataBean dataBean = awardsDataBean.get(position);
        Glide.with(mContext).load(dataBean.getImg().replace("w.h", "80.100")).into(holder.ivImg);
        holder.tvName.setText(dataBean.getMovieName());
        holder.tvPrize.setText(dataBean.getPrizeName());
        holder.tvDate.setText(dataBean.getHeldDate());
        holder.tvFestival.setText(dataBean.getFestivalName());

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tv_festival)
        TextView tvFestival;
        @BindView(R.id.tv_date)
        TextView tvDate;
        @BindView(R.id.iv_img)
        ImageView ivImg;
        @BindView(R.id.tv_prize)
        TextView tvPrize;
        @BindView(R.id.tv_name)
        TextView tvName;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
