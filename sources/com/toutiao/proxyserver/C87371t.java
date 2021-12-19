package com.toutiao.proxyserver;

import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.C87291ae;
import com.toutiao.proxyserver.C87343i;
import com.toutiao.proxyserver.net.C87360c;
import com.toutiao.proxyserver.p4491c.C87301c;
import com.toutiao.proxyserver.p4493e.C87312c;
import com.toutiao.proxyserver.p4495g.C87327a;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.toutiao.proxyserver.t */
public class C87371t {

    /* renamed from: h */
    public static final C87370s f198041h = new C87370s();

    /* renamed from: m */
    private static volatile C87371t f198042m;

    /* renamed from: a */
    public final SparseArray<Map<String, C87343i>> f198043a;

    /* renamed from: b */
    public final BlockingQueue<Runnable> f198044b;

    /* renamed from: c */
    public volatile C87301c f198045c;

    /* renamed from: d */
    public volatile C87331h f198046d;

    /* renamed from: e */
    public volatile C87325g f198047e;

    /* renamed from: f */
    public volatile C87369r f198048f;

    /* renamed from: g */
    public List<Object> f198049g;

    /* renamed from: i */
    volatile long f198050i = 10000;

    /* renamed from: j */
    volatile long f198051j = 10000;

    /* renamed from: k */
    volatile long f198052k = 10000;

    /* renamed from: l */
    private final ExecutorService f198053l;

    /* renamed from: n */
    private final C87343i.AbstractC87347b f198054n = new C87343i.AbstractC87347b() {
        /* class com.toutiao.proxyserver.C87371t.C873721 */

        static {
            Covode.recordClassIndex(103269);
        }

        @Override // com.toutiao.proxyserver.C87343i.AbstractC87347b
        /* renamed from: a */
        public final void mo141388a(C87343i iVar) {
            MethodCollector.m26663i(9318);
            C87312c.m151523a("TAG_PROXY_Preloader", "onLazyUrlsProvided, key: " + iVar.f197794h, null);
            int g = iVar.mo141307g();
            synchronized (C87371t.this.f198043a) {
                try {
                    Map<String, C87343i> map = C87371t.this.f198043a.get(g);
                    if (!map.containsKey(iVar.f197794h)) {
                        map.put(iVar.f197794h, iVar);
                    }
                } finally {
                    MethodCollector.m26664o(9318);
                }
            }
        }

        @Override // com.toutiao.proxyserver.C87343i.AbstractC87347b
        /* renamed from: b */
        public final void mo141389b(final C87343i iVar) {
            MethodCollector.m26663i(9173);
            final int g = iVar.mo141307g();
            synchronized (C87371t.this.f198043a) {
                try {
                    Map<String, C87343i> map = C87371t.this.f198043a.get(g);
                    if (map != null) {
                        map.remove(iVar.f197794h);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9173);
                    throw th;
                }
            }
            if (C87371t.this.mo141419d()) {
                C87371t.this.mo141420e();
            }
            final AbstractC87366o oVar = C87383u.f198087g;
            if (oVar != null) {
                C87328b.m151562b(new Runnable() {
                    /* class com.toutiao.proxyserver.C87371t.C873721.RunnableC873731 */

                    static {
                        Covode.recordClassIndex(103270);
                    }

                    public final void run() {
                        oVar.mo124034a(iVar.f197789c.get(), 0, iVar.f197790d.get());
                    }
                });
            }
            C87312c.m151523a("TAG_PROXY_Preloader", "afterExecute, key: " + iVar.f197794h, null);
            MethodCollector.m26664o(9173);
        }
    };

    /* renamed from: com.toutiao.proxyserver.t$b */
    static final class C87382b<T> extends LinkedBlockingDeque<T> {

        /* renamed from: a */
        ThreadPoolExecutor f198075a;

        static {
            Covode.recordClassIndex(103279);
        }

        private C87382b() {
        }

        /* synthetic */ C87382b(byte b) {
            this();
        }

        @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.LinkedBlockingDeque, java.util.concurrent.BlockingQueue, java.util.Queue, java.util.Deque
        public final boolean offer(T t) {
            MethodCollector.m26663i(10005);
            synchronized (this) {
                try {
                    int poolSize = this.f198075a.getPoolSize();
                    int activeCount = this.f198075a.getActiveCount();
                    int maximumPoolSize = this.f198075a.getMaximumPoolSize();
                    if (activeCount < poolSize || poolSize >= maximumPoolSize) {
                        boolean offerFirst = offerFirst(t);
                        MethodCollector.m26664o(10005);
                        return offerFirst;
                    }
                    C87312c.m151524b("TAG_PROXY_TT", "create new preloader thread", null);
                    return false;
                } finally {
                    MethodCollector.m26664o(10005);
                }
            }
        }
    }

    /* renamed from: f */
    public final C87381a mo141421f() {
        return new C87381a();
    }

    static {
        Covode.recordClassIndex(103268);
    }

    /* renamed from: b */
    public final void mo141417b() {
        C87328b.m151554a(new Runnable() {
            /* class com.toutiao.proxyserver.C87371t.RunnableC873753 */

            static {
                Covode.recordClassIndex(103272);
            }

            public final void run() {
                MethodCollector.m26663i(10782);
                ArrayList<C87343i> arrayList = new ArrayList();
                synchronized (C87371t.this.f198043a) {
                    try {
                        int size = C87371t.this.f198043a.size();
                        for (int i = 0; i < size; i++) {
                            Map<String, C87343i> map = C87371t.this.f198043a.get(C87371t.this.f198043a.keyAt(i));
                            if (map != null) {
                                arrayList.addAll(map.values());
                                map.clear();
                            }
                        }
                        C87371t.this.f198044b.clear();
                    } finally {
                        MethodCollector.m26664o(10782);
                    }
                }
                C87371t.this.mo141420e();
                for (C87343i iVar : arrayList) {
                    iVar.mo141290a();
                    C87312c.m151525c("TAG_PROXY_Preloader", "PreloadTask: " + iVar + ", canceled!!!", null);
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo141418c() {
        C87328b.m151554a(new Runnable() {
            /* class com.toutiao.proxyserver.C87371t.RunnableC873764 */

            static {
                Covode.recordClassIndex(103273);
            }

            public final void run() {
                MethodCollector.m26663i(13266);
                ArrayList<C87343i> arrayList = new ArrayList();
                synchronized (C87371t.this.f198043a) {
                    try {
                        int size = C87371t.this.f198043a.size();
                        for (int i = 0; i < size; i++) {
                            Map<String, C87343i> map = C87371t.this.f198043a.get(C87371t.this.f198043a.keyAt(i));
                            if (map != null) {
                                arrayList.addAll(map.values());
                            }
                        }
                        for (C87343i iVar : arrayList) {
                            iVar.mo141290a();
                            C87312c.m151525c("TAG_PROXY_Preloader", "PreloadTask: " + iVar + ", canceled!!!", null);
                        }
                        int size2 = C87371t.this.f198043a.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            Map<String, C87343i> map2 = C87371t.this.f198043a.get(C87371t.this.f198043a.keyAt(i2));
                            if (map2 != null) {
                                map2.clear();
                            }
                        }
                        C87371t.this.f198044b.clear();
                    } catch (Throwable th) {
                        MethodCollector.m26664o(13266);
                        throw th;
                    }
                }
                C87371t.this.mo141420e();
                MethodCollector.m26664o(13266);
            }
        });
    }

    /* renamed from: e */
    public final void mo141420e() {
        C87328b.m151562b(new Runnable() {
            /* class com.toutiao.proxyserver.C87371t.RunnableC873775 */

            static {
                Covode.recordClassIndex(103274);
            }

            public final void run() {
                Iterator<Object> it = C87371t.this.f198049g.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        });
    }

    /* renamed from: com.toutiao.proxyserver.t$a */
    public class C87381a {

        /* renamed from: a */
        public int f198068a = C87371t.f198041h.f198039b;

        /* renamed from: b */
        public String f198069b;

        /* renamed from: c */
        public String[] f198070c;

        /* renamed from: d */
        public AbstractC87368q f198071d;

        /* renamed from: f */
        private boolean f198073f;

        /* renamed from: g */
        private List<C87360c> f198074g;

        static {
            Covode.recordClassIndex(103278);
        }

        /* renamed from: a */
        public final void mo141430a() {
            AbstractC87368q qVar = this.f198071d;
            if (qVar == null) {
                C87371t.this.mo141416a(this.f198073f, this.f198068a, this.f198069b, this.f198074g, this.f198070c);
            } else {
                C87371t.this.mo141414a(this.f198073f, this.f198068a, this.f198069b, this.f198074g, qVar);
            }
        }

        public C87381a() {
        }
    }

    /* renamed from: a */
    public static C87371t m151640a() {
        MethodCollector.m26663i(13396);
        if (f198042m == null) {
            synchronized (C87371t.class) {
                try {
                    if (f198042m == null) {
                        f198042m = new C87371t();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13396);
                    throw th;
                }
            }
        }
        C87371t tVar = f198042m;
        MethodCollector.m26664o(13396);
        return tVar;
    }

    /* renamed from: d */
    public final boolean mo141419d() {
        MethodCollector.m26663i(13529);
        synchronized (this.f198043a) {
            for (int i = 0; i < this.f198043a.size(); i++) {
                try {
                    SparseArray<Map<String, C87343i>> sparseArray = this.f198043a;
                    Map<String, C87343i> map = sparseArray.get(sparseArray.keyAt(i));
                    if (map != null && map.size() > 0) {
                        return false;
                    }
                } finally {
                    MethodCollector.m26664o(13529);
                }
            }
            MethodCollector.m26664o(13529);
            return true;
        }
    }

    private C87371t() {
        MethodCollector.m26663i(13395);
        SparseArray<Map<String, C87343i>> sparseArray = new SparseArray<>(2);
        this.f198043a = sparseArray;
        C87370s sVar = f198041h;
        if (sVar.f198040c == null) {
            sVar.f198040c = new C87382b((byte) 0);
        }
        final BlockingQueue<Runnable> blockingQueue = sVar.f198040c;
        this.f198044b = blockingQueue;
        int a = C87328b.m151542a();
        if (a <= 0) {
            a = 1;
        } else if (a > 4) {
            a = 4;
        }
        a = C87370s.f198038a == 1 ? 1 : a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(a, a, 60, TimeUnit.SECONDS, blockingQueue, new ThreadFactory() {
            /* class com.toutiao.proxyserver.C87371t.ThreadFactoryC873786 */

            static {
                Covode.recordClassIndex(103275);
            }

            public final Thread newThread(Runnable runnable) {
                C873791 r3 = new Thread(runnable) {
                    /* class com.toutiao.proxyserver.C87371t.ThreadFactoryC873786.C873791 */

                    static {
                        Covode.recordClassIndex(103276);
                    }

                    public final void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable unused) {
                        }
                        super.run();
                    }
                };
                r3.setName("video-preload-" + r3.getId());
                r3.setDaemon(true);
                C87312c.m151524b("TAG_PROXY_Preloader", "new preload thead: " + r3.getName(), null);
                return r3;
            }
        }, new RejectedExecutionHandler() {
            /* class com.toutiao.proxyserver.C87371t.RejectedExecutionHandlerC873807 */

            static {
                Covode.recordClassIndex(103277);
            }

            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    blockingQueue.offer(runnable);
                    C87312c.m151524b("TAG_PROXY_TT", "task rejected in preloader, put first!!!", null);
                } catch (Throwable unused) {
                }
            }
        });
        this.f198053l = threadPoolExecutor;
        if (blockingQueue instanceof C87382b) {
            C87382b bVar = (C87382b) blockingQueue;
            synchronized (bVar) {
                try {
                    if (bVar.f198075a == null) {
                        bVar.f198075a = threadPoolExecutor;
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("You can only call setExecutor() once!");
                        MethodCollector.m26664o(13395);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13395);
                    throw th;
                }
            }
        }
        this.f198049g = new ArrayList();
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
        MethodCollector.m26664o(13395);
    }

    /* renamed from: a */
    public final void mo141412a(long j) {
        this.f198050i = j;
        this.f198051j = 30000;
        this.f198052k = 30000;
    }

    /* renamed from: a */
    public final void mo141413a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            C87328b.m151554a(new Runnable() {
                /* class com.toutiao.proxyserver.C87371t.RunnableC873742 */

                /* renamed from: a */
                final /* synthetic */ boolean f198060a = false;

                static {
                    Covode.recordClassIndex(103271);
                }

                public final void run() {
                    C87371t tVar = C87371t.this;
                    boolean z = this.f198060a;
                    tVar.mo141411a(z ? 1 : 0, C87327a.m151540a(str));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141411a(int i, String str) {
        C87343i iVar;
        MethodCollector.m26663i(13470);
        synchronized (this.f198043a) {
            try {
                Map<String, C87343i> map = this.f198043a.get(i);
                if (map != null) {
                    iVar = map.remove(str);
                } else {
                    iVar = null;
                }
            } finally {
                MethodCollector.m26664o(13470);
            }
        }
        if (iVar != null) {
            iVar.mo141290a();
        }
        if (mo141419d()) {
            mo141420e();
        }
    }

    /* renamed from: a */
    public final void mo141414a(boolean z, int i, String str, List<C87360c> list, AbstractC87368q qVar) {
        m151641a(z, i, str, list, qVar, null);
    }

    /* renamed from: a */
    public final void mo141416a(boolean z, int i, String str, List<C87360c> list, String... strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            m151641a(z, i, str, list, null, new C87289ad(C87328b.m151549a(strArr)));
        }
    }

    /* renamed from: a */
    private void m151641a(boolean z, int i, String str, List<C87360c> list, AbstractC87368q qVar, C87289ad adVar) {
        mo141415a(z, i, str, list, qVar, adVar, false);
    }

    /* renamed from: a */
    public final void mo141415a(boolean z, int i, String str, List<C87360c> list, AbstractC87368q qVar, C87289ad adVar, boolean z2) {
        AbstractC87294b bVar;
        C87343i iVar;
        int i2;
        int i3 = i;
        MethodCollector.m26663i(13398);
        if (z2) {
            bVar = this.f198048f;
        } else if (z) {
            bVar = this.f198047e;
        } else {
            bVar = this.f198046d;
        }
        C87301c cVar = this.f198045c;
        if (bVar == null || cVar == null) {
            C87312c.m151526d("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!", null);
            MethodCollector.m26664o(13398);
            return;
        }
        if (i3 <= 0) {
            i3 = f198041h.f198039b;
        }
        C87312c.m151525c("TAG_PROXY_Preloader", "Preload urlsLazyProvider:".concat(String.valueOf(qVar)), null);
        if (qVar != null) {
            C87343i.C87346a a = new C87343i.C87346a().mo141382a(bVar).mo141383a(cVar);
            a.f197991g = list;
            C87343i.C87346a a2 = a.mo141384a(qVar);
            a2.f197992h = i3;
            a2.f197994j = this.f198054n;
            a2.f197995k = true;
            iVar = a2.mo141386a();
        } else if (TextUtils.isEmpty(str) || adVar == null) {
            MethodCollector.m26664o(13398);
            return;
        } else {
            String a3 = C87327a.m151540a(str);
            C87291ae.C87293b.f197857a.mo141327a(str, a3);
            File e = bVar.mo141331e(a3);
            if (e != null && e.length() >= ((long) i3)) {
                C87312c.m151524b("TAG_PROXY_Preloader", "no need preload, file size: " + e.length() + ", need preload size: " + i3, null);
                MethodCollector.m26664o(13398);
                return;
            } else if (z2 || !C87385v.m151666a().mo141434a(z ? 1 : 0, a3)) {
                synchronized (this.f198043a) {
                    try {
                        SparseArray<Map<String, C87343i>> sparseArray = this.f198043a;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        C87328b.m151556a(list);
                        C87343i.C87346a a4 = new C87343i.C87346a().mo141382a(bVar).mo141383a(cVar).mo141385a(str).mo141387b(a3).mo141381a(adVar);
                        a4.f197991g = list;
                        a4.f197992h = i3;
                        a4.f197994j = this.f198054n;
                        a4.f197995k = true;
                        iVar = a4.mo141386a();
                        sparseArray.get(i2).put(a3, iVar);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(13398);
                        throw th;
                    }
                }
            } else {
                C87312c.m151525c("TAG_PROXY_Preloader", "has pending proxy task, skip preload for key: ".concat(String.valueOf(str)), null);
                MethodCollector.m26664o(13398);
                return;
            }
        }
        this.f198053l.execute(iVar);
        MethodCollector.m26664o(13398);
    }
}
