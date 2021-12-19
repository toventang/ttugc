package com.p2082ss.android.http;

import android.app.IntentService;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

/* renamed from: com.ss.android.http.OpenUrlService */
public class OpenUrlService extends IntentService {
    static {
        Covode.recordClassIndex(36337);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public OpenUrlService() {
        super("OpenUrlService");
    }
}
