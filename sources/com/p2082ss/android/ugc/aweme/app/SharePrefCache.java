package com.p2082ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.language.C58073f;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.app.SharePrefCache */
public class SharePrefCache {
    private C33594aj<String> adIntroUrl;
    private C33594aj<String> adLandingPageConfig;
    private C33594aj<String> adSouthNorthFirstSupportTeam;
    private C33594aj<Long> adSouthNorthFirstSupportTime;
    private C33594aj<Integer> arStickerFliterTimes;
    private C33594aj<Integer> atFriendsShowType;
    private C33594aj<Boolean> autoSaveVideo;
    private C33594aj<Boolean> autoSendTwitter;
    private List<C33594aj> cacheItems;
    private C33594aj<Boolean> canCreateInsights;
    private C33594aj<Integer> canIm;
    private C33594aj<Integer> canImSendPic;
    private C33594aj<Boolean> canLive;
    private boolean collectAllItems;
    private C33594aj<Integer> completeProfilePolicyInterval;
    private C33594aj<Integer> completeProfilePolicyTimes;
    private C33594aj<Boolean> debugWebBar;
    private C33594aj<Set<String>> defaultAvatarUrl;
    private C33594aj<String> downloadForbiddenToast;
    private C33594aj<Integer> downloadMicroApp;
    private C33594aj<String> downloadSdkConfig;
    private C33594aj<Boolean> downloadStatusWhenPublish;
    private C33594aj<Boolean> enableAntiAliasing;
    private C33594aj<Integer> enableBindItemCallOMSDK;
    private C33594aj<Boolean> enableMessagePb2Json;
    private C33594aj<Boolean> enableProfileActivityLink;
    private C33594aj<Boolean> enableUltraResolution;
    private C33594aj<String> facebookAccessToken;
    private C33594aj<Long> festivalShareDonationTime;
    private C33594aj<Integer> flashStatus;
    private C33594aj<Boolean> followGuideShown;
    private C33594aj<Long> followNoticeCloseTime;
    private C33594aj<Integer> followUserThreshold;
    private C33594aj<Boolean> geckoLocalTestUseOnline;
    private C33594aj<String> googleServerAuthCode;
    private C33594aj<Boolean> hasAlreadyShowBubble;
    private C33594aj<Boolean> hasEnterBindPhone;
    private C33594aj<Boolean> hasLongPressDislike;
    private C33594aj<Boolean> hasShowFilterGuide;
    private C33594aj<Boolean> hasShowHighQualityVideoTips;
    private C33594aj<String> hitRankActivityProfileBackgroud;
    private C33594aj<String> hitRankActivityStarBackground;
    private C33594aj<Integer> hitRankActivityStatus;
    private C33594aj<Integer> hotSearchWordsShowInterval;
    private C33594aj<Boolean> iesOffline;
    C33594aj<Boolean> imCommentForwardEnabled;
    private C33594aj<String> imCurrentLocaleLanguage;
    private C33594aj<String> imUrlTemplate;
    private C33594aj<Boolean> inUltraResBlackList;
    private C33594aj<String> invitedContacts;
    private C33594aj<Boolean> isAwemePrivate;
    private C33594aj<Boolean> isClickMoreRedPoint;
    private C33594aj<Boolean> isContactDialogShown;
    private C33594aj<Boolean> isContactsUploaded;
    private C33594aj<Boolean> isEuropeCountry;
    private C33594aj<Boolean> isFirstLaunch;
    private C33594aj<Boolean> isFirstPublishAweme;
    private C33594aj<Boolean> isFirstPublishComment;
    private C33594aj<Boolean> isFirstPublishSync;
    private C33594aj<Boolean> isFirstReportVideo;
    private C33594aj<Boolean> isHighQualityVideo;
    private C33594aj<Boolean> isHotSearchAwemeBillboardEnable;
    private C33594aj<Boolean> isHotSearchBillboardEnable;
    private C33594aj<Boolean> isHotSearchMusicalBillboardEnable;
    private C33594aj<Boolean> isHotSearchPositiveEnergyBillboardEnable;
    private C33594aj<Integer> isNewInstall;
    private C33594aj<Boolean> isNpthEnable;
    private C33594aj<Boolean> isOb;
    private C33594aj<Boolean> isOldUser;
    private C33594aj<Boolean> isPrivateAvailable;
    private C33594aj<Boolean> isProfileBubbleShown;
    private C33594aj<Boolean> isPublishSyncToHuoshan;
    private C33594aj<Boolean> isShowFavouriteIcon;
    private C33594aj<Boolean> isShowNearBy;
    private C33594aj<Boolean> isShowRankingIndicator;
    private C33594aj<Boolean> isShowUserFeedBackPoint;
    private C33594aj<Boolean> isSyncToHuoshan;
    private C33594aj<Boolean> isUseBackRefresh;
    private C33594aj<Boolean> ischangeFollowTab;
    private C33594aj<String> jsActlogUrl;
    private C33594aj<String> judgementClauseScheme;
    private C33594aj<Long> lastCloseFeedUpdateUserDialog;
    private C33594aj<Long> lastCloseUpdateUserDialog;
    private C33594aj<Long> lastFeedCount;
    private C33594aj<Long> lastFeedTime;
    private C33594aj<Long> lastFilterTime;
    private C33594aj<Long> lastGetRelieveAwemeTime;
    private C33594aj<Long> lastHintToastTime;
    private C33594aj<Long> lastLockedTime;
    private C33594aj<Boolean> lastPublishFailed;
    private C33594aj<Long> lastShowBindHintTime;
    private C33594aj<Long> lastShowProfileBindHintTime;
    private C33594aj<Long> lastUnlockTime;
    private C33594aj<Integer> lastUsableNetworkSpeed;
    private C33594aj<Boolean> liveAgreement;
    private C33594aj<Boolean> liveAnswer;
    private C33594aj<Boolean> liveContactsVerify;
    private C33594aj<Boolean> longVideoPermitted;
    private C33594aj<Set<String>> mGeckoChannels;
    private C33594aj<Set<String>> mGeckoInitialHighPriorityChannels;
    private SharedPreferences mSharedPreferences;
    private C33594aj<Boolean> mUseNewPackageNow;
    private C33594aj<String> miniAppLabTitle;
    private C33594aj<Boolean> mockLiveMoney;
    private C33594aj<Boolean> mockLiveResolution;
    private C33594aj<Boolean> mockLiveSend;
    private C33594aj<String> mpTab;
    private C33594aj<Integer> multiSelectLimit;
    private C33594aj<Integer> openImLink;
    private C33594aj<Integer> privacyAccountFollowCount;
    private C33594aj<String> privacyReminderH5Url;
    private C33594aj<Integer> promoteDialogPopupClickType;
    private C33594aj<String> promoteDialogPopupPopupContent;
    private C33594aj<Integer> promoteDialogPopupPopupInterval;
    private C33594aj<String> promoteDialogPopupPopupLinkText;
    private C33594aj<String> promoteDialogPopupPopupMsg;
    private C33594aj<String> promoteDialogPopupPopupTitle;
    private C33594aj<String> promoteDialogPopupPopupUrl;
    private C33594aj<Integer> promoteDialogPopupTimesLimit;
    private C33594aj<Boolean> promoteDialogShouldShow;
    private C33594aj<String> reactAddShopUrl;
    private List<String> recentList;
    private C33594aj<String> referralEntrance;
    private C33594aj<Boolean> removeFollowerSwitch;
    private C33594aj<String> requestNotificationText;
    private C33594aj<String> requestNotificationTitle;
    private C33594aj<Boolean> rnFallback;
    private C33594aj<String> searchTabIndex;
    private C33594aj<Boolean> shouldShowFavouriteTip;
    private C33594aj<Boolean> shouldShowPrivateAccountTipInProfile;
    private C33594aj<Boolean> showAdIntroFlag;
    private C33594aj<Boolean> showAddBusinessGoodsDot;
    private C33594aj<Integer> showBindHintCount;
    private C33594aj<Integer> showCreatorRewards;
    private C33594aj<Integer> showHashTagBg;
    private C33594aj<Boolean> showInvitedContactsFriends;
    private C33594aj<Integer> showLiveRewards;
    private C33594aj<Boolean> showMiniAppFreshGuideBubble;
    private C33594aj<Boolean> showMiniAppFreshGuideDialog;
    private C33594aj<Boolean> showMiniAppFreshGuideNotify;
    private C33594aj<Boolean> showPlayerInfoUI;
    private C33594aj<Integer> showProfileBindHintCount;
    private C33594aj<Integer> showPromoteLicense;
    private C33594aj<Boolean> showTimeLineTab;
    private C33594aj<Boolean> showVideoBitrateInfo;
    private C33594aj<Boolean> stickerArtEntry;
    private C33594aj<String> stickerArtlistUrl;
    private C33594aj<Integer> storyInfoStickerMaxCount;
    private C33594aj<Boolean> storyPublishFriendsDuoshanBanner;
    private C33594aj<Boolean> storyPublishSaveLocal;
    private C33594aj<Boolean> storyRecordGuideShow;
    private C33594aj<String> storyRegisterPublishSyncHintContent;
    private C33594aj<String> storyRegisterPublishSyncHintH5Str;
    private C33594aj<String> storyRegisterPublishSyncHintH5Url;
    private C33594aj<String> storyRegisterPublishSyncHintTitle;
    private C33594aj<Boolean> storySettingDoudouPhoto;
    private C33594aj<Boolean> storySettingManualOpenDoudou;
    private C33594aj<Integer> storySettingReplyPermission;
    private C33594aj<Boolean> storySettingSyncDuoshan;
    private C33594aj<Integer> storySettingSyncToast;
    private C33594aj<Integer> storySettingViewPermission;
    private C33594aj<Integer> storyTextStickerMaxCount;
    private C33594aj<String> storyUnRegisterPublishSyncHintContent;
    private C33594aj<String> storyUnRegisterPublishSyncHintH5Str;
    private C33594aj<String> storyUnRegisterPublishSyncHintH5Url;
    private C33594aj<String> storyUnRegisterPublishSyncHintTitle;
    private C33594aj<Long> todayVideoPlayTime;
    private C33594aj<Boolean> ttRegion;
    private C33594aj<Boolean> ttRoute;
    private C33594aj<String> twitterAccessToken;
    private C33594aj<String> twitterSecret;
    private C33594aj<Integer> ultraResolutionLevel;
    C33594aj<Integer> upGuideNum;
    private C33594aj<Integer> updateUserFrequency;
    private C33594aj<Integer> updateUserPosition;
    private C33594aj<String> updateUserTipContent;
    private C33594aj<Boolean> useCronet;
    private C33594aj<Boolean> useDefaultHost;
    private C33594aj<Boolean> useHttps;
    private C33594aj<String> userAddLanguages;
    private C33594aj<String> userCurrentRegion;
    private C33594aj<Boolean> userHasPassword;
    private C33594aj<String> userResidence;
    private C33594aj<Integer> verifyExceed;
    private C33594aj<Boolean> videoPreload;
    private C33594aj<Integer> weakNetPreLoadSwitch;

    /* renamed from: com.ss.android.ugc.aweme.app.SharePrefCache$1 */
    static /* synthetic */ class C335591 {
        static {
            Covode.recordClassIndex(40448);
        }
    }

    static {
        Covode.recordClassIndex(40447);
    }

    /* renamed from: com_ss_android_ugc_aweme_app_SharePrefCache_java_lang_reflect_Method_invoke */
    private static Object m68777xe44ee056(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_app_SharePrefCache_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_app_SharePrefCache_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public boolean isOpenForward() {
        return false;
    }

    public static SharePrefCache inst() {
        return C33560a.f79715a;
    }

    public SharedPreferences getSharePref() {
        return this.mSharedPreferences;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.app.SharePrefCache$a */
    public static class C33560a {

        /* renamed from: a */
        public static SharePrefCache f79715a = new SharePrefCache(null);

        static {
            Covode.recordClassIndex(40449);
        }
    }

    public boolean getImCommentForwardEnabled() {
        return getImCommentForwardEnabledItem().mo59941c().booleanValue();
    }

    public String getImUrlTemplate() {
        return getImUrlTemplateItem().mo59941c();
    }

    public boolean getIsFirstPublishAweme() {
        return getFirstPublishAwemeItem().mo59941c().booleanValue();
    }

    public boolean getIsFirstPublishComment() {
        return getFirstPublishCommentItem().mo59941c().booleanValue();
    }

    public int getMultiSelectLimit() {
        return getMultiSelectLimitItem().mo59941c().intValue();
    }

    public int getOpenImLink() {
        return getOpenImLinkItem().mo59941c().intValue();
    }

    private C33594aj<Integer> getArStickerFliterTimesItem() {
        if (this.arStickerFliterTimes == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("ar_sticker_filter_guide_times", (Integer) 0);
            this.arStickerFliterTimes = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.arStickerFliterTimes;
    }

    private C33594aj<Boolean> getCanLive() {
        if (this.canLive == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("live_can_live", (Boolean) false);
            this.canLive = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.canLive;
    }

    private C33594aj<Boolean> getClickMoreRedPoint() {
        if (this.isClickMoreRedPoint == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_click_more_red_point", (Boolean) false);
            this.isClickMoreRedPoint = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isClickMoreRedPoint;
    }

    private C33594aj<Boolean> getFirstPublishAwemeItem() {
        if (this.isFirstPublishAweme == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("first_publish_aweme", (Boolean) true);
            this.isFirstPublishAweme = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isFirstPublishAweme;
    }

    private C33594aj<Boolean> getFirstPublishCommentItem() {
        if (this.isFirstPublishComment == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("first_publish_comment", (Boolean) true);
            this.isFirstPublishComment = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isFirstPublishComment;
    }

    private C33594aj<Boolean> getHasShowFilterGuideItem() {
        if (this.hasShowFilterGuide == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("live_show_filter_guide", (Boolean) false);
            this.hasShowFilterGuide = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hasShowFilterGuide;
    }

    private C33594aj<Integer> getShowCreatorRewards() {
        if (this.showCreatorRewards == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("show_creator_rewards", (Integer) 0);
            this.showCreatorRewards = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showCreatorRewards;
    }

    private C33594aj<Integer> getShowLiveRewards() {
        if (this.showLiveRewards == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("show_live_rewards", (Integer) 0);
            this.showLiveRewards = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showLiveRewards;
    }

    public void clearCache() {
        collectAllItemsIfNeed();
        for (C33594aj ajVar : this.cacheItems) {
            ajVar.mo59935a();
        }
    }

    public C33594aj<String> getAdIntroUrlItem() {
        if (this.adIntroUrl == null) {
            C33594aj<String> ajVar = new C33594aj<>("ad_intro_url", "");
            this.adIntroUrl = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.adIntroUrl;
    }

    public C33594aj<String> getAdLandingPageConfig() {
        if (this.adLandingPageConfig == null) {
            C33594aj<String> ajVar = new C33594aj<>("ad_landing_page_config", "");
            this.adLandingPageConfig = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.adLandingPageConfig;
    }

    public C33594aj<String> getAdSouthNorthFirstSupportTeam() {
        if (this.adSouthNorthFirstSupportTeam == null) {
            this.adSouthNorthFirstSupportTeam = new C33594aj<>("ad_south_north_support_team", "");
        }
        return this.adSouthNorthFirstSupportTeam;
    }

    public C33594aj<Long> getAdSouthNorthFirstSupportTime() {
        if (this.adSouthNorthFirstSupportTime == null) {
            this.adSouthNorthFirstSupportTime = new C33594aj<>("ad_south_north_support_time", (Long) 0L);
        }
        return this.adSouthNorthFirstSupportTime;
    }

    public C33594aj<Integer> getAtFriendsShowType() {
        if (this.atFriendsShowType == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("at_friends_show_type", (Integer) 0);
            this.atFriendsShowType = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.atFriendsShowType;
    }

    public C33594aj<Boolean> getAutoSaveVideo() {
        if (this.autoSaveVideo == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("auto_save_video", (Boolean) true);
            this.autoSaveVideo = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.autoSaveVideo;
    }

    public C33594aj<Boolean> getAutoSendTwitter() {
        if (this.autoSendTwitter == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("auto_send_twitter", (Boolean) false);
            this.autoSendTwitter = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.autoSendTwitter;
    }

    public C33594aj<Boolean> getCanCreateInsights() {
        if (this.canCreateInsights == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("can_create_insights", (Boolean) false);
            this.canCreateInsights = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.canCreateInsights;
    }

    public C33594aj<Integer> getCanIm() {
        if (this.canIm == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("im_can_im", (Integer) 1);
            this.canIm = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.canIm;
    }

    public C33594aj<Integer> getCanImSendPic() {
        if (this.canImSendPic == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("im_can_send_pic", (Integer) 0);
            this.canImSendPic = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.canImSendPic;
    }

    public C33594aj<Integer> getCompleteProfilePolicyInterval() {
        if (this.completeProfilePolicyInterval == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("completeprofilepolicy_interval", (Integer) 0);
            this.completeProfilePolicyInterval = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.completeProfilePolicyInterval;
    }

    public C33594aj<Integer> getCompleteProfilePolicyTimes() {
        if (this.completeProfilePolicyTimes == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("completeprofilepolicy_times", (Integer) 0);
            this.completeProfilePolicyTimes = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.completeProfilePolicyTimes;
    }

    public C33594aj<String> getCurrentLocaleLanguage() {
        if (this.imCurrentLocaleLanguage == null) {
            C33594aj<String> ajVar = new C33594aj<>("im_current_locale", Locale.CHINESE.getLanguage());
            this.imCurrentLocaleLanguage = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.imCurrentLocaleLanguage;
    }

    public C33594aj<Boolean> getDebugWebBar() {
        if (this.debugWebBar == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("debug_web_bar", (Boolean) true);
            this.debugWebBar = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.debugWebBar;
    }

    public C33594aj<Set<String>> getDefaultAvatarUrl() {
        if (this.defaultAvatarUrl == null) {
            C33594aj<Set<String>> ajVar = new C33594aj<>("default_avatarurl", new HashSet());
            this.defaultAvatarUrl = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.defaultAvatarUrl;
    }

    public C33594aj<String> getDownloadForbiddenToast() {
        if (this.downloadForbiddenToast == null) {
            C33594aj<String> ajVar = new C33594aj<>("download_forbidden_toast", "");
            this.downloadForbiddenToast = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.downloadForbiddenToast;
    }

    public C33594aj<Integer> getDownloadMicroApp() {
        if (this.downloadMicroApp == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("download_micro_app", (Integer) 1);
            this.downloadMicroApp = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.downloadMicroApp;
    }

    public C33594aj<String> getDownloadSdkConfig() {
        if (this.downloadSdkConfig == null) {
            C33594aj<String> ajVar = new C33594aj<>("download_sdk_config", "");
            this.downloadSdkConfig = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.downloadSdkConfig;
    }

    public C33594aj<Boolean> getDownloadStatusWhenPublish() {
        if (this.downloadStatusWhenPublish == null) {
            this.downloadStatusWhenPublish = new C33594aj<>("download_status_when_publish", (Boolean) true);
        }
        return this.downloadStatusWhenPublish;
    }

    public C33594aj<Boolean> getEableUltraResolution() {
        if (this.enableUltraResolution == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("enable_ultra_resolution", (Boolean) false);
            this.enableUltraResolution = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.enableUltraResolution;
    }

    public C33594aj<Boolean> getEnableAntiAliasing() {
        if (this.enableAntiAliasing == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("enable_anti_aliasing", (Boolean) false);
            this.enableAntiAliasing = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.enableAntiAliasing;
    }

    public C33594aj<Integer> getEnableBindItemCallOMSDK() {
        if (this.enableBindItemCallOMSDK == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("enableBindItemCallOMSDK", (Integer) 0);
            this.enableBindItemCallOMSDK = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.enableBindItemCallOMSDK;
    }

    public C33594aj<Boolean> getEnableProfileActivityLink() {
        if (this.enableProfileActivityLink == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("enable_profile_link", (Boolean) false);
            this.enableProfileActivityLink = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.enableProfileActivityLink;
    }

    public C33594aj<String> getFacebookAccessToken() {
        if (this.facebookAccessToken == null) {
            C33594aj<String> ajVar = new C33594aj<>("facebook_access_token", "");
            this.facebookAccessToken = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.facebookAccessToken;
    }

    public C33594aj<Long> getFestivalShareDonationTime() {
        if (this.festivalShareDonationTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("festival_share_donation_time", (Long) 0L);
            this.festivalShareDonationTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.festivalShareDonationTime;
    }

    public C33594aj<Integer> getFlashStatus() {
        if (this.flashStatus == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("flash_status", (Integer) 0);
            this.flashStatus = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.flashStatus;
    }

    public C33594aj<Boolean> getFollowGuideShown() {
        if (this.followGuideShown == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("follow_guide_shown", (Boolean) false);
            this.followGuideShown = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.followGuideShown;
    }

    public C33594aj<Long> getFollowNoticeCloseTime() {
        if (this.followNoticeCloseTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("follow_notice_close_time", (Long) 0L);
            this.followNoticeCloseTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.followNoticeCloseTime;
    }

    public C33594aj<Integer> getFollowUserThreshold() {
        if (this.followUserThreshold == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("show_follow_tab_following_limit", (Integer) 1);
            this.followUserThreshold = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.followUserThreshold;
    }

    public C33594aj<Set<String>> getGeckoChannels() {
        if (this.mGeckoChannels == null) {
            C33594aj<Set<String>> ajVar = new C33594aj<>("gecko_init_channels", new HashSet());
            this.mGeckoChannels = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mGeckoChannels;
    }

    public C33594aj<Set<String>> getGeckoInitialHighPriorityChannels() {
        if (this.mGeckoInitialHighPriorityChannels == null) {
            C33594aj<Set<String>> ajVar = new C33594aj<>("initial_high_priority_channel", new HashSet());
            this.mGeckoInitialHighPriorityChannels = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mGeckoInitialHighPriorityChannels;
    }

    public C33594aj<Boolean> getGeckoLocalTestUseOnline() {
        if (this.geckoLocalTestUseOnline == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("gecko_local_test_use_online", (Boolean) false);
            this.geckoLocalTestUseOnline = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.geckoLocalTestUseOnline;
    }

    public C33594aj<String> getGoogleServerAuthCode() {
        if (this.googleServerAuthCode == null) {
            C33594aj<String> ajVar = new C33594aj<>("google_server_auth_code", "");
            this.googleServerAuthCode = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.googleServerAuthCode;
    }

    public C33594aj<Boolean> getHasAlreadyShowBubble() {
        if (this.hasAlreadyShowBubble == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("has_already_show_bubble", (Boolean) false);
            this.hasAlreadyShowBubble = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hasAlreadyShowBubble;
    }

    public C33594aj<Boolean> getHasEnterBindPhone() {
        if (this.hasEnterBindPhone == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("has_enter_bind_phone", (Boolean) false);
            this.hasEnterBindPhone = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hasEnterBindPhone;
    }

    public C33594aj<Boolean> getHasLongPressDislike() {
        if (this.hasLongPressDislike == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("has_long_pressed_dislike", (Boolean) false);
            this.hasLongPressDislike = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hasLongPressDislike;
    }

    public C33594aj<String> getHitRankActivityProfileBackground() {
        if (this.hitRankActivityProfileBackgroud == null) {
            C33594aj<String> ajVar = new C33594aj<>("HIT_RANK_ACTIVITY_PROFILE_BACKGROUND", "");
            this.hitRankActivityProfileBackgroud = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hitRankActivityProfileBackgroud;
    }

    public C33594aj<String> getHitRankActivityStarBackground() {
        if (this.hitRankActivityStarBackground == null) {
            C33594aj<String> ajVar = new C33594aj<>("hit_rank_activity_star_background", "");
            this.hitRankActivityStarBackground = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hitRankActivityStarBackground;
    }

    public C33594aj<Integer> getHitRankActivityStatus() {
        if (this.hitRankActivityStatus == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("hit_rank_activity_status", (Integer) 0);
            this.hitRankActivityStatus = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hitRankActivityStatus;
    }

    public C33594aj<Integer> getHotSearchWordsShowInterval() {
        if (this.hotSearchWordsShowInterval == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("hot_search_words_show_interval", (Integer) 2);
            this.hotSearchWordsShowInterval = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hotSearchWordsShowInterval;
    }

    public C33594aj<Boolean> getIesOffline() {
        if (this.iesOffline == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("iesoffline", (Boolean) true);
            this.iesOffline = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.iesOffline;
    }

    public C33594aj<Boolean> getImCommentForwardEnabledItem() {
        if (this.imCommentForwardEnabled == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("im_comment_forward_enabled", (Boolean) true);
            this.imCommentForwardEnabled = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.imCommentForwardEnabled;
    }

    public C33594aj<String> getImUrlTemplateItem() {
        if (this.imUrlTemplate == null) {
            C33594aj<String> ajVar = new C33594aj<>("im_url_template", "");
            this.imUrlTemplate = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.imUrlTemplate;
    }

    public C33594aj<String> getInvitedContacts() {
        if (this.invitedContacts == null) {
            C33594aj<String> ajVar = new C33594aj<>("invite_friends", "");
            this.invitedContacts = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.invitedContacts;
    }

    public C33594aj<Boolean> getIsAwemePrivate() {
        if (this.isAwemePrivate == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_aweme_private", (Boolean) false);
            this.isAwemePrivate = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isAwemePrivate;
    }

    public C33594aj<Boolean> getIsChangeFollowTab() {
        if (this.ischangeFollowTab == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_change_follow_tab", (Boolean) false);
            this.ischangeFollowTab = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.ischangeFollowTab;
    }

    public C33594aj<Boolean> getIsContactsUploaded() {
        if (this.isContactsUploaded == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("contacts_uploaded", (Boolean) false);
            this.isContactsUploaded = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isContactsUploaded;
    }

    public C33594aj<Boolean> getIsFirstLaunch() {
        if (this.isFirstLaunch == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_first_lauch", (Boolean) true);
            this.isFirstLaunch = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isFirstLaunch;
    }

    public C33594aj<Boolean> getIsFirstReportVideo() {
        if (this.isFirstReportVideo == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_first_report_video", (Boolean) true);
            this.isFirstReportVideo = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isFirstReportVideo;
    }

    public C33594aj<Boolean> getIsHotSearchAwemeBillboardEnable() {
        if (this.isHotSearchAwemeBillboardEnable == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_hot_search_aweme_billboard_enable", (Boolean) false);
            this.isHotSearchAwemeBillboardEnable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isHotSearchAwemeBillboardEnable;
    }

    public C33594aj<Boolean> getIsHotSearchBillboardEnable() {
        if (this.isHotSearchBillboardEnable == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_hot_search_billboard_enable", (Boolean) false);
            this.isHotSearchBillboardEnable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isHotSearchBillboardEnable;
    }

    public C33594aj<Boolean> getIsHotSearchMusicalBillboardEnable() {
        if (this.isHotSearchMusicalBillboardEnable == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_hot_search_music_billboard_enable", (Boolean) false);
            this.isHotSearchMusicalBillboardEnable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isHotSearchMusicalBillboardEnable;
    }

    public C33594aj<Boolean> getIsHotSearchPositiveEnergyBillboardEnable() {
        if (this.isHotSearchPositiveEnergyBillboardEnable == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_hot_search_positive_energy_billboard_enable", (Boolean) false);
            this.isHotSearchPositiveEnergyBillboardEnable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isHotSearchPositiveEnergyBillboardEnable;
    }

    public C33594aj<Integer> getIsNewInstall() {
        if (this.isNewInstall == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("is_new_install", (Integer) -1);
            this.isNewInstall = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isNewInstall;
    }

    public C33594aj<Boolean> getIsOldUser() {
        if (this.isOldUser == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("old_user", (Boolean) false);
            this.isOldUser = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isOldUser;
    }

    public C33594aj<Boolean> getIsPrivateAvailable() {
        if (this.isPrivateAvailable == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("private_aweme_available", (Boolean) true);
            this.isPrivateAvailable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isPrivateAvailable;
    }

    public C33594aj<Boolean> getIsProfileBubbleShown() {
        if (this.isProfileBubbleShown == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("profile_bubble_shown", (Boolean) true);
            this.isProfileBubbleShown = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isProfileBubbleShown;
    }

    public C33594aj<Boolean> getIsShowFavouriteIcon() {
        if (this.isShowFavouriteIcon == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("show_favourite_icon", (Boolean) false);
            this.isShowFavouriteIcon = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isShowFavouriteIcon;
    }

    public C33594aj<Boolean> getIsShowNearBy() {
        if (this.isShowNearBy == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_show_near_by", (Boolean) false);
            this.isShowNearBy = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isShowNearBy;
    }

    public C33594aj<Boolean> getIsShowRankingIndicator() {
        if (this.isShowRankingIndicator == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_show_ranking_indicator", (Boolean) true);
            this.isShowRankingIndicator = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isShowRankingIndicator;
    }

    public C33594aj<Boolean> getIsShowUserFeedBackPoint() {
        if (this.isShowUserFeedBackPoint == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("si_show_user_feed_back_point", (Boolean) false);
            this.isShowUserFeedBackPoint = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isShowUserFeedBackPoint;
    }

    public C33594aj<Boolean> getIsUseBackRefresh() {
        if (this.isUseBackRefresh == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_use_back_refresh", (Boolean) true);
            this.isUseBackRefresh = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isUseBackRefresh;
    }

    public C33594aj<String> getJsActlogUrl() {
        if (this.jsActlogUrl == null) {
            C33594aj<String> ajVar = new C33594aj<>("js_actlog_url", "");
            this.jsActlogUrl = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.jsActlogUrl;
    }

    public C33594aj<Long> getLastCloseFeedUpdateDialogTime() {
        if (this.lastCloseFeedUpdateUserDialog == null) {
            C33594aj<Long> ajVar = new C33594aj<>("last_close_feed_update_user_dialog", (Long) 0L);
            this.lastCloseFeedUpdateUserDialog = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastCloseFeedUpdateUserDialog;
    }

    public C33594aj<Long> getLastCloseUpdateDialogTime() {
        if (this.lastCloseUpdateUserDialog == null) {
            C33594aj<Long> ajVar = new C33594aj<>("last_close_update_user_dialog", (Long) 0L);
            this.lastCloseUpdateUserDialog = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastCloseUpdateUserDialog;
    }

    public C33594aj<Long> getLastFeedCount() {
        if (this.lastFeedCount == null) {
            C33594aj<Long> ajVar = new C33594aj<>("last_feed_count", (Long) 0L);
            this.lastFeedCount = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastFeedCount;
    }

    public C33594aj<Long> getLastFeedTime() {
        if (this.lastFeedTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("last_feed_time", (Long) 0L);
            this.lastFeedTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastFeedTime;
    }

    public C33594aj<Long> getLastFilterTime() {
        if (this.lastFilterTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("last_filter_time", (Long) 0L);
            this.lastFilterTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastFilterTime;
    }

    public C33594aj<Long> getLastGetRelieveAwemeTime() {
        if (this.lastGetRelieveAwemeTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("has_relieve_aweme", (Long) 0L);
            this.lastGetRelieveAwemeTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastGetRelieveAwemeTime;
    }

    public C33594aj<Long> getLastHintToastTime() {
        if (this.lastHintToastTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("last_hint_toast_time", (Long) 0L);
            this.lastHintToastTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastHintToastTime;
    }

    public C33594aj<Long> getLastLockedTime() {
        if (this.lastLockedTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("last_append_video_time", (Long) 0L);
            this.lastLockedTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastLockedTime;
    }

    public C33594aj<Boolean> getLastPublishFailed() {
        if (this.lastPublishFailed == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("last_publish_failed", (Boolean) false);
            this.lastPublishFailed = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastPublishFailed;
    }

    public C33594aj<Long> getLastShowBindHintTime() {
        if (this.lastShowBindHintTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("lastShowBindHintTime", (Long) 0L);
            this.lastShowBindHintTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastShowBindHintTime;
    }

    public C33594aj<Long> getLastShowProfileBindHintTime() {
        if (this.lastShowProfileBindHintTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("lastShowProfileBindHintTime", (Long) 0L);
            this.lastShowProfileBindHintTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastShowProfileBindHintTime;
    }

    public C33594aj<Long> getLastUnlockTime() {
        if (this.lastUnlockTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("last_unlock_time", (Long) 0L);
            this.lastUnlockTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastUnlockTime;
    }

    public C33594aj<Integer> getLastUsableNetworkSpeed() {
        if (this.lastUsableNetworkSpeed == null) {
            this.lastUsableNetworkSpeed = new C33594aj<>("last_usable_network_speed", (Integer) -1);
        }
        return this.lastUsableNetworkSpeed;
    }

    public C33594aj<Boolean> getLongVideoPermitted() {
        if (this.longVideoPermitted == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("long_video_permitted", (Boolean) false);
            this.longVideoPermitted = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.longVideoPermitted;
    }

    public C33594aj<String> getMiniAppLabelTitle() {
        if (this.miniAppLabTitle == null) {
            C33594aj<String> ajVar = new C33594aj<>("lab_title", "");
            this.miniAppLabTitle = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.miniAppLabTitle;
    }

    public C33594aj<String> getMpTab() {
        if (this.mpTab == null) {
            C33594aj<String> ajVar = new C33594aj<>("mp_tab", "");
            this.mpTab = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mpTab;
    }

    public C33594aj<Integer> getMultiSelectLimitItem() {
        if (this.multiSelectLimit == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("multi_select_limit", (Integer) 10);
            this.multiSelectLimit = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.multiSelectLimit;
    }

    public C33594aj<Integer> getOpenImLinkItem() {
        if (this.openImLink == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("open_im_link", (Integer) 0);
            this.openImLink = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.openImLink;
    }

    public C33594aj<Integer> getPrivacyAccountFollowCount() {
        if (this.privacyAccountFollowCount == null) {
            this.privacyAccountFollowCount = new C33594aj<>("privacy_account_follow_count", (Integer) 0);
        }
        return this.privacyAccountFollowCount;
    }

    public C33594aj<String> getPrivacyReminderH5Url() {
        if (this.privacyReminderH5Url == null) {
            C33594aj<String> ajVar = new C33594aj<>("privacy_reminder", "");
            this.privacyReminderH5Url = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.privacyReminderH5Url;
    }

    public C33594aj<Integer> getPromoteDialogPopupClickType() {
        if (this.promoteDialogPopupClickType == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("promote_dialog_popup_click_type", (Integer) 0);
            this.promoteDialogPopupClickType = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupClickType;
    }

    public C33594aj<String> getPromoteDialogPopupPopupContent() {
        if (this.promoteDialogPopupPopupContent == null) {
            C33594aj<String> ajVar = new C33594aj<>("promote_dialog_popup_content", "");
            this.promoteDialogPopupPopupContent = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupContent;
    }

    public C33594aj<Integer> getPromoteDialogPopupPopupInterval() {
        if (this.promoteDialogPopupPopupInterval == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("promote_dialog_popup_interval", (Integer) 7);
            this.promoteDialogPopupPopupInterval = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupInterval;
    }

    public C33594aj<String> getPromoteDialogPopupPopupLinkText() {
        if (this.promoteDialogPopupPopupLinkText == null) {
            C33594aj<String> ajVar = new C33594aj<>("promote_dialog_popup_linkText", "");
            this.promoteDialogPopupPopupLinkText = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupLinkText;
    }

    public C33594aj<String> getPromoteDialogPopupPopupMsg() {
        if (this.promoteDialogPopupPopupMsg == null) {
            C33594aj<String> ajVar = new C33594aj<>("promote_dialog_popup_msg", "");
            this.promoteDialogPopupPopupMsg = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupMsg;
    }

    public C33594aj<String> getPromoteDialogPopupPopupTitle() {
        if (this.promoteDialogPopupPopupTitle == null) {
            C33594aj<String> ajVar = new C33594aj<>("promote_dialog_popup_title", "");
            this.promoteDialogPopupPopupTitle = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupTitle;
    }

    public C33594aj<String> getPromoteDialogPopupPopupUrl() {
        if (this.promoteDialogPopupPopupUrl == null) {
            C33594aj<String> ajVar = new C33594aj<>("promote_dialog_popup_url", "");
            this.promoteDialogPopupPopupUrl = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupUrl;
    }

    public C33594aj<Integer> getPromoteDialogPopupTimesLimit() {
        if (this.promoteDialogPopupTimesLimit == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("promote_dialog_popup_times_limit", (Integer) 3);
            this.promoteDialogPopupTimesLimit = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupTimesLimit;
    }

    public C33594aj<Boolean> getPromoteDialogShouldShow() {
        if (this.promoteDialogShouldShow == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("promote_dialog_show", (Boolean) false);
            this.promoteDialogShouldShow = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogShouldShow;
    }

    public C33594aj<String> getReferralEntrance() {
        if (this.referralEntrance == null) {
            this.referralEntrance = new C33594aj<>("invite_friends", "");
        }
        return this.referralEntrance;
    }

    public C33594aj<Boolean> getRemoveFollowerSwitch() {
        if (this.removeFollowerSwitch == null) {
            this.removeFollowerSwitch = new C33594aj<>("remove_follower_switch", (Boolean) false);
        }
        return this.removeFollowerSwitch;
    }

    public C33594aj<String> getRequestNotificationText() {
        if (this.requestNotificationText == null) {
            C33594aj<String> ajVar = new C33594aj<>("request_notification_text", "");
            this.requestNotificationText = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.requestNotificationText;
    }

    public C33594aj<String> getRequestNotificationTitle() {
        if (this.requestNotificationTitle == null) {
            C33594aj<String> ajVar = new C33594aj<>("request_notification_title", "");
            this.requestNotificationTitle = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.requestNotificationTitle;
    }

    public C33594aj<Boolean> getRnFallback() {
        if (this.rnFallback == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("rn_fallback", (Boolean) false);
            this.rnFallback = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.rnFallback;
    }

    public C33594aj<String> getSearchTabIndex() {
        if (this.searchTabIndex == null) {
            C33594aj<String> ajVar = new C33594aj<>("search_tab_index", "");
            this.searchTabIndex = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.searchTabIndex;
    }

    public C33594aj<Boolean> getShouldShowFavouriteTip() {
        if (this.shouldShowFavouriteTip == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("should_show_favourite_tip", (Boolean) true);
            this.shouldShowFavouriteTip = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.shouldShowFavouriteTip;
    }

    public C33594aj<Boolean> getShouldShowPrivateAccountTipInProfile() {
        if (this.shouldShowPrivateAccountTipInProfile == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("show_private_account_tip_in_profile", (Boolean) false);
            this.shouldShowPrivateAccountTipInProfile = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.shouldShowPrivateAccountTipInProfile;
    }

    public C33594aj<Boolean> getShowAdIntroItem() {
        if (this.showAdIntroFlag == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_show_ad_intro", (Boolean) false);
            this.showAdIntroFlag = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showAdIntroFlag;
    }

    public C33594aj<Boolean> getShowAddBusinessGoodsDot() {
        if (this.showAddBusinessGoodsDot == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("show_add_business_dot", (Boolean) true);
            this.showAddBusinessGoodsDot = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showAddBusinessGoodsDot;
    }

    public C33594aj<Integer> getShowBindHintCount() {
        if (this.showBindHintCount == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("showBindHintCount", (Integer) 0);
            this.showBindHintCount = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showBindHintCount;
    }

    public C33594aj<Integer> getShowHashTagBg() {
        if (this.showHashTagBg == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("enable_hashtag_background", (Integer) 0);
            this.showHashTagBg = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showHashTagBg;
    }

    public C33594aj<Boolean> getShowPlayerInfoUI() {
        if (this.showPlayerInfoUI == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("show_player_info_ui", (Boolean) false);
            this.showPlayerInfoUI = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showPlayerInfoUI;
    }

    public C33594aj<Integer> getShowProfileBindHintCount() {
        if (this.showProfileBindHintCount == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("showProfileBindHintCount", (Integer) 0);
            this.showProfileBindHintCount = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showProfileBindHintCount;
    }

    public C33594aj<Integer> getShowPromoteLicense() {
        if (this.showPromoteLicense == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("show_creator_license_210", (Integer) 0);
            this.showPromoteLicense = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showPromoteLicense;
    }

    public C33594aj<Boolean> getShowTimeLineTab() {
        if (this.showTimeLineTab == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("show_timeline_tab", (Boolean) false);
            this.showTimeLineTab = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showTimeLineTab;
    }

    public C33594aj<Boolean> getShowVideoBitrateInfo() {
        if (this.showVideoBitrateInfo == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("showVideoBitrateInfo", (Boolean) false);
            this.showVideoBitrateInfo = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showVideoBitrateInfo;
    }

    public C33594aj<Boolean> getStickerArtEntry() {
        if (this.stickerArtEntry == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("sticker_artist_entry", (Boolean) false);
            this.stickerArtEntry = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.stickerArtEntry;
    }

    public C33594aj<String> getStickerArtlistUrl() {
        if (this.stickerArtlistUrl == null) {
            C33594aj<String> ajVar = new C33594aj<>("sticker_artlist_url", "");
            this.stickerArtlistUrl = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.stickerArtlistUrl;
    }

    public C33594aj<Integer> getStoryInfoStickerMaxCount() {
        if (this.storyInfoStickerMaxCount == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("story_info_sticker_max_count", (Integer) 30);
            this.storyInfoStickerMaxCount = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyInfoStickerMaxCount;
    }

    public C33594aj<Boolean> getStoryPublishFriendsBanner() {
        if (this.storyPublishFriendsDuoshanBanner == null) {
            this.storyPublishFriendsDuoshanBanner = new C33594aj<>("story_publish_friend_banner", (Boolean) false);
        }
        return this.storyPublishFriendsDuoshanBanner;
    }

    public C33594aj<Boolean> getStoryPublishSaveLocal() {
        if (this.storyPublishSaveLocal == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("story_publish_save_local", (Boolean) true);
            this.storyPublishSaveLocal = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyPublishSaveLocal;
    }

    public C33594aj<Boolean> getStoryRecordGuideShow() {
        if (this.storyRecordGuideShow == null) {
            this.storyRecordGuideShow = new C33594aj<>("story_record_guide_show", (Boolean) false);
        }
        return this.storyRecordGuideShow;
    }

    public C33594aj<String> getStoryRegisterPublishSyncHintContent() {
        if (this.storyRegisterPublishSyncHintContent == null) {
            C33594aj<String> ajVar = new C33594aj<>("story_publish_register_sync_hint_content", "");
            this.storyRegisterPublishSyncHintContent = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyRegisterPublishSyncHintContent;
    }

    public C33594aj<String> getStoryRegisterPublishSyncHintH5Str() {
        if (this.storyRegisterPublishSyncHintH5Str == null) {
            C33594aj<String> ajVar = new C33594aj<>("story_publish_register_sync_hint_h5", "");
            this.storyRegisterPublishSyncHintH5Str = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyRegisterPublishSyncHintH5Str;
    }

    public C33594aj<String> getStoryRegisterPublishSyncHintH5Url() {
        if (this.storyRegisterPublishSyncHintH5Url == null) {
            C33594aj<String> ajVar = new C33594aj<>("story_publish_register_sync_hint_h5_url", "");
            this.storyRegisterPublishSyncHintH5Url = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyRegisterPublishSyncHintH5Url;
    }

    public C33594aj<String> getStoryRegisterPublishSyncHintTitle() {
        if (this.storyRegisterPublishSyncHintTitle == null) {
            C33594aj<String> ajVar = new C33594aj<>("story_publish_register_sync_hint_title", "");
            this.storyRegisterPublishSyncHintTitle = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyRegisterPublishSyncHintTitle;
    }

    public C33594aj<Boolean> getStorySettingDoudouPhoto() {
        if (this.storySettingDoudouPhoto == null) {
            this.storySettingDoudouPhoto = new C33594aj<>("story_setting_duodou_photo", (Boolean) true);
        }
        return this.storySettingDoudouPhoto;
    }

    public C33594aj<Boolean> getStorySettingManualOpenDoudou() {
        if (this.storySettingManualOpenDoudou == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("story_setting_manual_open_doudou", (Boolean) false);
            this.storySettingManualOpenDoudou = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storySettingManualOpenDoudou;
    }

    public C33594aj<Integer> getStorySettingReplyPermission() {
        if (this.storySettingReplyPermission == null) {
            this.storySettingReplyPermission = new C33594aj<>("story_setting_reply_permission", (Integer) 0);
        }
        return this.storySettingReplyPermission;
    }

    public C33594aj<Boolean> getStorySettingSyncDuoshan() {
        if (this.storySettingSyncDuoshan == null) {
            this.storySettingSyncDuoshan = new C33594aj<>("story_setting_sync_duoshan", (Boolean) false);
        }
        return this.storySettingSyncDuoshan;
    }

    public C33594aj<Integer> getStorySettingSyncToast() {
        if (this.storySettingSyncToast == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("story_setting_sync_toast", (Integer) 0);
            this.storySettingSyncToast = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storySettingSyncToast;
    }

    public C33594aj<Integer> getStorySettingViewPermission() {
        if (this.storySettingViewPermission == null) {
            this.storySettingViewPermission = new C33594aj<>("story_setting_view_permission", (Integer) 0);
        }
        return this.storySettingViewPermission;
    }

    public C33594aj<Integer> getStoryTextStickerMaxCount() {
        if (this.storyTextStickerMaxCount == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("story_text_sticker_max_count", (Integer) 30);
            this.storyTextStickerMaxCount = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyTextStickerMaxCount;
    }

    public C33594aj<String> getStoryUnRegisterPublishSyncHintContent() {
        if (this.storyUnRegisterPublishSyncHintContent == null) {
            C33594aj<String> ajVar = new C33594aj<>("story_publish_unregister_sync_hint_content", "");
            this.storyUnRegisterPublishSyncHintContent = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyUnRegisterPublishSyncHintContent;
    }

    public C33594aj<String> getStoryUnRegisterPublishSyncHintH5Str() {
        if (this.storyUnRegisterPublishSyncHintH5Str == null) {
            C33594aj<String> ajVar = new C33594aj<>("story_publish_unregister_sync_hint_h5", "");
            this.storyUnRegisterPublishSyncHintH5Str = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyUnRegisterPublishSyncHintH5Str;
    }

    public C33594aj<String> getStoryUnRegisterPublishSyncHintH5Url() {
        if (this.storyUnRegisterPublishSyncHintH5Url == null) {
            C33594aj<String> ajVar = new C33594aj<>("story_publish_unregister_sync_hint_h5_url", "");
            this.storyUnRegisterPublishSyncHintH5Url = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyUnRegisterPublishSyncHintH5Url;
    }

    public C33594aj<String> getStoryUnRegisterPublishSyncHintTitle() {
        if (this.storyUnRegisterPublishSyncHintTitle == null) {
            C33594aj<String> ajVar = new C33594aj<>("story_publish_unregister_sync_hint_title", "");
            this.storyUnRegisterPublishSyncHintTitle = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyUnRegisterPublishSyncHintTitle;
    }

    public C33594aj<Long> getTodayVideoPlayTime() {
        if (this.todayVideoPlayTime == null) {
            C33594aj<Long> ajVar = new C33594aj<>("today_video_play_time", (Long) 0L);
            this.todayVideoPlayTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.todayVideoPlayTime;
    }

    public C33594aj<String> getTwitterAccessToken() {
        if (this.twitterAccessToken == null) {
            C33594aj<String> ajVar = new C33594aj<>("twitter_access_token", "");
            this.twitterAccessToken = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.twitterAccessToken;
    }

    public C33594aj<String> getTwitterSecret() {
        if (this.twitterSecret == null) {
            C33594aj<String> ajVar = new C33594aj<>("twitter_secret", "");
            this.twitterSecret = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.twitterSecret;
    }

    public C33594aj<Integer> getUltraResolutionLevel() {
        if (this.ultraResolutionLevel == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("ultra_resolution_level", (Integer) 0);
            this.ultraResolutionLevel = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.ultraResolutionLevel;
    }

    public C33594aj<Integer> getUpGuideNum() {
        if (this.upGuideNum == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("up_guide_num", (Integer) -1);
            this.upGuideNum = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.upGuideNum;
    }

    public C33594aj<Integer> getUpdateUserFrequency() {
        if (this.updateUserFrequency == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("update_user_frequency", (Integer) 0);
            this.updateUserFrequency = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.updateUserFrequency;
    }

    public C33594aj<Integer> getUpdateUserPosition() {
        if (this.updateUserPosition == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("update_user_position", (Integer) -1);
            this.updateUserPosition = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.updateUserPosition;
    }

    public C33594aj<String> getUpdateUserTipContent() {
        if (this.updateUserTipContent == null) {
            C33594aj<String> ajVar = new C33594aj<>("update_user_tip_content", "");
            this.updateUserTipContent = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.updateUserTipContent;
    }

    public C33594aj<Boolean> getUseCronet() {
        if (this.useCronet == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("use_cronet", (Boolean) true);
            this.useCronet = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.useCronet;
    }

    public C33594aj<Boolean> getUseDefaultHost() {
        if (this.useDefaultHost == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("use_default_host", (Boolean) true);
            this.useDefaultHost = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.useDefaultHost;
    }

    public C33594aj<Boolean> getUseHttps() {
        if (this.useHttps == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("use_https", (Boolean) true);
            this.useHttps = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.useHttps;
    }

    public C33594aj<Boolean> getUseNewPackageNow() {
        if (this.mUseNewPackageNow == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("use_new_package_now", (Boolean) false);
            this.mUseNewPackageNow = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mUseNewPackageNow;
    }

    public C33594aj<String> getUserAddLanguages() {
        if (this.userAddLanguages == null) {
            C33594aj<String> ajVar = new C33594aj<>("user_add_languages", "");
            this.userAddLanguages = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.userAddLanguages;
    }

    public C33594aj<String> getUserCurrentRegion() {
        if (this.userCurrentRegion == null) {
            C33594aj<String> ajVar = new C33594aj<>("user_current_region", "");
            this.userCurrentRegion = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.userCurrentRegion;
    }

    public C33594aj<Boolean> getUserHasPassword() {
        if (this.userHasPassword == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("user_has_password", (Boolean) false);
            this.userHasPassword = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.userHasPassword;
    }

    public C33594aj<String> getUserResidence() {
        if (this.userResidence == null) {
            C33594aj<String> ajVar = new C33594aj<>("user_residence", "");
            this.userResidence = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.userResidence;
    }

    public C33594aj<Integer> getVerifyExceed() {
        if (this.verifyExceed == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("verify_exceed", (Integer) 5);
            this.verifyExceed = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.verifyExceed;
    }

    public C33594aj<Boolean> getVideoPreload() {
        if (this.videoPreload == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("video_preload", (Boolean) true);
            this.videoPreload = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.videoPreload;
    }

    public C33594aj<Integer> getWeakNetPreLoadSwitch() {
        if (this.weakNetPreLoadSwitch == null) {
            C33594aj<Integer> ajVar = new C33594aj<>("weak_net_pre_load_switch", (Integer) 1);
            this.weakNetPreLoadSwitch = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.weakNetPreLoadSwitch;
    }

    public C33594aj<Boolean> hasShowHighQualityVideoTips() {
        if (this.hasShowHighQualityVideoTips == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("has_show_high_quality_video_tips", (Boolean) false);
            this.hasShowHighQualityVideoTips = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hasShowHighQualityVideoTips;
    }

    public C33594aj<Boolean> isEnableMessagePb2Json() {
        if (this.enableMessagePb2Json == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("live_enanble_message_pb2json", (Boolean) false);
            this.enableMessagePb2Json = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.enableMessagePb2Json;
    }

    public C33594aj<Boolean> isFirstPublishSync() {
        if (this.isFirstPublishSync == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_first_publish", (Boolean) true);
            this.isFirstPublishSync = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isFirstPublishSync;
    }

    public C33594aj<Boolean> isHighQualityVideo() {
        if (this.isHighQualityVideo == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_high_quality_video", (Boolean) false);
            this.isHighQualityVideo = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isHighQualityVideo;
    }

    public C33594aj<Boolean> isInUltraResBlackList() {
        if (this.inUltraResBlackList == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("in_ultra_resolution_black_list", (Boolean) false);
            this.inUltraResBlackList = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.inUltraResBlackList;
    }

    public C33594aj<Boolean> isNpthEnable() {
        if (this.isNpthEnable == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_npth_enable", (Boolean) false);
            this.isNpthEnable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isNpthEnable;
    }

    public C33594aj<Boolean> isOb() {
        if (this.isOb == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_ob", (Boolean) false);
            this.isOb = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isOb;
    }

    public C33594aj<Boolean> isPublishSyncToHuoshan() {
        if (this.isPublishSyncToHuoshan == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_publish_sync_huoshan", (Boolean) true);
            this.isPublishSyncToHuoshan = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isPublishSyncToHuoshan;
    }

    public C33594aj<Boolean> isShowInviteContactsFriends() {
        if (this.showInvitedContactsFriends == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("invite_friends_settings", (Boolean) false);
            this.showInvitedContactsFriends = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showInvitedContactsFriends;
    }

    public C33594aj<Boolean> isSyncToHuoshan() {
        if (this.isSyncToHuoshan == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("is_sync_to_huoshan", (Boolean) false);
            this.isSyncToHuoshan = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isSyncToHuoshan;
    }

    public C33594aj<Boolean> liveAgreement() {
        if (this.liveAgreement == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("live_agreement", (Boolean) false);
            this.liveAgreement = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.liveAgreement;
    }

    public C33594aj<Boolean> liveAnswer() {
        if (this.liveAnswer == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("live_answer", (Boolean) false);
            this.liveAnswer = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.liveAnswer;
    }

    public C33594aj<Boolean> liveContactsVerify() {
        if (this.liveContactsVerify == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("live_contacts_verify", (Boolean) false);
            this.liveContactsVerify = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.liveContactsVerify;
    }

    public C33594aj<Boolean> mockLiveMoney() {
        if (this.mockLiveMoney == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("mock_live_money", (Boolean) false);
            this.mockLiveMoney = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mockLiveMoney;
    }

    public C33594aj<Boolean> mockLiveResolution() {
        if (this.mockLiveResolution == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("mock_live_resolution", (Boolean) false);
            this.mockLiveResolution = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mockLiveResolution;
    }

    public C33594aj<Boolean> mockLiveSend() {
        if (this.mockLiveSend == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("mock_live_send", (Boolean) false);
            this.mockLiveSend = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mockLiveSend;
    }

    private SharePrefCache() {
        this.recentList = Arrays.asList("IN", "NP", "PK", "LK");
        this.cacheItems = Collections.synchronizedList(new ArrayList());
        this.mSharedPreferences = C34822d.m71158a(C17867d.m33078a(), "aweme-app", 0);
    }

    private void collectAllItemsIfNeed() {
        if (!this.collectAllItems) {
            this.collectAllItems = true;
            Method[] declaredMethods = SharePrefCache.class.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (method.getReturnType() == C33594aj.class) {
                    try {
                        m68777xe44ee056(method, this, new Object[0]);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public C33594aj<Boolean> getIsContactDialogShown() {
        if (this.isContactDialogShown == null) {
            C33594aj<Boolean> ajVar = new C33594aj<>("contact_dialog_shown", Boolean.valueOf(getSharePref().getBoolean("contact_dialog_shown", false)));
            this.isContactDialogShown = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isContactDialogShown;
    }

    public C33594aj<Boolean> getIsEuropeCountry() {
        if (this.isEuropeCountry == null) {
            if (!TextUtils.isEmpty(C58073f.m104922b())) {
                this.isEuropeCountry = new C33594aj<>("is_europe_country", Boolean.valueOf(C58073f.m104921a(C58073f.m104922b())));
            } else if (!TextUtils.isEmpty(C58073f.m104920a())) {
                this.isEuropeCountry = new C33594aj<>("is_europe_country", Boolean.valueOf(C58073f.m104921a(C58073f.m104920a())));
            } else {
                this.isEuropeCountry = new C33594aj<>("is_europe_country", (Boolean) false);
            }
            this.cacheItems.add(this.isEuropeCountry);
        }
        return this.isEuropeCountry;
    }

    /* synthetic */ SharePrefCache(C335591 r1) {
        this();
    }

    public void setCurrentLocaleLanguage(String str) {
        getCurrentLocaleLanguage().mo59940b(str);
    }

    public void setImUrlTemplate(String str) {
        getImUrlTemplateItem().mo59940b(str);
    }

    public void setInvitedContacts(String str) {
        getInvitedContacts().mo59940b(str);
    }

    public void setShowInvitedContactsFriends(Boolean bool) {
        isShowInviteContactsFriends().mo59940b(bool);
    }

    public void setImCommentForwardEnabled(boolean z) {
        getImCommentForwardEnabledItem().mo59940b(Boolean.valueOf(z));
    }

    public void setIsFirstPublishAweme(boolean z) {
        getFirstPublishAwemeItem().mo59940b(Boolean.valueOf(z));
    }

    public void setIsFirstPublishComment(boolean z) {
        getFirstPublishCommentItem().mo59940b(Boolean.valueOf(z));
    }

    public void setMultiSelectLimit(int i) {
        getMultiSelectLimitItem().mo59940b(Integer.valueOf(i));
    }

    public void setOpenImLink(int i) {
        getOpenImLinkItem().mo59940b(Integer.valueOf(i));
    }

    public void setShowAddBusinessGoodsDot(boolean z) {
        getShowAddBusinessGoodsDot().mo59940b(Boolean.valueOf(z));
    }
}
