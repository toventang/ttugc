package com.p2082ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.DownloadService;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.downloader.q */
public interface AbstractC30425q<T extends DownloadService> {
    static {
        Covode.recordClassIndex(36944);
    }

    /* renamed from: a */
    IBinder mo54025a(Intent intent);

    /* renamed from: a */
    void mo54026a(int i);

    /* renamed from: a */
    void mo54027a(int i, Notification notification);

    /* renamed from: a */
    void mo54029a(AbstractC30424p pVar);

    /* renamed from: a */
    void mo54031a(WeakReference<T> weakReference);

    /* renamed from: a */
    void mo54032a(boolean z);

    /* renamed from: a */
    boolean mo54033a();

    /* renamed from: b */
    void mo54034b(DownloadTask downloadTask);

    /* renamed from: b */
    boolean mo54035b();

    /* renamed from: c */
    void mo54036c();

    /* renamed from: c */
    void mo54037c(DownloadTask downloadTask);

    /* renamed from: d */
    void mo54038d();

    /* renamed from: e */
    void mo54039e();

    /* renamed from: g */
    void mo54041g();
}
