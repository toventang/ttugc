package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.firebase.iid.C27760ae;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.io.IOException;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.x */
public final class RunnableC27886x implements Runnable {

    /* renamed from: f */
    private static final Object f65492f = new Object();

    /* renamed from: g */
    private static Boolean f65493g = null;

    /* renamed from: h */
    private static Boolean f65494h = null;

    /* renamed from: a */
    public final Context f65495a;

    /* renamed from: b */
    public final C27884v f65496b;

    /* renamed from: c */
    private final C27760ae f65497c;

    /* renamed from: d */
    private final PowerManager.WakeLock f65498d;

    /* renamed from: e */
    private final long f65499e;

    static {
        Covode.recordClassIndex(33479);
    }

    /* renamed from: b */
    public static boolean m55834b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public final void run() {
        if (m55832a(this.f65495a)) {
            this.f65498d.acquire(C27859b.f65439a);
        }
        try {
            this.f65496b.mo46592a(true);
            if (!this.f65497c.mo46411a()) {
                this.f65496b.mo46592a(false);
                if (m55832a(this.f65495a)) {
                    try {
                        this.f65498d.release();
                    } catch (RuntimeException unused) {
                    }
                }
            } else if (!m55835b(this.f65495a) || mo46596a()) {
                if (this.f65496b.mo46593a()) {
                    this.f65496b.mo46592a(false);
                } else {
                    this.f65496b.mo46590a(this.f65499e);
                }
                if (m55832a(this.f65495a)) {
                    try {
                        this.f65498d.release();
                    } catch (RuntimeException unused2) {
                    }
                }
            } else {
                C27887a aVar = new C27887a(this);
                m55834b();
                C27887a.m55837a(RunnableC27886x.this.f65495a, aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (m55832a(this.f65495a)) {
                    try {
                        this.f65498d.release();
                    } catch (RuntimeException unused3) {
                    }
                }
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to sync topics. Won't retry sync. ".concat(valueOf);
            } else {
                new String("Failed to sync topics. Won't retry sync. ");
            }
            this.f65496b.mo46592a(false);
            if (m55832a(this.f65495a)) {
                try {
                    this.f65498d.release();
                } catch (RuntimeException unused4) {
                }
            }
        } catch (Throwable th) {
            if (m55832a(this.f65495a)) {
                try {
                    this.f65498d.release();
                } catch (RuntimeException unused5) {
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo46596a() {
        NetworkInfo a;
        MethodCollector.m26663i(11770);
        ConnectivityManager connectivityManager = (ConnectivityManager) m55830a(this.f65495a, "connectivity");
        if (connectivityManager == null || (a = m55829a(connectivityManager)) == null || !a.isConnected()) {
            MethodCollector.m26664o(11770);
            return false;
        }
        MethodCollector.m26664o(11770);
        return true;
    }

    /* renamed from: a */
    private static NetworkInfo m55829a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    private static String m55831a(String str) {
        return new StringBuilder(String.valueOf(str).length() + 142).append("Missing Permission: ").append(str).append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest").toString();
    }

    /* renamed from: b */
    private static boolean m55835b(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        MethodCollector.m26663i(12074);
        synchronized (f65492f) {
            try {
                Boolean bool = f65494h;
                if (bool == null) {
                    booleanValue = m55833a(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f65494h = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } finally {
                MethodCollector.m26664o(12074);
            }
        }
        return booleanValue2;
    }

    /* renamed from: a */
    private static boolean m55832a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        MethodCollector.m26663i(11940);
        synchronized (f65492f) {
            try {
                Boolean bool = f65493g;
                if (bool == null) {
                    booleanValue = m55833a(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f65493g = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } finally {
                MethodCollector.m26664o(11940);
            }
        }
        return booleanValue2;
    }

    /* renamed from: com.google.firebase.messaging.x$a */
    class C27887a extends BroadcastReceiver {

        /* renamed from: b */
        private RunnableC27886x f65501b;

        static {
            Covode.recordClassIndex(33480);
        }

        public C27887a(RunnableC27886x xVar) {
            this.f65501b = xVar;
        }

        public final synchronized void onReceive(Context context, Intent intent) {
            MethodCollector.m26663i(12974);
            RunnableC27886x xVar = this.f65501b;
            if (xVar == null) {
                MethodCollector.m26664o(12974);
            } else if (!xVar.mo46596a()) {
                MethodCollector.m26664o(12974);
            } else {
                RunnableC27886x.m55834b();
                this.f65501b.f65496b.mo46591a(this.f65501b, 0);
                context.unregisterReceiver(this);
                this.f65501b = null;
                MethodCollector.m26664o(12974);
            }
        }

        /* renamed from: b */
        private static Intent m55838b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.Intent m55837a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                android.content.Intent r0 = m55838b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.RunnableC27886x.C27887a.m55837a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    /* renamed from: a */
    private static Object m55830a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11289);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(11289);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static boolean m55833a(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        m55831a(str);
        return false;
    }

    RunnableC27886x(C27884v vVar, Context context, C27760ae aeVar, long j) {
        this.f65496b = vVar;
        this.f65495a = context;
        this.f65499e = j;
        this.f65497c = aeVar;
        this.f65498d = ((PowerManager) m55830a(context, "power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
