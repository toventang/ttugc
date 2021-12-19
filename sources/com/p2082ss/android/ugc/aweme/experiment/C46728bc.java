package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.bc */
public final class C46728bc {

    /* renamed from: a */
    public static final C46728bc f108912a = new C46728bc();

    /* renamed from: b */
    private static final AbstractC89244h f108913b = C89250i.m154773a((AbstractC89171a) C46729a.f108914a);

    /* renamed from: a */
    public static int m90109a() {
        return ((Number) f108913b.getValue()).intValue();
    }

    private C46728bc() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.bc$a */
    static final class C46729a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46729a f108914a = new C46729a();

        static {
            Covode.recordClassIndex(55330);
        }

        C46729a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepoSync("ab_repo_cold_boot", 1).getInt("cold_boot_optim_v2", 0));
        }
    }

    static {
        Covode.recordClassIndex(55329);
    }

    /* renamed from: b */
    public static boolean m90110b() {
        if (m90109a() == 2 || m90109a() == 3) {
            return true;
        }
        return false;
    }
}
