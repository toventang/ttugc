package com.p2082ss.android.ugc.aweme.base.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.model.UrlModel */
public class UrlModel implements Serializable {
    @AbstractC27891c(mo46611a = "file_hash")
    public String fileHash;
    @AbstractC27891c(mo46611a = "height")
    public int height;
    @AbstractC27891c(mo46611a = "data_size")
    public long size;
    @AbstractC27891c(mo46611a = "uri")
    public String uri;
    @AbstractC27891c(mo46611a = "url_key")
    public String urlKey;
    @AbstractC27891c(mo46611a = "url_list")
    public List<String> urlList;
    @AbstractC27891c(mo46611a = "width")
    public int width;

    static {
        Covode.recordClassIndex(41569);
    }

    public String getFileHash() {
        return this.fileHash;
    }

    public int getHeight() {
        return this.height;
    }

    public long getSize() {
        return this.size;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUrlKey() {
        return this.urlKey;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str;
        int i;
        if (TextUtils.isEmpty(this.urlKey)) {
            str = this.uri;
        } else {
            str = this.urlKey;
        }
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        List<String> list = this.urlList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }

    public void setFileHash(String str) {
        this.fileHash = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlKey(String str) {
        this.urlKey = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        String str = this.uri;
        if (str == null ? urlModel.uri != null : !str.equals(urlModel.uri)) {
            return false;
        }
        String str2 = this.urlKey;
        if (str2 == null ? urlModel.urlKey != null : !str2.equals(urlModel.urlKey)) {
            return false;
        }
        List<String> list = this.urlList;
        List<String> list2 = urlModel.urlList;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }
}
