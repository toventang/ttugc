package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.model.CommerceUserInfo */
public class CommerceUserInfo implements Serializable {
    @AbstractC27891c(mo46611a = "account_promote_related")
    public int accountPromoteRelated;
    @AbstractC27891c(mo46611a = "ad_authorization")
    public boolean adAuthorization;
    @AbstractC27891c(mo46611a = "ad_experience_entry")
    public boolean adExperienceEntry;
    @AbstractC27891c(mo46611a = "ad_experience_text")
    public String adExperienceText;
    @AbstractC27891c(mo46611a = "ads_feedback_entry")
    public boolean adFeedbackEntry;
    @AbstractC27891c(mo46611a = "ad_influencer_type")
    public int adInfluencerType;
    @AbstractC27891c(mo46611a = "ad_revenue_rits")
    public List<Integer> adRevenueRits;
    @AbstractC27891c(mo46611a = "ad_revenue_sharing")
    public boolean adRevenueSharing;
    @AbstractC27891c(mo46611a = "clf_type")
    public int clfType;
    @AbstractC27891c(mo46611a = "has_ads_entry")
    public boolean hasAdEntry;
    @AbstractC27891c(mo46611a = "has_promote")
    public boolean hasPromote;
    @AbstractC27891c(mo46611a = "has_tcm_entry")
    public boolean hasTcmEntry;
    @AbstractC27891c(mo46611a = "is_ad_partner")
    public boolean isAdPartner;
    @AbstractC27891c(mo46611a = "is_auction_ad_influencer")
    public boolean isAuctionAdInfluencer;
    @AbstractC27891c(mo46611a = "link_user_info")
    public LinkUserInfoStruct linkUserInfo;
    @AbstractC27891c(mo46611a = "notification_config")
    public int notificationConfig;
    @AbstractC27891c(mo46611a = "promote_pay_type")
    public int promotePayType;
    @AbstractC27891c(mo46611a = "show_star_atlas_cooperation")
    public boolean showStarAtlasCooperation;
    @AbstractC27891c(mo46611a = "star_atlas")
    public int starAtlas;

    static {
        Covode.recordClassIndex(75163);
    }

    public String getAdExperienceText() {
        return this.adExperienceText;
    }

    public int getAdInfluencerType() {
        return this.adInfluencerType;
    }

    public List<Integer> getAdRevenueRits() {
        return this.adRevenueRits;
    }

    public int getClfType() {
        return this.clfType;
    }

    public LinkUserInfoStruct getLinkUserInfo() {
        return this.linkUserInfo;
    }

    public int getNotificationConfig() {
        return this.notificationConfig;
    }

    public int getPromotePayType() {
        return this.promotePayType;
    }

    public int getStarAtlas() {
        return this.starAtlas;
    }

    public boolean isAdPartner() {
        return this.isAdPartner;
    }

    public boolean isAdRevenueSharing() {
        return this.adRevenueSharing;
    }

    public boolean isAuctionAdInfluencer() {
        return this.isAuctionAdInfluencer;
    }

    public boolean isHasAdExperienceEntry() {
        return this.adExperienceEntry;
    }

    public boolean isHasAdFeedbackEntry() {
        return this.adFeedbackEntry;
    }

    public boolean isHasTcmEntry() {
        return this.hasTcmEntry;
    }

    public boolean isShowStarAtlasCooperation() {
        return this.showStarAtlasCooperation;
    }

    public void setAdExperienceText(String str) {
        this.adExperienceText = str;
    }

    public void setNotificationConfig(int i) {
        this.notificationConfig = i;
    }
}
