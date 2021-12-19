package com.google.android.gms.p1930a.p1931a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.C25497c;
import com.google.android.gms.common.C25501d;
import com.google.android.gms.common.ServiceConnectionC25333a;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.stats.C25588a;
import com.google.android.gms.internal.p1941a.AbstractC25672b;
import com.google.android.gms.internal.p1941a.C25673c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.a.a.a */
public class C25248a {

    /* renamed from: a */
    private ServiceConnectionC25333a f59849a;

    /* renamed from: b */
    private AbstractC25672b f59850b;

    /* renamed from: c */
    private boolean f59851c;

    /* renamed from: d */
    private final Object f59852d = new Object();

    /* renamed from: e */
    private C25250b f59853e;

    /* renamed from: f */
    private final Context f59854f;

    /* renamed from: g */
    private final boolean f59855g;

    /* renamed from: h */
    private final long f59856h;

    /* renamed from: com.google.android.gms.a.a.a$a */
    public static final class C25249a {

        /* renamed from: a */
        public final String f59857a;

        /* renamed from: b */
        public final boolean f59858b;

        static {
            Covode.recordClassIndex(30621);
        }

        public C25249a(String str, boolean z) {
            this.f59857a = str;
            this.f59858b = z;
        }

        public final String toString() {
            String str = this.f59857a;
            return new StringBuilder(String.valueOf(str).length() + 7).append("{").append(str).append("}").append(this.f59858b).toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.a.a.a$b */
    public static class C25250b extends Thread {

        /* renamed from: a */
        CountDownLatch f59859a = new CountDownLatch(1);

        /* renamed from: b */
        boolean f59860b = false;

        /* renamed from: c */
        private WeakReference<C25248a> f59861c;

        /* renamed from: d */
        private long f59862d;

        static {
            Covode.recordClassIndex(30622);
        }

        public C25250b(C25248a aVar, long j) {
            this.f59861c = new WeakReference<>(aVar);
            this.f59862d = j;
            start();
        }

        /* renamed from: a */
        private final void m48586a() {
            C25248a aVar = this.f59861c.get();
            if (aVar != null) {
                aVar.mo41286a();
                this.f59860b = true;
            }
        }

        public final void run() {
            try {
                if (!this.f59859a.await(this.f59862d, TimeUnit.MILLISECONDS)) {
                    m48586a();
                }
            } catch (InterruptedException unused) {
                m48586a();
            }
        }
    }

    static {
        Covode.recordClassIndex(30620);
    }

    /* renamed from: a */
    public static C25249a m48579a(Context context) {
        C25252c cVar = new C25252c(context);
        boolean a = cVar.mo41292a("gads:ad_id_app_context:enabled");
        float b = cVar.mo41293b("gads:ad_id_app_context:ping_ratio");
        String a2 = cVar.mo41291a("gads:ad_id_use_shared_preference:experiment_id", "");
        C25248a aVar = new C25248a(context, a, cVar.mo41292a("gads:ad_id_use_persistent_service:enabled"));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.m48583b();
            C25249a c = aVar.m48584c();
            m48582a(c, a, b, SystemClock.elapsedRealtime() - elapsedRealtime, a2, null);
            aVar.mo41286a();
            return c;
        } catch (Throwable th) {
            aVar.mo41286a();
            throw th;
        }
    }

    /* renamed from: a */
    private static ServiceConnectionC25333a m48580a(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int isGooglePlayServicesAvailable = C25497c.getInstance().isGooglePlayServicesAvailable(context, 12451000);
            if (isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                ServiceConnectionC25333a aVar = new ServiceConnectionC25333a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    C25588a.m49390a();
                    if (C25588a.m49392b(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C25501d(9);
        }
    }

    /* renamed from: a */
    private static boolean m48582a(C25249a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (aVar != null) {
            if (!aVar.f59858b) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            if (aVar.f59857a != null) {
                hashMap.put("ad_id_size", Integer.toString(aVar.f59857a.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C25251b(hashMap).start();
        return true;
    }

    /* renamed from: b */
    private final void m48583b() {
        MethodCollector.m26663i(5783);
        C25565r.m49326c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f59851c) {
                    mo41286a();
                }
                ServiceConnectionC25333a a = m48580a(this.f59854f, this.f59855g);
                this.f59849a = a;
                this.f59850b = m48581a(a);
                this.f59851c = true;
            } finally {
                MethodCollector.m26664o(5783);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        mo41286a();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C25248a(android.content.Context r3, boolean r4, boolean r5) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f59852d = r0
            com.google.android.gms.common.internal.C25565r.m49314a(r3)
            if (r4 == 0) goto L_0x0019
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
            if (r0 != 0) goto L_0x0025
        L_0x0017:
            if (r1 != 0) goto L_0x0027
        L_0x0019:
            r2.f59854f = r3
            r0 = 0
            r2.f59851c = r0
            r0 = -1
            r2.f59856h = r0
            r2.f59855g = r5
            return
        L_0x0025:
            if (r1 == 0) goto L_0x0029
        L_0x0027:
            r3 = r1
            goto L_0x0019
        L_0x0029:
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p1930a.p1931a.C25248a.<init>(android.content.Context, boolean, boolean):void");
    }

    /* renamed from: c */
    private C25249a m48584c() {
        C25249a aVar;
        MethodCollector.m26663i(5923);
        C25565r.m49326c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f59851c) {
                    synchronized (this.f59852d) {
                        try {
                            C25250b bVar = this.f59853e;
                            if (bVar == null || !bVar.f59860b) {
                                IOException iOException = new IOException("AdvertisingIdClient is not connected.");
                                MethodCollector.m26664o(5923);
                                throw iOException;
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(5923);
                            throw th;
                        }
                    }
                    try {
                        m48583b();
                        if (!this.f59851c) {
                            IOException iOException2 = new IOException("AdvertisingIdClient cannot reconnect.");
                            MethodCollector.m26664o(5923);
                            throw iOException2;
                        }
                    } catch (Exception e) {
                        IOException iOException3 = new IOException("AdvertisingIdClient cannot reconnect.", e);
                        MethodCollector.m26664o(5923);
                        throw iOException3;
                    }
                }
                C25565r.m49314a(this.f59849a);
                C25565r.m49314a(this.f59850b);
                try {
                    aVar = new C25249a(this.f59850b.mo41922a(), this.f59850b.mo41923b());
                } catch (RemoteException unused) {
                    IOException iOException4 = new IOException("Remote exception");
                    MethodCollector.m26664o(5923);
                    throw iOException4;
                }
            } finally {
                MethodCollector.m26664o(5923);
            }
        }
        synchronized (this.f59852d) {
            try {
                C25250b bVar2 = this.f59853e;
                if (bVar2 != null) {
                    bVar2.f59859a.countDown();
                    try {
                        this.f59853e.join();
                    } catch (InterruptedException unused2) {
                    }
                }
                if (this.f59856h > 0) {
                    this.f59853e = new C25250b(this, this.f59856h);
                }
            } finally {
                MethodCollector.m26664o(5923);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo41286a() {
        MethodCollector.m26663i(5925);
        C25565r.m49326c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f59854f != null && this.f59849a != null) {
                    try {
                        if (this.f59851c) {
                            C25588a.m49390a();
                            this.f59854f.unbindService(this.f59849a);
                        }
                    } catch (Throwable unused) {
                    }
                    this.f59851c = false;
                    this.f59850b = null;
                    this.f59849a = null;
                    MethodCollector.m26664o(5925);
                }
            } finally {
                MethodCollector.m26664o(5925);
            }
        }
    }

    /* renamed from: a */
    private static AbstractC25672b m48581a(ServiceConnectionC25333a aVar) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C25565r.m49326c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
            if (!aVar.f60091a) {
                aVar.f60091a = true;
                IBinder poll = aVar.f60092b.poll(10000, timeUnit);
                if (poll != null) {
                    IInterface queryLocalInterface = poll.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    return queryLocalInterface instanceof AbstractC25672b ? (AbstractC25672b) queryLocalInterface : new C25673c(poll);
                }
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            throw new IllegalStateException("Cannot call get on this connection more than once");
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
