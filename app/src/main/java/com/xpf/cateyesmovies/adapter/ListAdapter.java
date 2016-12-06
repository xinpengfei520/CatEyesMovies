//package com.xpf.cateyesmovies.adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.BaseAdapter;
//import android.widget.GridView;
//import android.widget.ListView;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.baidu.location.LocationClient;
//import com.baidu.location.LocationClientOption;
//import com.xpf.cateyesmovies.R;
//import com.xpf.cateyesmovies.domain.CityBean;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.regex.Pattern;
//
///**
// * Created by xpf on 2016/12/6 :)
// * GitHub:xinpengfei520
// * Function:城市列表的适配器
// */
//
//public class ListAdapter extends BaseAdapter {
//    final int VIEW_TYPE = 5;
//    private Context context;
//    private int locateProcess;
//    private boolean isNeedFresh;
//    private BaseAdapter adapter;
//    private ListView personList;
//    private List<CityBean> list;
//    private List<String> hisCity;
//    private List<CityBean> hotList;
//    private LayoutInflater inflater;
//    private String currentCity;
//    private LocationClient mLocationClient;
//    private String[] sections;// 存放存在的汉语拼音首字母
//
//    public ListAdapter(Context context, List<CityBean> list, List<CityBean> hotList,
//                       List<String> hisCity, HashMap<String, Integer> alphaIndexer, int locateProcess,
//                       ListView personList, String currentCity, LocationClient mLocationClient,
//                       boolean isNeedFresh, BaseAdapter adapter) {
//        this.inflater = LayoutInflater.from(context);
//        this.list = list;
//        this.adapter = adapter;
//        this.context = context;
//        this.hotList = hotList;
//        this.hisCity = hisCity;
//        this.personList = personList;
//        this.isNeedFresh = isNeedFresh;
//        this.currentCity = currentCity;
//        this.locateProcess = locateProcess;
//        this.mLocationClient = mLocationClient;
//        alphaIndexer = new HashMap<String, Integer>();
//        sections = new String[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            // 当前汉语拼音首字母
//            String currentStr = getAlpha(list.get(i).getPinyi());
//            // 上一个汉语拼音首字母，如果不存在为" "
//            String previewStr = (i - 1) >= 0 ? getAlpha(list.get(i - 1)
//                    .getPinyi()) : " ";
//            if (!previewStr.equals(currentStr)) {
//                String name = getAlpha(list.get(i).getPinyi());
//                alphaIndexer.put(name, i);
//                sections[i] = name;
//            }
//        }
//    }
//
//    @Override
//    public int getViewTypeCount() {
//        return VIEW_TYPE;
//    }
//
//    @Override
//    public int getItemViewType(int position) {
//        return position < 4 ? position : 4;
//    }
//
//    @Override
//    public int getCount() {
//        return list.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return list.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    ViewHolder holder;
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        final TextView city;
//        int viewType = getItemViewType(position);
//        if (viewType == 0) { // 定位
//            convertView = inflater.inflate(R.layout.frist_list_item, null);
//            TextView locateHint = (TextView) convertView
//                    .findViewById(R.id.locateHint);
//            city = (TextView) convertView.findViewById(R.id.lng_city);
//            // 设置City的点击事件
//            city.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (locateProcess == 2) {
//                        Toast.makeText(context,
//                                city.getText().toString(), Toast.LENGTH_SHORT).show();
//                    } else if (locateProcess == 3) {
//                        locateProcess = 1;
//                        personList.setAdapter(adapter);
//                        adapter.notifyDataSetChanged();
//                        mLocationClient.stop();
//                        isNeedFresh = true;
//                        initLocation();
//                        currentCity = "";
//                        mLocationClient.start();
//                    }
//                }
//            });
//            ProgressBar pbLocate = (ProgressBar) convertView
//                    .findViewById(R.id.pbLocate);
//            if (locateProcess == 1) { // 正在定位
//                locateHint.setText("正在定位");
//                city.setVisibility(View.GONE);
//                pbLocate.setVisibility(View.VISIBLE);
//            } else if (locateProcess == 2) { // 定位成功
//                locateHint.setText("当前定位城市");
//                city.setVisibility(View.VISIBLE);
//                city.setText(currentCity);
//                mLocationClient.stop();
//                pbLocate.setVisibility(View.GONE);
//            } else if (locateProcess == 3) {
//                locateHint.setText("未定位到城市,请选择");
//                city.setVisibility(View.VISIBLE);
//                city.setText("重新选择");
//                pbLocate.setVisibility(View.GONE);
//            }
//        } else if (viewType == 1) { // 最近访问城市
//            convertView = inflater.inflate(R.layout.recent_city, null);
//            GridView rencentCity = (GridView) convertView
//                    .findViewById(R.id.recent_city);
//            rencentCity
//                    .setAdapter(new HitCityAdapter(context, this.hisCity));
//            rencentCity.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view,
//                                        int position, long id) {
//                    Toast.makeText(context,
//                            hisCity.get(position), Toast.LENGTH_SHORT).show();
//                }
//            });
//            TextView recentHint = (TextView) convertView.findViewById(R.id.recentHint);
//            recentHint.setText("最近访问的城市");
//        } else if (viewType == 2) {
//            convertView = inflater.inflate(R.layout.recent_city, null);
//            GridView hotCity = (GridView) convertView.findViewById(R.id.recent_city);
//            hotCity.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view,
//                                        int position, long id) {
//                    Toast.makeText(context,
//                            hotList.get(position).getName(), Toast.LENGTH_SHORT).show();
//                }
//            });
//            hotCity.setAdapter(new HotCityAdapter(context, this.hotList));
//            TextView hotHint = (TextView) convertView
//                    .findViewById(R.id.recentHint);
//            hotHint.setText("热门城市");
//        } else if (viewType == 3) {
//            convertView = inflater.inflate(R.layout.total_item, null);
//        } else {
//            if (convertView == null) {
//                convertView = inflater.inflate(R.layout.list_item, null);
//                holder = new ViewHolder();
//                holder.alpha = (TextView) convertView
//                        .findViewById(R.id.alpha);
//                holder.name = (TextView) convertView
//                        .findViewById(R.id.name);
//                convertView.setTag(holder);
//            } else {
//                holder = (ViewHolder) convertView.getTag();
//            }
//            if (position >= 1) {
//                holder.name.setText(list.get(position).getName());
//                String currentStr = getAlpha(list.get(position).getPinyi());
//                String previewStr = (position - 1) >= 0 ? getAlpha(list
//                        .get(position - 1).getPinyi()) : " ";
//                if (!previewStr.equals(currentStr)) {
//                    holder.alpha.setVisibility(View.VISIBLE);
//                    holder.alpha.setText(currentStr);
//                } else {
//                    holder.alpha.setVisibility(View.GONE);
//                }
//            }
//        }
//        return convertView;
//    }
//
//    private class ViewHolder {
//        TextView alpha; // 首字母标题
//        TextView name;  // 城市名字
//    }
//
//    // 获得汉语拼音首字母
//    public String getAlpha(String str) {
//        if (str == null) {
//            return "#";
//        }
//        if (str.trim().length() == 0) {
//            return "#";
//        }
//        char c = str.trim().substring(0, 1).charAt(0);
//        // 正则表达式，判断首字母是否是英文字母
//        Pattern pattern = Pattern.compile("^[A-Za-z]+$");
//        if (pattern.matcher(c + "").matches()) {
//            return (c + "").toUpperCase();
//        } else if (str.equals("0")) {
//            return "定位";
//        } else if (str.equals("1")) {
//            return "最近";
//        } else if (str.equals("2")) {
//            return "热门";
//        } else if (str.equals("3")) {
//            return "全部";
//        } else {
//            return "#";
//        }
//    }
//
//    private void initLocation() {
//        LocationClientOption option = new LocationClientOption();
//        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy
//        ); // 可选，默认高精度，设置定位模式，高精度，低功耗，仅设备
//        option.setCoorType("bd09ll");  // 可选，默认gcj02，设置返回的定位结果坐标系
//        int span = 1000;
//        option.setScanSpan(span);      // 可选，默认0，即仅定位一次，设置发起定位请求的间隔需要大于等于1000ms才是有效的
//        option.setIsNeedAddress(true); // 可选，设置是否需要地址信息，默认不需要
//        option.setOpenGps(true);       // 可选，默认false,设置是否使用gps
//        option.setLocationNotify(true);// 可选，默认false，设置是否当GPS有效时按照1S/1次频率输出GPS结果
//        option.setIsNeedLocationDescribe(true); // 可选，默认false，设置是否需要位置语义化结果，可以在BDLocation.getLocationDescribe里得到，结果类似于“在北京天安门附近”
//        option.setIsNeedLocationPoiList(true);  // 可选，默认false，设置是否需要POI结果，可以在BDLocation.getPoiList里得到
//        option.setIgnoreKillProcess(false);     // 可选，默认true，定位SDK内部是一个SERVICE，并放到了独立进程，设置是否在stop的时候杀死这个进程，默认不杀死
//        option.SetIgnoreCacheException(false);  // 可选，默认false，设置是否收集CRASH信息，默认收集
//        option.setEnableSimulateGps(false);     // 可选，默认false，设置是否需要过滤GPS仿真结果，默认需要
//        mLocationClient.setLocOption(option);
//    }
//}
