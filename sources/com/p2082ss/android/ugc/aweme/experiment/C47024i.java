package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.i */
public final class C47024i {

    /* renamed from: a */
    public static final AbstractC89244h f109552a = C89250i.m154773a((AbstractC89171a) C47025a.f109557a);

    /* renamed from: b */
    public static final C47024i f109553b = new C47024i();

    /* renamed from: c */
    private static final AbstractC89244h f109554c = C89250i.m154773a((AbstractC89171a) C47026b.f109558a);

    /* renamed from: d */
    private static final AbstractC89244h f109555d = C89250i.m154773a((AbstractC89171a) C47027c.f109559a);

    /* renamed from: e */
    private static final AbstractC89244h f109556e = C89250i.m154773a((AbstractC89171a) C47028d.f109560a);

    /* renamed from: a */
    public static int m90288a() {
        return ((Number) f109554c.getValue()).intValue();
    }

    /* renamed from: b */
    public static final boolean m90289b() {
        return ((Boolean) f109555d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static final boolean m90290c() {
        return ((Boolean) f109556e.getValue()).booleanValue();
    }

    private C47024i() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.i$c */
    static final class C47027c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C47027c f109559a = new C47027c();

        static {
            Covode.recordClassIndex(55628);
        }

        C47027c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C47024i.m90288a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.i$a */
    static final class C47025a extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C47025a f109557a = new C47025a();

        static {
            Covode.recordClassIndex(55626);
        }

        C47025a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            long j;
            if (C47024i.m90289b()) {
                j = ((long) ((C47024i.m90288a() & 62) >> 1)) * 1000;
            } else {
                j = 0;
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.i$b */
    static final class C47026b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C47026b f109558a = new C47026b();

        static {
            Covode.recordClassIndex(55627);
        }

        C47026b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("app_widget_refactor_experiment", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.i$d */
    static final class C47028d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C47028d f109560a = new C47028d();

        static {
            Covode.recordClassIndex(55629);
        }

        C47028d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C47024i.m90289b() && ((C47024i.m90288a() & 64) >> 6) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55625);
    }
}
