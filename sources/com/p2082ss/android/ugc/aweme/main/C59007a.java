package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;

/* renamed from: com.ss.android.ugc.aweme.main.a */
public class C59007a {

    /* renamed from: a */
    private static final boolean f134337a = m108455b();

    /* renamed from: a */
    public static boolean m108454a() {
        if (f134337a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(69352);
    }

    /* renamed from: b */
    private static boolean m108455b() {
        try {
            return C52912c.f121688a.f121689b.getMainTabFollowUseLazyViewpager().booleanValue();
        } catch (C16041a unused) {
            return false;
        }
    }
}
