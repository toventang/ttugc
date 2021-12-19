package com.p2082ss.android.ugc.aweme.legoImp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.legoapi.ICrashSdkTaskApi;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.AnrTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.CrashSdkInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.LeakReporterInjectTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.MemoryMonitorTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.NpthExtentTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SafeViewInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.ViewHolderLogTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.CrashSdkTaskImpl */
public final class CrashSdkTaskImpl implements ICrashSdkTaskApi {
    static {
        Covode.recordClassIndex(68342);
    }

    @Override // com.p2082ss.android.legoapi.ICrashSdkTaskApi
    /* renamed from: a */
    public final AbstractC58264w mo52283a() {
        return new AnalysisHprofTask();
    }

    @Override // com.p2082ss.android.legoapi.ICrashSdkTaskApi
    /* renamed from: b */
    public final AbstractC58264w mo52284b() {
        return new AnrTask();
    }

    @Override // com.p2082ss.android.legoapi.ICrashSdkTaskApi
    /* renamed from: c */
    public final AbstractC58264w mo52285c() {
        return new CrashSdkInitTask();
    }

    @Override // com.p2082ss.android.legoapi.ICrashSdkTaskApi
    /* renamed from: d */
    public final AbstractC58264w mo52286d() {
        return new LeakReporterInjectTask();
    }

    @Override // com.p2082ss.android.legoapi.ICrashSdkTaskApi
    /* renamed from: e */
    public final AbstractC58264w mo52287e() {
        return new MemoryMonitorTask();
    }

    @Override // com.p2082ss.android.legoapi.ICrashSdkTaskApi
    /* renamed from: f */
    public final AbstractC58264w mo52288f() {
        return new NpthCoreInitTask();
    }

    @Override // com.p2082ss.android.legoapi.ICrashSdkTaskApi
    /* renamed from: g */
    public final AbstractC58264w mo52289g() {
        return new NpthExtentTask();
    }

    @Override // com.p2082ss.android.legoapi.ICrashSdkTaskApi
    /* renamed from: h */
    public final AbstractC58264w mo52290h() {
        return new SafeViewInitTask();
    }

    @Override // com.p2082ss.android.legoapi.ICrashSdkTaskApi
    /* renamed from: i */
    public final AbstractC58264w mo52291i() {
        return new ViewHolderLogTask();
    }

    /* renamed from: j */
    public static ICrashSdkTaskApi m105226j() {
        MethodCollector.m26663i(1933);
        Object a = C81908b.m141854a(ICrashSdkTaskApi.class, false);
        if (a != null) {
            ICrashSdkTaskApi iCrashSdkTaskApi = (ICrashSdkTaskApi) a;
            MethodCollector.m26664o(1933);
            return iCrashSdkTaskApi;
        }
        if (C81908b.f183283cg == null) {
            synchronized (ICrashSdkTaskApi.class) {
                try {
                    if (C81908b.f183283cg == null) {
                        C81908b.f183283cg = new CrashSdkTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1933);
                    throw th;
                }
            }
        }
        CrashSdkTaskImpl crashSdkTaskImpl = (CrashSdkTaskImpl) C81908b.f183283cg;
        MethodCollector.m26664o(1933);
        return crashSdkTaskImpl;
    }
}
