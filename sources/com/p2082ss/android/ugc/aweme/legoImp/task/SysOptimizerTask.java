package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.common.jato.shrinker.Shrinker;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.p932j.C13913i;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.sysoptimizer.ArtOptimizer;
import com.bytedance.sysoptimizer.DvmDeadLockOptimizer;
import com.bytedance.sysoptimizer.DvmGlesOptimizer;
import com.bytedance.sysoptimizer.DvmOptimizer;
import com.bytedance.sysoptimizer.HighLevelTrimMemory;
import com.bytedance.sysoptimizer.JitCompileMethodCrash;
import com.bytedance.sysoptimizer.KGetCookieOptimizer;
import com.bytedance.sysoptimizer.MaliGpuExtIsSupportOptimizer;
import com.bytedance.sysoptimizer.MaliMemOptimizer;
import com.bytedance.sysoptimizer.NougatJitCompileOptimizer;
import com.bytedance.sysoptimizer.ONativeCryptoCRLOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.RedmiTypeFaceOptimizer;
import com.bytedance.sysoptimizer.SmEditTextLeakOpt;
import com.bytedance.sysoptimizer.StackLeakChecker;
import com.bytedance.sysoptimizer.StackLeakItem;
import com.bytedance.sysoptimizer.StageFrightAndroid4Optimizer;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.bytedance.sysoptimizer.VMDebugDumpHprofOptimizer;
import com.bytedance.sysoptimizer.fake.name.SmFakeNameHandler;
import com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector;
import com.bytedance.sysoptimizer.java.IAutofillManagerProtector;
import com.bytedance.sysoptimizer.java.IConnectivityManagerProtector;
import com.bytedance.sysoptimizer.java.OppoNAlarmProtector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.experiment.C46985gr;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask */
public class SysOptimizerTask implements AbstractC58084a, AbstractC58264w {

    /* renamed from: a */
    public Long f132960a;

    /* renamed from: b */
    public Boolean f132961b;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$a */
    public static class C58404a {
        @AbstractC27891c(mo46611a = "disable_oatfile_dump")

        /* renamed from: a */
        public boolean f132971a = true;

        static {
            Covode.recordClassIndex(68635);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$b */
    public static class C58405b {
        @AbstractC27891c(mo46611a = "optimize_sub_proc")

        /* renamed from: a */
        public boolean f132972a;
        @AbstractC27891c(mo46611a = "optimizer_enable")

        /* renamed from: b */
        public boolean f132973b;

        static {
            Covode.recordClassIndex(68636);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$c */
    public static class C58406c {
        @AbstractC27891c(mo46611a = "enable_optimizer")

        /* renamed from: a */
        public boolean f132974a;
        @AbstractC27891c(mo46611a = "always_catch_sigsegv")

        /* renamed from: b */
        public boolean f132975b;
        @AbstractC27891c(mo46611a = "target_devices")

        /* renamed from: c */
        public String[] f132976c;

        static {
            Covode.recordClassIndex(68637);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$d */
    public interface AbstractC58407d {

        /* renamed from: a */
        public static final C58409b f132977a = null;

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$d$a */
        public static class C58408a {
            @AbstractC27891c(mo46611a = "resourceIds")

            /* renamed from: a */
            public List<Integer> f132978a;
            @AbstractC27891c(mo46611a = "returnId")

            /* renamed from: b */
            public int f132979b;
            @AbstractC27891c(mo46611a = "protectClassName")

            /* renamed from: c */
            public String f132980c;
            @AbstractC27891c(mo46611a = "protectMethodName")

            /* renamed from: d */
            public String f132981d;
            @AbstractC27891c(mo46611a = "apiLevels")

            /* renamed from: e */
            public List<Integer> f132982e;
            @AbstractC27891c(mo46611a = "models")

            /* renamed from: f */
            public List<String> f132983f;
            @AbstractC27891c(mo46611a = "maxStep")

            /* renamed from: g */
            public int f132984g;

            static {
                Covode.recordClassIndex(68639);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$d$b */
        public static class C58409b {
            @AbstractC27891c(mo46611a = "configs")

            /* renamed from: a */
            public List<C58408a> f132985a;

            static {
                Covode.recordClassIndex(68640);
            }
        }

        static {
            Covode.recordClassIndex(68638);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$e */
    public static class C58410e {
        @AbstractC27891c(mo46611a = "enable_checker")

        /* renamed from: a */
        public boolean f132986a;
        @AbstractC27891c(mo46611a = "report_threshold")

        /* renamed from: b */
        public int f132987b = 100;
        @AbstractC27891c(mo46611a = "check_interval_mins")

        /* renamed from: c */
        public int f132988c = 100;
        @AbstractC27891c(mo46611a = "auto_fix_allowlist")

        /* renamed from: d */
        public String f132989d;

        static {
            Covode.recordClassIndex(68641);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$f */
    public static class C58411f {
        @AbstractC27891c(mo46611a = "shrink_enable")

        /* renamed from: a */
        public boolean f132990a;

        static {
            Covode.recordClassIndex(68642);
        }
    }

    static {
        Covode.recordClassIndex(68624);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$SysOptCheckSoLoadResult */
    class SysOptCheckSoLoadResult implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68626);
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

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            SysOptimizerTask.m106655n();
        }

        SysOptCheckSoLoadResult() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$SysOptDisableDumpOatFileForANR */
    class SysOptDisableDumpOatFileForANR implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68627);
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
            return EnumC58151ae.BACKGROUND;
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
            SysOptimizerTask.m106659p(context);
        }

        SysOptDisableDumpOatFileForANR() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$SysOptDvmOptimizer */
    class SysOptDvmOptimizer implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68628);
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
            return EnumC58151ae.BACKGROUND;
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

        SysOptDvmOptimizer() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            SysOptimizerTask.this.f132960a = Long.valueOf(System.currentTimeMillis());
            DvmOptimizer.optDvmLinearAllocBuffer(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$SysOptEnableStackLeakChecker */
    class SysOptEnableStackLeakChecker implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68629);
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
            return EnumC58151ae.BACKGROUND;
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
            SysOptimizerTask.m106660q(context);
        }

        SysOptEnableStackLeakChecker() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$SysOptFixSamSungGetNameCrash */
    class SysOptFixSamSungGetNameCrash implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68630);
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
            return EnumC58151ae.BACKGROUND;
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
            SysOptimizerTask.m106642c(context);
        }

        SysOptFixSamSungGetNameCrash() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$SysOptHookOptimizerEnable */
    class SysOptHookOptimizerEnable implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68631);
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
            return EnumC58151ae.BACKGROUND;
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

        SysOptHookOptimizerEnable() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            if (Build.VERSION.SDK_INT == 24) {
                HighLevelTrimMemory.optimize(context);
            }
            DvmDeadLockOptimizer.optimize(context);
            if (C29843f.m60129a(context)) {
                SysOptimizerTask.m106656n(context);
            }
            SysOptimizerTask.m106643d(context);
            SysOptimizerTask.m106640b(context);
            SysOptimizerTask.m106647h(context);
            SysOptimizerTask.m106648i(context);
            SysOptimizerTask.m106651l();
            SysOptimizerTask.m106653m();
            SysOptimizerTask.m106649j(context);
            SysOptimizerTask.m106644e(context);
            SysOptimizerTask.m106645f(context);
            SysOptimizerTask.m106646g(context);
            SysOptimizerTask.m106650k(context);
            SysOptimizerTask.m106652l(context);
            DvmGlesOptimizer.fix(context);
            SysOptimizer.hookOptimizerEnable();
            Long valueOf2 = Long.valueOf(System.currentTimeMillis());
            if (SysOptimizerTask.this.f132961b.booleanValue()) {
                valueOf2.longValue();
                valueOf.longValue();
                valueOf2.longValue();
                SysOptimizerTask.this.f132960a.longValue();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$SysOptMaliSwapBufferError */
    class SysOptMaliSwapBufferError implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68632);
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
            return EnumC58151ae.BACKGROUND;
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
            SysOptimizerTask.m106654m(context);
        }

        SysOptMaliSwapBufferError() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$SysOptOptimizeShrinker */
    class SysOptOptimizeShrinker implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68633);
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
            return EnumC58151ae.BACKGROUND;
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
            SysOptimizerTask.m106657o();
        }

        SysOptOptimizeShrinker() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$SysOptOptimizeSuspendTimeout */
    class SysOptOptimizeSuspendTimeout implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68634);
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
            return EnumC58151ae.BACKGROUND;
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

        SysOptOptimizeSuspendTimeout() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            if (C16048b.m29633a().mo25421a(true, "suspendtimeout_opt", true)) {
                SysOptimizerTask.m106658o(context);
            }
        }
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
        return new String[]{"ABTask"};
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: l */
    public static void m106651l() {
        if (SettingsManager.m29616a().mo25400a("type_face_opt_switch", true)) {
            TypeFaceOptimizer.start();
        }
    }

    /* renamed from: n */
    public static void m106655n() {
        int size = SysOptimizer.getLoadLibraryError().size();
        if (size > 0) {
            int i = 0;
            do {
                m106638a(SysOptimizer.getLoadLibraryError().get(i), "load_so_exception", "load_sysoptimizer_failed", "load_sysoptimizer_failed", "load_sysoptimizer_failed", "SysOptimizerTask Thread");
                i++;
            } while (i < size);
        }
    }

    /* renamed from: o */
    public static void m106657o() {
        try {
            C58411f fVar = (C58411f) SettingsManager.m29616a().mo25396a("shrink_settings", C58411f.class);
            if (fVar != null && fVar.f132990a) {
                Shrinker.getInstance().doShrink(SettingsManager.m29616a().mo25394a("shrink_threshold", 512));
            }
            int a = C16048b.m29633a().mo25411a("vmshrink_high_exp", ClientExpManager.vmshrink_high_exp());
            if (a == 0) {
                Shrinker.getInstance().doShrinkRegion(0);
            } else if (a == 1) {
                Shrinker.getInstance().doShrinkRegion(256);
            } else if (a == 2) {
                Shrinker.getInstance().doShrinkRegion(384);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    public static void m106653m() {
        List<AbstractC58407d.C58408a> list;
        List<Integer> list2;
        AbstractC58407d.C58409b bVar = (AbstractC58407d.C58409b) SettingsManager.m29616a().mo25397a("fix_resource_not_found", AbstractC58407d.C58409b.class, AbstractC58407d.f132977a);
        if (!(bVar == null || (list = bVar.f132985a) == null || list.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            for (AbstractC58407d.C58408a aVar : list) {
                if (!(aVar == null || (list2 = aVar.f132978a) == null || list2.isEmpty())) {
                    sb.append("rescue ");
                    for (Integer num : list2) {
                        int intValue = num.intValue();
                        ResourcesProtector.registerConfig(new ResourcesProtector.Builder().maxStep(aVar.f132984g).protectClassName(aVar.f132980c).protectMethodName(aVar.f132981d).returnId(aVar.f132979b).resId(intValue).protectApis(m106639a(aVar.f132982e)).protectModels(m106641b(aVar.f132983f)).build());
                        sb.append("resourceId = ").append(intValue).append(",").append(aVar.f132980c).append(".").append(aVar.f132981d).append("\n");
                    }
                    sb.delete(sb.length() - 1, sb.length());
                    sb.append("\n");
                }
            }
            sb.delete(sb.length() - 1, sb.length());
        }
    }

    /* renamed from: r */
    private static Context m106661r(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: b */
    public static void m106640b(Context context) {
        if (SettingsManager.m29616a().mo25400a("hprof_dump_data_opt", true)) {
            VMDebugDumpHprofOptimizer.fix(context);
        }
    }

    /* renamed from: c */
    public static void m106642c(Context context) {
        if (SettingsManager.m29616a().mo25400a("fix_samsung_field_get_name_crash", true)) {
            SmFakeNameHandler.start(context);
        }
    }

    /* renamed from: d */
    public static void m106643d(Context context) {
        if (SettingsManager.m29616a().mo25400a("fix_jit_comile_method_crash", true)) {
            JitCompileMethodCrash.optimize(context);
        }
    }

    /* renamed from: e */
    public static void m106644e(Context context) {
        if (SettingsManager.m29616a().mo25400a("ul_native_crypto_opt", false)) {
            ONativeCryptoCRLOptimizer.fix(context);
        }
    }

    /* renamed from: f */
    public static void m106645f(Context context) {
        if (SettingsManager.m29616a().mo25400a("ul_mali_gpu_format_opt", false)) {
            MaliGpuExtIsSupportOptimizer.fix(context);
        }
    }

    /* renamed from: g */
    public static void m106646g(Context context) {
        if (SettingsManager.m29616a().mo25400a("ul_kitkat_get_cookie_opt", false)) {
            KGetCookieOptimizer.fix(context);
        }
    }

    /* renamed from: h */
    public static void m106647h(Context context) {
        if (SettingsManager.m29616a().mo25400a("fix_jit_compile_crash_on_n", false)) {
            NougatJitCompileOptimizer.fix(context);
        }
    }

    /* renamed from: i */
    public static void m106648i(Context context) {
        if (SettingsManager.m29616a().mo25400a("fix_package_not_belong", false)) {
            BinderServiceWrapperProtector.setDebug(false);
            IConnectivityManagerProtector.install(context);
            IAutofillManagerProtector.install(context);
            OppoNAlarmProtector.install(context);
        }
    }

    /* renamed from: j */
    public static void m106649j(Context context) {
        if (SettingsManager.m29616a().mo25400a("register_broadcast_protector", true) && (m106661r(context) instanceof Application)) {
            ReceiverRegisterCrashOptimizer.fix((Application) m106661r(context));
        }
    }

    /* renamed from: k */
    public static void m106650k(Context context) {
        if (SettingsManager.m29616a().mo25400a("red_mi_typeface_fix", false)) {
            RedmiTypeFaceOptimizer.fixOnAndroidQ(context);
        }
    }

    /* renamed from: p */
    public static void m106659p(Context context) {
        try {
            C58404a aVar = (C58404a) SettingsManager.m29616a().mo25396a("art_oatfile_dump_settings", C58404a.class);
            if (aVar == null) {
                ArtOptimizer.disableDumpOatFileForANR(context);
            } else if (aVar.f132971a) {
                ArtOptimizer.disableDumpOatFileForANR(context);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static String[] m106641b(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String[] strArr = new String[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }

    /* renamed from: l */
    public static void m106652l(Context context) {
        if (SettingsManager.m29616a().mo25400a("stage_fright_fix", false)) {
            StageFrightAndroid4Optimizer.fixStageFrightAndroid4(context);
        }
    }

    /* renamed from: m */
    public static void m106654m(Context context) {
        if (Build.VERSION.SDK_INT >= 29 && Process.is64Bit()) {
            if (C46985gr.m90263a()) {
                MaliMemOptimizer.enableMaliGLErrorSkip(context, true);
            } else if (C46985gr.m90264b()) {
                MaliMemOptimizer.enableMaliGLErrorSkip(context, false);
            }
        }
    }

    /* renamed from: o */
    public static void m106658o(Context context) {
        try {
            C58405b bVar = (C58405b) SettingsManager.m29616a().mo25396a("art_suspend_timeout_settings", C58405b.class);
            if (bVar == null) {
                ArtOptimizer.optSuspendTimeout(context);
            } else if (bVar.f132973b) {
                if (bVar.f132972a || C29843f.m60129a(context)) {
                    ArtOptimizer.optSuspendTimeout(context);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static int[] m106639a(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int[] iArr = new int[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r1 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (java.util.Arrays.asList(r3).contains(r1) != false) goto L_0x0042;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m106656n(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.m106656n(android.content.Context):boolean");
    }

    /* renamed from: q */
    public static void m106660q(Context context) {
        try {
            C58410e eVar = (C58410e) SettingsManager.m29616a().mo25396a("enable_stack_leak_checker", C58410e.class);
            if (eVar != null && eVar.f132986a) {
                StackLeakChecker.registerStackLeakListener(new StackLeakChecker.StackLeakListener() {
                    /* class com.p2082ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.C584031 */

                    static {
                        Covode.recordClassIndex(68625);
                    }

                    @Override // com.bytedance.sysoptimizer.StackLeakChecker.StackLeakListener
                    public final void onLeakReport(ArrayList<StackLeakItem> arrayList) {
                        Iterator<StackLeakItem> it = arrayList.iterator();
                        while (it.hasNext()) {
                            StackLeakItem next = it.next();
                            Throwable th = new Throwable(next.getLeakItem());
                            th.setStackTrace(new StackTraceElement[]{new StackTraceElement("StackLeakSoName", next.getSoName(), next.getSoName(), next.getLeakCount())});
                            SysOptimizerTask.m106638a(th, "stack_leak_info", "stackleak", "stackleak", "stackleak", "StackLeakChecker Thread");
                        }
                    }
                });
                StackLeakChecker.setInterval(eVar.f132987b, ((long) (eVar.f132988c * 6)) * 10000000);
                String[] strArr = null;
                if (eVar.f132989d != null && eVar.f132989d.length() > 1) {
                    strArr = eVar.f132989d.split(":");
                }
                StackLeakChecker.enableChecker(context, strArr);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C51423a.m95787a("SysOptimizerTask");
        this.f132961b = Boolean.valueOf(C29843f.m60129a(context));
        if (C58152b.m105088f()) {
            this.f132960a = Long.valueOf(System.currentTimeMillis());
            C58221f.m105141a(false).mo95704a(new SysOptDvmOptimizer()).mo95704a(new SysOptOptimizeSuspendTimeout()).mo95704a(new SysOptFixSamSungGetNameCrash()).mo95704a(new SysOptMaliSwapBufferError()).mo95704a(new SysOptDisableDumpOatFileForANR()).mo95704a(new SysOptHookOptimizerEnable()).mo95704a(new SysOptOptimizeShrinker()).mo95704a(new SysOptEnableStackLeakChecker()).mo95704a(new SysOptCheckSoLoadResult()).mo95706a();
            return;
        }
        this.f132960a = Long.valueOf(System.currentTimeMillis());
        DvmOptimizer.optDvmLinearAllocBuffer(context);
        if (C16048b.m29633a().mo25421a(true, "suspendtimeout_opt", true)) {
            m106658o(context);
        }
        m106654m(context);
        m106642c(context);
        m106659p(context);
        if (Build.VERSION.SDK_INT == 24) {
            HighLevelTrimMemory.optimize(context);
        }
        DvmDeadLockOptimizer.optimize(context);
        if (C29843f.m60129a(context)) {
            m106656n(context);
        }
        m106643d(context);
        m106647h(context);
        m106648i(context);
        m106651l();
        m106649j(context);
        m106653m();
        m106644e(context);
        m106645f(context);
        m106646g(context);
        m106650k(context);
        Application application = (Application) context;
        if (SettingsManager.m29616a().mo25400a("samsung_et_leak_opt", true)) {
            SmEditTextLeakOpt.optimize(application);
            C17873f.m33099g().mo143289d(C58419ad.f133009a);
        }
        m106652l(context);
        DvmGlesOptimizer.fix(context);
        SysOptimizer.hookOptimizerEnable();
        m106657o();
        m106640b(context);
        m106660q(context);
        m106655n();
        if (this.f132961b.booleanValue()) {
            System.currentTimeMillis();
            this.f132960a.longValue();
        }
    }

    /* renamed from: a */
    public static void m106638a(Throwable th, String str, String str2, String str3, String str4, String str5) {
        C13866d a = C13866d.m25085a(th.getStackTrace()[th.getStackTrace().length - 1], C14042ab.m25491a(th.getStackTrace()), str2, str5, false, str3, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(th.toString());
        a.mo22341a(str, (List<String>) arrayList);
        a.mo22340a(str4, "true");
        C13913i.m25188a(a);
    }
}
