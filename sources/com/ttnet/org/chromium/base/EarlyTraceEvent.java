package com.ttnet.org.chromium.base;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.C87445c;
import java.util.List;
import java.util.Map;

public class EarlyTraceEvent {

    /* renamed from: a */
    static final Object f198250a = new Object();

    /* renamed from: b */
    static volatile int f198251b = 0;

    /* renamed from: c */
    static List<C87430b> f198252c;

    /* renamed from: d */
    static Map<String, C87430b> f198253d;

    /* renamed from: e */
    static List<C87429a> f198254e;

    /* renamed from: f */
    static List<String> f198255f;

    /* renamed from: g */
    private static boolean f198256g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.base.EarlyTraceEvent$a */
    public static final class C87429a {

        /* renamed from: a */
        final boolean f198257a;

        /* renamed from: b */
        final String f198258b;

        /* renamed from: c */
        final long f198259c;

        /* renamed from: d */
        final long f198260d;

        static {
            Covode.recordClassIndex(103341);
        }
    }

    private static native void nativeRecordEarlyEvent(String str, long j, long j2, int i, long j3);

    private static native void nativeRecordEarlyFinishAsyncEvent(String str, long j, long j2);

    private static native void nativeRecordEarlyStartAsyncEvent(String str, long j, long j2);

    public static boolean getBackgroundStartupTracingFlag() {
        return f198256g;
    }

    /* renamed from: b */
    public static boolean m151734b() {
        if (f198251b == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.base.EarlyTraceEvent$b */
    public static final class C87430b {

        /* renamed from: g */
        static final /* synthetic */ boolean f198261g = true;

        /* renamed from: a */
        final String f198262a;

        /* renamed from: b */
        final int f198263b = Process.myTid();

        /* renamed from: c */
        final long f198264c = m151738a();

        /* renamed from: d */
        final long f198265d = SystemClock.currentThreadTimeMillis();

        /* renamed from: e */
        long f198266e;

        /* renamed from: f */
        long f198267f;

        static {
            Covode.recordClassIndex(103342);
        }

        /* renamed from: a */
        static long m151738a() {
            int i = Build.VERSION.SDK_INT;
            return SystemClock.elapsedRealtimeNanos();
        }

        C87430b(String str) {
            this.f198262a = str;
        }
    }

    /* renamed from: a */
    static boolean m151731a() {
        int i = f198251b;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103340);
    }

    /* renamed from: d */
    private static long m151737d() {
        MethodCollector.m26663i(5463);
        long nativeGetTimeTicksNowUs = (TimeUtils.nativeGetTimeTicksNowUs() * 1000) - C87430b.m151738a();
        MethodCollector.m26664o(5463);
        return nativeGetTimeTicksNowUs;
    }

    /* renamed from: c */
    static void m151736c() {
        if (!f198252c.isEmpty()) {
            m151730a(f198252c);
            f198252c.clear();
        }
        if (!f198254e.isEmpty()) {
            m151733b(f198254e);
            f198254e.clear();
        }
        if (f198253d.isEmpty() && f198255f.isEmpty()) {
            f198251b = 3;
            f198253d = null;
            f198252c = null;
            f198255f = null;
            f198254e = null;
        }
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        C87445c.C87446a.f198344a.edit().putBoolean("bg_startup_tracing", z).apply();
    }

    /* renamed from: c */
    private static String m151735c(String str) {
        return str + "@" + Process.myTid();
    }

    /* renamed from: a */
    private static void m151730a(List<C87430b> list) {
        MethodCollector.m26663i(5236);
        long d = m151737d();
        for (C87430b bVar : list) {
            nativeRecordEarlyEvent(bVar.f198262a, bVar.f198264c + d, bVar.f198266e + d, bVar.f198263b, bVar.f198267f - bVar.f198265d);
        }
        MethodCollector.m26664o(5236);
    }

    /* renamed from: b */
    private static void m151733b(List<C87429a> list) {
        MethodCollector.m26663i(5355);
        long d = m151737d();
        for (C87429a aVar : list) {
            if (aVar.f198257a) {
                nativeRecordEarlyStartAsyncEvent(aVar.f198258b, aVar.f198259c, aVar.f198260d + d);
            } else {
                nativeRecordEarlyFinishAsyncEvent(aVar.f198258b, aVar.f198259c, aVar.f198260d + d);
            }
        }
        MethodCollector.m26664o(5355);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5194);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r2 = new java.lang.IllegalArgumentException("Multiple pending trace events can't have the same name: ".concat(java.lang.String.valueOf(r5)));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5194);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m151729a(java.lang.String r5) {
        /*
            r4 = 5194(0x144a, float:7.278E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            boolean r0 = m151734b()
            if (r0 != 0) goto L_0x000f
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x000f:
            com.ttnet.org.chromium.base.EarlyTraceEvent$b r3 = new com.ttnet.org.chromium.base.EarlyTraceEvent$b
            r3.<init>(r5)
            java.lang.Object r2 = com.ttnet.org.chromium.base.EarlyTraceEvent.f198250a
            monitor-enter(r2)
            boolean r0 = m151734b()     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0022:
            java.util.Map<java.lang.String, com.ttnet.org.chromium.base.EarlyTraceEvent$b> r1 = com.ttnet.org.chromium.base.EarlyTraceEvent.f198253d
            java.lang.String r0 = m151735c(r5)
            java.lang.Object r0 = r1.put(r0, r3)
            com.ttnet.org.chromium.base.EarlyTraceEvent$b r0 = (com.ttnet.org.chromium.base.EarlyTraceEvent.C87430b) r0
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0035
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0035:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Multiple pending trace events can't have the same name: "
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r2
        L_0x0048:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.EarlyTraceEvent.m151729a(java.lang.String):void");
    }

    /* renamed from: b */
    public static void m151732b(String str) {
        MethodCollector.m26663i(5212);
        if (!m151731a()) {
            MethodCollector.m26664o(5212);
            return;
        }
        synchronized (f198250a) {
            try {
                if (m151731a()) {
                    C87430b remove = f198253d.remove(m151735c(str));
                    if (remove == null) {
                        MethodCollector.m26664o(5212);
                    } else if (!C87430b.f198261g && remove.f198266e != 0) {
                        AssertionError assertionError = new AssertionError();
                        MethodCollector.m26664o(5212);
                        throw assertionError;
                    } else if (C87430b.f198261g || remove.f198267f == 0) {
                        remove.f198266e = C87430b.m151738a();
                        remove.f198267f = SystemClock.currentThreadTimeMillis();
                        f198252c.add(remove);
                        if (f198251b == 2) {
                            m151736c();
                        }
                        MethodCollector.m26664o(5212);
                    } else {
                        AssertionError assertionError2 = new AssertionError();
                        MethodCollector.m26664o(5212);
                        throw assertionError2;
                    }
                }
            } finally {
                MethodCollector.m26664o(5212);
            }
        }
    }
}
