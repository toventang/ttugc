package com.p2082ss.android.ugc.aweme.services.performance;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.performance.PerformanceMonitor;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.services.performance.IAVPerformance */
public interface IAVPerformance {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79912);
    }

    void end(PerformanceMonitor performanceMonitor, String str);

    void end(String str, String str2);

    void enter(Context context, String str);

    void leave(Context context, String str);

    void pause(Context context, String str, String str2, String str3);

    void recordPerformanceLog(String str, AbstractC89171a<? extends Map<String, String>> aVar);

    void start(PerformanceMonitor performanceMonitor, String str);

    void start(String str, String str2);

    void step(PerformanceMonitor performanceMonitor, String str);

    void step(String str, String str2);

    /* renamed from: com.ss.android.ugc.aweme.services.performance.IAVPerformance$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79913);
        }
    }
}
