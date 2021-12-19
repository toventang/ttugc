package com.p2082ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.socialbase.downloader.downloader.DownloadService */
public class DownloadService extends Service {

    /* renamed from: b */
    private static final String f72388b = DownloadService.class.getSimpleName();

    /* renamed from: a */
    protected AbstractC30425q f72389a;

    static {
        Covode.recordClassIndex(36910);
    }

    public void onCreate() {
        super.onCreate();
        C30399c.m61688a(this);
        AbstractC30425q r = C30399c.m61734r();
        this.f72389a = r;
        r.mo54031a(new WeakReference(this));
    }

    public void onDestroy() {
        if (C30434a.m62025a()) {
            C30434a.m62027b(f72388b, "Service onDestroy");
        }
        AbstractC30425q qVar = this.f72389a;
        if (qVar != null) {
            qVar.mo54039e();
            this.f72389a = null;
        }
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        boolean z;
        String str = f72388b;
        StringBuilder sb = new StringBuilder("onBind downloadServiceHandler != null:");
        if (this.f72389a != null) {
            z = true;
        } else {
            z = false;
        }
        C30434a.m62027b(str, sb.append(z).toString());
        AbstractC30425q qVar = this.f72389a;
        if (qVar != null) {
            return qVar.mo54025a(intent);
        }
        return null;
    }

    public int onStartCommand(final Intent intent, final int i, final int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        if (C30434a.m62025a()) {
            C30434a.m62027b(f72388b, "DownloadService onStartCommand");
        }
        this.f72389a.mo54036c();
        ExecutorService g = C30399c.m61721g();
        if (g != null) {
            g.execute(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.downloader.DownloadService.RunnableC303951 */

                static {
                    Covode.recordClassIndex(36911);
                }

                public final void run() {
                    if (DownloadService.this.f72389a != null) {
                        DownloadService.this.f72389a.mo54038d();
                    }
                }
            });
        }
        if (C30399c.m61718e()) {
            return 2;
        }
        return 3;
    }
}
