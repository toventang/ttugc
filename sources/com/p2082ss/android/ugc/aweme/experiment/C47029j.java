package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.j */
public final class C47029j {

    /* renamed from: a */
    public static final int f109561a = 0;

    /* renamed from: b */
    static final int f109562b = 1;

    /* renamed from: c */
    static final int f109563c = 2;

    /* renamed from: d */
    public static final AbstractC89244h f109564d = C89250i.m154773a((AbstractC89171a) C47031b.f109569a);

    /* renamed from: e */
    public static final C47029j f109565e = new C47029j();

    /* renamed from: f */
    private static final AbstractC89244h f109566f = C89250i.m154773a((AbstractC89171a) C47032c.f109570a);

    /* renamed from: g */
    private static final AbstractC89244h f109567g = C89250i.m154773a((AbstractC89171a) C47030a.f109568a);

    /* renamed from: a */
    public static int m90291a() {
        return ((Number) f109566f.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m90292b() {
        return ((Boolean) f109567g.getValue()).booleanValue();
    }

    private C47029j() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.j$a */
    static final class C47030a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C47030a f109568a = new C47030a();

        static {
            Covode.recordClassIndex(55631);
        }

        C47030a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C47029j.m90291a() & C47029j.f109562b) == C47029j.f109562b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.j$b */
    static final class C47031b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C47031b f109569a = new C47031b();

        static {
            Covode.recordClassIndex(55632);
        }

        C47031b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C47029j.m90291a() & C47029j.f109563c) == C47029j.f109563c) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.j$c */
    static final class C47032c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C47032c f109570a = new C47032c();

        static {
            Covode.recordClassIndex(55633);
        }

        C47032c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("appflyer_opt", C47029j.f109561a));
        }
    }

    static {
        Covode.recordClassIndex(55630);
    }
}
