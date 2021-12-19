package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.ServiceC1208p;
import androidx.work.AbstractC1600g;
import androidx.work.impl.background.systemalarm.C1667e;
import androidx.work.impl.utils.C1714f;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import java.util.HashMap;

public class SystemAlarmService extends ServiceC1208p implements C1667e.AbstractC1670b {

    /* renamed from: a */
    private static final String f5362a = AbstractC1600g.m5318a("SystemAlarmService");

    /* renamed from: b */
    private C1667e f5363b;

    static {
        Covode.recordClassIndex(1826);
    }

    @Override // androidx.lifecycle.ServiceC1208p
    public void onCreate() {
        super.onCreate();
        C1667e eVar = new C1667e(this);
        this.f5363b = eVar;
        if (eVar.f5392i != null) {
            AbstractC1600g.m5317a();
        } else {
            eVar.f5392i = this;
        }
    }

    @Override // androidx.lifecycle.ServiceC1208p
    public void onDestroy() {
        super.onDestroy();
        C1667e eVar = this.f5363b;
        eVar.f5387d.mo5408b(eVar);
        eVar.f5386c.f5402a.shutdownNow();
        eVar.f5392i = null;
    }

    @Override // androidx.work.impl.background.systemalarm.C1667e.AbstractC1670b
    /* renamed from: a */
    public final void mo5448a() {
        AbstractC1600g.m5317a();
        HashMap hashMap = new HashMap();
        synchronized (C1714f.f5527a) {
            hashMap.putAll(C1714f.f5527a);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C1764a.m5928a("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)});
                AbstractC1600g.m5317a();
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.ServiceC1208p
    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            return 3;
        }
        this.f5363b.mo5454a(intent, i2);
        return 3;
    }
}
