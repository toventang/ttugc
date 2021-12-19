package com.bytedance.android.live.liveinteract.platform.common.p376g;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.f */
public final class C5711f {

    /* renamed from: a */
    public static long f14473a;

    /* renamed from: b */
    public static final HashMap<Long, String> f14474b = new HashMap<>();

    /* renamed from: c */
    public static final C5711f f14475c = new C5711f();

    private C5711f() {
    }

    static {
        Covode.recordClassIndex(6309);
    }

    /* renamed from: a */
    private static String m12495a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1143858661) {
            if (hashCode == 0 && str.equals("")) {
                return "guest_apply_anchor";
            }
            return "anchor_invite_guest";
        } else if (str.equals("liveEnd&turnOff")) {
            return "";
        } else {
            return "anchor_invite_guest";
        }
    }

    /* renamed from: a */
    public static void m12496a(String str, long j, long j2, EnumC4422k kVar, String str2) {
        AbstractC2994b bVar;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            bVar = b.mo13147a();
        } else {
            bVar = null;
        }
        if (room == null) {
            throw new IllegalStateException("Required value was null.".toString());
        } else if (bVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("channel_id", String.valueOf(room.getId()));
            hashMap.put("duration", String.valueOf((System.currentTimeMillis() - f14473a) / 1000));
            hashMap.put("live_type", "video_live");
            hashMap.put("connection_over_type", str);
            if (j2 >= 0) {
                hashMap.put("anchor_relationship", String.valueOf(j2));
            }
            hashMap.put("enter_method", C6544e.m13990d());
            hashMap.put("enter_from_merge", C6544e.m13987a());
            hashMap.put("action_type", C6544e.m13991e());
            hashMap.put("layout_setting", C5586a.m12128a(kVar).getFirst());
            hashMap.put("window_setting", C5586a.m12128a(kVar).getSecond());
            hashMap.put("guest_invite_type", m12495a(str2));
            if (C89219l.m154714a((Object) str2, (Object) "liveEnd&turnOff")) {
                str2 = "";
            }
            hashMap.put("enter_from", str2);
            hashMap.put("guest_id", String.valueOf(j));
            C6501b.C6502a.m13948a("livesdk_anchor_guest_connection_over").mo12652a((Map<String, String>) hashMap).mo12655b();
        } else {
            try {
                throw new IllegalStateException("Required value was null.".toString());
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m12497a(String str, long j, long j2, EnumC4422k kVar, String str2, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = -1;
        }
        if ((i & 16) != 0) {
            str2 = "liveEnd&turnOff";
        }
        m12496a(str, j, j2, kVar, str2);
    }
}
