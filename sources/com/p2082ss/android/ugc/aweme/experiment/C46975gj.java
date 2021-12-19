package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.gj */
public final class C46975gj {

    /* renamed from: a */
    static final AbstractC89244h f109468a = C89250i.m154773a((AbstractC89171a) C46976a.f109471a);

    /* renamed from: b */
    public static final AbstractC89244h f109469b = C89250i.m154773a((AbstractC89171a) C46977b.f109472a);

    /* renamed from: c */
    public static final C46975gj f109470c = new C46975gj();

    private C46975gj() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.gj$a */
    static final class C46976a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46976a f109471a = new C46976a();

        static {
            Covode.recordClassIndex(55577);
        }

        C46976a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("sky_eye_gson_flip", 1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.gj$b */
    static final class C46977b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46977b f109472a = new C46977b();

        static {
            Covode.recordClassIndex(55578);
        }

        C46977b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((((Number) C46975gj.f109468a.getValue()).intValue() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55576);
    }
}
