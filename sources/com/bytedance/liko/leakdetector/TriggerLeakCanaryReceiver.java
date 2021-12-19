package com.bytedance.liko.leakdetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import leakcanary.internal.InternalLeakCanary;
import p4600h.p4611f.p4613b.C89219l;

public final class TriggerLeakCanaryReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(24429);
    }

    public final void onReceive(Context context, Intent intent) {
        C89219l.m154719c("on receive trigger LeakCanary", "");
        InternalLeakCanary.INSTANCE.onDumpHeapReceived();
    }
}
