package com.bytedance.jedi.p1445a.p1463m;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.a.m.g */
public final class C20344g {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f48213a = {new C89232y(C89204ab.m154669a(C20344g.class), "CPU_COUNT", "getCPU_COUNT()I"), new C89232y(C89204ab.m154669a(C20344g.class), "CORE_POOL_SIZE", "getCORE_POOL_SIZE()I"), new C89232y(C89204ab.m154669a(C20344g.class), "MAXIMUM_POOL_SIZE", "getMAXIMUM_POOL_SIZE()I"), new C89232y(C89204ab.m154669a(C20344g.class), "defaultScheduler", "getDefaultScheduler()Lio/reactivex/Scheduler;")};

    /* renamed from: b */
    static final AbstractC89244h f48214b = C89250i.m154773a((AbstractC89171a) C20345a.f48219a);

    /* renamed from: c */
    static final AbstractC89244h f48215c = C89250i.m154773a((AbstractC89171a) C20347c.f48221a);

    /* renamed from: d */
    public static final AbstractC89244h f48216d = C89250i.m154773a((AbstractC89171a) C20348d.f48222a);

    /* renamed from: e */
    public static final C20344g f48217e = new C20344g();

    /* renamed from: f */
    private static final AbstractC89244h f48218f = C89250i.m154773a((AbstractC89171a) C20346b.f48220a);

    /* renamed from: a */
    public static int m38546a() {
        return ((Number) f48218f.getValue()).intValue();
    }

    private C20344g() {
    }

    /* renamed from: com.bytedance.jedi.a.m.g$b */
    static final class C20346b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C20346b f48220a = new C20346b();

        static {
            Covode.recordClassIndex(23854);
        }

        C20346b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Runtime.getRuntime().availableProcessors());
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.g$c */
    static final class C20347c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C20347c f48221a = new C20347c();

        static {
            Covode.recordClassIndex(23855);
        }

        C20347c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((C20344g.m38546a() * 2) + 1);
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.g$a */
    static final class C20345a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C20345a f48219a = new C20345a();

        static {
            Covode.recordClassIndex(23853);
        }

        C20345a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Math.max(2, Math.min(C20344g.m38546a() - 1, 4)));
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.g$d */
    static final class C20348d extends AbstractC89220m implements AbstractC89171a<AbstractC88398aa> {

        /* renamed from: a */
        public static final C20348d f48222a = new C20348d();

        static {
            Covode.recordClassIndex(23856);
        }

        C20348d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC88398aa invoke() {
            return C88946a.m154209a(new ThreadPoolExecutor(((Number) C20344g.f48214b.getValue()).intValue(), ((Number) C20344g.f48215c.getValue()).intValue(), 0, TimeUnit.SECONDS, new LinkedBlockingQueue()));
        }
    }

    static {
        Covode.recordClassIndex(23852);
    }
}
