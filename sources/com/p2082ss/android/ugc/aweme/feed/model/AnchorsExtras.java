package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorsExtras */
public final class AnchorsExtras implements Serializable {
    @AbstractC27891c(mo46611a = "ad_label")
    private AdLabel adLabel;
    @AbstractC27891c(mo46611a = "tips")
    private Tips tips;

    static {
        Covode.recordClassIndex(58609);
    }

    public final AdLabel getAdLabel() {
        return this.adLabel;
    }

    public final Tips getTips() {
        return this.tips;
    }

    public final String toString() {
        return "AnchorsExtras(tips=" + this.tips + ", adLabel=" + this.adLabel + ')';
    }

    public final void setAdLabel(AdLabel adLabel2) {
        this.adLabel = adLabel2;
    }

    public final void setTips(Tips tips2) {
        this.tips = tips2;
    }
}
