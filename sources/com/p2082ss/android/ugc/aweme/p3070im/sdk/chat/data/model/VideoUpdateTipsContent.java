package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.VideoUpdateTipsContent */
public class VideoUpdateTipsContent extends BaseContent {
    @AbstractC27891c(mo46611a = "tip_aid")
    String aid;
    @AbstractC27891c(mo46611a = "tip_content")
    String content;
    @AbstractC27891c(mo46611a = "tip_cover")
    UrlModel cover;
    @AbstractC27891c(mo46611a = "is_photo")
    boolean isPhoto;
    @AbstractC27891c(mo46611a = "tip_title")
    String title;
    @AbstractC27891c(mo46611a = "tip_uid")
    String uid;

    static {
        Covode.recordClassIndex(63493);
    }

    public String getAid() {
        return this.aid;
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isPhoto() {
        return this.isPhoto;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setPhoto(boolean z) {
        this.isPhoto = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
