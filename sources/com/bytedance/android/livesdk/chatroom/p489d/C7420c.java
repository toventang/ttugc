package com.bytedance.android.livesdk.chatroom.p489d;

import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdk.p425aa.p428c.C6535m;
import com.bytedance.android.livesdk.p425aa.p428c.C6536n;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.d.c */
public final class C7420c {
    static {
        Covode.recordClassIndex(8187);
    }

    /* renamed from: a */
    private static final boolean m15301a() {
        C7411d a = C7411d.m15284a();
        C89219l.m154716b(a, "");
        if (!a.f18373a || a.f18374b == null) {
            return false;
        }
        return a.f18374b.f18382f;
    }

    /* renamed from: b */
    private static final boolean m15304b(EnterRoomConfig enterRoomConfig) {
        if (!m15302a(enterRoomConfig) || m15301a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static final boolean m15302a(EnterRoomConfig enterRoomConfig) {
        if (!C89219l.m154714a((Object) "live_merge", (Object) enterRoomConfig.f28233c.f28293J) || !C89219l.m154714a((Object) "live_cover", (Object) enterRoomConfig.f28233c.f28295L)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static final int m15305c(EnterRoomConfig enterRoomConfig, int i) {
        if (i == 0 || m15304b(enterRoomConfig)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    private static final int m15303b(EnterRoomConfig enterRoomConfig, int i) {
        if (i != 0 || m15304b(enterRoomConfig)) {
            return i;
        }
        C7411d a = C7411d.m15284a();
        C89219l.m154716b(a, "");
        return a.mo13615f();
    }

    /* renamed from: a */
    public static final void m15300a(EnterRoomConfig enterRoomConfig, int i) {
        C89219l.m154721d(enterRoomConfig, "");
        C6535m mVar = new C6535m(m15303b(enterRoomConfig, i), m15305c(enterRoomConfig, i));
        C6529h hVar = (C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class);
        if (hVar != null) {
            hVar.f16314f = mVar;
        }
        DataChannelGlobal.f42558d.mo28321a(C6536n.class, mVar);
    }
}
