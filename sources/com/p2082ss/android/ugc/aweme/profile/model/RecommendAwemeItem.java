package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RecommendAwemeItem */
public class RecommendAwemeItem implements Serializable {
    @AbstractC27891c(mo46611a = "aweme_id")
    public String aid;
    @AbstractC27891c(mo46611a = "cover")
    public UrlModel cover;
    @AbstractC27891c(mo46611a = "dynamic_cover")
    public UrlModel dynamicCover;
    @AbstractC27891c(mo46611a = "media_type")
    public String mediaType;

    static {
        Covode.recordClassIndex(75202);
    }

    public String getAid() {
        return this.aid;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setMediaType(String str) {
        this.mediaType = str;
    }
}
