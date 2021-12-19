package com.p2082ss.android.socialbase.downloader.impls;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.C30292f;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2183f.C30439a;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2188j.C30518d;
import com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30515c;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.socialbase.downloader.impls.e */
public final class C30488e extends AbstractC30474a {

    /* renamed from: f */
    private static C30518d f72694f;

    static {
        Covode.recordClassIndex(37016);
    }

    @Override // com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a
    /* renamed from: a */
    public final List<Integer> mo54267a() {
        return f72694f.mo54355b();
    }

    public C30488e() {
        f72694f = new C30518d();
    }

    @Override // com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a
    /* renamed from: b */
    public final void mo54283b(int i) {
        C30518d dVar = f72694f;
        if (dVar != null) {
            dVar.mo54356c(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a
    /* renamed from: c */
    public final RunnableC30515c mo54287c(int i) {
        C30518d dVar = f72694f;
        if (dVar == null) {
            return null;
        }
        return dVar.mo54354b(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a
    /* renamed from: d */
    public final void mo54288d(int i) {
        RunnableC30515c cVar;
        C30518d dVar = f72694f;
        if (dVar != null && (cVar = dVar.f72815b.get(i)) != null) {
            AbstractC30462i iVar = cVar.f72793h;
        }
    }

    /* renamed from: c */
    public static List<Future> m62182c(List<Runnable> list) {
        ExecutorService k = C30399c.m61727k();
        ArrayList arrayList = new ArrayList(list.size());
        for (Runnable runnable : list) {
            arrayList.add(k.submit(runnable));
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|(2:10|(1:12))(1:13)|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(11221);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002f */
    @Override // com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54276a(com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30515c r6) {
        /*
            r5 = this;
            r4 = 11221(0x2bd5, float:1.5724E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            com.ss.android.socialbase.downloader.j.d r3 = com.p2082ss.android.socialbase.downloader.impls.C30488e.f72694f
            if (r3 != 0) goto L_0x000d
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x000d:
            java.lang.Class<com.ss.android.socialbase.downloader.j.d> r2 = com.p2082ss.android.socialbase.downloader.p2188j.C30518d.class
            monitor-enter(r2)
            r0 = 524288(0x80000, float:7.34684E-40)
            boolean r0 = com.p2082ss.android.socialbase.downloader.p2189k.C30528a.m62524a(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0026
            android.util.SparseArray<com.ss.android.socialbase.downloader.j.c> r0 = r3.f72815b     // Catch:{ all -> 0x002f }
            int r1 = r0.indexOfValue(r6)     // Catch:{ all -> 0x002f }
            if (r1 < 0) goto L_0x002f
            android.util.SparseArray<com.ss.android.socialbase.downloader.j.c> r0 = r3.f72815b     // Catch:{ all -> 0x002f }
            r0.removeAt(r1)     // Catch:{ all -> 0x002f }
            goto L_0x002f
        L_0x0026:
            android.util.SparseArray<com.ss.android.socialbase.downloader.j.c> r1 = r3.f72815b     // Catch:{ all -> 0x002f }
            int r0 = r6.mo54349e()     // Catch:{ all -> 0x002f }
            r1.remove(r0)     // Catch:{ all -> 0x002f }
        L_0x002f:
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.impls.C30488e.mo54276a(com.ss.android.socialbase.downloader.j.c):void");
    }

    /* renamed from: d */
    public static Runnable m62183d(List<Future> list) {
        BlockingQueue<Runnable> queue;
        Runnable runnable;
        if (list != null && !list.isEmpty()) {
            try {
                ExecutorService k = C30399c.m61727k();
                if ((k instanceof ThreadPoolExecutor) && (queue = ((ThreadPoolExecutor) k).getQueue()) != null && !queue.isEmpty()) {
                    Iterator<Future> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            runnable = null;
                            break;
                        }
                        Future next = it.next();
                        if ((next instanceof Runnable) && queue.remove(next)) {
                            runnable = (Runnable) next;
                            break;
                        }
                    }
                    if (runnable != null) {
                        list.remove(runnable);
                        return runnable;
                    }
                }
            } catch (Throwable th) {
                C30434a.m62029d("DefaultDownloadEngine", "getUnstartedTask() error: " + th.toString());
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a
    /* renamed from: a */
    public final boolean mo54279a(int i) {
        DownloadInfo e;
        C30518d dVar = f72694f;
        if (dVar == null || !dVar.mo54353a(i) || (e = mo54289e(i)) == null) {
            return false;
        }
        if (C30292f.m61285a(e.getStatus())) {
            return true;
        }
        mo54283b(i);
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a
    /* renamed from: a */
    public final void mo54273a(int i, DownloadTask downloadTask) {
        int i2;
        int i3;
        MethodCollector.m26663i(11224);
        if (downloadTask == null) {
            MethodCollector.m26664o(11224);
            return;
        }
        C30434a.m62027b("DownloadTask", "start doDownload for task : ".concat(String.valueOf(i)));
        RunnableC30515c cVar = new RunnableC30515c(downloadTask, this.f72657e);
        C30518d dVar = f72694f;
        cVar.f72794i = System.currentTimeMillis();
        cVar.f72792g.mo54067a();
        synchronized (C30518d.class) {
            try {
                i2 = 0;
                if (dVar.f72816c >= 500) {
                    dVar.mo54352a();
                    dVar.f72816c = 0;
                } else {
                    dVar.f72816c++;
                }
                dVar.f72815b.put(cVar.mo54349e(), cVar);
            } finally {
                MethodCollector.m26664o(11224);
            }
        }
        DownloadTask downloadTask2 = cVar.f72787b;
        try {
            ExecutorService j = C30399c.m61726j();
            if (!(downloadTask2 == null || downloadTask2.getDownloadInfo() == null)) {
                if ("mime_type_plg".equals(downloadTask2.getDownloadInfo().getMimeType()) && C30472a.f72639a.mo54258a("divide_plugin", 1) == 1) {
                    downloadTask2.getDownloadInfo().safePutToDBJsonData("executor_group", 3);
                }
                int executorGroup = downloadTask2.getDownloadInfo().getExecutorGroup();
                if (executorGroup == 3) {
                    j = C30399c.m61723h();
                } else if (executorGroup == 4) {
                    j = C30399c.m61725i();
                }
            }
            if (j == null) {
                AbstractC30389w monitorDepend = downloadTask2.getMonitorDepend();
                DownloadInfo downloadInfo = downloadTask2.getDownloadInfo();
                BaseException baseException = new BaseException(1003, "execute failed cpu thread executor service is null");
                if (downloadTask2.getDownloadInfo() != null) {
                    i3 = downloadTask2.getDownloadInfo().getStatus();
                } else {
                    i3 = 0;
                }
                C30439a.m62034a(monitorDepend, downloadInfo, baseException, i3);
            } else if (C30472a.m62087a(cVar.mo54349e(), (DownloadInfo) null).mo54262a("pause_with_interrupt", false)) {
                cVar.f72786a = j.submit(cVar);
                MethodCollector.m26664o(11224);
            } else {
                j.execute(cVar);
                MethodCollector.m26664o(11224);
            }
        } catch (Exception e) {
            if (downloadTask2 != null) {
                AbstractC30389w monitorDepend2 = downloadTask2.getMonitorDepend();
                DownloadInfo downloadInfo2 = downloadTask2.getDownloadInfo();
                BaseException baseException2 = new BaseException(1003, C30535g.m62576b(e, "DownloadThreadPoolExecute"));
                if (downloadTask2.getDownloadInfo() != null) {
                    i2 = downloadTask2.getDownloadInfo().getStatus();
                }
                C30439a.m62034a(monitorDepend2, downloadInfo2, baseException2, i2);
            }
            e.printStackTrace();
            MethodCollector.m26664o(11224);
        } catch (OutOfMemoryError e2) {
            if (downloadTask2 != null) {
                AbstractC30389w monitorDepend3 = downloadTask2.getMonitorDepend();
                DownloadInfo downloadInfo3 = downloadTask2.getDownloadInfo();
                BaseException baseException3 = new BaseException(1003, "execute OOM");
                if (downloadTask2.getDownloadInfo() != null) {
                    i2 = downloadTask2.getDownloadInfo().getStatus();
                }
                C30439a.m62034a(monitorDepend3, downloadInfo3, baseException3, i2);
            }
            e2.printStackTrace();
            MethodCollector.m26664o(11224);
        }
    }
}
