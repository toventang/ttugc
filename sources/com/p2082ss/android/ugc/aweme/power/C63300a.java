package com.p2082ss.android.ugc.aweme.power;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

/* renamed from: com.ss.android.ugc.aweme.power.a */
public class C63300a {

    /* renamed from: c */
    private static C63300a f143678c;

    /* renamed from: a */
    float f143679a;

    /* renamed from: b */
    boolean f143680b;

    static {
        Covode.recordClassIndex(74578);
    }

    /* renamed from: a */
    public static C63300a m114796a() {
        MethodCollector.m26663i(12887);
        if (f143678c == null) {
            synchronized (C63300a.class) {
                try {
                    if (f143678c == null) {
                        f143678c = new C63300a(C17867d.m33078a());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12887);
                    throw th;
                }
            }
        }
        C63300a aVar = f143678c;
        MethodCollector.m26664o(12887);
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.power.a$a */
    public class C63301a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(74579);
        }

        public C63301a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C63300a aVar = C63300a.this;
            aVar.mo101874a(intent);
            if (C63304d.m114803a().f143686a) {
                if (aVar.f143680b || aVar.f143679a > 21.0f) {
                    C63304d.m114803a().mo101879c();
                }
            } else if (aVar.f143679a < 20.0f && !aVar.f143680b) {
                C63304d.m114803a().mo101878b();
            }
        }
    }

    private C63300a(Context context) {
        try {
            Intent b = m114797b(context, new C63301a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (b != null) {
                mo101874a(b);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo101874a(Intent intent) {
        boolean z;
        this.f143679a = (((float) intent.getIntExtra("level", -1)) / ((float) intent.getIntExtra("scale", -1))) * 100.0f;
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        } else {
            z = false;
        }
        this.f143680b = z;
    }

    /* renamed from: a */
    private static Intent m114795a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m114797b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m114795a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.power.C63300a.m114797b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
