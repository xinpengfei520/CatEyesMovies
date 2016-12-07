package com.xpf.cateyesmovies.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

// 影院页面的Bean类
public class CinemaContainer {

    /**
     * control : {"expires":43200}
     * status : 0
     */

    @SerializedName("control")
    private Controlbean control;
    @SerializedName("status")
    private int status;
    @SerializedName("data")
    private Databean data;

    public Controlbean getControl() {
        return control;
    }

    public void setControl(Controlbean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Databean getData() {
        return data;
    }

    public void setData(Databean data) {
        this.data = data;
    }

    public static class Controlbean {
        /**
         * expires : 43200
         */

        @SerializedName("expires")
        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class Databean {
        @SerializedName("朝阳区")
        private List<Chaoyangbean> chaoyang;
        @SerializedName("海淀区")
        private List<Haidianbean> haidian;
        @SerializedName("大兴区")
        private List<Daxingbean> daxing;
        @SerializedName("东城区")
        private List<Dongchengbean> dongcheng;
        @SerializedName("丰台区")
        private List<Fengtaibean> fengtai;
        @SerializedName("西城区")
        private List<Xichengbean> xicheng;
        @SerializedName("通州区")
        private List<Tongzhoubean> tongzhou;
        @SerializedName("昌平区")
        private List<Changpingbean> changping;
        @SerializedName("房山区")
        private List<Fangshanbean> fangshan;
        @SerializedName("顺义区")
        private List<Shunyibean> shunyi;
        @SerializedName("门头沟区")
        private List<Mentougoubean> mentougou;
        @SerializedName("石景山区")
        private List<Shijingshanbean> shijingshan;
        @SerializedName("怀柔区")
        private List<huairoubean> huairou;
        @SerializedName("平谷区")
        private List<Pingubean> pinggu;
        @SerializedName("密云县")
        private List<Miyunbean> miyun;
        @SerializedName("延庆县")
        private List<Yanqingbean> yanqing;

        public List<Chaoyangbean> getChaoyang() {
            return chaoyang;
        }

        public void setChaoyang(List<Chaoyangbean> chaoyang) {
            this.chaoyang = chaoyang;
        }

        public List<Haidianbean> getHaidian() {
            return haidian;
        }

        public void setHaidian(List<Haidianbean> haidian) {
            this.haidian = haidian;
        }

        public List<Daxingbean> getDaxing() {
            return daxing;
        }

        public void setDaxing(List<Daxingbean> daxing) {
            this.daxing = daxing;
        }

        public List<Dongchengbean> getDongcheng() {
            return dongcheng;
        }

        public void setDongcheng(List<Dongchengbean> dongcheng) {
            this.dongcheng = dongcheng;
        }

        public List<Fengtaibean> getFengtai() {
            return fengtai;
        }

        public void setFengtai(List<Fengtaibean> fengtai) {
            this.fengtai = fengtai;
        }

        public List<Xichengbean> getXicheng() {
            return xicheng;
        }

        public void setXicheng(List<Xichengbean> xicheng) {
            this.xicheng = xicheng;
        }

        public List<Tongzhoubean> getTongzhou() {
            return tongzhou;
        }

        public void setTongzhou(List<Tongzhoubean> tongzhou) {
            this.tongzhou = tongzhou;
        }

        public List<Changpingbean> getChangping() {
            return changping;
        }

        public void setChangping(List<Changpingbean> changping) {
            this.changping = changping;
        }

        public List<Fangshanbean> getFangshan() {
            return fangshan;
        }

        public void setFangshan(List<Fangshanbean> fangshan) {
            this.fangshan = fangshan;
        }

        public List<Shunyibean> getShunyi() {
            return shunyi;
        }

        public void setShunyi(List<Shunyibean> shunyi) {
            this.shunyi = shunyi;
        }

        public List<Mentougoubean> getMentougou() {
            return mentougou;
        }

        public void setMentougou(List<Mentougoubean> mentougou) {
            this.mentougou = mentougou;
        }

        public List<Shijingshanbean> getShijingshan() {
            return shijingshan;
        }

        public void setShijingshan(List<Shijingshanbean> shijingshan) {
            this.shijingshan = shijingshan;
        }

        public List<huairoubean> getHuairou() {
            return huairou;
        }

        public void setHuairou(List<huairoubean> huairou) {
            this.huairou = huairou;
        }

        public List<Pingubean> getPinggu() {
            return pinggu;
        }

        public void setPinggu(List<Pingubean> pinggu) {
            this.pinggu = pinggu;
        }

        public List<Miyunbean> getMiyun() {
            return miyun;
        }

        public void setMiyun(List<Miyunbean> miyun) {
            this.miyun = miyun;
        }

        public List<Yanqingbean> getYanqing() {
            return yanqing;
        }

        public void setYanqing(List<Yanqingbean> yanqing) {
            this.yanqing = yanqing;
        }

        public static class Chaoyangbean {
            /**
             * brdId : 23854
             * dealPrice : 0
             * referencePrice : 70
             * showCount : 0
             * ct :
             * poiId : 75603
             * area : 朝阳区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 17.5影城
             * dis : 望京
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 30
             * lat : 39.9684
             * lng : 116.46204
             * nm : 17.5影城(比如世界店)
             * imax : 0
             * addr : 朝阳区京顺路111号比如世界购物中心1层（近太阳宫北街）
             * id : 48
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Haidianbean {
            /**
             * brdId : 23854
             * dealPrice : 0
             * referencePrice : 60
             * showCount : 0
             * ct :
             * poiId : 273950
             * area : 海淀区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 17.5影城
             * dis : 北太平庄
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 44
             * lat : 39.95334
             * lng : 116.36104
             * nm : 17.5影城(今典花园店)
             * imax : 0
             * addr : 海淀区文慧园路9号今典花园9号楼空间蒙太奇大厦1层
             * id : 154
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private float referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
                this.dealPrice = dealPrice;
            }

            public float getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(float referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Daxingbean {
            /**
             * brdId : 2020418
             * dealPrice : 0
             * referencePrice : 0
             * showCount : 0
             * ct :
             * poiId : 105355906
             * area : 大兴区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : CGV影城
             * dis :
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 23
             * lat : 39.790707
             * lng : 116.51294
             * nm : CGV星聚汇影城(亦庄店)
             * imax : 0
             * addr : 大兴区经济技术开发区荣京东街大族广场9号楼三层
             * id : 16152
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Dongchengbean {
            /**
             * brdId : 24071
             * dealPrice : 0
             * referencePrice : 70
             * showCount : 0
             * ct :
             * poiId : 94496
             * area : 东城区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : UME国际影城
             * dis : 安贞
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 39.5
             * lat : 39.966072
             * lng : 116.41096
             * nm : UME国际影城(安贞店)
             * imax : 0
             * addr : 东城区北三环安贞桥环球贸易中心E座
             * id : 99
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private double sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Fengtaibean {
            /**
             * brdId : 0
             * dealPrice : 0
             * referencePrice : 0
             * showCount : 0
             * ct :
             * poiId : 94444126
             * area : 丰台区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 其它
             * dis :
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 24
             * lat : 39.868313
             * lng : 116.375984
             * nm : DMG国际影城(悦秀店)
             * imax : 0
             * addr : 丰台区开阳路8号悦秀城6层
             * id : 15859
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Xichengbean {
            /**
             * brdId : 0
             * dealPrice : 0
             * referencePrice : 50
             * showCount : 0
             * ct :
             * poiId : 271434
             * area : 西城区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 其它
             * dis : 西直门
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 38
             * lat : 39.93531
             * lng : 116.35955
             * nm : 北京青年宫
             * imax : 0
             * addr : 西城区西直门南小街68号
             * id : 260
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Tongzhoubean {
            /**
             * brdId : 0
             * dealPrice : 0
             * referencePrice : 0
             * showCount : 0
             * ct :
             * poiId : 99968119
             * area : 通州区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 其它
             * dis :
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 22.9
             * lat : 39.919525
             * lng : 116.677376
             * nm : 北京东融国际影城(月亮河店)
             * imax : 0
             * addr : 通州区永顺镇芙蓉园513号楼
             * id : 15421
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private double sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Changpingbean {
            /**
             * brdId : 24472
             * dealPrice : 40
             * referencePrice : 100
             * showCount : 0
             * ct :
             * poiId : 3320660
             * area : 昌平区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 保利国际影城
             * dis : 回龙观
             * deal : 1
             * distance : 0
             * follow : 0
             * sellPrice : 39
             * lat : 40.066605
             * lng : 116.34672
             * nm : 保利国际影城(龙旗广场店)
             * imax : 0
             * addr : 昌平区黄平路19号院3号楼龙旗广场购物中心3层（地铁8号线育新站路北600米，近永辉超市）
             * id : 5502
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Fangshanbean {
            /**
             * brdId : 0
             * dealPrice : 0
             * referencePrice : 0
             * showCount : 0
             * ct :
             * poiId : 5677585
             * area : 房山区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 其它
             * dis :
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 23
             * lat : 39.72994
             * lng : 116.14175
             * nm : DMG影城(良乡店)
             * imax : 0
             * addr : 房山区拱辰南大街瑞城广场7F
             * id : 16058
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Shunyibean {
            /**
             * brdId : 2020418
             * dealPrice : 0
             * referencePrice : 0
             * showCount : 0
             * ct :
             * poiId : 6448554
             * area : 顺义区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : CGV影城
             * dis :
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 38
             * lat : 40.12897
             * lng : 116.65173
             * nm : CGV星聚汇影城(顺义店)
             * imax : 0
             * addr : 顺义区新顺南大街8号华联购物中心4层CGV星聚汇国际影城
             * id : 8111
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Mentougoubean {
            /**
             * brdId : 0
             * dealPrice : 0
             * referencePrice : 0
             * showCount : 0
             * ct :
             * poiId : 3260641
             * area : 门头沟区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 其它
             * dis : 门头沟
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 33
             * lat : 39.9425
             * lng : 116.10049
             * nm : 门头沟影剧院
             * imax : 0
             * addr : 门头沟区新桥大街12号
             * id : 182
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Shijingshanbean {
            /**
             * brdId : 24472
             * dealPrice : 0
             * referencePrice : 0
             * showCount : 0
             * ct :
             * poiId : 6596632
             * area : 石景山区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 保利国际影城
             * dis :
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 38
             * lat : 39.92295
             * lng : 116.17175
             * nm : 保利国际影城(苹果园店)
             * imax : 0
             * addr : 石景山区阜石路300号喜隆多三层
             * id : 10294
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class huairoubean {
            /**
             * brdId : 0
             * dealPrice : 0
             * referencePrice : 35
             * showCount : 0
             * ct :
             * poiId : 3260663
             * area : 怀柔区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 其它
             * dis : 怀柔
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 43
             * lat : 40.317955
             * lng : 116.62985
             * nm : 传奇瑞丽影城
             * imax : 0
             * addr : 怀柔区青春路15号四层
             * id : 55
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Pingubean {
            /**
             * brdId : 0
             * dealPrice : 27.5
             * referencePrice : 0
             * showCount : 0
             * ct :
             * poiId : 97314976
             * area : 平谷区
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 其它
             * dis :
             * deal : 1
             * distance : 0
             * follow : 0
             * sellPrice : 33
             * lat : 40.14356
             * lng : 117.093155
             * nm : 华联国际影城(平谷店)
             * imax : 0
             * addr : 平谷区迎宾路1号院22号楼五层F5-13
             * id : 15082
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private double dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Miyunbean {
            /**
             * brdId : 0
             * dealPrice : 0
             * referencePrice : 60
             * showCount : 0
             * ct :
             * poiId : 1436412
             * area : 密云县
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 其它
             * dis : 密云县
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 33
             * lat : 40.377117
             * lng : 116.84507
             * nm : 密云大剧院
             * imax : 0
             * addr : 密云县鼓楼西大街1号
             * id : 183
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class Yanqingbean {
            /**
             * brdId : 384262
             * dealPrice : 0
             * referencePrice : 40
             * showCount : 0
             * ct :
             * poiId : 1366944
             * area : 延庆县
             * sellmin : 0
             * sell : true
             * preferential : 0
             * brd : 大地影院
             * dis : 延庆
             * deal : 0
             * distance : 0
             * follow : 0
             * sellPrice : 43
             * lat : 40.461918
             * lng : 115.97629
             * nm : 大地影院(延庆金锣湾店)
             * imax : 0
             * addr : 延庆县妫水北街39号1幢H座首楼金锣湾商业中心沃尔玛旁
             * id : 13
             */

            @SerializedName("brdId")
            private int brdId;
            @SerializedName("dealPrice")
            private float dealPrice;
            @SerializedName("referencePrice")
            private int referencePrice;
            @SerializedName("showCount")
            private int showCount;
            @SerializedName("ct")
            private String ct;
            @SerializedName("poiId")
            private int poiId;
            @SerializedName("area")
            private String area;
            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("deal")
            private int deal;
            @SerializedName("distance")
            private int distance;
            @SerializedName("follow")
            private int follow;
            @SerializedName("sellPrice")
            private float sellPrice;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("nm")
            private String nm;
            @SerializedName("imax")
            private int imax;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public float getdealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
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

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
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

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
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

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
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