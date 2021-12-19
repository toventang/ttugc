package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.NoticePushMessage */
public final class NoticePushMessage implements Serializable {
    @AbstractC27891c(mo46611a = "content")
    private String content = "";
    @AbstractC27891c(mo46611a = "from_sec_uid")
    private String fromSecUid = "";
    @AbstractC27891c(mo46611a = "from_uid")
    private String fromUid = "";
    @AbstractC27891c(mo46611a = "image_url")
    private String imageUrl = "";
    @AbstractC27891c(mo46611a = "inapp_push_type")
    private String inAppPushType = "";
    @AbstractC27891c(mo46611a = "item_id")
    private String itemId = "";
    @AbstractC27891c(mo46611a = "open_url")
    private String openUrl = "";
    @AbstractC27891c(mo46611a = "push_type")
    private String pushType = "";
    @AbstractC27891c(mo46611a = "title")
    private String title = "";

    static {
        Covode.recordClassIndex(66057);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getFromSecUid() {
        return this.fromSecUid;
    }

    public final String getFromUid() {
        return this.fromUid;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInAppPushType() {
        return this.inAppPushType;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getPushType() {
        return this.pushType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setFromSecUid(String str) {
        this.fromSecUid = str;
    }

    public final void setFromUid(String str) {
        this.fromUid = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setInAppPushType(String str) {
        this.inAppPushType = str;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setPushType(String str) {
        this.pushType = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
