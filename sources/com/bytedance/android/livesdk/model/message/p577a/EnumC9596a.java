package com.bytedance.android.livesdk.model.message.p577a;

import androidx.p025c.C0498h;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.a.a */
public enum EnumC9596a {
    HELLO("Hello"),
    SETTING("Setting"),
    GET_SETTING("GetSettting"),
    REQUEST_RECONNECT("RequestReconnect"),
    DEFAULT("--default--"),
    DIGG("WebcastDiggMessage"),
    LIKE("WebcastLikeMessage"),
    GIFT("WebcastGiftMessage"),
    SYSTEM("SystemMessage"),
    LINK_CO_HOST_GUIDE("WebcastLinkMicAnchorGuideMessage"),
    LINK_AUDIENCE_NOTICE("WebcastLinkmicAudienceNoticeMessage"),
    HASHTAG("WebcastHashtagMessage"),
    CHAT("WebcastChatMessage"),
    EMOTE_CHAT("WebcastEmoteChatMessage"),
    DONATION_INFO("WebcastDonationInfoMessage"),
    CONTROL("WebcastControlMessage"),
    MEMBER("WebcastMemberMessage"),
    ROOM("WebcastRoomMessage"),
    SOCIAL("WebcastSocialMessage"),
    SCREEN("WebcastScreenChatMessage"),
    NOTICE("NoticeListUnreadCountMessage"),
    ROOM_START("RoomStartMessage"),
    ROOM_NOTIFY("WebcastRoomNotifyMessage"),
    REMIND("WebcastNoticeMessage"),
    DAILY_RANK("WebcastSunDailyRankMessage"),
    ROOM_PUSH("WebcastRoomBottomMessage"),
    DOODLE_GIFT("WebcastDoodleGiftMessage"),
    MODIFY_DECORATION("WebcastDecorationModifyMethodVTwo"),
    MODIFY_STICKER("WebcastStickerModifyMessage"),
    USER_STATS("WebcastUserStatsMessage"),
    IN_ROOM_BANNER_MESSAGE("WebcastInRoomBannerMessage"),
    ROOM_RICH_CHAT_MESSAGE("WebcastSpecialPushMessage"),
    IM_MESSAGE("IESChatMessage"),
    PROMOTION_CARD_MESSAGE("WebcastPushRoomAdCard"),
    BANNER_RED_POINT("WebcastInRoomBannerRedPoint"),
    LINK_MIC("WebcastLinkMicMethod"),
    LINK_MESSAGE("WebcastLinkMessage"),
    WISH_LIST_UPDATE_MESSAGE("WebcastWishlistUpdateMessage"),
    BOTTOM_MESSAGE("WebcastBottomMessage"),
    LINK_MIC_SIGNAL("WebcastLinkMicSignalingMethod"),
    NOTICE_COUNT("NoticeCountMessage"),
    CLOUD_CONTROL("CloudControl"),
    ROOM_IMG_MESSAGE("WebcastRoomImgMessage"),
    BATTLE_MODE("WebcastBattleModeMessage"),
    GAME_QUIZ("WebcastGamblingStatusChangedMessage"),
    LINK_MIC_BATTLE("WebcastLinkMicBattle"),
    LINK_MIC_BATTLE_ARMIES("WebcastLinkMicArmies"),
    LINK_MIC_BATTLE_PUNISH_FINISH("WebcastLinkMicBattlePunishFinish"),
    LINK_MIC_BATTLE_NOTICE("WebcastLinkmicBattleNoticeMessage"),
    LOTTERY_EVENT("WebcastLotteryEventMessage"),
    TURN_TABLE_BURST("WebcastTurntableBurstMessage"),
    COMMON_TOAST("WebcastCommonToastMessage"),
    COMMON_GUIDE("WebcastCommonGuideMessage"),
    GIFT_UPDATE("WebcastGiftUpdateMessage"),
    LUCKY_BOX("WebcastLuckyBoxMessage"),
    COMMENT_IMAGE("WebcastCommentsMessage"),
    FANS_CLUB_STATISTICS("WebcastFansclubStatisticsMessage"),
    USER_SEQ("WebcastRoomUserSeqMessage"),
    LIVE_SHOPPING("WebcastLiveShoppingMessage"),
    FANS_CLUB("WebcastFansclubMessage"),
    CREATE_RED_PACKET("WebcastCreateRedPacketMessage"),
    RECOMMEND_GOODS("WebcastVideoLiveGoodsRcmdMessage"),
    RECOMMEND_COUPON("WebcastVideoLiveCouponRcmdMessage"),
    GOODS_ORDER("WebcastVideoLiveGoodsOrderMessage"),
    FANS_CLUB_REVIEW("WebcastFansclubReviewMessage"),
    ROOM_VERIFY("WebcastRoomVerifyMessage"),
    MEDIA_REPLAY("WebcastMediaLiveReplayVidMessage"),
    COMMERCE_SALE_MESSAGE("CommerceSaleMessage"),
    FOLLOW_GUIDE("WebcastFollowGuideMessage"),
    HONOR_LEVEL_UP("WebcastLevelUpMessage"),
    GUIDE_MESSAGE("WebcastGuideMessage"),
    FREE_CELL_GIFT_MESSAGE("WebcastFreeCellGiftMessage"),
    DUTY_GIFT_MESSAGE("WebcastDutyGiftMessage"),
    ASSET_MESSAGE("WebcastAssetMessage"),
    DAILY_REGION_RANK("WebcastSunDailyRegionRankMessage"),
    IM_DELETE("WebcastImDeleteMessage"),
    DOU_PLUS_MESSAGE("WebcastDouplusMessage"),
    LIVE_ECOM_MESSAGE("WebcastLiveEcomMessage"),
    FRATERNITY_MESSAGE("WebcastBrotherhoodMessage"),
    OFFICIAL_TASK_INFO("WebcastProjectDTaskInfo"),
    CEREMONY_MESSAGE("WebcastCeremonyMessage"),
    D_H5_MESSAGE("WebcastProjectDModifyH5"),
    GAME_GIFT_MESSAGE("WebcastGameGiftMessage"),
    DRIVE_GIFT_MESSAGE("WebcastDriveGiftMessage"),
    PORTAL_MESSAGE("WebcastPortalMessage"),
    NOBLE_UPGRADE_MESSAGE("WebcastNobleUpgradeMessage"),
    NOBLE_TOAST_MESSAGE("WebcastNobleToastMessage"),
    NOBLE_ENTER_LEAVE_MESSAGE("WebcastNobleEnterLeaveMessage"),
    BINDING_GIFT_MESSAGE("WebcastBindingGiftMessage"),
    BANNER_UPDATE("WebcastInRoomBannerEvent"),
    QUIZ_START_MESSAGE("WebcastQuizStartMessage"),
    QUIZ_CHANGE_MESSAGE("WebcastQuizChangeMessage"),
    QUIZ_RESULT_MESSAGE("WebcastQuizResultMessage"),
    BEGINNER_GUIDE_MESSAGE("WebcastBeginnerGuideMessage"),
    CHIJI_NOTICE_MESSAGE("WebcastChijiNoticeMessage"),
    POPULAR_CARD_MESSAGE("WebcastPopularCardMessage"),
    OFFICIAL_ROOM_MESSAGE("WebcastOfficialRoomMessage"),
    IN_ROOM_BANNER_REFRESH_MESSAGE("WebcastInRoomBannerRefreshMessage"),
    COMMON_POPUP_MESSAGE("WebcastCommonPopupMessage"),
    UPDATE_KOI_ROOM_STATUS_MESSAGE("WebcastUpdateKoiRoomStatusMessage"),
    CAR_SHOW_MESSAGE("WebcastCarBallShowMessage"),
    CAR_SERIES_INFO_MESSAGE("WebcastCarSeriesInfoMessage"),
    CNY_A_TASK_MESSAGE("WebcastCNYATaskMessage"),
    CNY_REWARD_MESSAGE("WebcastCNYReward"),
    SHARE_GUIDE_MESSAGE("WebcastShareGuideMessage"),
    HOURLY_RANK_MESSAGE("WebcastHourlyRankMessage"),
    HOURLY_RANK_REWARD_MESSAGE("WebcastHourlyRankRewardMessage"),
    OFFICIAL_CHANNEL_ANCHOR_MESSAGE("WebcastOChannelAnchorMessage"),
    OFFICIAL_CHANNEL_MODIFY_MESSAGE("WebcastOChannelModifyMessage"),
    OFFICIAL_CHANNEL_USER_MESSAGE("WebcastOChannelUserMessage"),
    QUESTION("WebcastQuestionNewMessage"),
    TRAY_MESSAGE("WebcastTrayMessage"),
    QUESTION_DELETE_MESSAGE("WebcastQuestionDeleteMessage"),
    QUESTION_SELECT_MESSAGE("WebcastQuestionSelectedMessage"),
    QUESTION_SWITCH_MESSAGE("WebcastQuestionSwitchMessage"),
    QUESTION_SLIDE_DOWN_MESSAGE("WebcastQuestionSlideDownMessage"),
    BARRAGE_MESSAGE("WebcastBarrageMessage"),
    RANK_TOAST_MESSAGE("WebcastRankToastMessage"),
    LOCAL_LIVE_PLAY_ORIENTATION_CHANGED_MESSAGE(""),
    GIFT_GUIDE_MESSAGE("WebcastGiftGuideMessage"),
    GIFT_BOOST_CARD_MESSAGE("WebcastBoostCardMessage"),
    GIFT_GLOBAL_MESSAGE("WebcastGiftBroadcastMessage"),
    MARQUEE_ANNOUNCEMENT_MESSAGE("WebcastMarqueeAnnouncementMessage"),
    WEEKLY_RANK_REWARD_MESSAGE("WebcastWeeklyRankUpdateMessage"),
    RED_ENVELOPE_MESSAGE("WebcastEnvelopeMessage"),
    LIVE_INTRO_MESSAGE("WebcastLiveIntroMessage");
    
    public static final C0498h<C0498h<EnumC9596a>> SERVICE_MAP = new C0498h<>();

    /* renamed from: a */
    int f23295a = 0;

    /* renamed from: b */
    String f23296b;

    public final int getService() {
        return this.f23295a;
    }

    public final String getWsMethod() {
        return this.f23296b;
    }

    static {
        Covode.recordClassIndex(11138);
        C0498h<EnumC9596a> hVar = new C0498h<>();
        EnumC9596a[] values = values();
        for (EnumC9596a aVar : values) {
            hVar.mo2186b(aVar.ordinal(), aVar);
        }
        SERVICE_MAP.mo2186b(0, hVar);
    }

    public final int getIntType() {
        return ordinal();
    }

    public static EnumC9596a get(int i, int i2) {
        C0498h<EnumC9596a> a = SERVICE_MAP.mo2183a(i, null);
        if (a != null) {
            return a.mo2183a(i2, null);
        }
        return null;
    }

    private EnumC9596a(String str) {
        this.f23296b = str;
    }
}
