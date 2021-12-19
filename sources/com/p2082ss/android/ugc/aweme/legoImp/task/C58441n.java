package com.p2082ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.p932j.C13913i;
import com.bytedance.liko.p1484b.AbstractC20838b;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.n */
final /* synthetic */ class C58441n implements AbstractC20838b {

    /* renamed from: a */
    private final LeakReporterInjectTask f133058a;

    static {
        Covode.recordClassIndex(68702);
    }

    C58441n(LeakReporterInjectTask leakReporterInjectTask) {
        this.f133058a = leakReporterInjectTask;
    }

    @Override // com.bytedance.liko.p1484b.AbstractC20838b
    /* renamed from: a */
    public final void mo34260a(String str) {
        if (Npth.isInit()) {
            C13866d a = C13866d.m25084a(new StackTraceElement("FdLeakDetector", "report", "FdLeakWarning", 0), str, "FdLeakWarning", Thread.currentThread().getName(), "EnsureNotNull");
            a.mo22346a("log_type", (Object) "fdLeak");
            C13913i.m25188a(a);
        }
    }
}
