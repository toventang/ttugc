package com.p2082ss.android.ugc.aweme.main.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.main.experiment.b */
public final class C59081b {

    /* renamed from: a */
    public static final C59081b f134481a = new C59081b();

    private C59081b() {
    }

    static {
        Covode.recordClassIndex(69429);
    }

    /* renamed from: a */
    public static int m108558a() {
        int a = C16048b.m29633a().mo25412a(true, "follow_feed_type", 0);
        if (a == 0 || (a >= 0 && a <= 2)) {
            return a;
        }
        return 0;
    }
}
