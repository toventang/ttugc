package com.bytedance.android.live.liveinteract.platform.common.p376g;

import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.o */
public final class C5720o {

    /* renamed from: a */
    public static final C5720o f14511a = new C5720o();

    /* renamed from: b */
    private static String f14512b = "";

    private C5720o() {
    }

    static {
        Covode.recordClassIndex(6318);
    }

    /* renamed from: a */
    public static final void m12575a(String str) {
        C89219l.m154721d(str, "");
        f14512b = str;
    }

    /* renamed from: a */
    private static void m12577a(Map<String, String> map) {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            C89219l.m154716b(idStr, "");
            map.put("room_id", idStr);
            map.put("enter_method", C6544e.m13990d());
            map.put("enter_from_merge", C6544e.m13987a());
            map.put("action_type", C6544e.m13991e());
        }
    }

    /* renamed from: a */
    private static void m12576a(String str, Map<String, String> map) {
        C6501b.C6502a.m13948a(str).mo12639a().mo12652a(map).mo12655b();
    }

    /* renamed from: a */
    public static final void m12573a(int i, EnumC4422k kVar) {
        HashMap hashMap = new HashMap();
        m12577a(hashMap);
        hashMap.put("enter_from", f14512b);
        hashMap.put("guest_cnt", String.valueOf(i));
        hashMap.put("layout_setting", C5586a.m12128a(kVar).getFirst());
        hashMap.put("window_setting", C5586a.m12128a(kVar).getSecond());
        m12576a("livesdk_anchor_guest_connection_invite_list_show", hashMap);
    }

    /* renamed from: a */
    public static final void m12574a(long j, EnumC4422k kVar) {
        HashMap hashMap = new HashMap();
        m12577a(hashMap);
        hashMap.put("enter_from", f14512b);
        hashMap.put("guest_id", String.valueOf(j));
        hashMap.put("layout_setting", C5586a.m12128a(kVar).getFirst());
        hashMap.put("window_setting", C5586a.m12128a(kVar).getSecond());
        m12576a("livesdk_anchor_guest_connection_invite_show", hashMap);
    }
}
