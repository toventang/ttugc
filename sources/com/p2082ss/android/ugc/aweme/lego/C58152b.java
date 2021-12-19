package com.p2082ss.android.ugc.aweme.lego;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.lego.b */
public final class C58152b {

    /* renamed from: a */
    public static final AbstractC89244h f132414a = C89250i.m154773a((AbstractC89171a) C58153a.f132428a);

    /* renamed from: b */
    public static final AbstractC89244h f132415b = C89250i.m154773a((AbstractC89171a) C58155c.f132430a);

    /* renamed from: c */
    public static final AbstractC89244h f132416c = C89250i.m154773a((AbstractC89171a) C58164l.f132439a);

    /* renamed from: d */
    public static final AbstractC89244h f132417d = C89250i.m154773a((AbstractC89171a) C58158f.f132433a);

    /* renamed from: e */
    public static final AbstractC89244h f132418e = C89250i.m154773a((AbstractC89171a) C58161i.f132436a);

    /* renamed from: f */
    public static final AbstractC89244h f132419f = C89250i.m154773a((AbstractC89171a) C58160h.f132435a);

    /* renamed from: g */
    public static final C58152b f132420g = new C58152b();

    /* renamed from: h */
    private static final AbstractC89244h f132421h = C89250i.m154773a((AbstractC89171a) C58154b.f132429a);

    /* renamed from: i */
    private static final AbstractC89244h f132422i = C89250i.m154773a((AbstractC89171a) C58157e.f132432a);

    /* renamed from: j */
    private static final AbstractC89244h f132423j = C89250i.m154773a((AbstractC89171a) C58162j.f132437a);

    /* renamed from: k */
    private static final AbstractC89244h f132424k = C89250i.m154773a((AbstractC89171a) C58159g.f132434a);

    /* renamed from: l */
    private static final AbstractC89244h f132425l = C89250i.m154773a((AbstractC89171a) C58163k.f132438a);

    /* renamed from: m */
    private static final AbstractC89244h f132426m = C89250i.m154773a((AbstractC89171a) C58165m.f132440a);

    /* renamed from: n */
    private static final AbstractC89244h f132427n = C89250i.m154773a((AbstractC89171a) C58156d.f132431a);

    /* renamed from: a */
    public static int m105083a() {
        return ((Number) f132421h.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m105084b() {
        return ((Boolean) f132422i.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m105085c() {
        return ((Boolean) f132423j.getValue()).booleanValue();
    }

    /* renamed from: d */
    public static boolean m105086d() {
        return ((Boolean) f132424k.getValue()).booleanValue();
    }

    /* renamed from: e */
    public static boolean m105087e() {
        return ((Boolean) f132425l.getValue()).booleanValue();
    }

    /* renamed from: f */
    public static boolean m105088f() {
        return ((Boolean) f132426m.getValue()).booleanValue();
    }

    /* renamed from: g */
    public static boolean m105089g() {
        return ((Boolean) f132427n.getValue()).booleanValue();
    }

    private C58152b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$a */
    static final class C58153a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58153a f132428a = new C58153a();

        static {
            Covode.recordClassIndex(68219);
        }

        C58153a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C58152b.m105083a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$c */
    static final class C58155c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58155c f132430a = new C58155c();

        static {
            Covode.recordClassIndex(68221);
        }

        C58155c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$e */
    static final class C58157e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58157e f132432a = new C58157e();

        static {
            Covode.recordClassIndex(68223);
        }

        C58157e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$b */
    static final class C58154b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C58154b f132429a = new C58154b();

        static {
            Covode.recordClassIndex(68220);
        }

        C58154b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("cold_boot_opt_v3", 5825));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$d */
    static final class C58156d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58156d f132431a = new C58156d();

        static {
            Covode.recordClassIndex(68222);
        }

        C58156d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 4096) == 4096) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$f */
    static final class C58158f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58158f f132433a = new C58158f();

        static {
            Covode.recordClassIndex(68224);
        }

        C58158f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 32) == 32) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$g */
    static final class C58159g extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58159g f132434a = new C58159g();

        static {
            Covode.recordClassIndex(68225);
        }

        C58159g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 256) == 256) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$h */
    static final class C58160h extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58160h f132435a = new C58160h();

        static {
            Covode.recordClassIndex(68226);
        }

        C58160h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 512) == 512) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$i */
    static final class C58161i extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58161i f132436a = new C58161i();

        static {
            Covode.recordClassIndex(68227);
        }

        C58161i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$j */
    static final class C58162j extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58162j f132437a = new C58162j();

        static {
            Covode.recordClassIndex(68228);
        }

        C58162j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 8) == 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$k */
    static final class C58163k extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58163k f132438a = new C58163k();

        static {
            Covode.recordClassIndex(68229);
        }

        C58163k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 1024) == 1024) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$l */
    static final class C58164l extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58164l f132439a = new C58164l();

        static {
            Covode.recordClassIndex(68230);
        }

        C58164l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 16) == 16) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b$m */
    static final class C58165m extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58165m f132440a = new C58165m();

        static {
            Covode.recordClassIndex(68231);
        }

        C58165m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58152b.m105083a() & 2048) == 2048) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(68218);
    }
}
