package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CardGradientBgData */
public final class CardGradientBgData implements Serializable {
    @AbstractC27891c(mo46611a = "dark_mode_bg_color")
    private String darkModeBgColor;
    @AbstractC27891c(mo46611a = "dark_mode_bg_max_index")
    private Integer darkModeItemSize;

    static {
        Covode.recordClassIndex(50427);
    }

    public final String getDarkModeBgColor() {
        return this.darkModeBgColor;
    }

    public final Integer getDarkModeItemSize() {
        return this.darkModeItemSize;
    }

    public final void setDarkModeBgColor(String str) {
        this.darkModeBgColor = str;
    }

    public final void setDarkModeItemSize(Integer num) {
        this.darkModeItemSize = num;
    }
}
