package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.domain.CinemaContainer;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by xpf on 2016/12/3 :)
 * Wechat:18091383534
 * Function:影院数据的适配器
 */

public class MovieTheatreDataAdapter extends BaseAdapter {

    private Context mContext;
    private List<CinemaContainer.Databean.Chaoyangbean> str;

    public MovieTheatreDataAdapter(Context mContext, List<CinemaContainer.Databean.Chaoyangbean> str) {
        this.mContext = mContext;
        this.str = str;
    }

    @Override
    public int getCount() {
        return str.size();
    }

    @Override
    public Object getItem(int position) {
        return str.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_theatre, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // 获取数据
        CinemaContainer.Databean.Chaoyangbean chaoyangbean = str.get(position);
        holder.tvTheatreName.setText(chaoyangbean.getNm());
        holder.tvMoney.setText(chaoyangbean.getSellPrice() + "");
        holder.tvAddress.setText(chaoyangbean.getAddr());

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tv_theatreName)
        TextView tvTheatreName;
        @BindView(R.id.tv_money)
        TextView tvMoney;
        @BindView(R.id.tv_address)
        TextView tvAddress;
        @BindView(R.id.tv_seat)
        TextView tvSeat;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
