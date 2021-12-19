package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.a.a */
public final class C55048a {

    /* renamed from: a */
    public static final C55048a f125990a = new C55048a();

    /* renamed from: b */
    private static final int f125991b = C16048b.m29633a().mo25412a(true, "im_enable_video_cover_optimization", 0);

    private C55048a() {
    }

    /* renamed from: a */
    public static boolean m100666a() {
        if (f125991b == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(64776);
    }
}
