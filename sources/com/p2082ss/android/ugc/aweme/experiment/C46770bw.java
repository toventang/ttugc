package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.bw */
public final class C46770bw {

    /* renamed from: a */
    static final AbstractC89244h f108977a = C89250i.m154773a((AbstractC89171a) C46771a.f108980a);

    /* renamed from: b */
    public static final AbstractC89244h f108978b = C89250i.m154773a((AbstractC89171a) C46772b.f108981a);

    /* renamed from: c */
    public static final C46770bw f108979c = new C46770bw();

    private C46770bw() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.bw$a */
    static final class C46771a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46771a f108980a = new C46771a();

        static {
            Covode.recordClassIndex(55372);
        }

        C46771a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("common_param_preload", 1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.bw$b */
    static final class C46772b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46772b f108981a = new C46772b();

        static {
            Covode.recordClassIndex(55373);
        }

        C46772b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((((Number) C46770bw.f108977a.getValue()).intValue() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55371);
    }
}
