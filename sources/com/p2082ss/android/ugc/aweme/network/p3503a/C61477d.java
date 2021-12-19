package com.p2082ss.android.ugc.aweme.network.p3503a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.network.a.d */
public final class C61477d {

    /* renamed from: a */
    public static final AbstractC89244h f139560a = C89250i.m154773a((AbstractC89171a) C61478a.f139562a);

    /* renamed from: b */
    public static final C61477d f139561b = new C61477d();

    private C61477d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a.d$a */
    static final class C61478a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C61478a f139562a = new C61478a();

        static {
            Covode.recordClassIndex(72135);
        }

        C61478a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("no_network_opt", false));
        }
    }

    static {
        Covode.recordClassIndex(72134);
    }
}
