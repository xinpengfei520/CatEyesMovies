package com.xpf.cateyesmovies.domain;

import java.util.List;

/**
 * Created by xpf on 2016/12/3 :)
 * Wechat:18091383534
 * Function:
 */

public class MovieTheatreBean {

    /**
     * expires : 43200
     */

    private ControlBean control;
    /**
     * control : {"expires":43200}
     * status : 0
     * data : {"ChaoyangArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"17.5影城","dis":"望京","area":"ChaoyangArea","nm":"17.5影城(比如世界店)","poiId":75603,"sellmin":0,"sell":true,"preferential":0,"sellPrice":30,"lat":39.9684,"lng":116.46204,"ct":"","addr":"ChaoyangArea京顺路111号比如世界购物中心1层（近太阳宫北街）","brdId":23854,"dealPrice":0,"referencePrice":70,"showCount":0,"id":48},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"17.5影城","dis":"管庄","area":"ChaoyangArea","nm":"17.5影城(管庄店)","poiId":1677952,"sellmin":0,"sell":true,"preferential":0,"sellPrice":30,"lat":39.912422,"lng":116.596085,"ct":"","addr":"ChaoyangArea朝阳路京通苑30号楼L307PLus365购物中心三层","brdId":23854,"dealPrice":0,"referencePrice":60,"showCount":0,"id":2243},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"CGV影城","dis":"亚运村","area":"ChaoyangArea","nm":"CGV星星影城(奥体店)","poiId":360511,"sellmin":0,"sell":true,"preferential":0,"sellPrice":57,"lat":39.999462,"lng":116.39392,"ct":"","addr":"ChaoyangArea湖景东路11号新奥购物中心B1-B2楼","brdId":2020418,"dealPrice":0,"referencePrice":40,"showCount":0,"id":65},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"CGV影城","dis":"酒仙桥","area":"ChaoyangArea","nm":"CGV星星影城(颐堤港店)","poiId":1466992,"sellmin":0,"sell":true,"preferential":0,"sellPrice":57,"lat":39.96964,"lng":116.4909,"ct":"","addr":"ChaoyangArea酒仙桥路18号颐堤港4层","brdId":2020418,"dealPrice":0,"referencePrice":40,"showCount":0,"id":8},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"K酷国际影城","dis":"亚运村","area":"ChaoyangArea","nm":"K酷国际影城","poiId":796845,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":40.033382,"lng":116.41916,"ct":"","addr":"ChaoyangArea北苑路42号卜峰莲花超市4楼（K酷时尚广场）","brdId":24003,"dealPrice":0,"referencePrice":80,"showCount":0,"id":21},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"UME国际影城","dis":"双井","area":"ChaoyangArea","nm":"UME国际影城(双井店)","poiId":291070,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39.5,"lat":39.89768,"lng":116.45983,"ct":"","addr":"ChaoyangArea东三环中路65号富力广场6楼（双井桥北）","brdId":24071,"dealPrice":0,"referencePrice":70,"showCount":0,"id":135},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"ChaoyangArea","nm":"奥兰环球影城","poiId":106343887,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":40.021084,"lng":116.46593,"ct":"","addr":"ChaoyangArea来广营西路5号院诚盈中心商业街","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16421},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"ChaoyangArea","nm":"艾米·1895电影街","poiId":42853106,"sellmin":0,"sell":true,"preferential":0,"sellPrice":41,"lat":39.93605,"lng":116.44939,"ct":"","addr":"ChaoyangArea工体北路13号世茂工三3楼，艾米·1895电影街（三里屯商圈）","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13640},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"ChaoyangArea","nm":"北京东融国际影城(西直河店)","poiId":91811925,"sellmin":0,"sell":true,"preferential":0,"sellPrice":22.9,"lat":39.844444,"lng":116.52732,"ct":"","addr":"ChaoyangArea西直河商业广场华联购物广场1楼","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15415},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"北京剧院","dis":"亚运村","area":"ChaoyangArea","nm":"北京剧院","poiId":82597,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.990856,"lng":116.40813,"ct":"","addr":"ChaoyangArea安慧里三区10号","brdId":254168,"dealPrice":0,"referencePrice":80,"showCount":0,"id":248},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"保利国际影城","dis":"北苑","area":"ChaoyangArea","nm":"保利国际影城(北苑华贸店)","poiId":361205,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":40.047962,"lng":116.43101,"ct":"","addr":"ChaoyangArea清河营南街7号院华贸天地B1楼","brdId":24472,"dealPrice":0,"referencePrice":25,"showCount":0,"id":2603},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"保利国际影城","dis":"","area":"ChaoyangArea","nm":"保利国际影城(东坝店)","poiId":73452594,"sellmin":0,"sell":true,"preferential":0,"sellPrice":29,"lat":39.951107,"lng":116.54848,"ct":"","addr":"ChaoyangArea东坝中路38号金隅嘉品MALL5层","brdId":24472,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14430},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"保利国际影城","dis":"望京","area":"ChaoyangArea","nm":"保利国际影城(望京店)","poiId":1107541,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.998497,"lng":116.481926,"ct":"","addr":"ChaoyangArea望京阜通西大街新荟城购物中心五层","brdId":24472,"dealPrice":0,"referencePrice":70,"showCount":0,"id":39},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"保利国际影城","dis":"亚运村","area":"ChaoyangArea","nm":"保利国际影城(中国科技馆店)","poiId":61574,"sellmin":0,"sell":true,"preferential":0,"sellPrice":29,"lat":40.005745,"lng":116.39992,"ct":"","addr":"ChaoyangArea北辰东路5号（鸟巢正北一公里）","brdId":24472,"dealPrice":0,"referencePrice":80,"showCount":0,"id":40},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"百老汇影城","dis":"国贸","area":"ChaoyangArea","nm":"百丽宫影城(国贸店)","poiId":3281398,"sellmin":0,"sell":true,"preferential":0,"sellPrice":48,"lat":39.91279,"lng":116.45982,"ct":"","addr":"ChaoyangArea建国门外大街1号国贸商城区域三地下一层3B120","brdId":24377,"dealPrice":0,"referencePrice":90,"showCount":0,"id":23},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"博纳国际影城","dis":"朝外大街","area":"ChaoyangArea","nm":"博纳国际影城(悠唐店)","poiId":63,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":39.921932,"lng":116.4385,"ct":"","addr":"ChaoyangArea三丰北里2号楼悠唐生活广场B1楼（近钱柜）","brdId":24595,"dealPrice":0,"referencePrice":35,"showCount":0,"id":116},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"传奇时代影城","dis":"亮马桥","area":"ChaoyangArea","nm":"传奇时代影城(蓝色港湾店)","poiId":297916,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39.5,"lat":39.948925,"lng":116.47621,"ct":"","addr":"ChaoyangArea朝阳公园路6号蓝色港湾国际商区SA-42（朝阳公园西北角）","brdId":24804,"dealPrice":0,"referencePrice":40,"showCount":0,"id":132},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"橙天嘉禾影城","dis":"三元桥","area":"ChaoyangArea","nm":"橙天嘉禾影城(凤凰城店)","poiId":1465641,"sellmin":0,"sell":true,"preferential":0,"sellPrice":59.5,"lat":39.963345,"lng":116.457664,"ct":"","addr":"ChaoyangArea曙光西里甲5号院24号楼凤凰汇三层","brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"id":2081},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"朝阳剧场","dis":"亮马桥","area":"ChaoyangArea","nm":"朝阳剧场","poiId":82595,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.922314,"lng":116.462105,"ct":"","addr":"ChaoyangArea东三环北路36号呼家楼北（近朝阳北路）","brdId":635050,"dealPrice":36,"referencePrice":60,"showCount":0,"id":249},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大地影院","dis":"","area":"ChaoyangArea","nm":"大地数字影院(望京新天地店)","poiId":4036242,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.99817,"lng":116.47787,"ct":"","addr":"ChaoyangArea望京阜安西街11号楼合生麒麟新天地2层","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7881},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"东都影城","dis":"大望路","area":"ChaoyangArea","nm":"东都影城","poiId":30903,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":39.885048,"lng":116.48847,"ct":"","addr":"ChaoyangArea东四环中路195号华腾新天地五层","brdId":133085,"dealPrice":0,"referencePrice":43,"showCount":0,"id":262},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大地影院","dis":"","area":"ChaoyangArea","nm":"大地影院(垡头永辉店)","poiId":41877507,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.856857,"lng":116.50524,"ct":"","addr":"ChaoyangArea南杨庄路与武基街交叉口西南方向50米路南（垡头永辉超市，翠城馨园401号楼地下一层）","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10954},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大地影院","dis":"","area":"ChaoyangArea","nm":"大地影院(十里河铭泽影院 )","poiId":40086376,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.864407,"lng":116.47688,"ct":"","addr":"ChaoyangArea西大望南路与弘燕南一路交叉口铭泽生活广场5层","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10951},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"亚运村","area":"ChaoyangArea","nm":"海航文化天宝国际影城","poiId":1098864,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.98034,"lng":116.38147,"ct":"","addr":"ChaoyangArea祁家豁子8号健翔大厦家乐福超市B1层","brdId":0,"dealPrice":39.6,"referencePrice":80,"showCount":0,"id":31},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"太平洋电影城","dis":"","area":"ChaoyangArea","nm":"红星太平洋电影城(爱琴海购物中心店)","poiId":5948789,"sellmin":0,"sell":true,"preferential":0,"sellPrice":53,"lat":39.97224,"lng":116.436386,"ct":"","addr":"ChaoyangArea七圣中街12号院爱琴海购物中心6层","brdId":28975,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7619},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"ChaoyangArea","nm":"华谊兄弟电影汇","poiId":112208438,"sellmin":0,"sell":true,"preferential":0,"sellPrice":198,"lat":39.948593,"lng":116.45831,"ct":"","addr":"ChaoyangArea新源南路甲2号华谊兄弟办公楼首层","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16467},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"嘉华国际影城","dis":"","area":"ChaoyangArea","nm":"嘉华国际影城(活力东方店)","poiId":2578227,"sellmin":0,"sell":true,"preferential":0,"sellPrice":29,"lat":39.940395,"lng":116.52246,"ct":"","addr":"ChaoyangArea姚家园路甲1号活力东方奥特莱斯购物中心4楼","brdId":26413,"dealPrice":30,"referencePrice":70,"showCount":0,"id":5987},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"金鸡百花影城","dis":"左家庄","area":"ChaoyangArea","nm":"金鸡百花影城","poiId":89000,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.96894,"lng":116.42397,"ct":"","addr":"ChaoyangArea北三环东路22号","brdId":1082447,"dealPrice":0,"referencePrice":30,"showCount":0,"id":256},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"劲松电影院","dis":"劲松","area":"ChaoyangArea","nm":"劲松电影院","poiId":82588,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.88321,"lng":116.45597,"ct":"","addr":"ChaoyangArea劲松中街404号","brdId":252281,"dealPrice":0,"referencePrice":30,"showCount":0,"id":236},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"金逸影城","dis":"十里堡","area":"ChaoyangArea","nm":"金逸影城(朝阳大悦城IMAX店)","poiId":1548100,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":39.924355,"lng":116.51871,"ct":"","addr":"ChaoyangArea朝阳北路101号朝阳大悦城商场8层","brdId":1079568,"dealPrice":0,"referencePrice":80,"showCount":0,"id":88},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"金逸影城","dis":"管庄","area":"ChaoyangArea","nm":"金逸影城(双桥店)","poiId":1439570,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":39.90879,"lng":116.57644,"ct":"","addr":"ChaoyangArea双桥路3号东星时尚广场5层","brdId":1079568,"dealPrice":0,"referencePrice":0,"showCount":0,"id":1692},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"卢米埃影城","dis":"","area":"ChaoyangArea","nm":"卢米埃影城(芳草地店)","poiId":332108,"sellmin":0,"sell":true,"preferential":0,"sellPrice":58.5,"lat":39.91955,"lng":116.44965,"ct":"","addr":"ChaoyangArea东大桥路9号侨福芳草地购物中心LG2-26（尚都SOHO对面）","brdId":292030,"dealPrice":0,"referencePrice":50,"showCount":0,"id":5736},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"卢米埃影城","dis":"","area":"ChaoyangArea","nm":"卢米埃影城(长楹天街IMAX店)","poiId":52539636,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38.5,"lat":39.92509,"lng":116.60262,"ct":"","addr":"ChaoyangArea朝阳北路长楹天街购物中心东区5F-09","brdId":292030,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13204},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"鲁信影城","dis":"北苑家园","area":"ChaoyangArea","nm":"鲁信影城(立水桥店)","poiId":1541423,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":40.04711,"lng":116.4083,"ct":"","addr":"ChaoyangArea立清路明天第一城7号院，蓝黛时空汇内","brdId":27424,"dealPrice":25,"referencePrice":70,"showCount":0,"id":1732},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"美嘉欢乐影城","dis":"三里屯","area":"ChaoyangArea","nm":"美嘉欢乐影城(三里屯店)","poiId":30915,"sellmin":0,"sell":true,"preferential":0,"sellPrice":69,"lat":39.93429,"lng":116.454384,"ct":"","addr":"ChaoyangArea三里屯太古里地下一层（三里屯酒吧街南口西侧）","brdId":27617,"dealPrice":0,"referencePrice":80,"showCount":0,"id":136},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"ChaoyangArea","nm":"米瑞酷电影院","poiId":108119917,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.919456,"lng":116.44396,"ct":"","addr":"ChaoyangArea神路街39号10幢","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16179},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"万达影城","dis":"大望路","area":"ChaoyangArea","nm":"万达国际影城(CBD店)","poiId":30863,"sellmin":0,"sell":true,"preferential":0,"sellPrice":48,"lat":39.909027,"lng":116.4709,"ct":"","addr":"ChaoyangArea建国路93号万达广场B座3层","brdId":102642,"dealPrice":0,"referencePrice":80,"showCount":0,"id":264},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"沃美影城","dis":"","area":"ChaoyangArea","nm":"沃美影城(常营店)","poiId":5529977,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":39.926247,"lng":116.59568,"ct":"","addr":"ChaoyangArea朝阳北路17号（地铁6号线常营站B出口）北京华联购物中心四层","brdId":29462,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8065},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"","area":"ChaoyangArea","nm":"星环影城(立水桥店)","poiId":3260787,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":40.05452,"lng":116.41205,"ct":"","addr":"ChaoyangArea立汤路201号东亚奥北南区北门一楼（华泰汽车斜对面，立水桥地铁A口北行150米）","brdId":0,"dealPrice":34.5,"referencePrice":60,"showCount":0,"id":9914},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"星美国际影城","dis":"朝外大街","area":"ChaoyangArea","nm":"星美国际影城(世界城店)","poiId":316112,"sellmin":0,"sell":true,"preferential":0,"sellPrice":49,"lat":39.917755,"lng":116.45232,"ct":"","addr":"ChaoyangArea金汇路8号世界城E座B1楼（世贸天阶商业街北侧）","brdId":30032,"dealPrice":0,"referencePrice":35,"showCount":0,"id":98},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"星美国际影城","dis":"望京","area":"ChaoyangArea","nm":"星美国际影城(望京店)","poiId":1558123,"sellmin":0,"sell":true,"preferential":0,"sellPrice":36,"lat":39.990322,"lng":116.48359,"ct":"","addr":"ChaoyangArea望京街9号望京国际商业中心A座4楼","brdId":30032,"dealPrice":0,"referencePrice":40,"showCount":0,"id":175},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"华谊兄弟影院","dis":"望京","area":"ChaoyangArea","nm":"新影联·华谊兄弟影院(望京店)","poiId":82583,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":40.01051,"lng":116.46821,"ct":"","addr":"ChaoyangArea广顺北大街16号望京华彩商业中心B1a","brdId":275830,"dealPrice":35,"referencePrice":80,"showCount":0,"id":72},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"阳光影城","dis":"亚运村","area":"ChaoyangArea","nm":"阳光影城(安立路店)","poiId":90846,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.997986,"lng":116.409164,"ct":"","addr":"ChaoyangArea安立路68号飘亮广场B1层","brdId":30206,"dealPrice":28,"referencePrice":70,"showCount":0,"id":174},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","area":"ChaoyangArea","nm":"耀莱成龙国际影城(慈云寺店)","poiId":4230363,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.916008,"lng":116.49176,"ct":"","addr":"ChaoyangArea慈云寺北里209号未来汇二层（未来汇广场）","brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"id":9730},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"安贞","area":"ChaoyangArea","nm":"中国木偶艺术剧院","poiId":82596,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.96802,"lng":116.40147,"ct":"","addr":"ChaoyangArea安华西里甲1号","brdId":0,"dealPrice":31,"referencePrice":0,"showCount":0,"id":252},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"紫光影城","dis":"朝外大街","area":"ChaoyangArea","nm":"紫光影城(蓝岛店)","poiId":3274641,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.922623,"lng":116.44817,"ct":"","addr":"ChaoyangArea朝外大街8号（蓝岛大厦西区5-6层）","brdId":31014,"dealPrice":21,"referencePrice":35,"showCount":0,"id":259},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"枫花园汽车影院","dis":"亮马桥","area":"ChaoyangArea","nm":"枫花园汽车影院","poiId":271415,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.95855,"lng":116.48107,"ct":"","addr":"ChaoyangArea亮马桥路21号（朝阳公园北门对面）","brdId":651783,"dealPrice":61,"referencePrice":100,"showCount":0,"id":254},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"垡头西里","area":"ChaoyangArea","nm":"曙光影院","poiId":3305306,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.861492,"lng":116.51347,"ct":"","addr":"ChaoyangArea垡头西里44号垡头文化中心B1","brdId":0,"dealPrice":31,"referencePrice":0,"showCount":0,"id":4548},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"草场地","area":"ChaoyangArea","nm":"中国电影博物馆","poiId":1436410,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.9962,"lng":116.521,"ct":"","addr":"ChaoyangArea南影路9号","brdId":0,"dealPrice":0,"referencePrice":40,"showCount":0,"id":181}],"HaidianArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"17.5影城","dis":"北太平庄","area":"HaidianArea","nm":"17.5影城(今典花园店)","poiId":273950,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":39.95334,"lng":116.36104,"ct":"","addr":"HaidianArea文慧园路9号今典花园9号楼空间蒙太奇大厦1层","brdId":23854,"dealPrice":0,"referencePrice":60,"showCount":0,"id":154},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"17.5影城","dis":"五棵松","area":"HaidianArea","nm":"17.5影城(今日家园店)","poiId":3260713,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":39.900616,"lng":116.28245,"ct":"","addr":"HaidianArea西翠路5号今日家园8号楼苏宁电器地下一层（太平路沃尔玛超市旁）","brdId":23854,"dealPrice":0,"referencePrice":70,"showCount":0,"id":102},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"17.5影城","dis":"北下关","area":"HaidianArea","nm":"17.5影城(四道口店)","poiId":48958,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":39.959427,"lng":116.34575,"ct":"","addr":"HaidianArea大钟寺四道口2号京果商厦B座三层北侧","brdId":23854,"dealPrice":0,"referencePrice":45,"showCount":0,"id":25},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"CGV影城","dis":"","area":"HaidianArea","nm":"CGV星聚汇影城(清河店)","poiId":2374984,"sellmin":0,"sell":true,"preferential":0,"sellPrice":57,"lat":40.030476,"lng":116.334724,"ct":"","addr":"HaidianArea清河中街68号华润五彩城购物中心东区7层","brdId":2020418,"dealPrice":0,"referencePrice":40,"showCount":0,"id":5111},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"UME国际影城","dis":"中关村","area":"HaidianArea","nm":"UME国际影城(华星店)","poiId":1436373,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39.5,"lat":39.967793,"lng":116.326096,"ct":"","addr":"HaidianArea双榆树科学院南路44号（双安商场对面）","brdId":24071,"dealPrice":0,"referencePrice":70,"showCount":0,"id":155},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"博纳国际影城","dis":"万寿路","area":"HaidianArea","nm":"博纳国际影城(万寿路店)","poiId":1460949,"sellmin":0,"sell":true,"preferential":0,"sellPrice":34,"lat":39.908405,"lng":116.29659,"ct":"","addr":"HaidianArea复兴路51号凯德晶品购物中心4层","brdId":24595,"dealPrice":0,"referencePrice":80,"showCount":0,"id":1624},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"橙天嘉禾影城","dis":"","area":"HaidianArea","nm":"橙天嘉禾影城(吉彩店)","poiId":2393106,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39.5,"lat":39.922768,"lng":116.25956,"ct":"","addr":"HaidianArea玉海园五里22号配套商业楼（原吉彩体育馆）","brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"id":5313},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"橙天嘉禾影城","dis":"上地","area":"HaidianArea","nm":"橙天嘉禾影城(上地店)","poiId":14447,"sellmin":0,"sell":true,"preferential":0,"sellPrice":59.5,"lat":40.02865,"lng":116.31154,"ct":"","addr":"HaidianArea上地南口华联商厦4F","brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"id":130},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"橙天嘉禾影城","dis":"苏州桥","area":"HaidianArea","nm":"橙天嘉禾影城(万柳店)","poiId":3303603,"sellmin":0,"sell":true,"preferential":0,"sellPrice":54.5,"lat":39.97296,"lng":116.29486,"ct":"","addr":"HaidianArea巴沟路2号华联万柳购物中心5层","brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"id":86},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大地影院","dis":"","area":"HaidianArea","nm":"大地影院(西三旗物美店)","poiId":4845675,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":40.04733,"lng":116.33703,"ct":"","addr":"HaidianArea悦秀路99号二层","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7433},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"北太平庄","area":"HaidianArea","nm":"国安剧院","poiId":294883,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.981472,"lng":116.37021,"ct":"","addr":"HaidianArea花园东路甲16号","brdId":0,"dealPrice":0,"referencePrice":80,"showCount":0,"id":251},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"魏公村","area":"HaidianArea","nm":"国图影院","poiId":271442,"sellmin":0,"sell":true,"preferential":0,"sellPrice":28,"lat":39.94304,"lng":116.32312,"ct":"","addr":"HaidianArea中关村南大街33号国家图书馆内","brdId":0,"dealPrice":26,"referencePrice":60,"showCount":0,"id":238},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"苏州桥","area":"HaidianArea","nm":"海淀工人文化宫","poiId":38025,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.971443,"lng":116.295105,"ct":"","addr":"HaidianArea万柳华府北街2号（万柳华联商城南门对面）","brdId":0,"dealPrice":28,"referencePrice":30,"showCount":0,"id":141},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"中关村","area":"HaidianArea","nm":"海淀剧院","poiId":17899,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.97669,"lng":116.31822,"ct":"","addr":"HaidianArea中关村大街28号","brdId":0,"dealPrice":31,"referencePrice":80,"showCount":0,"id":257},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"嘉华国际影城","dis":"五道口","area":"HaidianArea","nm":"嘉华国际影城(学清路店)","poiId":84440,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":40.008587,"lng":116.35387,"ct":"","addr":"HaidianArea学清路甲8号圣熙8号购物中心5层西侧（学清路）","brdId":26413,"dealPrice":0,"referencePrice":70,"showCount":0,"id":70},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"金逸影城","dis":"清河","area":"HaidianArea","nm":"金逸影城(新都店)","poiId":1549060,"sellmin":0,"sell":true,"preferential":0,"sellPrice":24,"lat":40.060005,"lng":116.36541,"ct":"","addr":"HaidianArea西三旗建材城中路6号新都购物广场1层","brdId":1079568,"dealPrice":0,"referencePrice":60,"showCount":0,"id":58},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"金逸影城","dis":"中关村","area":"HaidianArea","nm":"金逸影城(中关村店)","poiId":276722,"sellmin":0,"sell":true,"preferential":0,"sellPrice":64,"lat":39.978382,"lng":116.31445,"ct":"","addr":"HaidianArea中关村大街19号新中关购物中心B1层","brdId":1079568,"dealPrice":0,"referencePrice":80,"showCount":0,"id":152},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"美嘉欢乐影城","dis":"三里屯","area":"HaidianArea","nm":"美嘉欢乐影城(中关村店)","poiId":279439,"sellmin":0,"sell":true,"preferential":0,"sellPrice":64,"lat":39.983105,"lng":116.31355,"ct":"","addr":"HaidianArea中关村大街15号中关村广场购物中心津乐汇3楼（地铁中关村站D口出西侧）","brdId":27617,"dealPrice":43.9,"referencePrice":80,"showCount":0,"id":197},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"世茂国际影城","dis":"","area":"HaidianArea","nm":"世茂国际影城(羊坊店路店)","poiId":3251410,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.900352,"lng":116.322586,"ct":"","addr":"HaidianArea羊坊店路18号光耀东方4层","brdId":28741,"dealPrice":0,"referencePrice":0,"showCount":0,"id":6483},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"HaidianArea","nm":"天幕新彩云国际影城","poiId":4480546,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.969345,"lng":116.3678,"ct":"","addr":"HaidianArea北三环中路中视云投大厦","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13003},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"五道口","area":"HaidianArea","nm":"五道口工人俱乐部电影院","poiId":82591,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.99351,"lng":116.33939,"ct":"","addr":"HaidianArea成府路23号（近五道口城铁站）","brdId":0,"dealPrice":31,"referencePrice":35,"showCount":0,"id":258},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"HaidianArea","nm":"万画影城","poiId":41066531,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.94469,"lng":116.27137,"ct":"","addr":"HaidianArea西四环北路金四季购物中心中段三层B003","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13054},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"新华国际影城","dis":"","area":"HaidianArea","nm":"新华国际影城(宝盛店)","poiId":2408760,"sellmin":0,"sell":true,"preferential":0,"sellPrice":35,"lat":40.037056,"lng":116.370605,"ct":"","addr":"HaidianArea宝盛北里西区28号兴美生活广场5层","brdId":29894,"dealPrice":0,"referencePrice":70,"showCount":0,"id":5359},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"新华国际影城","dis":"大钟寺","area":"HaidianArea","nm":"新华国际影城(大钟寺店)","poiId":1524564,"sellmin":0,"sell":true,"preferential":0,"sellPrice":28,"lat":39.96573,"lng":116.34114,"ct":"","addr":"HaidianArea北三环18号院大钟寺中坤广场C座3层（地铁13号线大钟寺站出站即到）","brdId":29894,"dealPrice":0,"referencePrice":80,"showCount":0,"id":1589},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"星美国际影城","dis":"远大路","area":"HaidianArea","nm":"星美国际影城(金源店)","poiId":271447,"sellmin":0,"sell":true,"preferential":0,"sellPrice":52,"lat":39.95867,"lng":116.2889,"ct":"","addr":"HaidianArea远大路1号金源时代购物中心5楼东首（近蓝靛厂北路）","brdId":30032,"dealPrice":0,"referencePrice":35,"showCount":0,"id":271},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"五棵松","area":"HaidianArea","nm":"耀莱成龙国际影城(五棵松店)","poiId":335220,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.913418,"lng":116.2794,"ct":"","addr":"HaidianArea复兴路69号卓展购物中心5层（五棵松体育馆北门正对面）","brdId":30227,"dealPrice":0,"referencePrice":70,"showCount":0,"id":87},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","area":"HaidianArea","nm":"耀莱成龙国际影城(温泉镇店)","poiId":116256540,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":40.042526,"lng":116.18892,"ct":"","addr":"HaidianArea温泉镇北部文化中心D座","brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16285},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"HaidianArea","nm":"中间影院","poiId":4572438,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":39.954147,"lng":116.23201,"ct":"","addr":"HaidianArea杏石口路中间艺术园区内","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":9459},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"中影国际影城","dis":"","area":"HaidianArea","nm":"中影电影院(小西天店)","poiId":82594,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":39.95296,"lng":116.37117,"ct":"","addr":"HaidianArea新街口外大街25号（小西天牌楼北侧）","brdId":23745,"dealPrice":0,"referencePrice":0,"showCount":0,"id":9916},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"华影国际影城","dis":"","area":"HaidianArea","nm":"华影国际影城(花园路店)","poiId":4744457,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.972046,"lng":116.36422,"ct":"","addr":"HaidianArea花园路甲13号庚坊国际发展中心B1层","brdId":271399,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7985},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"新街口","area":"HaidianArea","nm":"中国电影资料馆","poiId":1541424,"sellmin":0,"sell":false,"preferential":0,"sellPrice":33,"lat":39.953133,"lng":116.36986,"ct":"","addr":"HaidianArea文慧园路3号","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":2010}],"DaxingArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"CGV影城","dis":"","area":"DaxingArea","nm":"CGV星聚汇影城(亦庄店)","poiId":105355906,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.790707,"lng":116.51294,"ct":"","addr":"DaxingArea经济技术开发区荣京东街大族广场9号楼三层","brdId":2020418,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16152},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"SFC上影影城","dis":"","area":"DaxingArea","nm":"SFC上影影城(大兴龙湖店)","poiId":96251713,"sellmin":0,"sell":true,"preferential":0,"sellPrice":34,"lat":39.687492,"lng":116.3205,"ct":"","addr":"DaxingArea永兴路7号院1号楼3F-Z2","brdId":2880988,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15915},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"保利国际影城","dis":"绿地缤纷城","area":"DaxingArea","nm":"保利国际影城(绿地缤纷城店)","poiId":1481117,"sellmin":0,"sell":true,"preferential":0,"sellPrice":34,"lat":39.764687,"lng":116.33482,"ct":"","addr":"DaxingArea金星西路3号绿地缤纷城购物中心4层","brdId":24472,"dealPrice":0,"referencePrice":70,"showCount":0,"id":2392},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大料国际影城","dis":"亦庄","area":"DaxingArea","nm":"大料国际影城(创意生活广场店)","poiId":82601,"sellmin":0,"sell":true,"preferential":0,"sellPrice":28,"lat":39.810535,"lng":116.50513,"ct":"","addr":"DaxingArea亦庄经济开发区文化园东路6号创意生活广场三层","brdId":24930,"dealPrice":0,"referencePrice":80,"showCount":0,"id":34},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大兴剧院","dis":"黄村","area":"DaxingArea","nm":"大兴影剧院","poiId":324698,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.7323,"lng":116.338005,"ct":"","addr":"DaxingArea黄村西大街15号","brdId":381835,"dealPrice":0,"referencePrice":21,"showCount":0,"id":179},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"嘉美国际影城","dis":"","area":"DaxingArea","nm":"嘉美国际影城(旧宫店)","poiId":6685358,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.814774,"lng":116.454636,"ct":"","addr":"DaxingArea旧宫小红门路39号","brdId":352923,"dealPrice":0,"referencePrice":70,"showCount":0,"id":2598},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"金逸影城","dis":"","area":"DaxingArea","nm":"金逸影城(荟聚IMAX店)","poiId":40697227,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":39.78879,"lng":116.32654,"ct":"","addr":"DaxingArea欣宁街荟聚购物中心3层（地铁4号线西红门站A西出口站）","brdId":1079568,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10987},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"卢米埃影城","dis":"","area":"DaxingArea","nm":"卢米埃影城(万科店)","poiId":93511270,"sellmin":0,"sell":true,"preferential":0,"sellPrice":28.5,"lat":39.80576,"lng":116.460175,"ct":"","addr":"DaxingArea忠凉路万科广场5层","brdId":292030,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15773},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"DaxingArea","nm":"唐阁影城(亦庄店)","poiId":5165994,"sellmin":0,"sell":true,"preferential":0,"sellPrice":29,"lat":39.806152,"lng":116.50166,"ct":"","addr":"DaxingArea经济技术开发区荣华中路8号院华联力宝购物中心四层","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":11132},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"新华国际影城","dis":"黄村","area":"DaxingArea","nm":"新华国际影城(大兴店)","poiId":86394,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.72971,"lng":116.34167,"ct":"","addr":"DaxingArea黄村东大街火神庙国际商业中心E座5层","brdId":29894,"dealPrice":36,"referencePrice":40,"showCount":0,"id":11},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"星美国际影城","dis":"","area":"DaxingArea","nm":"星美国际影城(西红门店)","poiId":2490890,"sellmin":0,"sell":true,"preferential":0,"sellPrice":24,"lat":39.799633,"lng":116.33217,"ct":"","addr":"DaxingArea西红门镇京良路10号乐家购物中心B区3层","brdId":30032,"dealPrice":0,"referencePrice":70,"showCount":0,"id":6057},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","area":"DaxingArea","nm":"耀莱成龙国际影城(西红门店)","poiId":41278576,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.791393,"lng":116.340256,"ct":"","addr":"DaxingArea欣旺北大街8号鸿坤广场6层（地铁4号线西红门站Ｂ口向东４００米路北）","brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"id":11082},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"DaxingArea","nm":"中传国际影城(亦庄店)","poiId":93839693,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.803543,"lng":116.53282,"ct":"","addr":"DaxingArea经济技术开发区科创五街38号C座3层F3-C3006","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15294},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"","area":"DaxingArea","nm":"最影城","poiId":95968537,"sellmin":0,"sell":true,"preferential":0,"sellPrice":32.9,"lat":39.73894,"lng":116.33174,"ct":"","addr":"DaxingArea兴华大街百联清城购物中心3层北侧","brdId":0,"dealPrice":29.6,"referencePrice":0,"showCount":0,"id":15018},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"DaxingArea","nm":"玫瑰之约汽车影院(半壁店)","poiId":51400779,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.629345,"lng":116.38453,"ct":"","addr":"DaxingArea东大路多维创新园内","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14054}],"DongchengArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"UME国际影城","dis":"安贞","area":"DongchengArea","nm":"UME国际影城(安贞店)","poiId":94496,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39.5,"lat":39.966072,"lng":116.41096,"ct":"","addr":"DongchengArea北三环安贞桥环球贸易中心E座","brdId":24071,"dealPrice":0,"referencePrice":70,"showCount":0,"id":99},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"百老汇影城","dis":"王府井","area":"DongchengArea","nm":"百丽宫影城(金宝汇店)","poiId":1076058,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":39.9152,"lng":116.42129,"ct":"","addr":"DongchengArea金宝街88号金宝汇7层","brdId":24377,"dealPrice":0,"referencePrice":80,"showCount":0,"id":122},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"百老汇影城","dis":"东直门","area":"DongchengArea","nm":"百老汇电影中心(万国城店)","poiId":1076062,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":39.950455,"lng":116.43878,"ct":"","addr":"DongchengArea香河园路1号当代MOMA北区T4座","brdId":24377,"dealPrice":0,"referencePrice":80,"showCount":0,"id":94},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"百老汇影城","dis":"王府井","area":"DongchengArea","nm":"百老汇影城(apm购物中心店)","poiId":271444,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":39.914005,"lng":116.41193,"ct":"","addr":"DongchengArea王府井大街138号北京apm6层","brdId":24377,"dealPrice":0,"referencePrice":70,"showCount":0,"id":267},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"百老汇影城","dis":"王府井","area":"DongchengArea","nm":"百老汇影城(东方广场店)","poiId":271409,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":39.909454,"lng":116.411934,"ct":"","addr":"DongchengArea东长安街1号东方广场地下1层","brdId":24377,"dealPrice":0,"referencePrice":40,"showCount":0,"id":269},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"百老汇影城","dis":"崇文门","area":"DongchengArea","nm":"百老汇影城(国瑞购物中心店)","poiId":1048975,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":39.897575,"lng":116.420135,"ct":"","addr":"DongchengArea崇文门外大街18号国瑞城购物中心首层/-2层","brdId":24377,"dealPrice":0,"referencePrice":80,"showCount":0,"id":119},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"东宫影剧院","dis":"东四","area":"DongchengArea","nm":"东宫影剧院","poiId":60166,"sellmin":0,"sell":true,"preferential":0,"sellPrice":31,"lat":39.9253,"lng":116.41552,"ct":"","addr":"DongchengArea隆福寺街47号东四工人文化宫","brdId":125212,"dealPrice":0,"referencePrice":30,"showCount":0,"id":242},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"东环影城","dis":"东直门","area":"DongchengArea","nm":"东环影城","poiId":43786,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":39.936527,"lng":116.43607,"ct":"","addr":"DongchengArea东中街9号东环广场B座B1楼","brdId":25181,"dealPrice":29,"referencePrice":80,"showCount":0,"id":265},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"横店电影城","dis":"王府井","area":"DongchengArea","nm":"横店电影城(王府井店)","poiId":1549949,"sellmin":0,"sell":true,"preferential":0,"sellPrice":24,"lat":39.913864,"lng":116.41057,"ct":"","addr":"DongchengArea王府井大街251-253号8层","brdId":26045,"dealPrice":31,"referencePrice":70,"showCount":0,"id":79},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"DongchengArea","nm":"青春光线电影院","poiId":99389254,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":39.95059,"lng":116.42174,"ct":"","addr":"DongchengArea东滨河路乙一号雍和航星园内","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15280},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"搜秀影城","dis":"崇文门","area":"DongchengArea","nm":"搜秀影城","poiId":82579,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":39.896397,"lng":116.419266,"ct":"","addr":"DongchengArea崇外大街40号搜秀城9层","brdId":28916,"dealPrice":39,"referencePrice":80,"showCount":0,"id":270},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","area":"DongchengArea","nm":"耀莱成龙国际影城(王府井店)","poiId":6074394,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.90959,"lng":116.41121,"ct":"","addr":"DongchengArea王府井大街301号新燕莎购物中心地下一层西侧（地铁一号线王府井站出C2口向北步行200米路西）","brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10781},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"DongchengArea","nm":"北京站电影院","poiId":52795616,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.903954,"lng":116.4272,"ct":"","addr":"DongchengArea毛家湾胡同甲13号站西侧3层","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14472},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"东四","area":"DongchengArea","nm":"东城图书馆影剧院","poiId":271413,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.941,"lng":116.413,"ct":"","addr":"DongchengArea交道口东大街85号区图书馆1楼","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":4541}],"FengtaiArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"FengtaiArea","nm":"DMG国际影城(悦秀店)","poiId":94444126,"sellmin":0,"sell":true,"preferential":0,"sellPrice":24,"lat":39.868313,"lng":116.375984,"ct":"","addr":"FengtaiArea开阳路8号悦秀城6层","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15859},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"保利国际影城","dis":"草桥","area":"FengtaiArea","nm":"保利国际影城(凯德MALL·大峡谷店)","poiId":339944,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":39.854645,"lng":116.36706,"ct":"","addr":"FengtaiArea南三环西路16号凯德大峡谷购物中心5楼","brdId":24472,"dealPrice":0,"referencePrice":40,"showCount":0,"id":42},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"保利国际影城","dis":"东高地","area":"FengtaiArea","nm":"保利国际影城(万源店)","poiId":299479,"sellmin":0,"sell":true,"preferential":0,"sellPrice":24,"lat":39.80296,"lng":116.423454,"ct":"","addr":"FengtaiArea东高地万源西里航天万源广场5层","brdId":24472,"dealPrice":27,"referencePrice":70,"showCount":0,"id":129},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"博纳国际影城","dis":"方庄","area":"FengtaiArea","nm":"博纳国际影城(方庄店)","poiId":82556,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":39.863983,"lng":116.42227,"ct":"","addr":"FengtaiArea蒲黄榆路28号","brdId":24595,"dealPrice":0,"referencePrice":80,"showCount":0,"id":43},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大地影院","dis":"","area":"FengtaiArea","nm":"大地影院(欣雅汇店)","poiId":78978010,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.855907,"lng":116.397896,"ct":"","addr":"FengtaiArea果园8号楼临三环（木樨园桥-西南角欣雅汇生活广场6层）","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15070},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"FengtaiArea","nm":"东融国际影城(草桥店)","poiId":113165716,"sellmin":0,"sell":true,"preferential":0,"sellPrice":22.9,"lat":39.850945,"lng":116.35827,"ct":"","addr":"FengtaiArea草桥东路1号上品折扣3层","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16458},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"华谊兄弟影院","dis":"","area":"FengtaiArea","nm":"华谊兄弟影院(洋桥店)","poiId":1547150,"sellmin":0,"sell":true,"preferential":0,"sellPrice":26,"lat":39.84446,"lng":116.38594,"ct":"","addr":"FengtaiArea马家堡东路101号院10号银泰百货6层","brdId":275830,"dealPrice":0,"referencePrice":80,"showCount":0,"id":2548},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"FengtaiArea","nm":"青少年剧场","poiId":271414,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.851784,"lng":116.28421,"ct":"","addr":"FengtaiArea西四环南路86号","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":4542},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"幸福蓝海国际影城","dis":"","area":"FengtaiArea","nm":"幸福蓝海国际影城(北京公益桥店)","poiId":5161700,"sellmin":0,"sell":true,"preferential":0,"sellPrice":24,"lat":39.836674,"lng":116.37848,"ct":"","addr":"FengtaiArea角门路19号院2号楼华冠天地4层（原大万广场）","brdId":30053,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8578},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"星美国际影城","dis":"方庄","area":"FengtaiArea","nm":"星美国际影城(分钟寺店)","poiId":1436294,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":39.857136,"lng":116.44611,"ct":"","addr":"FengtaiArea南三环东路成寿寺路2号新业广场2楼","brdId":30032,"dealPrice":0,"referencePrice":35,"showCount":0,"id":9},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"正华影城","dis":"方庄","area":"FengtaiArea","nm":"正华影院","poiId":82600,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.845528,"lng":116.43179,"ct":"","addr":"FengtaiArea宋家庄顺八条4号政馨园三区5号楼底商正华商城地下一层","brdId":677942,"dealPrice":0,"referencePrice":60,"showCount":0,"id":63},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"中影国际影城","dis":"","area":"FengtaiArea","nm":"中影国际影城(丰台千禧街店)","poiId":6458108,"sellmin":0,"sell":true,"preferential":0,"sellPrice":34.9,"lat":39.889786,"lng":116.287766,"ct":"","addr":"FengtaiArea靛场路千禧商业街4号楼","brdId":23745,"dealPrice":0,"referencePrice":30,"showCount":0,"id":7634},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"中影国际影城","dis":"","area":"FengtaiArea","nm":"中影国际影城(丰台永旺店)","poiId":77423086,"sellmin":0,"sell":true,"preferential":0,"sellPrice":36.9,"lat":39.817265,"lng":116.292496,"ct":"","addr":"FengtaiArea丰葆路永旺梦乐城4层","brdId":23745,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14384},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"FengtaiArea","nm":"北京中鼎兆通信息科技电影放映中心影院","poiId":95577364,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.856148,"lng":116.28398,"ct":"","addr":"FengtaiArea市辖区FengtaiArea西四环南路38号-1","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15271}],"XichengArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"西直门","area":"XichengArea","nm":"北京青年宫","poiId":271434,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.93531,"lng":116.35955,"ct":"","addr":"XichengArea西直门南小街68号","brdId":0,"dealPrice":0,"referencePrice":50,"showCount":0,"id":260},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大观楼影城","dis":"大栅栏","area":"XichengArea","nm":"大观楼电影院","poiId":89010,"sellmin":0,"sell":true,"preferential":0,"sellPrice":34,"lat":39.895596,"lng":116.39515,"ct":"","addr":"XichengArea前门大街大栅栏街36号","brdId":392770,"dealPrice":0,"referencePrice":60,"showCount":0,"id":263},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"地质礼堂","dis":"西四","area":"XichengArea","nm":"地质礼堂","poiId":89006,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":39.922535,"lng":116.371346,"ct":"","addr":"XichengArea西四羊肉胡同30号（中国地质博物馆南侧）","brdId":368740,"dealPrice":0,"referencePrice":50,"showCount":0,"id":261},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"广内大街","area":"XichengArea","nm":"广安门电影院","poiId":82592,"sellmin":0,"sell":true,"preferential":0,"sellPrice":34,"lat":39.88407,"lng":116.35917,"ct":"","addr":"XichengArea白广路8号","brdId":0,"dealPrice":0,"referencePrice":40,"showCount":0,"id":247},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"月坛","area":"XichengArea","nm":"国宾菁英电影院","poiId":274294,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.913624,"lng":116.34325,"ct":"","addr":"XichengArea月坛南街24号（近万方商场）","brdId":0,"dealPrice":0,"referencePrice":40,"showCount":0,"id":255},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"虎坊桥","area":"XichengArea","nm":"工人俱乐部电影院","poiId":1436438,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.888065,"lng":116.38378,"ct":"","addr":"XichengArea虎坊路口南7号","brdId":0,"dealPrice":0,"referencePrice":60,"showCount":0,"id":237},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"首都电影院","dis":"复兴门","area":"XichengArea","nm":"首都电影院(金融街店)","poiId":1541415,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":39.9151,"lng":116.36,"ct":"","addr":"XichengArea金融大街18号地下一层","brdId":1162239,"dealPrice":0,"referencePrice":80,"showCount":0,"id":1625},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"首都电影院","dis":"西单","area":"XichengArea","nm":"首都电影院(西单店)","poiId":283722,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":39.91066,"lng":116.373665,"ct":"","addr":"XichengArea西单北大街131号大悦城10楼（近西单苹果店）","brdId":1162239,"dealPrice":0,"referencePrice":60,"showCount":0,"id":149},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"XichengArea","nm":"首都电影院(中华店)","poiId":93439511,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":39.884457,"lng":116.39819,"ct":"","addr":"XichengArea天桥南大街3号楼一层、二层","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15270},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","area":"XichengArea","nm":"耀莱成龙国际影城(马连道店)","poiId":2393654,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.877544,"lng":116.32643,"ct":"","addr":"XichengArea马连道路25号新年华生活购物广场5层","brdId":30227,"dealPrice":0,"referencePrice":70,"showCount":0,"id":5278},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"XichengArea","nm":"剧空间剧场","poiId":73944402,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.94392,"lng":116.37328,"ct":"","addr":"XichengArea新街口北大街74号（近北京科学教育电影制片厂院内）","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14387},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"西单4d数字影院","dis":"西单","area":"XichengArea","nm":"西单4D数字影院","poiId":271397,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.90875,"lng":116.37512,"ct":"","addr":"XichengArea西单北大街180号西单文化广场","brdId":2876716,"dealPrice":0,"referencePrice":70,"showCount":0,"id":137},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"新街口电影院","dis":"西直门","area":"XichengArea","nm":"新街口电影院","poiId":82590,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.94168,"lng":116.37024,"ct":"","addr":"XichengArea西直门内大街69号","brdId":593182,"dealPrice":0,"referencePrice":50,"showCount":0,"id":243}],"TongzhouArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"TongzhouArea","nm":"北京东融国际影城(月亮河店)","poiId":99968119,"sellmin":0,"sell":true,"preferential":0,"sellPrice":22.9,"lat":39.919525,"lng":116.677376,"ct":"","addr":"TongzhouArea永顺镇芙蓉园513号楼","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15421},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"博纳国际影城","dis":"新华联","area":"TongzhouArea","nm":"博纳国际影城(通州北苑店)","poiId":363447,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":39.903496,"lng":116.6367,"ct":"","addr":"TongzhouArea杨庄北里52号华联天时名苑购物中心4楼（近通州北苑地铁站）","brdId":24595,"dealPrice":0,"referencePrice":80,"showCount":0,"id":2},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"博纳国际影城","dis":"","area":"TongzhouArea","nm":"博纳国际影城(通州土桥店)","poiId":51455681,"sellmin":0,"sell":true,"preferential":0,"sellPrice":24,"lat":39.86987,"lng":116.697586,"ct":"","addr":"TongzhouArea八通线土桥地铁站向东900米华远好天地购物中心3层","brdId":24595,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14381},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"百尚影城","dis":"","area":"TongzhouArea","nm":"百尚影城","poiId":2371476,"sellmin":0,"sell":true,"preferential":0,"sellPrice":28,"lat":39.752598,"lng":116.54536,"ct":"","addr":"TongzhouArea马驹桥镇百尚生活广场3楼","brdId":825664,"dealPrice":25,"referencePrice":0,"showCount":0,"id":6227},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大地影院","dis":"","area":"TongzhouArea","nm":"大地影城(米拉店)","poiId":6151046,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.760098,"lng":116.545555,"ct":"","addr":"TongzhouArea马驹桥新海东路1号（豪润生活广场7层）","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8301},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"","area":"TongzhouArea","nm":"米瑞酷影城(乔庄店)","poiId":4800806,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.891575,"lng":116.68774,"ct":"","addr":"TongzhouArea运河西大街乔庄卜蜂莲花超市一层","brdId":0,"dealPrice":30,"referencePrice":0,"showCount":0,"id":8654},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"TongzhouArea电影院","dis":"德外大街","area":"TongzhouArea","nm":"TongzhouArea电影院","poiId":82560,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.912743,"lng":116.66441,"ct":"","addr":"TongzhouArea西海子西塔胡同1号","brdId":1041607,"dealPrice":0,"referencePrice":60,"showCount":0,"id":178},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"万达影城","dis":"","area":"TongzhouArea","nm":"万达国际影城(通州万达店)","poiId":41521114,"sellmin":0,"sell":true,"preferential":0,"sellPrice":48,"lat":39.905937,"lng":116.64272,"ct":"","addr":"TongzhouArea新华西街58号万达广场1号楼5层（厨艺宾馆对面）","brdId":102642,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10837},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","area":"TongzhouArea","nm":"耀莱成龙国际影城(临河里店)","poiId":92950934,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.88119,"lng":116.68255,"ct":"","addr":"TongzhouArea临河里33号楼华业玫瑰商业中心D2号楼三层","brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14634},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"乐天影城","dis":"","area":"TongzhouArea","nm":"银兴乐天影城(通州店)","poiId":6139543,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.88967,"lng":116.659225,"ct":"","addr":"TongzhouArea翠景北里21号京通罗斯福广场5F","brdId":157630,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10964},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"梨园","area":"TongzhouArea","nm":"牛仔汽车电影院","poiId":358821,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.84602,"lng":116.62319,"ct":"","addr":"TongzhouArea台湖镇创业园路8号（近京沈高速台湖入口）","brdId":0,"dealPrice":0,"referencePrice":10,"showCount":0,"id":36}],"ChangpingArea":[{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"保利国际影城","dis":"回龙观","area":"ChangpingArea","nm":"保利国际影城(龙旗广场店)","poiId":3320660,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":40.066605,"lng":116.34672,"ct":"","addr":"ChangpingArea黄平路19号院3号楼龙旗广场购物中心3层（地铁8号线育新站路北600米，近永辉超市）","brdId":24472,"dealPrice":40,"referencePrice":100,"showCount":0,"id":5502},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"昌平镇","area":"ChangpingArea","nm":"昌平保利影剧院(佳莲时代广场店)","poiId":361208,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":40.223534,"lng":116.23402,"ct":"","addr":"ChangpingArea鼓楼南大街6号佳莲时代广场4楼（近鼓楼西街）","brdId":0,"dealPrice":0,"referencePrice":80,"showCount":0,"id":50},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大地影院","dis":"昌平镇","area":"ChangpingArea","nm":"大地影院(昌平菓岭店)","poiId":1432377,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":40.222176,"lng":116.264755,"ct":"","addr":"ChangpingArea昌崔路203号果岭假日广场四楼","brdId":384262,"dealPrice":0,"referencePrice":40,"showCount":0,"id":66},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"首都电影院","dis":"","area":"ChangpingArea","nm":"首都电影院(悦荟万科广场店)","poiId":373237,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":40.2124,"lng":116.24026,"ct":"","addr":"ChangpingArea南环路10号院1号楼悦荟万科广场8层","brdId":1162239,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8186},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"万达影城","dis":"天通苑","area":"ChangpingArea","nm":"万达国际影城(龙德广场店)","poiId":30864,"sellmin":0,"sell":true,"preferential":0,"sellPrice":48,"lat":40.060596,"lng":116.41618,"ct":"","addr":"ChangpingArea立汤路186号龙德广场5层","brdId":102642,"dealPrice":0,"referencePrice":80,"showCount":0,"id":151},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"沃美影城","dis":"","area":"ChangpingArea","nm":"沃美影城(回龙观店)","poiId":4058821,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":40.071976,"lng":116.33717,"ct":"","addr":"ChangpingArea回龙观同成街华联购物中心四楼（城铁回龙观站出口对面）","brdId":29462,"dealPrice":40,"referencePrice":0,"showCount":0,"id":9647},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"星美国际影城","dis":"回龙观","area":"ChangpingArea","nm":"星美国际影城(回龙观店)","poiId":286187,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":40.07596,"lng":116.31944,"ct":"","addr":"ChangpingArea回龙观西大街111号华联商场3楼","brdId":30032,"dealPrice":0,"referencePrice":40,"showCount":0,"id":140},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"中影国际影城","dis":"回龙观","area":"ChangpingArea","nm":"中影国际影城(昌平永旺店)","poiId":82598,"sellmin":0,"sell":true,"preferential":0,"sellPrice":49.9,"lat":40.09749,"lng":116.28857,"ct":"","addr":"ChangpingArea北清路1号永旺国际商城3楼","brdId":23745,"dealPrice":0,"referencePrice":23,"showCount":0,"id":107}],"FangshanArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"FangshanArea","nm":"DMG影城(良乡店)","poiId":5677585,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.72994,"lng":116.14175,"ct":"","addr":"FangshanArea拱辰南大街瑞城广场7F","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16058},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"SFC上影影城","dis":"","area":"FangshanArea","nm":"SFC上影影城(房山绿地店)","poiId":52294367,"sellmin":0,"sell":true,"preferential":0,"sellPrice":34,"lat":39.756683,"lng":116.160515,"ct":"","addr":"FangshanArea黄辛庄路口绿地缤纷城3层","brdId":2880988,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13618},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"FangshanArea","nm":"环球国际影城","poiId":5252975,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.69285,"lng":115.98708,"ct":"","addr":"FangshanArea兴房大街38号华冠欢乐城四楼","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":9370},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"良乡影剧院","dis":"房山","area":"FangshanArea","nm":"良乡影剧院","poiId":1436368,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.73799,"lng":116.141685,"ct":"","addr":"FangshanArea良乡拱辰大街31号","brdId":949172,"dealPrice":0,"referencePrice":30,"showCount":0,"id":145},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"幸福蓝海国际影城","dis":"","area":"FangshanArea","nm":"幸福蓝海国际影城(北京房山店)","poiId":40470614,"sellmin":0,"sell":true,"preferential":0,"sellPrice":39,"lat":39.753548,"lng":116.21099,"ct":"","addr":"FangshanArea广阳新路9号院1号楼中粮万科半岛购物广场3层","brdId":30053,"dealPrice":33,"referencePrice":0,"showCount":0,"id":13028},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"新华国际影城","dis":"房山","area":"FangshanArea","nm":"新华国际影城(房山店)","poiId":299222,"sellmin":0,"sell":true,"preferential":0,"sellPrice":34.5,"lat":39.73469,"lng":116.13953,"ct":"","addr":"FangshanArea良乡北关西路14号华冠购物中心五层","brdId":29894,"dealPrice":0,"referencePrice":60,"showCount":0,"id":131},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"燕山影剧院","dis":"房山","area":"FangshanArea","nm":"燕山影剧院","poiId":271449,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.72787,"lng":115.96215,"ct":"","addr":"FangshanArea燕山岗南路3号","brdId":777439,"dealPrice":35,"referencePrice":35,"showCount":0,"id":60},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"FangshanArea","nm":"北京燕山文化活动中心影院","poiId":99082156,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":39.72558,"lng":115.96181,"ct":"","addr":"FangshanArea迎风街道岗南路9号","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15272}],"ShunyiArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"CGV影城","dis":"","area":"ShunyiArea","nm":"CGV星聚汇影城(顺义店)","poiId":6448554,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":40.12897,"lng":116.65173,"ct":"","addr":"ShunyiArea新顺南大街8号华联购物中心4层CGV星聚汇国际影城","brdId":2020418,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8111},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"博纳国际影城","dis":"顺义","area":"ShunyiArea","nm":"博纳国际影城(顺义店)","poiId":1437402,"sellmin":0,"sell":true,"preferential":0,"sellPrice":44,"lat":40.126575,"lng":116.65212,"ct":"","addr":"ShunyiArea新顺南大街18号新世界百货七层","brdId":24595,"dealPrice":0,"referencePrice":70,"showCount":0,"id":69},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"橙天嘉禾影城","dis":"","area":"ShunyiArea","nm":"橙天嘉禾影城(祥云小镇店)","poiId":40420215,"sellmin":0,"sell":true,"preferential":0,"sellPrice":54.5,"lat":40.09027,"lng":116.53684,"ct":"","addr":"ShunyiArea安泰大街9号院7号楼二层（祥云小镇内）","brdId":24745,"dealPrice":0,"referencePrice":0,"showCount":0,"id":11102},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大地影院","dis":"","area":"ShunyiArea","nm":"大地影院(顺义隆华店)","poiId":41599879,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":40.125973,"lng":116.650536,"ct":"","addr":"ShunyiArea新顺南大街11号隆华购物中心6F","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":12394},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"ShunyiArea","nm":"华彩恐龙主题影城","poiId":116704263,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":40.105373,"lng":116.54243,"ct":"","addr":"ShunyiArea后沙峪九重汇8层","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16496},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"顺义影剧院","dis":"顺义","area":"ShunyiArea","nm":"顺义影剧院","poiId":89018,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":40.1338,"lng":116.650375,"ct":"","addr":"ShunyiArea新顺北大街3号","brdId":1148935,"dealPrice":25,"referencePrice":30,"showCount":0,"id":180}],"MentougouArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"门头沟","area":"MentougouArea","nm":"门头沟影剧院","poiId":3260641,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.9425,"lng":116.10049,"ct":"","addr":"MentougouArea新桥大街12号","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":182},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"幸福蓝海国际影城","dis":"","area":"MentougouArea","nm":"幸福蓝海影城(门头沟店)","poiId":42297501,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.91212,"lng":116.11124,"ct":"","addr":"MentougouArea永定镇冯村华润购物中心2层","brdId":30053,"dealPrice":35.9,"referencePrice":0,"showCount":0,"id":10570},{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"","area":"MentougouArea","nm":"熙旺国际影城","poiId":40550440,"sellmin":0,"sell":true,"preferential":0,"sellPrice":23,"lat":39.93551,"lng":116.11315,"ct":"","addr":"MentougouArea双峪路35号熙旺生活广场B座6层","brdId":0,"dealPrice":35.9,"referencePrice":0,"showCount":0,"id":10979}],"ShijingshanArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"保利国际影城","dis":"","area":"ShijingshanArea","nm":"保利国际影城(苹果园店)","poiId":6596632,"sellmin":0,"sell":true,"preferential":0,"sellPrice":38,"lat":39.92295,"lng":116.17175,"ct":"","addr":"ShijingshanArea阜石路300号喜隆多三层","brdId":24472,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10294},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"古城电影院","dis":"古城","area":"ShijingshanArea","nm":"古城电影院","poiId":82589,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":39.9112,"lng":116.19126,"ct":"","addr":"ShijingshanArea古城南路15号","brdId":302869,"dealPrice":0,"referencePrice":0,"showCount":0,"id":246},{"imax":1,"deal":0,"distance":0,"follow":0,"brd":"万达影城","dis":"鲁谷","area":"ShijingshanArea","nm":"万达国际影城(石景山店)","poiId":298683,"sellmin":0,"sell":true,"preferential":0,"sellPrice":48,"lat":39.905945,"lng":116.22568,"ct":"","addr":"ShijingshanArea石景山路乙18号万达广场娱乐楼4楼","brdId":102642,"dealPrice":0,"referencePrice":80,"showCount":0,"id":133}],"HuairouArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"怀柔","area":"HuairouArea","nm":"传奇瑞丽影城","poiId":3260663,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":40.317955,"lng":116.62985,"ct":"","addr":"HuairouArea青春路15号四层","brdId":0,"dealPrice":0,"referencePrice":35,"showCount":0,"id":55},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"","area":"HuairouArea","nm":"米珈尼汽车影院","poiId":94728699,"sellmin":0,"sell":true,"preferential":0,"sellPrice":53,"lat":40.392265,"lng":116.67963,"ct":"","addr":"HuairouArea雁栖湖路1号","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15748},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"怀柔","area":"HuairouArea","nm":"HuairouArea电影院","poiId":1541434,"sellmin":0,"sell":false,"preferential":0,"sellPrice":0,"lat":40.34083,"lng":116.64014,"ct":"","addr":"HuairouArea富乐大街8号","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":2378}],"PingguArea":[{"imax":0,"deal":1,"distance":0,"follow":0,"brd":"其它","dis":"","area":"PingguArea","nm":"华联国际影城(平谷店)","poiId":97314976,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":40.14356,"lng":117.093155,"ct":"","addr":"PingguArea迎宾路1号院22号楼五层F5-13","brdId":0,"dealPrice":27.5,"referencePrice":0,"showCount":0,"id":15082},{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"PingguArea影剧院","dis":"平谷","area":"PingguArea","nm":"PingguArea影剧院","poiId":1156598,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":40.14054,"lng":117.1224,"ct":"","addr":"PingguArea府前街3号","brdId":505125,"dealPrice":0,"referencePrice":0,"showCount":0,"id":2379}],"MiyunArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"其它","dis":"MiyunArea","area":"MiyunArea","nm":"密云大剧院","poiId":1436412,"sellmin":0,"sell":true,"preferential":0,"sellPrice":33,"lat":40.377117,"lng":116.84507,"ct":"","addr":"MiyunArea鼓楼西大街1号","brdId":0,"dealPrice":0,"referencePrice":60,"showCount":0,"id":183}],"YanqingArea":[{"imax":0,"deal":0,"distance":0,"follow":0,"brd":"大地影院","dis":"延庆","area":"YanqingArea","nm":"大地影院(延庆金锣湾店)","poiId":1366944,"sellmin":0,"sell":true,"preferential":0,"sellPrice":43,"lat":40.461918,"lng":115.97629,"ct":"","addr":"YanqingArea妫水北街39号1幢H座首楼金锣湾商业中心沃尔玛旁","brdId":384262,"dealPrice":0,"referencePrice":40,"showCount":0,"id":13}]}
     */

    private int status;
    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 17.5影城
         * dis : 望京
         * area : ChaoyangArea
         * nm : 17.5影城(比如世界店)
         * poiId : 75603
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 30
         * lat : 39.9684
         * lng : 116.46204
         * ct : 
         * addr : ChaoyangArea京顺路111号比如世界购物中心1层（近太阳宫北街）
         * brdId : 23854
         * dealPrice : 0
         * referencePrice : 70
         * showCount : 0
         * id : 48
         */

        private List<ChaoyangAreaBean> ChaoyangArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 17.5影城
         * dis : 北太平庄
         * area : HaidianArea
         * nm : 17.5影城(今典花园店)
         * poiId : 273950
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 44
         * lat : 39.95334
         * lng : 116.36104
         * ct : 
         * addr : HaidianArea文慧园路9号今典花园9号楼空间蒙太奇大厦1层
         * brdId : 23854
         * dealPrice : 0
         * referencePrice : 60
         * showCount : 0
         * id : 154
         */

        private List<HaidianAreaBean> HaidianArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : CGV影城
         * dis : 
         * area : DaxingArea
         * nm : CGV星聚汇影城(亦庄店)
         * poiId : 105355906
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 23
         * lat : 39.790707
         * lng : 116.51294
         * ct : 
         * addr : DaxingArea经济技术开发区荣京东街大族广场9号楼三层
         * brdId : 2020418
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 16152
         */

        private List<DaxingAreaBean> DaxingArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : UME国际影城
         * dis : 安贞
         * area : DongchengArea
         * nm : UME国际影城(安贞店)
         * poiId : 94496
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 39.5
         * lat : 39.966072
         * lng : 116.41096
         * ct : 
         * addr : DongchengArea北三环安贞桥环球贸易中心E座
         * brdId : 24071
         * dealPrice : 0
         * referencePrice : 70
         * showCount : 0
         * id : 99
         */

        private List<DongchengAreaBean> DongchengArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 其它
         * dis : 
         * area : FengtaiArea
         * nm : DMG国际影城(悦秀店)
         * poiId : 94444126
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 24
         * lat : 39.868313
         * lng : 116.375984
         * ct : 
         * addr : FengtaiArea开阳路8号悦秀城6层
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 15859
         */

        private List<FengtaiAreaBean> FengtaiArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 其它
         * dis : 西直门
         * area : XichengArea
         * nm : 北京青年宫
         * poiId : 271434
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 38
         * lat : 39.93531
         * lng : 116.35955
         * ct : 
         * addr : XichengArea西直门南小街68号
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 50
         * showCount : 0
         * id : 260
         */

        private List<XichengAreaBean> XichengArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 其它
         * dis : 
         * area : TongzhouArea
         * nm : 北京东融国际影城(月亮河店)
         * poiId : 99968119
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 22.9
         * lat : 39.919525
         * lng : 116.677376
         * ct : 
         * addr : TongzhouArea永顺镇芙蓉园513号楼
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 15421
         */

        private List<TongzhouAreaBean> TongzhouArea;
        /**
         * imax : 0
         * deal : 1
         * distance : 0
         * follow : 0
         * brd : 保利国际影城
         * dis : 回龙观
         * area : ChangpingArea
         * nm : 保利国际影城(龙旗广场店)
         * poiId : 3320660
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 44
         * lat : 40.066605
         * lng : 116.34672
         * ct : 
         * addr : ChangpingArea黄平路19号院3号楼龙旗广场购物中心3层（地铁8号线育新站路北600米，近永辉超市）
         * brdId : 24472
         * dealPrice : 40
         * referencePrice : 100
         * showCount : 0
         * id : 5502
         */

        private List<ChangpingAreaBean> ChangpingArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 其它
         * dis : 
         * area : FangshanArea
         * nm : DMG影城(良乡店)
         * poiId : 5677585
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 23
         * lat : 39.72994
         * lng : 116.14175
         * ct : 
         * addr : FangshanArea拱辰南大街瑞城广场7F
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 16058
         */

        private List<FangshanAreaBean> FangshanArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : CGV影城
         * dis : 
         * area : ShunyiArea
         * nm : CGV星聚汇影城(顺义店)
         * poiId : 6448554
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 38
         * lat : 40.12897
         * lng : 116.65173
         * ct : 
         * addr : ShunyiArea新顺南大街8号华联购物中心4层CGV星聚汇国际影城
         * brdId : 2020418
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 8111
         */

        private List<ShunyiAreaBean> ShunyiArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 其它
         * dis : 门头沟
         * area : MentougouArea
         * nm : 门头沟影剧院
         * poiId : 3260641
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 33
         * lat : 39.9425
         * lng : 116.10049
         * ct : 
         * addr : MentougouArea新桥大街12号
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 182
         */

        private List<MentougouAreaBean> MentougouArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 保利国际影城
         * dis : 
         * area : ShijingshanArea
         * nm : 保利国际影城(苹果园店)
         * poiId : 6596632
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 38
         * lat : 39.92295
         * lng : 116.17175
         * ct : 
         * addr : ShijingshanArea阜石路300号喜隆多三层
         * brdId : 24472
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 10294
         */

        private List<ShijingshanAreaBean> ShijingshanArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 其它
         * dis : 怀柔
         * area : HuairouArea
         * nm : 传奇瑞丽影城
         * poiId : 3260663
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 43
         * lat : 40.317955
         * lng : 116.62985
         * ct : 
         * addr : HuairouArea青春路15号四层
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 35
         * showCount : 0
         * id : 55
         */

        private List<HuairouAreaBean> HuairouArea;
        /**
         * imax : 0
         * deal : 1
         * distance : 0
         * follow : 0
         * brd : 其它
         * dis : 
         * area : PingguArea
         * nm : 华联国际影城(平谷店)
         * poiId : 97314976
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 33
         * lat : 40.14356
         * lng : 117.093155
         * ct : 
         * addr : PingguArea迎宾路1号院22号楼五层F5-13
         * brdId : 0
         * dealPrice : 27.5
         * referencePrice : 0
         * showCount : 0
         * id : 15082
         */

        private List<PingguAreaBean> PingguArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 其它
         * dis : MiyunArea
         * area : MiyunArea
         * nm : 密云大剧院
         * poiId : 1436412
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 33
         * lat : 40.377117
         * lng : 116.84507
         * ct : 
         * addr : MiyunArea鼓楼西大街1号
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 60
         * showCount : 0
         * id : 183
         */

        private List<MiyunAreaBean> MiyunArea;
        /**
         * imax : 0
         * deal : 0
         * distance : 0
         * follow : 0
         * brd : 大地影院
         * dis : 延庆
         * area : YanqingArea
         * nm : 大地影院(延庆金锣湾店)
         * poiId : 1366944
         * sellmin : 0
         * sell : true
         * preferential : 0
         * sellPrice : 43
         * lat : 40.461918
         * lng : 115.97629
         * ct : 
         * addr : YanqingArea妫水北街39号1幢H座首楼金锣湾商业中心沃尔玛旁
         * brdId : 384262
         * dealPrice : 0
         * referencePrice : 40
         * showCount : 0
         * id : 13
         */

        private List<YanqingAreaBean> YanqingArea;

        public List<ChaoyangAreaBean> getChaoyangArea() {
            return ChaoyangArea;
        }

        public void setChaoyangArea(List<ChaoyangAreaBean> ChaoyangArea) {
            this.ChaoyangArea = ChaoyangArea;
        }

        public List<HaidianAreaBean> getHaidianArea() {
            return HaidianArea;
        }

        public void setHaidianArea(List<HaidianAreaBean> HaidianArea) {
            this.HaidianArea = HaidianArea;
        }

        public List<DaxingAreaBean> getDaxingArea() {
            return DaxingArea;
        }

        public void setDaxingArea(List<DaxingAreaBean> DaxingArea) {
            this.DaxingArea = DaxingArea;
        }

        public List<DongchengAreaBean> getDongchengArea() {
            return DongchengArea;
        }

        public void setDongchengArea(List<DongchengAreaBean> DongchengArea) {
            this.DongchengArea = DongchengArea;
        }

        public List<FengtaiAreaBean> getFengtaiArea() {
            return FengtaiArea;
        }

        public void setFengtaiArea(List<FengtaiAreaBean> FengtaiArea) {
            this.FengtaiArea = FengtaiArea;
        }

        public List<XichengAreaBean> getXichengArea() {
            return XichengArea;
        }

        public void setXichengArea(List<XichengAreaBean> XichengArea) {
            this.XichengArea = XichengArea;
        }

        public List<TongzhouAreaBean> getTongzhouArea() {
            return TongzhouArea;
        }

        public void setTongzhouArea(List<TongzhouAreaBean> TongzhouArea) {
            this.TongzhouArea = TongzhouArea;
        }

        public List<ChangpingAreaBean> getChangpingArea() {
            return ChangpingArea;
        }

        public void setChangpingArea(List<ChangpingAreaBean> ChangpingArea) {
            this.ChangpingArea = ChangpingArea;
        }

        public List<FangshanAreaBean> getFangshanArea() {
            return FangshanArea;
        }

        public void setFangshanArea(List<FangshanAreaBean> FangshanArea) {
            this.FangshanArea = FangshanArea;
        }

        public List<ShunyiAreaBean> getShunyiArea() {
            return ShunyiArea;
        }

        public void setShunyiArea(List<ShunyiAreaBean> ShunyiArea) {
            this.ShunyiArea = ShunyiArea;
        }

        public List<MentougouAreaBean> getMentougouArea() {
            return MentougouArea;
        }

        public void setMentougouArea(List<MentougouAreaBean> MentougouArea) {
            this.MentougouArea = MentougouArea;
        }

        public List<ShijingshanAreaBean> getShijingshanArea() {
            return ShijingshanArea;
        }

        public void setShijingshanArea(List<ShijingshanAreaBean> ShijingshanArea) {
            this.ShijingshanArea = ShijingshanArea;
        }

        public List<HuairouAreaBean> getHuairouArea() {
            return HuairouArea;
        }

        public void setHuairouArea(List<HuairouAreaBean> HuairouArea) {
            this.HuairouArea = HuairouArea;
        }

        public List<PingguAreaBean> getPingguArea() {
            return PingguArea;
        }

        public void setPingguArea(List<PingguAreaBean> PingguArea) {
            this.PingguArea = PingguArea;
        }

        public List<MiyunAreaBean> getMiyunArea() {
            return MiyunArea;
        }

        public void setMiyunArea(List<MiyunAreaBean> MiyunArea) {
            this.MiyunArea = MiyunArea;
        }

        public List<YanqingAreaBean> getYanqingArea() {
            return YanqingArea;
        }

        public void setYanqingArea(List<YanqingAreaBean> YanqingArea) {
            this.YanqingArea = YanqingArea;
        }

        public static class ChaoyangAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class HaidianAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class DaxingAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class DongchengAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private double sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class FengtaiAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class XichengAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class TongzhouAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private double sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class ChangpingAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class FangshanAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class ShunyiAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class MentougouAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class ShijingshanAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class HuairouAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class PingguAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private double dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class MiyunAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class YanqingAreaBean {
            private int imax;
            private int deal;
            private int distance;
            private int follow;
            private String brd;
            private String dis;
            private String area;
            private String nm;
            private int poiId;
            private int sellmin;
            private boolean sell;
            private int preferential;
            private int sellPrice;
            private double lat;
            private double lng;
            private String ct;
            private String addr;
            private int brdId;
            private int dealPrice;
            private int referencePrice;
            private int showCount;
            private int id;

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(int sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public int getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(int dealPrice) {
                this.dealPrice = dealPrice;
            }

            public int getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(int referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
