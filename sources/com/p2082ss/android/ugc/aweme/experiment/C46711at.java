package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.at */
public final class C46711at {

    /* renamed from: a */
    public static final C46711at f108876a = new C46711at();

    /* renamed from: b */
    private static final AbstractC89244h f108877b = C89250i.m154773a((AbstractC89171a) C46712a.f108878a);

    private C46711at() {
    }

    /* renamed from: a */
    public static boolean m90098a() {
        return ((Boolean) f108877b.getValue()).booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.at$a */
    static final class C46712a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46712a f108878a = new C46712a();

        static {
            Covode.recordClassIndex(55313);
        }

        C46712a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot", 1).getBoolean("layoutinfalter_hook", false));
        }
    }

    static {
        Covode.recordClassIndex(55312);
    }
}
