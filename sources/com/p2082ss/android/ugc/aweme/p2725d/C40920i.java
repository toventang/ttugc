package com.p2082ss.android.ugc.aweme.p2725d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.legoImp.inflate.C58293f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.d.i */
public final class C40920i {

    /* renamed from: a */
    static final AbstractC89244h f95736a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C40923c.f95742a);

    /* renamed from: b */
    public static final C40920i f95737b = new C40920i();

    /* renamed from: c */
    private static final AbstractC89244h f95738c = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C40921a.f95740a);

    /* renamed from: d */
    private static final AbstractC89244h f95739d = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C40922b.f95741a);

    /* renamed from: a */
    public static int m82407a() {
        return ((Number) f95738c.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m82408b() {
        return ((Boolean) f95739d.getValue()).booleanValue();
    }

    private C40920i() {
    }

    /* renamed from: com.ss.android.ugc.aweme.d.i$a */
    static final class C40921a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C40921a f95740a = new C40921a();

        static {
            Covode.recordClassIndex(48773);
        }

        C40921a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C58293f.m105315a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.d.i$b */
    static final class C40922b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C40922b f95741a = new C40922b();

        static {
            Covode.recordClassIndex(48774);
        }

        C40922b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C40920i.m82407a() == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.d.i$c */
    static final class C40923c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C40923c f95742a = new C40923c();

        static {
            Covode.recordClassIndex(48775);
        }

        C40923c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C40920i.m82407a() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(48772);
    }
}
