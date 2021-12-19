package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.internal.C25565r;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.el */
public class C26360el extends BroadcastReceiver {

    /* renamed from: b */
    private static final String f61894b = C26360el.class.getName();

    /* renamed from: a */
    final C26498jo f61895a;

    /* renamed from: c */
    private boolean f61896c;

    /* renamed from: d */
    private boolean f61897d;

    static {
        Covode.recordClassIndex(31782);
    }

    /* renamed from: a */
    public final void mo43184a() {
        this.f61895a.mo43481h();
        this.f61895a.mo43015p().mo43002c();
        if (!this.f61896c) {
            m51793b(this.f61895a.mo43012m(), this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f61897d = this.f61895a.mo43475c().mo43177e();
            this.f61895a.mo43016q().f61835k.mo43170a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f61897d));
            this.f61896c = true;
        }
    }

    /* renamed from: b */
    public final void mo43185b() {
        this.f61895a.mo43481h();
        this.f61895a.mo43015p().mo43002c();
        this.f61895a.mo43015p().mo43002c();
        if (this.f61896c) {
            this.f61895a.mo43016q().f61835k.mo43169a("Unregistering connectivity change receiver");
            this.f61896c = false;
            this.f61897d = false;
            try {
                this.f61895a.mo43012m().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f61895a.mo43016q().f61827c.mo43170a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    C26360el(C26498jo joVar) {
        C25565r.m49314a(joVar);
        this.f61895a = joVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.f61895a.mo43481h();
        String action = intent.getAction();
        this.f61895a.mo43016q().f61835k.mo43170a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean e = this.f61895a.mo43475c().mo43177e();
            if (this.f61897d != e) {
                this.f61897d = e;
                this.f61895a.mo43015p().mo43220a(new RunnableC26359ek(this, e));
                return;
            }
            return;
        }
        this.f61895a.mo43016q().f61830f.mo43170a("NetworkBroadcastReceiver received unknown action", action);
    }

    /* renamed from: a */
    private static Intent m51792a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m51793b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m51792a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26360el.m51793b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
