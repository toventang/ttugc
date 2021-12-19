package com.p2082ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks */
public final class CommerceSmartUITasks implements Serializable {
    @AbstractC27891c(mo46611a = "ad_cards")
    private int adCardDelay = -1;
    @AbstractC27891c(mo46611a = "learnmore_button_showtime")
    private int buttonShow = -1;
    @AbstractC27891c(mo46611a = "learnmore_color_delay")
    private int colorDelay = -1;

    static {
        Covode.recordClassIndex(58783);
    }

    public final int getAdCardDelay() {
        return this.adCardDelay;
    }

    public final int getButtonShow() {
        return this.buttonShow;
    }

    public final int getColorDelay() {
        return this.colorDelay;
    }

    public final void setAdCardDelay(int i) {
        this.adCardDelay = i;
    }

    public final void setButtonShow(int i) {
        this.buttonShow = i;
    }

    public final void setColorDelay(int i) {
        this.colorDelay = i;
    }
}
