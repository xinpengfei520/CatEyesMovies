package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xpf.cateyesmovies.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by xpf on 2016/12/1 :)
 * Wechat:18091383534
 * Function:城市列表数据的适配器
 */

public class CityListAdapter extends BaseAdapter {

    private List<String> city;
    private Context mContext;

    public CityListAdapter(Context context, List<String> city) {
        mContext = context;
        this.city = city;
    }

    @Override
    public int getCount() {
        return city.size();
    }

    @Override
    public Object getItem(int position) {
        return city.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_city, null);
            ButterKnife.bind(convertView);
            holder = new ViewHolder(convertView);
            holder.tvCity = (TextView) convertView.findViewById(R.id.tv_city);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvCity.setText(city.get(position));

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tv_city)
        TextView tvCity;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
