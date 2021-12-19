package com.p2082ss.android.ugc.aweme.p3682s;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.s.g */
public final class C67274g {

    /* renamed from: a */
    public static final AbstractC89244h f150754a = C89250i.m154773a((AbstractC89171a) C67278d.f150762a);

    /* renamed from: b */
    public static final AbstractC89244h f150755b = C89250i.m154773a((AbstractC89171a) C67276b.f150760a);

    /* renamed from: c */
    public static final AbstractC89244h f150756c = C89250i.m154773a((AbstractC89171a) C67275a.f150759a);

    /* renamed from: d */
    public static final C67274g f150757d = new C67274g();

    /* renamed from: e */
    private static final AbstractC89244h f150758e = C89250i.m154773a((AbstractC89171a) C67277c.f150761a);

    /* renamed from: a */
    public static boolean m119193a() {
        return ((Boolean) f150758e.getValue()).booleanValue();
    }

    private C67274g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.s.g$a */
    static final class C67275a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C67275a f150759a = new C67275a();

        static {
            Covode.recordClassIndex(78894);
        }

        C67275a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("optimize_cachevideocount", 2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.s.g$b */
    static final class C67276b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67276b f150760a = new C67276b();

        static {
            Covode.recordClassIndex(78895);
        }

        C67276b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_preloadallvideo", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.s.g$c */
    static final class C67277c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67277c f150761a = new C67277c();

        static {
            Covode.recordClassIndex(78896);
        }

        C67277c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_preloadonlywifi", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.s.g$d */
    static final class C67278d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67278d f150762a = new C67278d();

        static {
            Covode.recordClassIndex(78897);
        }

        C67278d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_preloadvideocover", false));
        }
    }

    static {
        Covode.recordClassIndex(78893);
    }
}
