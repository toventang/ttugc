package com.bytedance.sysoptimizer;

import com.bytedance.covode.number.Covode;

public class TypeFaceOptimizer {
    private static boolean mSwitch;

    static {
        Covode.recordClassIndex(26594);
    }

    public static void start() {
        mSwitch = true;
    }

    public static boolean getSwitch() {
        return mSwitch;
    }
}
