package com.bytedance.android.livesdk.p425aa.p427b;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.aa.b.g */
public final class C6515g implements AbstractC6508b<Room> {
    static {
        Covode.recordClassIndex(7251);
    }

    /* renamed from: a */
    public static void m13960a(Map<String, String> map, Room room) {
        if (room != null) {
            m13961b(map, room);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.p425aa.p427b.AbstractC6508b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12666a(Map map, Room room) {
        m13960a((Map<String, String>) map, room);
    }

    /* renamed from: b */
    private static void m13961b(Map<String, String> map, Room room) {
        String str;
        String str2;
        String str3;
        if (room != null) {
            if (room.getId() != 0) {
                map.put("room_id", String.valueOf(room.getId()));
            }
            map.put("orientation", String.valueOf(room.getOrientation()));
            String str4 = "1";
            if (room.hasCommerceGoods) {
                str = str4;
            } else {
                str = "0";
            }
            map.put("is_sale", str);
            if (room.liveEventInfo != null) {
                map.put("live_event_id", String.valueOf(room.liveEventInfo.f23117a));
                if (room.liveEventInfo.f23122f.booleanValue()) {
                    str3 = str4;
                } else {
                    str3 = "0";
                }
                map.put("is_registered", str3);
                if (room.liveEventInfo.f23123g.booleanValue()) {
                    str4 = "0";
                }
                map.put("is_free_event", str4);
            }
            if (!TextUtils.isEmpty(room.getRequestId())) {
                map.put("request_id", room.getRequestId());
            }
            if (!TextUtils.isEmpty(room.getLog_pb())) {
                map.put("log_pb", room.getLog_pb());
            } else {
                map.remove("log_pb");
            }
            if (room.getOwner() != null) {
                map.put("anchor_id", String.valueOf(room.getOwner().getId()));
                if (room.getOwner().getFollowInfo() != null) {
                    map.put("follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
                }
            } else {
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            if (!TextUtils.isEmpty(room.getSourceType())) {
                map.put("moment_room_source", room.getSourceType());
            }
            map.put("live_type", C11729j.m20684a(room.getStreamType()));
            map.put("room_orientation", String.valueOf(room.getRoomOrientation()));
            if (room.hashtag != null) {
                if (TextUtils.isEmpty(room.hashtag.title)) {
                    str2 = "none";
                } else {
                    str2 = room.hashtag.title;
                }
                map.put("hashtag_id", String.valueOf(room.hashtag.f23083id));
                map.put("hashtag_type", str2);
            }
        }
    }
}
