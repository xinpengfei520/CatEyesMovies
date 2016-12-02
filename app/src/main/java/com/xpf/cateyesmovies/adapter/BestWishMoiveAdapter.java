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
import com.xpf.cateyesmovies.domain.DelayBestWishMovieBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by xpf on 2016/12/2 :)
 * Wechat:18091383534
 * Function:最受期待的电影数据的适配器
 */

public class BestWishMoiveAdapter extends BaseAdapter {

    private Context mContext;
    private List<DelayBestWishMovieBean.DataBean.MoviesBean> bestWishmovies;

    public BestWishMoiveAdapter(Context mContext, List<DelayBestWishMovieBean.DataBean.MoviesBean> bestWishmovies) {
        this.mContext = mContext;
        this.bestWishmovies = bestWishmovies;
    }

    @Override
    public int getCount() {
        return bestWishmovies.size();
    }

    @Override
    public Object getItem(int position) {
        return bestWishmovies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_bestwishmovies, null);
            ButterKnife.bind(convertView);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        DelayBestWishMovieBean.DataBean.MoviesBean moviesBean = bestWishmovies.get(position);
        Glide.with(mContext).load(moviesBean.getImg().replace("w.h", "80.100")).into(holder.ivBigcover);
        holder.tvName.setText(moviesBean.getNm());
        Log.e("TAG", "moviesBean.getWish()===" + moviesBean.getWish());
//        holder.tvNum.setText(moviesBean.getWish());

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tv_data)
        TextView tvData;
        @BindView(R.id.iv_bigcover)
        ImageView ivBigcover;
        @BindView(R.id.iv_yushou)
        ImageView ivYushou;
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_num)
        TextView tvNum;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
