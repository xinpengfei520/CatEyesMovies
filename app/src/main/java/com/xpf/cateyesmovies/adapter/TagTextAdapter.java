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
 * Created by xpf on 2016/12/2 :)
 * Wechat:18091383534
 * Function:发现页面头部文本标签的适配器
 */

public class TagTextAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> typeString; // 类型数据

    public TagTextAdapter(Context mContext, List<String> typeString) {
        this.mContext = mContext;
        this.typeString = typeString;
    }

    @Override
    public int getCount() {
        return typeString.size();
    }

    @Override
    public Object getItem(int position) {
        return typeString.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_tagtext, null);
            ButterKnife.bind(convertView);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        String str = typeString.get(position);
        holder.tvTag.setText(str);

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tv_tag)
        TextView tvTag;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
