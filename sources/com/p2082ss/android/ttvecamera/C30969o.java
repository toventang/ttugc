package com.p2082ss.android.ttvecamera;

import android.util.Log;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttvecamera.o */
public final class C30969o {

    /* renamed from: a */
    public static String f74247a = "VESDK-";

    /* renamed from: b */
    public static byte f74248b = 3;

    /* renamed from: c */
    public static volatile AbstractC30971b f74249c = new C30970a();

    /* renamed from: d */
    private static String f74250d = "monitorInfo";

    /* renamed from: com.ss.android.ttvecamera.o$b */
    public interface AbstractC30971b {
        static {
            Covode.recordClassIndex(37596);
        }

        void Log(byte b, String str, String str2);
    }

    /* renamed from: com.ss.android.ttvecamera.o$a */
    static class C30970a implements AbstractC30971b {
        static {
            Covode.recordClassIndex(37595);
        }

        @Override // com.p2082ss.android.ttvecamera.C30969o.AbstractC30971b
        public final void Log(byte b, String str, String str2) {
        }

        C30970a() {
        }
    }

    /* renamed from: a */
    public static String m63685a() {
        return Log.getStackTraceString(new Throwable());
    }

    static {
        Covode.recordClassIndex(37594);
    }

    /* renamed from: a */
    public static void m63686a(String str, String str2) {
        if ((f74248b & 4) != 0) {
            f74249c.Log((byte) 4, f74247a + str, str2);
        }
    }

    /* renamed from: b */
    public static void m63687b(String str, String str2) {
        if ((f74248b & 8) != 0) {
            f74249c.Log((byte) 8, f74247a + str, str2);
        }
    }

    /* renamed from: c */
    public static void m63688c(String str, String str2) {
        if ((f74248b & 2) != 0) {
            f74249c.Log((byte) 2, f74247a + str, str2);
        }
    }

    /* renamed from: d */
    public static void m63689d(String str, String str2) {
        if ((f74248b & 1) != 0) {
            f74249c.Log((byte) 1, f74247a + str, str2);
        }
    }
}
