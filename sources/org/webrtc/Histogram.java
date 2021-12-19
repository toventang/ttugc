package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public class Histogram {
    private final long handle;

    static {
        Covode.recordClassIndex(106652);
    }

    private static native void nativeAddSample(long j, int i);

    private static native long nativeCreateCounts(String str, int i, int i2, int i3);

    private static native long nativeCreateEnumeration(String str, int i);

    private Histogram(long j) {
        this.handle = j;
    }

    public void addSample(int i) {
        MethodCollector.m26663i(424);
        nativeAddSample(this.handle, i);
        MethodCollector.m26664o(424);
    }

    public static Histogram createEnumeration(String str, int i) {
        MethodCollector.m26663i(423);
        Histogram histogram = new Histogram(nativeCreateEnumeration(str, i));
        MethodCollector.m26664o(423);
        return histogram;
    }

    public static Histogram createCounts(String str, int i, int i2, int i3) {
        MethodCollector.m26663i(418);
        Histogram histogram = new Histogram(nativeCreateCounts(str, i, i2, i3));
        MethodCollector.m26664o(418);
        return histogram;
    }
}
