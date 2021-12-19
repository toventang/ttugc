package com.bytedance.android.live.liveinteract.multilive.p359b;

import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
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
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.b.a */
public final class C5586a {

    /* renamed from: a */
    public static C5271a f14225a;

    /* renamed from: b */
    public static final C5586a f14226b = new C5586a();

    /* renamed from: c */
    private static EnumC4422k f14227c = EnumC4422k.NORMAL;

    /* renamed from: d */
    private static long f14228d;

    /* renamed from: e */
    private static EnumC4422k f14229e = EnumC4422k.NORMAL;

    /* renamed from: f */
    private static long f14230f;

    private C5586a() {
    }

    /* renamed from: a */
    public static void m12136a(Map<String, String> map) {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            C89219l.m154716b(idStr, "");
            map.put("room_id", idStr);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            map.put("user_id", String.valueOf(b.mo13161c()));
            map.put("enter_method", C6544e.m13990d());
            map.put("enter_from_merge", C6544e.m13987a());
            map.put("action_type", C6544e.m13991e());
            C5271a aVar = f14225a;
            EnumC4422k kVar = aVar != null ? aVar.f13646q : null;
            map.put("layout_setting", m12128a(kVar).getFirst());
            map.put("window_setting", m12128a(kVar).getSecond());
            String requestId = room.getRequestId();
            if (requestId != null) {
                map.put("request_id", requestId);
            }
        }
        C5271a aVar2 = f14225a;
        map.put("guest_cnt", String.valueOf(aVar2 != null ? aVar2.f13636g : 0));
    }

    /* renamed from: a */
    public static void m12137a(Map<String, String> map, EnumC4422k kVar) {
        C89219l.m154721d(map, "");
        map.put("layout_setting", m12128a(kVar).getFirst());
        map.put("window_setting", m12128a(kVar).getSecond());
        C5271a aVar = f14225a;
        map.put("guest_cnt", String.valueOf(aVar != null ? aVar.f13636g : 0));
    }

    /* renamed from: a */
    public static boolean m12138a() {
        C5271a aVar = f14225a;
        EnumC4422k kVar = aVar != null ? aVar.f13646q : null;
        return kVar == EnumC4422k.GRID_FIX || kVar == EnumC4422k.FLOATING_FIX || kVar == EnumC4422k.GRID || kVar == EnumC4422k.FLOATING;
    }

    /* renamed from: b */
    public static EnumC4422k m12139b() {
        C5271a aVar = f14225a;
        if (aVar != null) {
            return aVar.f13646q;
        }
        return null;
    }

    /* renamed from: c */
    public static EnumC4422k m12143c() {
        C5271a aVar = f14225a;
        if (aVar != null) {
            return aVar.f13645p;
        }
        return null;
    }

    static {
        Covode.recordClassIndex(6183);
    }

    /* renamed from: a */
    public static void m12130a(String str) {
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        m12136a(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("way_of_open", str);
        m12135a("livesdk_layoutsettings_open", hashMap);
    }

    /* renamed from: b */
    public static void m12140b(String str) {
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        m12136a(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", str);
        m12135a("livesdk_layoutwindowsettings_switch", hashMap);
    }

    /* renamed from: a */
    public static C89378p<String, String> m12128a(EnumC4422k kVar) {
        if (kVar != null) {
            int i = C5587b.f14231a[kVar.ordinal()];
            if (i == 1) {
                return C89387v.m154943a("floating", "fixed");
            }
            if (i == 2) {
                return C89387v.m154943a("floating", "unfixed");
            }
            if (i == 3) {
                return C89387v.m154943a("grid", "fixed");
            }
            if (i == 4) {
                return C89387v.m154943a("grid", "unfixed");
            }
        }
        return C89387v.m154943a("normal_floating", "not_existed");
    }

    /* renamed from: c */
    public static void m12144c(String str) {
        C89219l.m154721d(str, "");
        if (f14229e != null) {
            HashMap hashMap = new HashMap();
            m12136a(hashMap);
            hashMap.put("trigger", str);
            EnumC4422k kVar = f14229e;
            f14229e = null;
            hashMap.put("layout_setting", m12128a(kVar).getFirst());
            hashMap.put("window_setting", m12128a(kVar).getSecond());
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - f14230f));
            m12135a("livesdk_multilive_mode_connection_duration", hashMap);
            if (kVar != f14227c) {
                m12141b(str, kVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r4 != null) goto L_0x0026;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m12131a(java.lang.String r3, com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k r4) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            com.bytedance.android.live.liveinteract.api.b.k r0 = com.bytedance.android.live.liveinteract.multilive.p359b.C5586a.f14227c
            if (r4 != r0) goto L_0x000a
            return
        L_0x000a:
            if (r0 == 0) goto L_0x000f
            m12141b(r3, r0)
        L_0x000f:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            m12136a(r2)
            java.lang.String r0 = "trigger"
            r2.put(r0, r3)
            if (r4 != 0) goto L_0x0026
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a r0 = com.bytedance.android.live.liveinteract.multilive.p359b.C5586a.f14225a
            if (r0 == 0) goto L_0x004e
            com.bytedance.android.live.liveinteract.api.b.k r4 = r0.f13646q
        L_0x0024:
            if (r4 == 0) goto L_0x0028
        L_0x0026:
            com.bytedance.android.live.liveinteract.multilive.p359b.C5586a.f14227c = r4
        L_0x0028:
            h.p r0 = m12128a(r4)
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r0 = "layout_setting"
            r2.put(r0, r1)
            h.p r0 = m12128a(r4)
            java.lang.Object r1 = r0.getSecond()
            java.lang.String r0 = "window_setting"
            r2.put(r0, r1)
            java.lang.String r0 = "livesdk_multilive_mode_watch_start"
            m12135a(r0, r2)
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.android.live.liveinteract.multilive.p359b.C5586a.f14228d = r0
            return
        L_0x004e:
            r4 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.p359b.C5586a.m12131a(java.lang.String, com.bytedance.android.live.liveinteract.api.b.k):void");
    }

    /* renamed from: b */
    public static void m12141b(String str, EnumC4422k kVar) {
        C89219l.m154721d(str, "");
        if (f14227c != null) {
            HashMap hashMap = new HashMap();
            m12136a(hashMap);
            if ((!C89219l.m154714a((Object) str, (Object) "live_over")) && (!C89219l.m154714a((Object) str, (Object) "manual_setting_switch")) && (!C89219l.m154714a((Object) str, (Object) "connection_start"))) {
                str = "others";
            }
            hashMap.put("trigger", str);
            if (kVar == null) {
                kVar = f14227c;
            }
            f14227c = null;
            hashMap.put("layout_setting", m12128a(kVar).getFirst());
            hashMap.put("window_setting", m12128a(kVar).getSecond());
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - f14228d));
            m12135a("livesdk_multilive_mode_watch_duration", hashMap);
        }
    }

    /* renamed from: a */
    private void m12132a(String str, Integer num) {
        EnumC4422k kVar;
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        m12136a(hashMap);
        hashMap.put("trigger", str);
        C5271a aVar = f14225a;
        if (aVar != null) {
            kVar = aVar.f13646q;
            if (kVar != null) {
                f14229e = kVar;
            }
        } else {
            kVar = null;
        }
        hashMap.put("layout_setting", m12128a(kVar).getFirst());
        hashMap.put("window_setting", m12128a(kVar).getSecond());
        if (num != null) {
            hashMap.put("guest_cnt", String.valueOf(num.intValue()));
        }
        m12135a("livesdk_multilive_mode_connection_start", hashMap);
        f14230f = System.currentTimeMillis();
        m12131a(str, kVar);
    }

    /* renamed from: a */
    public static void m12133a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        HashMap hashMap = new HashMap();
        m12136a(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", str);
        hashMap.put("decision", str2);
        m12135a("livesdk_layoutwindowsettings_confirm", hashMap);
    }

    /* renamed from: a */
    public static void m12135a(String str, Map<String, String> map) {
        C6501b.C6502a.m13948a(str).mo12639a().mo12652a(map).mo12655b();
    }

    /* renamed from: a */
    public static void m12134a(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        HashMap hashMap = new HashMap();
        m12136a(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", str);
        hashMap.put("way_of_switch", str2);
        hashMap.put("is_success", String.valueOf(i));
        m12135a("livesdk_camera_on_and_off", hashMap);
    }

    /* renamed from: a */
    public static /* synthetic */ void m12129a(C5586a aVar, String str, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        aVar.m12132a(str, num);
    }
}
