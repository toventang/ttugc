package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.cm */
public final class C46796cm {

    /* renamed from: a */
    public static final boolean f109016a;

    /* renamed from: b */
    public static final boolean f109017b;

    /* renamed from: c */
    public static final C46796cm f109018c = new C46796cm();

    /* renamed from: d */
    private static final int f109019d;

    /* renamed from: e */
    private static final int f109020e;

    private C46796cm() {
    }

    static {
        boolean z;
        Covode.recordClassIndex(55397);
        boolean z2 = true;
        int a = C16048b.m29633a().mo25412a(true, "zl_feed_opt_ab", 1);
        f109019d = a;
        f109020e = a;
        if ((a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        f109016a = z;
        if ((a & 4) == 0) {
            z2 = false;
        }
        f109017b = z2;
    }
}
