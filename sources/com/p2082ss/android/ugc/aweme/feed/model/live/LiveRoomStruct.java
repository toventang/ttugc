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

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct */
public class LiveRoomStruct extends AbstractC34479a implements AbstractC33623d, Serializable {
    @AbstractC27891c(mo46611a = "additional_stream_url")
    public StreamUrlStruct additional_stream_url;
    public long autoCover;
    public Challenge challenge;
    @AbstractC27891c(mo46611a = "challenge_info")
    public String challengeInfo;
    @AbstractC27891c(mo46611a = "client_version")
    public String clientVersion;
    @AbstractC27891c(mo46611a = "coins")
    public int coins;
    @AbstractC27891c(mo46611a = "commerce_info")
    public CommerceStruct commerceStruct;
    @AbstractC27891c(mo46611a = "content_label")
    public LiveImageModel contentLabel;
    @AbstractC27891c(mo46611a = "content_tag")
    public String contentTag;
    @AbstractC27891c(mo46611a = "create_time")
    public long create_time;
    @AbstractC27891c(mo46611a = "digg_count")
    public int digg_count;
    @AbstractC27891c(mo46611a = "disable_preload_stream")
    public boolean disablePrePullStream;
    @AbstractC27891c(mo46611a = "distance")
    public String distance;
    public String errorMsg;
    @AbstractC27891c(mo46611a = "fyp_room_tags")
    public FeedRoomTagList feedRoomTagList;
    @AbstractC27891c(mo46611a = "finish_time")
    public long finish_time;
    public int fromInnerPush;
    @AbstractC27891c(mo46611a = "has_commerce_goods")
    public boolean hasCommerceGoods;
    @AbstractC27891c(mo46611a = "room_id", mo46612b = {"id"})

    /* renamed from: id */
    public long f114485id;
    @AbstractC27891c(mo46611a = "in_sandbox")
    public boolean inSandbox;
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
    @AbstractC27891c(mo46611a = "live_total_time")
    public long liveTotalTime;
    @AbstractC27891c(mo46611a = "live_type_audio")
    public boolean liveTypeAudio;
    public String mRequestId;
    public long mUserFrom;
    @AbstractC27891c(mo46611a = "mask_layer")
    public MaskLayer maskLayer;
    public String message;
    @AbstractC27891c(mo46611a = "new_fans_count")
    public int newFansCount;
    @AbstractC27891c(mo46611a = "operation_label")
    public LiveImageModel operationLabel;
    @AbstractC27891c(mo46611a = "owner")
    public User owner;
    @AbstractC27891c(mo46611a = "owner_user_id")
    public long ownerUserId;
    @AbstractC27891c(mo46611a = "os_type")
    public int platform;
    public String prompts;
    @AbstractC27891c(mo46611a = "activity")
    public RoomBuilding roomActivity;
    @AbstractC27891c(mo46611a = "room_cover", mo46612b = {"cover"})
    public UrlModel roomCover;
    @AbstractC27891c(mo46611a = "room_layout")
    public int roomLayout;
    public int roomType = 3;
    @AbstractC27891c(mo46611a = "room_type_tag")
    public String roomTypeTag;
    @AbstractC27891c(mo46611a = "share_info")
    public ShareStruct share_info;
    @AbstractC27891c(mo46611a = "status")
    public int status;
    public int status_code;
    public String status_msg;
    @AbstractC27891c(mo46611a = "stream_id")
    public long stream_id;
    @AbstractC27891c(mo46611a = "stream_url")
    public StreamUrlStruct stream_url;
    @AbstractC27891c(mo46611a = "title")
    public String title;
    @AbstractC27891c(mo46611a = "total_user")
    public int total_user;
    @AbstractC27891c(mo46611a = "total_user_count")
    public int total_user_count;
    @AbstractC27891c(mo46611a = "tv_station_room")
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
        Covode.recordClassIndex(58802);
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

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public boolean isMediaRoom() {
        if (this.roomLayout == 1) {
            return true;
        }
        return false;
    }

    public LiveStreamUrlExtra getStreamUrlExtra() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null) {
            return null;
        }
        return streamUrlStruct.liveStreamUrlExtra;
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
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url)) {
            return false;
        }
        return true;
    }

    public long getAnchorId() {
        User user = this.owner;
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return 0;
        }
        return Long.parseLong(this.owner.getUid());
    }

    public Challenge getChallenge() {
        try {
            Challenge challenge2 = this.challenge;
            if (challenge2 != null) {
                return challenge2;
            }
            Challenge awemeChallenge = ((LiveChallenge) C58589b.m107696a().mo46670a(this.challengeInfo, LiveChallenge.class)).toAwemeChallenge();
            this.challenge = awemeChallenge;
            return awemeChallenge;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getMultiStreamDefaultPreviewQualitySdkKey() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || streamUrlStruct.liveCoreSDKData == null || this.stream_url.liveCoreSDKData.getDefaultPreviewQuality() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getDefaultPreviewQuality().sdkKey;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || streamUrlStruct.liveCoreSDKData == null || this.stream_url.liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public String getMultiStreamData() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || streamUrlStruct.liveCoreSDKData == null || this.stream_url.liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getPullData().getStreamData();
    }

    public String toString() {
        return "LiveRoomStruct{mUserFrom=" + this.mUserFrom + ", mRequestId='" + this.mRequestId + '\'' + ", status_code=" + this.status_code + ", message='" + this.message + '\'' + ", status_msg='" + this.status_msg + '\'' + ", prompts='" + this.prompts + '\'' + ", userId=" + this.userId + ", roomType=" + this.roomType + ", id=" + this.f114485id + ", status=" + this.status + ", owner=" + this.owner + ", title='" + this.title + '\'' + ", user_count=" + this.user_count + ", create_time=" + this.create_time + ", finish_time=" + this.finish_time + ", stream_id=" + this.stream_id + ", additional_stream_url=" + this.additional_stream_url + ", share_info=" + this.share_info + ", digg_count=" + this.digg_count + ", coins=" + this.coins + ", inSandbox=" + this.inSandbox + ", total_user_count=" + this.total_user_count + ", roomActivity=" + this.roomActivity + ", roomCover=" + this.roomCover + ", roomTypeTag='" + this.roomTypeTag + '\'' + ", newFansCount=" + this.newFansCount + ", liveTypeAudio=" + this.liveTypeAudio + ", isThirdParty=" + this.isThirdParty + ", isScreenshot=" + this.isScreenshot + ", isOfficialType=" + this.isOfficialType + ", liveTotalTime=" + this.liveTotalTime + ", ownerUserId=" + this.ownerUserId + ", videoFeedTag='" + this.videoFeedTag + '\'' + ", withLinkmic=" + this.withLinkmic + ", distance='" + this.distance + '\'' + ", stream_url=" + this.stream_url + ", clientVersion='" + this.clientVersion + '\'' + ", platform=" + this.platform + ", errorMsg='" + this.errorMsg + '\'' + '}';
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

    public static boolean isValid(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct == null || liveRoomStruct.f114485id <= 0 || liveRoomStruct.owner == null) {
            return false;
        }
        return true;
    }
}
