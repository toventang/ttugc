package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1097d.C15418q;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Movie */
public final class Movie implements Serializable {
    @AbstractC27891c(mo46611a = "challenge_id")
    private String challengeId;
    @AbstractC27891c(mo46611a = "cid")
    private String cid;
    @AbstractC27891c(mo46611a = "dtime")
    private String dtime;
    @AbstractC27891c(mo46611a = "episodes")
    private int episodes;
    @AbstractC27891c(mo46611a = "img")
    private String img;
    @AbstractC27891c(mo46611a = "is_medium_anchor")
    private Boolean isMediumAnchor;
    private boolean isNewStyleCard;
    @AbstractC27891c(mo46611a = "is_collect")
    private boolean is_collect;
    @AbstractC27891c(mo46611a = "light_app_tickets_url")
    private String light_app_tickets_url;
    @AbstractC27891c(mo46611a = "light_app_url")
    private String light_app_url;
    @AbstractC27891c(mo46611a = C15418q.f37639a)
    private String loc;
    @AbstractC27891c(mo46611a = "maoyan_score")
    private String maoyan_score;
    @AbstractC27891c(mo46611a = "maoyan_score_url")
    private String maoyan_score_url;
    @AbstractC27891c(mo46611a = "medium_type")
    private int medium_type;
    @AbstractC27891c(mo46611a = "medium_ui_style")
    private int medium_ui_style = -1;
    @AbstractC27891c(mo46611a = "rank")
    private String rank;
    @AbstractC27891c(mo46611a = "rate_text")
    private String rateText;
    @AbstractC27891c(mo46611a = "schema")
    private String schema;
    @AbstractC27891c(mo46611a = "showurl")
    private String showurl;
    @AbstractC27891c(mo46611a = "stat")
    private Integer stat;
    @AbstractC27891c(mo46611a = "stat_text")
    private String statText;
    @AbstractC27891c(mo46611a = "title")
    private String title;
    @AbstractC27891c(mo46611a = "tmaid")
    private String tmaid;
    @AbstractC27891c(mo46611a = StringSet.type)
    private String type;
    @AbstractC27891c(mo46611a = "url")
    private String url;
    @AbstractC27891c(mo46611a = "wish")
    private Integer wish;

    static {
        Covode.recordClassIndex(50468);
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getDtime() {
        return this.dtime;
    }

    public final int getEpisodes() {
        return this.episodes;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getLight_app_tickets_url() {
        return this.light_app_tickets_url;
    }

    public final String getLight_app_url() {
        return this.light_app_url;
    }

    public final String getLoc() {
        return this.loc;
    }

    public final String getMaoyan_score() {
        return this.maoyan_score;
    }

    public final String getMaoyan_score_url() {
        return this.maoyan_score_url;
    }

    public final int getMedium_type() {
        return this.medium_type;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getRateText() {
        return this.rateText;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getShowurl() {
        return this.showurl;
    }

    public final Integer getStat() {
        return this.stat;
    }

    public final String getStatText() {
        return this.statText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTmaid() {
        return this.tmaid;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWish() {
        return this.wish;
    }

    public final Boolean isMediumAnchor() {
        return this.isMediumAnchor;
    }

    public final boolean isNewStyleCard() {
        return this.isNewStyleCard;
    }

    public final boolean is_collect() {
        return this.is_collect;
    }

    public final int getMovieRank() {
        String str = this.rank;
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final boolean isMovie() {
        if (this.medium_type == 3) {
            return true;
        }
        return false;
    }

    public final float getMaoyanScore() {
        String str = this.maoyan_score;
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str) / 2.0f;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public final int getMedium_ui_style() {
        int i = this.medium_ui_style;
        if (i != -1) {
            return i;
        }
        int i2 = this.medium_type;
        if (i2 == 1 || i2 == 9) {
            return 1;
        }
        if (i2 == 4 || i2 == 8) {
            return 2;
        }
        return 0;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setDtime(String str) {
        this.dtime = str;
    }

    public final void setEpisodes(int i) {
        this.episodes = i;
    }

    public final void setImg(String str) {
        this.img = str;
    }

    public final void setLight_app_tickets_url(String str) {
        this.light_app_tickets_url = str;
    }

    public final void setLight_app_url(String str) {
        this.light_app_url = str;
    }

    public final void setLoc(String str) {
        this.loc = str;
    }

    public final void setMaoyan_score(String str) {
        this.maoyan_score = str;
    }

    public final void setMaoyan_score_url(String str) {
        this.maoyan_score_url = str;
    }

    public final void setMediumAnchor(Boolean bool) {
        this.isMediumAnchor = bool;
    }

    public final void setMedium_type(int i) {
        this.medium_type = i;
    }

    public final void setMedium_ui_style(int i) {
        this.medium_ui_style = i;
    }

    public final void setNewStyleCard(boolean z) {
        this.isNewStyleCard = z;
    }

    public final void setRank(String str) {
        this.rank = str;
    }

    public final void setRateText(String str) {
        this.rateText = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setShowurl(String str) {
        this.showurl = str;
    }

    public final void setStat(Integer num) {
        this.stat = num;
    }

    public final void setStatText(String str) {
        this.statText = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTmaid(String str) {
        this.tmaid = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setWish(Integer num) {
        this.wish = num;
    }

    public final void set_collect(boolean z) {
        this.is_collect = z;
    }
}
