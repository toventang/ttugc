package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.cx */
public final class C46814cx {

    /* renamed from: a */
    public static final C46814cx f109063a = new C46814cx();

    /* renamed from: b */
    private static final AbstractC89244h f109064b = C89250i.m154773a((AbstractC89171a) C46815a.f109065a);

    /* renamed from: a */
    public static int m90147a() {
        return ((Number) f109064b.getValue()).intValue();
    }

    private C46814cx() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.cx$a */
    static final class C46815a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46815a f109065a = new C46815a();

        static {
            Covode.recordClassIndex(55416);
        }

        C46815a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("feed_preload_request", 0));
        }
    }

    static {
        Covode.recordClassIndex(55415);
    }
}
