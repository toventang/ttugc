package com.p2082ss.android.ugc.aweme.turbo.api;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.turbo.p4158vi.TurboViImpl;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.turbo.api.b */
public final class C79340b {

    /* renamed from: a */
    public static final C79340b f178255a = new C79340b();

    /* renamed from: b */
    private static ITurboApi f178256b;

    private C79340b() {
    }

    static {
        Covode.recordClassIndex(92536);
    }

    /* renamed from: b */
    private static boolean m138148b() {
        return C89361p.m154872a("vivo", Build.BRAND, true);
    }

    /* renamed from: a */
    public static ITurboApi m138147a() {
        ITurboApi iTurboApi;
        if (f178256b == null) {
            if (m138148b()) {
                iTurboApi = TurboViImpl.m138149a();
            } else {
                iTurboApi = C79339a.f178254a;
            }
            f178256b = iTurboApi;
        }
        ITurboApi iTurboApi2 = f178256b;
        if (iTurboApi2 == null) {
            C89219l.m154715b();
        }
        return iTurboApi2;
    }
}
