package com.p2082ss.android.vesdk;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.TELogcat;

/* renamed from: com.ss.android.vesdk.al */
public final class C85315al {

    /* renamed from: a */
    public static byte f190970a = 7;

    /* renamed from: b */
    private static String f190971b = "VESDK-";

    /* renamed from: c */
    private static String f190972c = "monitorInfo";

    static {
        Covode.recordClassIndex(99426);
    }

    /* renamed from: b */
    public static int m146638b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return -1;
        }
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    /* renamed from: a */
    public static String m146633a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown file";
        }
        return Thread.currentThread().getStackTrace()[2].getFileName();
    }

    /* renamed from: c */
    public static String m146640c() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown function";
        }
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    /* renamed from: a */
    public static void m146635a(byte b) {
        if (!TextUtils.isEmpty(null)) {
            f190971b += ((String) null) + "-";
        }
        f190970a = b;
        byte b2 = 1;
        if (b != 1) {
            if (b == 3) {
                b2 = 2;
            } else if (b == 7) {
                b2 = 4;
            } else if (b == 15) {
                b2 = 8;
            } else if (b != 31) {
                b2 = 0;
            } else {
                b2 = 16;
            }
        }
        TELogcat.setLogLevel(b2);
    }

    /* renamed from: a */
    public static void m146637a(String str, String str2) {
        if ((f190970a & 4) != 0) {
            TELogcat.Log((byte) 4, f190971b + str, str2);
        }
    }

    /* renamed from: c */
    public static void m146641c(String str, String str2) {
        if ((f190970a & 2) != 0) {
            TELogcat.Log((byte) 2, f190971b + str, str2);
        }
    }

    /* renamed from: d */
    public static void m146642d(String str, String str2) {
        if ((f190970a & 1) != 0) {
            TELogcat.Log((byte) 1, f190971b + str, str2);
        }
    }

    /* renamed from: e */
    public static void m146643e(String str, String str2) {
        if ((f190970a & 16) != 0) {
            TELogcat.Log((byte) 16, f190971b + str, str2);
        }
    }

    /* renamed from: b */
    public static void m146639b(String str, String str2) {
        if ((f190970a & 8) != 0) {
            TELogcat.Log((byte) 8, f190971b + str, str2);
        }
    }

    /* renamed from: com.ss.android.vesdk.al$a */
    public static class C85316a {

        /* renamed from: a */
        String f190973a;

        /* renamed from: b */
        String f190974b;

        /* renamed from: c */
        String f190975c;

        static {
            Covode.recordClassIndex(99427);
        }

        public C85316a(String str, Object obj, String str2) {
            this.f190973a = str;
            this.f190974b = String.valueOf(obj);
            this.f190975c = str2;
        }
    }

    /* renamed from: a */
    public static String m146634a(String str, String str2, C85316a... aVarArr) {
        StringBuilder sb = new StringBuilder(C1764a.m5928a("%s; (Msg): {%s}; ", new Object[]{str, str2}));
        for (C85316a aVar : aVarArr) {
            if (aVar != null) {
                sb.append(C1764a.m5928a("(%s): {%s}[%s], ", new Object[]{aVar.f190973a, aVar.f190974b, aVar.f190975c}));
            }
        }
        sb.append("_for_auto_analysis_");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m146636a(Class<?> cls, String str, Throwable th) {
        if ((f190970a & 1) != 0) {
            TELogcat.Log((byte) 1, f190971b + cls.getSimpleName(), str + " Throwable msg is : " + th.getMessage());
        }
    }
}
