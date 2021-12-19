package com.p2082ss.android.ugc.effectmanager.algorithm;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.algorithm.Stopwatch */
public class Stopwatch {
    private long startTick;

    static {
        Covode.recordClassIndex(95410);
    }

    public long elapsedMillis() {
        return SystemClock.uptimeMillis() - this.startTick;
    }

    public static Stopwatch createStarted() {
        return new Stopwatch(SystemClock.uptimeMillis());
    }

    Stopwatch(long j) {
        this.startTick = j;
    }
}
