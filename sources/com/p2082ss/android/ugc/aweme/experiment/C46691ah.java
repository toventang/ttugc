package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.ah */
public final class C46691ah {

    /* renamed from: a */
    public static final AbstractC89244h f108848a = C89250i.m154773a((AbstractC89171a) C46694c.f108856a);

    /* renamed from: b */
    public static final AbstractC89244h f108849b = C89250i.m154773a((AbstractC89171a) C46695d.f108857a);

    /* renamed from: c */
    public static final AbstractC89244h f108850c = C89250i.m154773a((AbstractC89171a) C46692a.f108854a);

    /* renamed from: d */
    public static final C46691ah f108851d = new C46691ah();

    /* renamed from: e */
    private static final AbstractC89244h f108852e = C89250i.m154773a((AbstractC89171a) C46693b.f108855a);

    /* renamed from: f */
    private static final AbstractC89244h f108853f = C89250i.m154773a((AbstractC89171a) C46696e.f108858a);

    /* renamed from: a */
    public static int m90090a() {
        return ((Number) f108852e.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m90091b() {
        return ((Boolean) f108853f.getValue()).booleanValue();
    }

    private C46691ah() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ah$a */
    static final class C46692a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46692a f108854a = new C46692a();

        static {
            Covode.recordClassIndex(55293);
        }

        C46692a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C46691ah.m90090a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ah$c */
    static final class C46694c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46694c f108856a = new C46694c();

        static {
            Covode.recordClassIndex(55295);
        }

        C46694c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46691ah.m90090a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ah$e */
    static final class C46696e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46696e f108858a = new C46696e();

        static {
            Covode.recordClassIndex(55297);
        }

        C46696e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46691ah.m90090a() & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ah$b */
    static final class C46693b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46693b f108855a = new C46693b();

        static {
            Covode.recordClassIndex(55294);
        }

        C46693b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("cold_boot_degradation", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ah$d */
    static final class C46695d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46695d f108857a = new C46695d();

        static {
            Covode.recordClassIndex(55296);
        }

        C46695d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46691ah.m90090a() & 8) == 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55292);
    }
}
