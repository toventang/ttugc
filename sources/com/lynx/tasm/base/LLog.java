package com.lynx.tasm.base;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxEnv;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LLog {

    /* renamed from: a */
    public static int f66909a = -1;

    /* renamed from: b */
    public static ConcurrentHashMap<Integer, AbstractC28456e> f66910b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static Integer f66911c = 0;

    /* renamed from: d */
    private static int f66912d = 6;

    /* renamed from: e */
    private static int[] f66913e;

    /* renamed from: f */
    private static long f66914f = 0;

    private static native void nativeInitALogNative(long j, boolean z);

    private static native void nativeSetHasLoggingDelegate(boolean z);

    private static native void nativeSetNativeMinLogLevel(int i);

    private static long getALogPtr() {
        return f66914f;
    }

    private static boolean sdkAboveAndroidN() {
        if (Build.VERSION.SDK_INT > 24) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(34441);
    }

    private static boolean initALogLazy() {
        long a = C28452a.m56871a();
        if (a == 0) {
            return false;
        }
        m56858a(a);
        return true;
    }

    /* renamed from: a */
    private static void m56854a() {
        if (f66913e == null) {
            int[] iArr = new int[9];
            f66913e = iArr;
            iArr[2] = -1;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 1;
            iArr[6] = 2;
            iArr[7] = 3;
            iArr[8] = 5;
        }
    }

    /* renamed from: a */
    public static void m56858a(long j) {
        boolean z;
        MethodCollector.m26663i(2671);
        if (Build.VERSION.SDK_INT > 24) {
            z = true;
        } else {
            z = false;
        }
        f66914f = j;
        nativeInitALogNative(j, z);
        MethodCollector.m26664o(2671);
    }

    /* renamed from: a */
    public static void m56855a(int i) {
        MethodCollector.m26663i(2603);
        if (LynxEnv.m56706b().mo48573f()) {
            try {
                m56854a();
                nativeSetNativeMinLogLevel(f66913e[i]);
                if (f66912d != i) {
                    f66912d = i;
                }
                MethodCollector.m26664o(2603);
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                e.getMessage();
                f66912d = 6;
                nativeSetNativeMinLogLevel(f66913e[6]);
            }
        }
        MethodCollector.m26664o(2603);
    }

    /* renamed from: a */
    public static synchronized int m56853a(AbstractC28453b bVar) {
        int intValue;
        synchronized (LLog.class) {
            MethodCollector.m26663i(2618);
            Integer valueOf = Integer.valueOf(f66911c.intValue() + 1);
            f66911c = valueOf;
            if (bVar.mo33433a() == 1) {
                int i = f66909a;
                if (i != -1) {
                    f66910b.remove(Integer.valueOf(i));
                }
                f66909a = valueOf.intValue();
                for (Map.Entry<Integer, AbstractC28456e> entry : f66910b.entrySet()) {
                    AbstractC28456e value = entry.getValue();
                    if (!(entry.getValue() instanceof AbstractC28455d)) {
                        int i2 = f66912d;
                        if (i2 == 6) {
                            f66912d = value.mo33437b();
                        } else {
                            f66912d = Math.min(i2, value.mo33437b());
                        }
                    }
                }
                m56855a(f66912d);
            } else if (!(bVar instanceof AbstractC28455d)) {
                int i3 = f66912d;
                if (i3 == 6) {
                    f66912d = bVar.mo33437b();
                } else {
                    f66912d = Math.min(i3, bVar.mo33437b());
                }
                m56855a(f66912d);
            }
            f66910b.put(valueOf, bVar);
            if (LynxEnv.m56706b().mo48573f()) {
                nativeSetHasLoggingDelegate(true);
            }
            intValue = valueOf.intValue();
            MethodCollector.m26664o(2618);
        }
        return intValue;
    }

    /* renamed from: b */
    public static void m56860b(String str, String str2) {
        m56856a(4, str, str2);
    }

    /* renamed from: c */
    public static void m56861c(String str, String str2) {
        m56856a(5, str, str2);
    }

    /* renamed from: d */
    public static void m56862d(String str, String str2) {
        m56856a(6, str, str2);
    }

    /* renamed from: a */
    public static void m56859a(String str, String str2) {
        m56856a(3, str, str2);
    }

    /* renamed from: a */
    public static void m56856a(int i, String str, String str2) {
        m56857a(i, str, str2, EnumC28458g.JAVA, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m56857a(int r4, java.lang.String r5, java.lang.String r6, com.lynx.tasm.base.EnumC28458g r7, int r8) {
        /*
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.lynx.tasm.base.e> r0 = com.lynx.tasm.base.LLog.f66910b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x000a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r2 = r3.next()
            com.lynx.tasm.base.e r2 = (com.lynx.tasm.base.AbstractC28456e) r2
            boolean r0 = r2 instanceof com.lynx.tasm.base.AbstractC28455d
            if (r0 == 0) goto L_0x005b
            r1 = r2
            com.lynx.tasm.base.d r1 = (com.lynx.tasm.base.AbstractC28455d) r1
            boolean r0 = r1.mo48915c()
            if (r0 == 0) goto L_0x000a
            boolean r0 = r1.mo48914a()
            if (r0 == 0) goto L_0x0056
        L_0x0029:
            r1 = r6
        L_0x002a:
            r0 = 2
            if (r4 == r0) goto L_0x0052
            r0 = 3
            if (r4 == r0) goto L_0x004e
            r0 = 4
            if (r4 == r0) goto L_0x004a
            r0 = 5
            if (r4 == r0) goto L_0x0046
            r0 = 6
            if (r4 == r0) goto L_0x0042
            r0 = 8
            if (r4 == r0) goto L_0x003e
            goto L_0x000a
        L_0x003e:
            r2.mo33434a(r1)
            goto L_0x000a
        L_0x0042:
            r2.mo33441e(r5, r1)
            goto L_0x000a
        L_0x0046:
            r2.mo33440d(r5, r1)
            goto L_0x000a
        L_0x004a:
            r2.mo33439c(r5, r1)
            goto L_0x000a
        L_0x004e:
            r2.mo33438b(r5, r1)
            goto L_0x000a
        L_0x0052:
            r2.mo33435a(r5, r1)
            goto L_0x000a
        L_0x0056:
            java.lang.String r1 = r6.substring(r8)
            goto L_0x002a
        L_0x005b:
            boolean r0 = r2.mo33436a(r7, r4)
            if (r0 == 0) goto L_0x000a
            goto L_0x0029
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.base.LLog.m56857a(int, java.lang.String, java.lang.String, com.lynx.tasm.base.g, int):void");
    }

    private static void log(int i, String str, String str2, int i2, long j, int i3) {
        EnumC28458g gVar;
        if (i2 == 1) {
            try {
                gVar = EnumC28458g.JS;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        } else {
            gVar = EnumC28458g.Native;
        }
        if (i != 7) {
            Long.valueOf(j);
            m56857a(i, str, str2, gVar, i3);
        }
    }
}
