package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

class Histogram {
    private final long handle;

    static {
        Covode.recordClassIndex(15001);
    }

    private static native void nativeAddSample(long j, int i);

    private static native long nativeCreateCounts(String str, int i, int i2, int i3);

    private static native long nativeCreateEnumeration(String str, int i);

    private Histogram(long j) {
        this.handle = j;
    }

    public void addSample(int i) {
        MethodCollector.m26663i(246);
        nativeAddSample(this.handle, i);
        MethodCollector.m26664o(246);
    }

    public static Histogram createEnumeration(String str, int i) {
        MethodCollector.m26663i(245);
        Histogram histogram = new Histogram(nativeCreateEnumeration(str, i));
        MethodCollector.m26664o(245);
        return histogram;
    }

    public static Histogram createCounts(String str, int i, int i2, int i3) {
        MethodCollector.m26663i(243);
        Histogram histogram = new Histogram(nativeCreateCounts(str, i, i2, i3));
        MethodCollector.m26664o(243);
        return histogram;
    }
}
