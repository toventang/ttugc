package com.p2082ss.android.ugc.aweme.legoImp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.legoapi.ISysOptTaskApi;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.legoImp.task.FdSanFatalSwitchTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.HoraeInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.NativeBitmapTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SamangCrashHandleTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SysOptimizerTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.InitGodzilla;

/* renamed from: com.ss.android.ugc.aweme.legoImp.SysOptTaskImpl */
public final class SysOptTaskImpl implements ISysOptTaskApi {
    static {
        Covode.recordClassIndex(68357);
    }

    @Override // com.p2082ss.android.legoapi.ISysOptTaskApi
    /* renamed from: a */
    public final AbstractC58264w mo52292a() {
        return new InitGodzilla();
    }

    @Override // com.p2082ss.android.legoapi.ISysOptTaskApi
    /* renamed from: b */
    public final AbstractC58264w mo52293b() {
        return new SysOptimizerTask();
    }

    @Override // com.p2082ss.android.legoapi.ISysOptTaskApi
    /* renamed from: c */
    public final AbstractC58264w mo52294c() {
        return new SamangCrashHandleTask();
    }

    @Override // com.p2082ss.android.legoapi.ISysOptTaskApi
    /* renamed from: d */
    public final AbstractC58264w mo52295d() {
        return new FdSanFatalSwitchTask();
    }

    @Override // com.p2082ss.android.legoapi.ISysOptTaskApi
    /* renamed from: e */
    public final AbstractC58264w mo52296e() {
        return new HoraeInitTask();
    }

    @Override // com.p2082ss.android.legoapi.ISysOptTaskApi
    /* renamed from: f */
    public final AbstractC58264w mo52297f() {
        return new NativeBitmapTask();
    }

    /* renamed from: g */
    public static ISysOptTaskApi m105262g() {
        MethodCollector.m26663i(931);
        Object a = C81908b.m141854a(ISysOptTaskApi.class, false);
        if (a != null) {
            ISysOptTaskApi iSysOptTaskApi = (ISysOptTaskApi) a;
            MethodCollector.m26664o(931);
            return iSysOptTaskApi;
        }
        if (C81908b.f183288cl == null) {
            synchronized (ISysOptTaskApi.class) {
                try {
                    if (C81908b.f183288cl == null) {
                        C81908b.f183288cl = new SysOptTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(931);
                    throw th;
                }
            }
        }
        SysOptTaskImpl sysOptTaskImpl = (SysOptTaskImpl) C81908b.f183288cl;
        MethodCollector.m26664o(931);
        return sysOptTaskImpl;
    }
}
