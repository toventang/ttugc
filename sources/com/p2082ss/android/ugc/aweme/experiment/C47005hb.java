package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.hb */
public final class C47005hb {

    /* renamed from: a */
    public static boolean f109528a;

    /* renamed from: b */
    public static final C47005hb f109529b = new C47005hb();

    /* renamed from: c */
    private static final int f109530c = 1;

    /* renamed from: d */
    private static boolean f109531d;

    private C47005hb() {
    }

    /* renamed from: a */
    private static int m90281a() {
        return C16048b.m29633a().mo25412a(false, "use_lynx_for_favorite_music_collection", 0);
    }

    static {
        boolean z;
        Covode.recordClassIndex(55606);
        boolean z2 = true;
        if (m90281a() == 0) {
            z = true;
        } else {
            z = false;
        }
        f109531d = z;
        if (m90281a() != 1) {
            z2 = false;
        }
        f109528a = z2;
    }
}
