package com.bytedance.android.livesdk.watch;

import android.text.TextUtils;
import com.bytedance.android.C2690b;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUseSurfaceViewExperiment;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.watch.h */
public final class C11330h {

    /* renamed from: a */
    public static final C11330h f27074a = new C11330h();

    private C11330h() {
    }

    static {
        Covode.recordClassIndex(12969);
    }

    /* renamed from: a */
    public static void m20085a() {
        boolean z;
        C11870f fVar = C11870f.C11871a.f28404a;
        C89219l.m154716b(fVar, "");
        EnterRoomLinkSession a = fVar.mo19010a();
        C89219l.m154716b(a, "");
        EnterRoomConfig enterRoomConfig = a.f28391b;
        String str = enterRoomConfig.f28233c.f28293J + "-" + enterRoomConfig.f28233c.f28295L;
        if (TextUtils.equals(str, "homepage_hot-live_cell") || TextUtils.equals(str, "homepage_follow-live_cell")) {
            z = false;
        } else {
            z = true;
        }
        if (!LiveUseSurfaceViewExperiment.INSTANCE.isEnable() || !z) {
            C2690b.m7787a((int) R.layout.b8o);
        } else {
            C2690b.m7787a((int) R.layout.b8p);
        }
        C2690b.m7787a((int) R.layout.b8x);
    }
}
