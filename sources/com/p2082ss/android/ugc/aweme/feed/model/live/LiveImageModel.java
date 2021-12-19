package com.p2082ss.android.ugc.aweme.feed.model.live;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveImageModel */
public class LiveImageModel implements Serializable {
    @AbstractC27891c(mo46611a = "avg_color")
    public String avgColor;
    @AbstractC27891c(mo46611a = "height")
    private int height;
    @AbstractC27891c(mo46611a = "image_type")
    private int imageType;
    @AbstractC27891c(mo46611a = "open_web_url")
    private String schema;
    @AbstractC27891c(mo46611a = "uri")
    protected String uri;
    @AbstractC27891c(mo46611a = "url_list")
    protected List<String> urlList;
    @AbstractC27891c(mo46611a = "width")
    private int width;

    static {
        Covode.recordClassIndex(58801);
    }

    public String getAvgColor() {
        return this.avgColor;
    }

    public int getHeight() {
        return this.height;
    }

    public int getImageType() {
        return this.imageType;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.uri)) {
            return true;
        }
        List<String> list = this.urlList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return hash(this.avgColor, this.uri, this.urlList, Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public void setAvgColor(String str) {
        this.avgColor = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageType(int i) {
        this.imageType = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    private static int hash(Object... objArr) {
        int hashCode;
        if (objArr == null) {
            return 0;
        }
        int i = 1;
        for (Object obj : objArr) {
            int i2 = i * 31;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i = i2 + hashCode;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LiveImageModel liveImageModel = (LiveImageModel) obj;
            if (this.width != liveImageModel.width || this.height != liveImageModel.height || !equals(this.avgColor, liveImageModel.avgColor) || !equals(this.uri, liveImageModel.uri) || !equals(this.urlList, liveImageModel.urlList)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
