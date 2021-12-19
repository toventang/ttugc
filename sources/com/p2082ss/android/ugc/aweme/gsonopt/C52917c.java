package com.p2082ss.android.ugc.aweme.gsonopt;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.commerce.C37491d;
import com.p2082ss.android.ugc.aweme.commerce.C37495f;
import com.p2082ss.android.ugc.aweme.commerce.C37497h;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.music.C60836o;
import com.p2082ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.p2082ss.android.ugc.aweme.profile.model.AgeGateInfo;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.p2082ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p2082ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.p2082ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.EffectArtistDetail;
import com.p2082ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.p2082ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p2082ss.android.ugc.aweme.profile.model.HonorStruct;
import com.p2082ss.android.ugc.aweme.profile.model.HotListStruct;
import com.p2082ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;
import com.p2082ss.android.ugc.aweme.profile.model.LiveAnchorInfo;
import com.p2082ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.p2082ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.p2082ss.android.ugc.aweme.profile.model.PrivacySetting;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.p2082ss.android.ugc.aweme.profile.model.QuickShopInfo;
import com.p2082ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.p2082ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.p2082ss.android.ugc.aweme.profile.model.TabSetting;
import com.p2082ss.android.ugc.aweme.profile.model.UnReadVideoInfo;
import com.p2082ss.android.ugc.aweme.profile.model.UrgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.model.UserAwemeCover;
import com.p2082ss.android.ugc.aweme.profile.model.UserBioPermission;
import com.p2082ss.android.ugc.aweme.profile.model.UserHonor;
import com.p2082ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.p2082ss.android.ugc.aweme.profile.model.UserRateRemindInfo;
import com.p2082ss.android.ugc.aweme.profile.model.VideoCover;
import com.p2082ss.android.ugc.aweme.utils.StringJsonAdapterFactory;

/* renamed from: com.ss.android.ugc.aweme.gsonopt.c */
public final class C52917c extends AbstractC52915a {
    static {
        Covode.recordClassIndex(62437);
    }

    public C52917c(C27910f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.gsonopt.AbstractC52915a
    /* renamed from: a */
    public final C52916b mo89308a(String str) {
        switch (str.hashCode()) {
            case -2141396406:
                if (str.equals("item_list")) {
                    return new C52916b("recommendAwemeItems", this.f121697a.mo46663a((C27895a) new C52924j()), false);
                }
                return null;
            case -2140023879:
                if (str.equals("vcd_schema_url")) {
                    return new C52916b("vcdSchemaUrl", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -2120173952:
                if (str.equals("r_fans_group_info")) {
                    return new C52916b("rFansGroupInfo", this.f121697a.mo46665a(RocketFansGroupInfo.class), false);
                }
                return null;
            case -2107390546:
                if (str.equals("follower_count")) {
                    return new C52916b("followerCount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -2095871955:
                if (str.equals("friend_type_str")) {
                    return new C52916b("friendTypeStr", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -2084946265:
                if (str.equals("school_visible")) {
                    return new C52916b("schoolInfoShowRange", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -2084080173:
                if (str.equals("constellation")) {
                    return new C52916b("constellation", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -2000946467:
                if (str.equals("search_highlight")) {
                    return new C52916b("mHighlightInfoList", this.f121697a.mo46663a((C27895a) new C52923i()), false);
                }
                return null;
            case -1990709956:
                if (str.equals("social_data")) {
                    return new C52916b("socialData", this.f121697a.mo46665a(SocialDataStruct.class), false);
                }
                return null;
            case -1990548928:
                if (str.equals("social_info")) {
                    return new C52916b("socialInfo", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1958725841:
                if (str.equals("hide_shoot_button")) {
                    return new C52916b("hideShootButton", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1953654686:
                if (str.equals("age_gate_info")) {
                    return new C52916b("ageGateInfo", this.f121697a.mo46665a(AgeGateInfo.class), false);
                }
                return null;
            case -1953331583:
                if (str.equals("age_gate_time")) {
                    return new C52916b("ageGateTime", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case -1948583756:
                if (str.equals("verify_info")) {
                    return new C52916b("verifyInfo", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1935004580:
                if (str.equals("shield_digg_notice")) {
                    return new C52916b("shieldDiggNotice", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1885024190:
                if (str.equals("avatar_update_reminder")) {
                    return new C52916b("avatarUpdateReminder", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1881328305:
                if (str.equals("recommend_score")) {
                    return new C52916b("recommendScore", this.f121697a.mo46665a(Double.class), true);
                }
                return null;
            case -1809107271:
                if (str.equals("star_billboard_rank")) {
                    return new C52916b("starBillboardRank", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1801198654:
                if (str.equals("mutual_relation_avatars")) {
                    return new C52916b("mutualRelationAvatars", this.f121697a.mo46663a((C27895a) new C52918d()), false);
                }
                return null;
            case -1789714431:
                if (str.equals("pronouns_info")) {
                    return new C52916b("mPronounsInfo", this.f121697a.mo46665a(UserPronounsInfo.class), false);
                }
                return null;
            case -1788288754:
                if (str.equals("share_info")) {
                    return new C52916b("shareInfo", this.f121697a.mo46665a(ShareInfo.class), false);
                }
                return null;
            case -1729386817:
                if (str.equals("effect_detail")) {
                    return new C52916b("effectArtistDetail", this.f121697a.mo46665a(EffectArtistDetail.class), false);
                }
                return null;
            case -1724546052:
                if (str.equals("description")) {
                    return new C52916b("adAuthorDesc", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1700983166:
                if (str.equals("is_phone_binded")) {
                    return new C52916b("isPhoneBinded", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1687280775:
                if (str.equals("youtube_refresh_token")) {
                    return new C52916b("youTubeRefreshToken", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1674581204:
                if (str.equals("biz_account_info")) {
                    return new C52916b("bizAccountInfo", this.f121697a.mo46665a(C37491d.class), false);
                }
                return null;
            case -1621888634:
                if (str.equals("general_permission")) {
                    return new C52916b("mGeneralPermission", this.f121697a.mo46665a(GeneralPermission.class), false);
                }
                return null;
            case -1618184771:
                if (str.equals("video_icon")) {
                    return new C52916b("avatarVideoUri", this.f121697a.mo46665a(UrlModel.class), false);
                }
                return null;
            case -1613589672:
                if (str.equals("language")) {
                    return new C52916b("language", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1604804401:
                if (str.equals("anchor_schedule_guide_txt")) {
                    return new C52916b("anchorScheduleGuideTxt", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1596658159:
                if (str.equals("duet_setting")) {
                    return new C52916b("duetSetting", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1571613217:
                if (str.equals("cancel_type")) {
                    return new C52916b("cancelType", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1554168724:
                if (str.equals("enterprise_verify_reason")) {
                    return new C52916b("enterpriseVerifyReason", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1544567816:
                if (str.equals("anchor_info")) {
                    return new C52916b("liveAnchorInfo", this.f121697a.mo46665a(LiveAnchorInfo.class), false);
                }
                return null;
            case -1540093218:
                if (str.equals("verification_type")) {
                    return new C52916b("verificationType", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1515073182:
                if (str.equals("watch_status")) {
                    return new C52916b("watchStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1515021930:
                if (str.equals("pro_account_tcm_red_dot")) {
                    return new C52916b("proAccountTcmRedDot", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1509539404:
                if (str.equals("ad_cover_title")) {
                    return new C52916b("adCoverTitle", this.f121697a.mo46665a(AdCoverTitle.class), false);
                }
                return null;
            case -1487939668:
                if (str.equals("xmas_unlock_count")) {
                    return new C52916b("xmasUnlockCount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1481385228:
                if (str.equals("hide_following_follower_list")) {
                    return new C52916b("hideFollowingFollowerList", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1455607391:
                if (str.equals("display_qna_on_profile")) {
                    return new C52916b("displayQnaOnProfile", this.f121697a.mo46665a(Integer.class), false);
                }
                return null;
            case -1425754930:
                if (str.equals("live_commerce")) {
                    return new C52916b("liveCommerce", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1425607570:
                if (str.equals("notify_minor_private_policy")) {
                    return new C52916b("notifyPrivatePolicy", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1401557392:
                if (str.equals("iso_country_code")) {
                    return new C52916b("isoCountryCode", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1390325818:
                if (str.equals("register_from")) {
                    return new C52916b("registerFrom", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1389917463:
                if (str.equals("register_time")) {
                    return new C52916b("registerTime", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case -1385872638:
                if (str.equals("with_shop_entry")) {
                    return new C52916b("withShopEntry", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1360830533:
                if (str.equals("followers_detail")) {
                    return new C52916b("followerDetailList", this.f121697a.mo46663a((C27895a) new C52921g()), false);
                }
                return null;
            case -1315374323:
                if (str.equals("total_favorited")) {
                    return new C52916b("totalFavorited", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case -1310057834:
                if (str.equals("post_default_download_setting")) {
                    return new C52916b("postDefaultDownloadSetting", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1299743763:
                if (str.equals("enable_direct_message")) {
                    return new C52916b("enableDirectMessage", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1294599087:
                if (str.equals("white_cover_url")) {
                    return new C52916b("whiteCoverUrl", this.f121697a.mo46663a((C27895a) new C52918d()), false);
                }
                return null;
            case -1291329255:
                if (str.equals("events")) {
                    return new C52916b("mLiveEventStructList", this.f121697a.mo46663a((C27895a) new C52919e()), false);
                }
                return null;
            case -1264538886:
                if (str.equals("verification_badge_type")) {
                    return new C52916b("verificationBadgeType", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1225133476:
                if (str.equals("is_private_account")) {
                    return new C52916b("isPrivateAccount", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1211434241:
                if (str.equals("playlist_status")) {
                    return new C52916b("mixListStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1183798516:
                if (str.equals("ins_id")) {
                    return new C52916b("insId", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1178642247:
                if (str.equals("comment_filter_status")) {
                    return new C52916b("commentFilterStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1136538083:
                if (str.equals("force_private_account")) {
                    return new C52916b("forcePrivateAccount", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1118564934:
                if (str.equals("collect_count")) {
                    return new C52916b("collectCount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1118396397:
                if (str.equals("shoutouts_status")) {
                    return new C52916b("shoutoutsStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -1113131005:
                if (str.equals("message_chat_entry")) {
                    return new C52916b("showMessageButton", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1102635940:
                if (str.equals("profile_pv")) {
                    return new C52916b("profilePv", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case -1087070801:
                if (str.equals("type_label")) {
                    return new C52916b("typeLabels", this.f121697a.mo46665a(long[].class), false);
                }
                return null;
            case -1073723392:
                if (str.equals("life_story_block")) {
                    return new C52916b("storyBlockInfo", this.f121697a.mo46665a(StoryBlockInfo.class), false);
                }
                return null;
            case -1067878258:
                if (str.equals("room_data")) {
                    return new C52916b("roomData", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -1065227554:
                if (str.equals("douplus_old_user")) {
                    return new C52916b("isOldDouplusUser", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1055767415:
                if (str.equals("can_set_geofencing")) {
                    return new C52916b("canSetGeoFencing", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -1054604988:
                if (str.equals("enterprise_user_info")) {
                    return new C52916b("enterpriseUserInfo", mo89307a(new StringJsonAdapterFactory(), C37497h.class), false);
                }
                return null;
            case -1028675226:
                if (str.equals("bio_permission")) {
                    return new C52916b("bioPermission", this.f121697a.mo46665a(UserBioPermission.class), false);
                }
                return null;
            case -987485392:
                if (str.equals("province")) {
                    return new C52916b("province", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -980688722:
                if (str.equals("search_user_desc")) {
                    return new C52916b("searchUserDesc", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -980394840:
                if (str.equals("search_user_name")) {
                    return new C52916b("searchUserName", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -970201715:
                if (str.equals("tab_settings")) {
                    return new C52916b("tabSetting", this.f121697a.mo46665a(TabSetting.class), false);
                }
                return null;
            case -955713949:
                if (str.equals("third_name")) {
                    return new C52916b("thirdName", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -935743551:
                if (str.equals("with_item_commerce_entry")) {
                    return new C52916b("withItemCommerceEntry", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -934795532:
                if (str.equals("region")) {
                    return new C52916b("region", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -906277200:
                if (str.equals("secret")) {
                    return new C52916b("secret", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -898399019:
                if (str.equals("urge_detail")) {
                    return new C52916b("urgeDetail", this.f121697a.mo46665a(UrgeStruct.class), false);
                }
                return null;
            case -880202922:
                if (str.equals("avatar_decoration")) {
                    return new C52916b("avatarDecoration", this.f121697a.mo46665a(AvatarDecoration.class), false);
                }
                return null;
            case -877946734:
                if (str.equals("should_write_impr")) {
                    return new C52916b("shouldWriteImpr", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -874569851:
                if (str.equals("has_facebook_token")) {
                    return new C52916b("hasFacebookToken", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -859563817:
                if (str.equals("twitter_name")) {
                    return new C52916b("twitterName", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -813930103:
                if (str.equals("rec_type")) {
                    return new C52916b("recType", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -812763377:
                if (str.equals("prevent_download")) {
                    return new C52916b("preventDownload", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -801606716:
                if (str.equals("homepage_bottom_toast")) {
                    return new C52916b("homepageBottomToast", this.f121697a.mo46663a((C27895a) new C52927m()), false);
                }
                return null;
            case -800221974:
                if (str.equals("age_gate_action")) {
                    return new C52916b("ageGateAction", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -751091740:
                if (str.equals("content_language_already_popup")) {
                    return new C52916b("isContentLanguageDialogShown", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -745704582:
                if (str.equals("profile_tab_type")) {
                    return new C52916b("tabType", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -720364372:
                if (str.equals("need_points")) {
                    return new C52916b("needPoints", this.f121697a.mo46663a((C27895a) new C52926l()), false);
                }
                return null;
            case -712365810:
                if (str.equals("mutual_relation_num")) {
                    return new C52916b("mutualRelationNumber", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -712360670:
                if (str.equals("mutual_relation_tag")) {
                    return new C52916b("mutualRelationTag", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -690358626:
                if (str.equals("youtube_last_refresh_time")) {
                    return new C52916b("youTubeLastRefreshTime", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case -688758211:
                if (str.equals("avatar_larger")) {
                    return new C52916b("avatarLarger", this.f121697a.mo46665a(UrlModel.class), false);
                }
                return null;
            case -656849637:
                if (str.equals("avatar_medium")) {
                    return new C52916b("avatarMedium", this.f121697a.mo46665a(UrlModel.class), false);
                }
                return null;
            case -652446311:
                if (str.equals("download_setting")) {
                    return new C52916b("downloadSetting", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -624934883:
                if (str.equals("video_gift_status")) {
                    return new C52916b("videoGiftStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -601407516:
                if (str.equals("block_status")) {
                    return new C52916b("blockStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -571048290:
                if (str.equals("with_douplus_entry")) {
                    return new C52916b("withDouplusEntry", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -568807568:
                if (str.equals("avatar_thumb")) {
                    return new C52916b("avatarThumb", this.f121697a.mo46665a(UrlModel.class), false);
                }
                return null;
            case -538310583:
                if (str.equals("unique_id")) {
                    return new C52916b("uniqueId", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -526326590:
                if (str.equals("stitch_setting")) {
                    return new C52916b("stitchSetting", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -515940741:
                if (str.equals("notify_private_account")) {
                    return new C52916b("notifyPrivateAccount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -508975030:
                if (str.equals("show_effect_list")) {
                    return new C52916b("showEffectList", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -502553757:
                if (str.equals("honor_info")) {
                    return new C52916b("honorStruct", this.f121697a.mo46665a(HonorStruct.class), false);
                }
                return null;
            case -493574096:
                if (str.equals("create_time")) {
                    return new C52916b("createTime", this.f121697a.mo46665a(Long.class), false);
                }
                return null;
            case -485378688:
                if (str.equals("pay_grade")) {
                    return new C52916b("userHonor", this.f121697a.mo46665a(UserHonor.class), false);
                }
                return null;
            case -481549195:
                if (str.equals("registerStatus")) {
                    return new C52916b("registerStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -479476846:
                if (str.equals("commerce_info")) {
                    return new C52916b("commerceInfo", this.f121697a.mo46665a(C37495f.class), false);
                }
                return null;
            case -442503373:
                if (str.equals("follower_status")) {
                    return new C52916b("followerStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -417519034:
                if (str.equals("name_field")) {
                    return new C52916b("nameField", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -409569971:
                if (str.equals("sprint_support_user_info")) {
                    return new C52916b("sprintSupportUserInfo", this.f121697a.mo46665a(HotSearchSprintStruct.class), false);
                }
                return null;
            case -342504514:
                if (str.equals("short_id")) {
                    return new C52916b("shortId", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -290756696:
                if (str.equals("education")) {
                    return new C52916b("education", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -290620080:
                if (str.equals("hot_list")) {
                    return new C52916b("mHotListStruct", this.f121697a.mo46665a(HotListStruct.class), false);
                }
                return null;
            case -271209848:
                if (str.equals("show_artist_playlist")) {
                    return new C52916b("showArtistPlaylist", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -255577734:
                if (str.equals("video_unread_info")) {
                    return new C52916b("unReadVideoInfo", this.f121697a.mo46665a(UnReadVideoInfo.class), false);
                }
                return null;
            case -249774923:
                if (str.equals("user_period")) {
                    return new C52916b("userPeriod", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -241577870:
                if (str.equals("complete_profile_guide_strategy")) {
                    return new C52916b("completeProfileGuideStrategy", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -218847220:
                if (str.equals("mixListNum")) {
                    return new C52916b("mixListNum", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -200000462:
                if (str.equals("profile_completion")) {
                    return new C52916b("profileCompletion", this.f121697a.mo46665a(Float.class), true);
                }
                return null;
            case -180337243:
                if (str.equals("bio_email")) {
                    return new C52916b("bioEmail", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -170313865:
                if (str.equals("bio_phone")) {
                    return new C52916b("bioPhone", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -107434568:
                if (str.equals("bio_url")) {
                    return new C52916b("bioUrl", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -89527382:
                if (str.equals("with_star_atlas_entry")) {
                    return new C52916b("withStarAtlasEntry", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -79766337:
                if (str.equals("original_musician")) {
                    return new C52916b("originalMusician", this.f121697a.mo46665a(C60836o.class), false);
                }
                return null;
            case -75701030:
                if (str.equals("mAtType")) {
                    return new C52916b("mAtType", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -74098991:
                if (str.equals("youtube_expire_time")) {
                    return new C52916b("youtubeExpireTime", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case -72622451:
                if (str.equals("user_canceled")) {
                    return new C52916b("userCancelled", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -72255446:
                if (str.equals("contacts_sync_status")) {
                    return new C52916b("contactsSyncStatus", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case -68630535:
                if (str.equals("room_type_tag")) {
                    return new C52916b("roomTypeTag", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -65183979:
                if (str.equals("forward_count")) {
                    return new C52916b("repostCount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case -58995097:
                if (str.equals("twitter_id")) {
                    return new C52916b("twitterId", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case -18487744:
                if (str.equals("avatar_pendant_larger")) {
                    return new C52916b("avatarPendantLarger", this.f121697a.mo46665a(UrlModel.class), false);
                }
                return null;
            case 112909:
                if (str.equals("rid")) {
                    return new C52916b("requestId", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 115792:
                if (str.equals("uid")) {
                    return new C52916b("uid", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 3053931:
                if (str.equals("city")) {
                    return new C52916b("cityName", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 11461418:
                if (str.equals("show_user_ban_dialog")) {
                    return new C52916b("showUserBanDialog", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 13420830:
                if (str.equals("avatar_pendant_medium")) {
                    return new C52916b("avatarPendantMedium", this.f121697a.mo46665a(UrlModel.class), false);
                }
                return null;
            case 13790513:
                if (str.equals("normal_top_comment_permission")) {
                    return new C52916b("normalTopCommentPermission", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 17069893:
                if (str.equals("hide_search")) {
                    return new C52916b("hideSearch", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 34400533:
                if (str.equals("with_commerce_enterprise_tab_entry")) {
                    return new C52916b("withCommerceEnterpriseTabEntry", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 40914635:
                if (str.equals("analytics_status")) {
                    return new C52916b("hasAnalyticsMetrics", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 50511102:
                if (str.equals("category")) {
                    return new C52916b("category", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 57304503:
                if (str.equals("has_email")) {
                    return new C52916b("hasEmail", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 70438958:
                if (str.equals("friend_count")) {
                    return new C52916b("friendCount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 70690926:
                if (str.equals("nickname")) {
                    return new C52916b("nickname", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 96619420:
                if (str.equals("email")) {
                    return new C52916b("email", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 106772540:
                if (str.equals("unique_id_modify_time")) {
                    return new C52916b("unique_id_modify_time", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case 108801336:
                if (str.equals("is_block")) {
                    return new C52916b("isBlock", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 109542336:
                if (str.equals("is_email_verified")) {
                    return new C52916b("isEmailVerified", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 112524457:
                if (str.equals("favoriting_count")) {
                    return new C52916b("favoritingCount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 211298865:
                if (str.equals("tw_expire_time")) {
                    return new C52916b("twExpireTime", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case 240621757:
                if (str.equals("user_rate_remind_info")) {
                    return new C52916b("userRateRemindInfo", this.f121697a.mo46665a(UserRateRemindInfo.class), false);
                }
                return null;
            case 286660723:
                if (str.equals("youtube_channel_id")) {
                    return new C52916b("youtubeChannelId", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 288961422:
                if (str.equals("district")) {
                    return new C52916b("district", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 299444286:
                if (str.equals("commerce_user_info")) {
                    return new C52916b("commerceUserInfo", this.f121697a.mo46665a(CommerceUserInfo.class), false);
                }
                return null;
            case 339324311:
                if (str.equals("user_mode")) {
                    return new C52916b("userMode", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 339460308:
                if (str.equals("user_rate")) {
                    return new C52916b("userRate", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 346692344:
                if (str.equals("predicted_age_group")) {
                    return new C52916b("predictedAgeGroup", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 347638748:
                if (str.equals("is_ad_fake")) {
                    return new C52916b("isAdFake", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 387319941:
                if (str.equals("quick_shop_info")) {
                    return new C52916b("quickShopInfo", this.f121697a.mo46665a(QuickShopInfo.class), false);
                }
                return null;
            case 411489521:
                if (str.equals("room_id_str")) {
                    return new C52916b("roomIdStr", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 454391455:
                if (str.equals("relation_ship")) {
                    return new C52916b("relationShip", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 458536417:
                if (str.equals("following_count")) {
                    return new C52916b("followingCount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 532303174:
                if (str.equals("isNewRecommend")) {
                    return new C52916b("isNewRecommend", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 546431750:
                if (str.equals("is_pro_account")) {
                    return new C52916b("isProAccount", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 555936345:
                if (str.equals("enable_subscription")) {
                    return new C52916b("enableSubscription", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 561192717:
                if (str.equals("avatar_pendant_thumb")) {
                    return new C52916b("avatarPendantThumb", this.f121697a.mo46665a(UrlModel.class), false);
                }
                return null;
            case 565680874:
                if (str.equals("fb_expire_time")) {
                    return new C52916b("fbExpireTime", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case 583435343:
                if (str.equals("is_translator")) {
                    return new C52916b("isTranslator", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 585629423:
                if (str.equals("ad_virtual")) {
                    return new C52916b("isAdVirtual", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 594541646:
                if (str.equals("shield_comment_notice")) {
                    return new C52916b("shieldCommentNotice", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 615770241:
                if (str.equals("age_gate_post_action")) {
                    return new C52916b("ageGatePostAction", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 619619035:
                if (str.equals("private_aweme_count")) {
                    return new C52916b("privateAwemeCount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 642718792:
                if (str.equals("ad_order_id")) {
                    return new C52916b("adOrderId", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 644483340:
                if (str.equals("show_tip_entry")) {
                    return new C52916b("showTipEntry", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 695355892:
                if (str.equals("commerce_user_level")) {
                    return new C52916b("commerceUserLevel", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 763686755:
                if (str.equals("can_modify_school_info")) {
                    return new C52916b("canModifySchoolInfo", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 820775883:
                if (str.equals("ad_cover_url")) {
                    return new C52916b("adCoverUrl", this.f121697a.mo46663a((C27895a) new C52918d()), false);
                }
                return null;
            case 826948934:
                if (str.equals("account_region")) {
                    return new C52916b("accountRegion", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 879732277:
                if (str.equals("need_addr_card")) {
                    return new C52916b("needAddrCard", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 932059910:
                if (str.equals("platform_sync_info")) {
                    return new C52916b("platformInfos", this.f121697a.mo46665a(PlatformInfo[].class), false);
                }
                return null;
            case 943699016:
                if (str.equals("has_twitter_token")) {
                    return new C52916b("hasTwitterToken", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 957831062:
                if (str.equals("country")) {
                    return new C52916b("country", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 960777111:
                if (str.equals("aweme_count")) {
                    return new C52916b("awemeCount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 960777791:
                if (str.equals("aweme_cover")) {
                    return new C52916b("awemeCover", this.f121697a.mo46665a(UserAwemeCover.class), false);
                }
                return null;
            case 985976065:
                if (str.equals("qa_status")) {
                    return new C52916b("qnaStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 990239621:
                if (str.equals("accept_private_policy")) {
                    return new C52916b("acceptPrivatePolicy", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1000427603:
                if (str.equals("need_recommend")) {
                    return new C52916b("needRecommend", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1012728987:
                if (str.equals("allowStatus")) {
                    return new C52916b("allowStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1028143168:
                if (str.equals("follow_status")) {
                    return new C52916b("followStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1052233881:
                if (str.equals("privacy_setting")) {
                    return new C52916b("privacySetting", this.f121697a.mo46665a(PrivacySetting.class), false);
                }
                return null;
            case 1058644030:
                if (str.equals("bio_secure_url")) {
                    return new C52916b("bioSecureUrl", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1069376125:
                if (str.equals("birthday")) {
                    return new C52916b("birthday", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1073584312:
                if (str.equals("signature")) {
                    return new C52916b("signature", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1080577994:
                if (str.equals("badge_info")) {
                    return new C52916b("mProfileBadgeStruct", this.f121697a.mo46665a(ProfileBadgeStruct.class), false);
                }
                return null;
            case 1091441164:
                if (str.equals("account_type")) {
                    return new C52916b("accountType", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1104050943:
                if (str.equals("signature_language")) {
                    return new C52916b("signatureLanguage", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1120251417:
                if (str.equals("matched_friend")) {
                    return new C52916b("matchedFriendStruct", this.f121697a.mo46665a(MatchedFriendStruct.class), false);
                }
                return null;
            case 1120576213:
                if (str.equals("relative_users")) {
                    return new C52916b("relativeUserInfos", this.f121697a.mo46663a((C27895a) new C52922h()), false);
                }
                return null;
            case 1120628639:
                if (str.equals("show_favorite_list")) {
                    return new C52916b("showFavoriteList", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1133720929:
                if (str.equals("display_wvalantine_activity_entry")) {
                    return new C52916b("displayWvalantineActivityEntry", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1194553073:
                if (str.equals("relation_label")) {
                    return new C52916b("relationLabel", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1211562848:
                if (str.equals("is_effect_artist")) {
                    return new C52916b("isEffectArtist", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1221969527:
                if (str.equals("live_agreement")) {
                    return new C52916b("liveAgreement", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1230430956:
                if (str.equals("bind_phone")) {
                    return new C52916b("bindPhone", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1241278727:
                if (str.equals("custom_verify")) {
                    return new C52916b("customVerify", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1252885563:
                if (str.equals("with_commerce_newbie_task")) {
                    return new C52916b("withCommerceNewbieTask", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1255008083:
                if (str.equals("room_cover")) {
                    return new C52916b("roomCover", this.f121697a.mo46665a(UrlModel.class), false);
                }
                return null;
            case 1256845560:
                if (str.equals("has_youtube_token")) {
                    return new C52916b("hasYoutubeToken", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1264119945:
                if (str.equals("login_platform")) {
                    return new C52916b("loginPlatform", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1270527476:
                if (str.equals("room_title")) {
                    return new C52916b("roomTitle", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1277731658:
                if (str.equals("contact_name")) {
                    return new C52916b("contactName", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1283776167:
                if (str.equals("with_commerce_entry")) {
                    return new C52916b("withCommerceEntry", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1288514147:
                if (str.equals("music_compliance_account")) {
                    return new C52916b("musicComplianceAccount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1358635291:
                if (str.equals("external_recommend_reason")) {
                    return new C52916b("externalRecommendReasonStruct", this.f121697a.mo46665a(ExternalRecommendReasonStruct.class), false);
                }
                return null;
            case 1370702579:
                if (str.equals("video_cover")) {
                    return new C52916b("videoCover", this.f121697a.mo46665a(VideoCover.class), false);
                }
                return null;
            case 1374088806:
                if (str.equals("brand_info")) {
                    return new C52916b("brandInfo", this.f121697a.mo46665a(BlueVBrandInfo.class), false);
                }
                return null;
            case 1374856302:
                if (str.equals("authority_status")) {
                    return new C52916b("authorityStatus", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case 1379892991:
                if (str.equals("room_id")) {
                    return new C52916b("roomId", this.f121697a.mo46665a(Long.class), true);
                }
                return null;
            case 1418717793:
                if (str.equals("cha_list")) {
                    return new C52916b("challengeList", this.f121697a.mo46663a((C27895a) new C52925k()), false);
                }
                return null;
            case 1456751824:
                if (str.equals("shield_follow_notice")) {
                    return new C52916b("shieldFollowNotice", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1478872023:
                if (str.equals("is_blocked")) {
                    return new C52916b("isBlocked", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1495639316:
                if (str.equals("live_push_notification_status")) {
                    return new C52916b("livePushNotificationStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1525037056:
                if (str.equals("youtube_channel_title")) {
                    return new C52916b("youtubeChannelTitle", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1528032884:
                if (str.equals("is_discipline_member")) {
                    return new C52916b("isDisciplineMember", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1536327183:
                if (str.equals("proaccount_update_notification_status")) {
                    return new C52916b("proAccountUpdateNotificationStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1579076896:
                if (str.equals("commerce_permissions")) {
                    return new C52916b("commercePermission", this.f121697a.mo46665a(CommercePermissionStruct.class), false);
                }
                return null;
            case 1596210040:
                if (str.equals("follow_from")) {
                    return new C52916b("followFrom", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1638814131:
                if (str.equals("bold_fields")) {
                    return new C52916b("boldFields", this.f121697a.mo46663a((C27895a) new C52920f()), false);
                }
                return null;
            case 1656674238:
                if (str.equals("with_new_goods")) {
                    return new C52916b("withNewGoods", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1663729878:
                if (str.equals("latest_order_time")) {
                    return new C52916b("latestOrderTime", this.f121697a.mo46665a(Long.class), false);
                }
                return null;
            case 1683831550:
                if (str.equals("yt_raw_token")) {
                    return new C52916b("youtubeRawRefreshToken", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1684784764:
                if (str.equals("story_status")) {
                    return new C52916b("storyStatus", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1713761778:
                if (str.equals("show_image_bubble")) {
                    return new C52916b("showImageBubble", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1717271820:
                if (str.equals("bio_location")) {
                    return new C52916b("bioLocation", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1726606679:
                if (str.equals("nickname_update_reminder")) {
                    return new C52916b("nicknameUpdateReminder", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1730382932:
                if (str.equals("navi_id")) {
                    return new C52916b("naviId", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1781166887:
                if (str.equals("recommend_reason")) {
                    return new C52916b("recommendReason", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1798034544:
                if (str.equals("comment_setting")) {
                    return new C52916b("commentSetting", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1840522208:
                if (str.equals("has_insights")) {
                    return new C52916b("isCreater", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1918208455:
                if (str.equals("mutual_relation")) {
                    return new C52916b("mMutualStruct", this.f121697a.mo46665a(MutualStruct.class), false);
                }
                return null;
            case 1923062090:
                if (str.equals("supporting_ngo")) {
                    return new C52916b("mProfileNgoStruct", this.f121697a.mo46665a(ProfileNgoStruct.class), false);
                }
                return null;
            case 1935054394:
                if (str.equals("follow_from_msg")) {
                    return new C52916b("followFromMsg", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1969626978:
                if (str.equals("sec_uid")) {
                    return new C52916b("secUid", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 1978716326:
                if (str.equals("is_activity_user")) {
                    return new C52916b("isActivityUser", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 1980077287:
                if (str.equals("cover_url")) {
                    return new C52916b("coverUrls", this.f121697a.mo46663a((C27895a) new C52918d()), false);
                }
                return null;
            case 1988146694:
                if (str.equals("mplatform_followers_count")) {
                    return new C52916b("fansCount", this.f121697a.mo46665a(Integer.class), true);
                }
                return null;
            case 1993449450:
                if (str.equals("remark_name")) {
                    return new C52916b("remarkName", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 2005598237:
                if (str.equals("shop_micro_app")) {
                    return new C52916b("shopMicroApp", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            case 2067434538:
                if (str.equals("has_orders")) {
                    return new C52916b("hasOrders", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 2082233415:
                if (str.equals("is_star")) {
                    return new C52916b("isStar", this.f121697a.mo46665a(Boolean.class), true);
                }
                return null;
            case 2121290772:
                if (str.equals("recommend_reason_relation")) {
                    return new C52916b("recommendReasonRelation", this.f121697a.mo46665a(String.class), false);
                }
                return null;
            default:
                return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.gsonopt.AbstractC52915a
    /* renamed from: a */
    public final Object mo89309a() {
        return new User();
    }
}
