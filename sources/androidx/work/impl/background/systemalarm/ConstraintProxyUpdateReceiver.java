package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC1600g;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.C1706b;
import com.C1764a;
import com.bytedance.covode.number.Covode;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f5360a = AbstractC1600g.m5318a("ConstrntProxyUpdtRecvr");

    static {
        Covode.recordClassIndex(1824);
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("Ignoring unknown action %s", new Object[]{str});
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
        boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
        boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
        boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
        AbstractC1600g.m5317a();
        C1764a.m5928a("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)});
        C1706b.m5599a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
        C1706b.m5599a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
        C1706b.m5599a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
        C1706b.m5599a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
    }
}
