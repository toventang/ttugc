package com.p2082ss.android.ugc.aweme.feed.p2936ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.feed.ab.b */
public final class C48022b {

    /* renamed from: a */
    public static final C48022b f111247a = new C48022b();

    private C48022b() {
    }

    static {
        Covode.recordClassIndex(56749);
    }

    /* renamed from: b */
    public static final int m91033b() {
        BottomGradualOptimizeConfig a = m91032a();
        if (a != null) {
            return a.getGroupId();
        }
        return 0;
    }

    /* renamed from: a */
    public static final BottomGradualOptimizeConfig m91032a() {
        try {
            return (BottomGradualOptimizeConfig) C16048b.m29633a().mo25415a(true, "feed_bottom_gradual_optimize", BottomGradualOptimizeConfig.class);
        } catch (Exception unused) {
            return new BottomGradualOptimizeConfig(0, 0.18f);
        }
    }
}
