package com.p2082ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.p2082ss.android.ugc.aweme.services.performance.ICrashReportService;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.w */
final /* synthetic */ class C58450w implements ICrashCallback {

    /* renamed from: a */
    private final ICrashReportService f133070a;

    static {
        Covode.recordClassIndex(68714);
    }

    C58450w(ICrashReportService iCrashReportService) {
        this.f133070a = iCrashReportService;
    }

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
        this.f133070a.report(2);
    }
}
