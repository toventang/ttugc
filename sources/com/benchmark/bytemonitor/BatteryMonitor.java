package com.benchmark.bytemonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

public class BatteryMonitor {
    private double batteryLevel = -1.0d;
    private Context mContext;
    private int temperature = -1;

    static {
        Covode.recordClassIndex(2782);
    }

    public double getBatteryLevel() {
        getBattery();
        return this.batteryLevel;
    }

    public double getTemperature() {
        getBattery();
        double d = (double) this.temperature;
        Double.isNaN(d);
        return d / 10.0d;
    }

    private void getBattery() {
        try {
            Intent com_benchmark_bytemonitor_BatteryMonitor_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver = m7266xca5027ca(this.mContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (com_benchmark_bytemonitor_BatteryMonitor_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver != null) {
                int intExtra = com_benchmark_bytemonitor_BatteryMonitor_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("level", -1);
                int intExtra2 = com_benchmark_bytemonitor_BatteryMonitor_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("scale", -1);
                if (!(intExtra == -1 || intExtra2 == -1)) {
                    if (intExtra2 == 0) {
                        this.batteryLevel = 0.0d;
                    } else {
                        double d = (double) intExtra;
                        double d2 = (double) intExtra2;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        this.batteryLevel = (d / d2) * 100.0d;
                    }
                }
                this.temperature = com_benchmark_bytemonitor_BatteryMonitor_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("temperature", -1);
            }
        } catch (Exception unused) {
        }
    }

    public BatteryMonitor(Context context) {
        this.mContext = context;
    }

    /* renamed from: com_benchmark_bytemonitor_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m7265x90346be6(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    /* renamed from: com_benchmark_bytemonitor_BatteryMonitor_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m7266xca5027ca(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m7265x90346be6(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.bytemonitor.BatteryMonitor.m7266xca5027ca(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
