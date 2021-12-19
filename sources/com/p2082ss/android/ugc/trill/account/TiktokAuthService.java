package com.p2082ss.android.ugc.trill.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

/* renamed from: com.ss.android.ugc.trill.account.TiktokAuthService */
public class TiktokAuthService extends Service {
    static {
        Covode.recordClassIndex(99099);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public IBinder onBind(Intent intent) {
        return new C85077a(this).getIBinder();
    }
}
