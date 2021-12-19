package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1780c.C23697c;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData */
public class BusinessExtraData {
    @AbstractC27891c(mo46611a = "clickable_open_url")
    private String clickableOpenUrl;
    @AbstractC27891c(mo46611a = "clickable_web_url")
    private String clickableWebUrl;
    @AbstractC27891c(mo46611a = "interaction_type")
    private int interactionType;
    @AbstractC27891c(mo46611a = "interaction_url")
    private String interactionUrl;
    @AbstractC27891c(mo46611a = "interaction_icon")
    private String popIcon;
    @AbstractC27891c(mo46611a = "interaction_text")
    private String popText;
    @AbstractC27891c(mo46611a = "sticker_id")
    private String stickerId;

    static {
        Covode.recordClassIndex(85596);
    }

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public String getSchemaUrlOpenFirst() {
        if (!C23697c.m44781a(this.clickableOpenUrl)) {
            return this.clickableOpenUrl;
        }
        if (!C23697c.m44781a(this.clickableWebUrl)) {
            return this.clickableWebUrl;
        }
        return this.interactionUrl;
    }

    public String getSchemaUrlWebFirst() {
        if (!C23697c.m44781a(this.clickableWebUrl)) {
            return this.clickableWebUrl;
        }
        if (!C23697c.m44781a(this.clickableOpenUrl)) {
            return this.clickableOpenUrl;
        }
        return this.interactionUrl;
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }
}
