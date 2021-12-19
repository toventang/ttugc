package com.bytedance.common.jato.shrinker;

import com.bytedance.common.jato.C13556d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public class ShrinkerNativeHolder {

    /* renamed from: a */
    private static boolean f33023a;

    static {
        Covode.recordClassIndex(15601);
    }

    static native int shrinkHeapNative(int i);

    static native int shrinkMallocNative(int i, int i2);

    static native int shrinkRegionNative(int i);

    static native int shrinkWebviewNative();

    ShrinkerNativeHolder() {
    }

    /* renamed from: a */
    static synchronized boolean m24393a() {
        boolean z;
        synchronized (ShrinkerNativeHolder.class) {
            MethodCollector.m26663i(9898);
            if (!f33023a && C13556d.m24356a()) {
                f33023a = true;
            }
            z = f33023a;
            MethodCollector.m26664o(9898);
        }
        return z;
    }
}
