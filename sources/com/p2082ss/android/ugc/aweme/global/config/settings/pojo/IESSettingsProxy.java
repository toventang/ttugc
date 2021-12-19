package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.datacenter.AbstractC16070i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy */
public class IESSettingsProxy {
    private static final Boolean DEFAULT_BOOLEAN = false;
    private static final Float DEFAULT_FLOAT = Float.valueOf(0.74347335f);
    private static final Integer DEFAULT_INTEGER = 2690237;
    private static final Long DEFAULT_LONG = 992354881878L;

    public String getAdTrackerConfig() {
        return SettingsManager.m29616a().mo25398a("ad_tracker_config", "");
    }

    public Boolean getAiMusicBackupStrategy() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("ai_music_backup_strategy", false));
    }

    public Integer getAntiAddictionDayTime() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("anti_addiction_day_time", 0));
    }

    public Integer getAntiAddictionNightTime() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("anti_addiction_night_time", 0));
    }

    public Integer getAntiAddictionToastTime() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("anti_addiction_toast_time", 0));
    }

    public Integer getBackgroundPausePlayerSetting() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("background_pause_player_setting", 0));
    }

    public Integer getCloseLoginAgreement() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("close_login_agreement", 0));
    }

    public Integer getCloseSyncToHeloEntry() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("close_sync_to_helo_entry", 1));
    }

    public Boolean getDisableOnlineSmallEmoji() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("disable_online_small_emoji", false));
    }

    public Boolean getDisableQiVideoShare() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("disable_qi_video_share", true));
    }

    public Boolean getDisableVastBitrate() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("disable_vast_bitrate", false));
    }

    public Boolean getDisallowVastHasAuthor() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("disallow_vast_has_author", false));
    }

    public String getDoulabUseInformationUrl() {
        return SettingsManager.m29616a().mo25398a("doulab_use_information_url", "");
    }

    public Integer getDouplusBulletEntry() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("douplus_bullet_entry", 0));
    }

    public Integer getDouplusEntryFeed() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("douplus_entry_feed", 0));
    }

    public Integer getEditEffectAutoDownloadSize() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("edit_effect_auto_download_size", 5));
    }

    public Boolean getEnableAdRouter() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_ad_router", false));
    }

    public Boolean getEnableAnchorCache() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_anchor_cache", false));
    }

    public Boolean getEnableAutoLiveState() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_auto_live_state", false));
    }

    public Boolean getEnableAvStorageMonitor() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_av_storage_monitor", true));
    }

    public Boolean getEnableCommentCreateSticker() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_comment_create_sticker", false));
    }

    public Boolean getEnableCommentOffensiveFilterSwitch() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_comment_offensive_filter_switch", false));
    }

    public Boolean getEnableDisplayFavoriteMiniapp() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_display_favorite_miniapp", true));
    }

    public Boolean getEnableDisplayFavoriteMinigame() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_display_favorite_minigame", true));
    }

    public Integer getEnableEmailVerification() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("enable_email_verification", 1));
    }

    public Boolean getEnableEnterLiveRoomStreamOpt() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_enter_live_room_stream_opt", true));
    }

    public Boolean getEnableEnterLiveRoomStreamOptFromFollowSky() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_enter_live_room_stream_opt_from_follow_sky", false));
    }

    public Boolean getEnableGroupMemberByFollowers() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_group_member_by_followers", false));
    }

    public Boolean getEnableHighRiskRebindAlert() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_high_risk_rebind_alert", true));
    }

    public Boolean getEnableLiveDrawerDialog() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_live_drawer_dialog", true));
    }

    public Boolean getEnableLiveSplash() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_live_splash", true));
    }

    public Boolean getEnableNewUserInfoSync() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_new_user_info_sync", false));
    }

    public Boolean getEnablePushAllianceSdk() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_push_alliance_sdk", false));
    }

    public Boolean getEnableSplashLaunchFix() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_splash_launch_fix", true));
    }

    public Boolean getEnableTImChatEveryone() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_t_im_chat_everyone", false));
    }

    public Integer getEnableYoutubeAppAuth() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("enable_youtube_app_auth", 0));
    }

    public Integer getEnabledImAsupporterFuncs() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("enabled_im_asupporter_funcs", 3));
    }

    public Integer getEnabledImAsupporterMsgTypes() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("enabled_im_asupporter_msg_types", 5));
    }

    public Integer getF2NoticeType() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("f2_notice_type", 0));
    }

    public Boolean getFeedHandleGenericMotion() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("feed_handle_generic_motion", true));
    }

    public Boolean getFeedbackRecordEnable() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("feedback_record_enable", true));
    }

    public Integer getFirstInstallTime() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("first_install_time", -1));
    }

    public Boolean getFollowingFollowerPermissionSwitch() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("following_follower_permission_switch", false));
    }

    public Boolean getForbidVoiceChangeOnEditPage() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("forbid_voice_change_on_edit_page", true));
    }

    public Boolean getGroupNewMemberCanPullOldMsg() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("group_new_member_can_pull_old_msg", false));
    }

    public String getHeartbeatDefaultUrl() {
        return SettingsManager.m29616a().mo25398a("heartbeat_default_url", "");
    }

    public Integer getHotspotGuideTime() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("hotspot_guide_time", 3));
    }

    public Integer getInappUpdateSwitchStrategy() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("inapp_update_switch_strategy", 0));
    }

    public Integer getIsAdapterVideoPlaySize() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("is_adapter_video_play_size", 0));
    }

    public Integer getIsAdapterVideoPlaySizeAd() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("is_adapter_video_play_size_ad", 0));
    }

    public Boolean getIsHotUser() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("is_hot_user", false));
    }

    public Boolean getIsNearbyOldUser() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("is_nearby_old_user", false));
    }

    public Boolean getKeepCookies() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("keep_cookies", false));
    }

    public Integer getKevaSwitch() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("keva_switch", 1));
    }

    public Integer getLiveSquareGuideShowCount() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("live_square_guide_show_count", 0));
    }

    public Boolean getMainTabFollowUseLazyViewpager() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("main_tab_follow_use_lazy_viewpager", false));
    }

    public Integer getMaxMessageCountForRecommend() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("max_message_count_for_recommend", 5));
    }

    public Boolean getMiniappPreloadEmptyProcessEnbale() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("miniapp_preload_empty_process_enbale", false));
    }

    public Boolean getMiniappWonderlandEnable() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("miniapp_wonderland_enable", false));
    }

    public Integer getMixPermission() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("mix_permission", 0));
    }

    public Boolean getMtForbidInsertPlaceholderWord() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("mt_forbid_insert_placeholder_word", false));
    }

    public Integer getMtLocalAnalysisHprof() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("mt_local_analysis_hprof", 0));
    }

    public Integer getMtSearchHistoryFoldCount() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("mt_search_history_fold_count", 3));
    }

    public Integer getPosterSrType() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("poster_sr_type", 0));
    }

    public Integer getPushdelayinitSwitch() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("pushdelayinit_switch", 0));
    }

    public Boolean getRealTimeReportEnable() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("real_time_report_enable", true));
    }

    public Integer getSearchHistoryCollapseNum() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("search_history_collapse_num", 4));
    }

    public Integer getSecIdSwitch() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("sec_id_switch", 1));
    }

    public String getShopLinkAnchorDisclaimer() {
        return SettingsManager.m29616a().mo25398a("shop_link_anchor_disclaimer", "");
    }

    public Integer getShowDeviceManagerEntry() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("show_device_manager_entry", 0));
    }

    public Boolean getShowDoulabEntrance() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("show_doulab_entrance", true));
    }

    public Integer getShowFromDuoshanLabel() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("show_from_duoshan_label", 0));
    }

    public Boolean getShowQqdownloaderPrivacyDialog() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("show_qqdownloader_privacy_dialog", false));
    }

    public Boolean getSmartisanDataSharingSwitch() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("smartisan_data_sharing_switch", true));
    }

    public Boolean getStickerUpdateApp() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("sticker_update_app", false));
    }

    public Boolean getSupportFilterErrorFile() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("support_filter_error_file", false));
    }

    public Integer getTcmCtrySettings() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("tcm_ctry_settings", 0));
    }

    public String getTcmNameCtry() {
        return SettingsManager.m29616a().mo25398a("tcm_name_ctry", "TCM");
    }

    public String getUgSecLinkUrl() {
        return SettingsManager.m29616a().mo25398a("ug_sec_link_url", "");
    }

    public Integer getUgShareWebviewSecLevel() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("ug_share_webview_sec_level", 0));
    }

    public Boolean getUseBridgeEngineV2() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("use_bridge_engine_v2", true));
    }

    public Integer getVideoPlayProgressCount() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("video_play_progress_count", 0));
    }

    public String getWikipediaAnchorUrlPlaceholder() {
        return SettingsManager.m29616a().mo25398a("wikipedia_anchor_url_placeholder", "https://%1$s.m.wikipedia.org/wiki/%2$s");
    }

    public Boolean getWithDouplusEntry() {
        return Boolean.valueOf(SettingsManager.m29616a().mo25400a("with_douplus_entry", false));
    }

    public AdFeSettings getAdFeSettings() {
        AdFeSettings adFeSettings = (AdFeSettings) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("ad_fe_settings", AdFeSettings.class);
        if (adFeSettings != null) {
            return adFeSettings;
        }
        throw new C16041a();
    }

    public AdLandingPageConfig getAdLandingPageConfig() {
        AdLandingPageConfig adLandingPageConfig = (AdLandingPageConfig) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("ad_landing_page_config", AdLandingPageConfig.class);
        if (adLandingPageConfig != null) {
            return adLandingPageConfig;
        }
        throw new C16041a();
    }

    public UserAntiAddiction getAddictionSettings() {
        UserAntiAddiction userAntiAddiction = (UserAntiAddiction) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("addiction_settings", UserAntiAddiction.class);
        if (userAntiAddiction != null) {
            return userAntiAddiction;
        }
        throw new C16041a();
    }

    public AgeGateSettings getAgeGateSettings() {
        AgeGateSettings ageGateSettings = (AgeGateSettings) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("age_gate_settings", AgeGateSettings.class);
        if (ageGateSettings != null) {
            return ageGateSettings;
        }
        throw new C16041a();
    }

    public List<String> getApiAlogWhiteList() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("api_alog_white_list");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public AppStoreMessage getAppStoreScore() {
        AppStoreMessage appStoreMessage = (AppStoreMessage) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("app_store_score", AppStoreMessage.class);
        if (appStoreMessage != null) {
            return appStoreMessage;
        }
        throw new C16041a();
    }

    public Long getAutoLiveStateIntervalMills() {
        return Long.valueOf(SettingsManager.m29616a().mo25395a("auto_live_state_interval_mills", 60000L));
    }

    public UgAwemeActivitySetting getAwemeActivitySetting() {
        UgAwemeActivitySetting ugAwemeActivitySetting = (UgAwemeActivitySetting) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("aweme_activity_setting", UgAwemeActivitySetting.class);
        if (ugAwemeActivitySetting != null) {
            return ugAwemeActivitySetting;
        }
        throw new C16041a();
    }

    public AwemeFeEliteItem getAwemeFeElite() {
        AwemeFeEliteItem awemeFeEliteItem = (AwemeFeEliteItem) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("aweme_fe_elite", AwemeFeEliteItem.class);
        if (awemeFeEliteItem != null) {
            return awemeFeEliteItem;
        }
        throw new C16041a();
    }

    public List<String> getAwemeHighRiskAreaCode() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("aweme_high_risk_area_code");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public BioSettings getBioSettings() {
        BioSettings bioSettings = (BioSettings) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("bio_settings", BioSettings.class);
        if (bioSettings != null) {
            return bioSettings;
        }
        throw new C16041a();
    }

    public List<String> getCacheCleanDefaultWhiteList() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("cache_clean_default_white_list");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public CommentListAdMigration getCommentListAdMigration() {
        CommentListAdMigration commentListAdMigration = (CommentListAdMigration) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("comment_list_ad_migration", CommentListAdMigration.class);
        if (commentListAdMigration != null) {
            return commentListAdMigration;
        }
        throw new C16041a();
    }

    public CommerceEggConfig getCommerceEggConfig() {
        CommerceEggConfig commerceEggConfig = (CommerceEggConfig) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("commerce_egg_config", CommerceEggConfig.class);
        if (commerceEggConfig != null) {
            return commerceEggConfig;
        }
        throw new C16041a();
    }

    public ContactUploadUiLimits getContactUploadUiLimits() {
        ContactUploadUiLimits contactUploadUiLimits = (ContactUploadUiLimits) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("contact_upload_ui_limits", ContactUploadUiLimits.class);
        if (contactUploadUiLimits != null) {
            return contactUploadUiLimits;
        }
        throw new C16041a();
    }

    public EPlatformSettings getEPlatformSettings() {
        EPlatformSettings ePlatformSettings = (EPlatformSettings) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("e_platform_settings", EPlatformSettings.class);
        if (ePlatformSettings != null) {
            return ePlatformSettings;
        }
        throw new C16041a();
    }

    public EmailLoginSettings getEmailLoginSettings() {
        EmailLoginSettings emailLoginSettings = (EmailLoginSettings) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("email_login_settings", EmailLoginSettings.class);
        if (emailLoginSettings != null) {
            return emailLoginSettings;
        }
        throw new C16041a();
    }

    public FeConfigCollection getFeConfigCollection() {
        FeConfigCollection feConfigCollection = (FeConfigCollection) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("fe_config_collection", FeConfigCollection.class);
        if (feConfigCollection != null) {
            return feConfigCollection;
        }
        throw new C16041a();
    }

    public FeedbackConf getFeedbackConf() {
        FeedbackConf feedbackConf = (FeedbackConf) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("feedback_conf", FeedbackConf.class);
        if (feedbackConf != null) {
            return feedbackConf;
        }
        throw new C16041a();
    }

    public List<String> getFilterColors() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("filter_colors");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public FlexibleUpdateStrategy getFlexibleUpdateStrategy() {
        FlexibleUpdateStrategy flexibleUpdateStrategy = (FlexibleUpdateStrategy) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("flexible_update_strategy", FlexibleUpdateStrategy.class);
        if (flexibleUpdateStrategy != null) {
            return flexibleUpdateStrategy;
        }
        throw new C16041a();
    }

    public FlipChatSettings getFlipchatSettings() {
        FlipChatSettings flipChatSettings = (FlipChatSettings) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("flipchat_settings", FlipChatSettings.class);
        if (flipChatSettings != null) {
            return flipChatSettings;
        }
        throw new C16041a();
    }

    public HotSearchWitch getHotsearchSwitchs() {
        HotSearchWitch hotSearchWitch = (HotSearchWitch) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("hotsearch_switchs", HotSearchWitch.class);
        if (hotSearchWitch != null) {
            return hotSearchWitch;
        }
        throw new C16041a();
    }

    public HybridMonitorConfig getHybridMonitorConfig() {
        HybridMonitorConfig hybridMonitorConfig = (HybridMonitorConfig) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("hybrid_monitor_config", HybridMonitorConfig.class);
        if (hybridMonitorConfig != null) {
            return hybridMonitorConfig;
        }
        throw new C16041a();
    }

    public List<String> getImImageDomains() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("im_image_domains");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public IMUseOkHttpClientConfig getImUseOkhttpclient() {
        IMUseOkHttpClientConfig iMUseOkHttpClientConfig = (IMUseOkHttpClientConfig) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("im_use_okhttpclient", IMUseOkHttpClientConfig.class);
        if (iMUseOkHttpClientConfig != null) {
            return iMUseOkHttpClientConfig;
        }
        throw new C16041a();
    }

    public List<String> getKevaBlacklist() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("keva_blacklist");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public List<String> getLabFeatureIds() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("lab_feature_ids");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public Integer getLightEnhanceThreshold() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("light_enhance_threshold", 50));
    }

    public LikePraiseDialogInfo getLikePraiseDialogInfo() {
        LikePraiseDialogInfo likePraiseDialogInfo = (LikePraiseDialogInfo) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("like_praise_dialog_info", LikePraiseDialogInfo.class);
        if (likePraiseDialogInfo != null) {
            return likePraiseDialogInfo;
        }
        throw new C16041a();
    }

    public LiveCnySetting getLiveCnySettings() {
        LiveCnySetting liveCnySetting = (LiveCnySetting) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("live_cny_settings", LiveCnySetting.class);
        if (liveCnySetting != null) {
            return liveCnySetting;
        }
        throw new C16041a();
    }

    public LiveInnerPushConfig getLiveInnerPushConfig() {
        LiveInnerPushConfig liveInnerPushConfig = (LiveInnerPushConfig) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("live_inner_push_config", LiveInnerPushConfig.class);
        if (liveInnerPushConfig != null) {
            return liveInnerPushConfig;
        }
        throw new C16041a();
    }

    public Integer getMinFollowNumForLandingFollowTab() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("min_follow_num_for_landing_follow_tab", 100));
    }

    public MtcertSettings getMtcertSettings() {
        MtcertSettings mtcertSettings = (MtcertSettings) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("mtcert_settings", MtcertSettings.class);
        if (mtcertSettings != null) {
            return mtcertSettings;
        }
        throw new C16041a();
    }

    public List<String> getPreloadMicroAppList() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("preload_micro_app_list");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public ProAccountEnableDetailInfo getProAccountEnableDetailInfo() {
        ProAccountEnableDetailInfo proAccountEnableDetailInfo = (ProAccountEnableDetailInfo) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("pro_account_enable_detail_info", ProAccountEnableDetailInfo.class);
        if (proAccountEnableDetailInfo != null) {
            return proAccountEnableDetailInfo;
        }
        throw new C16041a();
    }

    public pushGuideInfo getPushGuideInfo() {
        pushGuideInfo pushguideinfo = (pushGuideInfo) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("push_guide_info", pushGuideInfo.class);
        if (pushguideinfo != null) {
            return pushguideinfo;
        }
        throw new C16041a();
    }

    public QuickShopLoadingPage getQuickShopLoadingPage() {
        QuickShopLoadingPage quickShopLoadingPage = (QuickShopLoadingPage) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("quick_shop_loading_page", QuickShopLoadingPage.class);
        if (quickShopLoadingPage != null) {
            return quickShopLoadingPage;
        }
        throw new C16041a();
    }

    public Integer getReadVideoLastGap() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("read_video_last_gap", 200));
    }

    public Long getReusePhoneCheckInterval() {
        return Long.valueOf(SettingsManager.m29616a().mo25395a("reuse_phone_check_interval", 0L));
    }

    public Integer getSearchMiddleRecommendWordsCount() {
        return Integer.valueOf(SettingsManager.m29616a().mo25394a("search_middle_recommend_words_count", 12));
    }

    public SearchPullFeedbackStruct getSearchPullFeedback() {
        SearchPullFeedbackStruct searchPullFeedbackStruct = (SearchPullFeedbackStruct) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("search_pull_feedback", SearchPullFeedbackStruct.class);
        if (searchPullFeedbackStruct != null) {
            return searchPullFeedbackStruct;
        }
        throw new C16041a();
    }

    public ShoppingConfig getShopping() {
        ShoppingConfig shoppingConfig = (ShoppingConfig) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("shopping", ShoppingConfig.class);
        if (shoppingConfig != null) {
            return shoppingConfig;
        }
        throw new C16041a();
    }

    public Long getShowStorageDotSize() {
        return Long.valueOf(SettingsManager.m29616a().mo25395a("show_storage_dot_size", 1073741824L));
    }

    public Long getShowStorageTipSize() {
        return Long.valueOf(SettingsManager.m29616a().mo25395a("show_storage_tip_size", 314572800L));
    }

    public SpringApiLimitConfig getSpringApiLimitConfig() {
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("spring_api_limit_config", SpringApiLimitConfig.class);
        if (springApiLimitConfig != null) {
            return springApiLimitConfig;
        }
        throw new C16041a();
    }

    public SuperEntranceConfig getSuperEntranceConfig() {
        SuperEntranceConfig superEntranceConfig = (SuperEntranceConfig) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("super_entrance_config", SuperEntranceConfig.class);
        if (superEntranceConfig != null) {
            return superEntranceConfig;
        }
        throw new C16041a();
    }

    public UlikeParams getUlikeParams() {
        UlikeParams ulikeParams = (UlikeParams) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("ulike_params", UlikeParams.class);
        if (ulikeParams != null) {
            return ulikeParams;
        }
        throw new C16041a();
    }

    public List<String> getUploadVideoSizeCategory() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("upload_video_size_category");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public VCDV1ConfigStruct getVcdV1ConfigInfo() {
        VCDV1ConfigStruct vCDV1ConfigStruct = (VCDV1ConfigStruct) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("vcd_v1_config_info", VCDV1ConfigStruct.class);
        if (vCDV1ConfigStruct != null) {
            return vCDV1ConfigStruct;
        }
        throw new C16041a();
    }

    public List<String> getVideoSizeCategory() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("video_size_category");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public VisionSearchStruct getVisionSearch() {
        VisionSearchStruct visionSearchStruct = (VisionSearchStruct) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("vision_search", VisionSearchStruct.class);
        if (visionSearchStruct != null) {
            return visionSearchStruct;
        }
        throw new C16041a();
    }

    public List<String> getWebviewCachePoolSwitch() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("webview_cache_pool_switch");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    public List<String> getWebviewCacheUrls() {
        String[] a = SettingsManager.m29616a().getSettingsValueProvider().mo25510a("webview_cache_urls");
        if (a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a);
        return arrayList;
    }

    static {
        Covode.recordClassIndex(62365);
    }

    public Boolean getAntiAddictionToastEnable24hourTime() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("anti_addiction_toast_enable_24hour_time", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("anti_addiction_toast_enable_24hour_time")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public List<OriginChannelTab> getChannelTabs() {
        OriginChannelTab[] originChannelTabArr = (OriginChannelTab[]) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("channel_tabs", OriginChannelTab[].class);
        if (originChannelTabArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, originChannelTabArr);
        return arrayList;
    }

    public Boolean getCleanShareFiles() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("clean_share_files", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("clean_share_files")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public String getCommentFilterTipsSupported() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        String c = settingsValueProvider.mo25520c("comment_filter_tips_supported", "_");
        if (!"_".equals(c) || settingsValueProvider.mo25521c("comment_filter_tips_supported")) {
            return c;
        }
        throw new C16041a();
    }

    public List<ContentLanguageGuideSetting> getContentLanguageGuideCodes() {
        ContentLanguageGuideSetting[] contentLanguageGuideSettingArr = (ContentLanguageGuideSetting[]) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("content_language_guide_codes", ContentLanguageGuideSetting[].class);
        if (contentLanguageGuideSettingArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, contentLanguageGuideSettingArr);
        return arrayList;
    }

    public Integer getDataSaverSetting() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("data_saver_setting", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("data_saver_setting")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableDelayAbSdkRequest() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_delay_ab_sdk_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_delay_ab_sdk_request")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableDelayAppAlertRequest() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_delay_app_alert_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_delay_app_alert_request")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableDelayFetchSamecityActiveRequest() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_delay_fetch_samecity_active_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_delay_fetch_samecity_active_request")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableDelayFetchShareSettingRequest() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_delay_fetch_share_setting_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_delay_fetch_share_setting_request")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableDelayFetchUserRequest() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_delay_fetch_user_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_delay_fetch_user_request")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableDelaySecReport() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_delay_sec_report", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_delay_sec_report")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableDelayTokenBeatRequest() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_delay_token_beat_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_delay_token_beat_request")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableDelayWsRequest() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_delay_ws_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_delay_ws_request")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableDvmLinearAllocOpt() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_dvm_linear_alloc_opt", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_dvm_linear_alloc_opt")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableImMessageFullFeedSlide() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_im_message_full_feed_slide", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_im_message_full_feed_slide")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDisableOmSdk() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("disable_om_sdk", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("disable_om_sdk")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getDiscardRefreshTopDsp() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("discard_refresh_top_dsp", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("discard_refresh_top_dsp")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public List<DouplusTextStruct> getDouplusEntryTitle() {
        DouplusTextStruct[] douplusTextStructArr = (DouplusTextStruct[]) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("douplus_entry_title", DouplusTextStruct[].class);
        if (douplusTextStructArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, douplusTextStructArr);
        return arrayList;
    }

    public Integer getEnable4kImport() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("enable_4k_import", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("enable_4k_import")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getEnableCommerceOrder() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("enable_commerce_order", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("enable_commerce_order")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getEnableDelayRequest() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("enable_delay_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("enable_delay_request")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getEnableDownloadTtData() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("enable_download_tt_data", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("enable_download_tt_data")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getEnableHdH264HwDecoder() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("enable_hd_h264_hw_decoder", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("enable_hd_h264_hw_decoder")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getEnableLocalMusicEntrance() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("enable_local_music_entrance", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("enable_local_music_entrance")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getEnableOnPageSelectPauseCheck() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("enable_on_page_select_pause_check", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("enable_on_page_select_pause_check")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getEnableReuseEditorForFastimport() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("enable_reuse_editor_for_fastimport", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("enable_reuse_editor_for_fastimport")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Integer getFollowTabLiveType() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("follow_tab_live_type", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("follow_tab_live_type")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public String getFreeFlowCardUrlSticker() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        String c = settingsValueProvider.mo25520c("free_flow_card_url_sticker", "_");
        if (!"_".equals(c) || settingsValueProvider.mo25521c("free_flow_card_url_sticker")) {
            return c;
        }
        throw new C16041a();
    }

    public Integer getHdHwDecoderMinSideSize() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("hd_hw_decoder_min_side_size", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("hd_hw_decoder_min_side_size")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public AssociativeEmoticonAll getImAssociativeEmoticonAll() {
        AssociativeEmoticonAll associativeEmoticonAll = (AssociativeEmoticonAll) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("im_associative_emoticon_all", AssociativeEmoticonAll.class);
        if (associativeEmoticonAll != null) {
            return associativeEmoticonAll;
        }
        return new AssociativeEmoticonAll(0, "");
    }

    public Integer getImContactsMultiSelectLimit() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("im_contacts_multi_select_limit", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("im_contacts_multi_select_limit")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public String getImUrlTemplate() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        String c = settingsValueProvider.mo25520c("im_url_template", "_");
        if (!"_".equals(c) || settingsValueProvider.mo25521c("im_url_template")) {
            return c;
        }
        throw new C16041a();
    }

    public String getImpressionPageSchema() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        String c = settingsValueProvider.mo25520c("impression_page_schema", "_");
        if (!"_".equals(c) || settingsValueProvider.mo25521c("impression_page_schema")) {
            return c;
        }
        throw new C16041a();
    }

    public Integer getIsEnableSplashFirstShowRetrieval() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("is_enable_splash_first_show_retrieval", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("is_enable_splash_first_show_retrieval")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Integer getLocalVideoCacheMaxAge() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("local_video_cache_max_age", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("local_video_cache_max_age")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Integer getLocalVideoCacheMaxLength() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("local_video_cache_max_length", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("local_video_cache_max_length")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Integer getMiniappPreloadEnbale() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("miniapp_preload_enbale", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("miniapp_preload_enbale")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public String getMovieDetail() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        String c = settingsValueProvider.mo25520c("movie_detail", "_");
        if (!"_".equals(c) || settingsValueProvider.mo25521c("movie_detail")) {
            return c;
        }
        throw new C16041a();
    }

    public Integer getMusicianShowType() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("musician_show_type", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("musician_show_type")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public List<Integer> getOneBindNetSetting() {
        Integer[] numArr = (Integer[]) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("one_bind_net_setting", Integer[].class);
        if (numArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, numArr);
        return arrayList;
    }

    public Integer getOpenImLink() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("open_im_link", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("open_im_link")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public String getOrginalMusicianUrl() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        String c = settingsValueProvider.mo25520c("orginal_musician_url", "_");
        if (!"_".equals(c) || settingsValueProvider.mo25521c("orginal_musician_url")) {
            return c;
        }
        throw new C16041a();
    }

    public Boolean getOriginalMusicianEntry() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("original_musician_entry", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("original_musician_entry")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getProfilePageSkipRemove() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("profile_page_skip_remove", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("profile_page_skip_remove")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getShieldMusicSdk() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("shield_music_sdk", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("shield_music_sdk")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getShowMusicFeedbackEntrance() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("show_music_feedback_entrance", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("show_music_feedback_entrance")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getShowRocketShareIfInstall() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("show_rocket_share_if_install", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("show_rocket_share_if_install")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public List<WhatsAppCodeItem> getShowWhatsappByCallingCode() {
        WhatsAppCodeItem[] whatsAppCodeItemArr = (WhatsAppCodeItem[]) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("show_whatsapp_by_calling_code", WhatsAppCodeItem[].class);
        if (whatsAppCodeItemArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, whatsAppCodeItemArr);
        return arrayList;
    }

    public Boolean getSilentShareConfigurable() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("silent_share_configurable", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("silent_share_configurable")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public List<ShareChannelSettings> getSilentShareList() {
        ShareChannelSettings[] shareChannelSettingsArr = (ShareChannelSettings[]) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("silent_share_list", ShareChannelSettings[].class);
        if (shareChannelSettingsArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, shareChannelSettingsArr);
        return arrayList;
    }

    public Integer getStatisticsBackupPct() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("statistics_backup_pct", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("statistics_backup_pct")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Integer getStoryImagePlayTime() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("story_image_play_time", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("story_image_play_time")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Integer getThirdPartyDataRefresh() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("third_party_data_refresh", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("third_party_data_refresh")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public List<Integer> getThirdpartyLoginBindSkip() {
        Integer[] numArr = (Integer[]) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("thirdparty_login_bind_skip", Integer[].class);
        if (numArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, numArr);
        return arrayList;
    }

    public Integer getUploadContactsNoticeInterval() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("upload_contacts_notice_interval", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("upload_contacts_notice_interval")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Integer getUploadContactsNoticeTimes() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("upload_contacts_notice_times", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("upload_contacts_notice_times")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public Boolean getUseRightSwipeBack() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.mo25517b("use_right_swipe_back", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.mo25521c("use_right_swipe_back")) {
            return valueOf;
        }
        throw new C16041a();
    }

    public List<Float> getVideoBitrateCategory() {
        Float[] fArr = (Float[]) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("video_bitrate_category", Float[].class);
        if (fArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        return arrayList;
    }

    public List<Integer> getVideoQualityCategory() {
        Integer[] numArr = (Integer[]) SettingsManager.m29616a().getSettingsValueProvider().mo25503a("video_quality_category", Integer[].class);
        if (numArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, numArr);
        return arrayList;
    }

    public Integer getWsUseNewSdk() {
        AbstractC16070i settingsValueProvider = SettingsManager.m29616a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.mo25513b("ws_use_new_sdk", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.mo25521c("ws_use_new_sdk")) {
            return valueOf;
        }
        throw new C16041a();
    }
}
