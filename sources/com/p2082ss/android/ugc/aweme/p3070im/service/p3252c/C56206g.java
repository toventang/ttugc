package com.p2082ss.android.ugc.aweme.p3070im.service.p3252c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.lego.p3392b.C58177c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.im.service.c.g */
public final class C56206g {

    /* renamed from: a */
    public static final AbstractC89244h f128202a = C89250i.m154773a((AbstractC89171a) C56210d.f128211a);

    /* renamed from: b */
    public static final AbstractC89244h f128203b = C89250i.m154773a((AbstractC89171a) C56209c.f128210a);

    /* renamed from: c */
    public static final C56206g f128204c = new C56206g();

    /* renamed from: d */
    private static final AbstractC89244h f128205d = C89250i.m154773a((AbstractC89171a) C56211e.f128212a);

    /* renamed from: e */
    private static final AbstractC89244h f128206e = C89250i.m154773a((AbstractC89171a) C56208b.f128209a);

    /* renamed from: f */
    private static final AbstractC89244h f128207f = C89250i.m154773a((AbstractC89171a) C56207a.f128208a);

    /* renamed from: a */
    public static int m102124a() {
        return ((Number) f128205d.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m102125b() {
        return ((Boolean) f128206e.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m102126c() {
        return ((Boolean) f128207f.getValue()).booleanValue();
    }

    private C56206g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.c.g$a */
    static final class C56207a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56207a f128208a = new C56207a();

        static {
            Covode.recordClassIndex(66016);
        }

        C56207a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C56206g.m102124a() & 8) != 8 || !C58177c.m105092a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.c.g$b */
    static final class C56208b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56208b f128209a = new C56208b();

        static {
            Covode.recordClassIndex(66017);
        }

        C56208b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C56206g.m102124a() & 2) != 2 || !C58177c.m105092a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.c.g$c */
    static final class C56209c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56209c f128210a = new C56209c();

        static {
            Covode.recordClassIndex(66018);
        }

        C56209c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C56206g.m102124a() & 4) != 4 || !C58177c.m105092a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.c.g$d */
    static final class C56210d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56210d f128211a = new C56210d();

        static {
            Covode.recordClassIndex(66019);
        }

        C56210d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C56206g.m102124a() & 1) != 1 || !C58177c.m105092a()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.c.g$e */
    static final class C56211e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C56211e f128212a = new C56211e();

        static {
            Covode.recordClassIndex(66020);
        }

        C56211e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "im_downgrade_opt", 6));
        }
    }

    static {
        Covode.recordClassIndex(66015);
    }
}
