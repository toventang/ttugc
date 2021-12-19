package com.p2082ss.android.ugc.aweme.video.p4208b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.video.b.a */
public final class C80667a {

    /* renamed from: a */
    public static final C80667a f180356a = new C80667a();

    /* renamed from: b */
    private static final AbstractC89244h f180357b = C89250i.m154773a((AbstractC89171a) C80668a.f180358a);

    /* renamed from: b */
    private static double m139903b() {
        return ((Number) f180357b.getValue()).doubleValue();
    }

    private C80667a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.video.b.a$a */
    static final class C80668a extends AbstractC89220m implements AbstractC89171a<Double> {

        /* renamed from: a */
        public static final C80668a f180358a = new C80668a();

        static {
            Covode.recordClassIndex(93949);
        }

        C80668a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Double invoke() {
            return Double.valueOf(C16048b.m29633a().mo25409a(true, "allow_ad_custom_prefetch_policy", 1.0d));
        }
    }

    static {
        Covode.recordClassIndex(93948);
    }

    /* renamed from: a */
    public static final double m139902a() {
        if (m139903b() < 1.0d || m139903b() > 3.0d) {
            return 1.0d;
        }
        return m139903b();
    }
}
