package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.dw */
public final class C46857dw {

    /* renamed from: a */
    public static final AbstractC89244h f109174a = C89250i.m154773a((AbstractC89171a) C46859b.f109180a);

    /* renamed from: b */
    public static final C46857dw f109175b = new C46857dw();

    /* renamed from: c */
    private static final AbstractC89244h f109176c = C89250i.m154773a((AbstractC89171a) C46858a.f109179a);

    /* renamed from: d */
    private static final AbstractC89244h f109177d = C89250i.m154773a((AbstractC89171a) C46860c.f109181a);

    /* renamed from: e */
    private static final AbstractC89244h f109178e = C89250i.m154773a((AbstractC89171a) C46861d.f109182a);

    /* renamed from: a */
    public static int m90169a() {
        return ((Number) f109176c.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m90170b() {
        return ((Boolean) f109178e.getValue()).booleanValue();
    }

    private C46857dw() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dw$b */
    static final class C46859b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46859b f109180a = new C46859b();

        static {
            Covode.recordClassIndex(55460);
        }

        C46859b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C46857dw.m90169a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dw$c */
    static final class C46860c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46860c f109181a = new C46860c();

        static {
            Covode.recordClassIndex(55461);
        }

        C46860c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C46857dw.m90169a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dw$d */
    static final class C46861d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46861d f109182a = new C46861d();

        static {
            Covode.recordClassIndex(55462);
        }

        C46861d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46857dw.m90169a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dw$a */
    static final class C46858a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46858a f109179a = new C46858a();

        static {
            Covode.recordClassIndex(55459);
        }

        C46858a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("init_module_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(55458);
    }
}
