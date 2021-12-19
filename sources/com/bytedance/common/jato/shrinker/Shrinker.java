package com.bytedance.common.jato.shrinker;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class Shrinker {
    private static Shrinker sInstance;

    static {
        Covode.recordClassIndex(15600);
    }

    public int doShrink() {
        return doShrink(512, 2048);
    }

    public static synchronized Shrinker getInstance() {
        Shrinker shrinker;
        synchronized (Shrinker.class) {
            MethodCollector.m26663i(10055);
            if (sInstance == null) {
                sInstance = new Shrinker();
            }
            shrinker = sInstance;
            MethodCollector.m26664o(10055);
        }
        return shrinker;
    }

    public int doShrink(int i) {
        return doShrink(i, 2048);
    }

    public int doShrinkRegion(int i) {
        MethodCollector.m26663i(10056);
        if (Build.VERSION.SDK_INT < 26 || !ShrinkerNativeHolder.m24393a()) {
            MethodCollector.m26664o(10056);
            return 0;
        }
        int shrinkRegionNative = ShrinkerNativeHolder.shrinkRegionNative(i);
        MethodCollector.m26664o(10056);
        return shrinkRegionNative;
    }

    public int doShrink(int i, int i2) {
        MethodCollector.m26663i(10057);
        if (Build.VERSION.SDK_INT > 23 && Build.VERSION.SDK_INT <= 29 && ShrinkerNativeHolder.m24393a()) {
            ShrinkerNativeHolder.shrinkMallocNative(2, 16);
        }
        if (Build.VERSION.SDK_INT <= 19 || !ShrinkerNativeHolder.m24393a()) {
            MethodCollector.m26664o(10057);
            return -1;
        } else if (Build.VERSION.SDK_INT < 26) {
            int shrinkHeapNative = ShrinkerNativeHolder.shrinkHeapNative(i);
            MethodCollector.m26664o(10057);
            return shrinkHeapNative;
        } else {
            int shrinkRegionNative = ShrinkerNativeHolder.shrinkRegionNative(i2);
            MethodCollector.m26664o(10057);
            return shrinkRegionNative;
        }
    }
}
