package com.p2082ss.android.ugc.aweme.follow.presenter;

import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.RoomStruct */
public class RoomStruct extends LiveRoomStruct {
    static {
        Covode.recordClassIndex(60272);
    }

    public static EnumC11728i getStreamType(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct.isScreenshot) {
            return EnumC11728i.SCREEN_RECORD;
        }
        if (liveRoomStruct.isThirdParty) {
            return EnumC11728i.THIRD_PARTY;
        }
        if (liveRoomStruct.liveTypeAudio) {
            return EnumC11728i.AUDIO;
        }
        return EnumC11728i.VIDEO;
    }

    public static EnumC11728i getStreamType(NewLiveRoomStruct newLiveRoomStruct) {
        if (newLiveRoomStruct.isScreenshot) {
            return EnumC11728i.SCREEN_RECORD;
        }
        if (newLiveRoomStruct.isThirdParty) {
            return EnumC11728i.THIRD_PARTY;
        }
        if (newLiveRoomStruct.liveTypeAudio) {
            return EnumC11728i.AUDIO;
        }
        return EnumC11728i.VIDEO;
    }

    public static RoomStruct fromAweme(Aweme aweme) {
        UrlModel avatarThumb;
        RoomStruct roomStruct = new RoomStruct();
        roomStruct.owner = aweme.getAuthor();
        if (roomStruct.owner != null) {
            roomStruct.f114485id = roomStruct.owner.roomId;
        }
        if (aweme.getRoom() != null) {
            roomStruct.f114485id = aweme.getRoom().roomId;
            roomStruct.tvStationRoomStruct = aweme.getRoom().tvStationRoomStruct;
        }
        if (aweme.getAuthor() != null) {
            if (aweme.getAuthor().roomCover != null) {
                avatarThumb = aweme.getAuthor().roomCover;
            } else {
                avatarThumb = aweme.getAuthor().getAvatarThumb();
            }
            roomStruct.roomCover = avatarThumb;
        }
        if (aweme.getStreamUrlModel() != null) {
            roomStruct.stream_url = new StreamUrlStruct();
            roomStruct.stream_url.rtmp_pull_url = aweme.getStreamUrlModel().rtmpPullUrl;
        }
        roomStruct.isOfficialType = false;
        roomStruct.isScreenshot = false;
        roomStruct.isThirdParty = false;
        roomStruct.liveTypeAudio = false;
        if (aweme.getVideoFeedTag() != null) {
            roomStruct.videoFeedTag = aweme.getVideoFeedTag();
        }
        return roomStruct;
    }
}
