package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.gv */
public final class C46995gv {

    /* renamed from: a */
    static final AbstractC89244h f109505a = C89250i.m154773a((AbstractC89171a) C46996a.f109508a);

    /* renamed from: b */
    public static final AbstractC89244h f109506b = C89250i.m154773a((AbstractC89171a) C46997b.f109509a);

    /* renamed from: c */
    public static final C46995gv f109507c = new C46995gv();

    private C46995gv() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.gv$a */
    static final class C46996a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46996a f109508a = new C46996a();

        static {
            Covode.recordClassIndex(55597);
        }

        C46996a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("thread_poll_num", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.gv$b */
    static final class C46997b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46997b f109509a = new C46997b();

        static {
            Covode.recordClassIndex(55598);
        }

        C46997b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((((Number) C46995gv.f109505a.getValue()).intValue() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55596);
    }
}
