package com.p2082ss.android.ugc.aweme.services.performance;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.performance.ICrashReportService */
public interface ICrashReportService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79915);
    }

    void addCrashEffectIdInfoListener(ICrashEffectIdInfoListener iCrashEffectIdInfoListener);

    void report(int i);

    void setEffectIdInfo(String str, String str2);

    /* renamed from: com.ss.android.ugc.aweme.services.performance.ICrashReportService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79916);
        }
    }
}
