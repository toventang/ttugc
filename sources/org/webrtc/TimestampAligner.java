package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TimestampAligner {
    private volatile long nativeTimestampAligner = nativeCreateTimestampAligner();

    static {
        Covode.recordClassIndex(106735);
    }

    private static native long nativeCreateTimestampAligner();

    private static native void nativeReleaseTimestampAligner(long j);

    private static native long nativeRtcTimeNanos();

    private static native long nativeTranslateTimestamp(long j, long j2);

    public static long getRtcTimeNanos() {
        MethodCollector.m26663i(202);
        long nativeRtcTimeNanos = nativeRtcTimeNanos();
        MethodCollector.m26664o(202);
        return nativeRtcTimeNanos;
    }

    public TimestampAligner() {
        MethodCollector.m26663i(201);
        MethodCollector.m26664o(201);
    }

    private void checkNativeAlignerExists() {
        if (this.nativeTimestampAligner == 0) {
            throw new IllegalStateException("TimestampAligner has been disposed.");
        }
    }

    public void dispose() {
        MethodCollector.m26663i(207);
        checkNativeAlignerExists();
        nativeReleaseTimestampAligner(this.nativeTimestampAligner);
        this.nativeTimestampAligner = 0;
        MethodCollector.m26664o(207);
    }

    public long translateTimestamp(long j) {
        MethodCollector.m26663i(205);
        checkNativeAlignerExists();
        long nativeTranslateTimestamp = nativeTranslateTimestamp(this.nativeTimestampAligner, j);
        MethodCollector.m26664o(205);
        return nativeTranslateTimestamp;
    }
}
