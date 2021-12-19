package com.p2082ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.C30593c;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2178a.C30283a;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.socialbase.downloader.segment.g */
public final class C30605g {

    /* renamed from: a */
    final List<C30612k> f73047a = new LinkedList();

    /* renamed from: b */
    volatile boolean f73048b;

    /* renamed from: c */
    volatile boolean f73049c;

    /* renamed from: d */
    volatile boolean f73050d;

    /* renamed from: e */
    public volatile long f73051e;

    /* renamed from: f */
    private final List<C30612k> f73052f = new ArrayList();

    /* renamed from: g */
    private final DownloadInfo f73053g;

    /* renamed from: h */
    private final AbstractC30420l f73054h;

    /* renamed from: i */
    private final C30472a f73055i;

    /* renamed from: j */
    private final AbstractC30522f f73056j;

    /* renamed from: k */
    private final AbstractC30601c f73057k;

    /* renamed from: l */
    private BaseException f73058l;

    /* renamed from: m */
    private final C30283a f73059m;

    /* renamed from: n */
    private final boolean f73060n;

    /* renamed from: o */
    private final long f73061o;

    /* renamed from: p */
    private final long f73062p;

    /* renamed from: q */
    private final boolean f73063q;

    /* renamed from: r */
    private long f73064r;

    /* renamed from: s */
    private volatile long f73065s;

    static {
        Covode.recordClassIndex(37140);
    }

    /* renamed from: a */
    private void m62798a() {
        long j;
        MethodCollector.m26663i(8613);
        boolean z = this.f73063q;
        if (z) {
            j = System.nanoTime();
        } else {
            j = 0;
        }
        DownloadInfo downloadInfo = this.f73053g;
        AbstractC30420l lVar = this.f73054h;
        List<C30612k> list = this.f73047a;
        List<C30612k> list2 = this.f73052f;
        Map<Long, C30607i> k = lVar.mo53811k(downloadInfo.getId());
        if (k == null) {
            k = new HashMap<>(4);
        }
        boolean z2 = false;
        synchronized (this) {
            try {
                m62799a(list);
                try {
                    m62801b(list);
                    z2 = true;
                } catch (Throwable unused) {
                }
                m62800a(list, k);
                if (list2.size() > 0) {
                    m62802c(list2);
                    list.removeAll(list2);
                    list2.clear();
                }
            } finally {
                MethodCollector.m26664o(8613);
            }
        }
        if (z2) {
            downloadInfo.updateRealDownloadTime(true);
            lVar.mo53807a(downloadInfo.getId(), k);
            lVar.mo53776a(downloadInfo);
            this.f73051e = downloadInfo.getCurBytes();
        }
        if (z) {
            this.f73064r += System.nanoTime() - j;
        }
    }

    /* renamed from: a */
    private static void m62799a(List<C30612k> list) {
        for (C30612k kVar : list) {
            C30593c cVar = kVar.f73110b;
            if (cVar.f72999a != null) {
                cVar.f72999a.flush();
            }
        }
    }

    /* renamed from: b */
    private static void m62801b(List<C30612k> list) {
        for (C30612k kVar : list) {
            C30593c cVar = kVar.f73110b;
            if (cVar.f73000b != null) {
                cVar.f73000b.sync();
            }
        }
    }

    /* renamed from: c */
    private static void m62802c(List<C30612k> list) {
        Iterator<C30612k> it = list.iterator();
        while (it.hasNext()) {
            C30535g.m62556a(it.next().f73110b);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01ba, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01bc, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01be, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e2, code lost:
        if (r19 <= 500) goto L_0x00e9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01ba A[ExcHandler: all (th java.lang.Throwable), Splitter:B:55:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e4 A[Catch:{ all -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x028f A[Catch:{ BaseException -> 0x0284, all -> 0x03e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0297 A[SYNTHETIC, Splitter:B:210:0x0297] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x02ae A[SYNTHETIC, Splitter:B:216:0x02ae] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0322 A[Catch:{ all -> 0x03d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x03b7 A[Catch:{ all -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x03ed A[SYNTHETIC, Splitter:B:311:0x03ed] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0404 A[SYNTHETIC, Splitter:B:317:0x0404] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ed A[Catch:{ StreamClosedException -> 0x01cb, BaseException -> 0x01c5, all -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0114  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54836a(com.p2082ss.android.socialbase.downloader.segment.AbstractC30602d r30) {
        /*
        // Method dump skipped, instructions count: 1123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.segment.C30605g.mo54836a(com.ss.android.socialbase.downloader.segment.d):void");
    }

    /* renamed from: a */
    private static void m62800a(List<C30612k> list, Map<Long, C30607i> map) {
        for (C30612k kVar : list) {
            C30607i iVar = kVar.f73109a;
            C30607i iVar2 = map.get(Long.valueOf(iVar.f73068a));
            if (iVar2 == null) {
                map.put(Long.valueOf(iVar.f73068a), new C30607i(iVar));
            } else {
                iVar2.mo54838a(iVar.mo54841c());
                iVar2.mo54840b(iVar.f73070c);
            }
        }
    }

    C30605g(DownloadInfo downloadInfo, AbstractC30522f fVar, AbstractC30601c cVar) {
        boolean z;
        boolean z2 = false;
        this.f73048b = false;
        this.f73049c = false;
        this.f73050d = false;
        this.f73051e = 0;
        this.f73065s = 0;
        this.f73053g = downloadInfo;
        this.f73054h = C30399c.m61733q();
        this.f73056j = fVar;
        this.f73057k = cVar;
        this.f73059m = C30283a.C30286b.f72251a;
        C30472a a = C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null);
        this.f73055i = a;
        if (a.mo54258a("sync_strategy", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f73060n = z;
        if (z) {
            this.f73061o = Math.max((long) a.mo54258a("sync_interval_ms_fg", 5000), 500L);
            this.f73062p = Math.max((long) a.mo54258a("sync_interval_ms_bg", 1000), 500L);
        } else {
            this.f73061o = 0;
            this.f73062p = 0;
        }
        this.f73063q = a.mo54258a("monitor_rw", 0) == 1 ? true : z2;
    }
}
