package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.RecordInteractExtra */
public class RecordInteractExtra {
    @AbstractC27891c(mo46611a = "clickable_open_url")
    private String clickableOpenUrl;
    @AbstractC27891c(mo46611a = "clickable_web_url")
    private String clickableWebUrl;
    @AbstractC27891c(mo46611a = "interaction_type")
    private int interactionType;
    @AbstractC27891c(mo46611a = "interaction_icon")
    private String popIcon;
    @AbstractC27891c(mo46611a = "interaction_text")
    private String popText;
    @AbstractC27891c(mo46611a = "interaction_url")
    private String schemeUrl;
    @AbstractC27891c(mo46611a = "sticker_id")
    private String stickerId;

    static {
        Covode.recordClassIndex(83793);
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

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getSchemeUrl() {
        return this.schemeUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public ExtraParams toExtraParams() {
        ExtraParams extraParams = new ExtraParams();
        extraParams.setInteractionIcon(this.popIcon);
        extraParams.setInteractionText(this.popText);
        extraParams.setInteractionType(this.interactionType);
        extraParams.setInteractionUrl(this.schemeUrl);
        extraParams.setClickableOpenUrl(this.clickableOpenUrl);
        extraParams.setClickableWebUrl(this.clickableWebUrl);
        return extraParams;
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

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setSchemeUrl(String str) {
        this.schemeUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void formatFromExtraParams(ExtraParams extraParams, String str) {
        if (extraParams != null) {
            this.stickerId = str;
            this.interactionType = extraParams.getInteractionType();
            this.popIcon = extraParams.getInteractionIcon();
            this.popText = extraParams.getInteractionText();
            this.schemeUrl = extraParams.getInteractionUrl();
            this.clickableOpenUrl = extraParams.getClickableOpenUrl();
            this.clickableWebUrl = extraParams.getClickableWebUrl();
        }
    }
}
