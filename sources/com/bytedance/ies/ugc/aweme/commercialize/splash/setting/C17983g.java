package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.g */
public final class C17983g {

    /* renamed from: a */
    public static final C17983g f42827a = new C17983g();

    /* renamed from: b */
    private static final AbstractC89244h f42828b = C89250i.m154773a((AbstractC89171a) C17987d.f42835a);

    /* renamed from: c */
    private static final AbstractC89244h f42829c = C89250i.m154773a((AbstractC89171a) C17984a.f42832a);

    /* renamed from: d */
    private static final AbstractC89244h f42830d = C89250i.m154773a((AbstractC89171a) C17985b.f42833a);

    /* renamed from: e */
    private static final AbstractC89244h f42831e = C89250i.m154773a((AbstractC89171a) C17986c.f42834a);

    /* renamed from: a */
    public static int m33502a() {
        return ((Number) f42828b.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m33503b() {
        return ((Boolean) f42830d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m33504c() {
        return ((Boolean) f42831e.getValue()).booleanValue();
    }

    private C17983g() {
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.g$a */
    static final class C17984a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17984a f42832a = new C17984a();

        static {
            Covode.recordClassIndex(20605);
        }

        C17984a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C17983g.m33502a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.g$b */
    static final class C17985b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17985b f42833a = new C17985b();

        static {
            Covode.recordClassIndex(20606);
        }

        C17985b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C17983g.m33502a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.g$c */
    static final class C17986c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17986c f42834a = new C17986c();

        static {
            Covode.recordClassIndex(20607);
        }

        C17986c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C17983g.m33502a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.g$d */
    static final class C17987d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C17987d f42835a = new C17987d();

        static {
            Covode.recordClassIndex(20608);
        }

        C17987d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("splash_downgrade", 0));
        }
    }

    static {
        Covode.recordClassIndex(20604);
    }
}
