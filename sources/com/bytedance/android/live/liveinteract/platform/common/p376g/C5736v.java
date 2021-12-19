package com.bytedance.android.live.liveinteract.platform.common.p376g;

import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.v */
public final class C5736v extends C5708d {

    /* renamed from: a */
    public static final String f14551a = C6542d.m13984a("ttlive_client_linkmic_anchor_connect_status");

    /* renamed from: b */
    public static final C5736v f14552b = new C5736v();

    /* renamed from: c */
    private static final String f14553c = C6542d.m13985b("ttlive_client_linkmic_anchor_connect_status");

    /* renamed from: d */
    private static final String f14554d = C6542d.m13984a("ttlive_client_guest_link_status");

    /* renamed from: e */
    private static final String f14555e = C6542d.m13985b("ttlive_client_guest_link_status");

    /* renamed from: f */
    private static final String f14556f = "ttlive_client_anchor_link_icon_monitor";

    private C5736v() {
    }

    static {
        Covode.recordClassIndex(6334);
    }

    /* renamed from: a */
    public static void m12587a() {
        String str;
        long j;
        JSONObject jSONObject = new JSONObject();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        long j2 = 0;
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C3866a.m9475a(jSONObject, "room_id", str);
        C3866a.m9474a(jSONObject, "anchor_id", j);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            j2 = b.mo13161c();
        }
        C3866a.m9474a(jSONObject, "current_user_id", j2);
        C3868c.m9492a("ttlive_linkmic_anchor_no_show_entrance_with_no_byte_plugin", 0, jSONObject);
    }

    /* renamed from: b */
    public static final void m12593b() {
        String str;
        long j;
        JSONObject jSONObject = new JSONObject();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        long j2 = 0;
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C3866a.m9475a(jSONObject, "room_id", str);
        C3866a.m9474a(jSONObject, "anchor_id", j);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            j2 = b.mo13161c();
        }
        C3866a.m9474a(jSONObject, "current_user_id", j2);
        C3868c.m9492a("ttlive_linkmic_audience_no_show_entrance_with_no_byte_plugin", 0, jSONObject);
    }

    /* renamed from: f */
    private static final void m12597f(JSONObject jSONObject) {
        C3868c.m9492a(f14556f, 0, jSONObject);
    }

    /* renamed from: d */
    public static final void m12595d(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        C3868c.m9497b(f14554d, 0, jSONObject);
    }

    /* renamed from: e */
    public static final void m12596e(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        C3868c.m9497b(f14554d, 1, jSONObject);
        C3868c.m9492a(f14555e, 1, jSONObject);
    }

    /* renamed from: a */
    public static final void m12592a(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        C3868c.m9497b(f14551a, 1, jSONObject);
        C3868c.m9492a(f14553c, 1, jSONObject);
    }

    /* renamed from: a */
    public static final void m12588a(int i, String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        m12481a(i, false, jSONObject);
        C3866a.m9475a(jSONObject, "sei", str);
        C3868c.m9492a("ttlive_client_linkmic_audience_sei", 0, jSONObject);
    }

    /* renamed from: b */
    public static final void m12594b(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "icon_type", j);
        C3866a.m9475a(jSONObject, "event_id", "link_icon_show");
        C3866a.m9474a(jSONObject, "permission_status", j2);
        m12482a((Throwable) null, jSONObject);
        m12597f(jSONObject);
    }

    /* renamed from: a */
    public static final void m12590a(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "icon_type", j);
        C3866a.m9475a(jSONObject, "show_error_type", "bundle");
        C3866a.m9475a(jSONObject, "event_id", "link_icon_show_error");
        C3866a.m9474a(jSONObject, "permission_status", j2);
        m12482a((Throwable) null, jSONObject);
        m12597f(jSONObject);
    }

    /* renamed from: a */
    public static final void m12591a(String str, Throwable th) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "show_error_type", "permission");
        C3866a.m9475a(jSONObject, "event_id", "link_icon_show_error");
        C3866a.m9475a(jSONObject, "permission_type", str);
        m12482a(th, jSONObject);
        m12597f(jSONObject);
    }

    /* renamed from: a */
    public static final void m12589a(int i, String str, int i2, String str2) {
        C89219l.m154721d(str2, "");
        JSONObject jSONObject = new JSONObject();
        m12481a(i, true, jSONObject);
        C3866a.m9475a(jSONObject, "sei", str2);
        if (str == null) {
            str = "";
        }
        C3866a.m9475a(jSONObject, "link_mic_id", str);
        C3866a.m9474a(jSONObject, "region_size", (long) i2);
        C3868c.m9492a("ttlive_client_linkmic_anchor_sei", 0, jSONObject);
    }
}
