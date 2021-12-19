package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.statics.StaticsReport;

/* renamed from: com.ss.avframework.engine.VideoFrameStatistics */
public class VideoFrameStatistics implements StaticsReport.StaticReportInterface {
    static {
        Covode.recordClassIndex(99988);
    }

    private static native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private static native boolean nativeReset();

    public static void reset() {
        MethodCollector.m26663i(602);
        nativeReset();
        MethodCollector.m26664o(602);
    }

    @Override // com.p2082ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        MethodCollector.m26663i(653);
        boolean nativeGetStaticsReport = nativeGetStaticsReport(staticsReport);
        MethodCollector.m26664o(653);
        return nativeGetStaticsReport;
    }
}
