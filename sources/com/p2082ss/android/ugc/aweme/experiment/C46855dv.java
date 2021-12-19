package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.dv */
public final class C46855dv {

    /* renamed from: a */
    public static final C46855dv f109171a = new C46855dv();

    /* renamed from: b */
    private static final AbstractC89244h f109172b = C89250i.m154773a((AbstractC89171a) C46856a.f109173a);

    /* renamed from: a */
    public static int m90166a() {
        return ((Number) f109172b.getValue()).intValue();
    }

    private C46855dv() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dv$a */
    static final class C46856a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46856a f109173a = new C46856a();

        static {
            Covode.recordClassIndex(55457);
        }

        C46856a() {
            super(0);
        }

        /* renamed from: a */
        private static int m90168a() {
            try {
                return Keva.getRepo("ab_repo_cold_boot").getInt("infra_cold_boot_opt", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m90168a());
        }
    }

    /* renamed from: b */
    public static boolean m90167b() {
        if ((m90166a() & 8) != 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(55456);
    }
}
