package com.xpf.cateyesmovies.domain;

import java.util.List;

/**
 * Created by xpf on 2016/11/29 :)
 * Wechat:18091383534
 * Function:欢迎页面图片的Bean类
 */

public class PicBean {

    /**
     * canSkip : true
     * duration : 2500
     * end : 1480435199
     * id : 958
     * isShowLogo : 0
     * pic : http://p0.meituan.net/movie/a0dd83495941a47c1cd34d2972e2d0df59585.jpg
     * screenType : 0
     * showLogo : false
     * start : 1480348800
     * times : 5
     * title : 11.29
     * type : 1
     * url :
     */

    private List<PostersBean> posters;

    public List<PostersBean> getPosters() {
        return posters;
    }

    public void setPosters(List<PostersBean> posters) {
        this.posters = posters;
    }

    public static class PostersBean {
        private boolean canSkip;
        private int duration;
        private int end;
        private int id;
        private int isShowLogo;
        private String pic;
        private int screenType;
        private boolean showLogo;
        private int start;
        private int times;
        private String title;
        private int type;
        private String url;

        public boolean isCanSkip() {
            return canSkip;
        }

        public void setCanSkip(boolean canSkip) {
            this.canSkip = canSkip;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIsShowLogo() {
            return isShowLogo;
        }

        public void setIsShowLogo(int isShowLogo) {
            this.isShowLogo = isShowLogo;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public int getScreenType() {
            return screenType;
        }

        public void setScreenType(int screenType) {
            this.screenType = screenType;
        }

        public boolean isShowLogo() {
            return showLogo;
        }

        public void setShowLogo(boolean showLogo) {
            this.showLogo = showLogo;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getTimes() {
            return times;
        }

        public void setTimes(int times) {
            this.times = times;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
