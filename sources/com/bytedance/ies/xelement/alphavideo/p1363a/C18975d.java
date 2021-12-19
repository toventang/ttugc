package com.bytedance.ies.xelement.alphavideo.p1363a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.bytedance.ies.xelement.alphavideo.a.d */
public final class C18975d<T> {

    /* renamed from: a */
    public Executor f44906a;

    /* renamed from: b */
    final Set<AbstractC18973b<T>> f44907b;

    /* renamed from: c */
    public final FutureTask<C18974c<T>> f44908c;

    /* renamed from: d */
    public volatile C18974c<T> f44909d;

    /* renamed from: e */
    private Thread f44910e;

    /* renamed from: f */
    private final Set<AbstractC18973b<Throwable>> f44911f;

    /* renamed from: g */
    private final Handler f44912g;

    static {
        Covode.recordClassIndex(21724);
    }

    /* renamed from: c */
    private boolean m35183c() {
        Thread thread = this.f44910e;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private synchronized void m35182b() {
        MethodCollector.m26663i(10249);
        if (m35183c() || this.f44909d != null) {
            MethodCollector.m26664o(10249);
            return;
        }
        C189772 r1 = new Thread("LynxLottieTaskObserver") {
            /* class com.bytedance.ies.xelement.alphavideo.p1363a.C18975d.C189772 */

            /* renamed from: b */
            private boolean f44915b;

            static {
                Covode.recordClassIndex(21726);
            }

            public final void run() {
                while (!isInterrupted() && !this.f44915b) {
                    if (C18975d.this.f44908c.isDone()) {
                        try {
                            C18975d dVar = C18975d.this;
                            dVar.mo30106a(dVar.f44908c.get());
                        } catch (InterruptedException | ExecutionException e) {
                            C18975d.this.mo30106a(new C18974c<>(e));
                        }
                        this.f44915b = true;
                        C18975d.this.mo30105a();
                    }
                }
            }
        };
        this.f44910e = r1;
        r1.start();
        MethodCollector.m26664o(10249);
    }

    /* renamed from: a */
    public final synchronized void mo30105a() {
        MethodCollector.m26663i(10401);
        if (!m35183c()) {
            MethodCollector.m26664o(10401);
            return;
        }
        if (this.f44907b.isEmpty() || this.f44909d != null) {
            this.f44910e.interrupt();
            this.f44910e = null;
        }
        MethodCollector.m26664o(10401);
    }

    public C18975d(Callable<C18974c<T>> callable) {
        this(callable, (byte) 0);
    }

    /* renamed from: a */
    public final void mo30106a(C18974c<T> cVar) {
        if (this.f44909d == null) {
            this.f44909d = cVar;
            this.f44912g.post(new Runnable() {
                /* class com.bytedance.ies.xelement.alphavideo.p1363a.C18975d.RunnableC189761 */

                static {
                    Covode.recordClassIndex(21725);
                }

                public final void run() {
                    if (!(C18975d.this.f44909d == null || C18975d.this.f44908c.isCancelled())) {
                        C18974c<T> cVar = C18975d.this.f44909d;
                        if (cVar.f44904a != null) {
                            C18975d dVar = C18975d.this;
                            V v = cVar.f44904a;
                            for (AbstractC18973b bVar : new ArrayList(dVar.f44907b)) {
                                bVar.mo30095a(v);
                            }
                            return;
                        }
                        C18975d.this.mo30107a(cVar.f44905b);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: a */
    public final synchronized C18975d<T> mo30104a(AbstractC18973b<T> bVar) {
        MethodCollector.m26663i(10080);
        if (!(this.f44909d == null || this.f44909d.f44904a == null)) {
            bVar.mo30095a(this.f44909d.f44904a);
        }
        this.f44907b.add(bVar);
        m35182b();
        MethodCollector.m26664o(10080);
        return this;
    }

    /* renamed from: b */
    public final synchronized C18975d<T> mo30108b(AbstractC18973b<Throwable> bVar) {
        MethodCollector.m26663i(10086);
        if (!(this.f44909d == null || this.f44909d.f44905b == null)) {
            bVar.mo30095a(this.f44909d.f44905b);
        }
        this.f44911f.add(bVar);
        m35182b();
        MethodCollector.m26664o(10086);
        return this;
    }

    /* renamed from: a */
    public final void mo30107a(Throwable th) {
        ArrayList<AbstractC18973b> arrayList = new ArrayList(this.f44911f);
        if (!arrayList.isEmpty()) {
            for (AbstractC18973b bVar : arrayList) {
                bVar.mo30095a(th);
            }
        }
    }

    private C18975d(Callable<C18974c<T>> callable, byte b) {
        this.f44906a = Executors.newCachedThreadPool();
        this.f44907b = new LinkedHashSet(1);
        this.f44911f = new LinkedHashSet(1);
        this.f44912g = new Handler(Looper.getMainLooper());
        this.f44909d = null;
        FutureTask<C18974c<T>> futureTask = new FutureTask<>(callable);
        this.f44908c = futureTask;
        this.f44906a.execute(futureTask);
        m35182b();
    }
}
