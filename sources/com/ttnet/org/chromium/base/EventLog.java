package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public class EventLog {
    static {
        Covode.recordClassIndex(103343);
    }

    public static void writeEvent(int i, int i2) {
        android.util.EventLog.writeEvent(i, i2);
    }
}
