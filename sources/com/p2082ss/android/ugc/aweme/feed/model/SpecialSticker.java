package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.SpecialSticker */
public class SpecialSticker implements Serializable {
    @AbstractC27891c(mo46611a = "icon_url")
    public UrlModel iconUrl;
    @AbstractC27891c(mo46611a = "link")
    public String linkUrl;
    @AbstractC27891c(mo46611a = "open_url")
    public String openUrl;
    @AbstractC27891c(mo46611a = "sticker_id")
    public String stickerId;
    @AbstractC27891c(mo46611a = "sticker_type")
    public int stickerType;
    @AbstractC27891c(mo46611a = "title")
    public String title;

    static {
        Covode.recordClassIndex(58756);
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerType(int i) {
        this.stickerType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
