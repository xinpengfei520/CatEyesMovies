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
