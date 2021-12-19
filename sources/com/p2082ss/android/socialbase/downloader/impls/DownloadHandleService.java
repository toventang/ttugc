package com.p2082ss.android.socialbase.downloader.impls;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;

/* renamed from: com.ss.android.socialbase.downloader.impls.DownloadHandleService */
public class DownloadHandleService extends Service {

    /* renamed from: a */
    private static final String f72650a = DownloadHandleService.class.getSimpleName();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C30399c.m61688a(this);
    }

    static {
        Covode.recordClassIndex(37000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r2 = r5.getIntExtra("extra_download_id", 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
        /*
            r4 = this;
            com.bytedance.helios.sdk.utils.ServiceLifecycle.onStartCommand(r4, r5, r6, r7)
            super.onStartCommand(r5, r6, r7)
            if (r5 == 0) goto L_0x002f
            java.lang.String r3 = r5.getAction()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x002f
            r1 = 0
            java.lang.String r0 = "extra_download_id"
            int r2 = r5.getIntExtra(r0, r1)
            if (r2 == 0) goto L_0x002f
            java.lang.String r0 = "com.ss.android.downloader.action.DOWNLOAD_WAKEUP"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0031
            java.util.concurrent.ExecutorService r1 = com.p2082ss.android.socialbase.downloader.downloader.C30399c.m61721g()
            com.ss.android.socialbase.downloader.impls.DownloadHandleService$1 r0 = new com.ss.android.socialbase.downloader.impls.DownloadHandleService$1
            r0.<init>(r2)
            r1.execute(r0)
        L_0x002f:
            r0 = 2
            return r0
        L_0x0031:
            java.lang.String r0 = "com.ss.android.downloader.action.PROCESS_NOTIFY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0051
            com.ss.android.socialbase.downloader.downloader.d r1 = com.p2082ss.android.socialbase.downloader.downloader.C30405d.m61749a()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.booleanValue()
            r1.mo54056b(r2, r0)
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.o r0 = com.p2082ss.android.socialbase.downloader.impls.C30499l.m62246a(r0)
            if (r0 == 0) goto L_0x002f
            r0.mo54184e()
            goto L_0x002f
        L_0x0051:
            java.lang.String r0 = "com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002f
            com.p2082ss.android.socialbase.downloader.downloader.C30399c.m61707b()
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.impls.DownloadHandleService.onStartCommand(android.content.Intent, int, int):int");
    }
}
