package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.ek */
public final class C46883ek {

    /* renamed from: a */
    public static final AbstractC89244h f109256a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C46886c.f109264a);

    /* renamed from: b */
    public static final AbstractC89244h f109257b = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C46888e.f109266a);

    /* renamed from: c */
    public static final AbstractC89244h f109258c = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C46887d.f109265a);

    /* renamed from: d */
    public static final C46883ek f109259d = new C46883ek();

    /* renamed from: e */
    private static final AbstractC89244h f109260e = C89250i.m154773a((AbstractC89171a) C46884a.f109262a);

    /* renamed from: f */
    private static final AbstractC89244h f109261f = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C46885b.f109263a);

    /* renamed from: a */
    public static int m90192a() {
        return ((Number) f109260e.getValue()).intValue();
    }

    /* renamed from: b */
    public static final boolean m90193b() {
        return ((Boolean) f109261f.getValue()).booleanValue();
    }

    private C46883ek() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ek$a */
    static final class C46884a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46884a f109262a = new C46884a();

        static {
            Covode.recordClassIndex(55485);
        }

        C46884a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepoSync("ab_repo_cold_boot", 0).getInt("main_looper_private_repo_opt_enable", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ek$b */
    static final class C46885b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46885b f109263a = new C46885b();

        static {
            Covode.recordClassIndex(55486);
        }

        C46885b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46883ek.m90192a() & 8) == 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ek$c */
    static final class C46886c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46886c f109264a = new C46886c();

        static {
            Covode.recordClassIndex(55487);
        }

        C46886c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!C46883ek.m90193b() && (C46883ek.m90192a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ek$d */
    static final class C46887d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46887d f109265a = new C46887d();

        static {
            Covode.recordClassIndex(55488);
        }

        C46887d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C46883ek.m90193b() || (C46883ek.m90192a() & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ek$e */
    static final class C46888e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46888e f109266a = new C46888e();

        static {
            Covode.recordClassIndex(55489);
        }

        C46888e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C46883ek.m90193b() || (C46883ek.m90192a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55484);
    }
}
