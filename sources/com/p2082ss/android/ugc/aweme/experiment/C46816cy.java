package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.cy */
public final class C46816cy {

    /* renamed from: a */
    public static final AbstractC89244h f109066a = C89250i.m154773a((AbstractC89171a) C46817a.f109069a);

    /* renamed from: b */
    public static final C46816cy f109067b = new C46816cy();

    /* renamed from: c */
    private static final AbstractC89244h f109068c = C89250i.m154773a((AbstractC89171a) C46818b.f109070a);

    /* renamed from: a */
    public static int m90148a() {
        return ((Number) f109068c.getValue()).intValue();
    }

    private C46816cy() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.cy$a */
    static final class C46817a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46817a f109069a = new C46817a();

        static {
            Covode.recordClassIndex(55418);
        }

        C46817a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C46816cy.m90148a() & 1) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.cy$b */
    static final class C46818b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46818b f109070a = new C46818b();

        static {
            Covode.recordClassIndex(55419);
        }

        C46818b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("feed_preload_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(55417);
    }
}
