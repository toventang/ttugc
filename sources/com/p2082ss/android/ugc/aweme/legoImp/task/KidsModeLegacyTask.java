package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.CommandDispatcher;
import com.p2082ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.p2082ss.android.ugc.aweme.app.application.task.CommonParamsInitTask;
import com.p2082ss.android.ugc.aweme.app.launch.C33818b;
import com.p2082ss.android.ugc.aweme.app.launch.C33822c;
import com.p2082ss.android.ugc.aweme.app.launch.C33826d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2640d.C39239a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65717h;
import com.p2082ss.android.ugc.aweme.sec.C67835h;
import com.p2082ss.android.ugc.aweme.sec.C67836i;
import com.p2082ss.android.ugc.aweme.statistic.C75236b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.KidsModeLegacyTask */
public class KidsModeLegacyTask implements AbstractC58264w {

    /* renamed from: a */
    String f132885a = C18205a.m33878a();

    /* renamed from: b */
    private Application f132886b;

    /* renamed from: c */
    private boolean f132887c;

    static {
        Covode.recordClassIndex(68522);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.KidsModeLegacyTask$DeviceIdChangeTask */
    class DeviceIdChangeTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68524);
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
        }

        /* synthetic */ DeviceIdChangeTask(KidsModeLegacyTask kidsModeLegacyTask, byte b) {
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
        String b;
        boolean c;
        this.f132886b = (Application) context;
        this.f132887c = C29843f.m60129a(context);
        C67835h.f152033a = new C67836i();
        C51427a.f118503a = this.f132886b;
        C58221f.m105153e().mo95704a(AccountInitializerTaskImpl.m107036f().mo52280c()).mo95706a();
        List<String> list = null;
        if (this.f132887c) {
            NetworkUtils.setCommandListener(CommandDispatcher.C33550a.f79692a);
            KidsCommonServiceImpl.m104422g().mo94337d();
            C33818b.m69183a(this.f132886b);
            C33826d.m69188a();
            C18205a.m33880c().mo143289d(new C58439m(this));
            C33822c.m69185a(this.f132886b);
            if (!C58195d.m105113f()) {
                InitAllServiceImpl.m68762q().mo59706a();
            }
            b = null;
        } else {
            b = C29843f.m60132b(this.f132886b);
        }
        try {
            AppLog.setUseGoogleAdId(true);
        } catch (IllegalStateException e) {
            C51423a.m95787a("initApplog startLaunch:" + (System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h));
            C51423a.m95786a((Exception) e);
        }
        AppLog.registerLogRequestCallback(new AppLog.AbstractC29764j() {
            /* class com.p2082ss.android.ugc.aweme.legoImp.task.KidsModeLegacyTask.C583651 */

            static {
                Covode.recordClassIndex(68523);
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
        new C58221f.C58224c().mo95703b((AbstractC58264w) new CommonParamsInitTask()).mo95706a();
        if (C39223a.m79603q().mo68633d()) {
            c = C39239a.m79629c();
        } else {
            c = C80580in.m139687c();
        }
        AppLog.setChildModeBeforeInit(c);
        if (c) {
            list = C39223a.m79603q().mo68631c();
        }
        AppLog.setWhiteEventFilterForChildMode(list);
        C75236b.m132016a(this.f132886b);
        if (this.f132886b.getResources() == null) {
            Process.killProcess(Process.myPid());
        }
        C17175b.C17176a.f40922a.f40921a = 0;
        C58945a.C58947b.f134185a.mo96425a("method_init_push_duration", false);
        if (this.f132887c || C65717h.m117632a(this.f132886b, b)) {
            C29902a.m60273a().initMessageDepend();
        }
        C58945a.C58947b.f134185a.mo96429b("method_init_push_duration", false);
    }
}
