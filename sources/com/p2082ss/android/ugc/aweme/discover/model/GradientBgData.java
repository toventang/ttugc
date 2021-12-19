package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.GradientBgData */
public final class GradientBgData implements Serializable {
    @AbstractC27891c(mo46611a = "center_color")
    private String centerColor;
    @AbstractC27891c(mo46611a = "screens")
    private int screens;
    @AbstractC27891c(mo46611a = "start_color")
    private String startColor;

    static {
        Covode.recordClassIndex(50454);
    }

    public final String getCenterColor() {
        return this.centerColor;
    }

    public final int getScreens() {
        return this.screens;
    }

    public final String getStartColor() {
        return this.startColor;
    }

    public final void setCenterColor(String str) {
        this.centerColor = str;
    }

    public final void setScreens(int i) {
        this.screens = i;
    }

    public final void setStartColor(String str) {
        this.startColor = str;
    }
}
