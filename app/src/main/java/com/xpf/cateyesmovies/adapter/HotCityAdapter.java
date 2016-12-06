package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.domain.CityBean;

import java.util.List;

/**
 * Created by xpf on 2016/12/6 :)
 * GitHub:xinpengfei520
 * Function:热门城市列表的适配器
 */

public class HotCityAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private List<CityBean> hotCityBeen;

    public HotCityAdapter(Context context, List<CityBean> hotCityBeen) {
        this.context = context;
        inflater = LayoutInflater.from(this.context);
        this.hotCityBeen = hotCityBeen;
    }

    @Override
    public int getCount() {
        return hotCityBeen.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_city, null);
        TextView city = (TextView) convertView.findViewById(R.id.cityBean);
        city.setText(hotCityBeen.get(position).getName());
        return convertView;
    }
}
