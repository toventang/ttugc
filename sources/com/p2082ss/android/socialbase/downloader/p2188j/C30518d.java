package com.p2082ss.android.socialbase.downloader.p2188j;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30296j;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.socialbase.downloader.j.d */
public class C30518d {

    /* renamed from: a */
    public static ExecutorService f72814a = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC30513a("Download_OP_Thread"));

    /* renamed from: b */
    public volatile SparseArray<RunnableC30515c> f72815b = new SparseArray<>();

    /* renamed from: c */
    public int f72816c;

    static {
        Covode.recordClassIndex(37046);
    }

    /* renamed from: a */
    public final void mo54352a() {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f72815b.size(); i++) {
                int keyAt = this.f72815b.keyAt(i);
                if (!this.f72815b.get(keyAt).f72789d.get()) {
                    arrayList.add(Integer.valueOf(keyAt));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    Integer num = (Integer) arrayList.get(i2);
                    if (num != null) {
                        this.f72815b.remove(num.intValue());
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public final List<Integer> mo54355b() {
        ArrayList arrayList;
        MethodCollector.m26663i(9163);
        synchronized (C30518d.class) {
            try {
                mo54352a();
                arrayList = new ArrayList();
                for (int i = 0; i < this.f72815b.size(); i++) {
                    RunnableC30515c cVar = this.f72815b.get(this.f72815b.keyAt(i));
                    if (cVar != null) {
                        arrayList.add(Integer.valueOf(cVar.mo54349e()));
                    }
                }
            } finally {
                MethodCollector.m26664o(9163);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo54353a(int i) {
        MethodCollector.m26663i(8564);
        synchronized (C30518d.class) {
            try {
                boolean z = false;
                if (this.f72815b == null || this.f72815b.size() <= 0) {
                    return false;
                }
                RunnableC30515c cVar = this.f72815b.get(i);
                if (cVar != null && cVar.f72789d.get()) {
                    z = true;
                }
                MethodCollector.m26664o(8564);
                return z;
            } finally {
                MethodCollector.m26664o(8564);
            }
        }
    }

    /* renamed from: c */
    public final void mo54356c(int i) {
        MethodCollector.m26663i(8852);
        synchronized (C30518d.class) {
            try {
                mo54352a();
                RunnableC30515c cVar = this.f72815b.get(i);
                if (cVar != null) {
                    cVar.mo54335a();
                    m62501a(cVar);
                    this.f72815b.remove(i);
                }
            } finally {
                MethodCollector.m26664o(8852);
            }
        }
    }

    /* renamed from: a */
    private static void m62501a(RunnableC30515c cVar) {
        Future future;
        if (cVar != null) {
            try {
                ExecutorService j = C30399c.m61726j();
                DownloadTask downloadTask = cVar.f72787b;
                if (!(downloadTask == null || downloadTask.getDownloadInfo() == null)) {
                    int executorGroup = downloadTask.getDownloadInfo().getExecutorGroup();
                    if (executorGroup == 3) {
                        j = C30399c.m61723h();
                    } else if (executorGroup == 4) {
                        j = C30399c.m61725i();
                    }
                }
                if (j != null && (j instanceof ThreadPoolExecutor)) {
                    ((ThreadPoolExecutor) j).remove(cVar);
                    if (C30472a.m62087a(cVar.mo54349e(), (DownloadInfo) null).mo54262a("pause_with_interrupt", false) && (future = cVar.f72786a) != null) {
                        future.cancel(true);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final RunnableC30515c mo54354b(int i) {
        MethodCollector.m26663i(8708);
        synchronized (C30518d.class) {
            try {
                mo54352a();
                RunnableC30515c cVar = this.f72815b.get(i);
                if (cVar != null) {
                    cVar.f72790e = EnumC30296j.RUN_STATUS_CANCELED;
                    if (cVar.f72795j != null) {
                        cVar.f72795j.mo54847a();
                    }
                    if (cVar.f72788c != null) {
                        cVar.f72788c.mo54064b();
                    }
                    if (cVar.f72795j == null && cVar.f72788c == null) {
                        cVar.mo54346c();
                        cVar.f72790e = EnumC30296j.RUN_STATUS_CANCELED;
                        cVar.mo54343b();
                    }
                    cVar.mo54350f();
                    m62501a(cVar);
                    this.f72815b.remove(i);
                    return cVar;
                }
                MethodCollector.m26664o(8708);
                return null;
            } finally {
                MethodCollector.m26664o(8708);
            }
        }
    }
}
