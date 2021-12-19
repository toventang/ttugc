package com.bytedance.common.utility;

import com.bytedance.covode.number.Covode;

public class Logger {
    private static int mLevel = 4;
    private static AbstractC13581b sLogWriter = C13579a.C13580a.f33024a;

    /* renamed from: d */
    public static void m24395d(String str) {
    }

    /* renamed from: e */
    public static void m24398e(String str) {
    }

    /* renamed from: i */
    public static void m24401i(String str) {
    }

    /* renamed from: v */
    public static void m24407v(String str) {
    }

    /* renamed from: w */
    public static void m24410w(String str) {
    }

    /* renamed from: com.bytedance.common.utility.Logger$a */
    static final class C13579a extends AbstractC13581b {
        static {
            Covode.recordClassIndex(15604);
        }

        private C13579a() {
        }

        /* renamed from: com.bytedance.common.utility.Logger$a$a */
        static class C13580a {

            /* renamed from: a */
            public static final C13579a f33024a = new C13579a((byte) 0);

            static {
                Covode.recordClassIndex(15605);
            }
        }

        /* synthetic */ C13579a(byte b) {
            this();
        }
    }

    public static int getLogLevel() {
        return mLevel;
    }

    static {
        Covode.recordClassIndex(15603);
    }

    public static boolean debug() {
        if (mLevel <= 3) {
            return true;
        }
        return false;
    }

    public static void registerLogHandler(AbstractC13581b bVar) {
        sLogWriter = bVar;
    }

    public static void setLogLevel(int i) {
        mLevel = i;
    }

    /* renamed from: k */
    public static void m24404k(String str) {
        m24405k("Logger", str);
    }

    /* renamed from: com.bytedance.common.utility.Logger$b */
    public static abstract class AbstractC13581b {
        static {
            Covode.recordClassIndex(15606);
        }

        /* renamed from: a */
        public static boolean m24413a(int i) {
            if (Logger.getLogLevel() <= i) {
                return true;
            }
            return false;
        }
    }

    public static void alertErrorInfo(String str) {
        if (debug()) {
            throw new IllegalStateException(str);
        }
    }

    private static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static void throwException(Throwable th) {
        if (th != null && debug()) {
            throw new RuntimeException("Error! Now in debug, we alert to you to correct it !", th);
        }
    }

    /* renamed from: d */
    public static void m24396d(String str, String str2) {
        if (str2 != null) {
            AbstractC13581b.m24413a(3);
        }
    }

    /* renamed from: e */
    public static void m24399e(String str, String str2) {
        if (str2 != null) {
            AbstractC13581b.m24413a(6);
        }
    }

    /* renamed from: i */
    public static void m24402i(String str, String str2) {
        if (str2 != null) {
            AbstractC13581b.m24413a(4);
        }
    }

    /* renamed from: v */
    public static void m24408v(String str, String str2) {
        if (str2 != null) {
            AbstractC13581b.m24413a(2);
        }
    }

    /* renamed from: w */
    public static void m24411w(String str, String str2) {
        if (str2 != null) {
            AbstractC13581b.m24413a(5);
        }
    }

    /* renamed from: k */
    public static void m24405k(String str, String str2) {
        AbstractC13581b.m24413a(3);
    }

    /* renamed from: st */
    public static void m24406st(String str, int i) {
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (int i2 = 1; i2 < Math.min(i, stackTrace.length); i2++) {
                getSimpleClassName(stackTrace[i2].getClassName());
                stackTrace[i2].getMethodName();
            }
        }
    }

    /* renamed from: d */
    public static void m24397d(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            AbstractC13581b.m24413a(3);
        }
    }

    /* renamed from: e */
    public static void m24400e(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            AbstractC13581b.m24413a(6);
        }
    }

    /* renamed from: i */
    public static void m24403i(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            AbstractC13581b.m24413a(4);
        }
    }

    /* renamed from: v */
    public static void m24409v(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            AbstractC13581b.m24413a(2);
        }
    }

    /* renamed from: w */
    public static void m24412w(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            AbstractC13581b.m24413a(5);
        }
    }
}
