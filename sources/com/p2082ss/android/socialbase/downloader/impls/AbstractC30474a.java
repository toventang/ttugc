package com.p2082ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30337ac;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30379q;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.C30411g;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.notification.C30598b;
import com.p2082ss.android.socialbase.downloader.p2179b.C30292f;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30287a;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30293g;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30295i;
import com.p2082ss.android.socialbase.downloader.p2181d.C30325a;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2183f.C30439a;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2188j.HandlerC30526h;
import com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30515c;
import com.p2082ss.android.socialbase.downloader.p2189k.C30528a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30531d;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.p2189k.C30580i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.ss.android.socialbase.downloader.impls.a */
public abstract class AbstractC30474a implements HandlerC30526h.AbstractC30527a {

    /* renamed from: a */
    final SparseArray<DownloadTask> f72653a = new SparseArray<>();

    /* renamed from: b */
    final SparseArray<DownloadTask> f72654b = new SparseArray<>();

    /* renamed from: c */
    final C30580i<Integer, DownloadTask> f72655c = new C30580i<>();

    /* renamed from: d */
    final AbstractC30420l f72656d = C30399c.m61733q();

    /* renamed from: e */
    protected final HandlerC30526h f72657e = new HandlerC30526h(Looper.getMainLooper(), this);

    /* renamed from: f */
    private final SparseArray<DownloadTask> f72658f = new SparseArray<>();

    /* renamed from: g */
    private final SparseArray<DownloadTask> f72659g = new SparseArray<>();

    /* renamed from: h */
    private final SparseArray<DownloadTask> f72660h = new SparseArray<>();

    /* renamed from: i */
    private final SparseArray<SparseArray<DownloadTask>> f72661i = new SparseArray<>();

    /* renamed from: j */
    private final SparseArray<Long> f72662j = new SparseArray<>();

    /* renamed from: k */
    private final LinkedBlockingDeque<DownloadTask> f72663k = new LinkedBlockingDeque<>();

    static {
        Covode.recordClassIndex(37002);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<Integer> mo54267a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54273a(int i, DownloadTask downloadTask);

    /* renamed from: a */
    public abstract void mo54276a(RunnableC30515c cVar);

    /* renamed from: a */
    public abstract boolean mo54279a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo54283b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract RunnableC30515c mo54287c(int i);

    /* renamed from: d */
    public abstract void mo54288d(int i);

    /* renamed from: a */
    public final synchronized void mo54277a(DownloadTask downloadTask) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
                if (downloadInfo.getEnqueueType() != EnumC30293g.ENQUEUE_NONE) {
                    DownloadInfo downloadInfo2 = downloadTask.getDownloadInfo();
                    if (downloadInfo2 != null) {
                        try {
                            if (this.f72663k.isEmpty()) {
                                m62100a(downloadTask, true);
                                this.f72663k.put(downloadTask);
                                return;
                            } else if (downloadInfo2.getEnqueueType() != EnumC30293g.ENQUEUE_TAIL) {
                                DownloadTask first = this.f72663k.getFirst();
                                if (first.getDownloadId() != downloadTask.getDownloadId() || !mo54279a(downloadTask.getDownloadId())) {
                                    mo54290f(first.getDownloadId());
                                    m62100a(downloadTask, true);
                                    if (first.getDownloadId() != downloadTask.getDownloadId()) {
                                        this.f72663k.putFirst(downloadTask);
                                    }
                                    return;
                                }
                                return;
                            } else if (this.f72663k.getFirst().getDownloadId() != downloadTask.getDownloadId() || !mo54279a(downloadTask.getDownloadId())) {
                                Iterator<DownloadTask> it = this.f72663k.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        DownloadTask next = it.next();
                                        if (next != null && next.getDownloadId() == downloadTask.getDownloadId()) {
                                            it.remove();
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                this.f72663k.put(downloadTask);
                                new C30411g(downloadTask, this.f72657e).mo54067a();
                                return;
                            } else {
                                return;
                            }
                        } catch (InterruptedException unused) {
                        }
                    }
                    return;
                }
                m62100a(downloadTask, true);
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo54280a(int i, boolean z) {
        DownloadTask downloadTask = this.f72658f.get(i);
        if (downloadTask == null && C30528a.m62524a(65536)) {
            downloadTask = mo54301q(i);
        }
        if (downloadTask != null) {
            if (!C30472a.m62087a(i, (DownloadInfo) null).mo54262a("fix_on_cancel_call_twice", true)) {
                new C30411g(downloadTask, this.f72657e).mo54074b();
            }
            final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            final SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(EnumC30294h.MAIN);
            final SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(EnumC30294h.NOTIFICATION);
            this.f72657e.post(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a.RunnableC304751 */

                static {
                    Covode.recordClassIndex(37003);
                }

                public final void run() {
                    SparseArray sparseArray;
                    MethodCollector.m26663i(8400);
                    SparseArray sparseArray2 = downloadListeners;
                    if (sparseArray2 != null) {
                        synchronized (sparseArray2) {
                            for (int i = 0; i < downloadListeners.size(); i++) {
                                try {
                                    IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i));
                                    if (iDownloadListener != null) {
                                        iDownloadListener.onCanceled(downloadInfo);
                                    }
                                } catch (Throwable th) {
                                    MethodCollector.m26664o(8400);
                                    throw th;
                                }
                            }
                        }
                    }
                    DownloadInfo downloadInfo = downloadInfo;
                    if (downloadInfo == null || !downloadInfo.canShowNotification() || (sparseArray = downloadListeners2) == null) {
                        MethodCollector.m26664o(8400);
                        return;
                    }
                    synchronized (sparseArray) {
                        for (int i2 = 0; i2 < downloadListeners2.size(); i2++) {
                            try {
                                IDownloadListener iDownloadListener2 = (IDownloadListener) downloadListeners2.get(downloadListeners2.keyAt(i2));
                                if (iDownloadListener2 != null) {
                                    iDownloadListener2.onCanceled(downloadInfo);
                                }
                            } finally {
                                MethodCollector.m26664o(8400);
                            }
                        }
                    }
                }
            });
        }
        DownloadInfo b = this.f72656d.mo53777b(i);
        if (C30528a.m62524a(65536)) {
            if (b != null) {
                b.setStatus(-4);
            }
        } else if (b != null && C30292f.m61285a(b.getStatus())) {
            b.setStatus(-4);
        }
        mo54274a(i, z, false);
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo54272a(int i, AbstractC30393y yVar) {
        DownloadTask downloadTask = this.f72658f.get(i);
        if (downloadTask != null) {
            downloadTask.setNotificationEventListener(yVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo54278a(List<String> list) {
        DownloadInfo downloadInfo;
        try {
            boolean a = C30528a.m62524a(1048576) ? C30535g.m62561a(C30399c.m61674B()) : true;
            for (int i = 0; i < this.f72654b.size(); i++) {
                DownloadTask downloadTask = this.f72654b.get(this.f72654b.keyAt(i));
                if (!(downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null || downloadInfo.getMimeType() == null || !list.contains(downloadInfo.getMimeType()) || (downloadInfo.isOnlyWifi() && !a))) {
                    downloadInfo.setAutoResumed(true);
                    downloadInfo.setShowNotificationForNetworkResumed(true);
                    mo54277a(downloadTask);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo54274a(final int i, final boolean z, final boolean z2) {
        DownloadInfo b = this.f72656d.mo53777b(i);
        if (b != null) {
            m62099a(b);
        }
        this.f72657e.post(new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a.RunnableC304762 */

            static {
                Covode.recordClassIndex(37004);
            }

            public final void run() {
                C30598b.m62774a().mo54819a(i);
            }
        });
        C30399c.m61701a(new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a.RunnableC304773 */

            static {
                Covode.recordClassIndex(37005);
            }

            public final void run() {
                DownloadTask q;
                MethodCollector.m26663i(9535);
                if (AbstractC30474a.this.mo54287c(i) == null && (q = AbstractC30474a.this.mo54301q(i)) != null) {
                    DownloadInfo downloadInfo = q.getDownloadInfo();
                    SparseArray<IDownloadListener> downloadListeners = q.getDownloadListeners(EnumC30294h.SUB);
                    if (downloadListeners != null) {
                        synchronized (downloadListeners) {
                            for (int i = 0; i < downloadListeners.size(); i++) {
                                try {
                                    IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i));
                                    if (iDownloadListener != null) {
                                        iDownloadListener.onCanceled(downloadInfo);
                                    }
                                } catch (Throwable th) {
                                    MethodCollector.m26664o(9535);
                                    throw th;
                                }
                            }
                        }
                    }
                }
                AbstractC30474a.this.mo54285b(i, z, z2);
                MethodCollector.m26664o(9535);
            }
        });
    }

    /* renamed from: a */
    public final synchronized void mo54271a(int i, int i2, final IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z, boolean z2) {
        DownloadInfo b;
        DownloadTask q = mo54301q(i);
        if (q != null) {
            q.addDownloadListener(i2, iDownloadListener, hVar, z);
            final DownloadInfo downloadInfo = q.getDownloadInfo();
            if (z2 && downloadInfo != null && !mo54279a(i) && (hVar == EnumC30294h.MAIN || hVar == EnumC30294h.NOTIFICATION)) {
                if (hVar != EnumC30294h.NOTIFICATION || downloadInfo.canShowNotification()) {
                    this.f72657e.post(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a.RunnableC304806 */

                        static {
                            Covode.recordClassIndex(37008);
                        }

                        public final void run() {
                            if (iDownloadListener == null) {
                                return;
                            }
                            if (downloadInfo.getStatus() == -3) {
                                iDownloadListener.onSuccessed(downloadInfo);
                            } else if (downloadInfo.getStatus() == -1) {
                                iDownloadListener.onFailed(downloadInfo, new BaseException(1000, "try add listener for failed task"));
                            }
                        }
                    });
                }
            }
            return;
        }
        if (!(!C30528a.m62524a(32768) || (b = this.f72656d.mo53777b(i)) == null || b.getStatus() == -3)) {
            DownloadTask downloadTask = (DownloadTask) this.f72655c.get(Integer.valueOf(i));
            if (downloadTask == null) {
                downloadTask = new DownloadTask(b);
                this.f72655c.put(Integer.valueOf(i), downloadTask);
            }
            downloadTask.addDownloadListener(i2, iDownloadListener, hVar, z);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.HandlerC30526h.AbstractC30527a
    /* renamed from: a */
    public final void mo54275a(Message message) {
        DownloadTask downloadTask;
        int i = message.arg1;
        int i2 = message.arg2;
        C30434a.m62027b("AbsDownloadEngine", "handleMsg id: " + i + " listener hasCode: " + i2);
        BaseException baseException = null;
        if (message.obj instanceof Exception) {
            baseException = (BaseException) message.obj;
        }
        synchronized (this) {
            if (i2 == 0) {
                downloadTask = this.f72658f.get(i);
            } else {
                SparseArray<DownloadTask> sparseArray = this.f72661i.get(i);
                if (sparseArray != null) {
                    downloadTask = sparseArray.get(i2);
                }
            }
            if (downloadTask != null) {
                m62098a(message.what, baseException, downloadTask);
                mo54269a(i, i2, message.what);
            }
        }
    }

    /* renamed from: b */
    public final void mo54282b() {
        List<Integer> a = mo54267a();
        if (a != null) {
            for (Integer num : a) {
                mo54290f(num.intValue());
            }
        }
    }

    protected AbstractC30474a() {
    }

    /* renamed from: e */
    public final synchronized DownloadInfo mo54289e(int i) {
        DownloadInfo b;
        DownloadTask downloadTask;
        b = this.f72656d.mo53777b(i);
        if (b == null && (downloadTask = this.f72658f.get(i)) != null) {
            b = downloadTask.getDownloadInfo();
        }
        return b;
    }

    /* renamed from: n */
    public final void mo54298n(final int i) {
        DownloadInfo b = this.f72656d.mo53777b(i);
        if (b != null) {
            m62099a(b);
        }
        this.f72657e.post(new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a.RunnableC304784 */

            static {
                Covode.recordClassIndex(37006);
            }

            public final void run() {
                C30598b.m62774a().mo54819a(i);
            }
        });
        C30399c.m61701a(new Runnable(i, true) {
            /* class com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a.RunnableC304795 */

            /* renamed from: a */
            final /* synthetic */ int f72676a;

            /* renamed from: b */
            final /* synthetic */ boolean f72677b = true;

            static {
                Covode.recordClassIndex(37007);
            }

            public final void run() {
                AbstractC30474a.this.mo54287c(this.f72676a);
                AbstractC30474a aVar = AbstractC30474a.this;
                int i = this.f72676a;
                boolean z = this.f72677b;
                try {
                    DownloadInfo b = aVar.f72656d.mo53777b(i);
                    if (b != null) {
                        C30535g.m62552a(b, z);
                        b.erase();
                    }
                    try {
                        aVar.f72656d.mo53790d(i);
                        aVar.f72656d.mo53776a(b);
                    } catch (SQLiteException e) {
                        e.printStackTrace();
                    }
                    if (aVar.f72654b.get(i) != null) {
                        aVar.f72654b.remove(i);
                    }
                    if (aVar.f72653a.get(i) != null) {
                        aVar.f72653a.remove(i);
                    }
                    aVar.f72655c.remove(Integer.valueOf(i));
                    C30472a.m62090a(i);
                } catch (Throwable unused) {
                }
            }

            {
                this.f72676a = r3;
            }
        });
    }

    /* renamed from: o */
    public final synchronized void mo54299o(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f72658f.get(i);
        if (!(downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null)) {
            downloadInfo.setForceIgnoreRecommendSize(true);
            mo54277a(downloadTask);
        }
    }

    /* renamed from: p */
    public final synchronized boolean mo54300p(int i) {
        boolean z;
        if (i != 0) {
            if (!(this.f72658f.get(i) == null && this.f72654b.get(i) == null)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: r */
    private void m62101r(int i) {
        DownloadTask first;
        if (!this.f72663k.isEmpty()) {
            DownloadTask first2 = this.f72663k.getFirst();
            if (first2 != null && first2.getDownloadId() == i) {
                this.f72663k.poll();
            }
            if (!this.f72663k.isEmpty() && (first = this.f72663k.getFirst()) != null) {
                m62100a(first, true);
            }
        }
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo54281b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : mo54267a()) {
            DownloadInfo e = mo54289e(num.intValue());
            if (e != null && str.equals(e.getMimeType())) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final synchronized boolean mo54291g(int i) {
        DownloadTask downloadTask = this.f72658f.get(i);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
            }
            mo54277a(downloadTask);
        } else {
            mo54292h(i);
        }
        return true;
    }

    /* renamed from: h */
    public final synchronized boolean mo54292h(int i) {
        DownloadTask downloadTask = this.f72654b.get(i);
        if (downloadTask == null) {
            downloadTask = this.f72659g.get(i);
        }
        if (downloadTask == null) {
            return false;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            downloadInfo.setDownloadFromReserveWifi(false);
        }
        mo54277a(downloadTask);
        return true;
    }

    /* renamed from: l */
    public final synchronized boolean mo54296l(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f72659g.get(i);
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            DownloadInfo b = this.f72656d.mo53777b(i);
            if (b != null && b.canStartRetryDelayTask()) {
                m62100a(new DownloadTask(b), false);
            }
            return false;
        }
        if (downloadInfo.canStartRetryDelayTask()) {
            m62100a(downloadTask, false);
        }
        return true;
    }

    /* renamed from: m */
    public final synchronized boolean mo54297m(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f72660h.get(i);
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return false;
        }
        if (downloadInfo.canReStartAsyncTask()) {
            mo54277a(downloadTask);
        }
        return true;
    }

    /* renamed from: q */
    public final DownloadTask mo54301q(int i) {
        DownloadTask downloadTask = this.f72658f.get(i);
        if (downloadTask != null) {
            return downloadTask;
        }
        DownloadTask downloadTask2 = this.f72654b.get(i);
        if (downloadTask2 != null) {
            return downloadTask2;
        }
        DownloadTask downloadTask3 = this.f72653a.get(i);
        if (downloadTask3 != null) {
            return downloadTask3;
        }
        DownloadTask downloadTask4 = this.f72659g.get(i);
        if (downloadTask4 == null) {
            return this.f72660h.get(i);
        }
        return downloadTask4;
    }

    /* renamed from: b */
    public final synchronized void mo54286b(List<String> list) {
        DownloadInfo downloadInfo;
        try {
            if (C30535g.m62561a(C30399c.m61674B())) {
                for (int i = 0; i < this.f72658f.size(); i++) {
                    DownloadTask downloadTask = this.f72658f.get(this.f72658f.keyAt(i));
                    if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null && downloadInfo.getMimeType() != null && list.contains(downloadInfo.getMimeType()) && downloadInfo.statusInPause() && downloadInfo.isPauseReserveOnWifi()) {
                        downloadInfo.setAutoResumed(true);
                        downloadInfo.setShowNotificationForNetworkResumed(true);
                        mo54277a(downloadTask);
                        downloadInfo.setDownloadFromReserveWifi(true);
                        Downloader.getInstance(C30399c.m61674B()).getReserveWifiStatusListener();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public final synchronized boolean mo54290f(int i) {
        C30434a.m62027b("AbsDownloadEngine", "pause id=".concat(String.valueOf(i)));
        DownloadInfo b = this.f72656d.mo53777b(i);
        if (b != null && b.getStatus() == 11) {
            return false;
        }
        synchronized (this.f72658f) {
            mo54283b(i);
        }
        if (b == null) {
            DownloadTask downloadTask = this.f72658f.get(i);
            if (downloadTask != null) {
                new C30411g(downloadTask, this.f72657e).mo54075c();
                return true;
            }
        } else {
            m62099a(b);
            if (b.getStatus() == 1) {
                DownloadTask downloadTask2 = this.f72658f.get(i);
                if (downloadTask2 != null) {
                    new C30411g(downloadTask2, this.f72657e).mo54075c();
                    return true;
                }
            } else if (C30292f.m61285a(b.getStatus())) {
                b.setStatus(-2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final synchronized AbstractC30337ac mo54293i(int i) {
        DownloadTask downloadTask = this.f72658f.get(i);
        if (downloadTask != null) {
            return downloadTask.getNotificationClickCallback();
        }
        DownloadTask downloadTask2 = this.f72653a.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationClickCallback();
        }
        DownloadTask downloadTask3 = this.f72654b.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationClickCallback();
        }
        DownloadTask downloadTask4 = this.f72659g.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationClickCallback();
        }
        DownloadTask downloadTask5 = this.f72660h.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getNotificationClickCallback();
    }

    /* renamed from: j */
    public final synchronized AbstractC30393y mo54294j(int i) {
        DownloadTask downloadTask = this.f72658f.get(i);
        if (downloadTask != null) {
            return downloadTask.getNotificationEventListener();
        }
        DownloadTask downloadTask2 = this.f72653a.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationEventListener();
        }
        DownloadTask downloadTask3 = this.f72654b.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationEventListener();
        }
        DownloadTask downloadTask4 = this.f72659g.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationEventListener();
        }
        DownloadTask downloadTask5 = this.f72660h.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getNotificationEventListener();
    }

    /* renamed from: k */
    public final synchronized AbstractC30379q mo54295k(int i) {
        DownloadTask downloadTask = this.f72658f.get(i);
        if (downloadTask != null) {
            return downloadTask.getFileUriProvider();
        }
        DownloadTask downloadTask2 = this.f72653a.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getFileUriProvider();
        }
        DownloadTask downloadTask3 = this.f72654b.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getFileUriProvider();
        }
        DownloadTask downloadTask4 = this.f72659g.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getFileUriProvider();
        }
        DownloadTask downloadTask5 = this.f72660h.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getFileUriProvider();
    }

    /* renamed from: a */
    private static void m62099a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            try {
                if (downloadInfo.getStatus() == 7 || downloadInfo.getRetryDelayStatus() != EnumC30295i.DELAY_RETRY_NONE) {
                    downloadInfo.setStatus(5);
                    downloadInfo.setRetryDelayStatus(EnumC30295i.DELAY_RETRY_NONE);
                    C30434a.m62027b("AbsDownloadEngine", "cancelAlarm");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final synchronized List<DownloadInfo> mo54268a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> a = this.f72656d.mo53767a(str);
        if (!(a == null || a.isEmpty())) {
            return a;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f72658f.size();
        for (int i = 0; i < size; i++) {
            DownloadTask valueAt = this.f72658f.valueAt(i);
            if (!(valueAt == null || valueAt.getDownloadInfo() == null || !str.equals(valueAt.getDownloadInfo().getUrl()))) {
                arrayList.add(valueAt.getDownloadInfo());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m62097a(int i, int i2) {
        C30434a.m62027b("AbsDownloadEngine", "removeTask id: " + i + " listener hasCode: " + i2);
        if (i2 == 0) {
            this.f72658f.remove(i);
            this.f72661i.remove(i);
            return;
        }
        SparseArray<DownloadTask> sparseArray = this.f72661i.get(i);
        if (sparseArray != null) {
            sparseArray.remove(i2);
            C30434a.m62027b("AbsDownloadEngine", "after downloadTaskWithListenerMap removeTask taskArray.size: " + sparseArray.size());
            if (sparseArray.size() == 0) {
                this.f72658f.remove(i);
                this.f72661i.remove(i);
                return;
            }
            return;
        }
        this.f72658f.remove(i);
    }

    /* renamed from: a */
    private void m62100a(DownloadTask downloadTask, boolean z) {
        DownloadInfo downloadInfo;
        int i;
        DownloadInfo downloadInfo2;
        DownloadTask downloadTask2;
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            if (downloadInfo.isEntityInvalid()) {
                C30439a.m62034a(downloadTask.getMonitorDepend(), downloadInfo, new BaseException(1003, "downloadInfo is Invalid, url is " + downloadInfo.getUrl() + " name is " + downloadInfo.getName() + " savePath is " + downloadInfo.getSavePath()), downloadInfo.getStatus());
                return;
            }
            boolean z2 = false;
            if (C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null).mo54258a("no_net_opt", 0) != 1 || C30535g.m62580b(C30399c.m61674B()) || downloadInfo.isFirstDownload()) {
                int id = downloadInfo.getId();
                if (z) {
                    m62099a(downloadInfo);
                }
                if (this.f72654b.get(id) != null) {
                    this.f72654b.remove(id);
                }
                if (this.f72653a.get(id) != null) {
                    this.f72653a.remove(id);
                }
                if (this.f72659g.get(id) != null) {
                    this.f72659g.remove(id);
                }
                if (this.f72660h.get(id) != null) {
                    this.f72660h.remove(id);
                }
                if (!mo54279a(id) || downloadInfo.canReStartAsyncTask()) {
                    C30434a.m62027b("AbsDownloadEngine", "no downloading task :".concat(String.valueOf(id)));
                    if (downloadInfo.canReStartAsyncTask()) {
                        downloadInfo.setAsyncHandleStatus(EnumC30287a.ASYNC_HANDLE_RESTART);
                    }
                    if (C30528a.m62524a(32768) && (downloadTask2 = (DownloadTask) this.f72655c.remove(Integer.valueOf(id))) != null) {
                        downloadTask.copyListenerFromPendingTask(downloadTask2);
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    DownloadTask downloadTask3 = this.f72658f.get(id);
                    if (downloadTask3 == null || (downloadInfo2 = downloadTask3.getDownloadInfo()) == null) {
                        i = 0;
                    } else {
                        i = downloadInfo2.getStatus();
                        if (C30292f.m61285a(i)) {
                            z2 = true;
                        }
                    }
                    C30434a.m62027b("AbsDownloadEngine", "can add listener " + z2 + " , oldTaskStatus is :" + i);
                    if (z2) {
                        downloadTask.addListenerToDownloadingSameTask();
                        return;
                    }
                    int hashCodeForSameTask = downloadTask.getHashCodeForSameTask();
                    if (hashCodeForSameTask != 0 || (downloadTask.isAutoSetHashCodeForSameTask() && (hashCodeForSameTask = downloadTask.autoCalAndGetHashCodeForSameTask()) != 0)) {
                        SparseArray<DownloadTask> sparseArray = this.f72661i.get(downloadTask.getDownloadId());
                        if (sparseArray == null) {
                            sparseArray = new SparseArray<>();
                            this.f72661i.put(downloadTask.getDownloadId(), sparseArray);
                        }
                        C30434a.m62027b("AbsDownloadEngine", "tryCacheSameTaskWithListenerHashCode id:" + downloadTask.getDownloadId() + " listener hasCode:" + hashCodeForSameTask);
                        sparseArray.put(hashCodeForSameTask, downloadTask);
                    }
                    this.f72658f.put(id, downloadTask);
                    this.f72662j.put(id, Long.valueOf(uptimeMillis));
                    mo54273a(id, downloadTask);
                    return;
                }
                C30434a.m62027b("AbsDownloadEngine", "another task with same id is downloading when tryDownload");
                downloadTask.addListenerToDownloadingSameTask();
                C30439a.m62034a(downloadTask.getMonitorDepend(), downloadInfo, new BaseException(1003, "downloadInfo is isDownloading and addListenerToSameTask is false"), downloadInfo.getStatus());
                return;
            }
            new C30411g(downloadTask, this.f72657e).mo54071a(new BaseException(1049, "network_not_available"));
        }
    }

    /* renamed from: a */
    private static void m62098a(int i, BaseException baseException, DownloadTask downloadTask) {
        boolean z;
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(EnumC30294h.MAIN);
            SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(EnumC30294h.NOTIFICATION);
            if (downloadTask.canShowNotification() || downloadInfo.isAutoInstallWithoutNotification()) {
                z = true;
            } else {
                z = false;
            }
            C30531d.m62530a(i, downloadListeners, true, downloadInfo, baseException);
            C30531d.m62530a(i, downloadListeners2, z, downloadInfo, baseException);
        }
    }

    /* renamed from: b */
    public final synchronized void mo54285b(int i, boolean z, boolean z2) {
        C30434a.m62027b("AbsDownloadEngine", "clearDownloadDataInSubThread::id=" + i + " deleteTargetFile=" + z);
        try {
            DownloadInfo b = this.f72656d.mo53777b(i);
            if (b != null) {
                if (z) {
                    if (z2) {
                        new C30325a(b.getSavePath(), b.getName(), false, false).mo53842d();
                    }
                    C30535g.m62552a(b, z);
                } else {
                    C30535g.m62577b(b.getTempPath(), b.getTempName());
                }
                b.erase();
            }
            try {
                this.f72656d.mo53795f(i);
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            mo54269a(i, 0, -4);
            if (this.f72654b.get(i) != null) {
                this.f72654b.remove(i);
            }
            if (this.f72653a.get(i) != null) {
                this.f72653a.remove(i);
            }
            this.f72655c.remove(Integer.valueOf(i));
            C30472a.m62090a(i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final synchronized void mo54269a(int i, int i2, int i3) {
        if (i3 != -7) {
            if (i3 != -6) {
                if (i3 != -4) {
                    if (i3 == -3) {
                        this.f72653a.put(i, this.f72658f.get(i));
                        m62097a(i, i2);
                    } else if (i3 != -1) {
                        if (i3 == 7) {
                            DownloadTask downloadTask = this.f72658f.get(i);
                            if (downloadTask != null) {
                                if (this.f72659g.get(i) == null) {
                                    this.f72659g.put(i, downloadTask);
                                }
                                m62097a(i, i2);
                            }
                            m62101r(i);
                            return;
                        } else if (i3 == 8) {
                            DownloadTask downloadTask2 = this.f72658f.get(i);
                            if (downloadTask2 != null && this.f72660h.get(i) == null) {
                                this.f72660h.put(i, downloadTask2);
                            }
                        }
                    }
                    m62101r(i);
                } else {
                    m62097a(i, i2);
                    m62101r(i);
                }
                return;
            }
            this.f72653a.put(i, this.f72658f.get(i));
            m62097a(i, i2);
            return;
        }
        DownloadTask downloadTask3 = this.f72658f.get(i);
        if (downloadTask3 != null) {
            if (this.f72654b.get(i) == null) {
                this.f72654b.put(i, downloadTask3);
            }
            m62097a(i, i2);
        }
        m62101r(i);
    }

    /* renamed from: b */
    public final synchronized void mo54284b(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z) {
        mo54271a(i, i2, iDownloadListener, hVar, z, true);
    }

    /* renamed from: a */
    public final synchronized void mo54270a(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z) {
        DownloadTask q = mo54301q(i);
        if (!(q == null && (q = (DownloadTask) this.f72655c.get(Integer.valueOf(i))) == null)) {
            q.removeDownloadListener(i2, iDownloadListener, hVar, z);
        }
    }
}
