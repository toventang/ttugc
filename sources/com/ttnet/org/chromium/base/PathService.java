package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public abstract class PathService {
    static {
        Covode.recordClassIndex(103353);
    }

    private static native void nativeOverride(int i, String str);

    private PathService() {
    }
}
