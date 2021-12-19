package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p927e.C13853a;
import com.bytedance.crash.p927e.C13859d;
import com.bytedance.crash.runtime.C14000c;
import com.bytedance.crash.runtime.C14017l;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.util.C14075v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import org.json.JSONException;

/* renamed from: com.bytedance.crash.n */
public final class C13934n {

    /* renamed from: a */
    public static boolean f33955a;

    /* renamed from: b */
    static boolean f33956b;

    /* renamed from: c */
    static boolean f33957c;

    /* renamed from: d */
    static boolean f33958d;

    /* renamed from: e */
    static boolean f33959e;

    /* renamed from: f */
    public static final C14000c f33960f = new C14000c();

    /* renamed from: g */
    static boolean f33961g;

    /* renamed from: h */
    public static boolean f33962h;

    /* renamed from: i */
    public static boolean f33963i;

    /* renamed from: j */
    public static C13944b f33964j;

    /* renamed from: k */
    public static C13943a f33965k;

    /* renamed from: com.bytedance.crash.n$a */
    public static class C13943a {
        static {
            Covode.recordClassIndex(16003);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo22247a(int i, int i2, int i3, int i4, int i5, int i6) {
        }

        /* renamed from: a */
        public void mo22248a(String str) {
        }
    }

    /* renamed from: com.bytedance.crash.n$b */
    public static class C13944b {
        static {
            Covode.recordClassIndex(16004);
        }

        /* renamed from: a */
        public void mo22246a(int i, int i2, int i3, boolean z) {
        }
    }

    static {
        Covode.recordClassIndex(15994);
    }

    /* renamed from: a */
    public static boolean m25236a() {
        if (C13853a.f33722d || NativeImpl.m25248b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m25237b() {
        if (C13853a.m25024b() || NativeImpl.m25248b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static synchronized void m25235a(Context context) {
        String str;
        Application application;
        Context context2 = context;
        synchronized (C13934n.class) {
            MethodCollector.m26663i(1048);
            if (C13933m.f33937b != null) {
                application = C13933m.f33937b;
            } else if (context2 instanceof Application) {
                application = (Application) context2;
                if (application.getBaseContext() == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Please slardar oncall. Application not be attached, please init use the param from attachBaseContext, and invoke Npth.setApplication(Application) before init.");
                    MethodCollector.m26664o(1048);
                    throw illegalArgumentException;
                }
            } else {
                try {
                    Context applicationContext = context2.getApplicationContext();
                    if (C58003a.f132201c) {
                        if (applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                    }
                    application = (Application) applicationContext;
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context2 = application.getBaseContext();
                    }
                } finally {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Please slardar oncall. Please invoke Npth.setApplication(Application) before init.");
                    MethodCollector.m26664o(1048);
                }
            }
            m25234a(application, context2, true, true, true, true);
            MethodCollector.m26664o(1048);
        }
    }

    /* renamed from: a */
    public static void m25233a(int i, int i2, int i3, int i4, int i5, int i6) {
        C13943a aVar = f33965k;
        if (aVar != null) {
            aVar.mo22247a(i, i2, i3, i4, i5, i6);
        }
    }

    /* renamed from: a */
    public static synchronized void m25234a(Application application, Context context, boolean z, boolean z2, boolean z3, final boolean z4) {
        synchronized (C13934n.class) {
            MethodCollector.m26663i(1249);
            if (f33955a) {
                MethodCollector.m26664o(1249);
                return;
            }
            f33955a = true;
            C14017l.m25415a("start");
            if (context == null || application == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("context or Application must be not null.");
                MethodCollector.m26664o(1249);
                throw illegalArgumentException;
            }
            C13933m.m25223a(application, context);
            C14017l.m25415a("NpthBus_initGlobal");
            if (z || z2) {
                C13853a a = C13853a.m25018a();
                if (z2) {
                    a.f33726a = new C13859d(context, true);
                }
                if (z) {
                    a.f33727b = new C13859d(context, false);
                }
                f33956b = true;
            }
            C14017l.m25415a("javaCrashInit");
            NativeImpl.m25245a();
            C14017l.m25415a("NativeImpl_loadLibrary");
            if (z3) {
                f33958d = NativeImpl.m25246a(context);
                C14017l.m25415a("NativeImpl_startMonitorNativeCrash");
                if (!f33958d) {
                    f33959e = true;
                }
            }
            C14019n.m25421b().mo22552a(new Runnable() {
                /* class com.bytedance.crash.C13934n.RunnableC139362 */

                static {
                    Covode.recordClassIndex(15996);
                }

                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0067 */
                /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
                /* JADX WARNING: Removed duplicated region for block: B:46:0x0106  */
                /* JADX WARNING: Removed duplicated region for block: B:47:0x0110  */
                /* JADX WARNING: Removed duplicated region for block: B:49:0x0119  */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x011f  */
                /* JADX WARNING: Removed duplicated region for block: B:59:0x0138 A[Catch:{ all -> 0x016a }] */
                /* JADX WARNING: Removed duplicated region for block: B:63:0x0145 A[Catch:{ all -> 0x016a }] */
                /* JADX WARNING: Removed duplicated region for block: B:76:0x017a  */
                /* JADX WARNING: Removed duplicated region for block: B:87:0x01ad  */
                /* JADX WARNING: Removed duplicated region for block: B:89:0x01bd  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 452
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.C13934n.RunnableC139362.run():void");
                }
            }, 0);
            C14017l.m25415a("startNpthDefaultThread");
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                C14017l.f34164a.put("total", uptimeMillis - C14017l.f34165b);
                C14075v.m25650a("npth init total cost : " + (uptimeMillis - C14017l.f34165b) + " ms");
                MethodCollector.m26664o(1249);
            } catch (JSONException unused) {
                MethodCollector.m26664o(1249);
            }
        }
    }
}
