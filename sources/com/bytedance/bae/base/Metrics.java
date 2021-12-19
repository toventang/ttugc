package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class Metrics {
    public final Map<String, HistogramInfo> map = new HashMap();

    static {
        Covode.recordClassIndex(15009);
    }

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();

    Metrics() {
    }

    public static void enable() {
        MethodCollector.m26663i(1461);
        nativeEnable();
        MethodCollector.m26664o(1461);
    }

    public static Metrics getAndReset() {
        MethodCollector.m26663i(1463);
        Metrics nativeGetAndReset = nativeGetAndReset();
        MethodCollector.m26664o(1463);
        return nativeGetAndReset;
    }

    private void add(String str, HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }

    public static class HistogramInfo {
        public final int bucketCount;
        public final int max;
        public final int min;
        public final Map<Integer, Integer> samples = new HashMap();

        static {
            Covode.recordClassIndex(15010);
        }

        public void addSample(int i, int i2) {
            this.samples.put(Integer.valueOf(i), Integer.valueOf(i2));
        }

        public HistogramInfo(int i, int i2, int i3) {
            this.min = i;
            this.max = i2;
            this.bucketCount = i3;
        }
    }
}
