package com.p2082ss.avframework.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.utils.GlobalControler */
public class GlobalControler {
    private static boolean mYuvConverterUseBufferPool = true;

    public static boolean isYuvConverterUseBufferPool() {
        return mYuvConverterUseBufferPool;
    }

    static {
        Covode.recordClassIndex(100728);
    }

    public static void setYuvConverterUseBufferPool(boolean z) {
        mYuvConverterUseBufferPool = z;
    }
}
