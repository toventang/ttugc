package com.p2082ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.p2082ss.android.ugc.aweme.services.performance.ICrashReportService;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.x */
final /* synthetic */ class C58451x implements ICrashCallback {

    /* renamed from: a */
    private final ICrashReportService f133071a;

    static {
        Covode.recordClassIndex(68715);
    }

    C58451x(ICrashReportService iCrashReportService) {
        this.f133071a = iCrashReportService;
    }

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
        ICrashReportService iCrashReportService = this.f133071a;
        if (str == null || !str.contains("OutOfMemoryError")) {
            iCrashReportService.report(3);
        } else {
            iCrashReportService.report(1);
        }
    }
}
