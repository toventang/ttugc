package com.p2082ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.task.HybridABFrameworkInitTask */
public final class HybridABFrameworkInitTask implements AbstractC58264w {

    /* renamed from: a */
    public static AbstractC88412b f133075a;

    /* renamed from: b */
    public static final long f133076b = SystemClock.elapsedRealtime();

    /* renamed from: c */
    public static final AbstractC89244h f133077c = C89250i.m154773a((AbstractC89171a) C58458c.f133086a);

    /* renamed from: d */
    public static final AbstractC88433f<C89391z> f133078d = C58460e.f133088a;

    /* renamed from: e */
    public static final AbstractC88433f<Throwable> f133079e = C58459d.f133087a;

    /* renamed from: f */
    public static final C58456a f133080f = new C58456a((byte) 0);

    /* renamed from: g */
    private static boolean f133081g;

    /* renamed from: h */
    private static final DeviceRegisterManager.AbstractC29864a f133082h = new C58457b();

    /* renamed from: com.ss.android.ugc.aweme.legoImpl.task.HybridABFrameworkInitTask$HybridApi */
    public interface HybridApi {

        /* renamed from: a */
        public static final C58455a f133083a = C58455a.f133084a;

        static {
            Covode.recordClassIndex(68726);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/hybrid/ab/")
        AbstractC88979t<C89391z> request(@AbstractC89736t(mo144292a = "group_num") int i);

        /* renamed from: com.ss.android.ugc.aweme.legoImpl.task.HybridABFrameworkInitTask$HybridApi$a */
        public static final class C58455a {

            /* renamed from: a */
            static final /* synthetic */ C58455a f133084a = new C58455a();

            private C58455a() {
            }

            static {
                Covode.recordClassIndex(68727);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImpl.task.HybridABFrameworkInitTask$a */
    public static final class C58456a {
        static {
            Covode.recordClassIndex(68728);
        }

        /* renamed from: a */
        public static int m107088a() {
            return ((Number) HybridABFrameworkInitTask.f133077c.getValue()).intValue();
        }

        private C58456a() {
        }

        /* renamed from: b */
        public static void m107090b() {
            HybridABFrameworkInitTask.f133075a = ((HybridApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(HybridApi.class)).request(m107088a()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(HybridABFrameworkInitTask.f133078d, HybridABFrameworkInitTask.f133079e);
        }

        public /* synthetic */ C58456a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m107089a(int i, int i2) {
            C39162r.m79460a("ab_backend_response_received", new C33744d().mo59980a("group_num", i).mo59980a("duration", i2).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImpl.task.HybridABFrameworkInitTask$b */
    public static final class C58457b implements DeviceRegisterManager.AbstractC29864a {

        /* renamed from: a */
        private boolean f133085a;

        static {
            Covode.recordClassIndex(68729);
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29066a(boolean z, boolean z2) {
        }

        C58457b() {
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29065a(boolean z) {
            if (z && !this.f133085a) {
                this.f133085a = true;
                C58456a.m107090b();
            }
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29064a(String str, String str2) {
            if (!this.f133085a) {
                this.f133085a = true;
                C58456a.m107090b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImpl.task.HybridABFrameworkInitTask$c */
    static final class C58458c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C58458c f133086a = new C58458c();

        static {
            Covode.recordClassIndex(68730);
        }

        C58458c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C58463b.m107157a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(68725);
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImpl.task.HybridABFrameworkInitTask$d */
    static final class C58459d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C58459d f133087a = new C58459d();

        static {
            Covode.recordClassIndex(68731);
        }

        C58459d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            HybridABInfoService.m69246b().mo60085a(true);
            C58456a.m107089a(C58456a.m107088a(), (int) (SystemClock.elapsedRealtime() - HybridABFrameworkInitTask.f133076b));
            AbstractC88412b bVar = HybridABFrameworkInitTask.f133075a;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImpl.task.HybridABFrameworkInitTask$e */
    static final class C58460e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C58460e f133088a = new C58460e();

        static {
            Covode.recordClassIndex(68732);
        }

        C58460e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            HybridABInfoService.m69246b().mo60085a(true);
            C58456a.m107089a(C58456a.m107088a(), (int) (SystemClock.elapsedRealtime() - HybridABFrameworkInitTask.f133076b));
            AbstractC88412b bVar = HybridABFrameworkInitTask.f133075a;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C58945a.C58947b.f134185a.mo96425a("method_hybrid_ab_run_duration", false);
        if (!f133081g) {
            f133081g = true;
            if (C49907s.m93685a().booleanValue() && (C58463b.m107157a() == C58463b.f133095b || C58463b.m107157a() == C58463b.f133096c)) {
                HybridABInfoService.m69246b().mo60085a(false);
                C58456a.m107090b();
            } else if (C49907s.m93685a().booleanValue() && C58463b.m107157a() == C58463b.f133094a) {
                HybridABInfoService.m69246b().mo60085a(false);
                DeviceRegisterManager.addOnDeviceConfigUpdateListener(f133082h);
            }
            C58945a.C58947b.f134185a.mo96429b("method_hybrid_ab_run_duration", false);
        }
    }
}
