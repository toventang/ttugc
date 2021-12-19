package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.a */
public final class C46676a {

    /* renamed from: a */
    public static final AbstractC89244h f108827a = C89250i.m154773a((AbstractC89171a) C46679c.f108833a);

    /* renamed from: b */
    public static final C46676a f108828b = new C46676a();

    /* renamed from: c */
    private static final AbstractC89244h f108829c = C89250i.m154773a((AbstractC89171a) C46677a.f108831a);

    /* renamed from: d */
    private static final AbstractC89244h f108830d = C89250i.m154773a((AbstractC89171a) C46678b.f108832a);

    /* renamed from: a */
    public static int m90085a() {
        return ((Number) f108829c.getValue()).intValue();
    }

    private C46676a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.a$b */
    static final class C46678b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46678b f108832a = new C46678b();

        static {
            Covode.recordClassIndex(55279);
        }

        C46678b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C46676a.m90085a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.a$c */
    static final class C46679c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46679c f108833a = new C46679c();

        static {
            Covode.recordClassIndex(55280);
        }

        C46679c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C46676a.m90085a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.a$a */
    static final class C46677a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46677a f108831a = new C46677a();

        static {
            Covode.recordClassIndex(55278);
        }

        C46677a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("ab_earse_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(55277);
    }
}
