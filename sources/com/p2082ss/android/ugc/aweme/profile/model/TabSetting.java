package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.TabSetting */
public class TabSetting implements Serializable {
    @AbstractC27891c(mo46611a = "aggregation_tab")
    AggregationTab aggregationTab;
    @AbstractC27891c(mo46611a = "brand_tab")
    BrandTab brandTab;
    @AbstractC27891c(mo46611a = "enterprise_tab")
    EnterpriseTab enterpriseTab;
    @AbstractC27891c(mo46611a = "hide_like_tab")
    boolean hideLikeTab;
    @AbstractC27891c(mo46611a = "private_tab")
    PrivateTab privateTab;
    @AbstractC27891c(mo46611a = "shop_tab")
    public ShopTab shopTab;

    static {
        Covode.recordClassIndex(75211);
    }

    public AggregationTab getAggregationTab() {
        return this.aggregationTab;
    }

    public BrandTab getBrandTab() {
        return this.brandTab;
    }

    public EnterpriseTab getEnterpriseTab() {
        return this.enterpriseTab;
    }

    public PrivateTab getPrivateTab() {
        return this.privateTab;
    }

    public boolean isHideLikeTab() {
        return this.hideLikeTab;
    }

    public void setAggregationTab(AggregationTab aggregationTab2) {
        this.aggregationTab = aggregationTab2;
    }

    public void setBrandTab(BrandTab brandTab2) {
        this.brandTab = brandTab2;
    }

    public void setEnterpriseTab(EnterpriseTab enterpriseTab2) {
        this.enterpriseTab = enterpriseTab2;
    }

    public void setHideLikeTab(boolean z) {
        this.hideLikeTab = z;
    }
}
