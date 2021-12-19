package com.p2082ss.avframework.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.MediaEngineFactory;

/* renamed from: com.ss.avframework.utils.TimeUtils */
public class TimeUtils {
    private static native long nativeNanoTime();

    private static native long nativeTimeUTCMicros();

    static {
        Covode.recordClassIndex(100762);
        MediaEngineFactory.getVersion();
    }

    public static long nanoTime() {
        MethodCollector.m26663i(2499);
        long nativeNanoTime = nativeNanoTime();
        MethodCollector.m26664o(2499);
        return nativeNanoTime;
    }

    public static long timeUTCMicros() {
        MethodCollector.m26663i(2503);
        long nativeTimeUTCMicros = nativeTimeUTCMicros();
        MethodCollector.m26664o(2503);
        return nativeTimeUTCMicros;
    }

    public static long currentTimeMs() {
        MethodCollector.m26663i(2501);
        long nativeNanoTime = nativeNanoTime() / 1000000;
        MethodCollector.m26664o(2501);
        return nativeNanoTime;
    }
}
