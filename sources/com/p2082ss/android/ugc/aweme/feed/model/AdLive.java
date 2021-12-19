package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AdLive */
public final class AdLive implements Serializable {
    @AbstractC27891c(mo46611a = "button_bg_color")
    private String buttonBgColor;
    @AbstractC27891c(mo46611a = "button_text")
    private String buttonText;

    static {
        Covode.recordClassIndex(58597);
    }

    public final String getButtonBgColor() {
        return this.buttonBgColor;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final void setButtonBgColor(String str) {
        this.buttonBgColor = str;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }
}
