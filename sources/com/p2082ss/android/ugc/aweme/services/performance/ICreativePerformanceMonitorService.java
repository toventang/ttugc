package com.p2082ss.android.ugc.aweme.services.performance;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService */
public interface ICreativePerformanceMonitorService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79917);
    }

    Map<String, Double> getCpuRate();

    Map<String, Long> getMemory();

    void startBlockMonitor(String str, int i, long j, LagDataCallback lagDataCallback);

    void startBlockMonitor(String str, int i, LagDataCallback lagDataCallback);

    void startFpsMonitor(String str, long j, LagDataCallback lagDataCallback);

    void startFpsMonitor(String str, LagDataCallback lagDataCallback);

    void stopBlockMonitor(String str);

    void stopFpsMonitor(String str);

    /* renamed from: com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79918);
        }
    }
}
