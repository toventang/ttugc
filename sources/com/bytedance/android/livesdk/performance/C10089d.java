package com.bytedance.android.livesdk.performance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

/* renamed from: com.bytedance.android.livesdk.performance.d */
public final class C10089d {

    /* renamed from: a */
    public boolean f24505a;

    /* renamed from: b */
    public boolean f24506b;

    /* renamed from: c */
    public float f24507c;

    /* renamed from: d */
    public int f24508d;

    /* renamed from: e */
    public int f24509e;

    /* renamed from: f */
    public int f24510f;

    /* renamed from: g */
    public int f24511g;

    /* renamed from: h */
    public boolean f24512h;

    /* renamed from: i */
    public int f24513i;

    /* renamed from: j */
    public String f24514j;

    /* renamed from: k */
    public boolean f24515k;

    /* renamed from: l */
    private BroadcastReceiver f24516l;

    /* renamed from: m */
    private IntentFilter f24517m;

    static {
        Covode.recordClassIndex(11652);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.performance.d$a */
    public static class C10091a {

        /* renamed from: a */
        public static final C10089d f24519a = new C10089d((byte) 0);

        static {
            Covode.recordClassIndex(11654);
        }
    }

    private C10089d() {
        this.f24507c = -1.0f;
        this.f24508d = -1;
        this.f24509e = -1;
        this.f24510f = 1;
        this.f24511g = 1;
        this.f24512h = true;
        this.f24513i = -1;
        this.f24514j = "unknow";
        this.f24516l = new BroadcastReceiver() {
            /* class com.bytedance.android.livesdk.performance.C10089d.C100901 */

            static {
                Covode.recordClassIndex(11653);
            }

            /* renamed from: a */
            private static String m18620a(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void onReceive(Context context, Intent intent) {
                String str;
                if (intent != null) {
                    boolean z = true;
                    C10089d.this.f24506b = true;
                    C10089d.this.f24507c = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
                    C10089d.this.f24508d = intent.getIntExtra("level", -1);
                    C10089d.this.f24509e = intent.getIntExtra("scale", -1);
                    C10089d.this.f24510f = intent.getIntExtra("status", 1);
                    C10089d.this.f24511g = intent.getIntExtra("health", 1);
                    C10089d.this.f24512h = intent.getBooleanExtra("present", true);
                    C10089d.this.f24513i = intent.getIntExtra("voltage", -1);
                    C10089d dVar = C10089d.this;
                    if (m18620a(intent, "technology") != null) {
                        str = m18620a(intent, "technology");
                    } else {
                        str = "unknow";
                    }
                    dVar.f24514j = str;
                    int intExtra = intent.getIntExtra("status", -1);
                    C10089d dVar2 = C10089d.this;
                    if (!(intExtra == 2 || intExtra == 5)) {
                        z = false;
                    }
                    dVar2.f24515k = z;
                }
            }
        };
        this.f24517m = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    /* renamed from: a */
    public final synchronized void mo16954a() {
        boolean z;
        MethodCollector.m26663i(10803);
        if (this.f24505a) {
            MethodCollector.m26664o(10803);
            return;
        }
        try {
            this.f24505a = true;
            Intent b = m18617b(C3966y.m9669e(), this.f24516l, this.f24517m);
            if (b != null) {
                int intExtra = b.getIntExtra("status", -1);
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                } else {
                    z = false;
                }
                this.f24515k = z;
            }
        } catch (Exception unused) {
        }
        this.f24515k = true;
        MethodCollector.m26664o(10803);
    }

    /* renamed from: b */
    public final synchronized void mo16955b() {
        MethodCollector.m26663i(10805);
        if (!this.f24505a) {
            MethodCollector.m26664o(10805);
            return;
        }
        try {
            C3966y.m9669e().unregisterReceiver(this.f24516l);
            this.f24505a = false;
            MethodCollector.m26664o(10805);
        } catch (Exception unused) {
            MethodCollector.m26664o(10805);
        }
    }

    /* synthetic */ C10089d(byte b) {
        this();
    }

    /* renamed from: a */
    private static Intent m18616a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m18617b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m18616a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.C10089d.m18617b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
