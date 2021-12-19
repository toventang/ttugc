package com.p2082ss.android.ugc.aweme.lancet.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

/* renamed from: com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper */
public class ReceiverRegisterLancetHelper {
    static {
        Covode.recordClassIndex(68074);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return m104859xa758d126(C17879g.m33104a().getBaseContext(), broadcastReceiver, intentFilter);
    }

    /* renamed from: com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m104859xa758d126(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return m104860xa758d126(C17879g.m33104a().getBaseContext(), broadcastReceiver, intentFilter, i);
    }

    /* renamed from: com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m104860xa758d126(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, i);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, i);
            }
            throw e;
        }
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        return m104861xa758d126(C17879g.m33104a().getBaseContext(), broadcastReceiver, intentFilter, str, handler);
    }

    /* renamed from: com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m104861xa758d126(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            }
            throw e;
        }
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        return m104862xa758d126(C17879g.m33104a().getBaseContext(), broadcastReceiver, intentFilter, str, handler, i);
    }

    /* renamed from: com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m104862xa758d126(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
            }
            throw e;
        }
    }
}
