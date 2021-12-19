package com.bytedance.android.livesdk.p605r;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

/* renamed from: com.bytedance.android.livesdk.r.d */
public final class C10314d extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final AbstractC10316e f24914a;

    /* renamed from: b */
    public int f24915b;

    /* renamed from: c */
    public boolean f24916c;

    /* renamed from: d */
    private final boolean f24917d;

    /* renamed from: e */
    private final Class[] f24918e;

    /* renamed from: f */
    private final Handler f24919f = new Handler();

    /* renamed from: g */
    private int f24920g;

    static {
        Covode.recordClassIndex(11880);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        this.f24920g++;
    }

    public final void onActivityStopped(Activity activity) {
        int i = this.f24920g - 1;
        this.f24920g = i;
        if (i == 0) {
            this.f24914a.mo17092a();
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.f24915b--;
        this.f24919f.postDelayed(new Runnable() {
            /* class com.bytedance.android.livesdk.p605r.C10314d.RunnableC103151 */

            static {
                Covode.recordClassIndex(11881);
            }

            public final void run() {
                if (C10314d.this.f24915b == 0) {
                    C10314d.this.f24916c = true;
                    C10314d.this.f24914a.mo17092a();
                }
            }
        }, 300);
    }

    public final void onActivityResumed(Activity activity) {
        this.f24915b++;
        Class[] clsArr = this.f24918e;
        if (clsArr != null) {
            int length = clsArr.length;
            int i = 0;
            while (i < length && !clsArr[i].isInstance(activity)) {
                i++;
            }
        }
        if (this.f24916c) {
            this.f24916c = false;
        }
    }

    /* renamed from: a */
    private static String m18769a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && "homekey".equals(m18769a(intent, "reason"))) {
            this.f24914a.mo17092a();
        }
    }

    /* renamed from: a */
    private static Intent m18768a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m18770b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m18768a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p605r.C10314d.m18770b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public C10314d(Context context, boolean z, Class[] clsArr, AbstractC10316e eVar) {
        this.f24917d = z;
        this.f24918e = clsArr;
        this.f24914a = eVar;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        m18770b(context, this, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }
}
