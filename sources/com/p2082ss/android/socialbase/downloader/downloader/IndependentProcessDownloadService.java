package com.p2082ss.android.socialbase.downloader.downloader;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService */
public class IndependentProcessDownloadService extends DownloadService {
    static {
        Covode.recordClassIndex(36913);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.DownloadService
    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.DownloadService
    public void onCreate() {
        super.onCreate();
        C30399c.m61688a(this);
        if (C30399c.f72430b == null) {
            C30399c.m61691a(new C30433x());
        }
        this.f72389a = C30399c.m61735s();
        this.f72389a.mo54031a(new WeakReference(this));
    }
}
