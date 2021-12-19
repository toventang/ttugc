package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AdLabel */
public final class AdLabel implements Serializable {
    @AbstractC27891c(mo46611a = "ad_label_name")
    private String adLabelName;
    @AbstractC27891c(mo46611a = "ad_label_position")
    private Integer adLabelPosition;

    static {
        Covode.recordClassIndex(58596);
    }

    public final String getAdLabelName() {
        return this.adLabelName;
    }

    public final Integer getAdLabelPosition() {
        return this.adLabelPosition;
    }

    public final String toString() {
        return "AdLabel(adLabelName=" + this.adLabelName + ", adLabelPosition=" + this.adLabelPosition + ')';
    }

    public final void setAdLabelName(String str) {
        this.adLabelName = str;
    }

    public final void setAdLabelPosition(Integer num) {
        this.adLabelPosition = num;
    }
}
