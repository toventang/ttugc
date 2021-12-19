package com.bytedance.common.jato.boost;

import com.bytedance.covode.number.Covode;

public class MemoryManager {
    static {
        Covode.recordClassIndex(15546);
    }

    public static native void nativePagePreFault(int i, int i2, boolean z, boolean z2);
}
