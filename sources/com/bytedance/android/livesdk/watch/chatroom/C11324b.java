package com.bytedance.android.livesdk.watch.chatroom;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.p428c.C6520a;
import com.bytedance.android.livesdk.p425aa.p428c.C6523c;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.watch.chatroom.b */
public final class C11324b {

    /* renamed from: a */
    public static final C11324b f27073a = new C11324b();

    private C11324b() {
    }

    static {
        Covode.recordClassIndex(12963);
    }

    /* renamed from: a */
    private static String m20077a(Room room) {
        if (room.isLiveTypeAudio()) {
            return "audio_live";
        }
        return "video_type";
    }

    /* renamed from: b */
    private static String m20080b(Room room) {
        FollowInfo followInfo;
        User owner = room.getOwner();
        if (owner == null || (followInfo = owner.getFollowInfo()) == null) {
            return "0";
        }
        long followStatus = followInfo.getFollowStatus();
        if (followStatus == 1 || followStatus == 2) {
            return "1";
        }
        return "0";
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20078a(com.bytedance.android.livesdkapi.depend.model.live.Room r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.watch.chatroom.C11324b.m20078a(com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m20079a(LinkedHashMap<String, String> linkedHashMap, Room room, String str, String str2, String str3) {
        String str4;
        C6520a aVar;
        String str5;
        C6523c cVar;
        String str6;
        C89219l.m154721d(linkedHashMap, "");
        C89219l.m154721d(room, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        if (room.isLiveTypeAudio()) {
            str4 = "audio_live";
        } else {
            str4 = "video_live";
        }
        linkedHashMap.put("live_type", str4);
        String str7 = "1";
        linkedHashMap.put("growth_deepevent", str7);
        linkedHashMap.put("live_window_mode", "");
        C6529h hVar = (C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class);
        if (!(hVar == null || (cVar = hVar.f16312d) == null || (str6 = cVar.f16266d) == null)) {
            linkedHashMap.put("live_window_mode", str6);
        }
        if (!TextUtils.isEmpty(str3)) {
            linkedHashMap.put("request_page", str3);
        }
        linkedHashMap.put("room_type", m20077a(room));
        linkedHashMap.put("action_type", "click");
        C6529h hVar2 = (C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class);
        if (!(hVar2 == null || (aVar = hVar2.f16313e) == null || (str5 = aVar.f16208n) == null)) {
            linkedHashMap.put("action_type", str5);
        }
        String requestId = room.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        linkedHashMap.put("request_id", requestId);
        User owner = room.getOwner();
        C89219l.m154716b(owner, "");
        FollowInfo followInfo = owner.getFollowInfo();
        C89219l.m154716b(followInfo, "");
        linkedHashMap.put("follow_status", String.valueOf(followInfo.getFollowStatus()));
        linkedHashMap.put("is_fans", m20080b(room));
        User owner2 = room.getOwner();
        C89219l.m154716b(owner2, "");
        linkedHashMap.put("anchor_id", String.valueOf(owner2.getId()));
        User owner3 = room.getOwner();
        C89219l.m154716b(owner3, "");
        linkedHashMap.put("to_user_id", String.valueOf(owner3.getId()));
        linkedHashMap.put("room_id", String.valueOf(room.getId()));
        try {
            C7411d a = C7411d.m15284a();
            C89219l.m154716b(a, "");
            String e = a.mo13614e();
            C89219l.m154716b(e, "");
            linkedHashMap.put("enter_live_method", e);
        } catch (Exception unused) {
            linkedHashMap.put("enter_live_method", "");
        }
        linkedHashMap.put("enter_from_merge", str);
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        linkedHashMap.put("live_reason", "");
        String str8 = "homepage_hot";
        if (!C89219l.m154714a((Object) str, (Object) str8)) {
            if (C6544e.m13987a().length() > 0) {
                str8 = C6544e.m13987a();
            }
            linkedHashMap.put("enter_from_merge", str8);
        } else {
            linkedHashMap.put("enter_from_merge", str8);
        }
        C11870f fVar = C11870f.C11871a.f28404a;
        C89219l.m154716b(fVar, "");
        EnterRoomLinkSession a2 = fVar.mo19010a();
        C89219l.m154716b(a2, "");
        if (!a2.f28391b.f28233c.f28342aw) {
            str7 = "0";
        }
        linkedHashMap.put("is_return", str7);
    }
}
