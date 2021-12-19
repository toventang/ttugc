package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.bg */
public final class C46734bg {

    /* renamed from: a */
    public static final C46734bg f108920a = new C46734bg();

    /* renamed from: b */
    private static final AbstractC89244h f108921b = C89250i.m154773a((AbstractC89171a) C46735a.f108922a);

    private C46734bg() {
    }

    /* renamed from: a */
    public static int m90112a() {
        return ((Number) f108921b.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.bg$a */
    static final class C46735a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46735a f108922a = new C46735a();

        static {
            Covode.recordClassIndex(55336);
        }

        C46735a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("preload_feed_count", 0));
        }
    }

    static {
        Covode.recordClassIndex(55335);
    }
}
