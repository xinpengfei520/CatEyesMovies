package com.xpf.cateyesmovies.utils;

/**
 * Created by xpf on 2016/11/29 :)
 * Wechat:18091383534
 * Function:应用网络资源请求的地址配置类
 */

public class AppNetConfig {

    // 欢迎页面图片的网络请求地址
    public static final String WELCOMEPICURL = "http://p0.meituan.net/movie/a0dd83495941a47c1cd34d2972e2d0df59585.jpg";

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

    // 找片页面全球获奖电影
    public static final String FINDMOVIEAWARDSURL = "http://api.maoyan.com/mmdb/movie/winning/film/2016-12-02/list.json?utm_campaign=AmovieBmovieCD-1&movieBundleVersion=7601&utm_source=meituan&utm_medium=android&utm_term=7.6.0&utm_content=000000000000000&ci=1&net=13&dModel=Android SDK built for x86_64&uuid=DD912D1B051F987F2712A1A48E82FD578BEA3ADF987122065B356025C2BF818F&refer=/Welcome";

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

    /**
     * 获取选座的信息
     * showId 选择影院的id
     * showDate 选择观看日期
     */
    public static final String SELECTEDSEATDETAIL = "http://m.maoyan.com/show/seats?showId=76304&showDate=2016-12-01";

    //////////////////// 发现 ////////////////////////

    // 发现页ViewPager数据调用接口
    public static final String DESCOVERVIEWPAGER = "http://advert.mobile.meituan.com/api/v3/adverts?cityid=1&category=14&version=6.8.0&new=0&app=movie&clienttp=android&uuid=22C117E01E15F95B04242F2BFCC4575F5F5EA8EDB0193ED973FED7FA7B2829BD&devid=353918059801163&uid=&movieid=&partner=1&apptype=1&smId=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=353918059801163&ci=1&net=255&dModel=Nexus%204&lat=40.100654&lng=116.37805&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463655698510&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=d4f1e217-fd38-4cda-8d82-ef52b331a71a&__skcy=PL%2BjGyr5ANh3wbigOteOnFr7PLU%3D";

    // ViewPager下RadioButton数据调用接口,功能说明：RadioButton中 话题 数据获取接口
    public static final String TOPICURL = "http://m.maoyan.com/groups?_v_=yes&f=android&userid=-1&pushToken=7e6bd5fe73912116ed3ca24d473265cc37ad738879f590efaf0a436f905b945b103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1";

    // RadioButton中 资讯 数据获取接口
    public static final String INFORMATIONURL = "http://m.maoyan.com/groups?_v_=yes&f=android&userid=-1&pushToken=7e6bd5fe73912116ed3ca24d473265cc37ad738879f590efaf0a436f905b945b103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1";

    /**
     * RadioButton中 影库 数据获取接口,影库中有多个数据接口调用，根据各个部分提供借口如下
     */
    // 最上面的图片
    public static final String MOVEDBTOPPIC = "http://api.maoyan.com/mmdb/daily/recommend/latest/list.json?utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=xiaomi&utm_medium=android&utm_term=6.8.0&utm_content";

    // 热门口碑
    public static final String MOVEDBHOTPRAISE = "http://api.meituan.com/mmdb/movieboard/fixedboard/7.json?offset=0&limit=10&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AC98AD8183EC9108E7D92853C8D3EF972&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463727372645&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=26a19547-c4ad-438f-96af-0feadadba2b0&__skcy=S9pqtpXxrUm%2BgC2THRjoEuUzJoY%3D";

    // 最受期待
    public static final String BESTWISHMOVIES = "http://api.meituan.com/mmdb/movieboard/fixedboard/6.json?offset=0&limit=10&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AC98AD8183EC9108E7D92853C8D3EF972&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463727423837&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=bbd36610-f22a-4523-bcfb-59658c25056e&__skcy=Phj0IYaOnVVHPXIHPumsV6vBBrg%3D";

    // 北美票房
    public static final String NORTHAMERICABOXOFFICE = "http://api.meituan.com/mmdb/movieboard/fixedboard/2.json?offset=0&limit=10&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AC98AD8183EC9108E7D92853C8D3EF972&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463712271641&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=0002470d-9e88-412f-a300-2a6e651a7e3e&__skcy=FN%2Ff1xBS0AohUxjhP7FKLe2JNlo%3D";

    // Top100
    public static final String TOPHUNDRED = "http://api.meituan.com/mmdb/movieboard/fixedboard/4.json?offset=0&limit=10&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AC98AD8183EC9108E7D92853C8D3EF972&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463712334518&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=7a1d1ed9-473e-49e9-ad52-b1b7bbd5a5b7&__skcy=nXjScwb2c0H8dO0LxNXZGfODzoI%3D";

    // ****向你推荐:(由于无法获取动态获取内容的数据包，只能选三个写死)亲爱的图片
    public static final String DEARPIC = "http://p1.meituan.net/movie/6582f47a11fcd0b1097f1cd33ad24f6f92678.jpg.webp@230w_320h_1e_1c_1l";

    // 亲爱的内容页面的评论
    public static final String DEARCOMMENTS = "http://api.maoyan.com/mmdb/comments/movie/v2/78910.json?token=&offset=0&limit=15&tag=0&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&";

    // 亲爱的内容页面头部
    public static final String DEARHEAD = "http://api.maoyan.com/mmdb/movie/v5/78910.json?token=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=867450";

    // ***超能陆战队的图片
    public static final String CHAONENGPIC = "http://p0.meituan.net/movie/a714b8a0d9cb0806e89c999b2cd9752e738417.jpg.webp@230w_320h_1e_1c_1l";

    // 超能陆战队的评论
    public static final String CHAONENGCOMMENT = "http://api.maoyan.com/mmdb/comments/movie/v2/79232.json?token=&offset=0&limit=15&tag=0&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&";

    // 超能陆战队内容页面头部
    public static final String CHAONENGHEAD = "http://api.maoyan.com/mmdb/movie/v5/79232.json?token=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=867450";

    // 发现页面顶部四个图片的url
    public static final String FINDFOURPICTURE = "http://api.maoyan.com/sns/v2/buttons.json?utm_campaign=AmovieBmovieCD-1&movieBundleVersion=7501&utm_source=meizu&utm_medium=android&utm_term=7.5.0&utm_content=863026033265878&ci=1&net=255&dModel=MX6&uuid=994B6356168870DBECA2906DD60DA83112D01C68424B04080D0EC60E7BE0D962&lat=40.101338&lng=116.378614&__reqTraceID=2725691099374865664&refer=%2FTopicDetailActivity&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1480920322432&__skua=32bcf146c756ecefe7535b95816908e3&__skno=2d11b39b-c932-44a6-be7e-05df706d9e6d&__skcy=mCYGMThkILKYHx6go6VA11WaDwI%3D";

    /**
     * 敢死队3的图片: http://p0.meituan.net/movie/7659393df8997cd8ee84428062b41276336380.jpg.webp@230w_320h_1e_1c_1l
     超能陆战队的内容页面的评论:http://api.maoyan.com/mmdb/comments/movie/v2/78488.json?token=&offset=0&limit=15&tag=0&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&
     敢死队3内容页面头部: http://api.maoyan.com/mmdb/movie/v5/78488.json?token=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=867450


     全球电影奖项：   http://api.meituan.com/mmdb/movie/region/festival/list.json?__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AC98AD8183EC9108E7D92853C8D3EF972&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463704641616&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=072ad6f1-c10b-4c49-a076-74baae3b231e&__skcy=4UbKeGaCLKKn%2BqhEjZmJ96heHsE%3D

     全部分类：http://api.meituan.com/mmdb/search/movie/tag/list.json?cityId=1&limit=10&offset=0&catId=-1&sourceId=-1&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AC98AD8183EC9108E7D92853C8D3EF972&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463704772662&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=2c644d31-1a40-4904-bcf2-4b48ce6dcb32&__skcy=qH5BOZvKW1uc1fPJXxYTMScl4ls%3D

     •	功能说明：RadioButton中 票房 数据获取接口
     •	服务类型：http
     •	接口地址：http://m.maoyan.com/newGuide/maoyanpiaofang?f=nohdft*/

    /**
     * radioButton下listView数据调用接口
     * 功能说明：radioButton下listView数据调用接口
     * 服务类型：http
     */
    public static final String DESCOVERLISTDATA = "http://api.meituan.com/sns/v2/feed.json?offset=0&limit=10&timestamp=0&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=baidumobile1&utm_medium=android&utm_term=6.8.0&utm_content=863777020121611&ci=1&net=255";


    /**我的商城：
     •	功能说明：上面viewpager  数据获取接口
     •	服务类型：http
     •	接口位置： 最顶上
     •	调用位置：
     接口地址：http://advert.mobile.meituan.com/api/v3/adverts?cityid=1&category=15&version=6.8.0&new=0&app=movie&clienttp=android&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&devid=000000000000000&uid=&movieid=&partner=1&apptype=1&smId=&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463727759502&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=c5c010cf-df8d-4cf3-b201-ff77d589a7d8&__skcy=aGeWnSUqiW22CW4JJ7%2FVZzJVKtI%3D

     •	功能说明：上面gridView 十个按钮  数据获取接口
     •	服务类型：http
     •	接口位置： 最顶上
     •	调用位置：
     接口地址：

     数码：

     http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=all&category=%E6%95%B0%E7%A0%81&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463728005079&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=eae20294-3b53-45f5-999c-183a4b4dfbb9&__skcy=1lxN6MHul9F0PHcMKJwMDPVLT9I%3D

     高玩专区：
     http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=all&category=%E9%AB%98%E7%8E%A9%E4%B8%93%E5%8C%BA&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463728087947&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=0104909f-73f2-4d80-b37b-c41ff3cdca40&__skcy=9CJqOiRx4qDxK5MR9C8XlCekfkA%3D

     玩具：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=all&category=%E7%8E%A9%E5%85%B7&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463728117971&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=9340c88a-b6db-42bc-8f22-7b392cded40c&__skcy=j4AV126GTWQqc%2Bvk0lSEtmuBRwo%3D

     生活：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=all&category=%E7%94%9F%E6%B4%BB&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463733286575&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=b713a8a4-48bd-4d31-be2b-0c98fd87a5cc&__skcy=e%2FNTuoHnH%2FNxbjKKTu5dczCxEMw%3D

     服饰：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=all&category=%E6%9C%8D%E9%A5%B0&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463728561480&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=ab1ca51e-b66f-4b29-b31a-3eea1fec7553&__skcy=GpuqasJkM5Q0Y8l47mbqCK%2Br7i4%3D

     超蝙：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=%E8%B6%85%E8%9D%99&category=all&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463728706833&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=fd889724-9a4a-4943-ba70-94fdd6bbe656&__skcy=7Ye6muAOHkQ2PGHjw%2FvTK44Rczg%3D

     机器猫：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=%E6%9C%BA%E5%99%A8%E7%8C%AB&category=all&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463732086359&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=7299a89e-b4a6-4d86-ad6d-fbff9332091f&__skcy=2bzKri7PTKPff33eC16q29l%2FJwk%3D

     服饰：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=all&category=%E6%9C%8D%E9%A5%B0&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463728561480&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=ab1ca51e-b66f-4b29-b31a-3eea1fec7553&__skcy=GpuqasJkM5Q0Y8l47mbqCK%2Br7i4%3D

     超蝙：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=%E8%B6%85%E8%9D%99&category=all&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463728706833&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=fd889724-9a4a-4943-ba70-94fdd6bbe656&__skcy=7Ye6muAOHkQ2PGHjw%2FvTK44Rczg%3D

     机器猫：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=%E6%9C%BA%E5%99%A8%E7%8C%AB&category=all&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463732086359&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=7299a89e-b4a6-4d86-ad6d-fbff9332091f&__skcy=2bzKri7PTKPff33eC16q29l%2FJwk%3D

     魔兽：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=%E5%B0%8F%E9%BB%84%E4%BA%BA&category=all&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463732224154&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=69c556da-7759-4abc-8f04-048079c5e72a&__skcy=MGKUwMH7rmz2Mqt7x6EO%2FbRCq%2Fw%3D

     美队：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=%E7%BE%8E%E9%98%9F&category=all&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463732268611&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=6d385c6b-9767-49c8-b8fd-5806489aee6a&__skcy=9ZNJ6yqY31PpX9jqO%2FdSvSYj8SU%3D

     星球大战：http://api.meituan.com/mallpro/query.json?movieId=0&offset=0&limit=10&theme=%E6%98%9F%E7%90%83%E5%A4%A7%E6%88%98&category=all&sort=default&query=&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AB4515C9A1D62BD4BDCDAFCB624C971FB&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463732303511&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=3183aae6-b4f2-44f3-9b65-e6341a3b555d&__skcy=MAr2EfIpIvN3Zz21Hy7ri%2FnD3Ss%3D

     •	功能说明：第一个每月特价    数据获取接口
     •	服务类型：http：
     •	接口位置： 每月特价（抓的死数据，名字有可能会不一样但不影响效果）
     •	调用位置：
     接口地址：
     魔术系列：
     http://m.maoyan.com/store/topicDetail/300000056?_v_=yes&f=android&userid=-1&pushToken=8568be797789152f60d193cec511b9d2c01ebd1e6da38efbd62611e87b213090103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1

     人物手办：
     http://m.maoyan.com/store/topicDetail/200000039?_v_=yes&f=android&userid=-1&pushToken=8568be797789152f60d193cec511b9d2c01ebd1e6da38efbd62611e87b213090103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1

     送给我家小王子：

     http://m.maoyan.com/store/topicDetail/200000043?_v_=yes&f=android&userid=-1&pushToken=8568be797789152f60d193cec511b9d2c01ebd1e6da38efbd62611e87b213090103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1

     •
     •	功能说明：第二个每月特价    数据获取接口
     •	服务类型：http：
     •	接口位置： 每月特价（抓的死数据，名字有可能会不一样但不影响效果）
     •	调用位置：
     接口地址：

     英雄决裂站酷炫装备：

     http://i.meituan.com/firework/CivilWarcat?f=android&userid=-1&pushToken=8568be797789152f60d193cec511b9d2c01ebd1e6da38efbd62611e87b213090103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1
     战队T恤：

     http://m.maoyan.com/store/topicDetail/200000039?_v_=yes&f=android&userid=-1&pushToken=8568be797789152f60d193cec511b9d2c01ebd1e6da38efbd62611e87b213090103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1

     最新尖货精选：
     http://m.maoyan.com/store/topicDetail/300000050?_v_=yes&f=android&userid=-1&pushToken=8568be797789152f60d193cec511b9d2c01ebd1e6da38efbd62611e87b213090103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1

     第三个每月特价数据没抓到...

     •	功能说明：下面的girdView商城    数据获取接口
     •	服务类型：http：
     •	接口位置：
     •	调用位置：
     接口地址：
     {"data":{"list":[{"dealid":38292972,"pic":"http://p0.meituan.net/348.348/movie/36aba8e808faa11da5e015add2d0c1b2139888.jpg@60q","price":35,"title":"GetD魔兽电影主题3D眼镜（预售）","value":99},{"dealid":38330793,"pic":"http://p0.meituan.net/348.348/movie/b2d68f14b9ff41b75211af78cb767a5a273569.jpg@60q","price":89,"title":"愤怒的小鸟毛绒玩具 大电影儿童公仔玩具","value":119},{"dealid":38319221,"pic":"http://p0.meituan.net/348.348/movie/e09ae917fa6e238237cab5e7570c933f410487.jpg@60q","price":68,"title":"愤怒的小鸟经典常规款公仔 30cm","value":78},{"dealid":38319215,"pic":"http://p0.meituan.net/348.348/movie/b2d68f14b9ff41b75211af78cb767a5a273569.jpg@60q","price":88,"title":"愤怒的小鸟经典款大号公仔 37CM","value":98},{"dealid":38319224,"pic":"http://p1.meituan.net/348.348/movie/2fea2c8ac8b3c090c699c4421cdd8f32355332.jpg@60q","price":48,"title":"愤怒的小鸟经典款小公仔 22cm","value":60},{"dealid":38319228,"pic":"http://p0.meituan.net/348.348/movie/dfa76dd2a59ca7fdb3738b726bfd439d366839.jpg@60q","price":28,"title":"愤怒的小鸟系列经典款迷你公仔3件包邮！","value":38},{"dealid":38330823,"pic":"http://p1.meituan.net/348.348/movie/55ea6ecf7d045450c80dedbe0da85d4f44402.jpg@60q","price":199,"title":"《魔兽世界》正版模型 洛萨之剑","value":209},{"dealid":38330820,"pic":"http://p0.meituan.net/348.348/movie/1b5b9c6814b1268c047f2da9073eef5050289.jpg@60q","price":199,"title":"《魔兽世界》 杜隆坦之斧升级版","value":209},{"dealid":38330819,"pic":"http://p0.meituan.net/348.348/movie/a174a9391c38afd0320c8c6164706e3130991.jpg@60q","price":39,"title":"《魔兽世界》正版3D眼镜联盟款","value":69},{"dealid":38330818,"pic":"http://p0.meituan.net/348.348/movie/ec71dc9533a98f9a1045eeb252f517af23998.jpg@60q","price":39,"title":"《魔兽世界》正版3D眼镜部落款","value":69}],"total":823}}

     */
}
