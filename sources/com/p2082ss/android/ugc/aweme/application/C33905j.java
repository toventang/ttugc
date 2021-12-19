package com.p2082ss.android.ugc.aweme.application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.appcompat.widget.C0414aq;
import com.bytedance.apm.trace.C12609b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.librarian.Librarian;
import com.bytedance.librarian.LibrarianMonitor;
import com.bytedance.mira.plugin.hook.flipped.C21414a;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.C27910f;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.legoapi.C29952a;
import com.p2082ss.android.legoapi.C29954b;
import com.p2082ss.android.legoapi.abtest.C29953a;
import com.p2082ss.android.legoimpl.ExperienceKitInitTask;
import com.p2082ss.android.legoimpl.ProcessMonitorTask;
import com.p2082ss.android.legoimpl.StoragePolicyTask;
import com.p2082ss.android.ugc.aweme.app.C33588ad;
import com.p2082ss.android.ugc.aweme.app.launch.C33804a;
import com.p2082ss.android.ugc.aweme.app.p2333k.C33799a;
import com.p2082ss.android.ugc.aweme.app.services.C33848b;
import com.p2082ss.android.ugc.aweme.childhook.C35688b;
import com.p2082ss.android.ugc.aweme.childhook.C35690c;
import com.p2082ss.android.ugc.aweme.childhook.C35691d;
import com.p2082ss.android.ugc.aweme.childhook.C35692e;
import com.p2082ss.android.ugc.aweme.device.DeviceInfoReportTask;
import com.p2082ss.android.ugc.aweme.dynamicfeature.AabPluginServiceInitTask;
import com.p2082ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.launcher.service.account.C58078a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume;
import com.p2082ss.android.ugc.aweme.legoImp.task.AlertDialogInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.BulletAssemblerInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.BulletPreloadTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58420ae;
import com.p2082ss.android.ugc.aweme.legoImp.task.EnterMusicGuideColdStartTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.FontTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitFramework;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitMusicManager;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitMusicServiceTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitReportSignature;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitTaskManager;
import com.p2082ss.android.ugc.aweme.legoImp.task.JacocoTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.KidsModeInitBulletJsbTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.KidsModeInitRouterTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.KidsModeInitRuntimeTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.KidsModeInitSettingTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.KidsModeLegacyTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.MigrationTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadResCleanerTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.RegisterMigrationTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.ResetTTNetworkStateIndexTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SetAppTrackTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.StorageTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.ThreadPoolInjectTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.UpdateLocale;
import com.p2082ss.android.ugc.aweme.legoImp.task.WorkManagerDelayInit;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.InitDownloadComponentTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWebViewClientHookCallback;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.NetworkUtilsTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.uitask.KidsModeProfileInfoTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.uitask.TuxInitTask;
import com.p2082ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.p3489b.C61308a;
import com.p2082ss.android.ugc.aweme.net.p3493f.C61352h;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34784f;
import com.p2082ss.android.ugc.aweme.p2387bf.C34818a;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.storagemanager.C76422a;
import com.p2082ss.android.ugc.trill.p4380i.C85090a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Iterator;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89167q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;

/* renamed from: com.ss.android.ugc.aweme.application.j */
public class C33905j implements AbstractC33904i {

    /* renamed from: a */
    public Application f80200a;

    /* renamed from: b */
    public boolean f80201b;

    /* renamed from: c */
    private AppBuildConfig f80202c;

    /* renamed from: d */
    private AbstractC33903h f80203d;

    /* renamed from: e */
    private long f80204e = -1;

    /* renamed from: f */
    private boolean f80205f;

    static {
        Covode.recordClassIndex(40823);
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final Resources mo60129a(Resources resources) {
        return resources;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final String mo60130a(String str) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final void mo60134a(Configuration configuration) {
    }

    /* access modifiers changed from: protected */
    public void attachBaseContextAfterMultiDex() {
        C33908l.attachBaseContextAfterMultiDex(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: c */
    public final boolean mo60139c() {
        return this.f80205f;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: d */
    public final boolean mo60140d() {
        return this.f80205f;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final void mo60131a() {
        C76422a.m133937a(this.f80200a, this.f80201b);
        C58221f.m105153e().mo95704a(C29954b.f71447a.mo52294c()).mo95704a(C29953a.f71445a.mo52298a()).mo95704a(new MigrationTask()).mo95704a(new StoragePolicyTask()).mo95704a(new RegisterMigrationTask()).mo95706a();
        C58945a.C58947b.f134185a.mo96425a("method_init_ttnet_duration", false);
        C58221f.m105153e().mo95704a(new ResetTTNetworkStateIndexTask()).mo95704a(new InitTTNetTask()).mo95706a();
        C58945a.C58947b.f134185a.mo96429b("method_init_ttnet_duration", false);
        if (this.f80201b) {
            C58221f.m105153e().mo95704a(C58420ae.m106835c()).mo95704a(new KidsModeInitRouterTask()).mo95704a(new FontTask()).mo95706a();
        }
        C58221f.m105153e().mo95704a(C29952a.f71443a.mo52288f()).mo95704a(C29952a.f71443a.mo52285c()).mo95704a(C29954b.f71447a.mo52295d()).mo95704a(C58420ae.m106843k()).mo95706a();
        AbstractC58264w initBoeTask = C58939a.C58940a.f134171a.f134170a.getInitBoeTask();
        if (initBoeTask != null) {
            C58221f.m105153e().mo95704a(initBoeTask).mo95706a();
        }
        if (this.f80201b) {
            C58221f.m105153e().mo95704a(C58420ae.m106834b()).mo95704a(AccountInitializerTaskImpl.m107036f().mo52279b()).mo95706a();
        }
        if (this.f80201b) {
            C58221f.m105153e().mo95704a(new AabPluginServiceInitTask()).mo95706a();
        }
        C58945a.C58947b.f134185a.mo96425a("method_thread_pool_inject_duration", false);
        C58221f.m105153e().mo95704a(new ThreadPoolInjectTask()).mo95706a();
        C58945a.C58947b.f134185a.mo96429b("method_thread_pool_inject_duration", false);
        C61352h.f139334a = CallableC33907k.f80208a;
        if (this.f80201b) {
            C58221f.m105153e().mo95704a(new TuxInitTask()).mo95706a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: b */
    public final void mo60137b() {
        KidsCommonServiceImpl.m104422g().mo94339f();
        AVExternalServiceImpl.m113114a().attachApplication(this.f80200a);
        if (this.f80201b) {
            C58221f.m105153e().mo95704a(C58420ae.m106836d()).mo95706a();
        }
        C58221f.m105153e().mo95704a(new NetworkUtilsTask()).mo95706a();
        if (this.f80201b) {
            new C58221f.C58224c().mo95703b((AbstractC58264w) new JsBridge2InitTask(EnumC58151ae.BACKGROUND)).mo95703b((AbstractC58264w) new JsBridge2InitTask(EnumC58151ae.BOOT_FINISH)).mo95703b((AbstractC58264w) new KidsModeInitRuntimeTask(this.f80200a)).mo95703b((AbstractC58264w) new KidsModeInitBulletJsbTask(this.f80200a)).mo95706a();
        }
        C0414aq.f1630a = true;
        C58221f.m105153e().mo95704a(new KidsModeLegacyTask()).mo95704a(C58420ae.m106833a()).mo95704a(new UpdateLocale()).mo95704a(new InitFramework()).mo95704a(new AdjustMusicVolume()).mo95704a(C58420ae.m106845m()).mo95704a(new InitReportSignature()).mo95704a(new InitTaskManager()).mo95704a(AccountInitializerTaskImpl.m107036f().mo52278a()).mo95704a(new AlertDialogInitTask()).mo95703b(new InitMusicManager()).mo95706a();
        C58221f.m105153e().mo95704a(new GetGoogleAIdTask()).mo95704a(C29952a.f71443a.mo52284b()).mo95704a(new BulletPreloadTask()).mo95704a(new BulletAssemblerInitTask()).mo95706a();
        C58221f.C58225d a = C58221f.m105153e().mo95704a(new SetAppTrackTask()).mo95704a(AVExternalServiceImpl.m113114a().initService().initTask(1)).mo95704a(new DeviceInfoReportTask()).mo95704a(new StorageTask()).mo95704a(new JacocoTask()).mo95704a(new WorkManagerDelayInit());
        if (TextUtils.equals(C17867d.f42595s, "local_test")) {
            a.mo95704a(C29952a.f71443a.mo52286d());
        } else {
            a.mo95704a(C29952a.f71443a.mo52283a());
        }
        if (Build.VERSION.SDK_INT < 28) {
            a.mo95704a(new PreloadResCleanerTask());
        }
        a.mo95706a();
        C58221f.m105153e().mo95704a(new EnterMusicGuideColdStartTask()).mo95704a(new InitMusicServiceTask()).mo95706a();
        C58221f.m105153e().mo95704a(new ApmInit()).mo95706a();
        C58221f.m105153e().mo95704a(new InitDownloadComponentTask()).mo95704a(new InitWebViewClientHookCallback()).mo95704a(new ProcessMonitorTask()).mo95704a(new ExperienceKitInitTask()).mo95706a();
        if (this.f80201b) {
            C89219l.m154719c(this.f80200a, "");
        }
        if (C67214a.m119155e()) {
            C58221f.m105147a(C58420ae.m106845m());
            InitAVModule.m105770c();
        }
        if (this.f80201b) {
            C58221f.m105153e().mo95704a(new KidsModeInitSettingTask()).mo95704a(new KidsModeProfileInfoTask()).mo95706a();
        }
        new RunnableC34784f().run();
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final void mo60132a(int i) {
        if (this.f80204e == -1) {
            this.f80204e = C33588ad.m68794a(this.f80200a);
        }
        if (this.f80204e == Thread.currentThread().getId()) {
            C58221f.m105153e().mo95704a(new TrimMemoryTask(i)).mo95706a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public final void mo60133a(final Context context) {
        Librarian.m38961a(context, this.f80202c.mo28435a(), new LibrarianMonitor() {
            /* class com.p2082ss.android.ugc.aweme.application.C33905j.C339061 */

            static {
                Covode.recordClassIndex(40824);
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
        C58003a.m104825a(this.f80200a, context);
        C33799a.m69150a(this.f80202c.mo28436b());
        C17867d.m33080a("api.tiktokv.com", "ichannel-va.tiktokv.com", "api.tiktokv.com");
        C58078a.f132318a.mo95573a(C17867d.f42587k.f42569a, C17867d.f42587k.f42570b, C17867d.f42587k.f42571c);
        C58078a.f132318a.mo95579b("trill");
        C61308a.m110985a();
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: b */
    public final void mo60138b(Context context) {
        MethodCollector.m26663i(4420);
        this.f80201b = C29843f.m60129a(this.f80200a);
        C85090a.m146307a(C29843f.m60129a(this.f80200a), this.f80200a);
        C33804a.m69169a(this.f80200a, this.f80202c);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_application_attach_before_base_duration", false);
        C12609b.m22738a();
        C34818a.m71152a(context);
        C33804a.m69168a(this.f80200a);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_application_attach_before_base_duration", false);
        this.f80203d.mo59999a(this.f80200a);
        boolean a = C33848b.m69285a(this.f80200a);
        this.f80205f = a;
        if (a) {
            MethodCollector.m26664o(4420);
            return;
        }
        C89219l.m154721d(context, "");
        InputStream open = context.getAssets().open("kids_mode_allowlist.json");
        C89219l.m154716b(open, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
        try {
            AbstractC89306h<String> a2 = C89167q.m154661a(bufferedReader);
            StringBuilder sb = new StringBuilder();
            Iterator<String> a3 = a2.mo2926a();
            while (a3.hasNext()) {
                sb.append(a3.next());
            }
            String sb2 = sb.toString();
            C89146c.m154636a(bufferedReader, null);
            C89219l.m154716b(sb2, "");
            C35692e.f84187a = (C35691d) new C27910f().mo46670a(sb2, C35691d.class);
            C35690c.m72854a();
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
                Field declaredField = invoke.getClass().getDeclaredField("mH");
                C89219l.m154716b(declaredField, "");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                if (obj != null) {
                    Handler handler = (Handler) obj;
                    Field declaredField2 = Handler.class.getDeclaredField("mCallback");
                    C89219l.m154716b(declaredField2, "");
                    declaredField2.setAccessible(true);
                    declaredField2.set(handler, new C35688b.C35689a((Handler.Callback) declaredField2.get(handler)));
                    attachBaseContextAfterMultiDex();
                    MethodCollector.m26664o(4420);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.os.Handler");
                MethodCollector.m26664o(4420);
                throw nullPointerException;
            } catch (Exception e) {
                e.printStackTrace();
                C13468b.m24211a(e, "ChildBroadcastReceiverHook.startHook");
            }
        } catch (Throwable th) {
            C89146c.m154636a(bufferedReader, th);
            MethodCollector.m26664o(4420);
            throw th;
        }
    }

    public C33905j(Application application, AppBuildConfig appBuildConfig, AbstractC33903h hVar) {
        this.f80200a = application;
        this.f80202c = appBuildConfig;
        this.f80203d = hVar;
    }
}
