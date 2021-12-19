package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public class TimeUtils {
    static {
        Covode.recordClassIndex(103362);
    }

    public static native long nativeGetTimeTicksNowUs();

    private TimeUtils() {
    }
}
