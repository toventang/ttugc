package com.bytedance.ies.common.push.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class AuthenticatorService extends Service {

    /* renamed from: a */
    private C17071b f40623a;

    static {
        Covode.recordClassIndex(19525);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public void onCreate() {
        this.f40623a = new C17071b(this);
    }

    public IBinder onBind(Intent intent) {
        return this.f40623a.getIBinder();
    }
}
