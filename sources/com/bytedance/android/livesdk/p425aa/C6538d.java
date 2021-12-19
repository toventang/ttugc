package com.bytedance.android.livesdk.p425aa;

import com.bytedance.android.livesdk.p425aa.p428c.C6520a;
import com.bytedance.android.livesdk.p425aa.p428c.C6523c;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: com.bytedance.android.livesdk.aa.d */
public final class C6538d {

    /* renamed from: a */
    public static final C6538d f16336a = new C6538d();

    private C6538d() {
    }

    static {
        Covode.recordClassIndex(7274);
    }

    /* renamed from: b */
    public static C6529h m13978b() {
        return (C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class);
    }

    /* renamed from: a */
    public static void m13975a() {
        C6520a aVar;
        C6529h hVar = (C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class);
        if (hVar != null && (aVar = hVar.f16313e) != null) {
            aVar.f16204j = "";
        }
    }

    /* renamed from: a */
    public static void m13976a(Long l) {
        C6523c cVar;
        C6529h b = m13978b();
        if (b != null && (cVar = b.f16312d) != null) {
            cVar.f16270h = l;
        }
    }

    /* renamed from: c */
    public static void m13981c(String str) {
        C6523c cVar;
        C6529h b = m13978b();
        if (b != null && (cVar = b.f16312d) != null) {
            cVar.f16266d = str;
        }
    }

    /* renamed from: d */
    public static void m13982d(String str) {
        C6520a aVar;
        C6529h b = m13978b();
        if (b != null && (aVar = b.f16313e) != null) {
            aVar.f16188K = str;
        }
    }

    /* renamed from: b */
    public static void m13979b(Long l) {
        C6523c cVar;
        C6529h b = m13978b();
        if (b != null && (cVar = b.f16312d) != null) {
            cVar.f16271i = l;
        }
    }

    /* renamed from: a */
    public static void m13977a(String str) {
        C6520a aVar;
        C6529h b = m13978b();
        if (b != null && (aVar = b.f16313e) != null) {
            aVar.f16208n = str;
        }
    }

    /* renamed from: b */
    public static void m13980b(String str) {
        Room room;
        C6529h b = m13978b();
        if (b != null && (room = b.f16310b) != null) {
            room.setRoomOrientation(str);
        }
    }
}
