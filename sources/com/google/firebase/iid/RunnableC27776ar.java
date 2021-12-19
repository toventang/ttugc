package com.google.firebase.iid;

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
import com.google.firebase.iid.C27774aq;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.io.IOException;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.ar */
public final class RunnableC27776ar implements Runnable {

    /* renamed from: a */
    public final FirebaseInstanceId f65265a;

    /* renamed from: b */
    private final long f65266b;

    /* renamed from: c */
    private final PowerManager.WakeLock f65267c;

    static {
        Covode.recordClassIndex(33364);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo46433a() {
        return this.f65265a.f65203d.mo46324a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo46434b() {
        NetworkInfo a;
        ConnectivityManager connectivityManager = (ConnectivityManager) m55551a(mo46433a(), "connectivity");
        if (connectivityManager == null || (a = m55550a(connectivityManager)) == null || !a.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m55552c() {
        C27774aq.C27775a e = this.f65265a.mo46401e();
        if (!this.f65265a.mo46396a(e)) {
            return true;
        }
        try {
            FirebaseInstanceId firebaseInstanceId = this.f65265a;
            String a = C27760ae.m55503a(firebaseInstanceId.f65203d);
            FirebaseInstanceId.m55477a(firebaseInstanceId.f65203d);
            if (Looper.getMainLooper() != Looper.myLooper()) {
                String b = ((AbstractC27807v) firebaseInstanceId.mo46392a(firebaseInstanceId.mo46391a(a, "*"))).mo46453b();
                if (b == null) {
                    return false;
                }
                if ((e == null || !b.equals(e.f65262a)) && "[DEFAULT]".equals(this.f65265a.f65203d.mo46326b())) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf = String.valueOf(this.f65265a.f65203d.mo46326b());
                        if (valueOf.length() != 0) {
                            "Invoking onNewToken for app: ".concat(valueOf);
                        } else {
                            new String("Invoking onNewToken for app: ");
                        }
                    }
                    Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                    intent.putExtra("token", b);
                    Context a2 = mo46433a();
                    Intent intent2 = new Intent(a2, FirebaseInstanceIdReceiver.class);
                    intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                    intent2.putExtra("wrapped_intent", intent);
                    a2.sendBroadcast(intent2);
                }
                return true;
            }
            throw new IOException("MAIN_THREAD");
        } catch (IOException e2) {
            String message = e2.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                String.valueOf(e2.getMessage()).length();
                return false;
            } else if (e2.getMessage() == null) {
                return false;
            } else {
                throw e2;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    public final void run() {
        if (C27773ap.m55533a().mo46426a(mo46433a())) {
            this.f65267c.acquire();
        }
        try {
            boolean z = true;
            this.f65265a.mo46395a(true);
            if (!this.f65265a.f65204e.mo46411a()) {
                this.f65265a.mo46395a(false);
                if (C27773ap.m55533a().mo46426a(mo46433a())) {
                    this.f65267c.release();
                    return;
                }
                return;
            }
            C27773ap a = C27773ap.m55533a();
            Context a2 = mo46433a();
            if (a.f65255b == null) {
                if (a2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    z = false;
                }
                a.f65255b = Boolean.valueOf(z);
            }
            a.f65254a.booleanValue();
            if (!a.f65255b.booleanValue() || mo46434b()) {
                if (m55552c()) {
                    this.f65265a.mo46395a(false);
                } else {
                    this.f65265a.mo46394a(this.f65266b);
                }
                if (C27773ap.m55533a().mo46426a(mo46433a())) {
                    this.f65267c.release();
                    return;
                }
                return;
            }
            C27777a aVar = new C27777a(this);
            FirebaseInstanceId.m55481f();
            C27777a.m55555a(aVar.f65268a.mo46433a(), aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            if (C27773ap.m55533a().mo46426a(mo46433a())) {
                this.f65267c.release();
            }
        } catch (IOException e) {
            String.valueOf(e.getMessage()).length();
            this.f65265a.mo46395a(false);
            if (C27773ap.m55533a().mo46426a(mo46433a())) {
                this.f65267c.release();
            }
        } catch (Throwable th) {
            if (C27773ap.m55533a().mo46426a(mo46433a())) {
                this.f65267c.release();
            }
            throw th;
        }
    }

    /* renamed from: com.google.firebase.iid.ar$a */
    static class C27777a extends BroadcastReceiver {

        /* renamed from: a */
        RunnableC27776ar f65268a;

        static {
            Covode.recordClassIndex(33365);
        }

        public C27777a(RunnableC27776ar arVar) {
            this.f65268a = arVar;
        }

        public final void onReceive(Context context, Intent intent) {
            RunnableC27776ar arVar = this.f65268a;
            if (arVar != null && arVar.mo46434b()) {
                FirebaseInstanceId.m55481f();
                FirebaseInstanceId.m55478a(this.f65268a, 0);
                this.f65268a.mo46433a().unregisterReceiver(this);
                this.f65268a = null;
            }
        }

        /* renamed from: b */
        private static Intent m55556b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
        public static android.content.Intent m55555a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                android.content.Intent r0 = m55556b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.RunnableC27776ar.C27777a.m55555a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    /* renamed from: a */
    private static NetworkInfo m55550a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    RunnableC27776ar(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f65265a = firebaseInstanceId;
        this.f65266b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m55551a(mo46433a(), "power")).newWakeLock(1, "fiid-sync");
        this.f65267c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: a */
    private static Object m55551a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12046);
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
                    MethodCollector.m26664o(12046);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
