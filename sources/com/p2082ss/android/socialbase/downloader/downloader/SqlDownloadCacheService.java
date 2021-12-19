package com.p2082ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.p2082ss.android.socialbase.downloader.impls.C30483d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;

/* renamed from: com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService */
public class SqlDownloadCacheService extends Service {

    /* renamed from: a */
    private static final String f72394a = SqlDownloadCacheService.class.getSimpleName();

    static {
        Covode.recordClassIndex(36914);
    }

    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C30399c.m61688a(applicationContext);
    }

    public IBinder onBind(Intent intent) {
        AbstractC30430v vVar;
        AbstractC30420l q = C30399c.m61733q();
        if (q instanceof C30483d) {
            vVar = ((C30483d) q).f72683b;
        } else if (q instanceof AbstractC30430v) {
            vVar = (AbstractC30430v) q;
        } else {
            vVar = null;
        }
        if (vVar instanceof IBinder) {
            return (IBinder) vVar;
        }
        return new Binder();
    }

    /* renamed from: a */
    public static void m61653a(Context context, ServiceConnection serviceConnection) {
        if (context != null) {
            try {
                Intent intent = new Intent(context, SqlDownloadCacheService.class);
                if (serviceConnection != null) {
                    m61654a(context, intent, serviceConnection);
                }
                m61652a(context, intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m61652a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.downloader.SqlDownloadCacheService.m61652a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (C30399c.m61718e()) {
            return 2;
        }
        return onStartCommand;
    }

    /* renamed from: a */
    private static boolean m61654a(Context context, Intent intent, ServiceConnection serviceConnection) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, 1);
        }
        if (C65713d.m117625a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, 1);
    }
}
