package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.p789q.C12575a;
import com.bytedance.apm.p789q.C12599s;
import com.bytedance.covode.number.Covode;

public class ThreadMonitor {
    static {
        Covode.recordClassIndex(14034);
    }

    private static boolean isDebuggable() {
        return C12575a.m22624b(C12397c.f29931a);
    }

    private static boolean isLocalChannel() {
        return C12397c.m22289f();
    }

    public static void sleepMonitor(long j) {
        if (C12599s.m22724a() && j > 10 && !isDebuggable()) {
            isLocalChannel();
        }
        Thread.sleep(j);
    }
}
