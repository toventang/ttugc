package com.p2082ss.android.ugc.aweme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.common.net.C39152g;
import com.p2082ss.android.ugc.aweme.common.net.NetWorkStateReceiver;
import com.p2082ss.android.ugc.aweme.video.C80718d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.at */
public final class C33955at {

    /* renamed from: a */
    private List<BroadcastReceiver> f80308a = new ArrayList();

    /* renamed from: b */
    private BroadcastReceiver f80309b = null;

    static {
        Covode.recordClassIndex(40881);
    }

    /* renamed from: a */
    public final synchronized void mo60225a(Context context) {
        MethodCollector.m26663i(3761);
        mo60226a(context, new C39152g(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
        if (SettingsManager.m29616a().mo25400a("ear_phone_unplug_experiment", true)) {
            C80718d dVar = new C80718d();
            this.f80309b = dVar;
            m69533b(context, dVar, new String[]{"android.media.AUDIO_BECOMING_NOISY"});
        }
        if (context == null || Build.VERSION.SDK_INT < 26) {
            MethodCollector.m26664o(3761);
            return;
        }
        mo60226a(context, new NetWorkStateReceiver(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
        MethodCollector.m26664o(3761);
    }

    /* renamed from: b */
    public final synchronized void mo60227b(Context context) {
        MethodCollector.m26663i(3842);
        if (this.f80309b == null || !SettingsManager.m29616a().mo25400a("ear_phone_unplug_experiment", true)) {
            if (context != null) {
            }
            MethodCollector.m26664o(3842);
        }
        context.unregisterReceiver(this.f80309b);
        if (Build.VERSION.SDK_INT >= 26) {
            for (BroadcastReceiver broadcastReceiver : this.f80308a) {
                if (broadcastReceiver != null) {
                    context.unregisterReceiver(broadcastReceiver);
                }
            }
            this.f80308a.clear();
            MethodCollector.m26664o(3842);
            return;
        }
        MethodCollector.m26664o(3842);
    }

    /* renamed from: a */
    public final void mo60226a(Context context, BroadcastReceiver broadcastReceiver, String[] strArr) {
        this.f80308a.add(broadcastReceiver);
        m69533b(context, broadcastReceiver, strArr);
    }

    /* renamed from: a */
    private static Intent m69531a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: b */
    private static void m69533b(Context context, BroadcastReceiver broadcastReceiver, String[] strArr) {
        IntentFilter intentFilter = new IntentFilter();
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        m69532b(context, broadcastReceiver, intentFilter);
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
    private static android.content.Intent m69532b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m69531a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.C33955at.m69532b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
