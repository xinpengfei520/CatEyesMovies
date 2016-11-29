package com.xpf.cateyesmovies.utils;

/**
 * Created by xpf on 2016/11/29 :)
 * Wechat:18091383534
 * Function:应用网络资源请求的地址配置类
 */

public class AppNetConfig {

    // 欢迎页面图片的网络请求地址
    public static final String PICURL = "http://p0.meituan.net/movie/a0dd83495941a47c1cd34d2972e2d0df59585.jpg";

    // 热映界面ListView的请求地址
    public static final String HOTMOVIEURL = "http://m.maoyan.com/movie/list.json?type=hot&offset=0&limit=1000";

    // 热映-ListView--H5数据(需改Ip)
    public static final String HOTMOVIEH5URL = "http://m.maoyan.com/movie/246188?_v_=yes";

    // 热映界面-ViewPager
    public static final String HOTMOVIEVIEWPAGERURL = "http://advert.mobile.meituan.com/api/v3/adverts?cityid=1&category=11&version=6.8.0&new=0&app=movie&clienttp=android&uuid=FCFAB9D8DD339645D629C8372A29A2C6AD16F9C9E87AF9AC0D656B29DD5AC6DE&devid=866641027400542&uid=&movieid=&partner=1&apptype=1&smId=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=qq&utm_medium=android&utm_term=6.8.0&utm_content=866641027400542&ci=1&net=255&dModel=HM%20NOTE%201LTETD&lat=40.100855&lng=116.378273&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463730432992&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=01f9c5c0-eb56-4e19-92fb-b86b16ad79da&__skcy=5K8wRR%2FKYAZDTgmAzbhrXi%2FomzU%3D";

    // 搜索-热门搜索
    public static final String HOTSEARCHURL = "http://api.meituan.com/mmdb/search/movie/hotword/list.json?token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=860311023305964&ci=1&net=255&dModel=MI%203&uuid=F096369352E4004DD3758BF83FE24AC312445F9B51AD3D8FCE2A0CD57754F6E4&lat=40.099064&lng=116.379351&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463657899016&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=23e3e90e-007e-4607-a43f-b3d609838bb8&__skcy=2MBnuWHEtyH9WJldBe5hskKYlgM%3D";

    // 搜索-喜剧
    public static final String COMEDYSEARCHURL = "http://api.meituan.com/mmdb/search/integrated/keyword/list.json?almtype=1&keyword=%E7%9A%84&stype=-1&refer=1&iscorrected=false&limit=10&offset=0&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=qihu360-dy&utm_medium=android&utm_term=6.8.0&utm_content=351670061374943&ci=1&net=255&dModel=GT-I9507V&uuid=2712263ED4FA063021DC526C3CD1B2761F241E61575350470EA2532AD93026A0&lat=40.09955&lng=116.379719&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1464023832122&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=1499602e-5b7a-4f74-b147-46b7a37e5a10&__skcy=SeQjBqKkNc9kO64%2FTFMql%2BkGkWw%3D";

    // 待映
    public static final String DELAYMOVIEURL = "http://api.meituan.com/mmdb/movie/v2/list/rt/order/coming.json?ci=1&limit=12&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=xiaomi&utm_medium=android&utm_term=6.8.0&utm_content=868030022327462&net=255&dModel=MI%205&uuid=0894DE03C76F6045D55977B6D4E32B7F3C6AAB02F9CEA042987B380EC5687C43&lat=40.100673&lng=116.378619&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463704714271&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=1a0b4a9b-44ec-42fc-b110-ead68bcc2824&__skcy=sXcDKbGi20CGXQPPZvhCU3%2FkzdE%3D";

    // 海外-国家
    public static final String OVERSEASMOVIEURL = "http://api.meituan.com/mmdb/movie/oversea/areas.json?token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=xiaomi&utm_medium=android&utm_term=6.8.0&utm_content=868030022327462&ci=1&net=255&dModel=MI%205&uuid=0894DE03C76F6045D55977B6D4E32B7F3C6AAB02F9CEA042987B380EC5687C43&lat=40.100673&lng=116.378619&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463704930917&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=e3df01ab-d811-4ff8-868d-9b4a665ee352&__skcy=FZG8h%2Fw31ebpODD3EnjMbBAPTiE%3D";

    // 海外-美国
    public static final String AMERICAMOVIEURL = "http://api.meituan.com/mmdb/movie/oversea/coming.json?area=NA&offset=0&limit=10&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=860311023305964&ci=1&net=255&dModel=MI%203&uuid=F096369352E4004DD3758BF83FE24AC312445F9B51AD3D8FCE2A0CD57754F6E4&lat=40.099337&lng=116.379463&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463979002816&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=ff7d7258-bf35-49b1-8350-438616853e0b&__skcy=oNlmWR0dK8QqRyoPuJ9SQPBnvk0%3D";

    // 海外-韩国
    public static final String KOREAMOVIEURL = "http://api.meituan.com/mmdb/movie/oversea/hot.json?area=KR&offset=0&limit=10&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=860311023305964&ci=1&net=255&dModel=MI%203&uuid=F096369352E4004DD3758BF83FE24AC312445F9B51AD3D8FCE2A0CD57754F6E4&lat=40.099337&lng=116.379463&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463979233089&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=5245fc26-6931-4d8e-8202-4fa32944ea28&__skcy=IQYM%2F257Pcv7b%2FfH8U60gxAsVWg%3Dhttp://api.meituan.com/mmdb/movie/oversea/hot.json?area=KR&offset=0&limit=10&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=860311023305964&ci=1&net=255&dModel=MI%203&uuid=F096369352E4004DD3758BF83FE24AC312445F9B51AD3D8FCE2A0CD57754F6E4&lat=40.099337&lng=116.379463&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463979233089&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=5245fc26-6931-4d8e-8202-4fa32944ea28&__skcy=IQYM%2F257Pcv7b%2FfH8U60gxAsVWg%3D";

    // 海外-日本
    public static final String JAPANMOVIEURL = "http://api.meituan.com/mmdb/movie/oversea/hot.json?area=JP&offset=10&limit=10&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=860311023305964&ci=1&net=255&dModel=MI%203&uuid=F096369352E4004DD3758BF83FE24AC312445F9B51AD3D8FCE2A0CD57754F6E4&lat=40.099337&lng=116.379463&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463979347735&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=81a99289-f2ad-4e77-b39c-c899764cbf0a&__skcy=ekzQcZxVLz93KYT7pqaKbPIu%2FGo%3D";

    //////////////////////// 影院 //////////////////////////////

    // 功能说明：猫眼的服务器会根据你的ip段加载出你本地的影院
    public static final String MOVIETHEATREURL = "http://m.maoyan.com/cinemas.json";

    /**
     * 功能说明：查询出影院详情 ，通过设置 cinemaid可以获取当前影院详情信息，通过设置 movieid   可以获取当前影院的指定电影的详情信息
     * 服务类型：http
     * 接口位置：
     * 调用位置：
     * 接口地址：
     * cinemaid:影院id
     * movieid:电影id
     */
    public static final String MOVIETHEATREDETAIL = "http://m.maoyan.com/showtime/wrap.json？cinemaid=11533&movieid=request";


}
