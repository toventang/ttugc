package com.p2082ss.android.ugc.aweme.lego.p3392b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.lego.b.a */
public final class C58166a {

    /* renamed from: a */
    static final int f132441a = 0;

    /* renamed from: b */
    static final int f132442b = 1;

    /* renamed from: c */
    static final int f132443c = 2;

    /* renamed from: d */
    static final int f132444d = 4;

    /* renamed from: e */
    static final int f132445e = 8;

    /* renamed from: f */
    public static final int f132446f = 3;

    /* renamed from: g */
    public static final AbstractC89244h f132447g = C89250i.m154773a((AbstractC89171a) C58169c.f132455a);

    /* renamed from: h */
    public static final AbstractC89244h f132448h = C89250i.m154773a((AbstractC89171a) C58171e.f132457a);

    /* renamed from: i */
    public static final C58166a f132449i = new C58166a();

    /* renamed from: j */
    private static final AbstractC89244h f132450j = C89250i.m154773a((AbstractC89171a) C58167a.f132453a);

    /* renamed from: k */
    private static final AbstractC89244h f132451k = C89250i.m154773a((AbstractC89171a) C58168b.f132454a);

    /* renamed from: l */
    private static final AbstractC89244h f132452l = C89250i.m154773a((AbstractC89171a) C58170d.f132456a);

    /* renamed from: a */
    public static int m105090a() {
        return ((Number) f132450j.getValue()).intValue();
    }

    private C58166a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.a$a */
    static final class C58167a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C58167a f132453a = new C58167a();

        static {
            Covode.recordClassIndex(68233);
        }

        C58167a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("fluency_insert_downgrade_opt", C58166a.f132441a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.a$b */
    static final class C58168b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58168b f132454a = new C58168b();

        static {
            Covode.recordClassIndex(68234);
        }

        C58168b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58166a.m105090a() & C58166a.f132444d) == C58166a.f132444d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.a$c */
    static final class C58169c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58169c f132455a = new C58169c();

        static {
            Covode.recordClassIndex(68235);
        }

        C58169c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58166a.m105090a() & C58166a.f132442b) != C58166a.f132442b || !C58177c.m105092a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.a$d */
    static final class C58170d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58170d f132456a = new C58170d();

        static {
            Covode.recordClassIndex(68236);
        }

        C58170d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58166a.m105090a() & C58166a.f132445e) == C58166a.f132445e) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.a$e */
    static final class C58171e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58171e f132457a = new C58171e();

        static {
            Covode.recordClassIndex(68237);
        }

        C58171e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58166a.m105090a() & C58166a.f132443c) != C58166a.f132443c || !C58177c.m105092a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(68232);
    }
}
