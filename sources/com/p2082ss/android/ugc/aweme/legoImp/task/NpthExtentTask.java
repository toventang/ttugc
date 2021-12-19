package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.crash.runtime.ConfigManager;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.app.p2323d.C33724a;
import com.p2082ss.android.ugc.aweme.app.p2323d.C33726b;
import com.p2082ss.android.ugc.aweme.app.p2323d.C33728d;
import com.p2082ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask;
import com.p2082ss.android.ugc.aweme.experiment.C46906es;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53433a;
import com.p2082ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import com.p2082ss.android.ugc.aweme.launcher.service.godzilla.C58080a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.C53606h;
import com.p2082ss.android.ugc.aweme.services.performance.ICrashReportService;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.NpthExtentTask */
public class NpthExtentTask implements AbstractC58084a, AbstractC58264w {
    static {
        Covode.recordClassIndex(68548);
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return C58444q.f133061a;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: c */
    public final String[] mo28603c() {
        return new String[]{"AccountInitializerTask"};
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (!C29843f.m60132b(context).contains("miniapp")) {
            C53606h.f123025a.lock();
            if (C46906es.m90211b()) {
                new NpthCoreInitTask().mo28600a(context);
            }
            try {
                Npth.registerCrashCallback(new C58447t(context), CrashType.ALL);
                C51423a.m95787a("NpthTask");
                C53433a.m98609a();
                ConfigManager configManager = Npth.getConfigManager();
                LauncherServiceImpl.m104924b();
                configManager.setDebugMode(false);
                ICrashReportService provideErrorReporter = AVExternalServiceImpl.m113114a().provideErrorReporter();
                Npth.registerCrashCallback(new C58450w(provideErrorReporter), CrashType.NATIVE);
                Npth.registerCrashCallback(new C58451x(provideErrorReporter), CrashType.JAVA);
                Npth.setAttachUserData(new C33726b(context, new C33728d()), CrashType.ALL);
                new AddInstalledModulesInfoTask().mo28600a(context);
                AVExternalServiceImpl.m113114a().provideErrorReporter().addCrashEffectIdInfoListener(C58448u.f133068a);
                if (C46906es.m90211b()) {
                    C29339a.m58753a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.legoImp.task.NpthExtentTask.RunnableC583711 */

                        static {
                            Covode.recordClassIndex(68549);
                        }

                        public final void run() {
                            new C33724a().run();
                        }
                    }, 200);
                }
                C58080a.f132322a.mo95585a();
                Npth.customActivityName(C58449v.f133069a);
            } finally {
                C53606h.f123025a.unlock();
            }
        }
    }
}
