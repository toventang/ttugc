package com.bytedance.ies.ugc.statisticlogger.config;

import android.app.Application;
import androidx.lifecycle.C1216w;
import com.bytedance.analytics.C2592b;
import com.bytedance.analytics.p125b.C2593a;
import com.bytedance.analytics.page.C2601e;
import com.bytedance.analytics.page.C2607j;
import com.bytedance.analytics.page.TrackerProcessLifecycleObserver;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.bytedance.ies.ugc.statisticlogger.C18228e;
import com.bytedance.ies.ugc.statisticlogger.p1277a.C18210b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29765a;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.p2152i.C29944a;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.service.IEtDebugService;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b */
public final class C18220b {

    /* renamed from: a */
    public static final C88958b<EnumC18224c> f43409a;

    /* renamed from: b */
    public static final C18220b f43410b = new C18220b();

    /* renamed from: c */
    private static final C18223c f43411c = new C18223c();

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b$c */
    public static final class C18223c implements AppLog.AbstractC29759e {
        static {
            Covode.recordClassIndex(20882);
        }

        C18223c() {
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29759e
        /* renamed from: a */
        public final void mo29084a() {
            C18205a.m33882e();
            C18220b.f43409a.onNext(EnumC18224c.Remote);
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29759e
        /* renamed from: b */
        public final void mo29085b() {
            System.currentTimeMillis();
            C18205a.m33882e();
            C18220b.f43409a.onNext(EnumC18224c.Local);
        }
    }

    private C18220b() {
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b$a */
    public static final class C18221a implements AppLog.AbstractC29761g {

        /* renamed from: a */
        final /* synthetic */ AbstractC18225d f43412a;

        static {
            Covode.recordClassIndex(20880);
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29761g
        /* renamed from: a */
        public final boolean mo29082a() {
            return this.f43412a.mo29087b();
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29761g
        /* renamed from: b */
        public final boolean mo29083b() {
            C89219l.m154716b(ServiceManager.get().getService(IEtDebugService.class), "");
            return C16048b.m29633a().mo25421a(true, "enable_applog_content_encrypt", true);
        }

        C18221a(AbstractC18225d dVar) {
            this.f43412a = dVar;
        }
    }

    static {
        Covode.recordClassIndex(20879);
        C88958b<EnumC18224c> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        f43409a = bVar;
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b$b */
    static final class C18222b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18222b f43413a = new C18222b();

        static {
            Covode.recordClassIndex(20881);
        }

        C18222b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((EnumC18224c) obj).name();
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            currentThread.getName();
        }
    }

    /* renamed from: a */
    public static void m33919a(AbstractC18225d dVar) {
        C89219l.m154721d(dVar, "");
        AppLog.addAppCount();
        AppLog.setIsNotRequestSender(true);
        AppLog.setReleaseBuild(C17867d.m33082c());
        C18219a.f43407a = true;
        AppLog.setAppContext(C18219a.f43408b);
        AppLog.setUseGoogleAdId(true);
        AbstractC13621j a = dVar.mo29086a().mo29088a();
        if (a != AbstractC13621j.f33100a) {
            AbstractC13621j.f33100a = a;
        }
        ((IEtDebugService) ServiceManager.get().getService(IEtDebugService.class)).mo106966a(C17867d.m33078a());
        AppLog.setLogEncryptConfig(new C18221a(dVar));
        AppLog.setConfigUpdateListener(f43411c);
        f43409a.mo143289d((AbstractC88433f<? super EnumC18224c>) C18222b.f43413a);
        C18205a.m33882e();
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(C18205a.f43385e);
        AppLog.addSessionHook(C18228e.f43420d);
        AppLog.setAliYunHanlder(C29765a.m59957a());
        Application application = dVar.f43415a;
        String valueOf = String.valueOf(C17867d.f42590n);
        C89219l.m154721d(application, "");
        C89219l.m154721d(valueOf, "");
        if (C29944a.m60344a()) {
            C18210b.C18211a aVar = C18210b.C18211a.f43393a;
            C89219l.m154721d(application, "");
            C89219l.m154721d(valueOf, "");
            C89219l.m154721d(aVar, "");
            C1216w.f4006i.getLifecycle().mo4012a(TrackerProcessLifecycleObserver.f7813a);
            application.registerActivityLifecycleCallbacks(C2607j.f7852a);
            C2592b.f7808b = valueOf;
            C2593a.f7810b = aVar;
            C18210b.C18212b bVar = new C18210b.C18212b();
            C89219l.m154721d(bVar, "");
            C2601e.f7820b = bVar;
        }
        new C58221f.C58224c().mo95703b((AbstractC58264w) new LazyLoadLegoTask(dVar.f43415a)).mo95703b((AbstractC58264w) new SetAppTrackTask()).mo95706a();
    }
}
