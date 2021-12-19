package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.BrandTab */
public class BrandTab implements Serializable {
    @AbstractC27891c(mo46611a = "industry_type")
    int industryType;
    @AbstractC27891c(mo46611a = "show_brand_tab")
    boolean showBrandTab;
    @AbstractC27891c(mo46611a = "title")
    String title;

    static {
        Covode.recordClassIndex(75160);
    }

    public int getIndustryType() {
        return this.industryType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowBrandTab() {
        return this.showBrandTab;
    }

    public void setIndustryType(int i) {
        this.industryType = i;
    }

    public void setShowBrandTab(boolean z) {
        this.showBrandTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
