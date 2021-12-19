package com.p2082ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30422n;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30430v;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30290d;
import com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30304d;
import com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2183f.C30439a;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2188j.HandlerC30526h;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.segment.C30607i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.socialbase.downloader.impls.d */
public final class C30483d implements AbstractC30420l {

    /* renamed from: a */
    public final C30498k f72682a = new C30498k();

    /* renamed from: b */
    public AbstractC30430v f72683b;

    /* renamed from: c */
    volatile boolean f72684c;

    /* renamed from: d */
    private volatile boolean f72685d;

    /* renamed from: e */
    private HandlerC30526h.AbstractC30527a f72686e = new HandlerC30526h.AbstractC30527a() {
        /* class com.p2082ss.android.socialbase.downloader.impls.C30483d.C304841 */

        static {
            Covode.recordClassIndex(37012);
        }

        @Override // com.p2082ss.android.socialbase.downloader.p2188j.HandlerC30526h.AbstractC30527a
        /* renamed from: a */
        public final void mo54275a(Message message) {
            if (message.what == 1) {
                C30399c.m61721g().execute(new Runnable() {
                    /* class com.p2082ss.android.socialbase.downloader.impls.C30483d.C304841.RunnableC304851 */

                    static {
                        Covode.recordClassIndex(37013);
                    }

                    public final void run() {
                        try {
                            C30483d.this.mo54309f();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
    };

    /* renamed from: f */
    private HandlerC30526h f72687f = null;

    static {
        Covode.recordClassIndex(37011);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final boolean mo53791d() {
        return this.f72684c;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53774a(DownloadChunk downloadChunk) {
        this.f72682a.mo53774a(downloadChunk);
        if (C30535g.m62579b()) {
            AbstractC30423o a = C30499l.m62246a(true);
            if (a != null) {
                a.mo54160a(downloadChunk);
            } else {
                this.f72683b.mo53774a(downloadChunk);
            }
        } else {
            this.f72683b.mo53774a(downloadChunk);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final boolean mo53776a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a = this.f72682a.mo53776a(downloadInfo);
        m62139a(downloadInfo, true);
        return a;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53772a(int i, List<DownloadChunk> list) {
        if (list != null && list.size() != 0) {
            this.f72682a.mo53772a(i, list);
            if (C30535g.m62594c()) {
                this.f72683b.mo53781b(i, list);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final boolean mo53807a(int i, Map<Long, C30607i> map) {
        this.f72682a.mo53807a(i, map);
        this.f72683b.mo53807a(i, map);
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final List<DownloadInfo> mo53779b() {
        return this.f72682a.mo53779b();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final void mo53787c() {
        try {
            this.f72682a.mo53787c();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        if (C30535g.m62579b()) {
            AbstractC30423o a = C30499l.m62246a(true);
            if (a != null) {
                a.mo54187g();
            } else {
                this.f72683b.mo53787c();
            }
        } else {
            this.f72683b.mo53787c();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: e */
    public final boolean mo53793e() {
        MethodCollector.m26663i(8134);
        if (this.f72684c) {
            MethodCollector.m26664o(8134);
            return true;
        }
        synchronized (this) {
            try {
                if (!this.f72684c) {
                    C30434a.m62029d("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting start!!!!");
                    try {
                        wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    C30434a.m62029d("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting end!!!!");
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(8134);
                throw th;
            }
        }
        boolean z = this.f72684c;
        MethodCollector.m26664o(8134);
        return z;
    }

    public C30483d() {
        if (!C30472a.f72639a.mo54262a("fix_sigbus_downloader_db", false)) {
            this.f72683b = new BinderC30305e();
        } else if (C30535g.m62557a() || !C30399c.m61677E()) {
            this.f72683b = new BinderC30305e();
        } else {
            this.f72683b = C30399c.f72430b.mo54046a(new C30399c.AbstractC30403a.AbstractC30404a() {
                /* class com.p2082ss.android.socialbase.downloader.impls.C30483d.C304862 */

                static {
                    Covode.recordClassIndex(37014);
                }

                @Override // com.p2082ss.android.socialbase.downloader.downloader.C30399c.AbstractC30403a.AbstractC30404a
                /* renamed from: a */
                public final void mo54048a() {
                    C30483d.this.f72683b = new BinderC30305e();
                }
            });
        }
        this.f72684c = false;
        this.f72687f = new HandlerC30526h(Looper.getMainLooper(), this.f72686e);
        m62140g();
    }

    /* renamed from: g */
    private void m62140g() {
        List<DownloadChunk> list;
        DownloadInfo downloadInfo;
        MethodCollector.m26663i(7990);
        C30399c.m61689a(EnumC30290d.SYNC_START);
        final SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        final SparseArray<List<DownloadChunk>> sparseArray2 = new SparseArray<>();
        synchronized (this.f72682a) {
            try {
                SparseArray<DownloadInfo> sparseArray3 = this.f72682a.f72709a;
                for (int i = 0; i < sparseArray3.size(); i++) {
                    int keyAt = sparseArray3.keyAt(i);
                    if (!(keyAt == 0 || (downloadInfo = sparseArray3.get(keyAt)) == null)) {
                        sparseArray.put(keyAt, downloadInfo);
                    }
                }
                SparseArray<List<DownloadChunk>> sparseArray4 = this.f72682a.f72710b;
                for (int i2 = 0; i2 < sparseArray4.size(); i2++) {
                    int keyAt2 = sparseArray4.keyAt(i2);
                    if (!(keyAt2 == 0 || (list = sparseArray4.get(keyAt2)) == null)) {
                        sparseArray2.put(keyAt2, new CopyOnWriteArrayList(list));
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(7990);
                throw th;
            }
        }
        this.f72683b.mo53805a(sparseArray, sparseArray2, new AbstractC30304d() {
            /* class com.p2082ss.android.socialbase.downloader.impls.C30483d.C304873 */

            static {
                Covode.recordClassIndex(37015);
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30304d
            /* renamed from: a */
            public final void mo53803a() {
                MethodCollector.m26663i(7962);
                synchronized (C30483d.this.f72682a) {
                    try {
                        SparseArray<DownloadInfo> sparseArray = C30483d.this.f72682a.f72709a;
                        if (sparseArray != null) {
                            for (int i = 0; i < sparseArray.size(); i++) {
                                int keyAt = sparseArray.keyAt(i);
                                if (keyAt != 0) {
                                    sparseArray.put(keyAt, (DownloadInfo) sparseArray.get(keyAt));
                                }
                            }
                        }
                        SparseArray<List<DownloadChunk>> sparseArray2 = C30483d.this.f72682a.f72710b;
                        if (sparseArray2 != null) {
                            for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                                int keyAt2 = sparseArray2.keyAt(i2);
                                if (keyAt2 != 0) {
                                    sparseArray2.put(keyAt2, (List) sparseArray2.get(keyAt2));
                                }
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(7962);
                    }
                }
                C30483d dVar = C30483d.this;
                synchronized (dVar) {
                    try {
                        dVar.f72684c = true;
                        dVar.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C30483d.this.mo54308a();
                C30399c.m61689a(EnumC30290d.SYNC_SUCCESS);
                MethodCollector.m26664o(7962);
            }
        });
        MethodCollector.m26664o(7990);
    }

    /* renamed from: a */
    public final void mo54308a() {
        long j;
        if (C30472a.f72639a.mo54262a("task_resume_delay", false)) {
            j = 4000;
        } else if (Build.VERSION.SDK_INT >= 23) {
            j = 1000;
        } else {
            j = 5000;
        }
        this.f72687f.sendMessageDelayed(this.f72687f.obtainMessage(1), j);
    }

    /* renamed from: f */
    public final void mo54309f() {
        List<String> list;
        ArrayList arrayList;
        DownloadInfo downloadInfo;
        DownloadInfo downloadInfo2;
        MethodCollector.m26663i(8137);
        if (!this.f72684c) {
            MethodCollector.m26664o(8137);
        } else if (this.f72685d) {
            C30434a.m62027b("DefaultDownloadCache", "resumeUnCompleteTask: has resumed, return!!!");
            MethodCollector.m26664o(8137);
        } else {
            this.f72685d = true;
            if (!C30535g.m62557a()) {
                MethodCollector.m26664o(8137);
                return;
            }
            AbstractC30422n p = C30399c.m61732p();
            if (p != null) {
                list = p.mo54142a();
                arrayList = (list == null || list.isEmpty()) ? null : new ArrayList();
            } else {
                list = null;
                arrayList = null;
            }
            SparseArray sparseArray = new SparseArray();
            synchronized (this) {
                try {
                    SparseArray<DownloadInfo> sparseArray2 = this.f72682a.f72709a;
                    for (int i = 0; i < sparseArray2.size(); i++) {
                        int keyAt = sparseArray2.keyAt(i);
                        if (!(keyAt == 0 || (downloadInfo2 = sparseArray2.get(keyAt)) == null)) {
                            sparseArray.put(keyAt, downloadInfo2);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(8137);
                }
            }
            if (sparseArray.size() == 0) {
                MethodCollector.m26664o(8137);
                return;
            }
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int keyAt2 = sparseArray.keyAt(i2);
                if (!(keyAt2 == 0 || (downloadInfo = (DownloadInfo) sparseArray.get(keyAt2)) == null)) {
                    int realStatus = downloadInfo.getRealStatus();
                    int statusAtDbInit = downloadInfo.getStatusAtDbInit();
                    if (statusAtDbInit > 0 && statusAtDbInit <= 11) {
                        C30439a.m62035a(C30399c.f72431c, downloadInfo, (BaseException) null, -5);
                    }
                    if (!(list == null || arrayList == null || downloadInfo.getMimeType() == null || !list.contains(downloadInfo.getMimeType()) || (C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null).mo54258a("enable_notification_ui", 0) < 2 && realStatus == -2 && !downloadInfo.isPauseReserveOnWifi()))) {
                        downloadInfo.setDownloadFromReserveWifi(false);
                        arrayList.add(downloadInfo);
                    }
                }
            }
            if (!(p == null || arrayList == null)) {
                arrayList.isEmpty();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final List<DownloadInfo> mo53767a(String str) {
        return this.f72682a.mo53767a(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final DownloadInfo mo53777b(int i) {
        return this.f72682a.mo53777b(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final List<DownloadChunk> mo53785c(int i) {
        return this.f72682a.mo53785c(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final List<DownloadInfo> mo53789d(String str) {
        return this.f72682a.mo53789d(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: g */
    public final DownloadInfo mo53796g(int i) {
        DownloadInfo g = this.f72682a.mo53796g(i);
        m62139a(g, true);
        return g;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: h */
    public final DownloadInfo mo53797h(int i) {
        DownloadInfo h = this.f72682a.mo53797h(i);
        m62139a(h, true);
        return h;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: i */
    public final DownloadInfo mo53798i(int i) {
        DownloadInfo i2 = this.f72682a.mo53798i(i);
        m62139a(i2, true);
        return i2;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: j */
    public final DownloadInfo mo53799j(int i) {
        DownloadInfo j = this.f72682a.mo53799j(i);
        m62139a(j, true);
        return j;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: l */
    public final void mo53812l(int i) {
        this.f72682a.mo53812l(i);
        this.f72683b.mo53812l(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final List<DownloadInfo> mo53786c(String str) {
        return this.f72682a.mo53786c(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: k */
    public final Map<Long, C30607i> mo53811k(int i) {
        Map<Long, C30607i> k = this.f72682a.mo53811k(i);
        if (k != null && !k.isEmpty()) {
            return k;
        }
        Map<Long, C30607i> k2 = this.f72683b.mo53811k(i);
        this.f72682a.mo53807a(i, k2);
        return k2;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: m */
    public final List<C30607i> mo53813m(int i) {
        List<C30607i> m = this.f72682a.mo53813m(i);
        if (m == null || m.size() == 0) {
            return this.f72683b.mo53813m(i);
        }
        return m;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final List<DownloadInfo> mo53780b(String str) {
        return this.f72682a.mo53780b(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final void mo53790d(int i) {
        this.f72682a.mo53790d(i);
        if (C30535g.m62579b()) {
            AbstractC30423o a = C30499l.m62246a(true);
            if (a != null) {
                a.mo54197o(i);
            } else {
                this.f72683b.mo53790d(i);
            }
        } else {
            this.f72683b.mo53790d(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: f */
    public final boolean mo53795f(int i) {
        if (C30535g.m62579b()) {
            AbstractC30423o a = C30499l.m62246a(true);
            if (a != null) {
                a.mo54198p(i);
            } else {
                this.f72683b.mo53795f(i);
            }
        } else {
            this.f72683b.mo53795f(i);
        }
        return this.f72682a.mo53795f(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: e */
    public final boolean mo53794e(int i) {
        try {
            if (C30535g.m62579b()) {
                AbstractC30423o a = C30499l.m62246a(true);
                if (a != null) {
                    a.mo54196n(i);
                } else {
                    this.f72683b.mo53794e(i);
                }
            } else {
                this.f72683b.mo53794e(i);
            }
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        return this.f72682a.mo53794e(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final void mo53782b(DownloadChunk downloadChunk) {
        if (C30535g.m62579b()) {
            AbstractC30423o a = C30499l.m62246a(true);
            if (a != null) {
                a.mo54160a(downloadChunk);
            } else {
                this.f72683b.mo53774a(downloadChunk);
            }
        } else {
            this.f72683b.mo53774a(downloadChunk);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final void mo53783b(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.f72682a.mo53776a(downloadInfo);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final DownloadInfo mo53764a(int i, int i2) {
        DownloadInfo a = this.f72682a.mo53764a(i, i2);
        m62139a(a, true);
        return a;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final DownloadInfo mo53778b(int i, long j) {
        DownloadInfo b = this.f72682a.mo53778b(i, j);
        mo53781b(i, (List<DownloadChunk>) null);
        return b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final DownloadInfo mo53784c(int i, long j) {
        DownloadInfo c = this.f72682a.mo53784c(i, j);
        mo53781b(i, (List<DownloadChunk>) null);
        return c;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final DownloadInfo mo53788d(int i, long j) {
        DownloadInfo d = this.f72682a.mo53788d(i, j);
        mo53781b(i, (List<DownloadChunk>) null);
        return d;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final DownloadInfo mo53765a(int i, long j) {
        DownloadInfo a = this.f72682a.mo53765a(i, j);
        m62139a(a, false);
        return a;
    }

    /* renamed from: a */
    private void m62139a(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            if (!C30535g.m62579b()) {
                this.f72683b.mo53776a(downloadInfo);
            } else if (z) {
                AbstractC30423o a = C30499l.m62246a(true);
                if (a != null) {
                    a.mo54178c(downloadInfo);
                } else {
                    this.f72683b.mo53776a(downloadInfo);
                }
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final void mo53781b(int i, List<DownloadChunk> list) {
        try {
            mo53776a(this.f72682a.mo53777b(i));
            if (list == null) {
                list = this.f72682a.mo53785c(i);
            }
            if (C30535g.m62579b()) {
                AbstractC30423o a = C30499l.m62246a(true);
                if (a != null) {
                    a.mo54168b(i, list);
                } else {
                    this.f72683b.mo53781b(i, list);
                }
            } else {
                this.f72683b.mo53781b(i, list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53771a(int i, int i2, long j) {
        this.f72682a.mo53771a(i, i2, j);
        if (C30535g.m62579b()) {
            AbstractC30423o a = C30499l.m62246a(true);
            if (a != null) {
                a.mo54150a(i, i2, j);
            } else {
                this.f72683b.mo53771a(i, i2, j);
            }
        } else {
            this.f72683b.mo53771a(i, i2, j);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final DownloadInfo mo53766a(int i, long j, String str, String str2) {
        DownloadInfo a = this.f72682a.mo53766a(i, j, str, str2);
        m62139a(a, true);
        return a;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53769a(int i, int i2, int i3, int i4) {
        if (C30535g.m62579b()) {
            AbstractC30423o a = C30499l.m62246a(true);
            if (a != null) {
                a.mo54148a(i, i2, i3, i4);
            } else {
                this.f72683b.mo53769a(i, i2, i3, i4);
            }
        } else {
            this.f72683b.mo53769a(i, i2, i3, i4);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53770a(int i, int i2, int i3, long j) {
        if (C30535g.m62579b()) {
            AbstractC30423o a = C30499l.m62246a(true);
            if (a != null) {
                a.mo54149a(i, i2, i3, j);
            } else {
                this.f72683b.mo53770a(i, i2, i3, j);
            }
        } else {
            this.f72683b.mo53770a(i, i2, i3, j);
        }
    }
}
