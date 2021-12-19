package com.p2082ss.android.ugc.aweme.application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.AbstractC16085l;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.statisticlogger.p1278b.C18214a;
import com.bytedance.librarian.Librarian;
import com.bytedance.librarian.LibrarianMonitor;
import com.bytedance.mira.plugin.hook.flipped.C21414a;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.legoapi.C29952a;
import com.p2082ss.android.legoapi.abtest.C29953a;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.p2144h.C29921d;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.p2082ss.android.ugc.aweme.app.launch.C33804a;
import com.p2082ss.android.ugc.aweme.app.p2333k.C33799a;
import com.p2082ss.android.ugc.aweme.app.services.C33848b;
import com.p2082ss.android.ugc.aweme.application.C33909m;
import com.p2082ss.android.ugc.aweme.application.C33914o;
import com.p2082ss.android.ugc.aweme.experiment.C46714av;
import com.p2082ss.android.ugc.aweme.experiment.C46732bf;
import com.p2082ss.android.ugc.aweme.experiment.C46906es;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.launcher.service.account.C58078a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.C58206e;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58420ae;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58421af;
import com.p2082ss.android.ugc.aweme.legoImp.task.ColdBootInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.p3489b.C61308a;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34777a;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34778b;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34780c;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34786h;
import com.p2082ss.android.ugc.aweme.p2387bf.C34818a;
import com.p2082ss.android.ugc.aweme.p2433ca.C35343b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.setting.TiktokSkinHelper;
import com.p2082ss.android.ugc.aweme.storagemanager.C76422a;
import com.p2082ss.android.ugc.aweme.utils.C80229aw;
import com.p2082ss.android.ugc.aweme.utils.DeadSystemExceptionTask;
import com.p2082ss.android.ugc.trill.p4380i.C85090a;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.application.AwemeApplicationImpl */
public class AwemeApplicationImpl extends AbstractC33901f {

    /* renamed from: a */
    public static long f80182a;

    /* renamed from: b */
    public final AbstractC33896a f80183b = new AwemeAppTaskProvider();

    /* renamed from: c */
    protected Application f80184c;

    /* renamed from: d */
    protected AppBuildConfig f80185d;

    /* renamed from: e */
    public AbstractC58264w f80186e;

    /* renamed from: f */
    public AbstractC58264w f80187f;

    /* renamed from: g */
    public C58221f.C58225d f80188g;

    /* renamed from: h */
    public C58221f.C58225d f80189h;

    /* renamed from: i */
    private final AbstractC33903h f80190i;

    /* renamed from: j */
    private boolean f80191j;

    static {
        Covode.recordClassIndex(40809);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.application.AwemeApplicationImpl$BeforeSuperOnCreateLegoTasks */
    public class BeforeSuperOnCreateLegoTasks implements AbstractC58084a, AbstractC58264w {
        static {
            Covode.recordClassIndex(40812);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
        /* renamed from: c */
        public final String[] mo28603c() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
        /* renamed from: d */
        public final int mo28604d() {
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

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BACKGROUND;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
        /* renamed from: e */
        public final EnumC58149ac mo28605e() {
            return EnumC58149ac.CPU;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        BeforeSuperOnCreateLegoTasks() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            AwemeApplicationImpl awemeApplicationImpl = AwemeApplicationImpl.this;
            awemeApplicationImpl.f80189h = AwemeApplicationImpl.m69371b(awemeApplicationImpl.f80183b.mo60124c());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.application.AwemeApplicationImpl$OnCreateLegoTasks */
    public class OnCreateLegoTasks implements AbstractC58084a, AbstractC58264w {
        static {
            Covode.recordClassIndex(40813);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
        /* renamed from: c */
        public final String[] mo28603c() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
        /* renamed from: d */
        public final int mo28604d() {
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

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BACKGROUND;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
        /* renamed from: e */
        public final EnumC58149ac mo28605e() {
            return EnumC58149ac.CPU;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        OnCreateLegoTasks() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            AwemeApplicationImpl awemeApplicationImpl = AwemeApplicationImpl.this;
            awemeApplicationImpl.f80188g = AwemeApplicationImpl.m69371b(awemeApplicationImpl.f80183b.mo60125d());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33901f, com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: c */
    public final boolean mo60139c() {
        return this.f80191j;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33901f, com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: d */
    public final boolean mo60140d() {
        return this.f80191j;
    }

    /* access modifiers changed from: protected */
    public void handleAttachBaseContext() {
        C33899d.handleAttachBaseContext(this);
    }

    /* access modifiers changed from: protected */
    public List<AbstractC58252n> attachBaseContextAfterMultiDex() {
        return C33900e.attachBaseContextAfterMultiDex(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33901f, com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: b */
    public final void mo60137b() {
        if (!this.f80191j) {
            if (C58221f.m105150b()) {
                C58221f.m105147a(this.f80186e);
                this.f80188g.mo95704a(new MainLooperOptService());
                this.f80188g.mo95706a();
            } else {
                m69370a(this.f80183b.mo60125d());
            }
            m69370a(this.f80183b.mo60126e());
            new RunnableC34778b().run();
            if (C29843f.m60129a(this.f80184c)) {
                C58945a.C58947b.f134185a.mo96429b("cold_boot_application_create_duration", true);
                C80229aw.m139065b("cold_boot_application_create_duration");
                C58945a.C58947b.f134185a.mo96425a("cold_boot_application_to_main", true);
                C80229aw.m139064a("cold_boot_application_to_main");
                C58945a.C58947b.f134185a.mo96425a("cold_boot_application_to_stubmain", false);
                C58945a.C58947b.f134185a.f134182i = System.currentTimeMillis();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33901f, com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final void mo60131a() {
        if (!this.f80191j) {
            if (C29843f.m60129a(this.f80184c)) {
                C58945a.C58947b.f134185a.mo96429b("cold_boot_application_attach_to_create", true);
                C80229aw.m139065b("cold_boot_application_attach_to_create");
                C58945a.C58947b.f134185a.mo96425a("cold_boot_application_create_duration", true);
                C80229aw.m139064a("cold_boot_application_create_duration");
            }
            if (C67214a.m119160j()) {
                C58221f.m105147a(DeadSystemExceptionTask.f179611a);
            }
            C58221f.C58225d e = C58221f.m105153e();
            if (C67214a.m119154d()) {
                C30061a.m60799a(C17879g.m33104a());
                e.mo95704a(C58420ae.m106849q()).mo95704a(C58420ae.m106837e());
            }
            e.mo95704a(C58420ae.m106849q());
            if (!SettingsRequestServiceImpl.m65417i().mo57290h()) {
                e.mo95704a(C58420ae.m106833a());
            }
            e.mo95706a();
            if (!C67214a.m119152b()) {
                Application application = this.f80184c;
                C76422a.m133937a(application, C29843f.m60129a(application));
            }
            if (C58221f.m105150b()) {
                C58221f.m105147a(this.f80187f);
                this.f80189h.mo95706a();
                return;
            }
            m69370a(this.f80183b.mo60124c());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33901f, com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final Resources mo60129a(Resources resources) {
        TiktokSkinHelper.m120292a(resources);
        return resources;
    }

    /* renamed from: a */
    static void m69370a(List<AbstractC58252n> list) {
        C58221f.C58225d b = m69371b(list);
        if (b != null) {
            b.mo95706a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33901f, com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final void mo60132a(int i) {
        new C58221f.C58224c().mo95703b((AbstractC58264w) new TrimMemoryTask(i)).mo95706a();
    }

    /* renamed from: b */
    public static C58221f.C58225d m69371b(List<AbstractC58252n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        C58221f.C58225d a = C33916p.m69446a("application", C58221f.m105148a());
        for (AbstractC58252n nVar : list) {
            a.mo95704a(nVar);
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33901f, com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final String mo60130a(String str) {
        Logger.debug();
        String b = C29843f.m60132b(this.f80184c);
        if (!C13627m.m24498a(b) && !C13627m.m24498a(str) && b.endsWith(":ad")) {
            int i = Build.VERSION.SDK_INT;
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33901f, com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final void mo60133a(final Context context) {
        Librarian.m38961a(context, this.f80185d.mo28435a(), new LibrarianMonitor() {
            /* class com.p2082ss.android.ugc.aweme.application.AwemeApplicationImpl.C338941 */

            static {
                Covode.recordClassIndex(40810);
            }

            @Override // com.bytedance.librarian.LibrarianMonitor
            /* renamed from: a */
            public final void mo34116a(String str) {
                C33912n.m69444a(context, str, true, true);
                super.mo34116a(str);
                C33912n.m69444a(context, str, true, false);
            }
        });
        if (Build.VERSION.SDK_INT >= 30 || (Build.VERSION.SDK_INT == 29 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            C21414a.m40195a();
        }
        C58003a.m104825a(this.f80184c, context);
        C33799a.m69150a(this.f80185d.mo28436b());
        C17867d.m33080a("api.tiktokv.com", "ichannel-va.tiktokv.com", "api.tiktokv.com");
        C58078a.f132318a.mo95573a(C17867d.f42587k.f42569a, C17867d.f42587k.f42570b, C17867d.f42587k.f42571c);
        C58078a.f132318a.mo95579b("trill");
        C61308a.m110985a();
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33901f, com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final void mo60134a(Configuration configuration) {
        super.mo60134a(configuration);
        InitAllServiceImpl.m68762q().mo59723n();
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33901f, com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: b */
    public final void mo60138b(Context context) {
        if (C29843f.m60129a(this.f80184c)) {
            C58945a.C58947b.f134185a.mo96425a("app_start_to_main_focus_v2", true);
            C58945a.C58947b.f134185a.mo96425a("app_start_v2_to_v1", true);
            C58945a.C58947b.f134185a.mo96425a("cold_boot_application_attach_before_base_duration", false);
        }
        C85090a.m146307a(C29843f.m60129a(this.f80184c), this.f80184c);
        C33804a.m69169a(this.f80184c, this.f80185d);
        C34818a.m71152a(context);
        C16083j a = C16083j.m29874a();
        AbstractC16085l lVar = C33897b.f80197a;
        a.f38735c = lVar;
        C16065e.m29769a().f38697d = lVar.mo25540a();
        if (Build.VERSION.SDK_INT < 23 || !Process.is64Bit()) {
            C40780g.m82241a().execute(C33909m.RunnableC33910a.f80211a);
        }
        Application application = this.f80184c;
        C89219l.m154721d(application, "");
        if (C46732bf.m90111a() != 0) {
            try {
                if (Build.VERSION.SDK_INT < 26) {
                    C40780g.m82246c().execute(new C35343b.RunnableC35344a(application));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (((Boolean) C58206e.f132547n.getValue()).booleanValue() && Build.VERSION.SDK_INT > 21) {
            C40780g.m82241a().execute(C33909m.RunnableC33911b.f80212a);
        }
        C33804a.m69168a(this.f80184c);
        this.f80190i.mo59999a(this.f80184c);
        if (((Boolean) C67214a.f150652f.getValue()).booleanValue()) {
            C58221f.m105153e().mo95704a(C29953a.f71445a.mo52300c()).mo95706a();
        }
        if (Build.VERSION.SDK_INT > 19 && C29843f.m60129a(context) && ((Boolean) C58152b.f132416c.getValue()).booleanValue()) {
            C40780g.m82241a().execute(C33914o.RunnableC33915a.f80222a);
        }
        if (C58195d.m105111d()) {
            new RunnableC34786h().run();
            new PreloadWireFieldNoEnumClassTask().mo28600a(this.f80184c);
            new RunnableC34780c().run();
            new RunnableC34777a().run();
        }
        if (C46906es.m90212c() || C46906es.m90213d()) {
            C40780g.m82245b().execute(RunnableC33898c.f80198a);
        }
        if (C29843f.m60129a(this.f80184c)) {
            C58945a.C58947b.f134185a.mo96429b("cold_boot_application_attach_before_base_duration", false);
        }
        if (C18214a.m33891b()) {
            C29921d.f71397d.putAll(new HashMap<String, Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.application.AwemeApplicationImpl.C338952 */

                static {
                    Covode.recordClassIndex(40811);
                }

                {
                    put("activity", true);
                    put("show", true);
                    put("launch_time", true);
                    put("feed_request", true);
                    put("feed_request_response", true);
                    put("launch_app", true);
                    put("launch_log", true);
                    put("firebase_to_server", true);
                }
            });
        }
        if (((Boolean) C46714av.f108881b.getValue()).booleanValue()) {
            C40780g.m82245b().execute(C58421af.RunnableC58422a.f133031a);
        }
        if (C67214a.m119159i()) {
            C58221f.m105153e().mo95704a(C58420ae.m106846n()).mo95706a();
        }
        if (C29843f.m60129a(this.f80184c)) {
            C80229aw.m139064a("cold_boot_application_attach_duration");
        }
        if (C46906es.m90213d() || C46906es.m90212c()) {
            C58221f.m105153e().mo95704a(C29952a.f71443a.mo52288f()).mo95706a();
        }
        C58221f.m105153e().mo95704a(new ColdBootInitTask()).mo95706a();
        if (C67214a.m119166p()) {
            C58221f.m105153e().mo95704a(C58420ae.m106852t()).mo95706a();
        }
        m69370a(this.f80183b.mo60122a());
        boolean a2 = C33848b.m69285a(this.f80184c);
        this.f80191j = a2;
        if (!a2) {
            f80182a = System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h;
            handleAttachBaseContext();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo60135a(C58221f.C58225d dVar) {
        if (C67214a.m119152b()) {
            Application application = this.f80184c;
            C76422a.m133937a(application, C29843f.m60129a(application));
            dVar.mo95704a(C58420ae.m106849q()).mo95704a(C58420ae.m106847o());
            AbstractC58264w e = SplashAdServiceImpl.m33397i().mo28719e();
            if (e != null) {
                dVar.mo95704a(e);
            }
        }
    }

    public AwemeApplicationImpl(Application application, AppBuildConfig appBuildConfig, AbstractC33903h hVar) {
        this.f80184c = application;
        this.f80185d = appBuildConfig;
        this.f80190i = hVar;
    }
}
