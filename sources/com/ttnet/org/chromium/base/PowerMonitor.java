package com.ttnet.org.chromium.base;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ttnet.org.chromium.base.C87447d;

public class PowerMonitor implements C87447d.AbstractC87450a {

    /* renamed from: a */
    public static String f198298a;

    /* renamed from: b */
    public static String f198299b;

    /* renamed from: c */
    public static String f198300c;

    /* renamed from: d */
    public static String f198301d;

    /* renamed from: e */
    public static long f198302e;

    /* renamed from: f */
    public static long f198303f;

    /* renamed from: g */
    public static boolean f198304g;

    /* renamed from: h */
    static final /* synthetic */ boolean f198305h = true;

    /* renamed from: i */
    private static final String f198306i = PowerMonitor.class.getSimpleName();

    /* renamed from: j */
    private static C87447d f198307j = new C87447d();

    /* renamed from: k */
    private static String f198308k;

    /* renamed from: l */
    private static PowerMonitor f198309l;

    /* renamed from: n */
    private static C87436a f198310n;

    /* renamed from: m */
    private boolean f198311m;

    private static native void nativeOnBatteryChargingChanged();

    private static native void nativeOnInstantResume();

    private static native void nativeOnInstantSuspend();

    public static native void nativeOnResume();

    public static native void nativeOnSuspend();

    private PowerMonitor() {
    }

    private static boolean isBatteryPower() {
        if (f198309l == null) {
            m151748e();
        }
        return f198309l.f198311m;
    }

    @Override // com.ttnet.org.chromium.base.C87447d.AbstractC87450a
    /* renamed from: c */
    public final void mo141491c() {
        MethodCollector.m26663i(4578);
        nativeOnInstantResume();
        MethodCollector.m26664o(4578);
    }

    @Override // com.ttnet.org.chromium.base.C87447d.AbstractC87450a
    /* renamed from: d */
    public final void mo141492d() {
        MethodCollector.m26663i(4579);
        nativeOnInstantSuspend();
        MethodCollector.m26664o(4579);
    }

    static {
        Covode.recordClassIndex(103357);
    }

    @Override // com.ttnet.org.chromium.base.C87447d.AbstractC87450a
    /* renamed from: a */
    public final void mo141489a() {
        MethodCollector.m26663i(4565);
        Context context = C87445c.f198342a;
        if (C87462j.m151798a(context)) {
            Intent intent = new Intent();
            intent.setAction(f198298a);
            if (!TextUtils.isEmpty(f198308k)) {
                intent.setPackage(f198308k);
            }
            context.sendBroadcast(intent);
        }
        nativeOnResume();
        MethodCollector.m26664o(4565);
    }

    @Override // com.ttnet.org.chromium.base.C87447d.AbstractC87450a
    /* renamed from: b */
    public final void mo141490b() {
        MethodCollector.m26663i(4577);
        Context context = C87445c.f198342a;
        if (C87462j.m151798a(context)) {
            Intent intent = new Intent();
            intent.setAction(f198299b);
            if (!TextUtils.isEmpty(f198308k)) {
                intent.setPackage(f198308k);
            }
            context.sendBroadcast(intent);
        }
        nativeOnSuspend();
        MethodCollector.m26664o(4577);
    }

    /* renamed from: e */
    public static void m151748e() {
        if (f198309l == null) {
            Context context = C87445c.f198342a;
            f198309l = new PowerMonitor();
            Intent b = m151747b(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (b != null) {
                m151746a(b);
            }
            f198308k = context.getPackageName();
            f198299b = f198308k + ".cronet.APP_BACKGROUND";
            f198298a = f198308k + ".cronet.APP_FOREGROUND";
            f198301d = f198308k + ".wschannel.APP_BACKGROUND";
            f198300c = f198308k + ".wschannel.APP_FOREGROUND";
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            m151747b(context, new BroadcastReceiver() {
                /* class com.ttnet.org.chromium.base.PowerMonitor.C874351 */

                static {
                    Covode.recordClassIndex(103358);
                }

                public final void onReceive(Context context, Intent intent) {
                    PowerMonitor.m151746a(intent);
                }
            }, intentFilter);
            if (!C87462j.m151798a(context) && !f198304g) {
                f198310n = new C87436a();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction(f198299b);
                intentFilter2.addAction(f198298a);
                intentFilter2.addAction(f198301d);
                intentFilter2.addAction(f198300c);
                m151747b(context, f198310n, intentFilter2);
            } else if (context instanceof Application) {
                f198307j.f198347b = f198309l;
                ((Application) context).registerActivityLifecycleCallbacks(f198307j);
            }
        }
    }

    /* renamed from: a */
    public static void m151746a(Intent intent) {
        MethodCollector.m26663i(4616);
        if (f198305h || f198309l != null) {
            int intExtra = intent.getIntExtra("plugged", -1);
            PowerMonitor powerMonitor = f198309l;
            boolean z = true;
            if (intExtra == 2 || intExtra == 1) {
                z = false;
            }
            powerMonitor.f198311m = z;
            nativeOnBatteryChargingChanged();
            MethodCollector.m26664o(4616);
            return;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.m26664o(4616);
        throw assertionError;
    }

    /* renamed from: com.ttnet.org.chromium.base.PowerMonitor$a */
    public static class C87436a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(103359);
        }

        public final void onReceive(Context context, Intent intent) {
            MethodCollector.m26663i(4108);
            long currentTimeMillis = System.currentTimeMillis();
            String action = intent.getAction();
            if (action.equals(PowerMonitor.f198298a) || action.equals(PowerMonitor.f198300c)) {
                PowerMonitor.f198302e = currentTimeMillis;
                if (currentTimeMillis - PowerMonitor.f198302e > 10000) {
                    PowerMonitor.nativeOnResume();
                }
                MethodCollector.m26664o(4108);
                return;
            }
            if (action.equals(PowerMonitor.f198299b) || action.equals(PowerMonitor.f198301d)) {
                PowerMonitor.f198303f = currentTimeMillis;
                if (currentTimeMillis - PowerMonitor.f198303f > 10000) {
                    PowerMonitor.nativeOnSuspend();
                }
            }
            MethodCollector.m26664o(4108);
        }
    }

    /* renamed from: a */
    private static Intent m151745a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m151747b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m151745a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.PowerMonitor.m151747b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
