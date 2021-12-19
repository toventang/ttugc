package com.p2082ss.android.socialbase.downloader.downloader;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30333aa;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.impls.C30499l;
import com.p2082ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.d */
public class C30405d {

    /* renamed from: c */
    private static volatile C30405d f72455c;

    /* renamed from: a */
    public Handler f72456a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    volatile List<AbstractC30333aa> f72457b = new ArrayList();

    /* renamed from: d */
    private volatile SparseArray<Boolean> f72458d = new SparseArray<>();

    static {
        Covode.recordClassIndex(36924);
    }

    /* renamed from: a */
    public static C30405d m61749a() {
        MethodCollector.m26663i(6769);
        if (f72455c == null) {
            synchronized (C30405d.class) {
                try {
                    f72455c = new C30405d();
                } catch (Throwable th) {
                    MethodCollector.m26664o(6769);
                    throw th;
                }
            }
        }
        C30405d dVar = f72455c;
        MethodCollector.m26664o(6769);
        return dVar;
    }

    /* renamed from: b */
    public final void mo54054b() {
        MethodCollector.m26663i(6772);
        synchronized (this.f72457b) {
            try {
                Iterator<AbstractC30333aa> it = this.f72457b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.m26664o(6772);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo54059d(int i) {
        AbstractC30423o c = mo54057c(i);
        if (c == null) {
            return false;
        }
        return c.mo54188g(i);
    }

    /* renamed from: c */
    public final AbstractC30423o mo54057c(int i) {
        boolean z = true;
        if (mo54049a(i) != 1 || C30535g.m62594c()) {
            z = false;
        }
        return C30499l.m62246a(z);
    }

    /* renamed from: b */
    public final synchronized int mo54053b(int i) {
        MethodCollector.m26663i(6925);
        if (this.f72458d.get(i) == null) {
            MethodCollector.m26664o(6925);
            return -1;
        } else if (this.f72458d.get(i).booleanValue()) {
            MethodCollector.m26664o(6925);
            return 1;
        } else {
            MethodCollector.m26664o(6925);
            return 0;
        }
    }

    /* renamed from: a */
    public final int mo54049a(int i) {
        if (!C30399c.m61677E()) {
            return -1;
        }
        if (C30535g.m62594c() || !C30499l.m62246a(true).mo54190h()) {
            return mo54053b(i);
        }
        return C30499l.m62246a(true).mo54195m(i);
    }

    /* renamed from: a */
    public final AbstractC30423o mo54050a(DownloadTask downloadTask) {
        boolean z;
        List<DownloadChunk> i;
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            return null;
        }
        boolean isNeedIndependentProcess = downloadInfo.isNeedIndependentProcess();
        boolean z2 = true;
        if (C30535g.m62594c() || !C30535g.m62557a()) {
            isNeedIndependentProcess = true;
        }
        int a = mo54049a(downloadInfo.getId());
        if (a >= 0 && a != isNeedIndependentProcess) {
            if (a == 1) {
                try {
                    if (C30535g.m62557a()) {
                        C30499l.m62246a(true).mo54146a(downloadInfo.getId());
                        DownloadInfo h = C30499l.m62246a(true).mo54189h(downloadInfo.getId());
                        if (h != null) {
                            C30499l.m62246a(false).mo54170b(h);
                        }
                        if (h.getChunkCount() > 1 && (i = C30499l.m62246a(true).mo54191i(downloadInfo.getId())) != null) {
                            C30499l.m62246a(false).mo54156a(downloadInfo.getId(), C30535g.m62546a(i));
                        }
                    }
                } catch (Throwable unused) {
                }
            } else if (C30535g.m62557a()) {
                C30499l.m62246a(false).mo54146a(downloadInfo.getId());
                List<DownloadChunk> i2 = C30499l.m62246a(false).mo54191i(downloadInfo.getId());
                if (i2 != null) {
                    C30499l.m62246a(true).mo54156a(downloadInfo.getId(), C30535g.m62546a(i2));
                }
            } else {
                downloadTask.setNeedDelayForCacheSync(true);
                C30499l.m62246a(true).mo54147a(1, downloadInfo.getId());
            }
        }
        int id = downloadInfo.getId();
        if (isNeedIndependentProcess) {
            z = true;
        } else {
            z = false;
        }
        mo54052a(id, z);
        if (!isNeedIndependentProcess) {
            z2 = false;
        }
        return C30499l.m62246a(z2);
    }

    /* renamed from: c */
    public final void mo54058c(int i, boolean z) {
        AbstractC30423o c = mo54057c(i);
        if (c != null) {
            c.mo54158a(i, z, true);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m61748a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.downloader.C30405d.m61748a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: b */
    public final synchronized void mo54056b(int i, boolean z) {
        Boolean bool;
        MethodCollector.m26663i(6775);
        SparseArray<Boolean> sparseArray = this.f72458d;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        sparseArray.put(i, bool);
        MethodCollector.m26664o(6775);
    }

    /* renamed from: a */
    public final void mo54052a(int i, boolean z) {
        mo54056b(i, z);
        if (C30399c.m61677E() && !C30535g.m62594c() && C30499l.m62246a(true).mo54190h()) {
            C30499l.m62246a(true).mo54169b(i, z);
        }
        if (!C30399c.m61714c() && !C30535g.m62594c() && !C30535g.m62557a()) {
            try {
                Intent intent = new Intent(C30399c.m61674B(), DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.PROCESS_NOTIFY");
                intent.putExtra("extra_download_id", i);
                m61748a(C30399c.m61674B(), intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static List<DownloadInfo> m61750a(List<DownloadInfo> list, List<DownloadInfo> list2, SparseArray<DownloadInfo> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && sparseArray.get(downloadInfo.getId()) == null) {
                    sparseArray.put(downloadInfo.getId(), downloadInfo);
                }
            }
        }
        if (list2 != null) {
            for (DownloadInfo downloadInfo2 : list2) {
                if (downloadInfo2 != null && sparseArray.get(downloadInfo2.getId()) == null) {
                    sparseArray.put(downloadInfo2.getId(), downloadInfo2);
                }
            }
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo54051a(int i, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z) {
        int hashCode;
        AbstractC30423o c = mo54057c(i);
        if (c != null) {
            if (iDownloadListener == null) {
                hashCode = 0;
            } else {
                hashCode = iDownloadListener.hashCode();
            }
            c.mo54167b(i, hashCode, iDownloadListener, hVar, z);
        }
    }

    /* renamed from: b */
    public final void mo54055b(int i, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z) {
        AbstractC30423o c = mo54057c(i);
        if (c != null) {
            c.mo54151a(i, iDownloadListener.hashCode(), iDownloadListener, hVar, z);
        }
    }
}
