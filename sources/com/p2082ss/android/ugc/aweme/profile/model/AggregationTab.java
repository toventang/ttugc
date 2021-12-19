package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.AggregationTab */
public class AggregationTab implements Serializable {
    @AbstractC27891c(mo46611a = "show_tab")
    boolean showTab;
    @AbstractC27891c(mo46611a = "title")
    String title;

    static {
        Covode.recordClassIndex(75151);
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowTab() {
        return this.showTab;
    }

    public void setShowTab(boolean z) {
        this.showTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
