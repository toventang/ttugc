package com.bytedance.crash.runtime;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.crash.runtime.o */
public final class C14020o {

    /* renamed from: a */
    public static long f34171a = -1;

    /* renamed from: com.bytedance.crash.runtime.o$a */
    public static class C14021a {

        /* renamed from: a */
        private static long f34172a = -1;

        static {
            Covode.recordClassIndex(16086);
        }

        /* renamed from: a */
        public static long m25422a() {
            if (C14020o.f34171a == -1) {
                C14020o.f34171a = 1000 / m25424b();
            }
            return C14020o.f34171a;
        }

        /* renamed from: b */
        private static long m25424b() {
            long a;
            long j = f34172a;
            if (j > 0) {
                return j;
            }
            long j2 = 100;
            if (Build.VERSION.SDK_INT >= 21) {
                a = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else {
                int i = Build.VERSION.SDK_INT;
                a = m25423a("_SC_CLK_TCK");
            }
            if (a > 0) {
                j2 = a;
            }
            f34172a = j2;
            return j2;
        }

        /* renamed from: a */
        private static long m25423a(String str) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                Object obj = cls.getField("os").get(null);
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(obj, Integer.valueOf(i))).longValue();
            } catch (Throwable unused) {
                return 100;
            }
        }
    }

    static {
        Covode.recordClassIndex(16085);
    }
}
