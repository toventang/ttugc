package com.p2082ss.avframework.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.MediaEngineFactory;

/* renamed from: com.ss.avframework.utils.UnitTest */
public class UnitTest {
    static {
        Covode.recordClassIndex(100763);
    }

    private static native int nativeUnitTest(String str, TEBundle tEBundle);

    public static void run(String str, TEBundle tEBundle) {
    }

    public static void init() {
        MediaEngineFactory.getVersion();
    }
}
