package com.p2082ss.android.ugc.aweme.lego;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.lego.z */
public final class C58267z {

    /* renamed from: a */
    static final int f132706a = 1;

    /* renamed from: b */
    static final int f132707b = 2;

    /* renamed from: c */
    static final int f132708c = 4;

    /* renamed from: d */
    static final int f132709d = 8;

    /* renamed from: e */
    public static final int f132710e = 11;

    /* renamed from: f */
    static final AbstractC89244h f132711f = C89250i.m154773a((AbstractC89171a) C58269b.f132718a);

    /* renamed from: g */
    static final AbstractC89244h f132712g = C89250i.m154773a((AbstractC89171a) C58270c.f132719a);

    /* renamed from: h */
    public static final C58267z f132713h = new C58267z();

    /* renamed from: i */
    private static final AbstractC89244h f132714i = C89250i.m154773a((AbstractC89171a) C58272e.f132721a);

    /* renamed from: j */
    private static final AbstractC89244h f132715j = C89250i.m154773a((AbstractC89171a) C58271d.f132720a);

    /* renamed from: k */
    private static final AbstractC89244h f132716k = C89250i.m154773a((AbstractC89171a) C58268a.f132717a);

    /* renamed from: a */
    public static int m105223a() {
        return ((Number) f132714i.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m105224b() {
        return ((Boolean) f132715j.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m105225c() {
        return ((Boolean) f132716k.getValue()).booleanValue();
    }

    private C58267z() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.z$a */
    static final class C58268a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58268a f132717a = new C58268a();

        static {
            Covode.recordClassIndex(68337);
        }

        C58268a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58267z.m105223a() & C58267z.f132709d) == C58267z.f132709d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.z$b */
    static final class C58269b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58269b f132718a = new C58269b();

        static {
            Covode.recordClassIndex(68338);
        }

        C58269b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58267z.m105223a() & C58267z.f132706a) == C58267z.f132706a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.z$c */
    static final class C58270c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58270c f132719a = new C58270c();

        static {
            Covode.recordClassIndex(68339);
        }

        C58270c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58267z.m105223a() & C58267z.f132707b) == C58267z.f132707b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.z$d */
    static final class C58271d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58271d f132720a = new C58271d();

        static {
            Covode.recordClassIndex(68340);
        }

        C58271d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C58267z.m105223a() & C58267z.f132708c) == C58267z.f132708c) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.z$e */
    static final class C58272e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C58272e f132721a = new C58272e();

        static {
            Covode.recordClassIndex(68341);
        }

        C58272e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("lego_threadpool_type", 0));
        }
    }

    static {
        Covode.recordClassIndex(68336);
    }
}
