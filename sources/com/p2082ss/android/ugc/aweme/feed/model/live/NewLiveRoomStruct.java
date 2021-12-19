package com.p2082ss.android.ugc.aweme.feed.model.live;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.p2082ss.android.ugc.aweme.live.C58589b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct */
public class NewLiveRoomStruct extends AbstractC34479a implements AbstractC33623d, Serializable {
    @AbstractC27891c(mo46611a = "auto_cover")
    public long autoCover;
    private Challenge challenge;
    @AbstractC27891c(mo46611a = "challenge_info")
    public String challengeInfo;
    @AbstractC27891c(mo46611a = "client_version")
    String clientVersion;
    @AbstractC27891c(mo46611a = "commerce_info")
    CommerceStruct commerceStruct;
    @AbstractC27891c(mo46611a = "content_label")
    public LiveImageModel contentLabel;
    @AbstractC27891c(mo46611a = "content_tag")
    public String contentTag;
    @AbstractC27891c(mo46611a = "disable_preload_stream")
    public boolean disablePrePullStream;
    public String errorMsg;
    @AbstractC27891c(mo46611a = "fyp_room_tags")
    public FeedRoomTagList feedRoomTagList;
    @AbstractC27891c(mo46611a = "has_commerce_goods")
    public boolean hasCommerceGoods;
    @AbstractC27891c(mo46611a = "room_id", mo46612b = {"id"})

    /* renamed from: id */
    public long f114488id;
    @AbstractC27891c(mo46611a = "live_type_official")
    public boolean isOfficialType;
    @AbstractC27891c(mo46611a = "live_type_screenshot")
    public boolean isScreenshot;
    @AbstractC27891c(mo46611a = "live_type_third_party")
    public boolean isThirdParty;
    @AbstractC27890b(mo46609a = RawStringJsonAdapter.class)
    @AbstractC27891c(mo46611a = "link_mic")
    public String linkMic;
    @AbstractC27891c(mo46611a = "linkmic_layout")
    public long linkMicLayout;
    @AbstractC27891c(mo46611a = "live_event_info")
    public LiveEventInfo liveEventInfo;
    @AbstractC27891c(mo46611a = "live_reason")
    public String liveReason;
    @AbstractC27891c(mo46611a = "live_type_audio")
    public boolean liveTypeAudio;
    private String mRequestId;
    private long mUserFrom;
    @AbstractC27891c(mo46611a = "mask_layer")
    public MaskLayer maskLayer;
    public String message;
    @AbstractC27891c(mo46611a = "operation_label")
    public LiveImageModel operationLabel;
    @AbstractC27891c(mo46611a = "owner")
    public LiveUser owner;
    @AbstractC27891c(mo46611a = "owner_user_id")
    public long ownerUserId;
    @AbstractC27891c(mo46611a = "os_type")
    int platform;
    public String prompts;
    @AbstractC27891c(mo46611a = "room_cover", mo46612b = {"cover"})
    public UrlModel roomCover;
    @AbstractC27891c(mo46611a = "room_layout")
    public int roomLayout;
    @AbstractC27891c(mo46611a = "stats")
    public RoomStas roomStas;
    public int roomType = 3;
    @AbstractC27891c(mo46611a = "status")
    public int status;
    public int status_code;
    public String status_msg;
    @AbstractC27891c(mo46611a = "stream_url")
    public LiveStreamUrl stream_url;
    @AbstractC27891c(mo46611a = "title")
    public String title;
    @AbstractC27891c(mo46611a = "tv")
    public TVStationRoomStruct tvStationRoomStruct;
    public long userId;
    @AbstractC27891c(mo46611a = "user_count")
    public int user_count;
    @AbstractC27891c(mo46611a = "video_feed_tag")
    public String videoFeedTag;
    @AbstractC27891c(mo46611a = "warning_tag")
    public WarningTag warningTag;
    @AbstractC27891c(mo46611a = "with_linkmic")
    public boolean withLinkmic;

    static {
        Covode.recordClassIndex(58808);
    }

    public String getChallengeInfo() {
        return this.challengeInfo;
    }

    public LiveImageModel getContentLabel() {
        return this.contentLabel;
    }

    public String getContentTag() {
        return this.contentTag;
    }

    public LiveImageModel getOperationLabel() {
        return this.operationLabel;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.mRequestId;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public boolean getAutoCover() {
        if (this.autoCover == 1) {
            return true;
        }
        return false;
    }

    public String getSdkParams() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null) {
            return null;
        }
        return getSdkParams(liveStreamUrl.defaultQualityName);
    }

    public LiveStreamUrlExtra getStreamUrlExtra() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null) {
            return null;
        }
        return liveStreamUrl.getExtra();
    }

    public LiveStreamUrlExtra getStreamUrlExtraSafely() {
        LiveStreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new LiveStreamUrlExtra();
        }
        return streamUrlExtra;
    }

    public boolean isFinish() {
        if (this.status == 4) {
            return true;
        }
        return false;
    }

    public boolean isPullUrlValid() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null || TextUtils.isEmpty(liveStreamUrl.rtmp_pull_url)) {
            return false;
        }
        return true;
    }

    public Challenge getChallenge() {
        try {
            if (this.challenge == null) {
                this.challenge = (Challenge) C58589b.m107696a().mo46670a(this.challengeInfo, Challenge.class);
            }
            return this.challenge;
        } catch (Exception unused) {
            return null;
        }
    }

    public void init() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl != null) {
            liveStreamUrl.validatePullUrl();
            if (this.stream_url.getLiveCoreSDKData() != null) {
                this.stream_url.validateMultiPullData();
            }
        }
    }

    public String getMultiStreamData() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null || liveStreamUrl.getLiveCoreSDKData() == null || this.stream_url.getLiveCoreSDKData().getPullData() == null) {
            return null;
        }
        return this.stream_url.getLiveCoreSDKData().getPullData().getStreamData();
    }

    public String getMultiStreamDefaultPreviewQualitySdkKey() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null || liveStreamUrl.getLiveCoreSDKData() == null || this.stream_url.getLiveCoreSDKData().getDefaultPreviewQuality() == null) {
            return null;
        }
        return this.stream_url.getLiveCoreSDKData().getDefaultPreviewQuality().sdkKey;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null || liveStreamUrl.getLiveCoreSDKData() == null || this.stream_url.getLiveCoreSDKData().getDefaultQuality() == null) {
            return null;
        }
        return this.stream_url.getLiveCoreSDKData().getDefaultQuality().sdkKey;
    }

    public LiveRoomStruct roomStructConstructor() {
        LiveRoomStruct liveRoomStruct = new LiveRoomStruct();
        StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl != null) {
            streamUrlStruct.liveCoreSDKData = liveStreamUrl.liveCoreSDKData;
            streamUrlStruct.liveStreamUrlExtra = getStreamUrlExtraSafely();
            streamUrlStruct.mCandidateResolutionList = this.stream_url.candidateResolution;
            streamUrlStruct.mDefaultResolution = this.stream_url.defaultResolution;
            streamUrlStruct.mFlvPullUrlMap = this.stream_url.flvPullUrl;
            streamUrlStruct.provider = this.stream_url.provider;
            streamUrlStruct.rtmp_pull_url = this.stream_url.rtmp_pull_url;
            streamUrlStruct.rtmp_push_url = this.stream_url.rtmp_push_url;
            streamUrlStruct.sid = this.stream_url.f114486id;
            streamUrlStruct.sdkParams = getSdkParams();
        }
        User user = new User();
        LiveUser liveUser = this.owner;
        if (liveUser != null) {
            user.setUid(String.valueOf(liveUser.f114487id));
            user.setSecUid(this.owner.secUid);
            user.setShortId(String.valueOf(this.owner.shortId));
            user.setNickname(this.owner.nickname);
            user.setAvatarLarger(this.owner.avatarLarger);
            user.setAvatarMedium(this.owner.avatarMedium);
            user.setAvatarThumb(this.owner.avatarThumb);
            if (this.owner.followInfo != null) {
                user.setFollowStatus((int) this.owner.followInfo.followStatus);
            }
            user.setUniqueId(this.owner.uniqueId);
        }
        RoomStas roomStas2 = this.roomStas;
        if (roomStas2 != null) {
            liveRoomStruct.total_user = roomStas2.totalUser;
        }
        liveRoomStruct.f114485id = this.f114488id;
        liveRoomStruct.status = this.status;
        liveRoomStruct.owner = user;
        liveRoomStruct.title = this.title;
        liveRoomStruct.user_count = this.user_count;
        liveRoomStruct.roomCover = this.roomCover;
        liveRoomStruct.liveTypeAudio = this.liveTypeAudio;
        liveRoomStruct.isThirdParty = this.isThirdParty;
        liveRoomStruct.isScreenshot = this.isScreenshot;
        liveRoomStruct.isOfficialType = this.isOfficialType;
        liveRoomStruct.ownerUserId = this.ownerUserId;
        liveRoomStruct.videoFeedTag = this.videoFeedTag;
        liveRoomStruct.liveReason = this.liveReason;
        liveRoomStruct.withLinkmic = this.withLinkmic;
        liveRoomStruct.stream_url = streamUrlStruct;
        liveRoomStruct.clientVersion = this.clientVersion;
        liveRoomStruct.platform = this.platform;
        liveRoomStruct.tvStationRoomStruct = this.tvStationRoomStruct;
        liveRoomStruct.challengeInfo = this.challengeInfo;
        liveRoomStruct.roomLayout = this.roomLayout;
        liveRoomStruct.contentLabel = this.contentLabel;
        liveRoomStruct.operationLabel = this.operationLabel;
        liveRoomStruct.contentTag = this.contentTag;
        liveRoomStruct.linkMicLayout = this.linkMicLayout;
        liveRoomStruct.autoCover = this.autoCover;
        liveRoomStruct.disablePrePullStream = this.disablePrePullStream;
        liveRoomStruct.liveEventInfo = this.liveEventInfo;
        liveRoomStruct.linkMic = this.linkMic;
        liveRoomStruct.warningTag = this.warningTag;
        liveRoomStruct.maskLayer = this.maskLayer;
        liveRoomStruct.commerceStruct = this.commerceStruct;
        liveRoomStruct.hasCommerceGoods = this.hasCommerceGoods;
        liveRoomStruct.feedRoomTagList = this.feedRoomTagList;
        return liveRoomStruct;
    }

    public String toString() {
        return "NewLiveRoomStruct{mUserFrom=" + this.mUserFrom + ", mRequestId='" + this.mRequestId + '\'' + ", status_code=" + this.status_code + ", message='" + this.message + '\'' + ", status_msg='" + this.status_msg + '\'' + ", prompts='" + this.prompts + '\'' + ", userId=" + this.userId + ", roomType=" + this.roomType + ", id=" + this.f114488id + ", status=" + this.status + ", owner=" + this.owner + ", title='" + this.title + '\'' + ", user_count=" + this.user_count + ", roomCover=" + this.roomCover + ", liveTypeAudio=" + this.liveTypeAudio + ", isThirdParty=" + this.isThirdParty + ", isScreenshot=" + this.isScreenshot + ", isOfficialType=" + this.isOfficialType + ", ownerUserId=" + this.ownerUserId + ", videoFeedTag='" + this.videoFeedTag + '\'' + ", withLinkmic=" + this.withLinkmic + ", stream_url=" + this.stream_url + ", clientVersion='" + this.clientVersion + '\'' + ", platform=" + this.platform + ", tvStationRoomStruct=" + this.tvStationRoomStruct + ", errorMsg='" + this.errorMsg + '\'' + ", autoCover='" + this.autoCover + '\'' + '}';
    }

    public void setChallengeInfo(String str) {
        this.challengeInfo = str;
    }

    public void setContentLabel(LiveImageModel liveImageModel) {
        this.contentLabel = liveImageModel;
    }

    public void setContentTag(String str) {
        this.contentTag = str;
    }

    public void setOperationLabel(LiveImageModel liveImageModel) {
        this.operationLabel = liveImageModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }

    public static boolean isValid(NewLiveRoomStruct newLiveRoomStruct) {
        if (newLiveRoomStruct == null || newLiveRoomStruct.f114488id <= 0 || newLiveRoomStruct.owner == null) {
            return false;
        }
        return true;
    }

    public String getSdkParams(String str) {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null) {
            return null;
        }
        return liveStreamUrl.sdkParamsMap.get(str);
    }
}
