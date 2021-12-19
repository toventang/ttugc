package com.p2082ss.android.push;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

/* renamed from: com.ss.android.push.DefaultService */
public class DefaultService extends IntentService {
    static {
        Covode.recordClassIndex(36697);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public DefaultService() {
        super("DefaultService");
    }

    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }
}
