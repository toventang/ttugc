package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC1600g;
import com.C1764a;
import com.bytedance.covode.number.Covode;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f5359a = AbstractC1600g.m5318a("ConstraintProxy");

    ConstraintProxy() {
    }

    static {
        Covode.recordClassIndex(1819);
    }

    public static class BatteryChargingProxy extends ConstraintProxy {
        static {
            Covode.recordClassIndex(1820);
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        static {
            Covode.recordClassIndex(1821);
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        static {
            Covode.recordClassIndex(1822);
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        static {
            Covode.recordClassIndex(1823);
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        AbstractC1600g.m5317a();
        C1764a.m5928a("onReceive : %s", new Object[]{intent});
        m5485a(context, C1664b.m5493a(context));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m5485a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.ConstraintProxy.m5485a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
