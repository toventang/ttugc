package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Banner */
public class Banner implements AbstractC33623d, Serializable {
    private static final long serialVersionUID = 1;
    @AbstractC27890b(mo46609a = StringJsonAdapterFactory.class)
    @AbstractC27891c(mo46611a = "ad_data")
    BannerAdData adData;
    @AbstractC27891c(mo46611a = "banner_url")
    UrlModel bannerUrl;
    @AbstractC27891c(mo46611a = "bid")
    String bid;
    @AbstractC27891c(mo46611a = "height")
    int height;
    private String requestId;
    @AbstractC27891c(mo46611a = "schema")
    String schema;
    @AbstractC27891c(mo46611a = "title")
    String title;
    @AbstractC27891c(mo46611a = "width")
    int width;

    static {
        Covode.recordClassIndex(50423);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.Banner$BannerAdData */
    public static class BannerAdData implements Serializable {
        @AbstractC27891c(mo46611a = "ad_label")
        AdLabel adLabel;
        @AbstractC27891c(mo46611a = "click_track_url_list")
        List<String> clickTrackUrlList;
        @AbstractC27891c(mo46611a = "creative_id")
        long creativeId;
        @AbstractC27891c(mo46611a = "is_ad")
        boolean isAd = true;
        @AbstractC27891c(mo46611a = "log_extra")
        String logExtra;
        @AbstractC27891c(mo46611a = "package_name")
        String packageName;
        @AbstractC27891c(mo46611a = "track_url_list")
        List<String> trackUrlList;
        @AbstractC27891c(mo46611a = StringSet.type)
        String type;

        static {
            Covode.recordClassIndex(50424);
        }

        public AdLabel getAdLabel() {
            return this.adLabel;
        }
    }

    public BannerAdData getAdData() {
        return this.adData;
    }

    public UrlModel getBannerUrl() {
        return this.bannerUrl;
    }

    public String getBid() {
        return this.bid;
    }

    public int getHeight() {
        return this.height;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public int getWidth() {
        return this.width;
    }

    public List<String> getClickTrackUrlList() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.clickTrackUrlList;
    }

    public long getCreativeId() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return 0;
        }
        return bannerAdData.creativeId;
    }

    public String getLogExtra() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.logExtra;
    }

    public String getPackageName() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.packageName;
    }

    public List<String> getTrackUrlList() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.trackUrlList;
    }

    public String getType() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.type;
    }

    public boolean isAd() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null || !bannerAdData.isAd) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.bid;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.title;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        UrlModel urlModel = this.bannerUrl;
        if (urlModel != null) {
            i3 = urlModel.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (((((i6 + i3) * 31) + this.height) * 31) + this.width) * 31;
        String str3 = this.schema;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i7 + i4;
    }

    public void setBannerUrl(UrlModel urlModel) {
        this.bannerUrl = urlModel;
    }

    public void setBid(String str) {
        this.bid = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Banner banner = (Banner) obj;
            if (this.height != banner.height || this.width != banner.width) {
                return false;
            }
            String str = this.bid;
            if (str == null ? banner.bid != null : !str.equals(banner.bid)) {
                return false;
            }
            String str2 = this.title;
            if (str2 == null ? banner.title != null : !str2.equals(banner.title)) {
                return false;
            }
            UrlModel urlModel = this.bannerUrl;
            if (urlModel == null ? banner.bannerUrl != null : !urlModel.equals(banner.bannerUrl)) {
                return false;
            }
            String str3 = this.schema;
            String str4 = banner.schema;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }
}
