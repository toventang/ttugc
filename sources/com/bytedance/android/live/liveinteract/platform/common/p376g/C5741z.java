package com.bytedance.android.live.liveinteract.platform.common.p376g;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.z */
public final class C5741z {

    /* renamed from: a */
    public static long f14563a;

    /* renamed from: b */
    public static String f14564b;

    /* renamed from: c */
    public static String f14565c;

    /* renamed from: d */
    public static final C5741z f14566d = new C5741z();

    /* renamed from: e */
    private static long f14567e;

    /* renamed from: f */
    private static String f14568f;

    private C5741z() {
    }

    static {
        Covode.recordClassIndex(6339);
    }

    /* renamed from: a */
    public static Map<String, String> m12605a() {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            C89219l.m154716b(idStr, "");
            hashMap.put("room_id", idStr);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            hashMap.put("user_id", String.valueOf(b.mo13161c()));
            hashMap.put("live_room_mode", String.valueOf(room.liveRoomMode));
            hashMap.put("enter_method", C6544e.m13990d());
            hashMap.put("enter_from_merge", C6544e.m13987a());
            hashMap.put("action_type", C6544e.m13991e());
        }
        hashMap.put("guest_cnt", String.valueOf(C6894d.m14753a().f17273t));
        return hashMap;
    }

    /* renamed from: a */
    public static void m12606a(String str) {
        if (str == null) {
            f14565c = null;
        } else if (!C89219l.m154714a((Object) f14565c, (Object) "live_over")) {
            f14565c = str;
        }
    }

    /* renamed from: b */
    public static void m12608b(String str) {
        if (str == null) {
            f14568f = null;
        } else if (!C89219l.m154714a((Object) f14568f, (Object) "live_over")) {
            f14568f = str;
        }
    }

    /* renamed from: c */
    public static final void m12609c(String str) {
        int i;
        f14567e = SystemClock.uptimeMillis();
        Map<String, String> a = m12605a();
        if (str == null) {
            str = "connection_start";
        }
        a.put("trigger", str);
        m12608b(null);
        C5586a.m12137a(a, C5586a.m12139b());
        C5271a aVar = C5586a.f14225a;
        if (aVar != null) {
            i = aVar.f13641l;
        } else {
            i = 0;
        }
        a.put("guest_cnt", String.valueOf(i));
        m12607a("livesdk_guest_connection_status_view_start", a);
    }

    /* renamed from: d */
    public static final void m12610d(String str) {
        if (f14567e > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - f14567e;
            Map<String, String> a = m12605a();
            if (str == null && (str = f14568f) == null) {
                str = "live_over";
            }
            a.put("trigger", str);
            m12608b(null);
            C5586a.m12137a(a, C5586a.m12143c());
            a.put("duration", String.valueOf(uptimeMillis));
            m12607a("livesdk_guest_connection_status_view_duration", a);
            f14567e = 0;
        }
    }

    /* renamed from: a */
    public static void m12607a(String str, Map<String, String> map) {
        C6501b.C6502a.m13948a(str).mo12639a().mo12652a(map).mo12655b();
    }
}
