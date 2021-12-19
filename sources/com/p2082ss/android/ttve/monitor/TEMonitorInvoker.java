package com.p2082ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30731d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ttve.monitor.TEMonitorInvoker */
public class TEMonitorInvoker {
    public static native Map<String, String> nativeGetMap();

    public static native Map<String, String> nativeGetMapByType(int i);

    public static native void nativeInit();

    public static native void nativeMonitorPerf(int i);

    public static native void nativeMonitorPerfWithType(int i);

    public static native void nativePerfDouble(int i, String str, double d);

    public static native void nativePerfDouble(String str, double d);

    public static native void nativePerfLong(int i, String str, long j);

    public static native void nativePerfLong(String str, long j);

    public static native void nativePerfRational(String str, float f, float f2);

    public static native void nativePerfString(int i, String str, String str2);

    public static native void nativePerfString(String str, String str2);

    public static native void nativeReset();

    public static native void nativeReset(int i);

    static {
        Covode.recordClassIndex(37250);
        C30731d.m63117b();
    }

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f) {
        C30695h.m63068a(str, str2, f);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, long j) {
        C30695h.m63069a(str, str2, j);
    }

    public static void onNativeCallback_onMonitorLogMap(String str, String str2, HashMap hashMap) {
        C30695h.m63070a(str, str2, hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void onNativeCallback_onMonitorLogJson(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0013 }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x0013 }
            boolean r0 = com.p2082ss.android.ttve.monitor.C30695h.f73420d     // Catch:{ JSONException -> 0x0010 }
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "service"
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x0010 }
            goto L_0x0018
        L_0x0010:
            r0 = move-exception
            r2 = r1
            goto L_0x0014
        L_0x0013:
            r0 = move-exception
        L_0x0014:
            r0.printStackTrace()
            r1 = r2
        L_0x0018:
            boolean r0 = com.p2082ss.android.ttve.monitor.C30695h.f73420d
            if (r0 == 0) goto L_0x0022
            java.lang.ref.WeakReference<com.ss.android.ttve.monitor.IMonitor> r0 = com.p2082ss.android.ttve.monitor.C30695h.f73419c
            com.p2082ss.android.ttve.monitor.C30695h.m63074b(r0, r3, r1)
            return
        L_0x0022:
            java.lang.ref.WeakReference<com.ss.android.ttve.monitor.IMonitor> r0 = com.p2082ss.android.ttve.monitor.C30695h.f73419c
            com.p2082ss.android.ttve.monitor.C30695h.m63073a(r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.monitor.TEMonitorInvoker.onNativeCallback_onMonitorLogJson(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
