package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.QuickShopInfo */
public class QuickShopInfo implements Serializable {
    @AbstractC27891c(mo46611a = "quick_shop_name")
    public String quickShopName;
    @AbstractC27891c(mo46611a = "quick_shop_url")
    public String quickShopUrl;
    @AbstractC27891c(mo46611a = "second_floor_info")
    public QuickShopSecondFloorInfo secondFloorInfo;
    @AbstractC27891c(mo46611a = "with_text_entry")
    public boolean withTextEntry;

    static {
        Covode.recordClassIndex(75200);
    }

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public QuickShopSecondFloorInfo getSecondFloorInfo() {
        return this.secondFloorInfo;
    }

    public boolean isWithTextEntry() {
        return this.withTextEntry;
    }

    public void setQuickShopName(String str) {
        this.quickShopName = str;
    }

    public void setQuickShopUrl(String str) {
        this.quickShopUrl = str;
    }

    public void setSecondFloorInfo(QuickShopSecondFloorInfo quickShopSecondFloorInfo) {
        this.secondFloorInfo = quickShopSecondFloorInfo;
    }

    public void setWithTextEntry(boolean z) {
        this.withTextEntry = z;
    }
}
