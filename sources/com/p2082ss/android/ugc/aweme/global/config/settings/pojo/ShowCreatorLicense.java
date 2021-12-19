package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShowCreatorLicense */
public class ShowCreatorLicense {
    @AbstractC27891c(mo46611a = "click_type")
    private int clickType;
    @AbstractC27891c(mo46611a = "popup_content")
    private String popupContent;
    @AbstractC27891c(mo46611a = "popup_interval")
    private int popupInterval;
    @AbstractC27891c(mo46611a = "popup_linkText")
    private String popupLinktext;
    @AbstractC27891c(mo46611a = "popup_msg")
    private String popupMsg;
    @AbstractC27891c(mo46611a = "popup_times_limit")
    private int popupTimesLimit;
    @AbstractC27891c(mo46611a = "popup_title")
    private String popupTitle;
    @AbstractC27891c(mo46611a = "popup_url")
    private String popupUrl;
    @AbstractC27891c(mo46611a = "show")
    private int show;

    static {
        Covode.recordClassIndex(62395);
    }

    public int getClickType() {
        return this.clickType;
    }

    public String getPopupContent() {
        return this.popupContent;
    }

    public int getPopupInterval() {
        return this.popupInterval;
    }

    public String getPopupLinktext() {
        return this.popupLinktext;
    }

    public String getPopupMsg() {
        return this.popupMsg;
    }

    public int getPopupTimesLimit() {
        return this.popupTimesLimit;
    }

    public String getPopupTitle() {
        return this.popupTitle;
    }

    public String getPopupUrl() {
        return this.popupUrl;
    }

    public int getShow() {
        return this.show;
    }
}
