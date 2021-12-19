package com.google.p1970ar.core;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.p1914a.p1916b.p1917a.p1918a.p1919a.AbstractC25058b;
import com.google.p1914a.p1916b.p1917a.p1918a.p1919a.C25057a;
import com.google.p1970ar.core.ArCoreApk;
import com.google.p1970ar.core.exceptions.FatalException;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.ak */
public final class C27088ak {

    /* renamed from: a */
    AbstractC25058b f64092a;

    /* renamed from: b */
    BroadcastReceiver f64093b;

    /* renamed from: c */
    Context f64094c;

    /* renamed from: d */
    PackageInstaller f64095d;

    /* renamed from: e */
    PackageInstaller.SessionCallback f64096e;

    /* renamed from: f */
    private final Queue f64097f;

    /* renamed from: g */
    private Context f64098g;

    /* renamed from: h */
    private final ServiceConnection f64099h;

    /* renamed from: i */
    private volatile int f64100i;

    static {
        Covode.recordClassIndex(32637);
    }

    C27088ak() {
    }

    /* renamed from: c */
    static /* synthetic */ Bundle m53853c() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo45130b() {
        MethodCollector.m26663i(7882);
        this.f64100i = 1;
        this.f64092a = null;
        MethodCollector.m26664o(7882);
    }

    /* renamed from: a */
    public final synchronized void mo45125a() {
        MethodCollector.m26663i(7734);
        int i = this.f64100i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1 || i2 == 2) {
                this.f64098g.unbindService(this.f64099h);
                this.f64098g = null;
                this.f64100i = 1;
            }
            BroadcastReceiver broadcastReceiver = this.f64093b;
            if (broadcastReceiver != null) {
                this.f64094c.unregisterReceiver(broadcastReceiver);
            }
            PackageInstaller.SessionCallback sessionCallback = this.f64096e;
            if (sessionCallback != null) {
                this.f64095d.unregisterSessionCallback(sessionCallback);
                this.f64096e = null;
                MethodCollector.m26664o(7734);
                return;
            }
            MethodCollector.m26664o(7734);
            return;
        }
        MethodCollector.m26664o(7734);
        throw null;
    }

    C27088ak(byte b) {
        this();
        this.f64097f = new ArrayDeque();
        this.f64100i = 1;
        this.f64099h = new ServiceConnectionC27089al(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo45126a(android.content.Context r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r4 = 7563(0x1d8b, float:1.0598E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)     // Catch:{ all -> 0x0048 }
            r5.f64098g = r6     // Catch:{ all -> 0x0048 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "com.google.android.play.core.install.BIND_INSTALL_SERVICE"
            r1.<init>(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "com.android.vending"
            android.content.Intent r3 = r1.setPackage(r0)     // Catch:{ all -> 0x0048 }
            android.content.ServiceConnection r2 = r5.f64099h     // Catch:{ all -> 0x0048 }
            r1 = 1
            if (r6 == 0) goto L_0x0030
            boolean r0 = r6 instanceof android.content.Context     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0030
            boolean r0 = com.p2082ss.android.ugc.aweme.push.downgrade.C65713d.m117625a(r6, r3)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x002b
        L_0x0024:
            r0 = 2
            r5.f64100i = r0     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)     // Catch:{ all -> 0x0048 }
            goto L_0x0037
        L_0x002b:
            boolean r0 = r6.bindService(r3, r2, r1)     // Catch:{ all -> 0x0048 }
            goto L_0x0034
        L_0x0030:
            boolean r0 = r6.bindService(r3, r2, r1)     // Catch:{ all -> 0x0048 }
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            goto L_0x0024
        L_0x0037:
            monitor-exit(r5)
            return
        L_0x0039:
            r5.f64100i = r1
            r0 = 0
            r5.f64098g = r0
            android.content.ServiceConnection r0 = r5.f64099h
            r6.unbindService(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            monitor-exit(r5)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1970ar.core.C27088ak.mo45126a(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo45128a(IBinder iBinder) {
        AbstractC25058b bVar;
        MethodCollector.m26663i(7737);
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
            if (queryLocalInterface instanceof AbstractC25058b) {
                bVar = (AbstractC25058b) queryLocalInterface;
            } else {
                bVar = new C25057a(iBinder);
            }
        }
        this.f64092a = bVar;
        this.f64100i = 3;
        for (Runnable runnable : this.f64097f) {
            runnable.run();
        }
        MethodCollector.m26664o(7737);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo45129a(Runnable runnable) {
        MethodCollector.m26663i(8028);
        int i = this.f64100i;
        int i2 = i - 1;
        if (i == 0) {
            MethodCollector.m26664o(8028);
            throw null;
        } else if (i2 == 0) {
            C27097f fVar = new C27097f();
            MethodCollector.m26664o(8028);
            throw fVar;
        } else if (i2 == 1) {
            this.f64097f.offer(runnable);
            MethodCollector.m26664o(8028);
        } else if (i2 != 2) {
            MethodCollector.m26664o(8028);
        } else {
            runnable.run();
            MethodCollector.m26664o(8028);
        }
    }

    /* renamed from: a */
    private static void m53850a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public final synchronized void mo45127a(Context context, AbstractC27115x xVar) {
        MethodCollector.m26663i(7735);
        try {
            mo45129a(new RunnableC27091an(this, context, xVar));
            MethodCollector.m26664o(7735);
        } catch (C27097f unused) {
            xVar.mo45119a(ArCoreApk.Availability.UNKNOWN_ERROR);
            MethodCollector.m26664o(7735);
        }
    }

    /* renamed from: a */
    static void m53851a(Activity activity, C27086ai aiVar) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            C27117z zVar = C27117z.f64185a;
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo != null && next.activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                    z = true;
                    break;
                }
            }
            zVar.f64187c = !z;
            m53850a(activity, intent);
        } catch (ActivityNotFoundException e) {
            aiVar.mo45124a(new FatalException("Failed to launch installer.", e));
        }
    }

    /* renamed from: b */
    private static Intent m53852b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    public static android.content.Intent m53849a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m53852b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1970ar.core.C27088ak.m53849a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
