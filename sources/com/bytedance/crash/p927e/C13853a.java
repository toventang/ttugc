package com.bytedance.crash.p927e;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashFilter;
import com.bytedance.crash.IOOMCallback;
import com.bytedance.crash.p932j.C13892b;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14069r;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.crash.e.a */
public final class C13853a implements Thread.UncaughtExceptionHandler {

    /* renamed from: d */
    public static volatile boolean f33722d;

    /* renamed from: e */
    private static C13853a f33723e;

    /* renamed from: j */
    private static final ThreadLocal<Boolean> f33724j = new ThreadLocal<>();

    /* renamed from: k */
    private static final ArrayList<AbstractC13857b> f33725k = new ArrayList<>();

    /* renamed from: a */
    public AbstractC13858c f33726a;

    /* renamed from: b */
    public AbstractC13858c f33727b;

    /* renamed from: c */
    public final ConcurrentHashMap<String, Object> f33728c = new ConcurrentHashMap<>();

    /* renamed from: f */
    private Thread.UncaughtExceptionHandler f33729f;

    /* renamed from: g */
    private volatile int f33730g;

    /* renamed from: h */
    private volatile int f33731h;

    /* renamed from: i */
    private final ConcurrentHashMap<String, Object> f33732i = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C13853a m25018a() {
        if (f33723e == null) {
            f33723e = new C13853a();
        }
        return f33723e;
    }

    static {
        Covode.recordClassIndex(15910);
    }

    private C13853a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f33729f = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* renamed from: b */
    public static boolean m25024b() {
        Boolean bool = f33724j.get();
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static int m25029e() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList<AbstractC13857b> arrayList = f33725k;
            if (i >= arrayList.size()) {
                break;
            }
            try {
                try {
                    i2 |= arrayList.get(i).mo22308a();
                } catch (Throwable th) {
                    C13849d.m25014a("NPTH_CATCH", th);
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    /* renamed from: c */
    private void m25026c() {
        MethodCollector.m26663i(546);
        synchronized (this) {
            try {
                this.f33731h--;
            } finally {
                MethodCollector.m26664o(546);
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f33731h != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50);
        }
    }

    /* renamed from: d */
    private static void m25028d() {
        File a = C14069r.m25619a(C13933m.f33936a);
        File a2 = C14069r.m25618a();
        if (!C14056j.m25579b(a) || !C14056j.m25579b(a2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (!C13892b.m25129a().f33824c && C14044b.m25518b(C13933m.f33936a) && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
                try {
                    SystemClock.sleep(500);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: f */
    private static Throwable m25030f() {
        int i = 0;
        while (true) {
            ArrayList<AbstractC13857b> arrayList = f33725k;
            if (i >= arrayList.size()) {
                break;
            }
            try {
                arrayList.get(i);
                i++;
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        do {
            th = m25020a(thread, th);
        } while (th != null);
    }

    /* renamed from: c */
    private void m25027c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f33729f;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: b */
    private static boolean m25025b(Thread thread, Throwable th) {
        ICrashFilter crashFilter = C13933m.f33943h.getCrashFilter();
        if (crashFilter != null) {
            try {
                if (!crashFilter.onJavaCrashFilter(th, thread)) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063 A[SYNTHETIC, Splitter:B:31:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0066 A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093 A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00aa A[Catch:{ all -> 0x017a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6 A[Catch:{ all -> 0x017a }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7 A[Catch:{ all -> 0x017a }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010b A[Catch:{ all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A[Catch:{ all -> 0x01b5, all -> 0x01c8, all -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x018e A[ADDED_TO_REGION, Catch:{ all -> 0x01b5, all -> 0x01c8, all -> 0x01e0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Throwable m25020a(java.lang.Thread r26, java.lang.Throwable r27) {
        /*
        // Method dump skipped, instructions count: 486
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p927e.C13853a.m25020a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: b */
    private static void m25023b(Thread thread, Throwable th, boolean z, long j) {
        m25022a(thread, th, z, j, C13934n.f33960f.f34133c);
    }

    /* renamed from: a */
    public static void m25021a(Thread thread, Throwable th, boolean z, long j) {
        m25022a(thread, th, z, j, C13934n.f33960f.f34134d);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0130 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013f A[Catch:{ all -> 0x0152, all -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014c A[Catch:{ all -> 0x0152, all -> 0x015c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m25019a(java.io.File r12, java.lang.Throwable r13, java.lang.Thread r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 426
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p927e.C13853a.m25019a(java.io.File, java.lang.Throwable, java.lang.Thread, boolean):java.lang.String");
    }

    /* renamed from: a */
    private static void m25022a(Thread thread, Throwable th, boolean z, long j, List<IOOMCallback> list) {
        CrashType crashType;
        if (z) {
            crashType = CrashType.LAUNCH;
        } else {
            crashType = CrashType.JAVA;
        }
        for (IOOMCallback iOOMCallback : list) {
            try {
                iOOMCallback.onCrash(crashType, th, thread, j);
            } catch (Throwable unused) {
                C13933m.f33942g.isDebugMode();
            }
        }
    }
}
