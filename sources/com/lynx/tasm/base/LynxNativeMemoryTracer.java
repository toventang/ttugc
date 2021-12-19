package com.lynx.tasm.base;

import com.bytedance.covode.number.Covode;

public class LynxNativeMemoryTracer {

    /* renamed from: a */
    private static int f66915a = 1;

    private static native void nativeStartTracing(int i);

    private static native void nativeStopTracing();

    private static native void nativeWriteRecordsToFile(String str);

    static {
        Covode.recordClassIndex(34442);
    }
}
