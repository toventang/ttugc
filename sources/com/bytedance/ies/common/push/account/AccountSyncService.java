package com.bytedance.ies.common.push.account;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

public class AccountSyncService extends Service {

    /* renamed from: a */
    private static C17074d f40621a;

    /* renamed from: b */
    private static final Object f40622b = new Object();

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    static {
        Covode.recordClassIndex(19524);
    }

    public void onCreate() {
        MethodCollector.m26663i(3370);
        synchronized (f40622b) {
            try {
                if (f40621a == null) {
                    Context applicationContext = getApplicationContext();
                    if (C58003a.f132201c) {
                        if (applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                    }
                    f40621a = new C17074d(applicationContext);
                }
            } finally {
                MethodCollector.m26664o(3370);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return f40621a.getSyncAdapterBinder();
    }
}
