package com.p2082ss.android.ugc.aweme.commerce;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.f */
public class C37495f implements Serializable {
    @AbstractC27891c(mo46611a = "challenge_list")
    public List<Challenge> challengeList;
    @AbstractC27891c(mo46611a = "head_image_url")
    public UrlModel headImageUrl;
    @AbstractC27891c(mo46611a = "offline_info_list")
    public List<C37499j> offlineInfoList;
    @AbstractC27891c(mo46611a = "quick_shop_name")
    public String quickShopName;
    @AbstractC27891c(mo46611a = "quick_shop_url")
    public String quickShopUrl;
    @AbstractC27891c(mo46611a = "site_id")
    public String siteId;

    static {
        Covode.recordClassIndex(44882);
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public List<C37499j> getOfflineInfoList() {
        return this.offlineInfoList;
    }

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public String getSiteId() {
        return this.siteId;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setOfflineInfoList(List<C37499j> list) {
        this.offlineInfoList = list;
    }
}
