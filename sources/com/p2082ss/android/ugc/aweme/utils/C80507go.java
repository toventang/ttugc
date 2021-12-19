package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.p2082ss.android.ugc.aweme.follow.presenter.RoomStruct;

/* renamed from: com.ss.android.ugc.aweme.utils.go */
public final class C80507go {
    static {
        Covode.recordClassIndex(93780);
    }

    /* renamed from: a */
    public static RoomStruct m139523a(Room room) {
        boolean z;
        if (room == null) {
            return null;
        }
        RoomStruct roomStruct = new RoomStruct();
        roomStruct.f114485id = room.getId();
        roomStruct.ownerUserId = room.getOwnerUserId();
        StreamUrlStruct a = m139522a(room.getStreamUrl(), room.getMultiStreamDefaultQualitySdkKey());
        if (a == null) {
            return null;
        }
        roomStruct.stream_url = a;
        roomStruct.isThirdParty = room.isThirdParty;
        roomStruct.isScreenshot = room.isScreenshot;
        if (room.getStreamType() == EnumC11728i.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        roomStruct.liveTypeAudio = z;
        return roomStruct;
    }

    /* renamed from: a */
    private static String m139524a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return C28024q.m56139a(str).mo46789j().mo46807f("data").mo46807f("origin").mo46807f("main").mo46803c("flv").mo46689c();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static StreamUrlStruct m139522a(StreamUrl streamUrl, String str) {
        LiveCoreSDKData liveCoreSDKData;
        if (streamUrl == null) {
            return null;
        }
        StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
        streamUrlStruct.sid = streamUrl.f27947a;
        streamUrlStruct.provider = streamUrl.f27949c;
        streamUrlStruct.rtmp_push_url = streamUrl.mo18682a();
        streamUrlStruct.rtmp_pull_url = streamUrl.f27952f;
        if (!(!TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url) || (liveCoreSDKData = streamUrl.f27961o) == null || liveCoreSDKData.getPullData() == null)) {
            streamUrlStruct.rtmp_pull_url = m139524a(liveCoreSDKData.getPullData().getStreamData());
        }
        if (TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url)) {
            return null;
        }
        streamUrlStruct.mDefaultResolution = str;
        return streamUrlStruct;
    }
}
