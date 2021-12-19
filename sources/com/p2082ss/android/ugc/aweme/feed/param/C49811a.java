package com.p2082ss.android.ugc.aweme.feed.param;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCustomData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.param.a */
public final class C49811a {
    static {
        Covode.recordClassIndex(58918);
    }

    /* renamed from: a */
    public static C49812b m93273a(Activity activity) {
        boolean z;
        int i;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        AnchorCustomData anchorCustomData;
        boolean z4;
        boolean z5;
        Intent intent = activity.getIntent();
        String a = m93274a(intent, "refer");
        String a2 = m93274a(intent, "id");
        String a3 = m93274a(intent, "cid");
        String a4 = m93274a(intent, "like_ids");
        int intExtra = intent.getIntExtra("like_count", 0);
        String a5 = m93274a(intent, "last_group_id");
        String a6 = m93274a(intent, "insert_viewer_ids");
        String a7 = m93274a(intent, "ids");
        String a8 = m93274a(intent, "userid");
        String a9 = m93274a(intent, "sec_userid");
        String a10 = m93274a(intent, "video_from");
        String a11 = m93274a(intent, "video_challenge_profile_from");
        String a12 = m93274a(intent, "music_id");
        String a13 = m93274a(intent, "sticker_id");
        String a14 = m93274a(intent, "challenge_id");
        String a15 = m93274a(intent, "question_id");
        int intExtra2 = intent.getIntExtra("show_answer_question_button", 0);
        String a16 = m93274a(intent, "movie_id");
        String a17 = m93274a(intent, "duet_id");
        String a18 = m93274a(intent, "extra_tutorial_id");
        String a19 = m93274a(intent, "creation_id");
        int intExtra3 = intent.getIntExtra("channel_id", 0);
        String a20 = m93274a(intent, "enter_method");
        String a21 = m93274a(intent, "spu_id");
        int intExtra4 = intent.getIntExtra("rate_type", 1);
        int intExtra5 = intent.getIntExtra("page_size", 20);
        String a22 = m93274a(intent, "promotion_id");
        String a23 = m93274a(intent, "product_id");
        String a24 = m93274a(intent, "carrier_type");
        String a25 = m93274a(intent, "refer_seed_id");
        String a26 = m93274a(intent, "refer_seed_name");
        String a27 = m93274a(intent, "data_type");
        String a28 = m93274a(intent, "entrance_info");
        int intExtra6 = intent.getIntExtra("video_type", -1);
        String a29 = m93274a(intent, "from_uid");
        m93274a(intent, "from_token");
        String a30 = m93274a(intent, "query_aweme_mode");
        String a31 = m93274a(intent, "account_type");
        String a32 = m93274a(intent, "tab_name");
        String a33 = m93274a(intent, "push_params");
        String a34 = m93274a(intent, "like_enter_method");
        String a35 = m93274a(intent, "content_source");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("user_id_list");
        String a36 = m93274a(intent, "is_from_trending_card");
        String a37 = m93274a(intent, "trending_event_id");
        String str3 = "";
        if (a37 == null) {
            a37 = str3;
            str3 = a37;
        }
        String a38 = m93274a(intent, "trending_event_name");
        if (a38 == null) {
            a38 = str3;
        }
        String a39 = m93274a(intent, "enter_from_request_id");
        String a40 = m93274a(intent, "previous_page");
        String a41 = m93274a(intent, "search_keyword");
        String a42 = m93274a(intent, "extra_previous_page_position");
        boolean booleanExtra = intent.getBooleanExtra("from_adsapp_activity", false);
        int intExtra7 = intent.getIntExtra("from_post_list", 0);
        String a43 = m93274a(intent, "extra_parent_tag_id");
        String a44 = m93274a(intent, "related_gid");
        int intExtra8 = intent.getIntExtra(StringSet.type, 0);
        boolean booleanExtra2 = intent.getBooleanExtra("is_recommend", false);
        String a45 = m93274a(intent, "cell_id");
        int intExtra9 = intent.getIntExtra("task_type", 0);
        String a46 = m93274a(intent, "micro_game_station_id");
        String a47 = m93274a(intent, "micro_game_station_hashtag");
        String a48 = m93274a(intent, "extra_hashtag_tagline");
        String a49 = m93274a(intent, "feeds_aweme_id");
        String a50 = m93274a(intent, "hot_search_key");
        String a51 = m93274a(intent, "item_id_list");
        boolean booleanExtra3 = intent.getBooleanExtra("is_hot_search_key", false);
        boolean booleanExtra4 = intent.getBooleanExtra("hot_is_ad", false);
        String a52 = m93274a(intent, "outer_aweme_id");
        int intExtra10 = intent.getIntExtra("micro_game_station_count", 10);
        int intExtra11 = intent.getIntExtra("micro_game_station_cursor", 0);
        String a53 = m93274a(intent, "activity_id");
        String a54 = m93274a(intent, "new_source_type");
        String a55 = m93274a(intent, "new_source_id");
        int intExtra12 = intent.getIntExtra("comment_deleted", 0);
        String a56 = m93274a(intent, "react_session_id");
        String a57 = m93274a(intent, "news_id");
        boolean booleanExtra5 = intent.getBooleanExtra("is_trending", false);
        String a58 = m93274a(intent, "mix_from_order");
        String a59 = m93274a(intent, "process_id");
        boolean booleanExtra6 = intent.getBooleanExtra("isFromSearchTopic", false);
        String a60 = m93274a(intent, "live_enter_method");
        int intExtra13 = intent.getIntExtra("level1_comment_deleted", 0);
        try {
            i = 1;
            if (Integer.parseInt(m93274a(intent, "show_poll")) == 1) {
                z = true;
            } else {
                z = false;
            }
        } catch (Exception unused) {
            i = 1;
            z = false;
        }
        if (intent.getIntExtra("comment_force_open_reply", 0) == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            if (Integer.parseInt(m93274a(intent, "show_poll")) == i) {
                z = true;
            } else {
                z = false;
            }
        } catch (Exception unused2) {
        }
        String a61 = m93274a(intent, "from_group_id");
        String a62 = m93274a(intent, "refer_commodity_id");
        HashMap<String, String> hashMap = new HashMap<>();
        Serializable serializableExtra = intent.getSerializableExtra("feed_param_log_extra");
        if (serializableExtra instanceof String) {
            try {
                hashMap = C49813c.m93275a((String) serializableExtra);
            } catch (Exception e) {
                new StringBuilder("logExtra parser error  = [").append(serializableExtra).append("]");
                e.printStackTrace();
            }
        } else if (serializableExtra instanceof HashMap) {
            hashMap = (HashMap) serializableExtra;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        Serializable serializableExtra2 = intent.getSerializableExtra("feed_param_extra");
        if (serializableExtra2 instanceof HashMap) {
            hashMap2 = (HashMap) serializableExtra2;
        }
        long longExtra = intent.getLongExtra("video_current_position", 0);
        String a63 = m93274a(intent, "tracker_data");
        boolean booleanExtra7 = intent.getBooleanExtra("isChain", false);
        boolean booleanExtra8 = intent.getBooleanExtra("is_from_duet_chain", false);
        try {
            if (!TextUtils.isEmpty(a63)) {
                JSONObject jSONObject = new JSONObject(a63);
                if (jSONObject.has("previous_page")) {
                    a40 = jSONObject.getString("previous_page");
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        String a64 = m93274a(intent, "enter_from");
        if (a64 == null) {
            a64 = str3;
        }
        String a65 = m93274a(intent, "tab_text");
        String a66 = m93274a(intent, "extra_detail_title_text");
        String a67 = m93274a(intent, "extra_category_name");
        int intExtra14 = intent.getIntExtra("detail_cell_type", 0);
        int intExtra15 = intent.getIntExtra("key_has_more", 0);
        boolean booleanExtra9 = intent.getBooleanExtra("video_from_dcd", false);
        String a68 = m93274a(intent, "search_result_id");
        String a69 = m93274a(intent, "list_result_type");
        String a70 = m93274a(intent, "list_item_id");
        String a71 = m93274a(intent, "list_item_id");
        String a72 = m93274a(intent, "search_id");
        String a73 = m93274a(intent, "challenge_id_from_search");
        String a74 = m93274a(intent, "VS_SESSION_ID");
        String a75 = m93274a(intent, "VS_ENTRANCE_TYPE");
        String a76 = m93274a(intent, "VS_ENTER_FROM");
        String a77 = m93274a(intent, "VS_RESULT_ID");
        String a78 = m93274a(intent, "VS_GROUP_ID");
        String a79 = m93274a(intent, "impr_id");
        Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("from_search_live_card", false));
        String a80 = m93274a(intent, "extra_follow_uid_list");
        List<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(a80)) {
            arrayList = Arrays.asList(a80.split("-"));
        }
        String a81 = m93274a(intent, "extra_follow_blue_dot_list");
        List<String> arrayList2 = new ArrayList<>();
        if (!TextUtils.isEmpty(a80)) {
            arrayList2 = Arrays.asList(a81.split("-"));
        }
        String a82 = m93274a(intent, "extra_selected_follow_uid");
        String a83 = m93274a(intent, "extra_author_name");
        boolean booleanExtra10 = intent.getBooleanExtra("extra_has_latest_following_user", false);
        boolean booleanExtra11 = intent.getBooleanExtra("show_donation", false);
        boolean booleanExtra12 = intent.getBooleanExtra("auto_like_comment", false);
        boolean booleanExtra13 = intent.getBooleanExtra("show_reply_panel", false);
        if (!TextUtils.equals(a, "page_challenge_mention") ? a == null : !TextUtils.isEmpty(a64)) {
            a = a64;
        }
        boolean booleanExtra14 = intent.getBooleanExtra("key_from_chat_room_playing", false);
        String a84 = m93274a(intent, "key_from_chat_room_real_aid");
        int intExtra16 = intent.getIntExtra("from_recommend_card", 0);
        boolean booleanExtra15 = intent.getBooleanExtra("extra_key_show_interest_choose", false);
        if (intent.hasExtra("special_topic_region")) {
            str = m93274a(intent, "special_topic_region");
        } else {
            str = str3;
        }
        boolean booleanExtra16 = intent.getBooleanExtra("video_cover_transition", false);
        String a85 = m93274a(intent, "feed_group_id");
        String a86 = m93274a(intent, "share_url_utm_source");
        String a87 = m93274a(intent, "share_url_link_id");
        String a88 = m93274a(intent, "share_url_user_id");
        String a89 = m93274a(intent, "share_sec_url_user_id");
        boolean booleanExtra17 = intent.getBooleanExtra("share_expose_sharer", false);
        String a90 = m93274a(intent, "share_url_checksum");
        String a91 = m93274a(intent, "share_url_timestamp");
        int intExtra17 = intent.getIntExtra("comment_label_type", -1);
        String a92 = m93274a(intent, "comment_label_text");
        String a93 = m93274a(intent, "key_search_type");
        int intExtra18 = intent.getIntExtra("is_new_low_quality_user", 0);
        String a94 = m93274a(intent, "ad_report_reason");
        String a95 = m93274a(intent, "ad_report_reason_type");
        String a96 = m93274a(intent, "msg_extra");
        boolean booleanExtra18 = intent.getBooleanExtra("is_clean_mode", false);
        int intExtra19 = intent.getIntExtra("is_from_video", -1);
        String a97 = m93274a(intent, "playlist_search_id");
        String a98 = m93274a(intent, "feed_adv_id");
        long longExtra2 = intent.getLongExtra("max_cursor", 0);
        int intExtra20 = intent.getIntExtra("story type", 0);
        boolean booleanExtra19 = intent.getBooleanExtra("query_mine_story_from_cache", false);
        boolean booleanExtra20 = intent.getBooleanExtra("feed_transition_enable", false);
        String a99 = m93274a(intent, "key_playlist_previous_page");
        String a100 = m93274a(intent, "key_playlist_from_group_id");
        String a101 = m93274a(intent, "upvote_id");
        Uri data = intent.getData();
        if (data == null || !(data.getHost() + data.getPath()).startsWith("story/detail")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (a6 != null) {
            str2 = a6.substring(1, a6.length() - 1);
        } else {
            str2 = str3;
        }
        int intExtra21 = intent.getIntExtra("story_comment_user_follow_status", -1);
        String a102 = m93274a(intent, "page_poi_id");
        Serializable serializableExtra3 = intent.getSerializableExtra("feed_anchor_custom_data");
        if (serializableExtra3 instanceof AnchorCustomData) {
            anchorCustomData = (AnchorCustomData) serializableExtra3;
        } else {
            anchorCustomData = null;
        }
        String a103 = m93274a(intent, "enter_play_method");
        C49812b ids = new C49812b().setEventType(a).setAid(a2).setCid(a3).setLikeListIds(a4).setLikeCount(intExtra).setLastGroupId(a5).setVid(str2).setCommentLabelText(a92).setCommentLabelType(intExtra17).setIds(a7);
        if (a8 == null) {
            a8 = str3;
        }
        C49812b index = ids.setUid(a8).setSecUid(a9).setFrom(a10).setChallengeProfileFrom(a11).setMusicId(a12).setIsFromTrendingCard(a36).setTrendingEventId(a37).setTrendingName(a38).setStickerId(a13).setChallengeId(a14).setQuestionId(a15).setShowAnswerQuestionButton(intExtra2).setEnterMethodValue(a20).setCategoryName(a67).setSpuId(a21).setRateType(intExtra4).setPageSize(intExtra5).setMvId(a16).setDuetId(a17).setTutorialId(a18).setCreationId(a19).setChannelId(intExtra3).setProductId(a23).setPromotionId(a22).setCarrierType(a24).setReferSeedId(a25).setReferSeedName(a26).setDataType(a27).setEntranceInfo(a28).setVideoType(intExtra6).setShareUserId(a29).setQueryAwemeMode(a30).setAccountType(a31).setUserList(stringArrayListExtra).setTabName(a32).setPushParams(a33).setLikeEnterMethod(a34).setContentSource(a35).setEnterFromRequestId(a39).setPreviousPage(a40).setSearchKeyword(a41).setPreviousPagePosition(a42).setFromAdsActivity(booleanExtra).setRecommend(booleanExtra2).setType(intExtra8).setCellId(a45).setIndex(intent.getIntExtra("index", -1));
        boolean z6 = true;
        if (intExtra7 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        C49812b taskType = index.setFromPostList(z4).setParentTagId(a43).setTaskType(intExtra9);
        if (intExtra9 == 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        C49812b showCommentAfterOpen = taskType.setShowCommentAfterOpen(z5);
        if (intExtra9 != 3) {
            z6 = false;
        }
        C49812b upvoteId = showCommentAfterOpen.setShowShareAfterOpen(z6).setRelatedId(a44).setMicroAppId(a46).setHashTagName(a47).setTagLine(a48).setCount(intExtra10).setFeedsAwemeId(a49).setHotSearch(a50).setItemIdList(a51).setFromHotSearchRanking(booleanExtra3).setCursor(intExtra11).setShowPoll(z).setAdSpot(booleanExtra4).setOutAwemeId(a52).setVideoCurrentPosition(longExtra).setActivityId(a53).setNewSourceType(a54).setNewSourceId(a55).setCommentDeleted(intExtra12).setFromGroupId(a61).setReferCommodityId(a62).setReactSessionId(a56).setTracker(a63).setLevel1CommentDeleted(intExtra13).setCommentForceOpenReply(z2).setChain(booleanExtra7).setIsFromDuetChain(booleanExtra8).setTabText(a65).setDetailTitleText(a66).setCellDetailType(intExtra14).setHotEnterMethod(a64).setNeedShowDonation(booleanExtra11).setMixFromOrder(a58).setTrending(Boolean.valueOf(booleanExtra5)).setProcessId(a59).setVideoFromDcd(booleanExtra9).setSearchResultId(a68).setListResultType(a69).setListItemId(a70).setSearchThirdItemId(a71).setSearchId(a72).setCidFromSearch(a73).setFromSearchLiveCard(valueOf).setSpecialTopicRegion(str).setVideoFromDcd(booleanExtra9).setIsFromChatRoomPlaying(booleanExtra14).setChatRoomPlayingRealAid(a84).setIsFromSearchTopic(booleanExtra6).setUidList(arrayList).setBlueDotList(arrayList2).setSelectedUid(a82).setAuthorName(a83).setHasLatestFollowingUser(booleanExtra10).setHasMore(intExtra15).setEnableDetailActivityVideoCoverTransition(booleanExtra16).setmImprId(a79).setLogExtra(hashMap).setExtra(hashMap2).setFeedGroupIdForMixVideo(a85).setFromRecommendCard(intExtra16).setShowInterestChoose(booleanExtra15).setLiveEnterMethodValue(a60).setVsEnterFrom(a76).setVsSessionId(a74).setVsEntranceType(a75).setVsResultId(a77).setVsGroupId(a78).setShareParamUtmSource(a86).setShareParamLinkId(a87).setShareParamUserId(a88).setShareParamSecUserId(a89).setExposeSharerMsg(booleanExtra17).setShareCheckSum(a90).setShareTimeStamp(a91).setSearchType(a93).setNeedAutoLikeComment(booleanExtra12).setNeedShowReplyPanel(booleanExtra13).setIsNewLowQualityUser(intExtra18).setAdReportReason(a94).setAdReportReasonType(a95).setPlaylistCleanMode(booleanExtra18).setIsFromVideo(intExtra19).setPlaylistSearchId(a97).setAnchorCustomData(anchorCustomData).setPagePoiId(a102).setMaxCursor(longExtra2).setAdvId(a98).setInboxExtra(a96).setStoryType(intExtra20).setStoryPage(z3).setShouldQueryMyStoryFromCache(booleanExtra19).setSupportFeedTransition(booleanExtra20).setCommentUserFollowStatus(intExtra21).setPlaylistPreviousPage(a99).setPlaylistEnterGroupId(a100).setEnterPlayMethod(a103).setNewsId(a57).setUpvoteId(a101);
        C89219l.m154721d(activity, str3);
        C89219l.m154721d(upvoteId, str3);
        Activity a104 = C34729o.m70950a((Context) activity);
        Objects.requireNonNull(a104, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a105 = C1181ae.m3881a((ActivityC0945e) a104, (C1175ad.AbstractC1177b) null).mo3983a(FeedParamProvider.class);
        C89219l.m154716b(a105, str3);
        ((FeedParamProvider) a105).f114582a = upvoteId;
        return upvoteId;
    }

    /* renamed from: a */
    private static String m93274a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
