package com.p2082ss.android.message;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.push.p1588a.C21758a;
import com.bytedance.push.third.C21923g;
import com.p2082ss.android.p2203ug.bus.C30980b;
import com.p2082ss.android.pushmanager.p2172a.C30209b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.message.NotifyService */
public class NotifyService extends Service {
    static {
        Covode.recordClassIndex(36553);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C21758a.m40727a(m60797a(this)).mo35394a();
        C30066d.m60817a().mo53432a(new Runnable() {
            /* class com.p2082ss.android.message.NotifyService.RunnableC300591 */

            static {
                Covode.recordClassIndex(36554);
            }

            public final void run() {
                try {
                    C21923g.m41223a().mo35684a(NotifyService.m60797a(NotifyService.this));
                } catch (Throwable unused) {
                }
            }
        }, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            C21923g.m41223a().mo35688b();
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static Context m60797a(NotifyService notifyService) {
        Context applicationContext = notifyService.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        Logger.debug();
        C30066d.m60817a().mo53432a(new Runnable() {
            /* class com.p2082ss.android.message.NotifyService.RunnableC300602 */

            static {
                Covode.recordClassIndex(36555);
            }

            public final void run() {
                try {
                    C21923g.m41223a().mo35687a(intent);
                } catch (Throwable unused) {
                }
            }
        }, 0);
        C30209b.AbstractC30211b bVar = (C30209b.AbstractC30211b) C30980b.m63694a(C30209b.AbstractC30211b.class);
        if (bVar == null || bVar.mo35474g()) {
            return 2;
        }
        return onStartCommand;
    }
}
