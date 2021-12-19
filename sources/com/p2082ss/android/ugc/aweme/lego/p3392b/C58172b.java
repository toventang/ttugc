package com.p2082ss.android.ugc.aweme.lego.p3392b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.lego.b.b */
public final class C58172b {

    /* renamed from: a */
    public static final int f132458a = 0;

    /* renamed from: b */
    static final int f132459b = 1;

    /* renamed from: c */
    static final int f132460c = 2;

    /* renamed from: d */
    static final int f132461d = 4;

    /* renamed from: e */
    public static final AbstractC89244h f132462e = C89250i.m154773a((AbstractC89171a) C58174b.f132468a);

    /* renamed from: f */
    public static final AbstractC89244h f132463f = C89250i.m154773a((AbstractC89171a) C58176d.f132470a);

    /* renamed from: g */
    public static final C58172b f132464g = new C58172b();

    /* renamed from: h */
    private static final AbstractC89244h f132465h = C89250i.m154773a((AbstractC89171a) C58173a.f132467a);

    /* renamed from: i */
    private static final AbstractC89244h f132466i = C89250i.m154773a((AbstractC89171a) C58175c.f132469a);

    /* renamed from: a */
    public static int m105091a() {
        return ((Number) f132465h.getValue()).intValue();
    }

    private C58172b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.b$a */
    static final class C58173a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C58173a f132467a = new C58173a();

        static {
            Covode.recordClassIndex(68239);
        }

        C58173a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("high_frequency_function_opt", C58172b.f132458a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.b$b */
    static final class C58174b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58174b f132468a = new C58174b();

        static {
            Covode.recordClassIndex(68240);
        }

        C58174b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58172b.m105091a() & C58172b.f132459b) == C58172b.f132459b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.b$c */
    static final class C58175c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58175c f132469a = new C58175c();

        static {
            Covode.recordClassIndex(68241);
        }

        C58175c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58172b.m105091a() & C58172b.f132460c) == C58172b.f132460c) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.b$d */
    static final class C58176d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58176d f132470a = new C58176d();

        static {
            Covode.recordClassIndex(68242);
        }

        C58176d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58172b.m105091a() & C58172b.f132461d) == C58172b.f132461d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(68238);
    }
}
