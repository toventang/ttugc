package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AbstractC9519af;
import com.bytedance.android.livesdk.model.C9521ah;
import com.bytedance.android.livesdk.model.C9526ak;
import com.bytedance.android.livesdk.model.C9532ap;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.android.livesdk.model.C9540ax;
import com.bytedance.android.livesdk.model.C9903s;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.ShortTouchItem;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.utils.C9913b;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class Room implements AbstractC9519af {
    @AbstractC27891c(mo46611a = "anchor_share_text")
    String anchorShareText;
    @AbstractC27891c(mo46611a = "anchor_tab_type")
    long anchorTabType;
    @AbstractC27891c(mo46611a = "answering_question_content")
    String answeringQuestion;
    public String authenticationValue = "";
    @AbstractC27891c(mo46611a = "ba_link_info")
    BALinkStruct baLinkStruct;
    @AbstractC27891c(mo46611a = "background")
    public ImageModel background;
    @AbstractC27891c(mo46611a = "client_version")
    String clientVersion;
    @AbstractC27891c(mo46611a = "commerce_info")
    CommerceStruct commerceStruct;
    @AbstractC27891c(mo46611a = "cover")
    ImageModel cover;
    @AbstractC27891c(mo46611a = "create_time")
    long createTime;
    @AbstractC27891c(mo46611a = "deco_list")
    List<C9537au> decorationList;
    @AbstractC27891c(mo46611a = "dynamic_cover")
    ImageModel dynamicCover;
    @AbstractC27891c(mo46611a = "dynamic_cover_low")
    ImageModel dynamicCoverLow;
    @AbstractC27891c(mo46611a = "feed_room_label")
    ImageModel feedRoomLabel;
    @AbstractC27891c(mo46611a = "feed_room_labels")
    List<FeedRoomLabel> feedRoomLabelList;
    @AbstractC27891c(mo46611a = "filter_msg_rules")
    public List<C11726g> filterRule;
    @AbstractC27891c(mo46611a = "finish_time")
    long finishTime;
    @AbstractC27891c(mo46611a = "finish_url_v2")
    public String finishUrlLynx;
    @AbstractC27891c(mo46611a = "finish_url")
    public String finish_url;
    @AbstractC27891c(mo46611a = "game_category")
    public C9903s gameCategoryInfo;
    @AbstractC27891c(mo46611a = "gift_msg_style")
    public int giftMessageStyle;
    @AbstractC27891c(mo46611a = "has_commerce_goods")
    public boolean hasCommerceGoods;
    @AbstractC27891c(mo46611a = "hashtag")
    public Hashtag hashtag;
    @AbstractC27891c(mo46611a = "have_wishlist")
    public boolean haveWishList;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    long f27942id;
    @AbstractC27891c(mo46611a = "id_str")
    String idStr;
    public boolean isDouPlusPromotion;
    public boolean isFromRecommendCard;
    private transient boolean isOfficialChannel;
    @AbstractC27891c(mo46611a = "live_type_screenshot")
    public boolean isScreenshot;
    @AbstractC27891c(mo46611a = "live_type_third_party")
    public boolean isThirdParty;
    @AbstractC27891c(mo46611a = "common_label_list")
    String labels;
    @AbstractC27891c(mo46611a = "layout")
    public long layout;
    @AbstractC27891c(mo46611a = "like_count")
    public long likeCount;
    @AbstractC27891c(mo46611a = "like_info")
    public C9521ah likeInfo;
    @AbstractC27891c(mo46611a = "link_mic")
    C11735p linkMicInfoGson;
    private transient int linkmicLayout;
    @AbstractC27891c(mo46611a = "live_event_info")
    public C9526ak liveEventInfo;
    @AbstractC27891c(mo46611a = "live_room_mode")
    public int liveRoomMode;
    @AbstractC27891c(mo46611a = "live_type_audio")
    boolean liveTypeAudio;
    private String logPb;
    @AbstractC27891c(mo46611a = "boost_status")
    public C11727h mBoostCardRoomStatus;
    @AbstractC27891c(mo46611a = "comment_name_mode")
    public int mNameMode;
    private String mRequestId;
    @AbstractC27891c(mo46611a = "room_auth")
    public RoomAuthStatus mRoomAuthStatus;
    private long mUserFrom;
    @AbstractC27891c(mo46611a = "mask_layer")
    public MaskLayer maskLayer;
    @AbstractC27891c(mo46611a = "message")
    public String message;
    @AbstractC27891c(mo46611a = "mosaic_status")
    int mosaicStatus;
    public long nowTime;
    @AbstractC27891c(mo46611a = "official_channel")
    public C9532ap officialChannelInfo;
    @AbstractC27891c(mo46611a = "orientation")
    int orientation;
    @AbstractC27891c(mo46611a = "owner")
    User owner;
    @AbstractC27891c(mo46611a = "owner_user_id")
    long ownerUserId;
    @AbstractC27891c(mo46611a = "os_type")
    int platform;
    @AbstractC27891c(mo46611a = "prompts")
    public String prompts;
    @AbstractC27891c(mo46611a = "interaction_question_version")
    public int questionVersion;
    @AbstractC27891c(mo46611a = "room_layout")
    public int roomLayout;
    private String roomOrientation;
    @AbstractC27891c(mo46611a = "share_url")
    String shareUrl;
    @AbstractC27891c(mo46611a = "short_touch_items")
    public List<ShortTouchItem> shortTouchItems;
    @AbstractC27891c(mo46611a = "source_type")
    String sourceType;
    @AbstractC27891c(mo46611a = "stats")
    RoomStats stats;
    @AbstractC27891c(mo46611a = "status")
    int status;
    @AbstractC27891c(mo46611a = "sticker_list")
    List<C9537au> stickerList;
    @AbstractC27891c(mo46611a = "stream_cover")
    ImageModel streamCover;
    @AbstractC27891c(mo46611a = "stream_id")
    long streamId;
    @AbstractC27891c(mo46611a = "stream_url")
    StreamUrl streamUrl;
    @AbstractC27891c(mo46611a = "title")
    String title;
    @AbstractC27891c(mo46611a = "top_fans")
    List<C9540ax> topFanTickets;
    @AbstractC27891c(mo46611a = "use_filter")
    public boolean unusedEffect;
    @AbstractC27891c(mo46611a = "user_count")
    int userCount;
    @AbstractC27891c(mo46611a = "user_share_text")
    String userShareText;
    @AbstractC27891c(mo46611a = "warning_tag")
    public WarningTag warningTag;
    @AbstractC27891c(mo46611a = "with_linkmic")
    boolean withLinkMic;

    static {
        Covode.recordClassIndex(13371);
    }

    public List<Object> getDislikeReason() {
        return null;
    }

    public String getVideoUrl() {
        return "";
    }

    public String subtitle() {
        return "";
    }

    public AbstractC2994b author() {
        return this.owner;
    }

    public ImageModel cover() {
        return this.cover;
    }

    public String getAnchorShareText() {
        return this.anchorShareText;
    }

    public long getAnchorTabType() {
        return this.anchorTabType;
    }

    public String getAnsweringQuestion() {
        return this.answeringQuestion;
    }

    public BALinkStruct getBALinkStruct() {
        return this.baLinkStruct;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public CommerceStruct getCommerceStruct() {
        return this.commerceStruct;
    }

    public ImageModel getCover() {
        return this.cover;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public List<C9537au> getDecorationList() {
        return this.decorationList;
    }

    public ImageModel getDynamicCover() {
        return this.dynamicCover;
    }

    public ImageModel getDynamicCoverLow() {
        return this.dynamicCoverLow;
    }

    public ImageModel getFeedRoomLabel() {
        return this.feedRoomLabel;
    }

    public List<FeedRoomLabel> getFeedRoomLabelList() {
        return this.feedRoomLabelList;
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public Hashtag getHashtag() {
        return this.hashtag;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9519af
    public long getId() {
        return this.f27942id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLikeCount() {
        return this.likeCount;
    }

    public C11735p getLinkMicInfo() {
        return this.linkMicInfoGson;
    }

    public int getLinkmicLayout() {
        return this.linkmicLayout;
    }

    public String getLog_pb() {
        return this.logPb;
    }

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public int getNameMode() {
        return this.mNameMode;
    }

    public C9532ap getOfficialChannelInfo() {
        return this.officialChannelInfo;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public User getOwner() {
        return this.owner;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public RoomAuthStatus getRoomAuthStatus() {
        return this.mRoomAuthStatus;
    }

    public int getRoomLayout() {
        return this.roomLayout;
    }

    public String getRoomOrientation() {
        return this.roomOrientation;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public RoomStats getStats() {
        return this.stats;
    }

    public int getStatus() {
        return this.status;
    }

    public List<C9537au> getStickerList() {
        return this.stickerList;
    }

    public ImageModel getStreamCover() {
        return this.streamCover;
    }

    public long getStreamId() {
        return this.streamId;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public List<C9540ax> getTopFanTickets() {
        return this.topFanTickets;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public String getUserShareText() {
        return this.userShareText;
    }

    public boolean hasCommerceGoods() {
        return this.hasCommerceGoods;
    }

    public boolean isLiveTypeAudio() {
        return this.liveTypeAudio;
    }

    public boolean isOfficialChannel() {
        return this.isOfficialChannel;
    }

    public boolean isUnusedEffect() {
        return this.unusedEffect;
    }

    public boolean isWithLinkMic() {
        return this.withLinkMic;
    }

    public String title() {
        return this.title;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9519af
    public String getMixId() {
        return String.valueOf(this.f27942id);
    }

    public boolean isMediaRoom() {
        if (this.roomLayout == 1) {
            return true;
        }
        return false;
    }

    public String buildPullUrl() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return buildPullUrl(streamUrl2.f27964r);
    }

    public String getSdkParams() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return getSdkParams(streamUrl2.f27964r);
    }

    public C11738s.C11739a getStreamSrConfig() {
        C11738s streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return null;
        }
        return streamUrlExtra.f28106n;
    }

    public C11738s getStreamUrlExtra() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return streamUrl2.f27958l;
    }

    public C11738s getStreamUrlExtraSafely() {
        C11738s streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new C11738s();
        }
        return streamUrlExtra;
    }

    public boolean isKoiRoom() {
        if (this.layout == 3) {
            return true;
        }
        return false;
    }

    public boolean isOfficial() {
        if (this.layout == 1) {
            return true;
        }
        return false;
    }

    public boolean isStar() {
        if (this.layout == 2) {
            return true;
        }
        return false;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || streamUrl2.f27961o == null || this.streamUrl.f27961o.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.f27961o.getDefaultQuality().sdkKey;
    }

    public void init() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 != null) {
            streamUrl2.mo18683b();
            if (this.streamUrl.f27961o != null) {
                this.streamUrl.mo18684c();
            }
        }
    }

    public boolean isMultiPullDataValid() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (!(streamUrl2 == null || streamUrl2.f27961o == null)) {
            streamUrl2.mo18684c();
            if (!streamUrl2.qualityList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPullUrlValid() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return false;
        }
        streamUrl2.mo18683b();
        if (!streamUrl2.qualityMap.isEmpty()) {
            return true;
        }
        return false;
    }

    public String getMultiStreamData() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || streamUrl2.f27961o == null || this.streamUrl.f27961o.getPullData() == null) {
            return null;
        }
        return this.streamUrl.f27961o.getPullData().getStreamData();
    }

    public EnumC11728i getStreamType() {
        if (this.layout == 1) {
            return EnumC11728i.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return EnumC11728i.SCREEN_RECORD;
        }
        if (this.isThirdParty) {
            return EnumC11728i.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return EnumC11728i.AUDIO;
        }
        return EnumC11728i.VIDEO;
    }

    public String toString() {
        super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("roomid:").append(this.idStr).append(" ; \n");
        sb.append("RoomAuthStatus info: ");
        sb.append(this.mRoomAuthStatus.toString());
        return sb.toString();
    }

    public void setAnchorShareText(String str) {
        this.anchorShareText = str;
    }

    public void setAnchorTabType(long j) {
        this.anchorTabType = j;
    }

    public void setAnsweringQuestion(String str) {
        this.answeringQuestion = str;
    }

    public void setBALinkStruct(BALinkStruct bALinkStruct) {
        this.baLinkStruct = bALinkStruct;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setCommerceStruct(CommerceStruct commerceStruct2) {
        this.commerceStruct = commerceStruct2;
    }

    @AbstractC27891c(mo46611a = "cover")
    public void setCover(ImageModel imageModel) {
        this.cover = imageModel;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDecorationList(List<C9537au> list) {
        this.decorationList = list;
    }

    public void setDynamicCover(ImageModel imageModel) {
        this.dynamicCover = imageModel;
    }

    public void setDynamicCoverLow(ImageModel imageModel) {
        this.dynamicCoverLow = imageModel;
    }

    public void setFeedRoomLabel(ImageModel imageModel) {
        this.feedRoomLabel = imageModel;
    }

    public void setFinishTime(long j) {
        this.finishTime = j;
    }

    public void setHashtag(Hashtag hashtag2) {
        this.hashtag = hashtag2;
    }

    public void setId(long j) {
        this.f27942id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLikeCount(int i) {
        this.likeCount = (long) i;
    }

    public void setLiveTypeAudio(boolean z) {
        this.liveTypeAudio = z;
    }

    public void setLog_pb(String str) {
        this.logPb = str;
    }

    public void setMosaicStatus(int i) {
        this.mosaicStatus = i;
    }

    public void setOfficialChannel(boolean z) {
        this.isOfficialChannel = z;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwner(User user) {
        this.owner = user;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setRoomAuthStatus(RoomAuthStatus roomAuthStatus) {
        this.mRoomAuthStatus = roomAuthStatus;
    }

    public void setRoomOrientation(String str) {
        this.roomOrientation = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setStats(RoomStats roomStats) {
        this.stats = roomStats;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStickerList(List<C9537au> list) {
        this.stickerList = list;
    }

    public void setStreamCover(ImageModel imageModel) {
        this.streamCover = imageModel;
    }

    public void setStreamId(long j) {
        this.streamId = j;
    }

    @AbstractC27891c(mo46611a = "stream_url")
    public void setStreamUrl(StreamUrl streamUrl2) {
        this.streamUrl = streamUrl2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopFanTickets(List<C9540ax> list) {
        this.topFanTickets = list;
    }

    public void setUnusedEffect(boolean z) {
        this.unusedEffect = z;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }

    public void setUserShareText(String str) {
        this.userShareText = str;
    }

    public void setWithLinkMic(boolean z) {
        this.withLinkMic = z;
    }

    public static boolean isValid(Room room) {
        if (room == null || room.getId() <= 0 || room.getOwner() == null) {
            return false;
        }
        return true;
    }

    public String getSdkParams(String str) {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return streamUrl2.sdkParamsMap.get(str);
    }

    public String buildPullUrl(String str) {
        String str2;
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || (str2 = streamUrl2.qualityMap.get(str)) == null) {
            return null;
        }
        C9913b bVar = new C9913b(str2);
        bVar.mo16612a("anchor_device_platform", this.platform);
        bVar.mo16614a("anchor_version", this.clientVersion);
        bVar.mo16613a("room_id", this.f27942id);
        bVar.mo16613a("anchor_id", this.ownerUserId);
        return bVar.mo16611a();
    }
}
