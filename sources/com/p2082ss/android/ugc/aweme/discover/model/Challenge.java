package com.p2082ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34486b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.C67361d;
import com.p2082ss.android.ugc.aweme.utils.C80365dx;
import com.p2082ss.android.ugc.aweme.utils.C80502gk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Challenge */
public class Challenge extends AbstractC34479a implements Serializable {
    @AbstractC27891c(mo46611a = "activity_type")
    public int activityType;
    @AbstractC27891c(mo46611a = "allow_upload_cover")
    public int allowUploadCover;
    @AbstractC27891c(mo46611a = "cha_attrs")
    public List<String> attrs;
    @AbstractC27891c(mo46611a = "author")
    public User author;
    @AbstractC27891c(mo46611a = "background_image_url")
    public UrlModel backgroundImageUrl;
    @AbstractC27891c(mo46611a = "announcement_info")
    public ChallengeAnnouncement challengeAnnouncement;
    @AbstractC27891c(mo46611a = "cover_photo")
    public String challengeBgUrl;
    @AbstractC27891c(mo46611a = "challenge_billboard")
    public ChallengeBillboard challengeBillboard;
    @AbstractC27891c(mo46611a = "disclaimer")
    public ChallengeDisclaimer challengeDisclaimer;
    @AbstractC27891c(mo46611a = "cha_name")
    public String challengeName;
    @AbstractC27891c(mo46611a = "hashtag_profile")
    public String challengeProfileUrl;
    @AbstractC27890b(mo46609a = C80365dx.class)
    @AbstractC27891c(mo46611a = "sticker_detail")
    public String challengeStickerDetail;
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "cid")
    public String cid;
    @AbstractC27891c(mo46611a = "collect_stat")
    public int collectStatus;
    @AbstractC27891c(mo46611a = "banner_list")
    public List<CommerceChallengeBanner> commerceChallengeBannerList;
    @AbstractC27891c(mo46611a = "commerce_sub_type")
    public int commerceSubType = 0;
    @AbstractC27891c(mo46611a = "connect_music")
    public List<Music> connectMusics;
    @AbstractC27891c(mo46611a = "content_type")
    public int contentType;
    @AbstractC27891c(mo46611a = "cover_item")
    public UrlModel coverItem;
    @AbstractC27890b(mo46609a = C80502gk.class)
    @AbstractC27891c(mo46611a = "desc")
    public String desc;
    @AbstractC27891c(mo46611a = "dynamic_list")
    public List<C42345d> dynamicPatchList;
    @AbstractC27891c(mo46611a = "end_color")
    public String endColor;
    @AbstractC27891c(mo46611a = "extra_attr")
    public ChallengeExtraAttrStruct extraAttrStruct;
    @AbstractC27891c(mo46611a = "mission_module")
    public HTCMissionModule htcMissionModule;
    @AbstractC27891c(mo46611a = "inquiry")
    public InquiryStruct inquiryStruct;
    @AbstractC27891c(mo46611a = "is_challenge")
    public int isChallenge;
    @AbstractC27891c(mo46611a = "is_commerce")
    public boolean isCommerceAndValid;
    @AbstractC27891c(mo46611a = "is_hot_search")
    public int isHotSearch;
    @AbstractC27891c(mo46611a = "is_strong_music")
    public int isStrongMusic;
    @AbstractC27891c(mo46611a = "link_action")
    public String linkAction;
    @AbstractC27891c(mo46611a = "link_text")
    public String linkText;
    @AbstractC27891c(mo46611a = "link_title")
    public String linkTitle;
    @AbstractC27891c(mo46611a = "link_type")
    public int linkType;
    @AbstractC27891c(mo46611a = "background_gradient")
    public BackGroundGradient mBackGroundGradient;
    @AbstractC27891c(mo46611a = "search_highlight")
    public List<C67361d> mHighlightInfoList;
    @AbstractC27891c(mo46611a = "search_cha_name")
    public String mSearchChaName;
    @AbstractC27891c(mo46611a = "is_status")
    public int mStatus;
    @AbstractC27891c(mo46611a = "related_media_source")
    public RelatedMediaSourceStruct mediaSource;
    @AbstractC27891c(mo46611a = "module_type")
    public int moduleType;
    @AbstractC27891c(mo46611a = "mv_id")
    public String mvId;
    @AbstractC27891c(mo46611a = "label_origin_author")
    public String originAuthor;
    @AbstractC27891c(mo46611a = "is_pgcshow")
    public boolean pgcshow;
    @AbstractC27891c(mo46611a = "profile_tag")
    public String profileTagUrl;
    @AbstractC27891c(mo46611a = "related_challenges")
    public List<Challenge> relatedChallenges = new ArrayList();
    public String requestId;
    @AbstractC27891c(mo46611a = "rule_detail_desc")
    public String ruleDetailDesc;
    @AbstractC27891c(mo46611a = "rule_detail_url")
    public String ruleDetailUrl;
    @AbstractC27891c(mo46611a = "schema")
    public String schema;
    @AbstractC27891c(mo46611a = "share_info")
    public ShareInfo shareInfo;
    @AbstractC27891c(mo46611a = "show_items")
    public List<ShowItemsStruct> showItems;
    @AbstractC27891c(mo46611a = "sponsor_ad_label")
    public String sponsorAdLabel;
    @AbstractC27891c(mo46611a = "sponsor_label_text")
    public String sponsorLabelText;
    @AbstractC27891c(mo46611a = "start_color")
    public String starColor;
    @AbstractC27891c(mo46611a = "sticker_id")
    public String stickerId;
    @AbstractC27891c(mo46611a = "sub_type")
    public int subType;
    @AbstractC27891c(mo46611a = "tag")
    public int tag;
    @AbstractC27891c(mo46611a = "button")
    public ChallengeTransform transfrom;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;
    @AbstractC27891c(mo46611a = "user_count")
    public int userCount;
    @AbstractC27891c(mo46611a = "view_count")
    public long viewCount = -1;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.Challenge$ChallengeSubType */
    public interface ChallengeSubType {
        static {
            Covode.recordClassIndex(50431);
        }
    }

    static {
        Covode.recordClassIndex(50430);
    }

    public int getActivityType() {
        return this.activityType;
    }

    public List<String> getAttrs() {
        return this.attrs;
    }

    public User getAuthor() {
        return this.author;
    }

    public BackGroundGradient getBackGroundGradient() {
        return this.mBackGroundGradient;
    }

    public UrlModel getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public ChallengeAnnouncement getChallengeAnnouncement() {
        return this.challengeAnnouncement;
    }

    public String getChallengeBgUrl() {
        return this.challengeBgUrl;
    }

    public ChallengeDisclaimer getChallengeDisclaimer() {
        return this.challengeDisclaimer;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getChallengeProfileUrl() {
        return this.challengeProfileUrl;
    }

    public String getChallengeStickerDetail() {
        return this.challengeStickerDetail;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public List<Music> getConnectMusics() {
        return this.connectMusics;
    }

    public int getContentType() {
        return this.contentType;
    }

    public UrlModel getCoverItem() {
        return this.coverItem;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<C42345d> getDynamicPatchList() {
        return this.dynamicPatchList;
    }

    public String getEndColor() {
        return this.endColor;
    }

    public List<C67361d> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public HTCMissionModule getHtcMissionModule() {
        return this.htcMissionModule;
    }

    public String getLinkAction() {
        return this.linkAction;
    }

    public String getLinkText() {
        return this.linkText;
    }

    public String getLinkTitle() {
        return this.linkTitle;
    }

    public RelatedMediaSourceStruct getMediaSource() {
        return this.mediaSource;
    }

    public int getModuleType() {
        return this.moduleType;
    }

    public String getMvId() {
        return this.mvId;
    }

    public String getProfileTagUrl() {
        return this.profileTagUrl;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getRuleDetailDesc() {
        return this.ruleDetailDesc;
    }

    public String getRuleDetailUrl() {
        return this.ruleDetailUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSearchChaName() {
        return this.mSearchChaName;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getSponsorAdLabel() {
        return this.sponsorAdLabel;
    }

    public String getSponsorLabelText() {
        return this.sponsorLabelText;
    }

    public String getStarColor() {
        return this.starColor;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getTag() {
        return this.tag;
    }

    public ChallengeTransform getTransfrom() {
        return this.transfrom;
    }

    public int getType() {
        return this.type;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public boolean isCommerceAndValid() {
        return this.isCommerceAndValid;
    }

    public boolean isPgcshow() {
        return this.pgcshow;
    }

    public boolean allowUploadCover() {
        if (this.allowUploadCover == 1) {
            return true;
        }
        return false;
    }

    public boolean isChallenge() {
        if (this.isChallenge == 1) {
            return true;
        }
        return false;
    }

    public boolean isCommerce() {
        if (this.subType == 1) {
            return true;
        }
        return false;
    }

    public boolean isStrongMusic() {
        if (this.isStrongMusic == 1) {
            return true;
        }
        return false;
    }

    public boolean isTrending() {
        if (this.isHotSearch == 1) {
            return true;
        }
        return false;
    }

    public boolean isVsChallenge() {
        if (this.activityType == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isLinkActionAsOpenUrl() {
        if (this.linkType == 7) {
            return true;
        }
        return false;
    }

    public long getDisplayCount() {
        long viewCount2 = getViewCount();
        if (viewCount2 >= 0) {
            return viewCount2;
        }
        return (long) getUserCount();
    }

    public void setActivityType(int i) {
        this.activityType = i;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setBackGroundGradient(BackGroundGradient backGroundGradient) {
        this.mBackGroundGradient = backGroundGradient;
    }

    public void setBackgroundImageUrl(UrlModel urlModel) {
        this.backgroundImageUrl = urlModel;
    }

    public void setChallengeAnnouncement(ChallengeAnnouncement challengeAnnouncement2) {
        this.challengeAnnouncement = challengeAnnouncement2;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommerce(boolean z) {
        this.isCommerceAndValid = z;
    }

    public void setConnectMusics(List<Music> list) {
        this.connectMusics = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public Challenge setDynamicPatchList(List<C42345d> list) {
        this.dynamicPatchList = list;
        return this;
    }

    public void setEndColor(String str) {
        this.endColor = str;
    }

    public void setHighlightInfoList(List<C67361d> list) {
        this.mHighlightInfoList = list;
    }

    public void setLinkAction(String str) {
        this.linkAction = str;
    }

    public void setLinkText(String str) {
        this.linkText = str;
    }

    public void setLinkTitle(String str) {
        this.linkTitle = str;
    }

    public void setMediaSource(RelatedMediaSourceStruct relatedMediaSourceStruct) {
        this.mediaSource = relatedMediaSourceStruct;
    }

    public void setMvId(String str) {
        this.mvId = str;
    }

    public void setOriginAuthor(String str) {
        this.originAuthor = str;
    }

    public void setRelatedChallenges(List<Challenge> list) {
        this.relatedChallenges = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSearchChaName(String str) {
        this.mSearchChaName = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setSponsorAdLabel(String str) {
        this.sponsorAdLabel = str;
    }

    public void setStarColor(String str) {
        this.starColor = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Challenge)) {
            return false;
        }
        return TextUtils.equals(this.cid, ((Challenge) obj).cid);
    }
}
