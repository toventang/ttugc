package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.bf */
public final class C46732bf {

    /* renamed from: a */
    public static final C46732bf f108917a = new C46732bf();

    /* renamed from: b */
    private static final AbstractC89244h f108918b = C89250i.m154773a((AbstractC89171a) C46733a.f108919a);

    /* renamed from: a */
    public static int m90111a() {
        return ((Number) f108918b.getValue()).intValue();
    }

    private C46732bf() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.bf$a */
    static final class C46733a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46733a f108919a = new C46733a();

        static {
            Covode.recordClassIndex(55334);
        }

        C46733a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("cold_boot_preload_class", 2));
        }
    }

    static {
        Covode.recordClassIndex(55333);
    }
}
