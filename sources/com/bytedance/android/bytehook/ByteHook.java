package com.bytedance.android.bytehook;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class ByteHook {

    /* renamed from: a */
    public static final AbstractC2706a f8075a = null;

    /* renamed from: b */
    public static final int f8076b = EnumC2705c.AUTOMATIC.value;

    /* renamed from: c */
    private static boolean f8077c;

    /* renamed from: d */
    private static int f8078d = 1;

    /* renamed from: com.bytedance.android.bytehook.ByteHook$a */
    public static class C2703a {

        /* renamed from: a */
        public AbstractC2706a f8079a;

        /* renamed from: b */
        public int f8080b;

        /* renamed from: c */
        public boolean f8081c;

        static {
            Covode.recordClassIndex(3093);
        }
    }

    private static native String nativeGetRecords();

    private static native int nativeInit(int i, boolean z);

    private static native void nativeSetDebug(boolean z);

    static {
        Covode.recordClassIndex(3092);
    }

    /* renamed from: com.bytedance.android.bytehook.ByteHook$b */
    public static class C2704b {

        /* renamed from: a */
        private AbstractC2706a f8082a = ByteHook.f8075a;

        /* renamed from: b */
        private int f8083b = ByteHook.f8076b;

        /* renamed from: c */
        private boolean f8084c;

        static {
            Covode.recordClassIndex(3094);
        }

        /* renamed from: a */
        public final C2703a mo7222a() {
            C2703a aVar = new C2703a();
            aVar.f8079a = this.f8082a;
            aVar.f8080b = this.f8083b;
            aVar.f8081c = this.f8084c;
            return aVar;
        }
    }

    /* renamed from: a */
    public static int m7797a() {
        if (f8077c) {
            return f8078d;
        }
        return m7798a(new C2704b().mo7222a());
    }

    /* renamed from: com.bytedance.android.bytehook.ByteHook$c */
    public enum EnumC2705c {
        AUTOMATIC(0),
        MANUAL(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(3095);
        }

        private EnumC2705c(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    private static synchronized int m7798a(C2703a aVar) {
        synchronized (ByteHook.class) {
            MethodCollector.m26663i(8047);
            if (f8077c) {
                int i = f8078d;
                MethodCollector.m26664o(8047);
                return i;
            }
            f8077c = true;
            try {
                if (aVar.f8079a == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Librarian.m38965b("bytehook", false, null);
                    C58032m.m104852a(uptimeMillis, "bytehook");
                }
                try {
                    f8078d = nativeInit(aVar.f8080b, aVar.f8081c);
                } catch (Throwable unused) {
                    f8078d = 101;
                }
                int i2 = f8078d;
                MethodCollector.m26664o(8047);
                return i2;
            } catch (Throwable unused2) {
                f8078d = 100;
                MethodCollector.m26664o(8047);
                return 100;
            }
        }
    }
}
