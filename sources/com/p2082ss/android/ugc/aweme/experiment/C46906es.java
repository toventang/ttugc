package com.p2082ss.android.ugc.aweme.experiment;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.es */
public final class C46906es {

    /* renamed from: a */
    public static final AbstractC89244h f109316a = C89250i.m154773a((AbstractC89171a) C46909c.f109324a);

    /* renamed from: b */
    public static final C46906es f109317b = new C46906es();

    /* renamed from: c */
    private static final AbstractC89244h f109318c = C89250i.m154773a((AbstractC89171a) C46911e.f109326a);

    /* renamed from: d */
    private static final AbstractC89244h f109319d = C89250i.m154773a((AbstractC89171a) C46910d.f109325a);

    /* renamed from: e */
    private static final AbstractC89244h f109320e = C89250i.m154773a((AbstractC89171a) C46908b.f109323a);

    /* renamed from: f */
    private static final AbstractC89244h f109321f = C89250i.m154773a((AbstractC89171a) C46907a.f109322a);

    /* renamed from: a */
    public static int m90210a() {
        return ((Number) f109318c.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m90211b() {
        return ((Boolean) f109319d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m90212c() {
        return ((Boolean) f109320e.getValue()).booleanValue();
    }

    /* renamed from: d */
    public static boolean m90213d() {
        return ((Boolean) f109321f.getValue()).booleanValue();
    }

    private C46906es() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.es$a */
    static final class C46907a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46907a f109322a = new C46907a();

        static {
            Covode.recordClassIndex(55508);
        }

        C46907a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46906es.m90210a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.es$c */
    static final class C46909c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46909c f109324a = new C46909c();

        static {
            Covode.recordClassIndex(55510);
        }

        C46909c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46906es.m90210a() & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.es$d */
    static final class C46910d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46910d f109325a = new C46910d();

        static {
            Covode.recordClassIndex(55511);
        }

        C46910d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C46906es.m90210a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.es$b */
    static final class C46908b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46908b f109323a = new C46908b();

        static {
            Covode.recordClassIndex(55509);
        }

        C46908b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C46906es.m90210a() & 1) != 1 || Build.VERSION.SDK_INT < 21) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.es$e */
    static final class C46911e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46911e f109326a = new C46911e();

        static {
            Covode.recordClassIndex(55512);
        }

        C46911e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("npth_refactor", 0));
        }
    }

    static {
        Covode.recordClassIndex(55507);
    }
}
