package com.p2082ss.android.ugc.aweme.commerce;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38261y;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.a */
public class C37437a implements Serializable {
    @AbstractC27891c(mo46611a = "ad_id")
    public String adId;
    @AbstractC27891c(mo46611a = "ad_auth_status")
    public int ad_auth_status;
    @AbstractC27891c(mo46611a = "ad_source")
    public int ad_source;
    @AbstractC27891c(mo46611a = "advertiser_id")
    public String advId;
    @AbstractC27891c(mo46611a = "adv_promotable")
    public boolean adv_promotable;
    @AbstractC27891c(mo46611a = "auction_ad_invited")
    public boolean auction_ad_invited;
    @AbstractC27891c(mo46611a = "avoid_global_pendant")
    public boolean avoid_global_pendant;
    @AbstractC27891c(mo46611a = "biz_account")
    public C37491d bizAccountInfo;
    @AbstractC27891c(mo46611a = "card_infos")
    public CardStruct cardStruct;
    @AbstractC27891c(mo46611a = "creative_id")
    public String creativeId;
    @AbstractC27891c(mo46611a = "dark_post_source")
    public int darkPostSource;
    @AbstractC27891c(mo46611a = "dark_post_status")
    public int darkPostStatus;
    @AbstractC27891c(mo46611a = "douplus_toast")
    public C38261y douplus_toast;
    @AbstractC27891c(mo46611a = "feedback_submitted")
    public boolean hasUserSubmittedFeedback;
    @AbstractC27891c(mo46611a = "is_music_not_clickable")
    public boolean isMusicNotClickable;
    @AbstractC27891c(mo46611a = "is_personal_page_forbidden")
    public boolean isPersonalPageForbidden;
    @AbstractC27891c(mo46611a = "item_id")
    public String itemId;
    @AbstractC27891c(mo46611a = "last_view_time")
    public long lastViewTime;
    @AbstractC27891c(mo46611a = "mission_id")
    public long missionId;
    @AbstractC27891c(mo46611a = "mission_item_status")
    public int missionItemStatus;
    @AbstractC27891c(mo46611a = "prevent_delete")
    public boolean preventDelete;
    @AbstractC27891c(mo46611a = "prevent_friend_see")
    public boolean preventFriendSee;
    @AbstractC27891c(mo46611a = "prevent_privacy_reason")
    public String preventPrivacyReason;
    @AbstractC27891c(mo46611a = "prevent_self_see")
    public boolean preventSelfSee;
    @AbstractC27891c(mo46611a = "prevent_share")
    public boolean preventShare;
    @AbstractC27891c(mo46611a = "show_share_link")
    public boolean show_share_link;
    @AbstractC27891c(mo46611a = "study_id")
    public String studyId;
    @AbstractC27891c(mo46611a = "with_comment_filter_words")
    public boolean withCommentFilterWords;

    static {
        Covode.recordClassIndex(44822);
    }

    public String getAdId() {
        return this.adId;
    }

    public int getAdSource() {
        return this.ad_source;
    }

    public String getAdvId() {
        return this.advId;
    }

    public int getAuthStatus() {
        return this.ad_auth_status;
    }

    public C37491d getBizAccountInfo() {
        return this.bizAccountInfo;
    }

    public CardStruct getCardStruct() {
        return this.cardStruct;
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public int getDarkPostSource() {
        return this.darkPostSource;
    }

    public int getDarkPostStatus() {
        return this.darkPostStatus;
    }

    public C38261y getDouplusToast() {
        return this.douplus_toast;
    }

    public String getItemId() {
        return this.itemId;
    }

    public long getLastViewTime() {
        return this.lastViewTime;
    }

    public long getMissionId() {
        return this.missionId;
    }

    public int getMissionItemStatus() {
        return this.missionItemStatus;
    }

    public String getPreventPrivacyReason() {
        return this.preventPrivacyReason;
    }

    public String getStudyId() {
        return this.studyId;
    }

    public boolean isAdvPromotable() {
        return this.adv_promotable;
    }

    public boolean isAuctionAdInvited() {
        return this.auction_ad_invited;
    }

    public boolean isAvoidGlobalPendant() {
        return this.avoid_global_pendant;
    }

    public boolean isHasUserSubmittedFeedback() {
        return this.hasUserSubmittedFeedback;
    }

    public boolean isMusicNotClickable() {
        return this.isMusicNotClickable;
    }

    public boolean isPersonalPageForbidden() {
        return this.isPersonalPageForbidden;
    }

    public boolean isPreventDelete() {
        return this.preventDelete;
    }

    public boolean isPreventFriendSee() {
        return this.preventFriendSee;
    }

    public boolean isPreventSelfSee() {
        return this.preventSelfSee;
    }

    public boolean isPreventShare() {
        return this.preventShare;
    }

    public boolean isShowShareLink() {
        return this.show_share_link;
    }

    public boolean isWithCommentFilterWords() {
        return this.withCommentFilterWords;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setAdvId(String str) {
        this.advId = str;
    }

    public void setAdvPromotable(boolean z) {
        this.adv_promotable = z;
    }

    public void setCardStruct(CardStruct cardStruct2) {
        this.cardStruct = cardStruct2;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setDarkPostSource(int i) {
        this.darkPostSource = i;
    }

    public void setDarkPostStatus(int i) {
        this.darkPostStatus = i;
    }

    public void setHasUserSubmittedFeedback(boolean z) {
        this.hasUserSubmittedFeedback = z;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setLastViewTime(long j) {
        this.lastViewTime = j;
    }

    public void setMissionId(long j) {
        this.missionId = j;
    }

    public void setMissionItemStatus(int i) {
        this.missionItemStatus = i;
    }

    public void setMusicNotClickable(boolean z) {
        this.isMusicNotClickable = z;
    }

    public void setPersonalPageForbidden(boolean z) {
        this.isPersonalPageForbidden = z;
    }

    public void setPreventDelete(boolean z) {
        this.preventDelete = z;
    }

    public void setPreventFriendSee(boolean z) {
        this.preventFriendSee = z;
    }

    public void setPreventPrivacyReason(String str) {
        this.preventPrivacyReason = str;
    }

    public void setPreventSelfSee(boolean z) {
        this.preventSelfSee = z;
    }

    public void setPreventShare(boolean z) {
        this.preventShare = z;
    }

    public void setWithCommentFilterWords(boolean z) {
        this.withCommentFilterWords = z;
    }
}
