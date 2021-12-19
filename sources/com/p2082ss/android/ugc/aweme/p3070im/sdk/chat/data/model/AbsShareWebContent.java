package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.AbsShareWebContent */
public abstract class AbsShareWebContent extends BaseContent {
    @AbstractC27891c(mo46611a = "desc")
    protected String desc;
    @AbstractC27891c(mo46611a = "cover_url")
    protected String image;
    @AbstractC27891c(mo46611a = "push_detail")
    protected String pushDetail;
    @AbstractC27891c(mo46611a = "title")
    protected String title;
    @AbstractC27891c(mo46611a = "link_url")
    protected String url;

    static {
        Covode.recordClassIndex(63415);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public abstract String getMsgHint();

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public abstract String wrapMsgHint(boolean z, boolean z2, String str);

    public String getDesc() {
        return this.desc;
    }

    public String getImage() {
        return this.image;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
