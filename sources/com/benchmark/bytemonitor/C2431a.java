package com.benchmark.bytemonitor;

import android.content.Context;
import com.benchmark.bytemonitor.nativePort.ByteMonitorPort;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.benchmark.bytemonitor.a */
public class C2431a {

    /* renamed from: a */
    private static BatteryMonitor f7314a;

    static {
        Covode.recordClassIndex(2783);
    }

    /* renamed from: a */
    public static void m7267a() {
        MethodCollector.m26663i(5960);
        BatteryMonitor batteryMonitor = f7314a;
        if (batteryMonitor == null) {
            MethodCollector.m26664o(5960);
            return;
        }
        ByteMonitorPort.nativeInit(batteryMonitor);
        ByteMonitorPort.f7315a = true;
        MethodCollector.m26664o(5960);
    }

    /* renamed from: a */
    public static void m7268a(Context context) {
        MethodCollector.m26663i(5956);
        if (f7314a == null) {
            synchronized (C2431a.class) {
                try {
                    if (f7314a == null) {
                        f7314a = new BatteryMonitor(context);
                    }
                } finally {
                    MethodCollector.m26664o(5956);
                }
            }
            return;
        }
        MethodCollector.m26664o(5956);
    }
}
