package com.bytedance.crash.runtime;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Printer;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.crash.runtime.k */
public class C14015k {

    /* renamed from: a */
    public static Printer f34157a;

    /* renamed from: e */
    public static final Printer f34158e = new Printer() {
        /* class com.bytedance.crash.runtime.C14015k.C140161 */

        static {
            Covode.recordClassIndex(16081);
        }

        public final void println(String str) {
            if (str != null) {
                if (str.charAt(0) == '>') {
                    C14015k a = C14015k.m25409a();
                    a.f34160b = -1;
                    try {
                        C14015k.m25410a(a.f34161c, str);
                    } catch (Exception unused) {
                        C13933m.f33942g.isDebugMode();
                    }
                } else if (str.charAt(0) == '<') {
                    C14015k a2 = C14015k.m25409a();
                    a2.f34160b = SystemClock.uptimeMillis();
                    try {
                        C14015k.m25410a(a2.f34162d, str);
                    } catch (Exception unused2) {
                        C13933m.f33942g.isDebugMode();
                    }
                }
                if (C14015k.f34157a != null && C14015k.f34157a != C14015k.f34158e) {
                    C14015k.f34157a.println(str);
                }
            }
        }
    };

    /* renamed from: g */
    private static C14015k f34159g;

    /* renamed from: b */
    long f34160b = -1;

    /* renamed from: c */
    final List<Printer> f34161c = new ArrayList();

    /* renamed from: d */
    public final List<Printer> f34162d = new ArrayList();

    /* renamed from: f */
    public boolean f34163f;

    static {
        Covode.recordClassIndex(16080);
    }

    private C14015k() {
    }

    /* renamed from: c */
    public final boolean mo22532c() {
        if (this.f34160b == -1 || SystemClock.uptimeMillis() - this.f34160b <= 5000) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C14015k m25409a() {
        MethodCollector.m26663i(1439);
        if (f34159g == null) {
            synchronized (C14015k.class) {
                try {
                    if (f34159g == null) {
                        f34159g = new C14015k();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1439);
                    throw th;
                }
            }
        }
        C14015k kVar = f34159g;
        MethodCollector.m26664o(1439);
        return kVar;
    }

    /* renamed from: b */
    public static Printer m25411b() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            C13933m.f33942g.isDebugMode();
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo22531a(Printer printer) {
        MethodCollector.m26663i(2242);
        this.f34161c.add(printer);
        MethodCollector.m26664o(2242);
    }

    /* renamed from: a */
    static void m25410a(List<? extends Printer> list, String str) {
        if (list != null && !list.isEmpty()) {
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Printer printer = (Printer) list.get(i);
                    if (printer != null) {
                        printer.println(str);
                    } else {
                        return;
                    }
                }
            } catch (Throwable unused) {
                C13933m.f33942g.isDebugMode();
            }
        }
    }
}
