package com.p2082ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30528a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.a */
public abstract class AbstractC30396a implements AbstractC30425q {

    /* renamed from: a */
    public static final String f72395a = AbstractC30396a.class.getSimpleName();

    /* renamed from: b */
    protected final SparseArray<List<DownloadTask>> f72396b = new SparseArray<>();

    /* renamed from: c */
    protected volatile boolean f72397c = false;

    /* renamed from: d */
    protected volatile boolean f72398d;

    /* renamed from: e */
    protected volatile boolean f72399e = false;

    /* renamed from: f */
    private WeakReference<Service> f72400f;

    /* renamed from: g */
    private Handler f72401g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private Runnable f72402h = new Runnable() {
        /* class com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a.RunnableC303971 */

        static {
            Covode.recordClassIndex(36916);
        }

        public final void run() {
            if (C30434a.m62025a()) {
                C30434a.m62027b(AbstractC30396a.f72395a, "tryDownload: 2 try");
            }
            if (!AbstractC30396a.this.f72397c) {
                if (C30434a.m62025a()) {
                    C30434a.m62027b(AbstractC30396a.f72395a, "tryDownload: 2 error");
                }
                AbstractC30396a.this.mo54028a(C30399c.m61674B(), (ServiceConnection) null);
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54028a(Context context, ServiceConnection serviceConnection) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: a */
    public void mo54029a(AbstractC30424p pVar) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: c */
    public void mo54036c() {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: c */
    public void mo54037c(DownloadTask downloadTask) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: d */
    public void mo54038d() {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: e */
    public final void mo54039e() {
        this.f72397c = false;
    }

    static {
        Covode.recordClassIndex(36915);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: b */
    public final boolean mo54035b() {
        C30434a.m62028c(f72395a, "isServiceForeground = " + this.f72398d);
        return this.f72398d;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: g */
    public void mo54041g() {
        if (!this.f72397c) {
            if (C30434a.m62025a()) {
                C30434a.m62027b(f72395a, "startService");
            }
            mo54028a(C30399c.m61674B(), (ServiceConnection) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo54040f() {
        SparseArray<List<DownloadTask>> clone;
        synchronized (this.f72396b) {
            C30434a.m62027b(f72395a, "resumePendingTask pendingTasks.size:" + this.f72396b.size());
            clone = this.f72396b.clone();
            this.f72396b.clear();
        }
        AbstractC30474a u = C30399c.m61737u();
        if (u != null) {
            for (int i = 0; i < clone.size(); i++) {
                List<DownloadTask> list = clone.get(clone.keyAt(i));
                if (list != null) {
                    for (DownloadTask downloadTask : list) {
                        C30434a.m62027b(f72395a, "resumePendingTask key:" + downloadTask.getDownloadId());
                        u.mo54277a(downloadTask);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: a */
    public final boolean mo54033a() {
        return this.f72397c;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: a */
    public void mo54026a(int i) {
        C30434a.f72547a = i;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: a */
    public IBinder mo54025a(Intent intent) {
        C30434a.m62027b(f72395a, "onBind Abs");
        return new Binder();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: a */
    public final void mo54031a(WeakReference weakReference) {
        this.f72400f = weakReference;
    }

    /* renamed from: a */
    public final void mo54030a(DownloadTask downloadTask) {
        if (downloadTask != null) {
            int downloadId = downloadTask.getDownloadId();
            synchronized (this.f72396b) {
                String str = f72395a;
                C30434a.m62027b(str, "pendDownloadTask pendingTasks.size:" + this.f72396b.size() + " downloadId:" + downloadId);
                List<DownloadTask> list = this.f72396b.get(downloadId);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f72396b.put(downloadId, list);
                }
                C30434a.m62027b(str, "before pendDownloadTask taskArray.size:" + list.size());
                list.add(downloadTask);
                C30434a.m62027b(str, "after pendDownloadTask pendingTasks.size:" + this.f72396b.size());
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: b */
    public void mo54034b(DownloadTask downloadTask) {
        if (downloadTask != null) {
            if (!this.f72397c) {
                if (C30434a.m62025a()) {
                    C30434a.m62027b(f72395a, "tryDownload but service is not alive");
                }
                if (C30528a.m62524a(262144)) {
                    mo54030a(downloadTask);
                    if (!this.f72399e) {
                        if (C30434a.m62025a()) {
                            C30434a.m62027b(f72395a, "tryDownload: 1");
                        }
                        mo54028a(C30399c.m61674B(), (ServiceConnection) null);
                        this.f72399e = true;
                        return;
                    }
                    this.f72401g.removeCallbacks(this.f72402h);
                    this.f72401g.postDelayed(this.f72402h, 10);
                    return;
                }
                mo54030a(downloadTask);
                mo54028a(C30399c.m61674B(), (ServiceConnection) null);
                return;
            }
            String str = f72395a;
            C30434a.m62027b(str, "tryDownload when isServiceAlive");
            mo54040f();
            AbstractC30474a u = C30399c.m61737u();
            if (u != null) {
                C30434a.m62027b(str, "tryDownload current task: " + downloadTask.getDownloadId());
                u.mo54277a(downloadTask);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: a */
    public final void mo54032a(boolean z) {
        WeakReference<Service> weakReference = this.f72400f;
        if (weakReference != null && weakReference.get() != null) {
            C30434a.m62028c(f72395a, "stopForeground  service = " + this.f72400f.get() + ",  isServiceAlive = " + this.f72397c);
            try {
                this.f72398d = false;
                this.f72400f.get().stopForeground(z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: a */
    public final void mo54027a(int i, Notification notification) {
        WeakReference<Service> weakReference = this.f72400f;
        if (weakReference == null || weakReference.get() == null) {
            C30434a.m62029d(f72395a, "startForeground: downloadService is null, do nothing!");
            return;
        }
        C30434a.m62028c(f72395a, "startForeground  id = " + i + ", service = " + this.f72400f.get() + ",  isServiceAlive = " + this.f72397c);
        try {
            this.f72400f.get().startForeground(i, notification);
            this.f72398d = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
