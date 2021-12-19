package com.p2082ss.android.newmedia.redbadge;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.p2082ss.android.message.C30066d;
import com.p2082ss.android.pushmanager.AbstractC30212b;
import com.p2082ss.android.pushmanager.p2172a.C30209b;

/* renamed from: com.ss.android.newmedia.redbadge.RedBadgePushProcessService */
public class RedBadgePushProcessService extends Service {
    static {
        Covode.recordClassIndex(36648);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: a */
    private static Bundle m60971a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        final Bundle bundle;
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        if (intent != null) {
            bundle = m60971a(intent);
        } else {
            bundle = null;
        }
        final C30209b.AbstractC30211b a = C30209b.m61099a();
        C30066d.m60817a().mo53432a(new Runnable() {
            /* class com.p2082ss.android.newmedia.redbadge.RedBadgePushProcessService.RunnableC301481 */

            static {
                Covode.recordClassIndex(36649);
            }

            public final void run() {
                C30209b.AbstractC30211b bVar;
                AbstractC30212b a;
                if (bundle != null && (bVar = a) != null && (a = bVar.mo35466a()) != null) {
                    if (bundle.getBoolean("app_entrance")) {
                        Logger.debug();
                        C30180c a2 = C30180c.m61045a(a);
                        if (a2.f71961e) {
                            a2.f71960d.sendEmptyMessage(1);
                        }
                    } else if (bundle.getBoolean("app_exit")) {
                        Logger.debug();
                        C30180c a3 = C30180c.m61045a(a);
                        if (a3.f71961e) {
                            a3.f71960d.sendEmptyMessage(2);
                        }
                    }
                }
            }
        }, 0);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (a == null || a.mo35474g()) {
            return 2;
        }
        return onStartCommand;
    }
}
