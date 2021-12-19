package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.AbstractC1600g;
import androidx.work.impl.C1687f;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f5361a = AbstractC1600g.m5318a("RescheduleReceiver");

    static {
        Covode.recordClassIndex(1825);
    }

    /* renamed from: a */
    private static BroadcastReceiver.PendingResult m5486a(RescheduleReceiver rescheduleReceiver) {
        boolean a;
        try {
            if ("com.google.firebase.iid.FirebaseInstanceIdReceiver".equals(rescheduleReceiver.getClass().getName())) {
                try {
                    a = SettingsManager.m29616a().mo25400a("fire_base_receiver_opt", true);
                } catch (Throwable unused) {
                }
                if (a) {
                    return null;
                }
            }
            return rescheduleReceiver.goAsync();
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m5487a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.RescheduleReceiver.m5487a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public void onReceive(Context context, Intent intent) {
        AbstractC1600g.m5317a();
        C1764a.m5928a("Received intent %s", new Object[]{intent});
        if (Build.VERSION.SDK_INT >= 23) {
            C1687f b = C1687f.m5535b();
            if (b == null) {
                AbstractC1600g.m5317a();
                return;
            }
            BroadcastReceiver.PendingResult a = m5486a(this);
            synchronized (C1687f.f5429l) {
                b.f5438i = a;
                if (b.f5437h) {
                    b.f5438i.finish();
                    b.f5438i = null;
                }
            }
            return;
        }
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        m5487a(context, intent2);
    }
}
