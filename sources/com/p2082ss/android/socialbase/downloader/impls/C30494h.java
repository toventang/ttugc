package com.p2082ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.DownloadService;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30528a;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.socialbase.downloader.impls.h */
public class C30494h extends AbstractC30396a {

    /* renamed from: f */
    private static final String f72707f = C30494h.class.getSimpleName();

    static {
        Covode.recordClassIndex(37022);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a, com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: c */
    public final void mo54036c() {
        if (C30528a.m62524a(262144)) {
            this.f72397c = true;
            this.f72399e = false;
            if (C30434a.m62025a()) {
                C30434a.m62027b(f72707f, "onStartCommandOnMainThread");
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a, com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: d */
    public final void mo54038d() {
        if (C30434a.m62025a()) {
            C30434a.m62027b(f72707f, "onStartCommand");
        }
        if (!C30528a.m62524a(262144)) {
            this.f72397c = true;
        }
        mo54040f();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a
    /* renamed from: a */
    public final void mo54028a(Context context, ServiceConnection serviceConnection) {
        try {
            m62204a(context, new Intent(context, DownloadService.class));
        } catch (Throwable unused) {
            mo54036c();
            ExecutorService g = C30399c.m61721g();
            if (g != null) {
                g.execute(new Runnable() {
                    /* class com.p2082ss.android.socialbase.downloader.impls.C30494h.RunnableC304951 */

                    static {
                        Covode.recordClassIndex(37023);
                    }

                    public final void run() {
                        C30494h.this.mo54038d();
                    }
                });
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m62204a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.impls.C30494h.m62204a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
