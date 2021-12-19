package com.benchmark.bytemonitor.nativePort;

import android.content.Context;
import android.os.SystemClock;
import com.benchmark.bytemonitor.BatteryMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class ByteMonitorPort {

    /* renamed from: a */
    public static boolean f7315a = false;

    public static native void nativeInit(BatteryMonitor batteryMonitor);

    static {
        Covode.recordClassIndex(2784);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a("bytemonitor", false, (Context) null);
        C58032m.m104852a(uptimeMillis, "bytemonitor");
    }
}
