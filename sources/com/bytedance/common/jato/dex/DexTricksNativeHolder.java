package com.bytedance.common.jato.dex;

import com.bytedance.common.jato.C13556d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DexTricksNativeHolder {
    private static boolean sInited;

    static {
        Covode.recordClassIndex(15570);
    }

    private static native int dvmVerifyEnableNative();

    private static native int dvmVerifyNoneNative();

    private static native int verifyEnableNative();

    private static native int verifyNoneNative(int i, int i2);

    protected static int dvmVerifyEnable() {
        MethodCollector.m26663i(12808);
        if (ensureInited()) {
            int dvmVerifyEnableNative = dvmVerifyEnableNative();
            MethodCollector.m26664o(12808);
            return dvmVerifyEnableNative;
        }
        MethodCollector.m26664o(12808);
        return -1;
    }

    protected static int dvmVerifyNone() {
        MethodCollector.m26663i(12704);
        if (ensureInited()) {
            int dvmVerifyNoneNative = dvmVerifyNoneNative();
            MethodCollector.m26664o(12704);
            return dvmVerifyNoneNative;
        }
        MethodCollector.m26664o(12704);
        return -1;
    }

    private static synchronized boolean ensureInited() {
        boolean z;
        synchronized (DexTricksNativeHolder.class) {
            MethodCollector.m26663i(12896);
            if (!sInited && C13556d.m24356a()) {
                sInited = true;
            }
            z = sInited;
            MethodCollector.m26664o(12896);
        }
        return z;
    }

    protected static int verifyEnable() {
        MethodCollector.m26663i(12702);
        if (ensureInited()) {
            int verifyEnableNative = verifyEnableNative();
            MethodCollector.m26664o(12702);
            return verifyEnableNative;
        }
        MethodCollector.m26664o(12702);
        return -1;
    }

    protected static int verifyNone(int i, int i2) {
        MethodCollector.m26663i(12701);
        if (ensureInited()) {
            int verifyNoneNative = verifyNoneNative(i, i2);
            MethodCollector.m26664o(12701);
            return verifyNoneNative;
        }
        MethodCollector.m26664o(12701);
        return -1;
    }
}
