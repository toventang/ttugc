package com.p2082ss.android.ugc.aweme.inbox.p3267b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.inbox.b.b */
public final class C56318b {

    /* renamed from: a */
    public static final C56318b f128474a = new C56318b();

    /* renamed from: b */
    private static final AbstractC89244h f128475b = C89250i.m154773a((AbstractC89171a) C56319a.f128479a);

    /* renamed from: c */
    private static final AbstractC89244h f128476c = C89250i.m154773a((AbstractC89171a) C56321c.f128481a);

    /* renamed from: d */
    private static final AbstractC89244h f128477d = C89250i.m154773a((AbstractC89171a) C56322d.f128482a);

    /* renamed from: e */
    private static final AbstractC89244h f128478e = C89250i.m154773a((AbstractC89171a) C56320b.f128480a);

    /* renamed from: a */
    public static int m102310a() {
        return ((Number) f128475b.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m102311b() {
        return ((Boolean) f128476c.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m102312c() {
        return ((Boolean) f128477d.getValue()).booleanValue();
    }

    /* renamed from: d */
    public static boolean m102313d() {
        return ((Boolean) f128478e.getValue()).booleanValue();
    }

    private C56318b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.b.b$c */
    static final class C56321c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56321c f128481a = new C56321c();

        static {
            Covode.recordClassIndex(66141);
        }

        C56321c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C56318b.m102310a() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.b.b$d */
    static final class C56322d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56322d f128482a = new C56322d();

        static {
            Covode.recordClassIndex(66142);
        }

        C56322d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C56318b.m102310a() == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.b.b$a */
    static final class C56319a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C56319a f128479a = new C56319a();

        static {
            Covode.recordClassIndex(66139);
        }

        C56319a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "inbox_redesign_type", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.b.b$b */
    static final class C56320b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56320b f128480a = new C56320b();

        static {
            Covode.recordClassIndex(66140);
        }

        C56320b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!(C56318b.m102310a() == 1 || C56318b.m102310a() == 2)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(66138);
    }
}
