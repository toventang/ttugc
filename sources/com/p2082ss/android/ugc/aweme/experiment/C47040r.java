package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.r */
public final class C47040r {

    /* renamed from: a */
    public static final AbstractC89244h f109591a = C89250i.m154773a((AbstractC89171a) C47041a.f109593a);

    /* renamed from: b */
    public static final C47040r f109592b = new C47040r();

    private C47040r() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.r$a */
    static final class C47041a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C47041a f109593a = new C47041a();

        static {
            Covode.recordClassIndex(55642);
        }

        C47041a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepoSync("ab_repo_cold_boot", 1).getBoolean("keva_multiple_memcache", true));
        }
    }

    static {
        Covode.recordClassIndex(55641);
    }
}
