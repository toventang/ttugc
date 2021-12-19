package com.bytedance.android.livesdk.service.p625c.p632g;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.service.c.g.a */
public final class C10752a {
    static {
        Covode.recordClassIndex(12349);
    }

    /* renamed from: a */
    public static void m19347a(Throwable th) {
        HashMap hashMap = new HashMap();
        User user = (User) C11115u.m19743a().mo17915b().mo13147a();
        if (user != null) {
            hashMap.put("user_id", Long.valueOf(user.getId()));
        }
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", Long.valueOf(room.getId()));
        }
        if (th != null) {
            if (th instanceof C2908a) {
                hashMap.put("error_code", Integer.valueOf(((C2908a) th).getErrorCode()));
            } else {
                hashMap.put("error_code", 0);
            }
            hashMap.put("error_msg", th.getMessage());
        }
        if (room != null && room.getRoomAuthStatus() != null && !room.getRoomAuthStatus().isEnableGift()) {
            C3868c.m9489a(C6542d.m13984a("ttlive_gift_disable_but_sent"), 1, 0, hashMap);
            C3868c.m9491a(C6542d.m13985b("ttlive_gift_disable_but_sent"), 1, hashMap);
            C6499a.m13906a();
            C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_gift_disable_but_sent", hashMap);
        }
    }

    /* renamed from: a */
    public static void m19348a(Map<String, Object> map) {
        map.put("enter_from_merge", C6544e.m13987a());
        map.put("enter_method", C6544e.m13990d());
        map.put("action_type", C6544e.m13991e());
        map.put("video_id", C6544e.m13992f());
        map.put("anchor_id", Long.valueOf(C6544e.m13994h()));
        map.put("room_id", Long.valueOf(C6544e.m13995i()));
        map.put("log_pb", C6544e.m13996j());
        map.put("request_id", C6544e.m13997k());
        map.put("user_id", String.valueOf(C11115u.m19743a().mo17915b().mo13161c()));
    }

    /* renamed from: a */
    public static void m19345a(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("gift_icon_url", str);
        C3868c.m9491a(C6542d.m13984a("ttlive_gift_icon_load_status"), 0, hashMap);
    }

    /* renamed from: a */
    public static void m19344a(long j, long j2, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
        }
        if (th instanceof C2908a) {
            hashMap.put("error_code", Integer.valueOf(((C2908a) th).getErrorCode()));
        } else {
            hashMap.put("error_code", 0);
        }
        if (th != null) {
            hashMap.put("error_msg", th.getMessage());
        }
        C3868c.m9489a(C6542d.m13984a("ttlive_gift_send_status"), 1, 0, hashMap);
        C3868c.m9491a(C6542d.m13985b("ttlive_gift_send_status"), 1, hashMap);
        C6499a.m13906a();
        C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_gift_send_status", hashMap);
    }

    /* renamed from: a */
    public static void m19346a(long j, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("gift_icon_url", str);
        hashMap.put("error_msg", str2);
        C3868c.m9491a(C6542d.m13984a("ttlive_gift_icon_load_status"), 1, hashMap);
        C3868c.m9491a(C6542d.m13985b("ttlive_gift_icon_load_status"), 1, hashMap);
        C6499a.m13906a();
        C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_gift_icon_load_status", hashMap);
    }

    /* renamed from: a */
    public static void m19343a(long j, long j2, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        m19348a(hashMap);
        if (str2 != null) {
            hashMap.put("live_type", str2);
        }
        hashMap.put("event_module", "bottom_tab");
        if (C13627m.m24498a(str)) {
            str = "direct_gift_tab";
        }
        hashMap.put("gift_enter_from", str);
        C3868c.m9489a(C6542d.m13984a("ttlive_gift_send_status"), 0, j2, hashMap);
    }

    /* renamed from: a */
    public static void m19342a(long j, int i, long j2, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_id", Long.valueOf(j));
        hashMap.put("asset_type", Integer.valueOf(i));
        hashMap.put("download_assets_from", Long.valueOf(j2));
        hashMap.put("error_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str);
        C3868c.m9491a(C6542d.m13984a("ttlive_gift_asset_download_status"), 1, hashMap);
        C3868c.m9491a(C6542d.m13985b("ttlive_gift_asset_download_status"), 1, hashMap);
        C6499a.m13906a();
        C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_gift_asset_download_status", hashMap);
    }
}
