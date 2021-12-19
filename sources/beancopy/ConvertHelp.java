package beancopy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commerce.C37495f;
import com.p2082ss.android.ugc.aweme.commerce.C37499j;
import com.p2082ss.android.ugc.aweme.commerce.model.C37512a;
import com.p2082ss.android.ugc.aweme.commerce.model.C37513b;
import com.p2082ss.android.ugc.aweme.commercialize.feed.timegap.C37992c;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38257u;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.p2082ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.p2082ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.feed.api.C48333g;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Anchor;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorShopLinkStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Audio;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeActivity;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeActivityButton;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeActivityContent;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeControl;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.p2082ss.android.ugc.aweme.feed.model.BannerTip;
import com.p2082ss.android.ugc.aweme.feed.model.BitRate;
import com.p2082ss.android.ugc.aweme.feed.model.Boost;
import com.p2082ss.android.ugc.aweme.feed.model.BottomBarModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionModel;
import com.p2082ss.android.ugc.aweme.feed.model.CommerceConfigData;
import com.p2082ss.android.ugc.aweme.feed.model.DescendantsModel;
import com.p2082ss.android.ugc.aweme.feed.model.Extra;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.model.FloatingCardInfo;
import com.p2082ss.android.ugc.aweme.feed.model.GameInfo;
import com.p2082ss.android.ugc.aweme.feed.model.GreenScreenMaterial;
import com.p2082ss.android.ugc.aweme.feed.model.HotSearchGuideWord;
import com.p2082ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.p2082ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractPermission;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.model.LongVideo;
import com.p2082ss.android.ugc.aweme.feed.model.MixStatisStruct;
import com.p2082ss.android.ugc.aweme.feed.model.MixStatusStruct;
import com.p2082ss.android.ugc.aweme.feed.model.MixStruct;
import com.p2082ss.android.ugc.aweme.feed.model.PlayAddress;
import com.p2082ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Preload;
import com.p2082ss.android.ugc.aweme.feed.model.RelationLabelNew;
import com.p2082ss.android.ugc.aweme.feed.model.RelationLabelUser;
import com.p2082ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.p2082ss.android.ugc.aweme.feed.model.TtsInfos;
import com.p2082ss.android.ugc.aweme.feed.model.UserProfileInitInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoControl;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p2082ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p2082ss.android.ugc.aweme.feed.model.live.FansStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.ShareStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.p2082ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.p2082ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.friends.model.MutualUser;
import com.p2082ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.C59314b;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.C59317c;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.music.C60836o;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p2082ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.p2082ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.p2082ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p2082ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.p2082ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.EffectArtistDetail;
import com.p2082ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.p2082ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p2082ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p2082ss.android.ugc.aweme.profile.model.HonorStruct;
import com.p2082ss.android.ugc.aweme.profile.model.HotListStruct;
import com.p2082ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;
import com.p2082ss.android.ugc.aweme.profile.model.LinkUserInfoStruct;
import com.p2082ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.p2082ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.QuickShopInfo;
import com.p2082ss.android.ugc.aweme.profile.model.QuickShopSecondFloorInfo;
import com.p2082ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import com.p2082ss.android.ugc.aweme.profile.model.RelativeUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.p2082ss.android.ugc.aweme.profile.model.UnReadVideoInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.question.QuestionInfo;
import com.p2082ss.android.ugc.aweme.search.p3685c.C67357a;
import com.p2082ss.android.ugc.aweme.search.p3685c.C67358b;
import com.p2082ss.android.ugc.aweme.search.p3685c.C67359c;
import com.p2082ss.android.ugc.aweme.search.p3685c.C67360d;
import com.p2082ss.android.ugc.aweme.sticker.data.C75307b;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.sticker.model.C75441c;
import com.p2082ss.android.ugc.aweme.sticker.model.C75442d;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.ugc.aweme.proto.ACLCommonStructV2;
import com.p2082ss.ugc.aweme.proto.ActivityButtonStructV2;
import com.p2082ss.ugc.aweme.proto.ActivityTimeRangeV2;
import com.p2082ss.ugc.aweme.proto.AdCoverTitleV2;
import com.p2082ss.ugc.aweme.proto.AnchorCommonStructV2;
import com.p2082ss.ugc.aweme.proto.AnchorPanelActionStructV2;
import com.p2082ss.ugc.aweme.proto.AnchorShopLinkStructV2;
import com.p2082ss.ugc.aweme.proto.AnchorStructV2;
import com.p2082ss.ugc.aweme.proto.AnchorWikipediaStructV2;
import com.p2082ss.ugc.aweme.proto.AnnouncementStructV2;
import com.p2082ss.ugc.aweme.proto.AudioStructV2;
import com.p2082ss.ugc.aweme.proto.AutoCaptionTypeV2;
import com.p2082ss.ugc.aweme.proto.AutoVideoCaptionStructV2;
import com.p2082ss.ugc.aweme.proto.AvatarDecorationStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeACLStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeActivityStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeAnchorStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeCommerceStickerStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeCommerceStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeControlStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeFloatingCardStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeLabelStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeRiskStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeSearchStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeStatisticsStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeStatusStructV2;
import com.p2082ss.ugc.aweme.proto.AwemeStructV2;
import com.p2082ss.ugc.aweme.proto.BannerTipV2;
import com.p2082ss.ugc.aweme.proto.BitRateStructV2;
import com.p2082ss.ugc.aweme.proto.BlueVBrandInfoStructV2;
import com.p2082ss.ugc.aweme.proto.BoostStructV2;
import com.p2082ss.ugc.aweme.proto.BottomBarStructV2;
import com.p2082ss.ugc.aweme.proto.CNYStructV2;
import com.p2082ss.ugc.aweme.proto.CaptionAnchorStructV2;
import com.p2082ss.ugc.aweme.proto.CaptionInfoStructV2;
import com.p2082ss.ugc.aweme.proto.CaptionStructV2;
import com.p2082ss.ugc.aweme.proto.ChallengeStructV2;
import com.p2082ss.ugc.aweme.proto.ClaStructV2;
import com.p2082ss.ugc.aweme.proto.CommerceActivityStructV2;
import com.p2082ss.ugc.aweme.proto.CommerceConfigDataV2;
import com.p2082ss.ugc.aweme.proto.CommerceInfoStructV2;
import com.p2082ss.ugc.aweme.proto.CommercePermissionStructV2;
import com.p2082ss.ugc.aweme.proto.CommerceStickerStructV2;
import com.p2082ss.ugc.aweme.proto.CommerceStickerUnlockStructV2;
import com.p2082ss.ugc.aweme.proto.CommerceUserStructV2;
import com.p2082ss.ugc.aweme.proto.DescendantStructV2;
import com.p2082ss.ugc.aweme.proto.DisclaimerStructV2;
import com.p2082ss.ugc.aweme.proto.DuetWithMeStickerStructV2;
import com.p2082ss.ugc.aweme.proto.EffectArtistStructV2;
import com.p2082ss.ugc.aweme.proto.ExternalRecommendReasonStructV2;
import com.p2082ss.ugc.aweme.proto.ExternalSongStructV2;
import com.p2082ss.ugc.aweme.proto.ExtraStructV2;
import com.p2082ss.ugc.aweme.proto.FansStructV2;
import com.p2082ss.ugc.aweme.proto.FollowersDetailV2;
import com.p2082ss.ugc.aweme.proto.GameStructV2;
import com.p2082ss.ugc.aweme.proto.GreenScreenMaterialV2;
import com.p2082ss.ugc.aweme.proto.GuideWordV2;
import com.p2082ss.ugc.aweme.proto.HashTagStickerStructV2;
import com.p2082ss.ugc.aweme.proto.HotListStructV2;
import com.p2082ss.ugc.aweme.proto.HotsearchSprintStructV2;
import com.p2082ss.ugc.aweme.proto.HybridLabelStructV2;
import com.p2082ss.ugc.aweme.proto.IconButtonStructV2;
import com.p2082ss.ugc.aweme.proto.ImageInfoStructV2;
import com.p2082ss.ugc.aweme.proto.InteractPermissionV2;
import com.p2082ss.ugc.aweme.proto.InteractionStickerStructV2;
import com.p2082ss.ugc.aweme.proto.InteractionTagInfoV2;
import com.p2082ss.ugc.aweme.proto.InteractionTagUserInfoV2;
import com.p2082ss.ugc.aweme.proto.ItemLikeEggDataV2;
import com.p2082ss.ugc.aweme.proto.LifeStoryBlockStructV2;
import com.p2082ss.ugc.aweme.proto.LinkMatchStructV2;
import com.p2082ss.ugc.aweme.proto.LinkUserInfoStructV2;
import com.p2082ss.ugc.aweme.proto.LiveCountdownStickerStructV2;
import com.p2082ss.ugc.aweme.proto.LiveHonorStructV2;
import com.p2082ss.ugc.aweme.proto.LogPbStructV2;
import com.p2082ss.ugc.aweme.proto.LongVideoStructV2;
import com.p2082ss.ugc.aweme.proto.MaskStructV2;
import com.p2082ss.ugc.aweme.proto.MatchInfoStructV2;
import com.p2082ss.ugc.aweme.proto.MatchedFriendStructV2;
import com.p2082ss.ugc.aweme.proto.MatchedPGCSoundStructV2;
import com.p2082ss.ugc.aweme.proto.MatchedSongStructV2;
import com.p2082ss.ugc.aweme.proto.MentionStickerStructV2;
import com.p2082ss.ugc.aweme.proto.MicroAppCardStructV2;
import com.p2082ss.ugc.aweme.proto.MicroAppStructV2;
import com.p2082ss.ugc.aweme.proto.MixStatisStructV2;
import com.p2082ss.ugc.aweme.proto.MixStatusStructV2;
import com.p2082ss.ugc.aweme.proto.MixStructV2;
import com.p2082ss.ugc.aweme.proto.MusicArtistStructV2;
import com.p2082ss.ugc.aweme.proto.MusicStructV2;
import com.p2082ss.ugc.aweme.proto.MutualStructV2;
import com.p2082ss.ugc.aweme.proto.MutualUserStructV2;
import com.p2082ss.ugc.aweme.proto.NewFaceStickerStructV2;
import com.p2082ss.ugc.aweme.proto.OfflineInfoStructV2;
import com.p2082ss.ugc.aweme.proto.OriginalLanguageStructV2;
import com.p2082ss.ugc.aweme.proto.OriginalMusicianStructV2;
import com.p2082ss.ugc.aweme.proto.PermissionStructV2;
import com.p2082ss.ugc.aweme.proto.PlatformSyncStatusStructV2;
import com.p2082ss.ugc.aweme.proto.PlayTokenAuthStructV2;
import com.p2082ss.ugc.aweme.proto.PlaylistInfoV2;
import com.p2082ss.ugc.aweme.proto.PositionStructV2;
import com.p2082ss.ugc.aweme.proto.PreloadStructV2;
import com.p2082ss.ugc.aweme.proto.ProfileBadgeStructV2;
import com.p2082ss.ugc.aweme.proto.QuestionInfoV2;
import com.p2082ss.ugc.aweme.proto.QuestionStickerStructV2;
import com.p2082ss.ugc.aweme.proto.QuickShopSecondFloorV2;
import com.p2082ss.ugc.aweme.proto.QuickShopStructV2;
import com.p2082ss.ugc.aweme.proto.RFansGroupInfoV2;
import com.p2082ss.ugc.aweme.proto.RecommendItemStructV2;
import com.p2082ss.ugc.aweme.proto.RelationLabelStructV2;
import com.p2082ss.ugc.aweme.proto.RelationRecommendStructV2;
import com.p2082ss.ugc.aweme.proto.RelativeUserStructV2;
import com.p2082ss.ugc.aweme.proto.ShareStructV2;
import com.p2082ss.ugc.aweme.proto.ShowTimeGapRspInfo;
import com.p2082ss.ugc.aweme.proto.SimpleUserStructV2;
import com.p2082ss.ugc.aweme.proto.SpecialStickerStructV2;
import com.p2082ss.ugc.aweme.proto.StoryMetadataV2;
import com.p2082ss.ugc.aweme.proto.StreamUrlStructV2;
import com.p2082ss.ugc.aweme.proto.TextContentStructV2;
import com.p2082ss.ugc.aweme.proto.TextExtraStructV2;
import com.p2082ss.ugc.aweme.proto.TrendingBarForYouPageStructV2;
import com.p2082ss.ugc.aweme.proto.TrendingBarStructV2;
import com.p2082ss.ugc.aweme.proto.TtsAudioStructV2;
import com.p2082ss.ugc.aweme.proto.UpvoteReasonV2;
import com.p2082ss.ugc.aweme.proto.UrlStructV2;
import com.p2082ss.ugc.aweme.proto.UserProfileStructV2;
import com.p2082ss.ugc.aweme.proto.UserStoryV2;
import com.p2082ss.ugc.aweme.proto.UserStructV2;
import com.p2082ss.ugc.aweme.proto.UtteranceV2;
import com.p2082ss.ugc.aweme.proto.VideoControlV2;
import com.p2082ss.ugc.aweme.proto.VideoMuteStructV2;
import com.p2082ss.ugc.aweme.proto.VideoReplyStructV2;
import com.p2082ss.ugc.aweme.proto.VideoStructV2;
import com.p2082ss.ugc.aweme.proto.VideoTextStructV2;
import com.p2082ss.ugc.aweme.proto.VideoUnreadStructV2;
import com.p2082ss.ugc.aweme.proto.VoteOptionStructV2;
import com.p2082ss.ugc.aweme.proto.VoteStructV2;
import com.p2082ss.ugc.aweme.proto.WebcastRoomFeedCellStructV2;
import com.p2082ss.ugc.aweme.proto.WebcastRoomStructV2;
import com.p2082ss.ugc.aweme.proto.aweme_v2_feed_response;
import java.util.ArrayList;
import java.util.List;
import tiktok.kids.proto.tiktok_v1_kids_feed_response;

public class ConvertHelp {
    static {
        Covode.recordClassIndex(1915);
    }

    private ConvertHelp() {
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$ACLCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$ACLCommonShare */
    public static List<ACLCommonShare> m5668xed2326ec(List<ACLCommonStructV2> list, List<ACLCommonShare> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ACLCommonStructV2 aCLCommonStructV2 : list) {
            arrayList.add(m5711x33cb8ebe(aCLCommonStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$List$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange */
    public static List<C37512a> m5669xa30ff353(List<ActivityTimeRangeV2> list, List<C37512a> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ActivityTimeRangeV2 activityTimeRangeV2 : list) {
            arrayList.add(m5713x304bdb3(activityTimeRangeV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$AnchorCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct */
    public static List<AnchorCommonStruct> m5670x4869b99e(List<AnchorCommonStructV2> list, List<AnchorCommonStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStructV2 anchorCommonStructV2 : list) {
            arrayList.add(m5715x8be04f0e(anchorCommonStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$AnchorPanelActionStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorPanelAction */
    public static List<AnchorPanelAction> m5671xf21e5253(List<AnchorPanelActionStructV2> list, List<AnchorPanelAction> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AnchorPanelActionStructV2 anchorPanelActionStructV2 : list) {
            arrayList.add(m5716xfa371aa1(anchorPanelActionStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$AutoCaptionTypeV2$$List$com$ss$android$ugc$aweme$sticker$data$AutocaptionType */
    public static List<C75307b> m5672x4601da24(List<AutoCaptionTypeV2> list, List<C75307b> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AutoCaptionTypeV2 autoCaptionTypeV2 : list) {
            arrayList.add(m5722x7f16d1a4(autoCaptionTypeV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$AwemeLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel */
    public static List<AwemeLabelModel> m5673x76f794a0(List<AwemeLabelStructV2> list, List<AwemeLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AwemeLabelStructV2 awemeLabelStructV2 : list) {
            arrayList.add(m5732x8a3abbb6(awemeLabelStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme */
    public static List<Aweme> m5674x83100197(List<AwemeStructV2> list, List<Aweme> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AwemeStructV2 awemeStructV2 : list) {
            arrayList.add(m5737xbda5a8e1(awemeStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate */
    public static List<BitRate> m5675xb984563(List<BitRateStructV2> list, List<BitRate> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (BitRateStructV2 bitRateStructV2 : list) {
            arrayList.add(m5739x8afb92e1(bitRateStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$CaptionStructV2$$List$com$ss$android$ugc$aweme$feed$model$CaptionItemModel */
    public static List<CaptionItemModel> m5676x736d7a81(List<CaptionStructV2> list, List<CaptionItemModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (CaptionStructV2 captionStructV2 : list) {
            arrayList.add(m5746x90e6cc55(captionStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge */
    public static List<Challenge> m5677x890b881a(List<ChallengeStructV2> list, List<Challenge> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ChallengeStructV2 challengeStructV2 : list) {
            arrayList.add(m5747x5652a2ac(challengeStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$CommerceConfigDataV2$$List$com$ss$android$ugc$aweme$feed$model$CommerceConfigData */
    public static List<CommerceConfigData> m5678x76aeb75e(List<CommerceConfigDataV2> list, List<CommerceConfigData> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (CommerceConfigDataV2 commerceConfigDataV2 : list) {
            arrayList.add(m5750x5692c932(commerceConfigDataV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$ExternalSongStructV2$$List$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo */
    public static List<ExternalMusicInfo> m5679x6301e2f6(List<ExternalSongStructV2> list, List<ExternalMusicInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ExternalSongStructV2 externalSongStructV2 : list) {
            arrayList.add(m5761xc9224d66(externalSongStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$FollowersDetailV2$$List$com$ss$android$ugc$aweme$profile$model$FollowerDetail */
    public static List<FollowerDetail> m5680xba3b9b20(List<FollowersDetailV2> list, List<FollowerDetail> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (FollowersDetailV2 followersDetailV2 : list) {
            arrayList.add(m5764xc3646396(followersDetailV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$GreenScreenMaterialV2$$List$com$ss$android$ugc$aweme$feed$model$GreenScreenMaterial */
    public static List<GreenScreenMaterial> m5681x1da9f380(List<GreenScreenMaterialV2> list, List<GreenScreenMaterial> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (GreenScreenMaterialV2 greenScreenMaterialV2 : list) {
            arrayList.add(m5766x639c64d6(greenScreenMaterialV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$HybridLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel */
    public static List<AwemeHybridLabelModel> m5682xa8867139(List<HybridLabelStructV2> list, List<AwemeHybridLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (HybridLabelStructV2 hybridLabelStructV2 : list) {
            arrayList.add(m5771xef19dc1(hybridLabelStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo */
    public static List<ImageInfo> m5683x71a3bddb(List<ImageInfoStructV2> list, List<ImageInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ImageInfoStructV2 imageInfoStructV2 : list) {
            arrayList.add(m5773x9f65f721(imageInfoStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$InteractionStickerStructV2$$List$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct */
    public static List<InteractStickerStruct> m5684xb33b7ec(List<InteractionStickerStructV2> list, List<InteractStickerStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (InteractionStickerStructV2 interactionStickerStructV2 : list) {
            arrayList.add(m5775x24286486(interactionStickerStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$InteractionTagUserInfoV2$$List$com$ss$android$ugc$aweme$feed$model$InteractionTagUserInfo */
    public static List<InteractionTagUserInfo> m5685x7535011e(List<InteractionTagUserInfoV2> list, List<InteractionTagUserInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (InteractionTagUserInfoV2 interactionTagUserInfoV2 : list) {
            arrayList.add(m5777xe67073e6(interactionTagUserInfoV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo */
    public static List<LongVideo> m5686x8d23647(List<LongVideoStructV2> list, List<LongVideo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (LongVideoStructV2 longVideoStructV2 : list) {
            arrayList.add(m5785xd9f92261(longVideoStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$MaskStructV2$$List$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo */
    public static List<VideoMaskInfo> m5687xbbea2df8(List<MaskStructV2> list, List<VideoMaskInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MaskStructV2 maskStructV2 : list) {
            arrayList.add(m5786x59acc730(maskStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$MatchInfoStructV2$$List$com$ss$android$ugc$aweme$search$caption$MatchInfo */
    public static List<C67360d> m5688xa5b614b6(List<MatchInfoStructV2> list, List<C67360d> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MatchInfoStructV2 matchInfoStructV2 : list) {
            arrayList.add(m5787xc68009e8(matchInfoStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$MusicArtistStructV2$$List$com$ss$android$ugc$aweme$music$model$MusicOwnerInfo */
    public static List<MusicOwnerInfo> m5689xcf468d6c(List<MusicArtistStructV2> list, List<MusicOwnerInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MusicArtistStructV2 musicArtistStructV2 : list) {
            arrayList.add(m5797xadae28c(musicArtistStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$MusicStructV2$$List$com$ss$android$ugc$aweme$music$model$Music */
    public static List<Music> m5690xd117b1c(List<MusicStructV2> list, List<Music> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MusicStructV2 musicStructV2 : list) {
            arrayList.add(m5798x2fe8170e(musicStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$MutualUserStructV2$$List$com$ss$android$ugc$aweme$friends$model$MutualUser */
    public static List<MutualUser> m5691x2cd07480(List<MutualUserStructV2> list, List<MutualUser> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MutualUserStructV2 mutualUserStructV2 : list) {
            arrayList.add(m5800xec5b8eb2(mutualUserStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$OfflineInfoStructV2$$List$com$ss$android$ugc$aweme$commerce$OfflineInfo */
    public static List<C37499j> m5692x3e86323(List<OfflineInfoStructV2> list, List<C37499j> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (OfflineInfoStructV2 offlineInfoStructV2 : list) {
            arrayList.add(m5802xb1fda959(offlineInfoStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$Arraycom$ss$android$ugc$aweme$profile$model$PlatformInfo */
    public static PlatformInfo[] m5693xc1a28d7c(List<PlatformSyncStatusStructV2> list, PlatformInfo[] platformInfoArr) {
        if (list == null) {
            return platformInfoArr;
        }
        if (list.isEmpty()) {
            return new PlatformInfo[0];
        }
        PlatformInfo[] platformInfoArr2 = new PlatformInfo[list.size()];
        for (int i = 0; i < list.size(); i++) {
            platformInfoArr2[i] = m5806xb8c54a7f(list.get(i), null);
        }
        return platformInfoArr2;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position */
    public static List<Position> m5694xed17e9e(List<PositionStructV2> list, List<Position> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (PositionStructV2 positionStructV2 : list) {
            arrayList.add(m5809x5cec7640(positionStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$QuestionInfoV2$$List$com$ss$android$ugc$aweme$question$QuestionInfo */
    public static List<QuestionInfo> m5695x9c3af3db(List<QuestionInfoV2> list, List<QuestionInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (QuestionInfoV2 questionInfoV2 : list) {
            arrayList.add(m5812x842f2ee9(questionInfoV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$RecommendItemStructV2$$List$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem */
    public static List<RecommendAwemeItem> m5696x2cf2d58d(List<RecommendItemStructV2> list, List<RecommendAwemeItem> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RecommendItemStructV2 recommendItemStructV2 : list) {
            arrayList.add(m5817x55fe9987(recommendItemStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$feed$model$RelationLabelUser */
    public static List<RelationLabelUser> m5697x6e5454b1(List<RelativeUserStructV2> list, List<RelationLabelUser> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RelativeUserStructV2 relativeUserStructV2 : list) {
            arrayList.add(m5820x91dc7273(relativeUserStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo */
    public static List<RelativeUserInfo> m5698xf3bc2c2a(List<RelativeUserStructV2> list, List<RelativeUserInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RelativeUserStructV2 relativeUserStructV2 : list) {
            arrayList.add(m5821x55b3e16c(relativeUserStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$SimpleUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$User */
    public static List<User> m5699x7b892b96(List<SimpleUserStructV2> list, List<User> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (SimpleUserStructV2 simpleUserStructV2 : list) {
            arrayList.add(m5825xd0fb664c(simpleUserStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$TextExtraStructV2$$List$com$ss$android$ugc$aweme$model$TextExtraStruct */
    public static List<TextExtraStruct> m5700xdd10ff50(List<TextExtraStructV2> list, List<TextExtraStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (TextExtraStructV2 textExtraStructV2 : list) {
            arrayList.add(m5830x8e855afe(textExtraStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$TtsAudioStructV2$$List$com$ss$android$ugc$aweme$feed$model$TtsInfos */
    public static List<TtsInfos> m5701x1a7db938(List<TtsAudioStructV2> list, List<TtsInfos> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (TtsAudioStructV2 ttsAudioStructV2 : list) {
            arrayList.add(m5833xbf0aa78e(ttsAudioStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel */
    public static List<UrlModel> m5702x5c3c5aaf(List<UrlStructV2> list, List<UrlModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (UrlStructV2 urlStructV2 : list) {
            arrayList.add(m5835xd6e21675(urlStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$UtteranceV2$$List$com$ss$android$ugc$aweme$sticker$data$Utterance */
    public static List<C75313h> m5703xd7509bc4(List<UtteranceV2> list, List<C75313h> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (UtteranceV2 utteranceV2 : list) {
            arrayList.add(m5841xf7db0584(utteranceV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel */
    public static List<AwemeTextLabelModel> m5704x16f8d95a(List<VideoTextStructV2> list, List<AwemeTextLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (VideoTextStructV2 videoTextStructV2 : list) {
            arrayList.add(m5846x7df21302(videoTextStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$com$ss$ugc$aweme$proto$VoteOptionStructV2$$List$com$ss$android$ugc$aweme$sticker$data$PollStruct$OptionsBean */
    public static List<PollStruct.OptionsBean> m5705x7cfde55a(List<VoteOptionStructV2> list, List<PollStruct.OptionsBean> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (VoteOptionStructV2 voteOptionStructV2 : list) {
            arrayList.add(m5848xfb301be8(voteOptionStructV2, null));
        }
        return arrayList;
    }

    public static long[] List$java$lang$Long$$ArrayJ(List<Long> list, long[] jArr) {
        if (list == null) {
            return jArr;
        }
        if (list.isEmpty()) {
            return new long[0];
        }
        long[] jArr2 = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr2[i] = C1746a.m5874a(list.get(i));
        }
        return jArr2;
    }

    /* renamed from: List$tiktok$kids$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme */
    public static List<Aweme> m5706x568f37ef(List<tiktok.kids.proto.AwemeStructV2> list, List<Aweme> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (tiktok.kids.proto.AwemeStructV2 awemeStructV2 : list) {
            arrayList.add(m5855x54f91bfd(awemeStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$tiktok$kids$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate */
    public static List<BitRate> m5707x5648fbb(List<tiktok.kids.proto.BitRateStructV2> list, List<BitRate> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (tiktok.kids.proto.BitRateStructV2 bitRateStructV2 : list) {
            arrayList.add(m5856x96e817fd(bitRateStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$tiktok$kids$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo */
    public static List<ImageInfo> m5708xbd131c33(List<tiktok.kids.proto.ImageInfoStructV2> list, List<ImageInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (tiktok.kids.proto.ImageInfoStructV2 imageInfoStructV2 : list) {
            arrayList.add(m5857x29128e3d(imageInfoStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$tiktok$kids$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo */
    public static List<LongVideo> m5709x5441949f(List<tiktok.kids.proto.LongVideoStructV2> list, List<LongVideo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (tiktok.kids.proto.LongVideoStructV2 longVideoStructV2 : list) {
            arrayList.add(m5859x63a5b97d(longVideoStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: List$tiktok$kids$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel */
    public static List<UrlModel> m5710xf8a3ef57(List<tiktok.kids.proto.UrlStructV2> list, List<UrlModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (tiktok.kids.proto.UrlStructV2 urlStructV2 : list) {
            arrayList.add(m5862x29fd06d9(urlStructV2, null));
        }
        return arrayList;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare */
    public static ACLCommonShare m5711x33cb8ebe(ACLCommonStructV2 aCLCommonStructV2, ACLCommonShare aCLCommonShare) {
        if (aCLCommonStructV2 == null) {
            return aCLCommonShare;
        }
        ACLCommonShare aCLCommonShare2 = new ACLCommonShare();
        aCLCommonShare2.code = C1746a.m5871a(aCLCommonStructV2.code, aCLCommonShare2.code);
        aCLCommonShare2.showType = C1746a.m5871a(aCLCommonStructV2.show_type, aCLCommonShare2.showType);
        aCLCommonShare2.toastMsg = aCLCommonStructV2.toast_msg == null ? aCLCommonShare2.toastMsg : aCLCommonStructV2.toast_msg;
        aCLCommonShare2.extra = aCLCommonStructV2.extra == null ? aCLCommonShare2.extra : aCLCommonStructV2.extra;
        aCLCommonShare2.transcode = C1746a.m5871a(aCLCommonStructV2.transcode, aCLCommonShare2.transcode);
        aCLCommonShare2.mute = C1746a.m5877a(aCLCommonStructV2.mute, aCLCommonShare2.mute);
        aCLCommonShare2.popupMsg = aCLCommonStructV2.popup_msg == null ? aCLCommonShare2.popupMsg : aCLCommonStructV2.popup_msg;
        aCLCommonShare2.platformId = aCLCommonStructV2.platform_id == null ? aCLCommonShare2.platformId : aCLCommonStructV2.platform_id;
        return aCLCommonShare2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ActivityButtonStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivityButton */
    public static AwemeActivityButton m5712x3151ce0e(ActivityButtonStructV2 activityButtonStructV2, AwemeActivityButton awemeActivityButton) {
        if (activityButtonStructV2 == null) {
            return awemeActivityButton;
        }
        AwemeActivityButton awemeActivityButton2 = new AwemeActivityButton();
        awemeActivityButton2.label = activityButtonStructV2.label == null ? awemeActivityButton2.label : activityButtonStructV2.label;
        awemeActivityButton2.color = activityButtonStructV2.color == null ? awemeActivityButton2.color : activityButtonStructV2.color;
        return awemeActivityButton2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange */
    public static C37512a m5713x304bdb3(ActivityTimeRangeV2 activityTimeRangeV2, C37512a aVar) {
        if (activityTimeRangeV2 == null) {
            return aVar;
        }
        C37512a aVar2 = new C37512a();
        aVar2.start = C1746a.m5868a(activityTimeRangeV2.start, aVar2.start);
        aVar2.end = C1746a.m5868a(activityTimeRangeV2.end, aVar2.end);
        return aVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AdCoverTitleV2$$com$ss$android$ugc$aweme$profile$model$AdCoverTitle */
    public static AdCoverTitle m5714xc3027593(AdCoverTitleV2 adCoverTitleV2, AdCoverTitle adCoverTitle) {
        if (adCoverTitleV2 == null) {
            return adCoverTitle;
        }
        AdCoverTitle adCoverTitle2 = new AdCoverTitle();
        adCoverTitle2.title = adCoverTitleV2.title == null ? adCoverTitle2.title : adCoverTitleV2.title;
        adCoverTitle2.webUrl = adCoverTitleV2.web_url == null ? adCoverTitle2.webUrl : adCoverTitleV2.web_url;
        return adCoverTitle2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnchorCommonStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct */
    public static AnchorCommonStruct m5715x8be04f0e(AnchorCommonStructV2 anchorCommonStructV2, AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStructV2 == null) {
            return anchorCommonStruct;
        }
        AnchorCommonStruct anchorCommonStruct2 = new AnchorCommonStruct();
        anchorCommonStruct2.keyword = anchorCommonStructV2.keyword == null ? anchorCommonStruct2.keyword : anchorCommonStructV2.keyword;
        anchorCommonStruct2.url = anchorCommonStructV2.url == null ? anchorCommonStruct2.url : anchorCommonStructV2.url;
        anchorCommonStruct2.language = anchorCommonStructV2.language == null ? anchorCommonStruct2.language : anchorCommonStructV2.language;
        anchorCommonStruct2.schema = anchorCommonStructV2.schema == null ? anchorCommonStruct2.schema : anchorCommonStructV2.schema;
        anchorCommonStruct2.f114473id = anchorCommonStructV2.f195404id == null ? anchorCommonStruct2.f114473id : anchorCommonStructV2.f195404id;
        anchorCommonStruct2.type = C1746a.m5871a(anchorCommonStructV2.type, anchorCommonStruct2.type);
        anchorCommonStruct2.icon = m5835xd6e21675(anchorCommonStructV2.icon, anchorCommonStruct2.icon);
        anchorCommonStruct2.extra = anchorCommonStructV2.extra == null ? anchorCommonStruct2.extra : anchorCommonStructV2.extra;
        anchorCommonStruct2.deepLink = anchorCommonStructV2.deep_link == null ? anchorCommonStruct2.deepLink : anchorCommonStructV2.deep_link;
        anchorCommonStruct2.universalLink = anchorCommonStructV2.universal_link == null ? anchorCommonStruct2.universalLink : anchorCommonStructV2.universal_link;
        anchorCommonStruct2.generalType = C1746a.m5871a(anchorCommonStructV2.general_type, anchorCommonStruct2.generalType);
        anchorCommonStruct2.logExtra = anchorCommonStructV2.log_extra == null ? anchorCommonStruct2.logExtra : anchorCommonStructV2.log_extra;
        anchorCommonStruct2.description = anchorCommonStructV2.description == null ? anchorCommonStruct2.description : anchorCommonStructV2.description;
        anchorCommonStruct2.thumbnail = m5835xd6e21675(anchorCommonStructV2.thumbnail, anchorCommonStruct2.thumbnail);
        anchorCommonStruct2.actions = m5671xf21e5253(anchorCommonStructV2.actions, anchorCommonStruct2.actions);
        return anchorCommonStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnchorPanelActionStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorPanelAction */
    public static AnchorPanelAction m5716xfa371aa1(AnchorPanelActionStructV2 anchorPanelActionStructV2, AnchorPanelAction anchorPanelAction) {
        if (anchorPanelActionStructV2 == null) {
            return anchorPanelAction;
        }
        AnchorPanelAction anchorPanelAction2 = new AnchorPanelAction();
        anchorPanelAction2.icon = m5835xd6e21675(anchorPanelActionStructV2.icon, anchorPanelAction2.icon);
        anchorPanelAction2.schema = anchorPanelActionStructV2.schema == null ? anchorPanelAction2.schema : anchorPanelActionStructV2.schema;
        anchorPanelAction2.actionType = C1746a.m5871a(anchorPanelActionStructV2.action_type, anchorPanelAction2.actionType);
        return anchorPanelAction2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnchorShopLinkStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorShopLinkStruct */
    public static AnchorShopLinkStruct m5717xd2e2ca58(AnchorShopLinkStructV2 anchorShopLinkStructV2, AnchorShopLinkStruct anchorShopLinkStruct) {
        if (anchorShopLinkStructV2 == null) {
            return anchorShopLinkStruct;
        }
        AnchorShopLinkStruct anchorShopLinkStruct2 = new AnchorShopLinkStruct();
        anchorShopLinkStruct2.keyword = anchorShopLinkStructV2.keyword == null ? anchorShopLinkStruct2.keyword : anchorShopLinkStructV2.keyword;
        anchorShopLinkStruct2.url = anchorShopLinkStructV2.url == null ? anchorShopLinkStruct2.url : anchorShopLinkStructV2.url;
        return anchorShopLinkStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnchorStructV2$$com$ss$android$ugc$aweme$feed$model$Anchor */
    public static Anchor m5718x94014543(AnchorStructV2 anchorStructV2, Anchor anchor) {
        if (anchorStructV2 == null) {
            return anchor;
        }
        Anchor anchor2 = new Anchor();
        anchor2.showType = anchorStructV2.show_type == null ? anchor2.showType : anchorStructV2.show_type;
        anchor2.businessType = anchorStructV2.business_type == null ? anchor2.businessType : anchorStructV2.business_type;
        anchor2.wikipediaInfo = m5719x3f769644(anchorStructV2.wikipedia_info, anchor2.wikipediaInfo);
        anchor2.shopLinkStruct = m5717xd2e2ca58(anchorStructV2.shop_link, anchor2.shopLinkStruct);
        anchor2.anchorInfo = m5715x8be04f0e(anchorStructV2.anchor_info, anchor2.anchorInfo);
        anchor2.anchorId = anchorStructV2.anchor_id == null ? anchor2.anchorId : anchorStructV2.anchor_id;
        return anchor2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnchorWikipediaStructV2$$com$ss$android$ugc$aweme$feed$model$WikipediaInfo */
    public static WikipediaInfo m5719x3f769644(AnchorWikipediaStructV2 anchorWikipediaStructV2, WikipediaInfo wikipediaInfo) {
        if (anchorWikipediaStructV2 == null) {
            return wikipediaInfo;
        }
        WikipediaInfo wikipediaInfo2 = new WikipediaInfo();
        wikipediaInfo2.keyword = anchorWikipediaStructV2.keyword == null ? wikipediaInfo2.keyword : anchorWikipediaStructV2.keyword;
        wikipediaInfo2.lang = anchorWikipediaStructV2.lang == null ? wikipediaInfo2.lang : anchorWikipediaStructV2.lang;
        return wikipediaInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AnnouncementStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeAnnouncement */
    public static ChallengeAnnouncement m5720xcb0a6e35(AnnouncementStructV2 announcementStructV2, ChallengeAnnouncement challengeAnnouncement) {
        if (announcementStructV2 == null) {
            return challengeAnnouncement;
        }
        ChallengeAnnouncement challengeAnnouncement2 = new ChallengeAnnouncement();
        challengeAnnouncement2.title = announcementStructV2.title == null ? challengeAnnouncement2.title : announcementStructV2.title;
        challengeAnnouncement2.content = announcementStructV2.body == null ? challengeAnnouncement2.content : announcementStructV2.body;
        return challengeAnnouncement2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AudioStructV2$$com$ss$android$ugc$aweme$feed$model$Audio */
    public static Audio m5721xe66bd481(AudioStructV2 audioStructV2, Audio audio) {
        if (audioStructV2 == null) {
            return audio;
        }
        Audio audio2 = new Audio();
        audio2.CdnUrlExpired = C1746a.m5875a(audioStructV2.CdnUrlExpired, audio2.CdnUrlExpired);
        audio2.TtsInfos = m5701x1a7db938(audioStructV2.TtsInfos, audio2.TtsInfos);
        return audio2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AutoCaptionTypeV2$$com$ss$android$ugc$aweme$sticker$data$AutocaptionType */
    public static C75307b m5722x7f16d1a4(AutoCaptionTypeV2 autoCaptionTypeV2, C75307b bVar) {
        if (autoCaptionTypeV2 == null) {
            return bVar;
        }
        C75307b bVar2 = new C75307b();
        bVar2.language = autoCaptionTypeV2.language == null ? bVar2.language : autoCaptionTypeV2.language;
        bVar2.url = m5835xd6e21675(autoCaptionTypeV2.url, bVar2.url);
        return bVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AutoVideoCaptionStructV2$$com$ss$android$ugc$aweme$sticker$data$CaptionStruct */
    public static C75309d m5723x46d4fcb6(AutoVideoCaptionStructV2 autoVideoCaptionStructV2, C75309d dVar) {
        if (autoVideoCaptionStructV2 == null) {
            return dVar;
        }
        C75309d dVar2 = new C75309d();
        dVar2.location = C1746a.m5871a(autoVideoCaptionStructV2.location, dVar2.location);
        dVar2.audioUri = autoVideoCaptionStructV2.audio_uri == null ? dVar2.audioUri : autoVideoCaptionStructV2.audio_uri;
        dVar2.utterances = m5703xd7509bc4(autoVideoCaptionStructV2.utterances, dVar2.utterances);
        dVar2.autoCaptions = m5672x4601da24(autoVideoCaptionStructV2.auto_captions, dVar2.autoCaptions);
        dVar2.disable = C1746a.m5875a(autoVideoCaptionStructV2.disable, dVar2.disable);
        return dVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AvatarDecorationStructV2$$com$ss$android$ugc$aweme$profile$model$AvatarDecoration */
    public static AvatarDecoration m5724xb77ea0de(AvatarDecorationStructV2 avatarDecorationStructV2, AvatarDecoration avatarDecoration) {
        if (avatarDecorationStructV2 == null) {
            return avatarDecoration;
        }
        AvatarDecoration avatarDecoration2 = new AvatarDecoration();
        avatarDecoration2.f144668id = C1746a.m5875a(avatarDecorationStructV2.f195406id, avatarDecoration2.f144668id);
        avatarDecoration2.name = avatarDecorationStructV2.name == null ? avatarDecoration2.name : avatarDecorationStructV2.name;
        avatarDecoration2.sourceUrl = m5835xd6e21675(avatarDecorationStructV2.source_url, avatarDecoration2.sourceUrl);
        return avatarDecoration2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeACLStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeACLShare */
    public static AwemeACLShare m5725x769da000(AwemeACLStructV2 awemeACLStructV2, AwemeACLShare awemeACLShare) {
        if (awemeACLStructV2 == null) {
            return awemeACLShare;
        }
        AwemeACLShare awemeACLShare2 = new AwemeACLShare();
        awemeACLShare2.downloadGeneral = m5711x33cb8ebe(awemeACLStructV2.download_general, awemeACLShare2.downloadGeneral);
        awemeACLShare2.downloadMaskPanel = m5711x33cb8ebe(awemeACLStructV2.download_mask_panel, awemeACLShare2.downloadMaskPanel);
        awemeACLShare2.downloadSharePanel = m5711x33cb8ebe(awemeACLStructV2.download_share_panel, awemeACLShare2.downloadSharePanel);
        awemeACLShare2.shareListStatus = C1746a.m5871a(awemeACLStructV2.share_list_status, awemeACLShare2.shareListStatus);
        awemeACLShare2.shareGeneral = m5711x33cb8ebe(awemeACLStructV2.share_general, awemeACLShare2.shareGeneral);
        awemeACLShare2.platformList = m5668xed2326ec(awemeACLStructV2.platform_list, awemeACLShare2.platformList);
        awemeACLShare2.shareThirdPlatform = m5711x33cb8ebe(awemeACLStructV2.share_third_platform, awemeACLShare2.shareThirdPlatform);
        return awemeACLShare2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeActivityStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivity */
    public static AwemeActivity m5726xe91d4881(AwemeActivityStructV2 awemeActivityStructV2, AwemeActivity awemeActivity) {
        if (awemeActivityStructV2 == null) {
            return awemeActivity;
        }
        AwemeActivity awemeActivity2 = new AwemeActivity();
        awemeActivity2.activityId = awemeActivityStructV2.activity_id == null ? awemeActivity2.activityId : awemeActivityStructV2.activity_id;
        awemeActivity2.showDelayTime = awemeActivityStructV2.show_delay_time == null ? awemeActivity2.showDelayTime : awemeActivityStructV2.show_delay_time;
        awemeActivity2.schemaUrl = awemeActivityStructV2.schema_url == null ? awemeActivity2.schemaUrl : awemeActivityStructV2.schema_url;
        awemeActivity2.content = m5829x7007158e(awemeActivityStructV2.content, awemeActivity2.content);
        awemeActivity2.primaryBtn = m5712x3151ce0e(awemeActivityStructV2.primary_btn, awemeActivity2.primaryBtn);
        return awemeActivity2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeAnchorStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorInfo */
    public static AnchorInfo m5727x956cf17e(AwemeAnchorStructV2 awemeAnchorStructV2, AnchorInfo anchorInfo) {
        if (awemeAnchorStructV2 == null) {
            return anchorInfo;
        }
        AnchorInfo anchorInfo2 = new AnchorInfo();
        anchorInfo2.type = awemeAnchorStructV2.type == null ? anchorInfo2.type : awemeAnchorStructV2.type;
        anchorInfo2.f114474id = awemeAnchorStructV2.f195408id == null ? anchorInfo2.f114474id : awemeAnchorStructV2.f195408id;
        anchorInfo2.icon = m5835xd6e21675(awemeAnchorStructV2.icon, anchorInfo2.icon);
        anchorInfo2.title = awemeAnchorStructV2.title == null ? anchorInfo2.title : awemeAnchorStructV2.title;
        anchorInfo2.openUrl = awemeAnchorStructV2.open_url == null ? anchorInfo2.openUrl : awemeAnchorStructV2.open_url;
        anchorInfo2.webUrl = awemeAnchorStructV2.web_url == null ? anchorInfo2.webUrl : awemeAnchorStructV2.web_url;
        anchorInfo2.mpUrl = awemeAnchorStructV2.mp_url == null ? anchorInfo2.mpUrl : awemeAnchorStructV2.mp_url;
        anchorInfo2.extra = awemeAnchorStructV2.extra == null ? anchorInfo2.extra : awemeAnchorStructV2.extra;
        anchorInfo2.logExtra = awemeAnchorStructV2.log_extra == null ? anchorInfo2.logExtra : awemeAnchorStructV2.log_extra;
        return anchorInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeCommerceStickerStructV2$$com$ss$android$ugc$aweme$commercialize$model$CommerceStickerInfo */
    public static C38257u m5728xe74539ee(AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2, C38257u uVar) {
        if (awemeCommerceStickerStructV2 == null) {
            return uVar;
        }
        C38257u uVar2 = new C38257u();
        uVar2.commerceStickerId = C1746a.m5875a(awemeCommerceStickerStructV2.commerce_sticker_id, uVar2.commerceStickerId);
        uVar2.iconUrl = m5835xd6e21675(awemeCommerceStickerStructV2.icon_url, uVar2.iconUrl);
        uVar2.letters = awemeCommerceStickerStructV2.letters == null ? uVar2.letters : awemeCommerceStickerStructV2.letters;
        uVar2.openUrl = awemeCommerceStickerStructV2.open_url == null ? uVar2.openUrl : awemeCommerceStickerStructV2.open_url;
        uVar2.webUrl = awemeCommerceStickerStructV2.web_url == null ? uVar2.webUrl : awemeCommerceStickerStructV2.web_url;
        uVar2.webUrlTitle = awemeCommerceStickerStructV2.web_url_title == null ? uVar2.webUrlTitle : awemeCommerceStickerStructV2.web_url_title;
        return uVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeCommerceStructV2$$com$ss$android$ugc$aweme$commerce$AwemeCommerceStruct */
    public static C37437a m5729x337d8a6e(AwemeCommerceStructV2 awemeCommerceStructV2, C37437a aVar) {
        if (awemeCommerceStructV2 == null) {
            return aVar;
        }
        C37437a aVar2 = new C37437a();
        aVar2.ad_auth_status = C1746a.m5871a(awemeCommerceStructV2.ad_auth_status, aVar2.ad_auth_status);
        aVar2.ad_source = C1746a.m5871a(awemeCommerceStructV2.ad_source, aVar2.ad_source);
        aVar2.avoid_global_pendant = C1746a.m5877a(awemeCommerceStructV2.avoid_global_pendant, aVar2.avoid_global_pendant);
        aVar2.withCommentFilterWords = C1746a.m5877a(awemeCommerceStructV2.with_comment_filter_words, aVar2.withCommentFilterWords);
        aVar2.preventShare = C1746a.m5877a(awemeCommerceStructV2.prevent_share, aVar2.preventShare);
        aVar2.studyId = awemeCommerceStructV2.study_id == null ? aVar2.studyId : awemeCommerceStructV2.study_id;
        return aVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeControlStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeControl */
    public static AwemeControl m5730xbb564985(AwemeControlStructV2 awemeControlStructV2, AwemeControl awemeControl) {
        if (awemeControlStructV2 == null) {
            return awemeControl;
        }
        AwemeControl awemeControl2 = new AwemeControl();
        awemeControl2.canForward = C1746a.m5877a(awemeControlStructV2.can_forward, awemeControl2.canForward);
        awemeControl2.canShare = C1746a.m5877a(awemeControlStructV2.can_share, awemeControl2.canShare);
        awemeControl2.canComment = C1746a.m5877a(awemeControlStructV2.can_comment, awemeControl2.canComment);
        awemeControl2.canShowComment = C1746a.m5877a(awemeControlStructV2.can_show_comment, awemeControl2.canShowComment);
        return awemeControl2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeFloatingCardStructV2$$com$ss$android$ugc$aweme$feed$model$FloatingCardInfo */
    public static FloatingCardInfo m5731xba8b7c80(AwemeFloatingCardStructV2 awemeFloatingCardStructV2, FloatingCardInfo floatingCardInfo) {
        if (awemeFloatingCardStructV2 == null) {
            return floatingCardInfo;
        }
        FloatingCardInfo floatingCardInfo2 = new FloatingCardInfo();
        floatingCardInfo2.schema = awemeFloatingCardStructV2.schema == null ? floatingCardInfo2.schema : awemeFloatingCardStructV2.schema;
        floatingCardInfo2.schemaDesc = awemeFloatingCardStructV2.schema_desc == null ? floatingCardInfo2.schemaDesc : awemeFloatingCardStructV2.schema_desc;
        floatingCardInfo2.icons = m5702x5c3c5aaf(awemeFloatingCardStructV2.icons, floatingCardInfo2.icons);
        floatingCardInfo2.title = awemeFloatingCardStructV2.title == null ? floatingCardInfo2.title : awemeFloatingCardStructV2.title;
        floatingCardInfo2.description = awemeFloatingCardStructV2.description == null ? floatingCardInfo2.description : awemeFloatingCardStructV2.description;
        floatingCardInfo2.buttonDesc = awemeFloatingCardStructV2.button_desc == null ? floatingCardInfo2.buttonDesc : awemeFloatingCardStructV2.button_desc;
        floatingCardInfo2.buttonBackground = m5835xd6e21675(awemeFloatingCardStructV2.button_bg, floatingCardInfo2.buttonBackground);
        return floatingCardInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel */
    public static AwemeLabelModel m5732x8a3abbb6(AwemeLabelStructV2 awemeLabelStructV2, AwemeLabelModel awemeLabelModel) {
        if (awemeLabelStructV2 == null) {
            return awemeLabelModel;
        }
        AwemeLabelModel awemeLabelModel2 = new AwemeLabelModel();
        awemeLabelModel2.urlModels = m5835xd6e21675(awemeLabelStructV2.label_url, awemeLabelModel2.urlModels);
        awemeLabelModel2.labelType = C1746a.m5871a(awemeLabelStructV2.label_type, awemeLabelModel2.labelType);
        return awemeLabelModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeRiskStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRiskModel */
    public static AwemeRiskModel m5733x7282f728(AwemeRiskStructV2 awemeRiskStructV2, AwemeRiskModel awemeRiskModel) {
        if (awemeRiskStructV2 == null) {
            return awemeRiskModel;
        }
        AwemeRiskModel awemeRiskModel2 = new AwemeRiskModel();
        awemeRiskModel2.warn = C1746a.m5877a(awemeRiskStructV2.warn, awemeRiskModel2.warn);
        awemeRiskModel2.riskSink = C1746a.m5877a(awemeRiskStructV2.risk_sink, awemeRiskModel2.riskSink);
        awemeRiskModel2.type = C1746a.m5871a(awemeRiskStructV2.type, awemeRiskModel2.type);
        awemeRiskModel2.content = awemeRiskStructV2.content == null ? awemeRiskModel2.content : awemeRiskStructV2.content;
        awemeRiskModel2.notice = C1746a.m5877a(awemeRiskStructV2.notice, awemeRiskModel2.notice);
        awemeRiskModel2.url = awemeRiskStructV2.url == null ? awemeRiskModel2.url : awemeRiskStructV2.url;
        return awemeRiskModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeSearchStructV2$$com$ss$android$ugc$aweme$feed$model$HotSearchInfo */
    public static HotSearchInfo m5734xdc86b975(AwemeSearchStructV2 awemeSearchStructV2, HotSearchInfo hotSearchInfo) {
        if (awemeSearchStructV2 == null) {
            return hotSearchInfo;
        }
        HotSearchInfo hotSearchInfo2 = new HotSearchInfo();
        hotSearchInfo2.sentence = awemeSearchStructV2.sentence == null ? hotSearchInfo2.sentence : awemeSearchStructV2.sentence;
        hotSearchInfo2.challengeId = awemeSearchStructV2.challenge_id == null ? hotSearchInfo2.challengeId : awemeSearchStructV2.challenge_id;
        hotSearchInfo2.searchWord = awemeSearchStructV2.search_word == null ? hotSearchInfo2.searchWord : awemeSearchStructV2.search_word;
        hotSearchInfo2.value = C1746a.m5875a(awemeSearchStructV2.value, hotSearchInfo2.value);
        hotSearchInfo2.videoRank = C1746a.m5871a(awemeSearchStructV2.vb_rank, hotSearchInfo2.videoRank);
        hotSearchInfo2.videoRankVV = C1746a.m5875a(awemeSearchStructV2.vb_rank_value, hotSearchInfo2.videoRankVV);
        hotSearchInfo2.rank = C1746a.m5871a(awemeSearchStructV2.rank, hotSearchInfo2.rank);
        hotSearchInfo2.f114478id = awemeSearchStructV2.group_id == null ? hotSearchInfo2.f114478id : awemeSearchStructV2.group_id;
        hotSearchInfo2.label = C1746a.m5871a(awemeSearchStructV2.label, hotSearchInfo2.label);
        return hotSearchInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics */
    public static AwemeStatistics m5735xadd88b01(AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatistics awemeStatistics) {
        if (awemeStatisticsStructV2 == null) {
            return awemeStatistics;
        }
        AwemeStatistics awemeStatistics2 = new AwemeStatistics();
        awemeStatistics2.commentCount = C1746a.m5875a(awemeStatisticsStructV2.comment_count, awemeStatistics2.commentCount);
        awemeStatistics2.diggCount = C1746a.m5875a(awemeStatisticsStructV2.digg_count, awemeStatistics2.diggCount);
        awemeStatistics2.downloadCount = C1746a.m5875a(awemeStatisticsStructV2.download_count, awemeStatistics2.downloadCount);
        awemeStatistics2.playCount = C1746a.m5875a(awemeStatisticsStructV2.play_count, awemeStatistics2.playCount);
        awemeStatistics2.shareCount = C1746a.m5875a(awemeStatisticsStructV2.share_count, awemeStatistics2.shareCount);
        awemeStatistics2.forwardCount = C1746a.m5875a(awemeStatisticsStructV2.forward_count, awemeStatistics2.forwardCount);
        awemeStatistics2.loseCount = C1746a.m5871a(awemeStatisticsStructV2.lose_count, awemeStatistics2.loseCount);
        awemeStatistics2.loseCommentCount = C1746a.m5871a(awemeStatisticsStructV2.lose_comment_count, awemeStatistics2.loseCommentCount);
        return awemeStatistics2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus */
    public static AwemeStatus m5736xf928bfe1(AwemeStatusStructV2 awemeStatusStructV2, AwemeStatus awemeStatus) {
        if (awemeStatusStructV2 == null) {
            return awemeStatus;
        }
        AwemeStatus awemeStatus2 = new AwemeStatus();
        awemeStatus2.isDelete = C1746a.m5877a(awemeStatusStructV2.is_delete, awemeStatus2.isDelete);
        awemeStatus2.allowShare = C1746a.m5877a(awemeStatusStructV2.allow_share, awemeStatus2.allowShare);
        awemeStatus2.allowComment = C1746a.m5877a(awemeStatusStructV2.allow_comment, awemeStatus2.allowComment);
        awemeStatus2.privateStatus = C1746a.m5871a(awemeStatusStructV2.private_status, awemeStatus2.privateStatus);
        awemeStatus2.inReviewing = C1746a.m5877a(awemeStatusStructV2.in_reviewing, awemeStatus2.inReviewing);
        awemeStatus2.reviewed = C1746a.m5871a(awemeStatusStructV2.reviewed, awemeStatus2.reviewed);
        awemeStatus2.selfSee = C1746a.m5877a(awemeStatusStructV2.self_see, awemeStatus2.selfSee);
        awemeStatus2.isProhibited = C1746a.m5877a(awemeStatusStructV2.is_prohibited, awemeStatus2.isProhibited);
        awemeStatus2.downloadStatus = C1746a.m5871a(awemeStatusStructV2.download_status, awemeStatus2.downloadStatus);
        awemeStatus2.excludeStatus = C1746a.m5871a(awemeStatusStructV2.dont_share_status, awemeStatus2.excludeStatus);
        awemeStatus2.allowRecommend = C1746a.m5871a(awemeStatusStructV2.video_hide_search, awemeStatus2.allowRecommend);
        awemeStatus2.videoMuteInfo = m5843x82e79a4(awemeStatusStructV2.video_mute, awemeStatus2.videoMuteInfo);
        return awemeStatus2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme */
    public static Aweme m5737xbda5a8e1(AwemeStructV2 awemeStructV2, Aweme aweme) {
        if (awemeStructV2 == null) {
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.aid = awemeStructV2.aweme_id == null ? aweme2.aid : awemeStructV2.aweme_id;
        aweme2.desc = awemeStructV2.desc == null ? aweme2.desc : awemeStructV2.desc;
        aweme2.createTime = C1746a.m5875a(awemeStructV2.create_time, aweme2.createTime);
        aweme2.author = m5840x2fb9c61e(awemeStructV2.author, aweme2.author);
        aweme2.music = m5798x2fe8170e(awemeStructV2.music, aweme2.music);
        aweme2.challengeList = m5677x890b881a(awemeStructV2.cha_list, aweme2.challengeList);
        aweme2.video = m5845xdc245461(awemeStructV2.video, aweme2.video);
        aweme2.shareUrl = awemeStructV2.share_url == null ? aweme2.shareUrl : awemeStructV2.share_url;
        aweme2.userDigg = C1746a.m5871a(awemeStructV2.user_digged, aweme2.userDigg);
        aweme2.statistics = m5735xadd88b01(awemeStructV2.statistics, aweme2.statistics);
        aweme2.status = m5736xf928bfe1(awemeStructV2.status, aweme2.status);
        aweme2.extra = awemeStructV2.extra == null ? aweme2.extra : awemeStructV2.extra;
        aweme2.rate = C1746a.m5871a(awemeStructV2.rate, aweme2.rate);
        aweme2.textExtra = m5700xdd10ff50(awemeStructV2.text_extra, aweme2.textExtra);
        aweme2.labelLarge = m5835xd6e21675(awemeStructV2.label_large, aweme2.labelLarge);
        aweme2.labelThumb = m5835xd6e21675(awemeStructV2.label_thumb, aweme2.labelThumb);
        aweme2.isTop = C1746a.m5871a(awemeStructV2.is_top, aweme2.isTop);
        aweme2.labelTop = m5835xd6e21675(awemeStructV2.label_top, aweme2.labelTop);
        aweme2.shareInfo = m5822xe4348698(awemeStructV2.share_info, aweme2.shareInfo);
        aweme2.originAuthor = m5835xd6e21675(awemeStructV2.label_origin_author, aweme2.originAuthor);
        aweme2.distance = awemeStructV2.distance == null ? aweme2.distance : awemeStructV2.distance;
        aweme2.musicStarter = m5835xd6e21675(awemeStructV2.label_music_starter, aweme2.musicStarter);
        aweme2.labelPrivate = m5835xd6e21675(awemeStructV2.label_private, aweme2.labelPrivate);
        aweme2.videoLabels = m5673x76f794a0(awemeStructV2.video_labels, aweme2.videoLabels);
        aweme2.isVr = C1746a.m5877a(awemeStructV2.is_vr, aweme2.isVr);
        aweme2.landingPage = awemeStructV2.landing_page == null ? aweme2.landingPage : awemeStructV2.landing_page;
        aweme2.isAd = C1746a.m5877a(awemeStructV2.is_ads, aweme2.isAd);
        aweme2.awemeType = C1746a.m5871a(awemeStructV2.aweme_type, aweme2.awemeType);
        aweme2.cmtSwt = C1746a.m5877a(awemeStructV2.cmt_swt, aweme2.cmtSwt);
        aweme2.imageInfos = m5683x71a3bddb(awemeStructV2.image_infos, aweme2.imageInfos);
        aweme2.awemeRiskModel = m5733x7282f728(awemeStructV2.risk_infos, aweme2.awemeRiskModel);
        aweme2.isRelieve = C1746a.m5877a(awemeStructV2.is_relieve, aweme2.isRelieve);
        aweme2.position = m5694xed17e9e(awemeStructV2.position, aweme2.position);
        aweme2.uniqidPosition = m5694xed17e9e(awemeStructV2.uniqid_position, aweme2.uniqidPosition);
        aweme2.isHashTag = C1746a.m5871a(awemeStructV2.is_hash_tag, aweme2.isHashTag);
        aweme2.isPgcShow = C1746a.m5877a(awemeStructV2.is_pgcshow, aweme2.isPgcShow);
        aweme2.region = awemeStructV2.region == null ? aweme2.region : awemeStructV2.region;
        aweme2.textVideoLabels = m5704x16f8d95a(awemeStructV2.video_text, aweme2.textVideoLabels);
        aweme2.specialSticker = m5826xd27658e1(awemeStructV2.sp_sticker, aweme2.specialSticker);
        aweme2.adSchedule = awemeStructV2.ad_schedule == null ? aweme2.adSchedule : awemeStructV2.ad_schedule;
        aweme2.collectStatus = C1746a.m5871a(awemeStructV2.collect_stat, aweme2.collectStatus);
        aweme2.textTopLabels = m5704x16f8d95a(awemeStructV2.label_top_text, aweme2.textTopLabels);
        aweme2.stickerIDs = awemeStructV2.stickers == null ? aweme2.stickerIDs : awemeStructV2.stickers;
        aweme2.forwardItem = m5737xbda5a8e1(awemeStructV2.forward_item, aweme2.forwardItem);
        aweme2.forwardCommentId = awemeStructV2.forward_comment_id == null ? aweme2.forwardCommentId : awemeStructV2.forward_comment_id;
        aweme2.forwardItemId = awemeStructV2.forward_item_id == null ? aweme2.forwardItemId : awemeStructV2.forward_item_id;
        aweme2.groupId = awemeStructV2.group_id == null ? aweme2.groupId : awemeStructV2.group_id;
        aweme2.preForwardId = awemeStructV2.pre_forward_id == null ? aweme2.preForwardId : awemeStructV2.pre_forward_id;
        aweme2.preventDownload = C1746a.m5877a(awemeStructV2.prevent_download, aweme2.preventDownload);
        aweme2.nicknamePosition = m5694xed17e9e(awemeStructV2.nickname_position, aweme2.nicknamePosition);
        aweme2.commentSetting = C1746a.m5871a(awemeStructV2.item_comment_settings, aweme2.commentSetting);
        aweme2.descendantsModel = m5756x20c3bc89(awemeStructV2.descendants, aweme2.descendantsModel);
        aweme2.awemeRawAd = C48333g.m91794a(awemeStructV2.raw_ad_data, aweme2.awemeRawAd);
        aweme2.gameInfo = m5765xcdef338b(awemeStructV2.game_info, aweme2.gameInfo);
        aweme2.microAppInfo = m5793x5742a110(awemeStructV2.micro_app_info, aweme2.microAppInfo);
        aweme2.withPromotionalMusic = C1746a.m5877a(awemeStructV2.with_promotional_music, aweme2.withPromotionalMusic);
        aweme2.linkAdData = C48333g.m91793a(awemeStructV2.link_ad_data, aweme2.linkAdData);
        aweme2.activityPendant = m5749xaa721a85(awemeStructV2.activity_pendant, aweme2.activityPendant);
        aweme2.stickerEntranceInfo = m5801xe7895fba(awemeStructV2.sticker_detail, aweme2.stickerEntranceInfo);
        aweme2.longVideos = m5686x8d23647(awemeStructV2.long_video, aweme2.longVideos);
        aweme2.duetSetting = C1746a.m5871a(awemeStructV2.item_duet, aweme2.duetSetting);
        aweme2.reactSetting = C1746a.m5871a(awemeStructV2.item_react, aweme2.reactSetting);
        aweme2.hotSearchInfo = m5734xdc86b975(awemeStructV2.hot_info, aweme2.hotSearchInfo);
        aweme2.starAtlasOrderId = C1746a.m5875a(awemeStructV2.star_atlas_order_id, aweme2.starAtlasOrderId);
        aweme2.mLabelMusicStarterText = awemeStructV2.label_music_starter_text == null ? aweme2.mLabelMusicStarterText : awemeStructV2.label_music_starter_text;
        aweme2.downloadWithoutWatermark = C1746a.m5877a(awemeStructV2.without_watermark, aweme2.downloadWithoutWatermark);
        aweme2.preload = m5810xdd7fa861(awemeStructV2.preload, aweme2.preload);
        aweme2.descLanguage = awemeStructV2.desc_language == null ? aweme2.descLanguage : awemeStructV2.desc_language;
        aweme2.floatingCardInfo = m5731xba8b7c80(awemeStructV2.floating_card_content, aweme2.floatingCardInfo);
        aweme2.interactStickerStructs = m5684xb33b7ec(awemeStructV2.interaction_stickers, aweme2.interactStickerStructs);
        aweme2.adLinkType = C1746a.m5871a(awemeStructV2.ad_link_type, aweme2.adLinkType);
        aweme2.takeDownReason = C1746a.m5871a(awemeStructV2.take_down_reason, aweme2.takeDownReason);
        aweme2.takeDownDesc = awemeStructV2.take_down_desc == null ? aweme2.takeDownDesc : awemeStructV2.take_down_desc;
        aweme2.uploadMiscInfoStructStr = awemeStructV2.misc_info == null ? aweme2.uploadMiscInfoStructStr : awemeStructV2.misc_info;
        aweme2.originCommentIds = awemeStructV2.origin_comment_ids == null ? aweme2.originCommentIds : awemeStructV2.origin_comment_ids;
        aweme2.commerceConfigDataList = m5678x76aeb75e(awemeStructV2.commerce_config_data, aweme2.commerceConfigDataList);
        aweme2.commerceStickerInfo = m5728xe74539ee(awemeStructV2.commerce_sticker_info, aweme2.commerceStickerInfo);
        aweme2.distributeType = C1746a.m5871a(awemeStructV2.distribute_type, aweme2.distributeType);
        aweme2.videoControl = m5842x817ae5e8(awemeStructV2.video_control, aweme2.videoControl);
        aweme2.isEffectDesigner = C1746a.m5878a(awemeStructV2.is_effect_designer, aweme2.isEffectDesigner);
        aweme2.adAwemeSource = C1746a.m5871a(awemeStructV2.ad_aweme_source, aweme2.adAwemeSource);
        aweme2.awemeControl = m5730xbb564985(awemeStructV2.aweme_control, aweme2.awemeControl);
        aweme2.hasVisionSearchEntry = C1746a.m5877a(awemeStructV2.has_vs_entry, aweme2.hasVisionSearchEntry);
        aweme2.anchor = m5718x94014543(awemeStructV2.anchor, aweme2.anchor);
        aweme2.feedRelationLabel = m5818x36fc5a9f(awemeStructV2.feed_relation_label, aweme2.feedRelationLabel);
        aweme2.mixInfo = m5796x5b231276(awemeStructV2.mix_info, aweme2.mixInfo);
        aweme2.hotListStruct = m5769x45439813(awemeStructV2.hot_list, aweme2.hotListStruct);
        aweme2.mCommerceVideoAuthInfo = m5729x337d8a6e(awemeStructV2.commerce_info, aweme2.mCommerceVideoAuthInfo);
        aweme2.bannerTip = m5738x4c72d636(awemeStructV2.banner_tip, aweme2.bannerTip);
        aweme2.anchorInfo = m5727x956cf17e(awemeStructV2.anchor_info, aweme2.anchorInfo);
        aweme2.mLiveAwesomeSplashInfo = m5743x8441e9e8(awemeStructV2.cny_info, aweme2.mLiveAwesomeSplashInfo);
        aweme2.isFamiliar = C1746a.m5877a(awemeStructV2.is_familiar, aweme2.isFamiliar);
        aweme2.needVisionSearchEntry = C1746a.m5877a(awemeStructV2.need_vs_entry, aweme2.needVisionSearchEntry);
        aweme2.mRoomFeedCellStruct = m5850xf777e67b(awemeStructV2.cell_room, aweme2.mRoomFeedCellStruct);
        aweme2.liveReaSon = awemeStructV2.live_reason == null ? aweme2.liveReaSon : awemeStructV2.live_reason;
        aweme2.videoFeedTag = awemeStructV2.video_feed_tag == null ? aweme2.videoFeedTag : awemeStructV2.video_feed_tag;
        aweme2.videoMaskInfo = m5786x59acc730(awemeStructV2.mask_info, aweme2.videoMaskInfo);
        aweme2.linkMatch = m5780x13c582e8(awemeStructV2.link_match, aweme2.linkMatch);
        aweme2.videoReplyStruct = m5844xc5fe6d6c(awemeStructV2.video_reply_info, aweme2.videoReplyStruct);
        aweme2.anchors = m5670x4869b99e(awemeStructV2.anchors, aweme2.anchors);
        aweme2.hybridLabels = m5682xa8867139(awemeStructV2.hybrid_label, aweme2.hybridLabels);
        aweme2.relationRecommendInfo = m5819xbcd34a71(awemeStructV2.relation_recommend_info, aweme2.relationRecommendInfo);
        aweme2.userProfileInitInfo = m5838xf505f47f(awemeStructV2.user_profile_init_info, aweme2.userProfileInitInfo);
        aweme2.withSurvey = C1746a.m5877a(awemeStructV2.with_survey, aweme2.withSurvey);
        aweme2.douDiscountMixInfo = m5734xdc86b975(awemeStructV2.dou_discount_mix_info, aweme2.douDiscountMixInfo);
        aweme2.awemeACLShareInfo = m5725x769da000(awemeStructV2.aweme_acl, aweme2.awemeACLShareInfo);
        aweme2.activity = m5726xe91d4881(awemeStructV2.activity, aweme2.activity);
        aweme2.stitchSetting = C1746a.m5871a(awemeStructV2.item_stitch, aweme2.stitchSetting);
        aweme2.geofencingRegions = awemeStructV2.geofencing_regions == null ? aweme2.geofencingRegions : awemeStructV2.geofencing_regions;
        aweme2.anchorsExtras = awemeStructV2.anchors_extras == null ? aweme2.anchorsExtras : awemeStructV2.anchors_extras;
        aweme2.allowGift = C1746a.m5877a(awemeStructV2.allow_gift, aweme2.allowGift);
        aweme2.mutualRelation = m5799xee758087(awemeStructV2.mutual_relation, aweme2.mutualRelation);
        aweme2.videoMaskInfos = m5687xbbea2df8(awemeStructV2.mask_infos, aweme2.videoMaskInfos);
        aweme2.boost = m5741x78681361(awemeStructV2.boost_tag_info, aweme2.boost);
        aweme2.bottomBarModel = m5742xd9ad4f68(awemeStructV2.bottom_bar, aweme2.bottomBarModel);
        aweme2.playlist_info = m5808x92361984(awemeStructV2.playlist_info, aweme2.playlist_info);
        aweme2.soundExemption = C1746a.m5871a(awemeStructV2.sound_exemption, aweme2.soundExemption);
        aweme2.playlistBlocked = C1746a.m5877a(awemeStructV2.playlist_blocked, aweme2.playlistBlocked);
        aweme2.partN = awemeStructV2.part_n == null ? aweme2.partN : awemeStructV2.part_n;
        aweme2.greenScreenMaterialList = m5681x1da9f380(awemeStructV2.green_screen_materials, aweme2.greenScreenMaterialList);
        aweme2.trendingBar = m5832x34e33474(awemeStructV2.trending_bar, aweme2.trendingBar);
        aweme2.userStory = m5839xccf885a7(awemeStructV2.user_story, aweme2.userStory);
        aweme2.story = m5827xe52ad918(awemeStructV2.story_metadata, aweme2.story);
        aweme2.interactPermission = m5774xe351426e(awemeStructV2.interact_permission, aweme2.interactPermission);
        aweme2.mItemDistributeSource = awemeStructV2.item_distribute_source == null ? aweme2.mItemDistributeSource : awemeStructV2.item_distribute_source;
        aweme2.questionInfo = m5695x9c3af3db(awemeStructV2.question_list, aweme2.questionInfo);
        aweme2.audio = m5721xe66bd481(awemeStructV2.audio, aweme2.audio);
        aweme2.upvoteReason = m5834xd3775a3b(awemeStructV2.upvote_reason, aweme2.upvoteReason);
        aweme2.deduplicationType = C1746a.m5871a(awemeStructV2.deduplication_type, aweme2.deduplicationType);
        aweme2.interactionTagInfo = m5776x1b810bd0(awemeStructV2.interaction_tag_info, aweme2.interactionTagInfo);
        aweme2.contentDesc = awemeStructV2.content_desc == null ? aweme2.contentDesc : awemeStructV2.content_desc;
        aweme2.contentDescExtra = m5700xdd10ff50(awemeStructV2.content_desc_extra, aweme2.contentDescExtra);
        aweme2.mItemSourceCategory = C1746a.m5871a(awemeStructV2.item_source_category, aweme2.mItemSourceCategory);
        aweme2.enablePosAdjust = C1746a.m5877a(awemeStructV2.enable_pos_adjust, aweme2.enablePosAdjust);
        aweme2.enableAdDrop = C1746a.m5877a(awemeStructV2.enable_ad_drop, aweme2.enableAdDrop);
        aweme2.predPlaytime = C1746a.m5871a(awemeStructV2.pred_playtime, aweme2.predPlaytime);
        aweme2.gapList = awemeStructV2.gap_list == null ? aweme2.gapList : awemeStructV2.gap_list;
        aweme2.isClientCache = C1746a.m5877a(awemeStructV2.is_client_cache, aweme2.isClientCache);
        aweme2.followUpPublishFromId = C1746a.m5876a(awemeStructV2.follow_up_publish_from_id, aweme2.followUpPublishFromId);
        aweme2.trendingBarFYP = m5831x4ef8d2d9(awemeStructV2.trending_bar_fyp, aweme2.trendingBarFYP);
        aweme2.disableSearchTrendingBar = C1746a.m5877a(awemeStructV2.disable_search_trending_bar, aweme2.disableSearchTrendingBar);
        return aweme2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$BannerTipV2$$com$ss$android$ugc$aweme$feed$model$BannerTip */
    public static BannerTip m5738x4c72d636(BannerTipV2 bannerTipV2, BannerTip bannerTip) {
        if (bannerTipV2 == null) {
            return bannerTip;
        }
        BannerTip bannerTip2 = new BannerTip();
        bannerTip2.bannerType = C1746a.m5871a(bannerTipV2.banner_type, bannerTip2.bannerType);
        bannerTip2.bannerTxt = bannerTipV2.banner_txt == null ? bannerTip2.bannerTxt : bannerTipV2.banner_txt;
        bannerTip2.linkType = C1746a.m5871a(bannerTipV2.link_type, bannerTip2.linkType);
        bannerTip2.linkUrl = bannerTipV2.link_url == null ? bannerTip2.linkUrl : bannerTipV2.link_url;
        bannerTip2.linkTxt = bannerTipV2.link_txt == null ? bannerTip2.linkTxt : bannerTipV2.link_txt;
        return bannerTip2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate */
    public static BitRate m5739x8afb92e1(BitRateStructV2 bitRateStructV2, BitRate bitRate) {
        if (bitRateStructV2 == null) {
            return bitRate;
        }
        BitRate bitRate2 = new BitRate();
        bitRate2.gearName = bitRateStructV2.gear_name == null ? bitRate2.gearName : bitRateStructV2.gear_name;
        bitRate2.qualityType = C1746a.m5871a(bitRateStructV2.quality_type, bitRate2.qualityType);
        bitRate2.bitRate = C1746a.m5871a(bitRateStructV2.bit_rate, bitRate2.bitRate);
        bitRate2.playAddr = m5835xd6e21675(bitRateStructV2.play_addr, bitRate2.playAddr);
        bitRate2.isBytevc1 = C1746a.m5871a(bitRateStructV2.is_bytevc1, bitRate2.isBytevc1);
        return bitRate2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$BlueVBrandInfoStructV2$$com$ss$android$ugc$aweme$profile$model$BlueVBrandInfo */
    public static BlueVBrandInfo m5740x254728de(BlueVBrandInfoStructV2 blueVBrandInfoStructV2, BlueVBrandInfo blueVBrandInfo) {
        if (blueVBrandInfoStructV2 == null) {
            return blueVBrandInfo;
        }
        BlueVBrandInfo blueVBrandInfo2 = new BlueVBrandInfo();
        blueVBrandInfo2.categoryId = C1746a.m5871a(blueVBrandInfoStructV2.category_id, blueVBrandInfo2.categoryId);
        blueVBrandInfo2.categoryName = blueVBrandInfoStructV2.category_name == null ? blueVBrandInfo2.categoryName : blueVBrandInfoStructV2.category_name;
        blueVBrandInfo2.brandId = C1746a.m5871a(blueVBrandInfoStructV2.brand_id, blueVBrandInfo2.brandId);
        blueVBrandInfo2.brandName = blueVBrandInfoStructV2.brand_name == null ? blueVBrandInfo2.brandName : blueVBrandInfoStructV2.brand_name;
        blueVBrandInfo2.logoUrl = m5835xd6e21675(blueVBrandInfoStructV2.logo_url, blueVBrandInfo2.logoUrl);
        blueVBrandInfo2.heat = C1746a.m5873a(blueVBrandInfoStructV2.heat, blueVBrandInfo2.heat);
        blueVBrandInfo2.rank = C1746a.m5871a(blueVBrandInfoStructV2.rank, blueVBrandInfo2.rank);
        blueVBrandInfo2.rankDiff = C1746a.m5871a(blueVBrandInfoStructV2.rank_diff, blueVBrandInfo2.rankDiff);
        blueVBrandInfo2.tagName = blueVBrandInfoStructV2.tag_name == null ? blueVBrandInfo2.tagName : blueVBrandInfoStructV2.tag_name;
        return blueVBrandInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$BoostStructV2$$com$ss$android$ugc$aweme$feed$model$Boost */
    public static Boost m5741x78681361(BoostStructV2 boostStructV2, Boost boost) {
        if (boostStructV2 == null) {
            return boost;
        }
        Boost boost2 = new Boost();
        boost2.text = boostStructV2.label == null ? boost2.text : boostStructV2.label;
        boost2.bgColor = boostStructV2.color == null ? boost2.bgColor : boostStructV2.color;
        boost2.textColor = boostStructV2.color_text == null ? boost2.textColor : boostStructV2.color_text;
        return boost2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$BottomBarStructV2$$com$ss$android$ugc$aweme$feed$model$BottomBarModel */
    public static BottomBarModel m5742xd9ad4f68(BottomBarStructV2 bottomBarStructV2, BottomBarModel bottomBarModel) {
        if (bottomBarStructV2 == null) {
            return bottomBarModel;
        }
        BottomBarModel bottomBarModel2 = new BottomBarModel();
        bottomBarModel2.content = bottomBarStructV2.content == null ? bottomBarModel2.content : bottomBarStructV2.content;
        bottomBarModel2.icon = m5835xd6e21675(bottomBarStructV2.icon, bottomBarModel2.icon);
        bottomBarModel2.type = C1746a.m5871a(bottomBarStructV2.type, bottomBarModel2.type);
        return bottomBarModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CNYStructV2$$com$ss$android$ugc$aweme$feed$model$livesplash$LiveAwesomeSplashInfo */
    public static LiveAwesomeSplashInfo m5743x8441e9e8(CNYStructV2 cNYStructV2, LiveAwesomeSplashInfo liveAwesomeSplashInfo) {
        if (cNYStructV2 == null) {
            return liveAwesomeSplashInfo;
        }
        LiveAwesomeSplashInfo liveAwesomeSplashInfo2 = new LiveAwesomeSplashInfo();
        liveAwesomeSplashInfo2.startTime = C1746a.m5875a(cNYStructV2.start_time, liveAwesomeSplashInfo2.startTime);
        liveAwesomeSplashInfo2.endTime = C1746a.m5875a(cNYStructV2.end_time, liveAwesomeSplashInfo2.endTime);
        liveAwesomeSplashInfo2.topviewValid = C1746a.m5877a(cNYStructV2.topview_valid, liveAwesomeSplashInfo2.topviewValid);
        liveAwesomeSplashInfo2.feedShowTime = C1746a.m5871a(cNYStructV2.feed_show_time, liveAwesomeSplashInfo2.feedShowTime);
        liveAwesomeSplashInfo2.liveData = cNYStructV2.live_info == null ? liveAwesomeSplashInfo2.liveData : cNYStructV2.live_info;
        return liveAwesomeSplashInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CaptionAnchorStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionAnchor */
    public static C67357a m5744xdc5213e8(CaptionAnchorStructV2 captionAnchorStructV2, C67357a aVar) {
        if (captionAnchorStructV2 == null) {
            return aVar;
        }
        C67357a aVar2 = new C67357a();
        aVar2.keyword = captionAnchorStructV2.keyword == null ? aVar2.keyword : captionAnchorStructV2.keyword;
        aVar2.link = captionAnchorStructV2.link == null ? aVar2.link : captionAnchorStructV2.link;
        aVar2.icon = m5835xd6e21675(captionAnchorStructV2.icon, aVar2.icon);
        return aVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CaptionInfoStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionInfo */
    public static C67358b m5745x52c73508(CaptionInfoStructV2 captionInfoStructV2, C67358b bVar) {
        if (captionInfoStructV2 == null) {
            return bVar;
        }
        C67358b bVar2 = new C67358b();
        bVar2.keyword = captionInfoStructV2.keyword == null ? bVar2.keyword : captionInfoStructV2.keyword;
        bVar2.link = captionInfoStructV2.link == null ? bVar2.link : captionInfoStructV2.link;
        return bVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CaptionStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionItemModel */
    public static CaptionItemModel m5746x90e6cc55(CaptionStructV2 captionStructV2, CaptionItemModel captionItemModel) {
        if (captionStructV2 == null) {
            return captionItemModel;
        }
        CaptionItemModel captionItemModel2 = new CaptionItemModel();
        captionItemModel2.languageName = captionStructV2.lang == null ? captionItemModel2.languageName : captionStructV2.lang;
        captionItemModel2.languageId = C1746a.m5875a(captionStructV2.language_id, captionItemModel2.languageId);
        captionItemModel2.url = captionStructV2.url == null ? captionItemModel2.url : captionStructV2.url;
        captionItemModel2.expire = C1746a.m5875a(captionStructV2.expire, captionItemModel2.expire);
        captionItemModel2.format = captionStructV2.caption_format == null ? captionItemModel2.format : captionStructV2.caption_format;
        captionItemModel2.complaintId = C1746a.m5875a(captionStructV2.complaint_id, captionItemModel2.complaintId);
        captionItemModel2.isAutoGenerated = C1746a.m5877a(captionStructV2.is_auto_generated, captionItemModel2.isAutoGenerated);
        captionItemModel2.subId = C1746a.m5871a(captionStructV2.sub_id, captionItemModel2.subId);
        captionItemModel2.versionType = captionStructV2.sub_version == null ? captionItemModel2.versionType : captionStructV2.sub_version;
        captionItemModel2.claSubtitleId = C1746a.m5876a(captionStructV2.cla_subtitle_id, captionItemModel2.claSubtitleId);
        captionItemModel2.translatorId = C1746a.m5876a(captionStructV2.translator_id, captionItemModel2.translatorId);
        return captionItemModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge */
    public static Challenge m5747x5652a2ac(ChallengeStructV2 challengeStructV2, Challenge challenge) {
        if (challengeStructV2 == null) {
            return challenge;
        }
        Challenge challenge2 = new Challenge();
        challenge2.cid = challengeStructV2.cid == null ? challenge2.cid : challengeStructV2.cid;
        challenge2.challengeName = challengeStructV2.cha_name == null ? challenge2.challengeName : challengeStructV2.cha_name;
        challenge2.desc = challengeStructV2.desc == null ? challenge2.desc : challengeStructV2.desc;
        challenge2.schema = challengeStructV2.schema == null ? challenge2.schema : challengeStructV2.schema;
        challenge2.author = m5840x2fb9c61e(challengeStructV2.author, challenge2.author);
        challenge2.userCount = C1746a.m5871a(challengeStructV2.user_count, challenge2.userCount);
        challenge2.shareInfo = m5822xe4348698(challengeStructV2.share_info, challenge2.shareInfo);
        challenge2.connectMusics = m5690xd117b1c(challengeStructV2.connect_music, challenge2.connectMusics);
        challenge2.type = C1746a.m5871a(challengeStructV2.type, challenge2.type);
        challenge2.subType = C1746a.m5871a(challengeStructV2.sub_type, challenge2.subType);
        challenge2.backgroundImageUrl = m5835xd6e21675(challengeStructV2.background_image_url, challenge2.backgroundImageUrl);
        challenge2.stickerId = challengeStructV2.sticker_id == null ? challenge2.stickerId : challengeStructV2.sticker_id;
        challenge2.linkText = challengeStructV2.link_text == null ? challenge2.linkText : challengeStructV2.link_text;
        challenge2.linkAction = challengeStructV2.link_action == null ? challenge2.linkAction : challengeStructV2.link_action;
        challenge2.pgcshow = C1746a.m5877a(challengeStructV2.is_pgcshow, challenge2.pgcshow);
        challenge2.collectStatus = C1746a.m5871a(challengeStructV2.collect_stat, challenge2.collectStatus);
        challenge2.coverItem = m5835xd6e21675(challengeStructV2.cover_item, challenge2.coverItem);
        challenge2.isChallenge = C1746a.m5871a(challengeStructV2.is_challenge, challenge2.isChallenge);
        challenge2.viewCount = C1746a.m5875a(challengeStructV2.view_count, challenge2.viewCount);
        challenge2.challengeDisclaimer = m5757x15f566f5(challengeStructV2.disclaimer, challenge2.challengeDisclaimer);
        challenge2.allowUploadCover = C1746a.m5869a(challengeStructV2.allow_upload_cover, challenge2.allowUploadCover);
        challenge2.isCommerceAndValid = C1746a.m5877a(challengeStructV2.is_commerce, challenge2.isCommerceAndValid);
        challenge2.challengeProfileUrl = challengeStructV2.hashtag_profile == null ? challenge2.challengeProfileUrl : challengeStructV2.hashtag_profile;
        challenge2.challengeBgUrl = challengeStructV2.cover_photo == null ? challenge2.challengeBgUrl : challengeStructV2.cover_photo;
        challenge2.isHotSearch = C1746a.m5871a(challengeStructV2.is_hot_search, challenge2.isHotSearch);
        challenge2.linkType = C1746a.m5871a(challengeStructV2.link_type, challenge2.linkType);
        challenge2.challengeAnnouncement = m5720xcb0a6e35(challengeStructV2.announcement_info, challenge2.challengeAnnouncement);
        challenge2.moduleType = C1746a.m5871a(challengeStructV2.module_type, challenge2.moduleType);
        challenge2.profileTagUrl = challengeStructV2.profile_tag == null ? challenge2.profileTagUrl : challengeStructV2.profile_tag;
        challenge2.attrs = challengeStructV2.cha_attrs == null ? challenge2.attrs : challengeStructV2.cha_attrs;
        challenge2.transfrom = m5772xdc170a42(challengeStructV2.button, challenge2.transfrom);
        return challenge2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ClaStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionModel */
    public static CaptionModel m5748x6367715a(ClaStructV2 claStructV2, CaptionModel captionModel) {
        if (claStructV2 == null) {
            return captionModel;
        }
        CaptionModel captionModel2 = new CaptionModel();
        captionModel2.hasOriginalAudio = C1746a.m5871a(claStructV2.has_original_audio, captionModel2.hasOriginalAudio);
        captionModel2.enableAutoCaption = C1746a.m5871a(claStructV2.enable_auto_caption, captionModel2.enableAutoCaption);
        captionModel2.originalCaptionLanguage = m5803x2d98efbc(claStructV2.original_language_info, captionModel2.originalCaptionLanguage);
        captionModel2.captionList = m5676x736d7a81(claStructV2.caption_infos, captionModel2.captionList);
        return captionModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceActivityStructV2$$com$ss$android$ugc$aweme$commerce$model$CommerceActivityStruct */
    public static C37513b m5749xaa721a85(CommerceActivityStructV2 commerceActivityStructV2, C37513b bVar) {
        if (commerceActivityStructV2 == null) {
            return bVar;
        }
        C37513b bVar2 = new C37513b();
        bVar2.actType = C1746a.m5871a(commerceActivityStructV2.act_type, bVar2.actType);
        bVar2.image = m5835xd6e21675(commerceActivityStructV2.image, bVar2.image);
        bVar2.jumpWebUrl = commerceActivityStructV2.jump_web_url == null ? bVar2.jumpWebUrl : commerceActivityStructV2.jump_web_url;
        bVar2.jumpOpenUrl = commerceActivityStructV2.jump_open_url == null ? bVar2.jumpOpenUrl : commerceActivityStructV2.jump_open_url;
        bVar2.title = commerceActivityStructV2.title == null ? bVar2.title : commerceActivityStructV2.title;
        bVar2.startTime = C1746a.m5875a(commerceActivityStructV2.start_time, bVar2.startTime);
        bVar2.endTime = C1746a.m5875a(commerceActivityStructV2.end_time, bVar2.endTime);
        bVar2.timeRange = m5669xa30ff353(commerceActivityStructV2.time_range, bVar2.timeRange);
        bVar2.trackUrlList = m5835xd6e21675(commerceActivityStructV2.track_url_list, bVar2.trackUrlList);
        bVar2.clickTrackUrlList = m5835xd6e21675(commerceActivityStructV2.click_track_url_list, bVar2.clickTrackUrlList);
        return bVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData */
    public static CommerceConfigData m5750x5692c932(CommerceConfigDataV2 commerceConfigDataV2, CommerceConfigData commerceConfigData) {
        if (commerceConfigDataV2 == null) {
            return commerceConfigData;
        }
        CommerceConfigData commerceConfigData2 = new CommerceConfigData();
        commerceConfigData2.type = C1746a.m5871a(commerceConfigDataV2.type, commerceConfigData2.type);
        commerceConfigData2.itemLikeEggData = m5778x1d28fe76(commerceConfigDataV2.item_like_egg, commerceConfigData2.itemLikeEggData);
        commerceConfigData2.itemCommentEggGroup = C48333g.m91795a(commerceConfigDataV2.data, commerceConfigData2.itemCommentEggGroup);
        return commerceConfigData2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceInfoStructV2$$com$ss$android$ugc$aweme$commerce$CommerceInfo */
    public static C37495f m5751x89ac5ff3(CommerceInfoStructV2 commerceInfoStructV2, C37495f fVar) {
        if (commerceInfoStructV2 == null) {
            return fVar;
        }
        C37495f fVar2 = new C37495f();
        fVar2.headImageUrl = m5835xd6e21675(commerceInfoStructV2.head_image_url, fVar2.headImageUrl);
        fVar2.offlineInfoList = m5692x3e86323(commerceInfoStructV2.offline_info_list, fVar2.offlineInfoList);
        fVar2.challengeList = m5677x890b881a(commerceInfoStructV2.challenge_list, fVar2.challengeList);
        fVar2.quickShopUrl = commerceInfoStructV2.quick_shop_url == null ? fVar2.quickShopUrl : commerceInfoStructV2.quick_shop_url;
        fVar2.quickShopName = commerceInfoStructV2.quick_shop_name == null ? fVar2.quickShopName : commerceInfoStructV2.quick_shop_name;
        fVar2.siteId = commerceInfoStructV2.site_id == null ? fVar2.siteId : commerceInfoStructV2.site_id;
        return fVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommercePermissionStructV2$$com$ss$android$ugc$aweme$profile$model$CommercePermissionStruct */
    public static CommercePermissionStruct m5752xdb3e10b3(CommercePermissionStructV2 commercePermissionStructV2, CommercePermissionStruct commercePermissionStruct) {
        if (commercePermissionStructV2 == null) {
            return commercePermissionStruct;
        }
        CommercePermissionStruct commercePermissionStruct2 = new CommercePermissionStruct();
        commercePermissionStruct2.topItem = C1746a.m5871a(commercePermissionStructV2.top_item, commercePermissionStruct2.topItem);
        commercePermissionStruct2.starAtlasOrder = C1746a.m5871a(commercePermissionStructV2.star_atlas_order, commercePermissionStruct2.starAtlasOrder);
        return commercePermissionStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceSticker */
    public static C75441c m5753xb40da7e0(CommerceStickerStructV2 commerceStickerStructV2, C75441c cVar) {
        if (commerceStickerStructV2 == null) {
            return cVar;
        }
        C75441c cVar2 = new C75441c();
        cVar2.f169533id = commerceStickerStructV2.f195410id == null ? cVar2.f169533id : commerceStickerStructV2.f195410id;
        cVar2.adOwnerId = commerceStickerStructV2.ad_owner_id == null ? cVar2.adOwnerId : commerceStickerStructV2.ad_owner_id;
        cVar2.adOwnerName = commerceStickerStructV2.ad_owner_name == null ? cVar2.adOwnerName : commerceStickerStructV2.ad_owner_name;
        cVar2.detailDesc = commerceStickerStructV2.detail_desc == null ? cVar2.detailDesc : commerceStickerStructV2.detail_desc;
        cVar2.detailLetters = commerceStickerStructV2.detail_letters == null ? cVar2.detailLetters : commerceStickerStructV2.detail_letters;
        cVar2.detailOpenUrl = commerceStickerStructV2.detail_open_url == null ? cVar2.detailOpenUrl : commerceStickerStructV2.detail_open_url;
        cVar2.detailWebUrl = commerceStickerStructV2.detail_web_url == null ? cVar2.detailWebUrl : commerceStickerStructV2.detail_web_url;
        cVar2.detailWebUrlTitle = commerceStickerStructV2.detail_web_url_title == null ? cVar2.detailWebUrlTitle : commerceStickerStructV2.detail_web_url_title;
        cVar2.screenDesc = commerceStickerStructV2.screen_desc == null ? cVar2.screenDesc : commerceStickerStructV2.screen_desc;
        cVar2.musicId = commerceStickerStructV2.music_id == null ? cVar2.musicId : commerceStickerStructV2.music_id;
        cVar2.challengeId = commerceStickerStructV2.challenge_id == null ? cVar2.challengeId : commerceStickerStructV2.challenge_id;
        cVar2.screenIcon = m5835xd6e21675(commerceStickerStructV2.screen_icon, cVar2.screenIcon);
        cVar2.expireTime = C1746a.m5875a(commerceStickerStructV2.expire_time, cVar2.expireTime);
        cVar2.commerceStickerUnlockInfo = m5754x5f668cb6(commerceStickerStructV2.unlock_info, cVar2.commerceStickerUnlockInfo);
        return cVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceStickerUnlockStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceStickerUnlockInfo */
    public static C75442d m5754x5f668cb6(CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2, C75442d dVar) {
        if (commerceStickerUnlockStructV2 == null) {
            return dVar;
        }
        C75442d dVar2 = new C75442d();
        dVar2.desc = commerceStickerUnlockStructV2.desc == null ? dVar2.desc : commerceStickerUnlockStructV2.desc;
        dVar2.webUrl = commerceStickerUnlockStructV2.web_url == null ? dVar2.webUrl : commerceStickerUnlockStructV2.web_url;
        dVar2.openUrl = commerceStickerUnlockStructV2.open_url == null ? dVar2.openUrl : commerceStickerUnlockStructV2.open_url;
        return dVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$CommerceUserStructV2$$com$ss$android$ugc$aweme$profile$model$CommerceUserInfo */
    public static CommerceUserInfo m5755x60620bcc(CommerceUserStructV2 commerceUserStructV2, CommerceUserInfo commerceUserInfo) {
        if (commerceUserStructV2 == null) {
            return commerceUserInfo;
        }
        CommerceUserInfo commerceUserInfo2 = new CommerceUserInfo();
        commerceUserInfo2.starAtlas = C1746a.m5871a(commerceUserStructV2.star_atlas, commerceUserInfo2.starAtlas);
        commerceUserInfo2.showStarAtlasCooperation = C1746a.m5877a(commerceUserStructV2.show_star_atlas_cooperation, commerceUserInfo2.showStarAtlasCooperation);
        commerceUserInfo2.hasAdEntry = C1746a.m5877a(commerceUserStructV2.has_ads_entry, commerceUserInfo2.hasAdEntry);
        commerceUserInfo2.linkUserInfo = m5781x809a4293(commerceUserStructV2.link_user_info, commerceUserInfo2.linkUserInfo);
        commerceUserInfo2.adInfluencerType = C1746a.m5871a(commerceUserStructV2.ad_influencer_type, commerceUserInfo2.adInfluencerType);
        return commerceUserInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$DescendantStructV2$$com$ss$android$ugc$aweme$feed$model$DescendantsModel */
    public static DescendantsModel m5756x20c3bc89(DescendantStructV2 descendantStructV2, DescendantsModel descendantsModel) {
        if (descendantStructV2 == null) {
            return descendantsModel;
        }
        DescendantsModel descendantsModel2 = new DescendantsModel();
        descendantsModel2.platforms = descendantStructV2.platforms == null ? descendantsModel2.platforms : descendantStructV2.platforms;
        descendantsModel2.notifyMsg = descendantStructV2.notify_msg == null ? descendantsModel2.notifyMsg : descendantStructV2.notify_msg;
        return descendantsModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$DisclaimerStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeDisclaimer */
    public static ChallengeDisclaimer m5757x15f566f5(DisclaimerStructV2 disclaimerStructV2, ChallengeDisclaimer challengeDisclaimer) {
        if (disclaimerStructV2 == null) {
            return challengeDisclaimer;
        }
        ChallengeDisclaimer challengeDisclaimer2 = new ChallengeDisclaimer();
        challengeDisclaimer2.title = disclaimerStructV2.title == null ? challengeDisclaimer2.title : disclaimerStructV2.title;
        challengeDisclaimer2.content = disclaimerStructV2.content == null ? challengeDisclaimer2.content : disclaimerStructV2.content;
        return challengeDisclaimer2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$DuetWithMeStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$DuetStickerStruct */
    public static DuetStickerStruct m5758x7db2ce42(DuetWithMeStickerStructV2 duetWithMeStickerStructV2, DuetStickerStruct duetStickerStruct) {
        if (duetWithMeStickerStructV2 == null) {
            return duetStickerStruct;
        }
        DuetStickerStruct duetStickerStruct2 = new DuetStickerStruct();
        duetStickerStruct2.userIdList = duetWithMeStickerStructV2.invitedToDuetUserIds == null ? duetStickerStruct2.userIdList : duetWithMeStickerStructV2.invitedToDuetUserIds;
        duetStickerStruct2.openMic = C1746a.m5877a(duetWithMeStickerStructV2.micPermissionOn, duetStickerStruct2.openMic);
        duetStickerStruct2.duetString = duetWithMeStickerStructV2.stickerContent == null ? duetStickerStruct2.duetString : duetWithMeStickerStructV2.stickerContent;
        return duetStickerStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$EffectArtistStructV2$$com$ss$android$ugc$aweme$profile$model$EffectArtistDetail */
    public static EffectArtistDetail m5759xcd80c52f(EffectArtistStructV2 effectArtistStructV2, EffectArtistDetail effectArtistDetail) {
        if (effectArtistStructV2 == null) {
            return effectArtistDetail;
        }
        EffectArtistDetail effectArtistDetail2 = new EffectArtistDetail();
        effectArtistDetail2.total = C1746a.m5871a(effectArtistStructV2.total, effectArtistDetail2.total);
        return effectArtistDetail2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ExternalRecommendReasonStructV2$$com$ss$android$ugc$aweme$profile$model$ExternalRecommendReasonStruct */
    public static ExternalRecommendReasonStruct m5760x608d2ba7(ExternalRecommendReasonStructV2 externalRecommendReasonStructV2, ExternalRecommendReasonStruct externalRecommendReasonStruct) {
        if (externalRecommendReasonStructV2 == null) {
            return externalRecommendReasonStruct;
        }
        ExternalRecommendReasonStruct externalRecommendReasonStruct2 = new ExternalRecommendReasonStruct();
        externalRecommendReasonStruct2.reason = externalRecommendReasonStructV2.reason == null ? externalRecommendReasonStruct2.reason : externalRecommendReasonStructV2.reason;
        externalRecommendReasonStruct2.hashedPhoneNumber = externalRecommendReasonStructV2.hashed_phone_number == null ? externalRecommendReasonStruct2.hashedPhoneNumber : externalRecommendReasonStructV2.hashed_phone_number;
        externalRecommendReasonStruct2.externalUsername = externalRecommendReasonStructV2.external_username == null ? externalRecommendReasonStruct2.externalUsername : externalRecommendReasonStructV2.external_username;
        return externalRecommendReasonStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo */
    public static ExternalMusicInfo m5761xc9224d66(ExternalSongStructV2 externalSongStructV2, ExternalMusicInfo externalMusicInfo) {
        if (externalSongStructV2 == null) {
            return externalMusicInfo;
        }
        ExternalMusicInfo externalMusicInfo2 = new ExternalMusicInfo();
        externalMusicInfo2.jumpUrl = externalSongStructV2.h5_url == null ? externalMusicInfo2.jumpUrl : externalSongStructV2.h5_url;
        externalMusicInfo2.partnerName = externalSongStructV2.partner_name == null ? externalMusicInfo2.partnerName : externalSongStructV2.partner_name;
        externalMusicInfo2.partnerSongId = externalSongStructV2.partner_song_id == null ? externalMusicInfo2.partnerSongId : externalSongStructV2.partner_song_id;
        externalMusicInfo2.externalSongKey = externalSongStructV2.external_song_key == null ? externalMusicInfo2.externalSongKey : externalSongStructV2.external_song_key;
        return externalMusicInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ExtraStructV2$$com$ss$android$ugc$aweme$feed$model$Extra */
    public static Extra m5762x7e6bce41(ExtraStructV2 extraStructV2, Extra extra) {
        if (extraStructV2 == null) {
            return extra;
        }
        Extra extra2 = new Extra();
        extra2.now = C1746a.m5875a(extraStructV2.now, extra2.now);
        extra2.fatalItemIds = extraStructV2.fatal_item_ids == null ? extra2.fatalItemIds : extraStructV2.fatal_item_ids;
        return extra2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$FansStructV2$$com$ss$android$ugc$aweme$feed$model$live$FansStruct */
    public static FansStruct m5763x43c70f74(FansStructV2 fansStructV2, FansStruct fansStruct) {
        if (fansStructV2 == null) {
            return fansStruct;
        }
        FansStruct fansStruct2 = new FansStruct();
        fansStruct2.fansName = fansStructV2.fans_name == null ? fansStruct2.fansName : fansStructV2.fans_name;
        fansStruct2.fansLevel = C1746a.m5871a(fansStructV2.fans_level, fansStruct2.fansLevel);
        fansStruct2.isFan = C1746a.m5877a(fansStructV2.is_fan, fansStruct2.isFan);
        fansStruct2.lightUp = C1746a.m5877a(fansStructV2.light_up, fansStruct2.lightUp);
        return fansStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail */
    public static FollowerDetail m5764xc3646396(FollowersDetailV2 followersDetailV2, FollowerDetail followerDetail) {
        if (followersDetailV2 == null) {
            return followerDetail;
        }
        FollowerDetail followerDetail2 = new FollowerDetail();
        followerDetail2.name = followersDetailV2.name == null ? followerDetail2.name : followersDetailV2.name;
        followerDetail2.icon = followersDetailV2.icon == null ? followerDetail2.icon : followersDetailV2.icon;
        followerDetail2.fansCount = C1746a.m5871a(followersDetailV2.fans_count, followerDetail2.fansCount);
        followerDetail2.openUrl = followersDetailV2.open_url == null ? followerDetail2.openUrl : followersDetailV2.open_url;
        followerDetail2.appleId = followersDetailV2.apple_id == null ? followerDetail2.appleId : followersDetailV2.apple_id;
        followerDetail2.downloadUrl = followersDetailV2.download_url == null ? followerDetail2.downloadUrl : followersDetailV2.download_url;
        followerDetail2.packageName = followersDetailV2.package_name == null ? followerDetail2.packageName : followersDetailV2.package_name;
        followerDetail2.appName = followersDetailV2.app_name == null ? followerDetail2.appName : followersDetailV2.app_name;
        return followerDetail2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$GameStructV2$$com$ss$android$ugc$aweme$feed$model$GameInfo */
    public static GameInfo m5765xcdef338b(GameStructV2 gameStructV2, GameInfo gameInfo) {
        if (gameStructV2 == null) {
            return gameInfo;
        }
        GameInfo gameInfo2 = new GameInfo();
        gameInfo2.gameType = C1746a.m5871a(gameStructV2.game_type, gameInfo2.gameType);
        gameInfo2.gameScore = C1746a.m5871a(gameStructV2.game_score, gameInfo2.gameScore);
        return gameInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$GreenScreenMaterialV2$$com$ss$android$ugc$aweme$feed$model$GreenScreenMaterial */
    public static GreenScreenMaterial m5766x639c64d6(GreenScreenMaterialV2 greenScreenMaterialV2, GreenScreenMaterial greenScreenMaterial) {
        if (greenScreenMaterialV2 == null) {
            return greenScreenMaterial;
        }
        GreenScreenMaterial greenScreenMaterial2 = new GreenScreenMaterial();
        greenScreenMaterial2.type = C1746a.m5871a(greenScreenMaterialV2.type, greenScreenMaterial2.type);
        greenScreenMaterial2.startTime = C1746a.m5875a(greenScreenMaterialV2.start_time, greenScreenMaterial2.startTime);
        greenScreenMaterial2.endTime = C1746a.m5875a(greenScreenMaterialV2.end_time, greenScreenMaterial2.endTime);
        greenScreenMaterial2.resId = greenScreenMaterialV2.resource_id == null ? greenScreenMaterial2.resId : greenScreenMaterialV2.resource_id;
        greenScreenMaterial2.authorName = greenScreenMaterialV2.author_name == null ? greenScreenMaterial2.authorName : greenScreenMaterialV2.author_name;
        greenScreenMaterial2.stickerId = greenScreenMaterialV2.effect_id == null ? greenScreenMaterial2.stickerId : greenScreenMaterialV2.effect_id;
        return greenScreenMaterial2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$GuideWordV2$$com$ss$android$ugc$aweme$feed$model$HotSearchGuideWord */
    public static HotSearchGuideWord m5767xd7636a61(GuideWordV2 guideWordV2, HotSearchGuideWord hotSearchGuideWord) {
        if (guideWordV2 == null) {
            return hotSearchGuideWord;
        }
        HotSearchGuideWord hotSearchGuideWord2 = new HotSearchGuideWord();
        hotSearchGuideWord2.displayWord = guideWordV2.word == null ? hotSearchGuideWord2.displayWord : guideWordV2.word;
        hotSearchGuideWord2.searchWord = guideWordV2.search_word == null ? hotSearchGuideWord2.searchWord : guideWordV2.search_word;
        hotSearchGuideWord2.type = C1746a.m5871a(guideWordV2.type, hotSearchGuideWord2.type);
        hotSearchGuideWord2.breatheTimes = C1746a.m5871a(guideWordV2.breathe_times, hotSearchGuideWord2.breatheTimes);
        return hotSearchGuideWord2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$HashTagStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$HashtagStruct */
    public static HashtagStruct m5768x8437b285(HashTagStickerStructV2 hashTagStickerStructV2, HashtagStruct hashtagStruct) {
        if (hashTagStickerStructV2 == null) {
            return hashtagStruct;
        }
        HashtagStruct hashtagStruct2 = new HashtagStruct();
        hashtagStruct2.hashtagName = hashTagStickerStructV2.hashtag_name == null ? hashtagStruct2.hashtagName : hashTagStickerStructV2.hashtag_name;
        hashtagStruct2.hashtagId = hashTagStickerStructV2.hashtag_id == null ? hashtagStruct2.hashtagId : hashTagStickerStructV2.hashtag_id;
        hashtagStruct2.status = C1746a.m5871a(hashTagStickerStructV2.status, hashtagStruct2.status);
        return hashtagStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$HotListStructV2$$com$ss$android$ugc$aweme$profile$model$HotListStruct */
    public static HotListStruct m5769x45439813(HotListStructV2 hotListStructV2, HotListStruct hotListStruct) {
        if (hotListStructV2 == null) {
            return hotListStruct;
        }
        HotListStruct hotListStruct2 = new HotListStruct();
        hotListStruct2.titile = hotListStructV2.title == null ? hotListStruct2.titile : hotListStructV2.title;
        hotListStruct2.imageUrl = hotListStructV2.image_url == null ? hotListStruct2.imageUrl : hotListStructV2.image_url;
        hotListStruct2.schema = hotListStructV2.schema == null ? hotListStruct2.schema : hotListStructV2.schema;
        hotListStruct2.type = C1746a.m5871a(hotListStructV2.type, hotListStruct2.type);
        hotListStruct2.header = hotListStructV2.header == null ? hotListStruct2.header : hotListStructV2.header;
        hotListStruct2.footer = hotListStructV2.footer == null ? hotListStruct2.footer : hotListStructV2.footer;
        return hotListStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$HotsearchSprintStructV2$$com$ss$android$ugc$aweme$profile$model$HotSearchSprintStruct */
    public static HotSearchSprintStruct m5770xbdc2a07b(HotsearchSprintStructV2 hotsearchSprintStructV2, HotSearchSprintStruct hotSearchSprintStruct) {
        if (hotsearchSprintStructV2 == null) {
            return hotSearchSprintStruct;
        }
        HotSearchSprintStruct hotSearchSprintStruct2 = new HotSearchSprintStruct();
        hotSearchSprintStruct2.sprint = C1746a.m5871a(hotsearchSprintStructV2.sprint, hotSearchSprintStruct2.sprint);
        hotSearchSprintStruct2.hitRankPeoples = m5699x7b892b96(hotsearchSprintStructV2.followers, hotSearchSprintStruct2.hitRankPeoples);
        return hotSearchSprintStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$HybridLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel */
    public static AwemeHybridLabelModel m5771xef19dc1(HybridLabelStructV2 hybridLabelStructV2, AwemeHybridLabelModel awemeHybridLabelModel) {
        if (hybridLabelStructV2 == null) {
            return awemeHybridLabelModel;
        }
        AwemeHybridLabelModel awemeHybridLabelModel2 = new AwemeHybridLabelModel();
        awemeHybridLabelModel2.backgroundColor = hybridLabelStructV2.background_color == null ? awemeHybridLabelModel2.backgroundColor : hybridLabelStructV2.background_color;
        awemeHybridLabelModel2.text = hybridLabelStructV2.text == null ? awemeHybridLabelModel2.text : hybridLabelStructV2.text;
        awemeHybridLabelModel2.textColor = hybridLabelStructV2.text_color == null ? awemeHybridLabelModel2.textColor : hybridLabelStructV2.text_color;
        awemeHybridLabelModel2.imageUrl = m5835xd6e21675(hybridLabelStructV2.image, awemeHybridLabelModel2.imageUrl);
        awemeHybridLabelModel2.refUrl = hybridLabelStructV2.ref_url == null ? awemeHybridLabelModel2.refUrl : hybridLabelStructV2.ref_url;
        return awemeHybridLabelModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$IconButtonStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeTransform */
    public static ChallengeTransform m5772xdc170a42(IconButtonStructV2 iconButtonStructV2, ChallengeTransform challengeTransform) {
        if (iconButtonStructV2 == null) {
            return challengeTransform;
        }
        ChallengeTransform challengeTransform2 = new ChallengeTransform();
        challengeTransform2.text = iconButtonStructV2.text == null ? challengeTransform2.text : iconButtonStructV2.text;
        challengeTransform2.iconUrlModel = m5835xd6e21675(iconButtonStructV2.icon, challengeTransform2.iconUrlModel);
        challengeTransform2.action = iconButtonStructV2.action == null ? challengeTransform2.action : iconButtonStructV2.action;
        return challengeTransform2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo */
    public static ImageInfo m5773x9f65f721(ImageInfoStructV2 imageInfoStructV2, ImageInfo imageInfo) {
        if (imageInfoStructV2 == null) {
            return imageInfo;
        }
        ImageInfo imageInfo2 = new ImageInfo();
        imageInfo2.height = C1746a.m5871a(imageInfoStructV2.height, imageInfo2.height);
        imageInfo2.width = C1746a.m5871a(imageInfoStructV2.width, imageInfo2.width);
        imageInfo2.labelLarge = m5835xd6e21675(imageInfoStructV2.label_large, imageInfo2.labelLarge);
        imageInfo2.labelThumb = m5835xd6e21675(imageInfoStructV2.label_thumb, imageInfo2.labelThumb);
        return imageInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$InteractPermissionV2$$com$ss$android$ugc$aweme$feed$model$InteractPermission */
    public static InteractPermission m5774xe351426e(InteractPermissionV2 interactPermissionV2, InteractPermission interactPermission) {
        if (interactPermissionV2 == null) {
            return interactPermission;
        }
        InteractPermission interactPermission2 = new InteractPermission();
        interactPermission2.duet = C1746a.m5871a(interactPermissionV2.duet, interactPermission2.duet);
        interactPermission2.stitch = C1746a.m5871a(interactPermissionV2.stitch, interactPermission2.stitch);
        interactPermission2.duetPrivacySettingControl = C1746a.m5871a(interactPermissionV2.duet_privacy_setting, interactPermission2.duetPrivacySettingControl);
        interactPermission2.stitchPrivacySettingControl = C1746a.m5871a(interactPermissionV2.stitch_privacy_setting, interactPermission2.stitchPrivacySettingControl);
        interactPermission2.upvote = C1746a.m5871a(interactPermissionV2.upvote, interactPermission2.upvote);
        return interactPermission2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct */
    public static InteractStickerStruct m5775x24286486(InteractionStickerStructV2 interactionStickerStructV2, InteractStickerStruct interactStickerStruct) {
        if (interactionStickerStructV2 == null) {
            return interactStickerStruct;
        }
        InteractStickerStruct interactStickerStruct2 = new InteractStickerStruct();
        interactStickerStruct2.type = C1746a.m5871a(interactionStickerStructV2.type, interactStickerStruct2.type);
        interactStickerStruct2.index = C1746a.m5871a(interactionStickerStructV2.index, interactStickerStruct2.index);
        interactStickerStruct2.trackList = interactionStickerStructV2.track_info == null ? interactStickerStruct2.trackList : interactionStickerStructV2.track_info;
        interactStickerStruct2.attr = interactionStickerStructV2.attr == null ? interactStickerStruct2.attr : interactionStickerStructV2.attr;
        interactStickerStruct2.pollStruct = m5849x15cd8d29(interactionStickerStructV2.vote_info, interactStickerStruct2.pollStruct);
        interactStickerStruct2.mTextStruct = interactionStickerStructV2.text_info == null ? interactStickerStruct2.mTextStruct : interactionStickerStructV2.text_info;
        interactStickerStruct2.mentionInfo = m5791x94b82161(interactionStickerStructV2.mention_info, interactStickerStruct2.mentionInfo);
        interactStickerStruct2.hashtagInfo = m5768x8437b285(interactionStickerStructV2.hashtag_info, interactStickerStruct2.hashtagInfo);
        interactStickerStruct2.mCountDownStickerStruct = m5782xf246c944(interactionStickerStructV2.countdown_info, interactStickerStruct2.mCountDownStickerStruct);
        interactStickerStruct2.mCaptionStruct = m5723x46d4fcb6(interactionStickerStructV2.auto_video_caption_info, interactStickerStruct2.mCaptionStruct);
        interactStickerStruct2.duetStickerStruct = m5758x7db2ce42(interactionStickerStructV2.duet_with_me, interactStickerStruct2.duetStickerStruct);
        interactStickerStruct2.mQaStruct = m5813x4fe8860d(interactionStickerStructV2.question_info, interactStickerStruct2.mQaStruct);
        return interactStickerStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$InteractionTagInfoV2$$com$ss$android$ugc$aweme$feed$model$InteractionTagInfo */
    public static InteractionTagInfo m5776x1b810bd0(InteractionTagInfoV2 interactionTagInfoV2, InteractionTagInfo interactionTagInfo) {
        if (interactionTagInfoV2 == null) {
            return interactionTagInfo;
        }
        InteractionTagInfo interactionTagInfo2 = new InteractionTagInfo();
        interactionTagInfo2.interestLevel = C1746a.m5871a(interactionTagInfoV2.interest_level, interactionTagInfo2.interestLevel);
        interactionTagInfo2.videoLabelText = interactionTagInfoV2.video_label_text == null ? interactionTagInfo2.videoLabelText : interactionTagInfoV2.video_label_text;
        interactionTagInfo2.taggedUsers = m5685x7535011e(interactionTagInfoV2.tagged_users, interactionTagInfo2.taggedUsers);
        return interactionTagInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$InteractionTagUserInfoV2$$com$ss$android$ugc$aweme$feed$model$InteractionTagUserInfo */
    public static InteractionTagUserInfo m5777xe67073e6(InteractionTagUserInfoV2 interactionTagUserInfoV2, InteractionTagUserInfo interactionTagUserInfo) {
        if (interactionTagUserInfoV2 == null) {
            return interactionTagUserInfo;
        }
        InteractionTagUserInfo interactionTagUserInfo2 = new InteractionTagUserInfo();
        interactionTagUserInfo2.uid = interactionTagUserInfoV2.uid == null ? interactionTagUserInfo2.uid : interactionTagUserInfoV2.uid;
        interactionTagUserInfo2.uniqueId = interactionTagUserInfoV2.unique_id == null ? interactionTagUserInfo2.uniqueId : interactionTagUserInfoV2.unique_id;
        interactionTagUserInfo2.nickname = interactionTagUserInfoV2.nickname == null ? interactionTagUserInfo2.nickname : interactionTagUserInfoV2.nickname;
        interactionTagUserInfo2.avatarThumb = m5835xd6e21675(interactionTagUserInfoV2.avatar_thumb, interactionTagUserInfo2.avatarThumb);
        interactionTagUserInfo2.followStatus = C1746a.m5871a(interactionTagUserInfoV2.follow_status, interactionTagUserInfo2.followStatus);
        interactionTagUserInfo2.followerStatus = C1746a.m5871a(interactionTagUserInfoV2.follower_status, interactionTagUserInfo2.followerStatus);
        interactionTagUserInfo2.isPrivateAccount = C1746a.m5871a(interactionTagUserInfoV2.is_private_account, interactionTagUserInfo2.isPrivateAccount);
        interactionTagUserInfo2.customVerify = interactionTagUserInfoV2.custom_verify == null ? interactionTagUserInfo2.customVerify : interactionTagUserInfoV2.custom_verify;
        interactionTagUserInfo2.enterpriseVerifyReason = interactionTagUserInfoV2.enterprise_verify_reason == null ? interactionTagUserInfo2.enterpriseVerifyReason : interactionTagUserInfoV2.enterprise_verify_reason;
        interactionTagUserInfo2.interestLevel = C1746a.m5871a(interactionTagUserInfoV2.interest_level, interactionTagUserInfo2.interestLevel);
        return interactionTagUserInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ItemLikeEggDataV2$$com$ss$android$ugc$aweme$feed$model$ItemLikeEggData */
    public static ItemLikeEggData m5778x1d28fe76(ItemLikeEggDataV2 itemLikeEggDataV2, ItemLikeEggData itemLikeEggData) {
        if (itemLikeEggDataV2 == null) {
            return itemLikeEggData;
        }
        ItemLikeEggData itemLikeEggData2 = new ItemLikeEggData();
        itemLikeEggData2.materialUrl = itemLikeEggDataV2.material_url == null ? itemLikeEggData2.materialUrl : itemLikeEggDataV2.material_url;
        itemLikeEggData2.fileType = itemLikeEggDataV2.file_type == null ? itemLikeEggData2.fileType : itemLikeEggDataV2.file_type;
        return itemLikeEggData2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LifeStoryBlockStructV2$$com$ss$android$ugc$aweme$profile$model$StoryBlockInfo */
    public static StoryBlockInfo m5779x63b96a30(LifeStoryBlockStructV2 lifeStoryBlockStructV2, StoryBlockInfo storyBlockInfo) {
        if (lifeStoryBlockStructV2 == null) {
            return storyBlockInfo;
        }
        StoryBlockInfo storyBlockInfo2 = new StoryBlockInfo();
        storyBlockInfo2.isBlock = C1746a.m5877a(lifeStoryBlockStructV2.life_story_block, storyBlockInfo2.isBlock);
        storyBlockInfo2.isBlocked = C1746a.m5877a(lifeStoryBlockStructV2.life_story_blocked, storyBlockInfo2.isBlocked);
        return storyBlockInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LinkMatchStructV2$$com$ss$android$ugc$aweme$search$caption$LinkMatch */
    public static C67359c m5780x13c582e8(LinkMatchStructV2 linkMatchStructV2, C67359c cVar) {
        if (linkMatchStructV2 == null) {
            return cVar;
        }
        C67359c cVar2 = new C67359c();
        cVar2.totalLimit = C1746a.m5871a(linkMatchStructV2.total_limit, cVar2.totalLimit);
        cVar2.queryLimit = C1746a.m5871a(linkMatchStructV2.query_limit, cVar2.queryLimit);
        cVar2.matchInfoList = m5688xa5b614b6(linkMatchStructV2.match_info, cVar2.matchInfoList);
        cVar2.captionInfo = m5745x52c73508(linkMatchStructV2.caption_info, cVar2.captionInfo);
        cVar2.captionAnchor = m5744xdc5213e8(linkMatchStructV2.caption_anchor, cVar2.captionAnchor);
        return cVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LinkUserInfoStructV2$$com$ss$android$ugc$aweme$profile$model$LinkUserInfoStruct */
    public static LinkUserInfoStruct m5781x809a4293(LinkUserInfoStructV2 linkUserInfoStructV2, LinkUserInfoStruct linkUserInfoStruct) {
        if (linkUserInfoStructV2 == null) {
            return linkUserInfoStruct;
        }
        LinkUserInfoStruct linkUserInfoStruct2 = new LinkUserInfoStruct();
        linkUserInfoStruct2.authStatus = C1746a.m5871a(linkUserInfoStructV2.auth_status, linkUserInfoStruct2.authStatus);
        linkUserInfoStruct2.authType = C1746a.m5871a(linkUserInfoStructV2.auth_type, linkUserInfoStruct2.authType);
        return linkUserInfoStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LiveCountdownStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$CountDownStickerStruct */
    public static CountDownStickerStruct m5782xf246c944(LiveCountdownStickerStructV2 liveCountdownStickerStructV2, CountDownStickerStruct countDownStickerStruct) {
        if (liveCountdownStickerStructV2 == null) {
            return countDownStickerStruct;
        }
        CountDownStickerStruct countDownStickerStruct2 = new CountDownStickerStruct();
        countDownStickerStruct2.title = liveCountdownStickerStructV2.title == null ? countDownStickerStruct2.title : liveCountdownStickerStructV2.title;
        countDownStickerStruct2.expiredTime = liveCountdownStickerStructV2.end_time == null ? countDownStickerStruct2.expiredTime : liveCountdownStickerStructV2.end_time;
        countDownStickerStruct2.subscribeNum = C1746a.m5875a(liveCountdownStickerStructV2.subscribe_count, countDownStickerStruct2.subscribeNum);
        countDownStickerStruct2.subscribe = liveCountdownStickerStructV2.is_subscribed == null ? countDownStickerStruct2.subscribe : liveCountdownStickerStructV2.is_subscribed;
        countDownStickerStruct2.textTobeSubscribed = liveCountdownStickerStructV2.text_to_be_subscribed == null ? countDownStickerStruct2.textTobeSubscribed : liveCountdownStickerStructV2.text_to_be_subscribed;
        countDownStickerStruct2.textAlreadySubscribed = liveCountdownStickerStructV2.text_already_subscribed == null ? countDownStickerStruct2.textAlreadySubscribed : liveCountdownStickerStructV2.text_already_subscribed;
        countDownStickerStruct2.textAlreadyExpired = liveCountdownStickerStructV2.text_already_ended == null ? countDownStickerStruct2.textAlreadyExpired : liveCountdownStickerStructV2.text_already_ended;
        return countDownStickerStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LiveHonorStructV2$$com$ss$android$ugc$aweme$profile$model$HonorStruct */
    public static HonorStruct m5783x5053ac85(LiveHonorStructV2 liveHonorStructV2, HonorStruct honorStruct) {
        if (liveHonorStructV2 == null) {
            return honorStruct;
        }
        HonorStruct honorStruct2 = new HonorStruct();
        honorStruct2.level = C1746a.m5871a(liveHonorStructV2.honor_level, honorStruct2.level);
        honorStruct2.score = C1746a.m5875a(liveHonorStructV2.honor_score, honorStruct2.score);
        return honorStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean */
    public static LogPbBean m5784x980e63d1(LogPbStructV2 logPbStructV2, LogPbBean logPbBean) {
        if (logPbStructV2 == null) {
            return logPbBean;
        }
        LogPbBean logPbBean2 = new LogPbBean();
        logPbBean2.imprId = logPbStructV2.impr_id == null ? logPbBean2.imprId : logPbStructV2.impr_id;
        return logPbBean2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo */
    public static LongVideo m5785xd9f92261(LongVideoStructV2 longVideoStructV2, LongVideo longVideo) {
        if (longVideoStructV2 == null) {
            return longVideo;
        }
        LongVideo longVideo2 = new LongVideo();
        longVideo2.video = m5845xdc245461(longVideoStructV2.video, longVideo2.video);
        longVideo2.longVideoType = C1746a.m5871a(longVideoStructV2.long_video_type, longVideo2.longVideoType);
        longVideo2.trailerStartTime = C1746a.m5870a(longVideoStructV2.trailer_start_time, longVideo2.trailerStartTime);
        longVideo2.videoControl = m5842x817ae5e8(longVideoStructV2.video_control, longVideo2.videoControl);
        return longVideo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MaskStructV2$$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo */
    public static VideoMaskInfo m5786x59acc730(MaskStructV2 maskStructV2, VideoMaskInfo videoMaskInfo) {
        if (maskStructV2 == null) {
            return videoMaskInfo;
        }
        VideoMaskInfo videoMaskInfo2 = new VideoMaskInfo();
        videoMaskInfo2.showMask = maskStructV2.show_mask == null ? videoMaskInfo2.showMask : maskStructV2.show_mask;
        videoMaskInfo2.maskType = maskStructV2.mask_type == null ? videoMaskInfo2.maskType : maskStructV2.mask_type;
        videoMaskInfo2.status = maskStructV2.status == null ? videoMaskInfo2.status : maskStructV2.status;
        videoMaskInfo2.title = maskStructV2.title == null ? videoMaskInfo2.title : maskStructV2.title;
        videoMaskInfo2.content = maskStructV2.content == null ? videoMaskInfo2.content : maskStructV2.content;
        videoMaskInfo2.cancelMaskLabel = maskStructV2.cancel_mask_label == null ? videoMaskInfo2.cancelMaskLabel : maskStructV2.cancel_mask_label;
        return videoMaskInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MatchInfoStructV2$$com$ss$android$ugc$aweme$search$caption$MatchInfo */
    public static C67360d m5787xc68009e8(MatchInfoStructV2 matchInfoStructV2, C67360d dVar) {
        if (matchInfoStructV2 == null) {
            return dVar;
        }
        C67360d dVar2 = new C67360d();
        dVar2.query = matchInfoStructV2.query == null ? dVar2.query : matchInfoStructV2.query;
        dVar2.link = matchInfoStructV2.link == null ? dVar2.link : matchInfoStructV2.link;
        dVar2.begin = C1746a.m5871a(matchInfoStructV2.begin, dVar2.begin);
        dVar2.end = C1746a.m5871a(matchInfoStructV2.end, dVar2.end);
        return dVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MatchedFriendStructV2$$com$ss$android$ugc$aweme$profile$model$MatchedFriendStruct */
    public static MatchedFriendStruct m5788x24a97781(MatchedFriendStructV2 matchedFriendStructV2, MatchedFriendStruct matchedFriendStruct) {
        if (matchedFriendStructV2 == null) {
            return matchedFriendStruct;
        }
        MatchedFriendStruct matchedFriendStruct2 = new MatchedFriendStruct();
        matchedFriendStruct2.recType = matchedFriendStructV2.rec_type == null ? matchedFriendStruct2.recType : matchedFriendStructV2.rec_type;
        matchedFriendStruct2.recommendReason = matchedFriendStructV2.recommend_reason == null ? matchedFriendStruct2.recommendReason : matchedFriendStructV2.recommend_reason;
        matchedFriendStruct2.mMutualStruct = m5799xee758087(matchedFriendStructV2.mutual_struct, matchedFriendStruct2.mMutualStruct);
        matchedFriendStruct2.relationType = matchedFriendStructV2.relation_type == null ? matchedFriendStruct2.relationType : matchedFriendStructV2.relation_type;
        matchedFriendStruct2.externalRecommendReasonStruct = m5760x608d2ba7(matchedFriendStructV2.external_recommend_reason, matchedFriendStruct2.externalRecommendReasonStruct);
        return matchedFriendStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MatchedPGCSoundStructV2$$com$ss$android$ugc$aweme$music$model$MatchedPGCSoundInfo */
    public static MatchedPGCSoundInfo m5789x85fea8e0(MatchedPGCSoundStructV2 matchedPGCSoundStructV2, MatchedPGCSoundInfo matchedPGCSoundInfo) {
        if (matchedPGCSoundStructV2 == null) {
            return matchedPGCSoundInfo;
        }
        MatchedPGCSoundInfo matchedPGCSoundInfo2 = new MatchedPGCSoundInfo();
        matchedPGCSoundInfo2.f138248id = C1746a.m5876a(matchedPGCSoundStructV2.f195412id, matchedPGCSoundInfo2.f138248id);
        matchedPGCSoundInfo2.author = matchedPGCSoundStructV2.author == null ? matchedPGCSoundInfo2.author : matchedPGCSoundStructV2.author;
        matchedPGCSoundInfo2.title = matchedPGCSoundStructV2.title == null ? matchedPGCSoundInfo2.title : matchedPGCSoundStructV2.title;
        matchedPGCSoundInfo2.mixedTitle = matchedPGCSoundStructV2.mixed_title == null ? matchedPGCSoundInfo2.mixedTitle : matchedPGCSoundStructV2.mixed_title;
        matchedPGCSoundInfo2.mixedAuthor = matchedPGCSoundStructV2.mixed_author == null ? matchedPGCSoundInfo2.mixedAuthor : matchedPGCSoundStructV2.mixed_author;
        return matchedPGCSoundInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MatchedSongStructV2$$com$ss$android$ugc$aweme$music$model$MatchedPGCSoundInfo */
    public static MatchedPGCSoundInfo m5790xd37671d2(MatchedSongStructV2 matchedSongStructV2, MatchedPGCSoundInfo matchedPGCSoundInfo) {
        if (matchedSongStructV2 == null) {
            return matchedPGCSoundInfo;
        }
        MatchedPGCSoundInfo matchedPGCSoundInfo2 = new MatchedPGCSoundInfo();
        matchedPGCSoundInfo2.f138248id = matchedSongStructV2.f195414id == null ? matchedPGCSoundInfo2.f138248id : matchedSongStructV2.f195414id;
        matchedPGCSoundInfo2.author = matchedSongStructV2.author == null ? matchedPGCSoundInfo2.author : matchedSongStructV2.author;
        matchedPGCSoundInfo2.title = matchedSongStructV2.title == null ? matchedPGCSoundInfo2.title : matchedSongStructV2.title;
        return matchedPGCSoundInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MentionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$MentionStruct */
    public static MentionStruct m5791x94b82161(MentionStickerStructV2 mentionStickerStructV2, MentionStruct mentionStruct) {
        if (mentionStickerStructV2 == null) {
            return mentionStruct;
        }
        MentionStruct mentionStruct2 = new MentionStruct();
        mentionStruct2.secUid = mentionStickerStructV2.sec_uid == null ? mentionStruct2.secUid : mentionStickerStructV2.sec_uid;
        mentionStruct2.username = mentionStickerStructV2.user_name == null ? mentionStruct2.username : mentionStickerStructV2.user_name;
        mentionStruct2.userId = mentionStickerStructV2.user_id == null ? mentionStruct2.userId : mentionStickerStructV2.user_id;
        mentionStruct2.nickname = mentionStickerStructV2.nickname == null ? mentionStruct2.nickname : mentionStickerStructV2.nickname;
        mentionStruct2.avatarUrl = m5835xd6e21675(mentionStickerStructV2.user_avatar_url, mentionStruct2.avatarUrl);
        return mentionStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MicroAppCardStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MiniAppCard */
    public static C59317c m5792xb6412805(MicroAppCardStructV2 microAppCardStructV2, C59317c cVar) {
        if (microAppCardStructV2 == null) {
            return cVar;
        }
        C59317c cVar2 = new C59317c();
        cVar2.imageUrl = microAppCardStructV2.image_url == null ? cVar2.imageUrl : microAppCardStructV2.image_url;
        cVar2.text = microAppCardStructV2.text == null ? cVar2.text : microAppCardStructV2.text;
        cVar2.waitTime = C1746a.m5871a(microAppCardStructV2.wait_time, cVar2.waitTime);
        return cVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MicroAppStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MicroAppInfo */
    public static C59314b m5793x5742a110(MicroAppStructV2 microAppStructV2, C59314b bVar) {
        if (microAppStructV2 == null) {
            return bVar;
        }
        C59314b bVar2 = new C59314b();
        bVar2.appId = microAppStructV2.app_id == null ? bVar2.appId : microAppStructV2.app_id;
        bVar2.name = microAppStructV2.app_name == null ? bVar2.name : microAppStructV2.app_name;
        bVar2.icon = microAppStructV2.icon == null ? bVar2.icon : microAppStructV2.icon;
        bVar2.orientation = C1746a.m5871a(microAppStructV2.orientation, bVar2.orientation);
        bVar2.schema = microAppStructV2.schema == null ? bVar2.schema : microAppStructV2.schema;
        bVar2.state = C1746a.m5871a(microAppStructV2.state, bVar2.state);
        bVar2.summary = microAppStructV2.summary == null ? bVar2.summary : microAppStructV2.summary;
        bVar2.type = C1746a.m5871a(microAppStructV2.type, bVar2.type);
        bVar2.desc = microAppStructV2.description == null ? bVar2.desc : microAppStructV2.description;
        bVar2.title = microAppStructV2.title == null ? bVar2.title : microAppStructV2.title;
        bVar2.miniAppCard = m5792xb6412805(microAppStructV2.card, bVar2.miniAppCard);
        bVar2.webUrl = microAppStructV2.web_url == null ? bVar2.webUrl : microAppStructV2.web_url;
        return bVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MixStatisStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatisStruct */
    public static MixStatisStruct m5794xc75e0336(MixStatisStructV2 mixStatisStructV2, MixStatisStruct mixStatisStruct) {
        if (mixStatisStructV2 == null) {
            return mixStatisStruct;
        }
        MixStatisStruct mixStatisStruct2 = new MixStatisStruct();
        mixStatisStruct2.playVV = C1746a.m5875a(mixStatisStructV2.play_vv, mixStatisStruct2.playVV);
        mixStatisStruct2.collectVV = C1746a.m5875a(mixStatisStructV2.collect_vv, mixStatisStruct2.collectVV);
        mixStatisStruct2.currentEpisode = C1746a.m5875a(mixStatisStructV2.current_episode, mixStatisStruct2.currentEpisode);
        mixStatisStruct2.updatedToEpisode = C1746a.m5875a(mixStatisStructV2.updated_to_episode, mixStatisStruct2.updatedToEpisode);
        mixStatisStruct2.hasUpdatedEpisode = C1746a.m5875a(mixStatisStructV2.has_updated_episode, mixStatisStruct2.hasUpdatedEpisode);
        return mixStatisStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MixStatusStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatusStruct */
    public static MixStatusStruct m5795x10a650b6(MixStatusStructV2 mixStatusStructV2, MixStatusStruct mixStatusStruct) {
        if (mixStatusStructV2 == null) {
            return mixStatusStruct;
        }
        MixStatusStruct mixStatusStruct2 = new MixStatusStruct();
        mixStatusStruct2.status = C1746a.m5871a(mixStatusStructV2.status, mixStatusStruct2.status);
        mixStatusStruct2.isCollected = C1746a.m5871a(mixStatusStructV2.is_collected, mixStatusStruct2.isCollected);
        return mixStatusStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MixStructV2$$com$ss$android$ugc$aweme$feed$model$MixStruct */
    public static MixStruct m5796x5b231276(MixStructV2 mixStructV2, MixStruct mixStruct) {
        if (mixStructV2 == null) {
            return mixStruct;
        }
        MixStruct mixStruct2 = new MixStruct();
        mixStruct2.mixId = mixStructV2.mix_id == null ? mixStruct2.mixId : mixStructV2.mix_id;
        mixStruct2.mixName = mixStructV2.mix_name == null ? mixStruct2.mixName : mixStructV2.mix_name;
        mixStruct2.cover = m5835xd6e21675(mixStructV2.cover_url, mixStruct2.cover);
        mixStruct2.icon = m5835xd6e21675(mixStructV2.icon_url, mixStruct2.icon);
        mixStruct2.status = m5795x10a650b6(mixStructV2.status, mixStruct2.status);
        mixStruct2.statis = m5794xc75e0336(mixStructV2.statis, mixStruct2.statis);
        mixStruct2.desc = mixStructV2.desc == null ? mixStruct2.desc : mixStructV2.desc;
        mixStruct2.author = m5840x2fb9c61e(mixStructV2.author, mixStruct2.author);
        mixStruct2.extra = mixStructV2.extra == null ? mixStruct2.extra : mixStructV2.extra;
        mixStruct2.shareInfo = m5822xe4348698(mixStructV2.share_info, mixStruct2.shareInfo);
        return mixStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MusicArtistStructV2$$com$ss$android$ugc$aweme$music$model$MusicOwnerInfo */
    public static MusicOwnerInfo m5797xadae28c(MusicArtistStructV2 musicArtistStructV2, MusicOwnerInfo musicOwnerInfo) {
        if (musicArtistStructV2 == null) {
            return musicOwnerInfo;
        }
        MusicOwnerInfo musicOwnerInfo2 = new MusicOwnerInfo();
        musicOwnerInfo2.uid = musicArtistStructV2.uid == null ? musicOwnerInfo2.uid : musicArtistStructV2.uid;
        musicOwnerInfo2.secUid = musicArtistStructV2.sec_uid == null ? musicOwnerInfo2.secUid : musicArtistStructV2.sec_uid;
        musicOwnerInfo2.nickName = musicArtistStructV2.nick_name == null ? musicOwnerInfo2.nickName : musicArtistStructV2.nick_name;
        musicOwnerInfo2.handle = musicArtistStructV2.handle == null ? musicOwnerInfo2.handle : musicArtistStructV2.handle;
        musicOwnerInfo2.avatar = m5835xd6e21675(musicArtistStructV2.avatar, musicOwnerInfo2.avatar);
        musicOwnerInfo2.verified = C1746a.m5877a(musicArtistStructV2.is_verified, musicOwnerInfo2.verified);
        musicOwnerInfo2.enterType = C1746a.m5871a(musicArtistStructV2.enter_type, musicOwnerInfo2.enterType);
        return musicOwnerInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music */
    public static Music m5798x2fe8170e(MusicStructV2 musicStructV2, Music music) {
        if (musicStructV2 == null) {
            return music;
        }
        Music music2 = new Music();
        music2.f138249id = C1746a.m5875a(musicStructV2.f195420id, music2.f138249id);
        music2.idStr = musicStructV2.id_str == null ? music2.idStr : musicStructV2.id_str;
        music2.musicName = musicStructV2.title == null ? music2.musicName : musicStructV2.title;
        music2.authorName = musicStructV2.author == null ? music2.authorName : musicStructV2.author;
        music2.album = musicStructV2.album == null ? music2.album : musicStructV2.album;
        music2.coverLarge = m5835xd6e21675(musicStructV2.cover_large, music2.coverLarge);
        music2.coverMedium = m5835xd6e21675(musicStructV2.cover_medium, music2.coverMedium);
        music2.coverThumb = m5835xd6e21675(musicStructV2.cover_thumb, music2.coverThumb);
        music2.playUrl = m5835xd6e21675(musicStructV2.play_url, music2.playUrl);
        music2.duration = C1746a.m5871a(musicStructV2.duration, music2.duration);
        music2.extra = musicStructV2.extra == null ? music2.extra : musicStructV2.extra;
        music2.userCount = C1746a.m5871a(musicStructV2.user_count, music2.userCount);
        music2.positions = m5694xed17e9e(musicStructV2.position, music2.positions);
        music2.shareInfo = m5822xe4348698(musicStructV2.share_info, music2.shareInfo);
        music2.collectStatus = C1746a.m5871a(musicStructV2.collect_stat, music2.collectStatus);
        music2.musicStatus = C1746a.m5871a(musicStructV2.status, music2.musicStatus);
        music2.offlineDesc = musicStructV2.offline_desc == null ? music2.offlineDesc : musicStructV2.offline_desc;
        music2.effectsData = m5835xd6e21675(musicStructV2.effects_data, music2.effectsData);
        music2.ownerId = musicStructV2.owner_id == null ? music2.ownerId : musicStructV2.owner_id;
        music2.ownerNickName = musicStructV2.owner_nickname == null ? music2.ownerNickName : musicStructV2.owner_nickname;
        music2.isOriginMusic = C1746a.m5877a(musicStructV2.is_original, music2.isOriginMusic);
        music2.challenge = m5747x5652a2ac(musicStructV2.challenge, music2.challenge);
        music2.billboardRank = C1746a.m5871a(musicStructV2.billboard_rank, music2.billboardRank);
        music2.bindChallengeId = C1746a.m5876a(musicStructV2.binded_challenge_id, music2.bindChallengeId);
        music2.isAuthorDeleted = C1746a.m5877a(musicStructV2.author_deleted, music2.isAuthorDeleted);
        music2.ownerHandle = musicStructV2.owner_handle == null ? music2.ownerHandle : musicStructV2.owner_handle;
        music2.preventDownload = C1746a.m5877a(musicStructV2.prevent_download, music2.preventDownload);
        music2.strongBeatUrl = m5835xd6e21675(musicStructV2.strong_beat_url, music2.strongBeatUrl);
        music2.mExternalMusicInfos = m5679x6301e2f6(musicStructV2.external_song_info, music2.mExternalMusicInfos);
        music2.secUid = musicStructV2.sec_uid == null ? music2.secUid : musicStructV2.sec_uid;
        music2.lrcType = C1746a.m5871a(musicStructV2.lyric_type, music2.lrcType);
        music2.lrcUrl = musicStructV2.lyric_url == null ? music2.lrcUrl : musicStructV2.lyric_url;
        music2.avatarThumb = m5835xd6e21675(musicStructV2.avatar_thumb, music2.avatarThumb);
        music2.previewStartTime = C1746a.m5868a(musicStructV2.preview_start_time, music2.previewStartTime);
        music2.muteShare = C1746a.m5877a(musicStructV2.mute_share, music2.muteShare);
        music2.isArtistMusic = C1746a.m5877a(musicStructV2.is_author_artist, music2.isArtistMusic);
        music2.isPgc = C1746a.m5877a(musicStructV2.is_pgc, music2.isPgc);
        music2.matchedPGCSoundInfo = m5789x85fea8e0(musicStructV2.matched_pgc_sound, music2.matchedPGCSoundInfo);
        music2.mMatchedSongInfo = m5790xd37671d2(musicStructV2.matched_song, music2.mMatchedSongInfo);
        music2.isCommercialMusic = C1746a.m5877a(musicStructV2.is_commerce_music, music2.isCommercialMusic);
        music2.mMusicOwnerInfos = m5689xcf468d6c(musicStructV2.artists, music2.mMusicOwnerInfos);
        return music2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MutualStructV2$$com$ss$android$ugc$aweme$friends$model$MutualStruct */
    public static MutualStruct m5799xee758087(MutualStructV2 mutualStructV2, MutualStruct mutualStruct) {
        if (mutualStructV2 == null) {
            return mutualStruct;
        }
        MutualStruct mutualStruct2 = new MutualStruct();
        mutualStruct2.mutualType = C1746a.m5871a(mutualStructV2.mutual_type, mutualStruct2.mutualType);
        mutualStruct2.userList = m5691x2cd07480(mutualStructV2.user_list, mutualStruct2.userList);
        mutualStruct2.total = C1746a.m5871a(mutualStructV2.total, mutualStruct2.total);
        return mutualStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$MutualUserStructV2$$com$ss$android$ugc$aweme$friends$model$MutualUser */
    public static MutualUser m5800xec5b8eb2(MutualUserStructV2 mutualUserStructV2, MutualUser mutualUser) {
        if (mutualUserStructV2 == null) {
            return mutualUser;
        }
        MutualUser mutualUser2 = new MutualUser();
        mutualUser2.secUid = mutualUserStructV2.sec_uid == null ? mutualUser2.secUid : mutualUserStructV2.sec_uid;
        mutualUser2.nickname = mutualUserStructV2.nickname == null ? mutualUser2.nickname : mutualUserStructV2.nickname;
        mutualUser2.avatarMedium = m5835xd6e21675(mutualUserStructV2.avatar_medium, mutualUser2.avatarMedium);
        return mutualUser2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$NewFaceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$NewFaceStickerBean */
    public static C75445g m5801xe7895fba(NewFaceStickerStructV2 newFaceStickerStructV2, C75445g gVar) {
        if (newFaceStickerStructV2 == null) {
            return gVar;
        }
        C75445g gVar2 = new C75445g();
        gVar2.f169545id = newFaceStickerStructV2.f195422id == null ? gVar2.f169545id : newFaceStickerStructV2.f195422id;
        gVar2.name = newFaceStickerStructV2.name == null ? gVar2.name : newFaceStickerStructV2.name;
        gVar2.children = newFaceStickerStructV2.children == null ? gVar2.children : newFaceStickerStructV2.children;
        gVar2.iconUrl = m5835xd6e21675(newFaceStickerStructV2.icon_url, gVar2.iconUrl);
        gVar2.ownerId = newFaceStickerStructV2.owner_id == null ? gVar2.ownerId : newFaceStickerStructV2.owner_id;
        gVar2.ownerName = newFaceStickerStructV2.owner_nickname == null ? gVar2.ownerName : newFaceStickerStructV2.owner_nickname;
        gVar2.userCount = C1746a.m5873a(newFaceStickerStructV2.user_count, gVar2.userCount);
        gVar2.desc = newFaceStickerStructV2.desc == null ? gVar2.desc : newFaceStickerStructV2.desc;
        gVar2.effectId = newFaceStickerStructV2.effect_id == null ? gVar2.effectId : newFaceStickerStructV2.effect_id;
        gVar2.shareInfo = m5822xe4348698(newFaceStickerStructV2.share_info, gVar2.shareInfo);
        gVar2.isFavorite = C1746a.m5877a(newFaceStickerStructV2.is_favorite, gVar2.isFavorite);
        gVar2.commerceSticker = m5753xb40da7e0(newFaceStickerStructV2.commerce_sticker, gVar2.commerceSticker);
        gVar2.mTags = newFaceStickerStructV2.tags == null ? gVar2.mTags : newFaceStickerStructV2.tags;
        gVar2.avatarThumb = m5835xd6e21675(newFaceStickerStructV2.avatar_thumb, gVar2.avatarThumb);
        gVar2.viewCount = C1746a.m5875a(newFaceStickerStructV2.vv_count, gVar2.viewCount);
        gVar2.extra = newFaceStickerStructV2.extra == null ? gVar2.extra : newFaceStickerStructV2.extra;
        gVar2.mSecUid = newFaceStickerStructV2.sec_uid == null ? gVar2.mSecUid : newFaceStickerStructV2.sec_uid;
        return gVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo */
    public static C37499j m5802xb1fda959(OfflineInfoStructV2 offlineInfoStructV2, C37499j jVar) {
        if (offlineInfoStructV2 == null) {
            return jVar;
        }
        C37499j jVar2 = new C37499j();
        jVar2.offlineInfoType = C1746a.m5871a(offlineInfoStructV2.offline_info_type, jVar2.offlineInfoType);
        jVar2.text = offlineInfoStructV2.text == null ? jVar2.text : offlineInfoStructV2.text;
        jVar2.action = offlineInfoStructV2.action == null ? jVar2.action : offlineInfoStructV2.action;
        return jVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$OriginalLanguageStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionLanguage */
    public static CaptionLanguage m5803x2d98efbc(OriginalLanguageStructV2 originalLanguageStructV2, CaptionLanguage captionLanguage) {
        if (originalLanguageStructV2 == null) {
            return captionLanguage;
        }
        CaptionLanguage captionLanguage2 = new CaptionLanguage();
        captionLanguage2.languageName = originalLanguageStructV2.lang == null ? captionLanguage2.languageName : originalLanguageStructV2.lang;
        captionLanguage2.languageId = C1746a.m5875a(originalLanguageStructV2.language_id, captionLanguage2.languageId);
        return captionLanguage2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$OriginalMusicianStructV2$$com$ss$android$ugc$aweme$music$OriginalMusician */
    public static C60836o m5804x309ee127(OriginalMusicianStructV2 originalMusicianStructV2, C60836o oVar) {
        if (originalMusicianStructV2 == null) {
            return oVar;
        }
        C60836o oVar2 = new C60836o();
        oVar2.musicCount = C1746a.m5871a(originalMusicianStructV2.music_count, oVar2.musicCount);
        oVar2.musicUseCount = C1746a.m5871a(originalMusicianStructV2.music_used_count, oVar2.musicUseCount);
        oVar2.musicQrcodeUrl = m5835xd6e21675(originalMusicianStructV2.music_qrcode_url, oVar2.musicQrcodeUrl);
        oVar2.musicCoverUrl = m5835xd6e21675(originalMusicianStructV2.music_cover_url, oVar2.musicCoverUrl);
        oVar2.diggCount = C1746a.m5871a(originalMusicianStructV2.digg_count, oVar2.diggCount);
        return oVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PermissionStructV2$$com$ss$android$ugc$aweme$profile$model$GeneralPermission */
    public static GeneralPermission m5805xef5550a8(PermissionStructV2 permissionStructV2, GeneralPermission generalPermission) {
        if (permissionStructV2 == null) {
            return generalPermission;
        }
        GeneralPermission generalPermission2 = new GeneralPermission();
        generalPermission2.mFollowToast = C1746a.m5871a(permissionStructV2.follow_toast, generalPermission2.mFollowToast);
        generalPermission2.mOriginalList = C1746a.m5871a(permissionStructV2.original_list, generalPermission2.mOriginalList);
        generalPermission2.mShopToast = C1746a.m5871a(permissionStructV2.shop_toast, generalPermission2.mShopToast);
        generalPermission2.mShareToast = C1746a.m5871a(permissionStructV2.share_toast, generalPermission2.mShareToast);
        return generalPermission2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$com$ss$android$ugc$aweme$profile$model$PlatformInfo */
    public static PlatformInfo m5806xb8c54a7f(PlatformSyncStatusStructV2 platformSyncStatusStructV2, PlatformInfo platformInfo) {
        if (platformSyncStatusStructV2 == null) {
            return platformInfo;
        }
        PlatformInfo platformInfo2 = new PlatformInfo();
        platformInfo2.patformName = platformSyncStatusStructV2.platform_name == null ? platformInfo2.patformName : platformSyncStatusStructV2.platform_name;
        platformInfo2.nickName = platformSyncStatusStructV2.nickname == null ? platformInfo2.nickName : platformSyncStatusStructV2.nickname;
        platformInfo2.fullSynced = C1746a.m5877a(platformSyncStatusStructV2.full_synced, platformInfo2.fullSynced);
        return platformInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth */
    public static PlayTokenAuth m5807x92d6feb8(PlayTokenAuthStructV2 playTokenAuthStructV2, PlayTokenAuth playTokenAuth) {
        if (playTokenAuthStructV2 == null) {
            return playTokenAuth;
        }
        PlayTokenAuth playTokenAuth2 = new PlayTokenAuth();
        playTokenAuth2.vid = playTokenAuthStructV2.vid == null ? playTokenAuth2.vid : playTokenAuthStructV2.vid;
        playTokenAuth2.token = playTokenAuthStructV2.token == null ? playTokenAuth2.token : playTokenAuthStructV2.token;
        playTokenAuth2.auth = playTokenAuthStructV2.auth == null ? playTokenAuth2.auth : playTokenAuthStructV2.auth;
        playTokenAuth2.hosts = playTokenAuthStructV2.hosts == null ? playTokenAuth2.hosts : playTokenAuthStructV2.hosts;
        return playTokenAuth2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PlaylistInfoV2$$com$ss$android$ugc$aweme$feed$model$PlayListInfo */
    public static PlayListInfo m5808x92361984(PlaylistInfoV2 playlistInfoV2, PlayListInfo playListInfo) {
        if (playlistInfoV2 == null) {
            return playListInfo;
        }
        PlayListInfo playListInfo2 = new PlayListInfo();
        playListInfo2.mixId = playlistInfoV2.mix_id == null ? playListInfo2.mixId : playlistInfoV2.mix_id;
        playListInfo2.mixName = playlistInfoV2.name == null ? playListInfo2.mixName : playlistInfoV2.name;
        playListInfo2.index = playlistInfoV2.index == null ? playListInfo2.index : playlistInfoV2.index;
        playListInfo2.icon = m5835xd6e21675(playlistInfoV2.icon, playListInfo2.icon);
        playListInfo2.itemTotal = playlistInfoV2.item_total == null ? playListInfo2.itemTotal : playlistInfoV2.item_total;
        return playListInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position */
    public static Position m5809x5cec7640(PositionStructV2 positionStructV2, Position position) {
        if (positionStructV2 == null) {
            return position;
        }
        Position position2 = new Position();
        position2.begin = C1746a.m5871a(positionStructV2.begin, position2.begin);
        position2.end = C1746a.m5871a(positionStructV2.end, position2.end);
        return position2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$PreloadStructV2$$com$ss$android$ugc$aweme$feed$model$Preload */
    public static Preload m5810xdd7fa861(PreloadStructV2 preloadStructV2, Preload preload) {
        if (preloadStructV2 == null) {
            return preload;
        }
        Preload preload2 = new Preload();
        preload2.commentPreload = C1746a.m5871a(preloadStructV2.comment, preload2.commentPreload);
        preload2.profilePreload = C1746a.m5871a(preloadStructV2.profile, preload2.profilePreload);
        preload2.commentPro = C1746a.m5867a(preloadStructV2.comment_pro, preload2.commentPro);
        preload2.profilePro = C1746a.m5867a(preloadStructV2.profile_pro, preload2.profilePro);
        preload2.commentThres = C1746a.m5867a(preloadStructV2.comment_thres, preload2.commentThres);
        preload2.profileThres = C1746a.m5867a(preloadStructV2.profile_thres, preload2.profileThres);
        preload2.commentMedianTime = C1746a.m5872a(preloadStructV2.comment_median_time, preload2.commentMedianTime);
        preload2.profileMedianTime = C1746a.m5872a(preloadStructV2.profile_median_time, preload2.profileMedianTime);
        preload2.modelV2 = C1746a.m5871a(preloadStructV2.model_v2, preload2.modelV2);
        preload2.predictConfig = preloadStructV2.predict_config == null ? preload2.predictConfig : preloadStructV2.predict_config;
        return preload2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ProfileBadgeStructV2$$com$ss$android$ugc$aweme$profile$model$ProfileBadgeStruct */
    public static ProfileBadgeStruct m5811xb000eff3(ProfileBadgeStructV2 profileBadgeStructV2, ProfileBadgeStruct profileBadgeStruct) {
        if (profileBadgeStructV2 == null) {
            return profileBadgeStruct;
        }
        ProfileBadgeStruct profileBadgeStruct2 = new ProfileBadgeStruct();
        profileBadgeStruct2.f144672id = C1746a.m5875a(profileBadgeStructV2.f195424id, profileBadgeStruct2.f144672id);
        profileBadgeStruct2.name = profileBadgeStructV2.name == null ? profileBadgeStruct2.name : profileBadgeStructV2.name;
        profileBadgeStruct2.description = profileBadgeStructV2.description == null ? profileBadgeStruct2.description : profileBadgeStructV2.description;
        profileBadgeStruct2.url = profileBadgeStructV2.url == null ? profileBadgeStruct2.url : profileBadgeStructV2.url;
        profileBadgeStruct2.shouldShow = C1746a.m5877a(profileBadgeStructV2.should_show, profileBadgeStruct2.shouldShow);
        return profileBadgeStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$QuestionInfoV2$$com$ss$android$ugc$aweme$question$QuestionInfo */
    public static QuestionInfo m5812x842f2ee9(QuestionInfoV2 questionInfoV2, QuestionInfo questionInfo) {
        if (questionInfoV2 == null) {
            return questionInfo;
        }
        QuestionInfo questionInfo2 = new QuestionInfo();
        questionInfo2.f149476a = questionInfoV2.f195426id == null ? questionInfo2.f149476a : questionInfoV2.f195426id;
        questionInfo2.f149477b = questionInfoV2.item_id == null ? questionInfo2.f149477b : questionInfoV2.item_id;
        questionInfo2.f149478c = questionInfoV2.user_id == null ? questionInfo2.f149478c : questionInfoV2.user_id;
        questionInfo2.f149479d = questionInfoV2.username == null ? questionInfo2.f149479d : questionInfoV2.username;
        questionInfo2.f149480e = questionInfoV2.content == null ? questionInfo2.f149480e : questionInfoV2.content;
        questionInfo2.f149481f = m5835xd6e21675(questionInfoV2.user_avatar, questionInfo2.f149481f);
        return questionInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$QuestionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$QaStruct */
    public static QaStruct m5813x4fe8860d(QuestionStickerStructV2 questionStickerStructV2, QaStruct qaStruct) {
        if (questionStickerStructV2 == null) {
            return qaStruct;
        }
        QaStruct qaStruct2 = new QaStruct();
        qaStruct2.questionId = C1746a.m5875a(questionStickerStructV2.question_id, qaStruct2.questionId);
        qaStruct2.userId = C1746a.m5875a(questionStickerStructV2.user_id, qaStruct2.userId);
        qaStruct2.itemId = C1746a.m5875a(questionStickerStructV2.item_id, qaStruct2.itemId);
        qaStruct2.questionContent = questionStickerStructV2.content == null ? qaStruct2.questionContent : questionStickerStructV2.content;
        qaStruct2.userName = questionStickerStructV2.username == null ? qaStruct2.userName : questionStickerStructV2.username;
        qaStruct2.avatarUrl = m5835xd6e21675(questionStickerStructV2.user_avatar, qaStruct2.avatarUrl);
        qaStruct2.secId = questionStickerStructV2.sec_uid == null ? qaStruct2.secId : questionStickerStructV2.sec_uid;
        return qaStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$QuickShopSecondFloorV2$$com$ss$android$ugc$aweme$profile$model$QuickShopSecondFloorInfo */
    public static QuickShopSecondFloorInfo m5814xa9801cc1(QuickShopSecondFloorV2 quickShopSecondFloorV2, QuickShopSecondFloorInfo quickShopSecondFloorInfo) {
        if (quickShopSecondFloorV2 == null) {
            return quickShopSecondFloorInfo;
        }
        QuickShopSecondFloorInfo quickShopSecondFloorInfo2 = new QuickShopSecondFloorInfo();
        quickShopSecondFloorInfo2.processText = quickShopSecondFloorV2.process_text == null ? quickShopSecondFloorInfo2.processText : quickShopSecondFloorV2.process_text;
        quickShopSecondFloorInfo2.enterText = quickShopSecondFloorV2.enter_text == null ? quickShopSecondFloorInfo2.enterText : quickShopSecondFloorV2.enter_text;
        quickShopSecondFloorInfo2.transBgText = quickShopSecondFloorV2.trans_bg_text == null ? quickShopSecondFloorInfo2.transBgText : quickShopSecondFloorV2.trans_bg_text;
        return quickShopSecondFloorInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$QuickShopStructV2$$com$ss$android$ugc$aweme$profile$model$QuickShopInfo */
    public static QuickShopInfo m5815x85e038dc(QuickShopStructV2 quickShopStructV2, QuickShopInfo quickShopInfo) {
        if (quickShopStructV2 == null) {
            return quickShopInfo;
        }
        QuickShopInfo quickShopInfo2 = new QuickShopInfo();
        quickShopInfo2.quickShopUrl = quickShopStructV2.quick_shop_url == null ? quickShopInfo2.quickShopUrl : quickShopStructV2.quick_shop_url;
        quickShopInfo2.quickShopName = quickShopStructV2.quick_shop_name == null ? quickShopInfo2.quickShopName : quickShopStructV2.quick_shop_name;
        quickShopInfo2.withTextEntry = C1746a.m5877a(quickShopStructV2.with_text_entry, quickShopInfo2.withTextEntry);
        quickShopInfo2.secondFloorInfo = m5814xa9801cc1(quickShopStructV2.second_floor_info, quickShopInfo2.secondFloorInfo);
        return quickShopInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RFansGroupInfoV2$$com$ss$android$ugc$aweme$base$share$RocketFansGroupInfo */
    public static RocketFansGroupInfo m5816x59f04dc3(RFansGroupInfoV2 rFansGroupInfoV2, RocketFansGroupInfo rocketFansGroupInfo) {
        if (rFansGroupInfoV2 == null) {
            return rocketFansGroupInfo;
        }
        RocketFansGroupInfo rocketFansGroupInfo2 = new RocketFansGroupInfo();
        rocketFansGroupInfo2.schema = rFansGroupInfoV2.schema == null ? rocketFansGroupInfo2.schema : rFansGroupInfoV2.schema;
        rocketFansGroupInfo2.token = rFansGroupInfoV2.token == null ? rocketFansGroupInfo2.token : rFansGroupInfoV2.token;
        rocketFansGroupInfo2.downloadUrl = rFansGroupInfoV2.download_url == null ? rocketFansGroupInfo2.downloadUrl : rFansGroupInfoV2.download_url;
        return rocketFansGroupInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem */
    public static RecommendAwemeItem m5817x55fe9987(RecommendItemStructV2 recommendItemStructV2, RecommendAwemeItem recommendAwemeItem) {
        if (recommendItemStructV2 == null) {
            return recommendAwemeItem;
        }
        RecommendAwemeItem recommendAwemeItem2 = new RecommendAwemeItem();
        recommendAwemeItem2.aid = recommendItemStructV2.aweme_id == null ? recommendAwemeItem2.aid : recommendItemStructV2.aweme_id;
        recommendAwemeItem2.cover = m5835xd6e21675(recommendItemStructV2.cover, recommendAwemeItem2.cover);
        recommendAwemeItem2.dynamicCover = m5835xd6e21675(recommendItemStructV2.dynamic_cover, recommendAwemeItem2.dynamicCover);
        recommendAwemeItem2.mediaType = C1746a.m5876a(recommendItemStructV2.media_type, recommendAwemeItem2.mediaType);
        return recommendAwemeItem2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RelationLabelStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelNew */
    public static RelationLabelNew m5818x36fc5a9f(RelationLabelStructV2 relationLabelStructV2, RelationLabelNew relationLabelNew) {
        if (relationLabelStructV2 == null) {
            return relationLabelNew;
        }
        RelationLabelNew relationLabelNew2 = new RelationLabelNew();
        relationLabelNew2.userList = m5697x6e5454b1(relationLabelStructV2.user_list, relationLabelNew2.userList);
        relationLabelNew2.type = relationLabelStructV2.type == null ? relationLabelNew2.type : relationLabelStructV2.type;
        relationLabelNew2.extra = C48333g.m91796a(relationLabelStructV2.extra, relationLabelNew2.extra);
        return relationLabelNew2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RelationRecommendStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRelationRecommendModel */
    public static AwemeRelationRecommendModel m5819xbcd34a71(RelationRecommendStructV2 relationRecommendStructV2, AwemeRelationRecommendModel awemeRelationRecommendModel) {
        if (relationRecommendStructV2 == null) {
            return awemeRelationRecommendModel;
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel2 = new AwemeRelationRecommendModel();
        awemeRelationRecommendModel2.recommendType = C1746a.m5875a(relationRecommendStructV2.recommend_type, awemeRelationRecommendModel2.recommendType);
        awemeRelationRecommendModel2.relationTextKey = relationRecommendStructV2.relation_text_key == null ? awemeRelationRecommendModel2.relationTextKey : relationRecommendStructV2.relation_text_key;
        awemeRelationRecommendModel2.recType = relationRecommendStructV2.rec_type == null ? awemeRelationRecommendModel2.recType : relationRecommendStructV2.rec_type;
        awemeRelationRecommendModel2.friendTypeStr = relationRecommendStructV2.friend_type_str == null ? awemeRelationRecommendModel2.friendTypeStr : relationRecommendStructV2.friend_type_str;
        return awemeRelationRecommendModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelUser */
    public static RelationLabelUser m5820x91dc7273(RelativeUserStructV2 relativeUserStructV2, RelationLabelUser relationLabelUser) {
        if (relativeUserStructV2 == null) {
            return relationLabelUser;
        }
        RelationLabelUser relationLabelUser2 = new RelationLabelUser();
        relationLabelUser2.uid = C1746a.m5875a(relativeUserStructV2.uid, relationLabelUser2.uid);
        relationLabelUser2.avatarLarger = m5835xd6e21675(relativeUserStructV2.avatar, relationLabelUser2.avatarLarger);
        relationLabelUser2.nickName = relativeUserStructV2.nickname == null ? relationLabelUser2.nickName : relativeUserStructV2.nickname;
        relationLabelUser2.remarkName = relativeUserStructV2.remark_name == null ? relationLabelUser2.remarkName : relativeUserStructV2.remark_name;
        relationLabelUser2.avatarThumb = m5835xd6e21675(relativeUserStructV2.avatar_thumb, relationLabelUser2.avatarThumb);
        relationLabelUser2.followStatus = C1746a.m5871a(relativeUserStructV2.follow_status, relationLabelUser2.followStatus);
        relationLabelUser2.secUid = relativeUserStructV2.sec_uid == null ? relationLabelUser2.secUid : relativeUserStructV2.sec_uid;
        return relationLabelUser2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo */
    public static RelativeUserInfo m5821x55b3e16c(RelativeUserStructV2 relativeUserStructV2, RelativeUserInfo relativeUserInfo) {
        if (relativeUserStructV2 == null) {
            return relativeUserInfo;
        }
        RelativeUserInfo relativeUserInfo2 = new RelativeUserInfo();
        relativeUserInfo2.uid = C1746a.m5876a(relativeUserStructV2.uid, relativeUserInfo2.uid);
        relativeUserInfo2.avatar = m5835xd6e21675(relativeUserStructV2.avatar, relativeUserInfo2.avatar);
        return relativeUserInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo */
    public static ShareInfo m5822xe4348698(ShareStructV2 shareStructV2, ShareInfo shareInfo) {
        if (shareStructV2 == null) {
            return shareInfo;
        }
        ShareInfo shareInfo2 = new ShareInfo();
        shareInfo2.shareUrl = shareStructV2.share_url == null ? shareInfo2.shareUrl : shareStructV2.share_url;
        shareInfo2.shareDesc = shareStructV2.share_desc == null ? shareInfo2.shareDesc : shareStructV2.share_desc;
        shareInfo2.shareTitle = shareStructV2.share_title == null ? shareInfo2.shareTitle : shareStructV2.share_title;
        shareInfo2.qrCodeUrls = m5835xd6e21675(shareStructV2.share_qrcode_url, shareInfo2.qrCodeUrls);
        shareInfo2.goodsManagerUrl = shareStructV2.manage_goods_url == null ? shareInfo2.goodsManagerUrl : shareStructV2.manage_goods_url;
        shareInfo2.imageUrls = m5835xd6e21675(shareStructV2.share_image_url, shareInfo2.imageUrls);
        shareInfo2.boolPersist = C1746a.m5871a(shareStructV2.bool_persist, shareInfo2.boolPersist);
        shareInfo2.goodsRecUrl = shareStructV2.goods_rec_url == null ? shareInfo2.goodsRecUrl : shareStructV2.goods_rec_url;
        shareInfo2.shareTitleMyself = shareStructV2.share_title_myself == null ? shareInfo2.shareTitleMyself : shareStructV2.share_title_myself;
        shareInfo2.shareTitleOther = shareStructV2.share_title_other == null ? shareInfo2.shareTitleOther : shareStructV2.share_title_other;
        shareInfo2.shareLinkDesc = shareStructV2.share_link_desc == null ? shareInfo2.shareLinkDesc : shareStructV2.share_link_desc;
        shareInfo2.shareSignatureUrl = shareStructV2.share_signature_url == null ? shareInfo2.shareSignatureUrl : shareStructV2.share_signature_url;
        shareInfo2.shareSignatureDesc = shareStructV2.share_signature_desc == null ? shareInfo2.shareSignatureDesc : shareStructV2.share_signature_desc;
        shareInfo2.shareQuote = shareStructV2.share_quote == null ? shareInfo2.shareQuote : shareStructV2.share_quote;
        shareInfo2.whatsappShareDesc = shareStructV2.whatsapp_desc == null ? shareInfo2.whatsappShareDesc : shareStructV2.whatsapp_desc;
        shareInfo2.shareDescInfo = shareStructV2.share_desc_info == null ? shareInfo2.shareDescInfo : shareStructV2.share_desc_info;
        return shareInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$feed$model$live$ShareStruct */
    public static ShareStruct m5823x84e4115a(ShareStructV2 shareStructV2, ShareStruct shareStruct) {
        if (shareStructV2 == null) {
            return shareStruct;
        }
        ShareStruct shareStruct2 = new ShareStruct();
        shareStruct2.shareUrl = shareStructV2.share_url == null ? shareStruct2.shareUrl : shareStructV2.share_url;
        shareStruct2.shareWeiboDesc = shareStructV2.share_weibo_desc == null ? shareStruct2.shareWeiboDesc : shareStructV2.share_weibo_desc;
        shareStruct2.shareDesc = shareStructV2.share_desc == null ? shareStruct2.shareDesc : shareStructV2.share_desc;
        shareStruct2.shareTitle = shareStructV2.share_title == null ? shareStruct2.shareTitle : shareStructV2.share_title;
        shareStruct2.shareQrcodeUrl = m5835xd6e21675(shareStructV2.share_qrcode_url, shareStruct2.shareQrcodeUrl);
        shareStruct2.boolPersist = C1746a.m5871a(shareStructV2.bool_persist, shareStruct2.boolPersist);
        shareStruct2.shareLinkDesc = shareStructV2.share_link_desc == null ? shareStruct2.shareLinkDesc : shareStructV2.share_link_desc;
        return shareStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$ShowTimeGapRspInfo$$com$ss$android$ugc$aweme$commercialize$feed$timegap$AdShowTimeGapResponse */
    public static C37992c m5824xa91a9a0b(ShowTimeGapRspInfo showTimeGapRspInfo, C37992c cVar) {
        if (showTimeGapRspInfo == null) {
            return cVar;
        }
        C37992c cVar2 = new C37992c();
        cVar2.isEnableGapAdjust = C1746a.m5877a(showTimeGapRspInfo.enable_client_adgap_adjust, cVar2.isEnableGapAdjust);
        cVar2.isEnableFastBrowseAdjust = C1746a.m5877a(showTimeGapRspInfo.enable_fast_browse, cVar2.isEnableFastBrowseAdjust);
        cVar2.isEnableShowTimeGap = C1746a.m5877a(showTimeGapRspInfo.enable_showtime_gap, cVar2.isEnableShowTimeGap);
        cVar2.downstreamRange = C1746a.m5871a(showTimeGapRspInfo.downstream_range_end, cVar2.downstreamRange);
        cVar2.deltaGapTimeMap = showTimeGapRspInfo.adgap_delta_by_time == null ? cVar2.deltaGapTimeMap : showTimeGapRspInfo.adgap_delta_by_time;
        cVar2.isUserFastBrowseModel = C1746a.m5877a(showTimeGapRspInfo.use_fast_browse_model, cVar2.isUserFastBrowseModel);
        cVar2.viewVidNumForFastBrowse = C1746a.m5871a(showTimeGapRspInfo.viewed_vid_num, cVar2.viewVidNumForFastBrowse);
        cVar2.singleVidViewTime = C1746a.m5871a(showTimeGapRspInfo.single_vid_view_time, cVar2.singleVidViewTime);
        cVar2.fastBrowseTimeThreshold = C1746a.m5871a(showTimeGapRspInfo.fast_browse_time_threshold, cVar2.fastBrowseTimeThreshold);
        cVar2.minGap = C1746a.m5871a(showTimeGapRspInfo.min_gap, cVar2.minGap);
        return cVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User */
    public static User m5825xd0fb664c(SimpleUserStructV2 simpleUserStructV2, User user) {
        if (simpleUserStructV2 == null) {
            return user;
        }
        User user2 = new User();
        user2.uid = simpleUserStructV2.uid == null ? user2.uid : simpleUserStructV2.uid;
        user2.nickname = simpleUserStructV2.nickname == null ? user2.nickname : simpleUserStructV2.nickname;
        user2.signature = simpleUserStructV2.signature == null ? user2.signature : simpleUserStructV2.signature;
        user2.avatarThumb = m5835xd6e21675(simpleUserStructV2.avatar_thumb, user2.avatarThumb);
        user2.followStatus = C1746a.m5871a(simpleUserStructV2.follow_status, user2.followStatus);
        user2.userRate = C1746a.m5871a(simpleUserStructV2.user_rate, user2.userRate);
        user2.avatarLarger = m5835xd6e21675(simpleUserStructV2.avatar_larger, user2.avatarLarger);
        user2.uniqueId = simpleUserStructV2.unique_id == null ? user2.uniqueId : simpleUserStructV2.unique_id;
        user2.secUid = simpleUserStructV2.sec_uid == null ? user2.secUid : simpleUserStructV2.sec_uid;
        return user2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$SpecialStickerStructV2$$com$ss$android$ugc$aweme$feed$model$SpecialSticker */
    public static SpecialSticker m5826xd27658e1(SpecialStickerStructV2 specialStickerStructV2, SpecialSticker specialSticker) {
        if (specialStickerStructV2 == null) {
            return specialSticker;
        }
        SpecialSticker specialSticker2 = new SpecialSticker();
        specialSticker2.stickerType = C1746a.m5871a(specialStickerStructV2.sticker_type, specialSticker2.stickerType);
        specialSticker2.linkUrl = specialStickerStructV2.link == null ? specialSticker2.linkUrl : specialStickerStructV2.link;
        specialSticker2.title = specialStickerStructV2.title == null ? specialSticker2.title : specialStickerStructV2.title;
        specialSticker2.stickerId = specialStickerStructV2.sticker_id == null ? specialSticker2.stickerId : specialStickerStructV2.sticker_id;
        specialSticker2.iconUrl = m5835xd6e21675(specialStickerStructV2.icon_url, specialSticker2.iconUrl);
        specialSticker2.openUrl = specialStickerStructV2.open_url == null ? specialSticker2.openUrl : specialStickerStructV2.open_url;
        return specialSticker2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$StoryMetadataV2$$com$ss$android$ugc$aweme$feed$model$story$Story */
    public static Story m5827xe52ad918(StoryMetadataV2 storyMetadataV2, Story story) {
        if (storyMetadataV2 == null) {
            return story;
        }
        Story story2 = new Story();
        story2.expiredAt = C1746a.m5875a(storyMetadataV2.expired_at, story2.expiredAt);
        story2.viewed = C1746a.m5877a(storyMetadataV2.viewed, story2.viewed);
        story2.totalComments = C1746a.m5875a(storyMetadataV2.total_comments, story2.totalComments);
        story2.isOfficial = C1746a.m5877a(storyMetadataV2.is_official, story2.isOfficial);
        story2.viewerCount = C1746a.m5875a(storyMetadataV2.viewer_count, story2.viewerCount);
        story2.chatDisable = C1746a.m5877a(storyMetadataV2.chat_disabled, story2.chatDisable);
        return story2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$StreamUrlStructV2$$com$ss$android$ugc$aweme$feed$model$live$StreamUrlStruct */
    public static StreamUrlStruct m5828x6525b8ba(StreamUrlStructV2 streamUrlStructV2, StreamUrlStruct streamUrlStruct) {
        if (streamUrlStructV2 == null) {
            return streamUrlStruct;
        }
        StreamUrlStruct streamUrlStruct2 = new StreamUrlStruct();
        streamUrlStruct2.sid = C1746a.m5875a(streamUrlStructV2.sid, streamUrlStruct2.sid);
        streamUrlStruct2.rtmp_pull_url = streamUrlStructV2.rtmp_pull_url == null ? streamUrlStruct2.rtmp_pull_url : streamUrlStructV2.rtmp_pull_url;
        streamUrlStruct2.rtmp_push_url = streamUrlStructV2.rtmp_push_url == null ? streamUrlStruct2.rtmp_push_url : streamUrlStructV2.rtmp_push_url;
        streamUrlStruct2.provider = C1746a.m5871a(streamUrlStructV2.provider, streamUrlStruct2.provider);
        return streamUrlStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$TextContentStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivityContent */
    public static AwemeActivityContent m5829x7007158e(TextContentStructV2 textContentStructV2, AwemeActivityContent awemeActivityContent) {
        if (textContentStructV2 == null) {
            return awemeActivityContent;
        }
        AwemeActivityContent awemeActivityContent2 = new AwemeActivityContent();
        awemeActivityContent2.text = textContentStructV2.text == null ? awemeActivityContent2.text : textContentStructV2.text;
        awemeActivityContent2.color = textContentStructV2.color == null ? awemeActivityContent2.color : textContentStructV2.color;
        awemeActivityContent2.size = textContentStructV2.size == null ? awemeActivityContent2.size : textContentStructV2.size;
        return awemeActivityContent2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct */
    public static TextExtraStruct m5830x8e855afe(TextExtraStructV2 textExtraStructV2, TextExtraStruct textExtraStruct) {
        if (textExtraStructV2 == null) {
            return textExtraStruct;
        }
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.start = C1746a.m5871a(textExtraStructV2.start, textExtraStruct2.start);
        textExtraStruct2.end = C1746a.m5871a(textExtraStructV2.end, textExtraStruct2.end);
        textExtraStruct2.userId = textExtraStructV2.user_id == null ? textExtraStruct2.userId : textExtraStructV2.user_id;
        textExtraStruct2.type = C1746a.m5871a(textExtraStructV2.type, textExtraStruct2.type);
        textExtraStruct2.hashTagName = textExtraStructV2.hashtag_name == null ? textExtraStruct2.hashTagName : textExtraStructV2.hashtag_name;
        textExtraStruct2.cid = textExtraStructV2.hashtag_id == null ? textExtraStruct2.cid : textExtraStructV2.hashtag_id;
        textExtraStruct2.isCommerce = C1746a.m5877a(textExtraStructV2.is_commerce, textExtraStruct2.isCommerce);
        textExtraStruct2.mSecUid = textExtraStructV2.sec_uid == null ? textExtraStruct2.mSecUid : textExtraStructV2.sec_uid;
        textExtraStruct2.awemeId = textExtraStructV2.aweme_id == null ? textExtraStruct2.awemeId : textExtraStructV2.aweme_id;
        textExtraStruct2.subType = C1746a.m5871a(textExtraStructV2.sub_type, textExtraStruct2.subType);
        textExtraStruct2.lineIndex = C1746a.m5871a(textExtraStructV2.line_idx, textExtraStruct2.lineIndex);
        return textExtraStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$TrendingBarForYouPageStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTrendingBar */
    public static AwemeTrendingBar m5831x4ef8d2d9(TrendingBarForYouPageStructV2 trendingBarForYouPageStructV2, AwemeTrendingBar awemeTrendingBar) {
        if (trendingBarForYouPageStructV2 == null) {
            return awemeTrendingBar;
        }
        AwemeTrendingBar awemeTrendingBar2 = new AwemeTrendingBar();
        awemeTrendingBar2.iconUrl = m5835xd6e21675(trendingBarForYouPageStructV2.icon_url, awemeTrendingBar2.iconUrl);
        awemeTrendingBar2.display = trendingBarForYouPageStructV2.display == null ? awemeTrendingBar2.display : trendingBarForYouPageStructV2.display;
        awemeTrendingBar2.schema = trendingBarForYouPageStructV2.schema == null ? awemeTrendingBar2.schema : trendingBarForYouPageStructV2.schema;
        awemeTrendingBar2.eventKeywordId = C1746a.m5875a(trendingBarForYouPageStructV2.event_keyword_id, awemeTrendingBar2.eventKeywordId);
        awemeTrendingBar2.eventKeyword = trendingBarForYouPageStructV2.event_keyword == null ? awemeTrendingBar2.eventKeyword : trendingBarForYouPageStructV2.event_keyword;
        awemeTrendingBar2.eventTrackingParam = trendingBarForYouPageStructV2.event_tracking_param == null ? awemeTrendingBar2.eventTrackingParam : trendingBarForYouPageStructV2.event_tracking_param;
        return awemeTrendingBar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$TrendingBarStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTrendingBar */
    public static AwemeTrendingBar m5832x34e33474(TrendingBarStructV2 trendingBarStructV2, AwemeTrendingBar awemeTrendingBar) {
        if (trendingBarStructV2 == null) {
            return awemeTrendingBar;
        }
        AwemeTrendingBar awemeTrendingBar2 = new AwemeTrendingBar();
        awemeTrendingBar2.iconUrl = m5835xd6e21675(trendingBarStructV2.icon_url, awemeTrendingBar2.iconUrl);
        awemeTrendingBar2.display = trendingBarStructV2.display == null ? awemeTrendingBar2.display : trendingBarStructV2.display;
        awemeTrendingBar2.schema = trendingBarStructV2.schema == null ? awemeTrendingBar2.schema : trendingBarStructV2.schema;
        awemeTrendingBar2.eventKeywordId = C1746a.m5875a(trendingBarStructV2.event_keyword_id, awemeTrendingBar2.eventKeywordId);
        awemeTrendingBar2.eventKeyword = trendingBarStructV2.event_keyword == null ? awemeTrendingBar2.eventKeyword : trendingBarStructV2.event_keyword;
        awemeTrendingBar2.eventTrackingParam = trendingBarStructV2.event_tracking_param == null ? awemeTrendingBar2.eventTrackingParam : trendingBarStructV2.event_tracking_param;
        return awemeTrendingBar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$TtsAudioStructV2$$com$ss$android$ugc$aweme$feed$model$TtsInfos */
    public static TtsInfos m5833xbf0aa78e(TtsAudioStructV2 ttsAudioStructV2, TtsInfos ttsInfos) {
        if (ttsAudioStructV2 == null) {
            return ttsInfos;
        }
        TtsInfos ttsInfos2 = new TtsInfos();
        ttsInfos2.lang = ttsAudioStructV2.lang == null ? ttsInfos2.lang : ttsAudioStructV2.lang;
        ttsInfos2.languageId = ttsAudioStructV2.language_id == null ? ttsInfos2.languageId : ttsAudioStructV2.language_id;
        ttsInfos2.voiceType = ttsAudioStructV2.voice_type == null ? ttsInfos2.voiceType : ttsAudioStructV2.voice_type;
        ttsInfos2.playAddress = m5836x5c345252(ttsAudioStructV2.play_addr, ttsInfos2.playAddress);
        ttsInfos2.volumeInfo = ttsAudioStructV2.volume_info == null ? ttsInfos2.volumeInfo : ttsAudioStructV2.volume_info;
        return ttsInfos2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UpvoteReasonV2$$com$ss$android$ugc$aweme$feed$model$upvote$UpvoteReason */
    public static UpvoteReason m5834xd3775a3b(UpvoteReasonV2 upvoteReasonV2, UpvoteReason upvoteReason) {
        if (upvoteReasonV2 == null) {
            return upvoteReason;
        }
        UpvoteReason upvoteReason2 = new UpvoteReason();
        upvoteReason2.reasonType = upvoteReasonV2.reason_type == null ? upvoteReason2.reasonType : upvoteReasonV2.reason_type;
        upvoteReason2.subType = upvoteReasonV2.sub_type == null ? upvoteReason2.subType : upvoteReasonV2.sub_type;
        upvoteReason2.middleInfo = List$java$lang$Long$$ArrayJ(upvoteReasonV2.middle_info, upvoteReason2.middleInfo);
        upvoteReason2.middleCount = upvoteReasonV2.middle_count == null ? upvoteReason2.middleCount : upvoteReasonV2.middle_count;
        upvoteReason2.userId = C1746a.m5876a(upvoteReasonV2.user_id, upvoteReason2.userId);
        upvoteReason2.itemId = C1746a.m5876a(upvoteReasonV2.item_id, upvoteReason2.itemId);
        return upvoteReason2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel */
    public static UrlModel m5835xd6e21675(UrlStructV2 urlStructV2, UrlModel urlModel) {
        if (urlStructV2 == null) {
            return urlModel;
        }
        UrlModel urlModel2 = new UrlModel();
        urlModel2.uri = urlStructV2.uri == null ? urlModel2.uri : urlStructV2.uri;
        urlModel2.urlList = urlStructV2.url_list == null ? urlModel2.urlList : urlStructV2.url_list;
        urlModel2.width = C1746a.m5871a(urlStructV2.width, urlModel2.width);
        urlModel2.height = C1746a.m5871a(urlStructV2.height, urlModel2.height);
        urlModel2.urlKey = urlStructV2.url_key == null ? urlModel2.urlKey : urlStructV2.url_key;
        urlModel2.size = C1746a.m5875a(urlStructV2.data_size, urlModel2.size);
        urlModel2.fileHash = urlStructV2.file_hash == null ? urlModel2.fileHash : urlStructV2.file_hash;
        return urlModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$PlayAddress */
    public static PlayAddress m5836x5c345252(UrlStructV2 urlStructV2, PlayAddress playAddress) {
        if (urlStructV2 == null) {
            return playAddress;
        }
        PlayAddress playAddress2 = new PlayAddress();
        playAddress2.uri = urlStructV2.uri == null ? playAddress2.uri : urlStructV2.uri;
        playAddress2.urlList = urlStructV2.url_list == null ? playAddress2.urlList : urlStructV2.url_list;
        playAddress2.width = urlStructV2.width == null ? playAddress2.width : urlStructV2.width;
        playAddress2.height = urlStructV2.height == null ? playAddress2.height : urlStructV2.height;
        playAddress2.urlKey = urlStructV2.url_key == null ? playAddress2.urlKey : urlStructV2.url_key;
        playAddress2.dataSize = urlStructV2.data_size == null ? playAddress2.dataSize : urlStructV2.data_size;
        playAddress2.fileHash = urlStructV2.file_hash == null ? playAddress2.fileHash : urlStructV2.file_hash;
        playAddress2.fileCS = urlStructV2.file_cs == null ? playAddress2.fileCS : urlStructV2.file_cs;
        playAddress2.playerAccessKey = urlStructV2.player_access_key == null ? playAddress2.playerAccessKey : urlStructV2.player_access_key;
        return playAddress2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel */
    public static VideoUrlModel m5837xb077c847(UrlStructV2 urlStructV2, VideoUrlModel videoUrlModel) {
        if (urlStructV2 == null) {
            return videoUrlModel;
        }
        VideoUrlModel videoUrlModel2 = new VideoUrlModel();
        videoUrlModel2.uri = urlStructV2.uri == null ? videoUrlModel2.uri : urlStructV2.uri;
        videoUrlModel2.urlList = urlStructV2.url_list == null ? videoUrlModel2.urlList : urlStructV2.url_list;
        videoUrlModel2.width = C1746a.m5871a(urlStructV2.width, videoUrlModel2.width);
        videoUrlModel2.height = C1746a.m5871a(urlStructV2.height, videoUrlModel2.height);
        videoUrlModel2.urlKey = urlStructV2.url_key == null ? videoUrlModel2.urlKey : urlStructV2.url_key;
        videoUrlModel2.size = C1746a.m5875a(urlStructV2.data_size, videoUrlModel2.size);
        videoUrlModel2.fileHash = urlStructV2.file_hash == null ? videoUrlModel2.fileHash : urlStructV2.file_hash;
        videoUrlModel2.fileCheckSum = urlStructV2.file_cs == null ? videoUrlModel2.fileCheckSum : urlStructV2.file_cs;
        return videoUrlModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UserProfileStructV2$$com$ss$android$ugc$aweme$feed$model$UserProfileInitInfo */
    public static UserProfileInitInfo m5838xf505f47f(UserProfileStructV2 userProfileStructV2, UserProfileInitInfo userProfileInitInfo) {
        if (userProfileStructV2 == null) {
            return userProfileInitInfo;
        }
        UserProfileInitInfo userProfileInitInfo2 = new UserProfileInitInfo();
        userProfileInitInfo2.headModelScore = C1746a.m5867a(userProfileStructV2.head_model_score, userProfileInitInfo2.headModelScore);
        return userProfileInitInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UserStoryV2$$com$ss$android$ugc$aweme$feed$model$story$UserStory */
    public static UserStory m5839xccf885a7(UserStoryV2 userStoryV2, UserStory userStory) {
        if (userStoryV2 == null) {
            return userStory;
        }
        UserStory userStory2 = new UserStory();
        userStory2.stories = m5674x83100197(userStoryV2.stories, userStory2.stories);
        userStory2.totalCount = C1746a.m5875a(userStoryV2.total_count, userStory2.totalCount);
        userStory2.currentPosition = C1746a.m5875a(userStoryV2.current_position, userStory2.currentPosition);
        userStory2.allViewed = C1746a.m5877a(userStoryV2.all_viewed, userStory2.allViewed);
        userStory2.minCursor = C1746a.m5875a(userStoryV2.min_cursor, userStory2.minCursor);
        userStory2.maxCursor = C1746a.m5875a(userStoryV2.max_cursor, userStory2.maxCursor);
        userStory2.hasMoreAfter = C1746a.m5877a(userStoryV2.has_more_after, userStory2.hasMoreAfter);
        userStory2.hasMoreBefore = C1746a.m5877a(userStoryV2.has_more_before, userStory2.hasMoreBefore);
        userStory2.lastStoryCreatedAt = C1746a.m5875a(userStoryV2.last_story_created_at, userStory2.lastStoryCreatedAt);
        return userStory2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User */
    public static User m5840x2fb9c61e(UserStructV2 userStructV2, User user) {
        if (userStructV2 == null) {
            return user;
        }
        User user2 = new User();
        user2.uid = userStructV2.uid == null ? user2.uid : userStructV2.uid;
        user2.shortId = userStructV2.short_id == null ? user2.shortId : userStructV2.short_id;
        user2.nickname = userStructV2.nickname == null ? user2.nickname : userStructV2.nickname;
        user2.signature = userStructV2.signature == null ? user2.signature : userStructV2.signature;
        user2.avatarLarger = m5835xd6e21675(userStructV2.avatar_larger, user2.avatarLarger);
        user2.avatarThumb = m5835xd6e21675(userStructV2.avatar_thumb, user2.avatarThumb);
        user2.avatarMedium = m5835xd6e21675(userStructV2.avatar_medium, user2.avatarMedium);
        user2.birthday = userStructV2.birthday == null ? user2.birthday : userStructV2.birthday;
        user2.followStatus = C1746a.m5871a(userStructV2.follow_status, user2.followStatus);
        user2.awemeCount = C1746a.m5871a(userStructV2.aweme_count, user2.awemeCount);
        user2.followingCount = C1746a.m5871a(userStructV2.following_count, user2.followingCount);
        user2.followerCount = C1746a.m5871a(userStructV2.follower_count, user2.followerCount);
        user2.favoritingCount = C1746a.m5871a(userStructV2.favoriting_count, user2.favoritingCount);
        user2.totalFavorited = C1746a.m5873a(userStructV2.total_favorited, user2.totalFavorited);
        user2.isBlock = C1746a.m5877a(userStructV2.is_block, user2.isBlock);
        user2.hideSearch = C1746a.m5877a(userStructV2.hide_search, user2.hideSearch);
        user2.customVerify = userStructV2.custom_verify == null ? user2.customVerify : userStructV2.custom_verify;
        user2.uniqueId = userStructV2.unique_id == null ? user2.uniqueId : userStructV2.unique_id;
        user2.bindPhone = userStructV2.bind_phone == null ? user2.bindPhone : userStructV2.bind_phone;
        user2.needRecommend = C1746a.m5878a(userStructV2.need_recommend, user2.needRecommend);
        user2.recommendReason = userStructV2.recommend_reason == null ? user2.recommendReason : userStructV2.recommend_reason;
        user2.hasFacebookToken = C1746a.m5877a(userStructV2.has_facebook_token, user2.hasFacebookToken);
        user2.hasTwitterToken = C1746a.m5877a(userStructV2.has_twitter_token, user2.hasTwitterToken);
        user2.fbExpireTime = C1746a.m5873a(userStructV2.fb_expire_time, user2.fbExpireTime);
        user2.twExpireTime = C1746a.m5873a(userStructV2.tw_expire_time, user2.twExpireTime);
        user2.hasYoutubeToken = C1746a.m5877a(userStructV2.has_youtube_token, user2.hasYoutubeToken);
        user2.youtubeExpireTime = C1746a.m5873a(userStructV2.youtube_expire_time, user2.youtubeExpireTime);
        user2.roomId = C1746a.m5875a(userStructV2.room_id, user2.roomId);
        user2.authorityStatus = C1746a.m5875a(userStructV2.authority_status, user2.authorityStatus);
        user2.verifyInfo = userStructV2.verify_info == null ? user2.verifyInfo : userStructV2.verify_info;
        user2.shieldFollowNotice = C1746a.m5871a(userStructV2.shield_follow_notice, user2.shieldFollowNotice);
        user2.shieldDiggNotice = C1746a.m5871a(userStructV2.shield_digg_notice, user2.shieldDiggNotice);
        user2.shieldCommentNotice = C1746a.m5871a(userStructV2.shield_comment_notice, user2.shieldCommentNotice);
        user2.shareInfo = m5822xe4348698(userStructV2.share_info, user2.shareInfo);
        user2.withCommerceEntry = C1746a.m5877a(userStructV2.with_commerce_entry, user2.withCommerceEntry);
        user2.verificationType = C1746a.m5871a(userStructV2.verification_type, user2.verificationType);
        user2.originalMusician = m5804x309ee127(userStructV2.original_musician, user2.originalMusician);
        user2.enterpriseVerifyReason = userStructV2.enterprise_verify_reason == null ? user2.enterpriseVerifyReason : userStructV2.enterprise_verify_reason;
        user2.isAdFake = C1746a.m5877a(userStructV2.is_ad_fake, user2.isAdFake);
        user2.fansCount = C1746a.m5871a(userStructV2.mplatform_followers_count, user2.fansCount);
        user2.followerDetailList = m5680xba3b9b20(userStructV2.followers_detail, user2.followerDetailList);
        user2.region = userStructV2.region == null ? user2.region : userStructV2.region;
        user2.accountRegion = userStructV2.account_region == null ? user2.accountRegion : userStructV2.account_region;
        user2.commerceUserLevel = C1746a.m5871a(userStructV2.commerce_user_level, user2.commerceUserLevel);
        user2.commerceInfo = m5751x89ac5ff3(userStructV2.commerce_info, user2.commerceInfo);
        user2.liveAgreement = C1746a.m5871a(userStructV2.live_agreement, user2.liveAgreement);
        user2.platformInfos = m5693xc1a28d7c(userStructV2.platform_sync_info, user2.platformInfos);
        user2.withShopEntry = C1746a.m5877a(userStructV2.with_shop_entry, user2.withShopEntry);
        user2.isDisciplineMember = C1746a.m5877a(userStructV2.is_discipline_member, user2.isDisciplineMember);
        user2.secret = C1746a.m5878a(userStructV2.secret, user2.secret);
        user2.hasOrders = C1746a.m5877a(userStructV2.has_orders, user2.hasOrders);
        user2.preventDownload = C1746a.m5877a(userStructV2.prevent_download, user2.preventDownload);
        user2.showImageBubble = C1746a.m5877a(userStructV2.show_image_bubble, user2.showImageBubble);
        user2.unique_id_modify_time = C1746a.m5873a(userStructV2.unique_id_modify_time, user2.unique_id_modify_time);
        user2.avatarVideoUri = m5835xd6e21675(userStructV2.video_icon, user2.avatarVideoUri);
        user2.insId = userStructV2.ins_id == null ? user2.insId : userStructV2.ins_id;
        user2.youtubeChannelId = userStructV2.youtube_channel_id == null ? user2.youtubeChannelId : userStructV2.youtube_channel_id;
        user2.youtubeChannelTitle = userStructV2.youtube_channel_title == null ? user2.youtubeChannelTitle : userStructV2.youtube_channel_title;
        user2.isPhoneBinded = C1746a.m5877a(userStructV2.is_phone_binded, user2.isPhoneBinded);
        user2.loginPlatform = C1746a.m5871a(userStructV2.login_platform, user2.loginPlatform);
        user2.acceptPrivatePolicy = C1746a.m5877a(userStructV2.accept_private_policy, user2.acceptPrivatePolicy);
        user2.twitterId = userStructV2.twitter_id == null ? user2.twitterId : userStructV2.twitter_id;
        user2.twitterName = userStructV2.twitter_name == null ? user2.twitterName : userStructV2.twitter_name;
        user2.userCancelled = C1746a.m5877a(userStructV2.user_canceled, user2.userCancelled);
        user2.hasEmail = C1746a.m5877a(userStructV2.has_email, user2.hasEmail);
        user2.registerTime = C1746a.m5875a(userStructV2.register_time, user2.registerTime);
        user2.createTime = userStructV2.create_time == null ? user2.createTime : userStructV2.create_time;
        user2.followerStatus = C1746a.m5871a(userStructV2.follower_status, user2.followerStatus);
        user2.commentSetting = C1746a.m5871a(userStructV2.comment_setting, user2.commentSetting);
        user2.duetSetting = C1746a.m5871a(userStructV2.duet_setting, user2.duetSetting);
        user2.userRate = C1746a.m5871a(userStructV2.user_rate, user2.userRate);
        user2.withNewGoods = C1746a.m5877a(userStructV2.with_new_goods, user2.withNewGoods);
        user2.roomCover = m5835xd6e21675(userStructV2.room_cover, user2.roomCover);
        user2.downloadSetting = C1746a.m5871a(userStructV2.download_setting, user2.downloadSetting);
        user2.liveCommerce = C1746a.m5877a(userStructV2.live_commerce, user2.liveCommerce);
        user2.country = userStructV2.country == null ? user2.country : userStructV2.country;
        user2.province = userStructV2.province == null ? user2.province : userStructV2.province;
        user2.cityName = userStructV2.city == null ? user2.cityName : userStructV2.city;
        user2.coverUrls = m5702x5c3c5aaf(userStructV2.cover_url, user2.coverUrls);
        user2.recommendReasonRelation = userStructV2.recommend_reason_relation == null ? user2.recommendReasonRelation : userStructV2.recommend_reason_relation;
        user2.isoCountryCode = userStructV2.iso_country_code == null ? user2.isoCountryCode : userStructV2.iso_country_code;
        user2.district = userStructV2.district == null ? user2.district : userStructV2.district;
        user2.language = userStructV2.language == null ? user2.language : userStructV2.language;
        user2.roomTypeTag = userStructV2.room_type_tag == null ? user2.roomTypeTag : userStructV2.room_type_tag;
        user2.isCreater = C1746a.m5877a(userStructV2.has_insights, user2.isCreater);
        user2.remarkName = userStructV2.remark_name == null ? user2.remarkName : userStructV2.remark_name;
        user2.tabType = C1746a.m5871a(userStructV2.profile_tab_type, user2.tabType);
        user2.avatarDecoration = m5724xb77ea0de(userStructV2.avatar_decoration, user2.avatarDecoration);
        user2.watchStatus = C1746a.m5869a(userStructV2.watch_status, user2.watchStatus);
        user2.withCommerceNewbieTask = C1746a.m5877a(userStructV2.with_commerce_newbie_task, user2.withCommerceNewbieTask);
        user2.withItemCommerceEntry = C1746a.m5877a(userStructV2.with_item_commerce_entry, user2.withItemCommerceEntry);
        user2.starBillboardRank = C1746a.m5871a(userStructV2.star_billboard_rank, user2.starBillboardRank);
        user2.education = C1746a.m5871a(userStructV2.education, user2.education);
        user2.canModifySchoolInfo = C1746a.m5877a(userStructV2.can_modify_school_info, user2.canModifySchoolInfo);
        user2.schoolInfoShowRange = C1746a.m5871a(userStructV2.school_visible, user2.schoolInfoShowRange);
        user2.avatarPendantLarger = m5835xd6e21675(userStructV2.avatar_pendant_larger, user2.avatarPendantLarger);
        user2.avatarPendantThumb = m5835xd6e21675(userStructV2.avatar_pendant_thumb, user2.avatarPendantThumb);
        user2.avatarPendantMedium = m5835xd6e21675(userStructV2.avatar_pendant_medium, user2.avatarPendantMedium);
        user2.recommendAwemeItems = m5696x2cf2d58d(userStructV2.item_list, user2.recommendAwemeItems);
        user2.userMode = C1746a.m5871a(userStructV2.user_mode, user2.userMode);
        user2.userPeriod = C1746a.m5871a(userStructV2.user_period, user2.userPeriod);
        user2.isEffectArtist = C1746a.m5877a(userStructV2.is_effect_artist, user2.isEffectArtist);
        user2.effectArtistDetail = m5759xcd80c52f(userStructV2.effect_detail, user2.effectArtistDetail);
        user2.commercePermission = m5752xdb3e10b3(userStructV2.commerce_permissions, user2.commercePermission);
        user2.storyBlockInfo = m5779x63b96a30(userStructV2.life_story_block, user2.storyBlockInfo);
        user2.hideFollowingFollowerList = C1746a.m5871a(userStructV2.hide_following_follower_list, user2.hideFollowingFollowerList);
        user2.isStar = C1746a.m5877a(userStructV2.is_star, user2.isStar);
        user2.typeLabels = List$java$lang$Long$$ArrayJ(userStructV2.type_label, user2.typeLabels);
        user2.adCoverUrl = m5702x5c3c5aaf(userStructV2.ad_cover_url, user2.adCoverUrl);
        user2.adCoverTitle = m5714xc3027593(userStructV2.ad_cover_title, user2.adCoverTitle);
        user2.adOrderId = userStructV2.ad_order_id == null ? user2.adOrderId : userStructV2.ad_order_id;
        user2.rFansGroupInfo = m5816x59f04dc3(userStructV2.r_fans_group_info, user2.rFansGroupInfo);
        user2.withCommerceEnterpriseTabEntry = C1746a.m5877a(userStructV2.with_commerce_enterprise_tab_entry, user2.withCommerceEnterpriseTabEntry);
        user2.honorStruct = m5783x5053ac85(userStructV2.honor_info, user2.honorStruct);
        user2.commentFilterStatus = C1746a.m5871a(userStructV2.comment_filter_status, user2.commentFilterStatus);
        user2.notifyPrivateAccount = C1746a.m5871a(userStructV2.notify_private_account, user2.notifyPrivateAccount);
        user2.isBlocked = C1746a.m5877a(userStructV2.is_blocked, user2.isBlocked);
        user2.forcePrivateAccount = C1746a.m5877a(userStructV2.force_private_account, user2.forcePrivateAccount);
        user2.withStarAtlasEntry = C1746a.m5877a(userStructV2.with_star_atlas_entry, user2.withStarAtlasEntry);
        user2.sprintSupportUserInfo = m5770xbdc2a07b(userStructV2.sprint_support_user_info, user2.sprintSupportUserInfo);
        user2.signatureLanguage = userStructV2.signature_language == null ? user2.signatureLanguage : userStructV2.signature_language;
        user2.brandInfo = m5740x254728de(userStructV2.brand_info, user2.brandInfo);
        user2.displayWvalantineActivityEntry = C1746a.m5877a(userStructV2.display_wvalantine_activity_entry, user2.displayWvalantineActivityEntry);
        user2.shopMicroApp = userStructV2.shop_micro_app == null ? user2.shopMicroApp : userStructV2.shop_micro_app;
        user2.commerceUserInfo = m5755x60620bcc(userStructV2.commerce_user_info, user2.commerceUserInfo);
        user2.relativeUserInfos = m5698xf3bc2c2a(userStructV2.relative_users, user2.relativeUserInfos);
        user2.quickShopInfo = m5815x85e038dc(userStructV2.quick_shop_info, user2.quickShopInfo);
        user2.challengeList = m5677x890b881a(userStructV2.cha_list, user2.challengeList);
        user2.secUid = userStructV2.sec_uid == null ? user2.secUid : userStructV2.sec_uid;
        user2.recommendScore = C1746a.m5867a(userStructV2.recommend_score, user2.recommendScore);
        user2.mGeneralPermission = m5805xef5550a8(userStructV2.general_permission, user2.mGeneralPermission);
        user2.bioUrl = userStructV2.bio_url == null ? user2.bioUrl : userStructV2.bio_url;
        user2.bioEmail = userStructV2.bio_email == null ? user2.bioEmail : userStructV2.bio_email;
        user2.latestOrderTime = userStructV2.latest_order_time == null ? user2.latestOrderTime : userStructV2.latest_order_time;
        user2.isProAccount = C1746a.m5877a(userStructV2.is_pro_account, user2.isProAccount);
        user2.email = userStructV2.email == null ? user2.email : userStructV2.email;
        user2.isEmailVerified = C1746a.m5877a(userStructV2.is_email_verified, user2.isEmailVerified);
        user2.bioSecureUrl = userStructV2.bio_secure_url == null ? user2.bioSecureUrl : userStructV2.bio_secure_url;
        user2.collectCount = C1746a.m5871a(userStructV2.collect_count, user2.collectCount);
        user2.nicknameUpdateReminder = C1746a.m5877a(userStructV2.nickname_update_reminder, user2.nicknameUpdateReminder);
        user2.avatarUpdateReminder = C1746a.m5877a(userStructV2.avatar_update_reminder, user2.avatarUpdateReminder);
        user2.isActivityUser = C1746a.m5877a(userStructV2.is_activity_user, user2.isActivityUser);
        user2.roomData = userStructV2.room_data == null ? user2.roomData : userStructV2.room_data;
        user2.unReadVideoInfo = m5847x5665e1cc(userStructV2.video_unread_info, user2.unReadVideoInfo);
        user2.stitchSetting = C1746a.m5871a(userStructV2.stitch_setting, user2.stitchSetting);
        user2.qnaStatus = C1746a.m5871a(userStructV2.qa_status, user2.qnaStatus);
        user2.mProfileBadgeStruct = m5811xb000eff3(userStructV2.badge_info, user2.mProfileBadgeStruct);
        user2.socialInfo = userStructV2.social_info == null ? user2.socialInfo : userStructV2.social_info;
        user2.storyStatus = C1746a.m5871a(userStructV2.story_status, user2.storyStatus);
        user2.matchedFriendStruct = m5788x24a97781(userStructV2.matched_friend, user2.matchedFriendStruct);
        return user2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$UtteranceV2$$com$ss$android$ugc$aweme$sticker$data$Utterance */
    public static C75313h m5841xf7db0584(UtteranceV2 utteranceV2, C75313h hVar) {
        if (utteranceV2 == null) {
            return hVar;
        }
        C75313h hVar2 = new C75313h();
        hVar2.text = utteranceV2.text == null ? hVar2.text : utteranceV2.text;
        hVar2.startTime = C1746a.m5875a(utteranceV2.start_time, hVar2.startTime);
        hVar2.endTime = C1746a.m5875a(utteranceV2.end_time, hVar2.endTime);
        return hVar2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl */
    public static VideoControl m5842x817ae5e8(VideoControlV2 videoControlV2, VideoControl videoControl) {
        if (videoControlV2 == null) {
            return videoControl;
        }
        VideoControl videoControl2 = new VideoControl();
        videoControl2.allowDownload = videoControlV2.allow_download == null ? videoControl2.allowDownload : videoControlV2.allow_download;
        videoControl2.shareType = C1746a.m5871a(videoControlV2.share_type, videoControl2.shareType);
        videoControl2.showProgressBar = C1746a.m5871a(videoControlV2.show_progress_bar, videoControl2.showProgressBar);
        videoControl2.draftProgressBar = C1746a.m5871a(videoControlV2.draft_progress_bar, videoControl2.draftProgressBar);
        videoControl2.isAllowDuet = C1746a.m5877a(videoControlV2.allow_duet, videoControl2.isAllowDuet);
        videoControl2.isAllowReact = C1746a.m5877a(videoControlV2.allow_react, videoControl2.isAllowReact);
        videoControl2.preventDownloadType = C1746a.m5871a(videoControlV2.prevent_download_type, videoControl2.preventDownloadType);
        videoControl2.isAllowDynamicWallpaper = C1746a.m5877a(videoControlV2.allow_dynamic_wallpaper, videoControl2.isAllowDynamicWallpaper);
        videoControl2.timerStatus = C1746a.m5871a(videoControlV2.timer_status, videoControl2.timerStatus);
        videoControl2.isAllowMusic = C1746a.m5877a(videoControlV2.allow_music, videoControl2.isAllowMusic);
        return videoControl2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoMuteStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus$VideoMuteInfo */
    public static AwemeStatus.VideoMuteInfo m5843x82e79a4(VideoMuteStructV2 videoMuteStructV2, AwemeStatus.VideoMuteInfo videoMuteInfo) {
        if (videoMuteStructV2 == null) {
            return videoMuteInfo;
        }
        AwemeStatus.VideoMuteInfo videoMuteInfo2 = new AwemeStatus.VideoMuteInfo();
        videoMuteInfo2.isMute = C1746a.m5877a(videoMuteStructV2.is_mute, videoMuteInfo2.isMute);
        videoMuteInfo2.muteDesc = videoMuteStructV2.mute_desc == null ? videoMuteInfo2.muteDesc : videoMuteStructV2.mute_desc;
        return videoMuteInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoReplyStructV2$$com$ss$android$ugc$aweme$feed$model$VideoReplyStruct */
    public static VideoReplyStruct m5844xc5fe6d6c(VideoReplyStructV2 videoReplyStructV2, VideoReplyStruct videoReplyStruct) {
        if (videoReplyStructV2 == null) {
            return videoReplyStruct;
        }
        VideoReplyStruct videoReplyStruct2 = new VideoReplyStruct();
        videoReplyStruct2.awemeId = C1746a.m5875a(videoReplyStructV2.aweme_id, videoReplyStruct2.awemeId);
        videoReplyStruct2.commentId = C1746a.m5875a(videoReplyStructV2.comment_id, videoReplyStruct2.commentId);
        videoReplyStruct2.aliasCommentId = C1746a.m5875a(videoReplyStructV2.alias_comment_id, videoReplyStruct2.aliasCommentId);
        videoReplyStruct2.userName = videoReplyStructV2.user_name == null ? videoReplyStruct2.userName : videoReplyStructV2.user_name;
        videoReplyStruct2.commentMsg = videoReplyStructV2.comment_msg == null ? videoReplyStruct2.commentMsg : videoReplyStructV2.comment_msg;
        videoReplyStruct2.commentUserId = C1746a.m5875a(videoReplyStructV2.comment_user_id, videoReplyStruct2.commentUserId);
        videoReplyStruct2.userAvatar = m5835xd6e21675(videoReplyStructV2.user_avatar, videoReplyStruct2.userAvatar);
        videoReplyStruct2.collectStat = videoReplyStructV2.collect_stat == null ? videoReplyStruct2.collectStat : videoReplyStructV2.collect_stat;
        return videoReplyStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video */
    public static Video m5845xdc245461(VideoStructV2 videoStructV2, Video video) {
        if (videoStructV2 == null) {
            return video;
        }
        Video video2 = new Video();
        video2.playAddr = m5837xb077c847(videoStructV2.play_addr, video2.playAddr);
        video2.cover = m5835xd6e21675(videoStructV2.cover, video2.cover);
        video2.height = C1746a.m5871a(videoStructV2.height, video2.height);
        video2.width = C1746a.m5871a(videoStructV2.width, video2.width);
        video2.dynamicCover = m5835xd6e21675(videoStructV2.dynamic_cover, video2.dynamicCover);
        video2.originCover = m5835xd6e21675(videoStructV2.origin_cover, video2.originCover);
        video2.ratio = videoStructV2.ratio == null ? video2.ratio : videoStructV2.ratio;
        video2.downloadAddr = m5835xd6e21675(videoStructV2.download_addr, video2.downloadAddr);
        video2.bitRate = m5675xb984563(videoStructV2.bit_rate, video2.bitRate);
        video2.newDownloadAddr = m5835xd6e21675(videoStructV2.new_download_addr, video2.newDownloadAddr);
        video2.videoLength = C1746a.m5871a(videoStructV2.duration, video2.videoLength);
        video2.h264PlayAddr = m5837xb077c847(videoStructV2.play_addr_h264, video2.h264PlayAddr);
        video2.uiAlikeAddr = m5835xd6e21675(videoStructV2.ui_alike_download_addr, video2.uiAlikeAddr);
        video2.captionDownloadAddr = m5835xd6e21675(videoStructV2.caption_download_addr, video2.captionDownloadAddr);
        video2.isLongVideo = C1746a.m5878a(videoStructV2.is_long_video, video2.isLongVideo);
        video2.dVideoModel = videoStructV2.video_model == null ? video2.dVideoModel : videoStructV2.video_model;
        video2.needSetCookie = C1746a.m5877a(videoStructV2.need_set_token, video2.needSetCookie);
        video2.miscDownloadAddrs = videoStructV2.misc_download_addrs == null ? video2.miscDownloadAddrs : videoStructV2.misc_download_addrs;
        video2.drmTokenAuth = m5807x92d6feb8(videoStructV2.token_auth, video2.drmTokenAuth);
        video2.playAddrBytevc1 = m5837xb077c847(videoStructV2.play_addr_bytevc1, video2.playAddrBytevc1);
        video2.meta = videoStructV2.meta == null ? video2.meta : videoStructV2.meta;
        video2.captionModel = m5748x6367715a(videoStructV2.cla_info, video2.captionModel);
        return video2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel */
    public static AwemeTextLabelModel m5846x7df21302(VideoTextStructV2 videoTextStructV2, AwemeTextLabelModel awemeTextLabelModel) {
        if (videoTextStructV2 == null) {
            return awemeTextLabelModel;
        }
        AwemeTextLabelModel awemeTextLabelModel2 = new AwemeTextLabelModel();
        awemeTextLabelModel2.labelName = videoTextStructV2.text == null ? awemeTextLabelModel2.labelName : videoTextStructV2.text;
        awemeTextLabelModel2.bgColor = videoTextStructV2.color == null ? awemeTextLabelModel2.bgColor : videoTextStructV2.color;
        awemeTextLabelModel2.textColor = videoTextStructV2.color_text == null ? awemeTextLabelModel2.textColor : videoTextStructV2.color_text;
        awemeTextLabelModel2.labelType = C1746a.m5871a(videoTextStructV2.type, awemeTextLabelModel2.labelType);
        return awemeTextLabelModel2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VideoUnreadStructV2$$com$ss$android$ugc$aweme$profile$model$UnReadVideoInfo */
    public static UnReadVideoInfo m5847x5665e1cc(VideoUnreadStructV2 videoUnreadStructV2, UnReadVideoInfo unReadVideoInfo) {
        if (videoUnreadStructV2 == null) {
            return unReadVideoInfo;
        }
        UnReadVideoInfo unReadVideoInfo2 = new UnReadVideoInfo();
        unReadVideoInfo2.unReadCount = C1746a.m5871a(videoUnreadStructV2.unread_count, unReadVideoInfo2.unReadCount);
        unReadVideoInfo2.latestUnreadVideoCreatedTime = C1746a.m5875a(videoUnreadStructV2.latest_unread_video_created_time, unReadVideoInfo2.latestUnreadVideoCreatedTime);
        return unReadVideoInfo2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$PollStruct$OptionsBean */
    public static PollStruct.OptionsBean m5848xfb301be8(VoteOptionStructV2 voteOptionStructV2, PollStruct.OptionsBean optionsBean) {
        if (voteOptionStructV2 == null) {
            return optionsBean;
        }
        PollStruct.OptionsBean optionsBean2 = new PollStruct.OptionsBean();
        optionsBean2.optionText = voteOptionStructV2.option_text == null ? optionsBean2.optionText : voteOptionStructV2.option_text;
        optionsBean2.optionId = C1746a.m5875a(voteOptionStructV2.option_id, optionsBean2.optionId);
        optionsBean2.pollCount = C1746a.m5875a(voteOptionStructV2.vote_count, optionsBean2.pollCount);
        optionsBean2.postOption = voteOptionStructV2.option == null ? optionsBean2.postOption : voteOptionStructV2.option;
        return optionsBean2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$VoteStructV2$$com$ss$android$ugc$aweme$sticker$data$PollStruct */
    public static PollStruct m5849x15cd8d29(VoteStructV2 voteStructV2, PollStruct pollStruct) {
        if (voteStructV2 == null) {
            return pollStruct;
        }
        PollStruct pollStruct2 = new PollStruct();
        pollStruct2.pollId = C1746a.m5875a(voteStructV2.vote_id, pollStruct2.pollId);
        pollStruct2.refId = C1746a.m5875a(voteStructV2.ref_id, pollStruct2.refId);
        pollStruct2.refType = C1746a.m5871a(voteStructV2.ref_type, pollStruct2.refType);
        pollStruct2.question = voteStructV2.question == null ? pollStruct2.question : voteStructV2.question;
        pollStruct2.options = m5705x7cfde55a(voteStructV2.options, pollStruct2.options);
        pollStruct2.selectOptionId = C1746a.m5875a(voteStructV2.select_option_id, pollStruct2.selectOptionId);
        return pollStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$WebcastRoomFeedCellStructV2$$com$ss$android$ugc$aweme$feed$model$live$RoomFeedCellStruct */
    public static RoomFeedCellStruct m5850xf777e67b(WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2, RoomFeedCellStruct roomFeedCellStruct) {
        if (webcastRoomFeedCellStructV2 == null) {
            return roomFeedCellStruct;
        }
        RoomFeedCellStruct roomFeedCellStruct2 = new RoomFeedCellStruct();
        roomFeedCellStruct2.room = m5851x5fb58c07(webcastRoomFeedCellStructV2.room, roomFeedCellStruct2.room);
        roomFeedCellStruct2.type = C1746a.m5871a(webcastRoomFeedCellStructV2.type, roomFeedCellStruct2.type);
        roomFeedCellStruct2.mFansStruct = m5763x43c70f74(webcastRoomFeedCellStructV2.fans_struct, roomFeedCellStruct2.mFansStruct);
        roomFeedCellStruct2.tag = webcastRoomFeedCellStructV2.tag == null ? roomFeedCellStruct2.tag : webcastRoomFeedCellStructV2.tag;
        roomFeedCellStruct2.tagId = C1746a.m5875a(webcastRoomFeedCellStructV2.tag_id, roomFeedCellStruct2.tagId);
        roomFeedCellStruct2.icon = m5835xd6e21675(webcastRoomFeedCellStructV2.icon, roomFeedCellStruct2.icon);
        roomFeedCellStruct2.distance = webcastRoomFeedCellStructV2.distance == null ? roomFeedCellStruct2.distance : webcastRoomFeedCellStructV2.distance;
        roomFeedCellStruct2.newLiveRoomData = C48333g.m91797a(webcastRoomFeedCellStructV2.rawdata, roomFeedCellStruct2.newLiveRoomData);
        return roomFeedCellStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$WebcastRoomStructV2$$com$ss$android$ugc$aweme$feed$model$live$LiveRoomStruct */
    public static LiveRoomStruct m5851x5fb58c07(WebcastRoomStructV2 webcastRoomStructV2, LiveRoomStruct liveRoomStruct) {
        if (webcastRoomStructV2 == null) {
            return liveRoomStruct;
        }
        LiveRoomStruct liveRoomStruct2 = new LiveRoomStruct();
        liveRoomStruct2.f114485id = C1746a.m5875a(webcastRoomStructV2.room_id, liveRoomStruct2.f114485id);
        liveRoomStruct2.status = C1746a.m5871a(webcastRoomStructV2.status, liveRoomStruct2.status);
        liveRoomStruct2.owner = m5840x2fb9c61e(webcastRoomStructV2.owner, liveRoomStruct2.owner);
        liveRoomStruct2.title = webcastRoomStructV2.title == null ? liveRoomStruct2.title : webcastRoomStructV2.title;
        liveRoomStruct2.user_count = C1746a.m5871a(webcastRoomStructV2.user_count, liveRoomStruct2.user_count);
        liveRoomStruct2.create_time = C1746a.m5875a(webcastRoomStructV2.create_time, liveRoomStruct2.create_time);
        liveRoomStruct2.finish_time = C1746a.m5875a(webcastRoomStructV2.finish_time, liveRoomStruct2.finish_time);
        liveRoomStruct2.stream_id = C1746a.m5875a(webcastRoomStructV2.stream_id, liveRoomStruct2.stream_id);
        liveRoomStruct2.stream_url = m5828x6525b8ba(webcastRoomStructV2.stream_url, liveRoomStruct2.stream_url);
        liveRoomStruct2.share_info = m5823x84e4115a(webcastRoomStructV2.share_info, liveRoomStruct2.share_info);
        liveRoomStruct2.digg_count = C1746a.m5871a(webcastRoomStructV2.digg_count, liveRoomStruct2.digg_count);
        liveRoomStruct2.total_user_count = C1746a.m5871a(webcastRoomStructV2.total_user_count, liveRoomStruct2.total_user_count);
        liveRoomStruct2.inSandbox = C1746a.m5877a(webcastRoomStructV2.in_sandbox, liveRoomStruct2.inSandbox);
        liveRoomStruct2.roomCover = m5835xd6e21675(webcastRoomStructV2.room_cover, liveRoomStruct2.roomCover);
        liveRoomStruct2.roomTypeTag = webcastRoomStructV2.room_type_tag == null ? liveRoomStruct2.roomTypeTag : webcastRoomStructV2.room_type_tag;
        liveRoomStruct2.additional_stream_url = m5828x6525b8ba(webcastRoomStructV2.additional_stream_url, liveRoomStruct2.additional_stream_url);
        liveRoomStruct2.liveTypeAudio = C1746a.m5877a(webcastRoomStructV2.live_type_audio, liveRoomStruct2.liveTypeAudio);
        liveRoomStruct2.isThirdParty = C1746a.m5877a(webcastRoomStructV2.live_type_third_party, liveRoomStruct2.isThirdParty);
        liveRoomStruct2.isScreenshot = C1746a.m5877a(webcastRoomStructV2.live_type_screenshot, liveRoomStruct2.isScreenshot);
        liveRoomStruct2.isOfficialType = C1746a.m5877a(webcastRoomStructV2.live_type_official, liveRoomStruct2.isOfficialType);
        liveRoomStruct2.withLinkmic = C1746a.m5877a(webcastRoomStructV2.with_linkmic, liveRoomStruct2.withLinkmic);
        return liveRoomStruct2;
    }

    /* renamed from: com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList */
    public static FeedItemList m5852x2ccced6e(aweme_v2_feed_response aweme_v2_feed_response, FeedItemList feedItemList) {
        if (aweme_v2_feed_response == null) {
            return feedItemList;
        }
        FeedItemList feedItemList2 = new FeedItemList();
        feedItemList2.status_code = C1746a.m5871a(aweme_v2_feed_response.status_code, feedItemList2.status_code);
        feedItemList2.minCursor = C1746a.m5875a(aweme_v2_feed_response.min_cursor, feedItemList2.minCursor);
        feedItemList2.maxCursor = C1746a.m5875a(aweme_v2_feed_response.max_cursor, feedItemList2.maxCursor);
        feedItemList2.hasMore = C1746a.m5871a(aweme_v2_feed_response.has_more, feedItemList2.hasMore);
        feedItemList2.items = m5674x83100197(aweme_v2_feed_response.aweme_list, feedItemList2.items);
        feedItemList2.requestId = aweme_v2_feed_response.rid == null ? feedItemList2.requestId : aweme_v2_feed_response.rid;
        feedItemList2.refreshClear = C1746a.m5871a(aweme_v2_feed_response.refresh_clear, feedItemList2.refreshClear);
        feedItemList2.extra = m5762x7e6bce41(aweme_v2_feed_response.extra, feedItemList2.extra);
        feedItemList2.logPb = m5784x980e63d1(aweme_v2_feed_response.log_pb, feedItemList2.logPb);
        feedItemList2.hotSearchGuideWord = m5767xd7636a61(aweme_v2_feed_response.guide_word, feedItemList2.hotSearchGuideWord);
        feedItemList2.preloadAds = m5674x83100197(aweme_v2_feed_response.preload_ads, feedItemList2.preloadAds);
        feedItemList2.status_msg = aweme_v2_feed_response.status_msg == null ? feedItemList2.status_msg : aweme_v2_feed_response.status_msg;
        feedItemList2.blockCode = C1746a.m5871a(aweme_v2_feed_response.block_code, feedItemList2.blockCode);
        feedItemList2.enableReRank = C1746a.m5877a(aweme_v2_feed_response.enable_re_rank, feedItemList2.enableReRank);
        feedItemList2.disableAdjustForCache = C1746a.m5877a(aweme_v2_feed_response.disable_adjust_for_cache, feedItemList2.disableAdjustForCache);
        feedItemList2.showTimeGapResponse = m5824xa91a9a0b(aweme_v2_feed_response.showtime_gap_rsp_info, feedItemList2.showTimeGapResponse);
        return feedItemList2;
    }

    /* renamed from: tiktok$kids$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics */
    public static AwemeStatistics m5853x74af581d(tiktok.kids.proto.AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatistics awemeStatistics) {
        if (awemeStatisticsStructV2 == null) {
            return awemeStatistics;
        }
        AwemeStatistics awemeStatistics2 = new AwemeStatistics();
        awemeStatistics2.diggCount = C1746a.m5875a(awemeStatisticsStructV2.digg_count, awemeStatistics2.diggCount);
        awemeStatistics2.playCount = C1746a.m5875a(awemeStatisticsStructV2.play_count, awemeStatistics2.playCount);
        awemeStatistics2.loseCount = C1746a.m5871a(awemeStatisticsStructV2.lose_count, awemeStatistics2.loseCount);
        return awemeStatistics2;
    }

    /* renamed from: tiktok$kids$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus */
    public static AwemeStatus m5854x1e3c68fd(tiktok.kids.proto.AwemeStatusStructV2 awemeStatusStructV2, AwemeStatus awemeStatus) {
        if (awemeStatusStructV2 == null) {
            return awemeStatus;
        }
        AwemeStatus awemeStatus2 = new AwemeStatus();
        awemeStatus2.isDelete = C1746a.m5877a(awemeStatusStructV2.is_delete, awemeStatus2.isDelete);
        awemeStatus2.isProhibited = C1746a.m5877a(awemeStatusStructV2.is_prohibited, awemeStatus2.isProhibited);
        return awemeStatus2;
    }

    /* renamed from: tiktok$kids$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme */
    public static Aweme m5855x54f91bfd(tiktok.kids.proto.AwemeStructV2 awemeStructV2, Aweme aweme) {
        if (awemeStructV2 == null) {
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.aid = awemeStructV2.aweme_id == null ? aweme2.aid : awemeStructV2.aweme_id;
        aweme2.createTime = C1746a.m5875a(awemeStructV2.create_time, aweme2.createTime);
        aweme2.author = m5864x82d4b682(awemeStructV2.author, aweme2.author);
        aweme2.music = m5860x83030772(awemeStructV2.music, aweme2.music);
        aweme2.video = m5865x7377c77d(awemeStructV2.video, aweme2.video);
        aweme2.userDigg = C1746a.m5871a(awemeStructV2.user_digged, aweme2.userDigg);
        aweme2.statistics = m5853x74af581d(awemeStructV2.statistics, aweme2.statistics);
        aweme2.status = m5854x1e3c68fd(awemeStructV2.status, aweme2.status);
        aweme2.extra = awemeStructV2.extra == null ? aweme2.extra : awemeStructV2.extra;
        aweme2.isVr = C1746a.m5877a(awemeStructV2.is_vr, aweme2.isVr);
        aweme2.awemeType = C1746a.m5871a(awemeStructV2.aweme_type, aweme2.awemeType);
        aweme2.imageInfos = m5708xbd131c33(awemeStructV2.image_infos, aweme2.imageInfos);
        aweme2.groupId = awemeStructV2.group_id == null ? aweme2.groupId : awemeStructV2.group_id;
        aweme2.longVideos = m5709x5441949f(awemeStructV2.long_video, aweme2.longVideos);
        aweme2.descLanguage = awemeStructV2.desc_language == null ? aweme2.descLanguage : awemeStructV2.desc_language;
        aweme2.takeDownReason = C1746a.m5871a(awemeStructV2.take_down_reason, aweme2.takeDownReason);
        aweme2.takeDownDesc = awemeStructV2.take_down_desc == null ? aweme2.takeDownDesc : awemeStructV2.take_down_desc;
        aweme2.distributeType = C1746a.m5871a(awemeStructV2.distribute_type, aweme2.distributeType);
        return aweme2;
    }

    /* renamed from: tiktok$kids$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate */
    public static BitRate m5856x96e817fd(tiktok.kids.proto.BitRateStructV2 bitRateStructV2, BitRate bitRate) {
        if (bitRateStructV2 == null) {
            return bitRate;
        }
        BitRate bitRate2 = new BitRate();
        bitRate2.gearName = bitRateStructV2.gear_name == null ? bitRate2.gearName : bitRateStructV2.gear_name;
        bitRate2.qualityType = C1746a.m5871a(bitRateStructV2.quality_type, bitRate2.qualityType);
        bitRate2.bitRate = C1746a.m5871a(bitRateStructV2.bit_rate, bitRate2.bitRate);
        bitRate2.playAddr = m5862x29fd06d9(bitRateStructV2.play_addr, bitRate2.playAddr);
        return bitRate2;
    }

    /* renamed from: tiktok$kids$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo */
    public static ImageInfo m5857x29128e3d(tiktok.kids.proto.ImageInfoStructV2 imageInfoStructV2, ImageInfo imageInfo) {
        if (imageInfoStructV2 == null) {
            return imageInfo;
        }
        ImageInfo imageInfo2 = new ImageInfo();
        imageInfo2.height = C1746a.m5871a(imageInfoStructV2.height, imageInfo2.height);
        imageInfo2.width = C1746a.m5871a(imageInfoStructV2.width, imageInfo2.width);
        imageInfo2.labelLarge = m5862x29fd06d9(imageInfoStructV2.label_large, imageInfo2.labelLarge);
        imageInfo2.labelThumb = m5862x29fd06d9(imageInfoStructV2.label_thumb, imageInfo2.labelThumb);
        return imageInfo2;
    }

    /* renamed from: tiktok$kids$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean */
    public static LogPbBean m5858xa3fae8ed(tiktok.kids.proto.LogPbStructV2 logPbStructV2, LogPbBean logPbBean) {
        if (logPbStructV2 == null) {
            return logPbBean;
        }
        LogPbBean logPbBean2 = new LogPbBean();
        logPbBean2.imprId = logPbStructV2.impr_id == null ? logPbBean2.imprId : logPbStructV2.impr_id;
        return logPbBean2;
    }

    /* renamed from: tiktok$kids$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo */
    public static LongVideo m5859x63a5b97d(tiktok.kids.proto.LongVideoStructV2 longVideoStructV2, LongVideo longVideo) {
        if (longVideoStructV2 == null) {
            return longVideo;
        }
        LongVideo longVideo2 = new LongVideo();
        longVideo2.video = m5865x7377c77d(longVideoStructV2.video, longVideo2.video);
        longVideo2.longVideoType = C1746a.m5871a(longVideoStructV2.long_video_type, longVideo2.longVideoType);
        longVideo2.trailerStartTime = C1746a.m5870a(longVideoStructV2.trailer_start_time, longVideo2.trailerStartTime);
        return longVideo2;
    }

    /* renamed from: tiktok$kids$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music */
    public static Music m5860x83030772(tiktok.kids.proto.MusicStructV2 musicStructV2, Music music) {
        if (musicStructV2 == null) {
            return music;
        }
        Music music2 = new Music();
        music2.f138249id = C1746a.m5875a(musicStructV2.f205067id, music2.f138249id);
        music2.idStr = musicStructV2.id_str == null ? music2.idStr : musicStructV2.id_str;
        music2.musicName = musicStructV2.title == null ? music2.musicName : musicStructV2.title;
        music2.authorName = musicStructV2.author == null ? music2.authorName : musicStructV2.author;
        music2.album = musicStructV2.album == null ? music2.album : musicStructV2.album;
        music2.strongBeatUrl = m5862x29fd06d9(musicStructV2.strong_beat_url, music2.strongBeatUrl);
        music2.isArtistMusic = C1746a.m5877a(musicStructV2.is_author_artist, music2.isArtistMusic);
        music2.coverThumb = m5862x29fd06d9(musicStructV2.cover_thumb, music2.coverThumb);
        music2.playUrl = m5862x29fd06d9(musicStructV2.play_url, music2.playUrl);
        music2.duration = C1746a.m5871a(musicStructV2.duration, music2.duration);
        music2.ownerHandle = musicStructV2.owner_handle == null ? music2.ownerHandle : musicStructV2.owner_handle;
        music2.musicStatus = C1746a.m5871a(musicStructV2.status, music2.musicStatus);
        music2.offlineDesc = musicStructV2.offline_desc == null ? music2.offlineDesc : musicStructV2.offline_desc;
        music2.ownerId = musicStructV2.owner_id == null ? music2.ownerId : musicStructV2.owner_id;
        music2.ownerNickName = musicStructV2.owner_nickname == null ? music2.ownerNickName : musicStructV2.owner_nickname;
        music2.isOriginMusic = C1746a.m5877a(musicStructV2.is_original, music2.isOriginMusic);
        music2.isAuthorDeleted = C1746a.m5877a(musicStructV2.author_deleted, music2.isAuthorDeleted);
        return music2;
    }

    /* renamed from: tiktok$kids$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth */
    public static PlayTokenAuth m5861xff2ef4d4(tiktok.kids.proto.PlayTokenAuthStructV2 playTokenAuthStructV2, PlayTokenAuth playTokenAuth) {
        if (playTokenAuthStructV2 == null) {
            return playTokenAuth;
        }
        PlayTokenAuth playTokenAuth2 = new PlayTokenAuth();
        playTokenAuth2.vid = playTokenAuthStructV2.vid == null ? playTokenAuth2.vid : playTokenAuthStructV2.vid;
        playTokenAuth2.token = playTokenAuthStructV2.token == null ? playTokenAuth2.token : playTokenAuthStructV2.token;
        playTokenAuth2.auth = playTokenAuthStructV2.auth == null ? playTokenAuth2.auth : playTokenAuthStructV2.auth;
        playTokenAuth2.hosts = playTokenAuthStructV2.hosts == null ? playTokenAuth2.hosts : playTokenAuthStructV2.hosts;
        return playTokenAuth2;
    }

    /* renamed from: tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel */
    public static UrlModel m5862x29fd06d9(tiktok.kids.proto.UrlStructV2 urlStructV2, UrlModel urlModel) {
        if (urlStructV2 == null) {
            return urlModel;
        }
        UrlModel urlModel2 = new UrlModel();
        urlModel2.uri = urlStructV2.uri == null ? urlModel2.uri : urlStructV2.uri;
        urlModel2.urlList = urlStructV2.url_list == null ? urlModel2.urlList : urlStructV2.url_list;
        urlModel2.width = C1746a.m5871a(urlStructV2.width, urlModel2.width);
        urlModel2.height = C1746a.m5871a(urlStructV2.height, urlModel2.height);
        urlModel2.urlKey = urlStructV2.url_key == null ? urlModel2.urlKey : urlStructV2.url_key;
        urlModel2.size = C1746a.m5875a(urlStructV2.data_size, urlModel2.size);
        urlModel2.fileHash = urlStructV2.file_hash == null ? urlModel2.fileHash : urlStructV2.file_hash;
        return urlModel2;
    }

    /* renamed from: tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel */
    public static VideoUrlModel m5863x73577663(tiktok.kids.proto.UrlStructV2 urlStructV2, VideoUrlModel videoUrlModel) {
        if (urlStructV2 == null) {
            return videoUrlModel;
        }
        VideoUrlModel videoUrlModel2 = new VideoUrlModel();
        videoUrlModel2.uri = urlStructV2.uri == null ? videoUrlModel2.uri : urlStructV2.uri;
        videoUrlModel2.urlList = urlStructV2.url_list == null ? videoUrlModel2.urlList : urlStructV2.url_list;
        videoUrlModel2.width = C1746a.m5871a(urlStructV2.width, videoUrlModel2.width);
        videoUrlModel2.height = C1746a.m5871a(urlStructV2.height, videoUrlModel2.height);
        videoUrlModel2.urlKey = urlStructV2.url_key == null ? videoUrlModel2.urlKey : urlStructV2.url_key;
        videoUrlModel2.size = C1746a.m5875a(urlStructV2.data_size, videoUrlModel2.size);
        videoUrlModel2.fileHash = urlStructV2.file_hash == null ? videoUrlModel2.fileHash : urlStructV2.file_hash;
        videoUrlModel2.fileCheckSum = urlStructV2.file_cs == null ? videoUrlModel2.fileCheckSum : urlStructV2.file_cs;
        return videoUrlModel2;
    }

    /* renamed from: tiktok$kids$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User */
    public static User m5864x82d4b682(tiktok.kids.proto.UserStructV2 userStructV2, User user) {
        if (userStructV2 == null) {
            return user;
        }
        User user2 = new User();
        user2.uid = userStructV2.uid == null ? user2.uid : userStructV2.uid;
        user2.shortId = userStructV2.short_id == null ? user2.shortId : userStructV2.short_id;
        user2.nickname = userStructV2.nickname == null ? user2.nickname : userStructV2.nickname;
        user2.avatarLarger = m5862x29fd06d9(userStructV2.avatar_larger, user2.avatarLarger);
        user2.avatarThumb = m5862x29fd06d9(userStructV2.avatar_thumb, user2.avatarThumb);
        user2.avatarMedium = m5862x29fd06d9(userStructV2.avatar_medium, user2.avatarMedium);
        user2.customVerify = userStructV2.custom_verify == null ? user2.customVerify : userStructV2.custom_verify;
        user2.uniqueId = userStructV2.unique_id == null ? user2.uniqueId : userStructV2.unique_id;
        user2.secUid = userStructV2.sec_uid == null ? user2.secUid : userStructV2.sec_uid;
        user2.region = userStructV2.region == null ? user2.region : userStructV2.region;
        user2.accountRegion = userStructV2.account_region == null ? user2.accountRegion : userStructV2.account_region;
        user2.secret = C1746a.m5878a(userStructV2.secret, user2.secret);
        user2.typeLabels = List$java$lang$Long$$ArrayJ(userStructV2.type_label, user2.typeLabels);
        user2.unique_id_modify_time = C1746a.m5873a(userStructV2.unique_id_modify_time, user2.unique_id_modify_time);
        user2.userCancelled = C1746a.m5877a(userStructV2.user_canceled, user2.userCancelled);
        user2.registerTime = C1746a.m5875a(userStructV2.register_time, user2.registerTime);
        user2.createTime = userStructV2.create_time == null ? user2.createTime : userStructV2.create_time;
        user2.country = userStructV2.country == null ? user2.country : userStructV2.country;
        user2.coverUrls = m5710xf8a3ef57(userStructV2.cover_url, user2.coverUrls);
        user2.isoCountryCode = userStructV2.iso_country_code == null ? user2.isoCountryCode : userStructV2.iso_country_code;
        user2.language = userStructV2.language == null ? user2.language : userStructV2.language;
        user2.remarkName = userStructV2.remark_name == null ? user2.remarkName : userStructV2.remark_name;
        user2.userMode = C1746a.m5871a(userStructV2.user_mode, user2.userMode);
        user2.userPeriod = C1746a.m5871a(userStructV2.user_period, user2.userPeriod);
        user2.isStar = C1746a.m5877a(userStructV2.is_star, user2.isStar);
        return user2;
    }

    /* renamed from: tiktok$kids$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video */
    public static Video m5865x7377c77d(tiktok.kids.proto.VideoStructV2 videoStructV2, Video video) {
        if (videoStructV2 == null) {
            return video;
        }
        Video video2 = new Video();
        video2.playAddr = m5863x73577663(videoStructV2.play_addr, video2.playAddr);
        video2.cover = m5862x29fd06d9(videoStructV2.cover, video2.cover);
        video2.height = C1746a.m5871a(videoStructV2.height, video2.height);
        video2.width = C1746a.m5871a(videoStructV2.width, video2.width);
        video2.dynamicCover = m5862x29fd06d9(videoStructV2.dynamic_cover, video2.dynamicCover);
        video2.originCover = m5862x29fd06d9(videoStructV2.origin_cover, video2.originCover);
        video2.ratio = videoStructV2.ratio == null ? video2.ratio : videoStructV2.ratio;
        video2.bitRate = m5707x5648fbb(videoStructV2.bit_rate, video2.bitRate);
        video2.videoLength = C1746a.m5871a(videoStructV2.duration, video2.videoLength);
        video2.h264PlayAddr = m5863x73577663(videoStructV2.play_addr_h264, video2.h264PlayAddr);
        video2.isLongVideo = C1746a.m5878a(videoStructV2.is_long_video, video2.isLongVideo);
        video2.dVideoModel = videoStructV2.video_model == null ? video2.dVideoModel : videoStructV2.video_model;
        video2.needSetCookie = C1746a.m5877a(videoStructV2.need_set_token, video2.needSetCookie);
        video2.drmTokenAuth = m5861xff2ef4d4(videoStructV2.token_auth, video2.drmTokenAuth);
        video2.playAddrBytevc1 = m5863x73577663(videoStructV2.play_addr_bytevc1, video2.playAddrBytevc1);
        return video2;
    }

    /* renamed from: tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList */
    public static KFeedItemList m5866xaed84a0c(tiktok_v1_kids_feed_response tiktok_v1_kids_feed_response, KFeedItemList kFeedItemList) {
        if (tiktok_v1_kids_feed_response == null) {
            return kFeedItemList;
        }
        KFeedItemList kFeedItemList2 = new KFeedItemList();
        kFeedItemList2.statusCode = C1746a.m5871a(tiktok_v1_kids_feed_response.status_code, kFeedItemList2.statusCode);
        kFeedItemList2.minCursor = C1746a.m5875a(tiktok_v1_kids_feed_response.min_cursor, kFeedItemList2.minCursor);
        kFeedItemList2.maxCursor = C1746a.m5875a(tiktok_v1_kids_feed_response.max_cursor, kFeedItemList2.maxCursor);
        kFeedItemList2.hasMore = C1746a.m5871a(tiktok_v1_kids_feed_response.has_more, kFeedItemList2.hasMore);
        kFeedItemList2.items = m5706x568f37ef(tiktok_v1_kids_feed_response.aweme_list, kFeedItemList2.items);
        kFeedItemList2.requestId = tiktok_v1_kids_feed_response.rid == null ? kFeedItemList2.requestId : tiktok_v1_kids_feed_response.rid;
        kFeedItemList2.refreshClear = C1746a.m5871a(tiktok_v1_kids_feed_response.refresh_clear, kFeedItemList2.refreshClear);
        kFeedItemList2.logPb = m5858xa3fae8ed(tiktok_v1_kids_feed_response.log_pb, kFeedItemList2.logPb);
        kFeedItemList2.blockCode = C1746a.m5871a(tiktok_v1_kids_feed_response.block_code, kFeedItemList2.blockCode);
        kFeedItemList2.statusMsg = tiktok_v1_kids_feed_response.status_msg == null ? kFeedItemList2.statusMsg : tiktok_v1_kids_feed_response.status_msg;
        return kFeedItemList2;
    }
}
