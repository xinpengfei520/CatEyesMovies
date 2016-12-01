package com.xpf.cateyesmovies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.xpf.cateyesmovies.R;
import com.xpf.cateyesmovies.domain.HotMovieListViewBean;
import com.xpf.cateyesmovies.domain.HotMovieViewPagerBean;

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
    private LayoutInflater mLayoutInflater;
    private List<HotMovieViewPagerBean.DataBean> datas; // banners
    private List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean;

    public void setDatas(List<HotMovieViewPagerBean.DataBean> datas) {
        this.datas = datas;
    }

    public void setMoviesBean(List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean) {
        this.moviesBean = moviesBean;
    }

    public HotMoviesAdapter(Context mContext) {
        this.mContext = mContext;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.e("TAG", "onCreateViewHolder()==viewType==" + viewType);
        if (viewType == BANNER) {
//            return new VP_ViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_hotviewpager, null));
        } else if (viewType == SUBJECT) {
            return new Subject_ViewHolder(mContext, mLayoutInflater.inflate(R.layout.item_listview, null));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        if (getItemViewType(position) == BANNER) {
//            VP_ViewHolder vp_ViewHolder = (VP_ViewHolder) holder;
//            vp_ViewHolder.setData(datas);
//        } else if (getItemViewType(position) == SUBJECT) {
//            Subject_ViewHolder subject_ViewHolder = (Subject_ViewHolder) holder;
//            subject_ViewHolder.setData(moviesBean);
//        }
    }

    @Override
    public int getItemCount() {
        return 2;
//        return moviesBean == null ? 2 : moviesBean.size() + 1;
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
                currentType = NORMAL;
                break;
//            default:
//                currentType = SUBJECT;
        }
        return currentType;
    }

    static class Subject_ViewHolder extends RecyclerView.ViewHolder {

        private final Context mContext;
        private HotMoviesListViewAdapter adapter;
        private ListView listView;

        public Subject_ViewHolder(Context mContext, View itemView) {
            super(itemView);
            this.mContext = mContext;
            listView = (ListView) itemView.findViewById(R.id.listView);
        }

        public void setData(List<HotMovieListViewBean.DataBean.MoviesBean> moviesBean) {
            adapter = new HotMoviesListViewAdapter(mContext, moviesBean);
            listView.setAdapter(adapter);
        }
    }

}
