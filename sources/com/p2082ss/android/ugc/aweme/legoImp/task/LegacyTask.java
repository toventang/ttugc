package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.deviceregister.p2134a.C29866a;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.newmedia.C30124b;
import com.p2082ss.android.ugc.aweme.app.C33588ad;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.CommandDispatcher;
import com.p2082ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.p2082ss.android.ugc.aweme.app.launch.C33818b;
import com.p2082ss.android.ugc.aweme.app.launch.C33822c;
import com.p2082ss.android.ugc.aweme.app.launch.C33826d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2640d.C39239a;
import com.p2082ss.android.ugc.aweme.experiment.C46691ah;
import com.p2082ss.android.ugc.aweme.experiment.C46791ch;
import com.p2082ss.android.ugc.aweme.experiment.C46883ek;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.launcher.service.account.C58078a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.sec.C67835h;
import com.p2082ss.android.ugc.aweme.sec.C67836i;
import com.p2082ss.android.ugc.aweme.statistic.C75236b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LegacyTask */
public class LegacyTask implements AbstractC58264w {

    /* renamed from: a */
    Application f132896a;

    /* renamed from: b */
    boolean f132897b;

    /* renamed from: c */
    String f132898c = C18205a.m33878a();

    static {
        Covode.recordClassIndex(68526);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.LegacyTask$DeviceIdChangeTask */
    class DeviceIdChangeTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68528);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
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
            return EnumC58151ae.BOOT_FINISH;
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

        private DeviceIdChangeTask() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            new C58221f.C58224c().mo95703b(InitAllServiceImpl.m68762q().mo59711c()).mo95703b(InitAllServiceImpl.m68762q().mo59713d()).mo95706a();
            C58078a.f132318a.mo95575a(false, "did_change");
        }

        /* synthetic */ DeviceIdChangeTask(LegacyTask legacyTask, byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return C58444q.f133061a;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        boolean c;
        List<String> list;
        SharedPreferences a;
        this.f132896a = (Application) context;
        this.f132897b = C29843f.m60129a(context);
        C30061a.m60799a(this.f132896a);
        C67835h.f152033a = new C67836i();
        C51427a.f118503a = this.f132896a;
        new C58221f.C58224c().mo95703b(AccountInitializerTaskImpl.m107036f().mo52280c()).mo95706a();
        if (this.f132897b) {
            NetworkUtils.setCommandListener(CommandDispatcher.C33550a.f79692a);
            C58945a.C58947b.f134185a.mo96425a("cold_boot_legacy_init_appdata", false);
            if (!C58195d.m105112e()) {
                InitAllServiceImpl.m68762q().mo59714e();
                C33826d.m69188a();
            }
            C33818b.m69183a(this.f132896a);
            C18205a.m33880c().mo143289d(new C58443p(this));
            C33822c.m69185a(this.f132896a);
            if (!C58195d.m105113f()) {
                InitAllServiceImpl.m68762q().mo59706a();
            }
            C58945a.C58947b.f134185a.mo96429b("cold_boot_legacy_init_appdata", false);
        } else {
            String b = C29843f.m60132b(this.f132896a);
            if (!C13627m.m24498a(b) && b.endsWith(":ad")) {
                int i = Build.VERSION.SDK_INT;
                try {
                    Reflect.m24529on(this).set("mBase", new C30124b(this.f132896a.getBaseContext()));
                } catch (Throwable unused) {
                    Process.killProcess(Process.myPid());
                }
            }
            String a2 = C33588ad.m68795a(Process.myPid());
            if (a2 != null && a2.endsWith(":push")) {
                Logger.debug();
            }
        }
        Application application = this.f132896a;
        if (!(application == null || (a = C34822d.m71158a(application, C29866a.f71244a, 0)) == null)) {
            C49907s.f115049a = TextUtils.isEmpty(a.getString("device_id", ""));
        }
        if (!C58195d.m105114g()) {
            C58945a.C58947b.f134185a.mo96425a("cold_boot_legacy_init_applog", false);
            try {
                AppLog.setUseGoogleAdId(true);
            } catch (IllegalStateException e) {
                C51423a.m95787a("initApplog startLaunch:" + (System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h));
                C51423a.m95786a((Exception) e);
            }
            if (!((Boolean) C46883ek.f109258c.getValue()).booleanValue()) {
                AppLog.registerLogRequestCallback(new AppLog.AbstractC29764j() {
                    /* class com.p2082ss.android.ugc.aweme.legoImp.task.LegacyTask.C583661 */

                    static {
                        Covode.recordClassIndex(68527);
                    }

                    @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29764j
                    /* renamed from: a */
                    public final void mo52027a(List<Long> list) {
                    }

                    @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29764j
                    public final void onEventExpired(List<Long> list) {
                    }

                    @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29764j
                    /* renamed from: a */
                    public final void mo52026a(String str, String str2, String str3) {
                        if ("terminate".equals(str)) {
                            C33830n.m70668a("type_app_log_state_change", new C33743c().mo59976a("data_source", str).mo59976a("session_id", str2).mo59974a("is_success", (Integer) 1).mo59976a("eventIndex", (String) null).mo59976a("error_message", str3).mo59977a());
                        }
                    }
                });
            }
            if (C39223a.m79603q().mo68633d()) {
                c = C39239a.m79629c();
            } else {
                c = C80580in.m139687c();
            }
            AppLog.setChildModeBeforeInit(c);
            if (c) {
                list = C39223a.m79603q().mo68631c();
            } else {
                list = null;
            }
            AppLog.setWhiteEventFilterForChildMode(list);
            if (((Boolean) C46691ah.f108850c.getValue()).booleanValue()) {
                AppLog.setStartLogReaperDelay(5000);
            }
            C75236b.m132016a(this.f132896a);
            C58945a.C58947b.f134185a.mo96429b("cold_boot_legacy_init_applog", false);
        }
        if (this.f132896a.getResources() == null) {
            Process.killProcess(Process.myPid());
        }
        InitAllServiceImpl.m68762q().mo59717h();
        C17175b.C17176a.f40922a.f40921a = 0;
        C58945a.C58947b.f134185a.mo96425a("method_init_push_duration", false);
        if (!InitPushTask.m105898c()) {
            InitPushTask.m105897b(context);
        }
        C58945a.C58947b.f134185a.mo96429b("method_init_push_duration", false);
        C33744d.f79942b = C46791ch.f109011a;
    }
}
