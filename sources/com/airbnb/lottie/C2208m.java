package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.p104g.C2144d;
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

/* renamed from: com.airbnb.lottie.m */
public final class C2208m<T> {

    /* renamed from: a */
    public static Executor f6623a = Executors.newCachedThreadPool();

    /* renamed from: b */
    public FutureTask<C2207l<T>> f6624b;

    /* renamed from: c */
    public volatile C2207l<T> f6625c;

    /* renamed from: d */
    private Thread f6626d;

    /* renamed from: e */
    private final Set<AbstractC2186i<T>> f6627e;

    /* renamed from: f */
    private final Set<AbstractC2186i<Throwable>> f6628f;

    /* renamed from: g */
    private final Handler f6629g;

    static {
        Covode.recordClassIndex(2403);
    }

    /* renamed from: c */
    private boolean m6809c() {
        Thread thread = this.f6626d;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.airbnb.lottie.m$a */
    class C2211a extends FutureTask<C2207l<T>> {
        static {
            Covode.recordClassIndex(2406);
        }

        /* access modifiers changed from: protected */
        public final void done() {
            if (!isCancelled()) {
                try {
                    C2208m.this.mo6132a((C2207l) ((C2207l) get()));
                } catch (InterruptedException | ExecutionException e) {
                    C2208m.this.mo6132a((C2207l) new C2207l<>(e));
                }
            }
        }

        C2211a(Callable<C2207l<T>> callable) {
            super(callable);
        }
    }

    /* renamed from: b */
    private synchronized void m6806b() {
        MethodCollector.m26663i(12897);
        if (m6809c() || this.f6625c != null) {
            MethodCollector.m26664o(12897);
            return;
        }
        C22102 r1 = new Thread("LottieTaskObserver") {
            /* class com.airbnb.lottie.C2208m.C22102 */

            /* renamed from: b */
            private boolean f6632b;

            static {
                Covode.recordClassIndex(2405);
            }

            public final void run() {
                while (!isInterrupted() && !this.f6632b) {
                    if (C2208m.this.f6624b.isDone()) {
                        try {
                            C2208m mVar = C2208m.this;
                            mVar.mo6132a((C2207l) mVar.f6624b.get());
                        } catch (InterruptedException | ExecutionException e) {
                            C2208m.this.mo6132a((C2207l) new C2207l<>(e));
                        }
                        this.f6632b = true;
                        C2208m.this.mo6131a();
                    }
                }
            }
        };
        this.f6626d = r1;
        r1.start();
        MethodCollector.m26664o(12897);
    }

    /* renamed from: a */
    public final synchronized void mo6131a() {
        MethodCollector.m26663i(12989);
        if (!m6809c()) {
            MethodCollector.m26664o(12989);
            return;
        }
        if (this.f6627e.isEmpty() || this.f6625c != null) {
            this.f6626d.interrupt();
            this.f6626d = null;
        }
        MethodCollector.m26664o(12989);
    }

    public C2208m(Callable<C2207l<T>> callable) {
        this(callable, (byte) 0);
    }

    /* renamed from: a */
    public final void mo6132a(C2207l<T> lVar) {
        if (this.f6625c == null) {
            this.f6625c = lVar;
            this.f6629g.post(new Runnable() {
                /* class com.airbnb.lottie.C2208m.RunnableC22091 */

                static {
                    Covode.recordClassIndex(2404);
                }

                public final void run() {
                    if (C2208m.this.f6625c == null) {
                        return;
                    }
                    if (C2144d.C2145a.f6479a || C2208m.this.f6624b == null || !C2208m.this.f6624b.isCancelled()) {
                        C2207l<T> lVar = C2208m.this.f6625c;
                        if (lVar.f6621a != null) {
                            C2208m.this.mo6133a((Object) lVar.f6621a);
                        } else {
                            C2208m.this.mo6134a(lVar.f6622b);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: b */
    public final synchronized C2208m<T> mo6135b(AbstractC2186i<T> iVar) {
        MethodCollector.m26663i(12593);
        this.f6627e.remove(iVar);
        if (!C2144d.C2145a.f6479a && this.f6624b != null) {
            mo6131a();
        }
        MethodCollector.m26664o(12593);
        return this;
    }

    /* renamed from: d */
    public final synchronized C2208m<T> mo6137d(AbstractC2186i<Throwable> iVar) {
        MethodCollector.m26663i(12708);
        this.f6628f.remove(iVar);
        if (!C2144d.C2145a.f6479a && this.f6624b != null) {
            mo6131a();
        }
        MethodCollector.m26664o(12708);
        return this;
    }

    /* renamed from: a */
    public final synchronized C2208m<T> mo6130a(AbstractC2186i<T> iVar) {
        MethodCollector.m26663i(12592);
        if (!(this.f6625c == null || this.f6625c.f6621a == null)) {
            iVar.mo5889a(this.f6625c.f6621a);
        }
        this.f6627e.add(iVar);
        if (!C2144d.C2145a.f6479a && this.f6624b != null) {
            m6806b();
        }
        MethodCollector.m26664o(12592);
        return this;
    }

    /* renamed from: c */
    public final synchronized C2208m<T> mo6136c(AbstractC2186i<Throwable> iVar) {
        MethodCollector.m26663i(12594);
        if (!(this.f6625c == null || this.f6625c.f6622b == null)) {
            iVar.mo5889a(this.f6625c.f6622b);
        }
        this.f6628f.add(iVar);
        if (!C2144d.C2145a.f6479a && this.f6624b != null) {
            m6806b();
        }
        MethodCollector.m26664o(12594);
        return this;
    }

    /* renamed from: b */
    private synchronized void m6807b(T t) {
        MethodCollector.m26663i(12811);
        for (AbstractC2186i iVar : new ArrayList(this.f6627e)) {
            iVar.mo5889a(t);
        }
        MethodCollector.m26664o(12811);
    }

    /* renamed from: b */
    private synchronized void m6808b(Throwable th) {
        MethodCollector.m26663i(12813);
        ArrayList<AbstractC2186i> arrayList = new ArrayList(this.f6628f);
        if (arrayList.isEmpty()) {
            MethodCollector.m26664o(12813);
            return;
        }
        for (AbstractC2186i iVar : arrayList) {
            iVar.mo5889a(th);
        }
        MethodCollector.m26664o(12813);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final synchronized void mo6133a(Object obj) {
        MethodCollector.m26663i(12810);
        synchronized (this) {
            try {
                m6807b(obj);
            } finally {
                MethodCollector.m26664o(12810);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo6134a(Throwable th) {
        MethodCollector.m26663i(12812);
        try {
            m6808b(th);
            MethodCollector.m26664o(12812);
        } catch (Throwable unused) {
            MethodCollector.m26664o(12812);
        }
    }

    private C2208m(Callable<C2207l<T>> callable, byte b) {
        this.f6627e = new LinkedHashSet(1);
        this.f6628f = new LinkedHashSet(1);
        this.f6629g = new Handler(Looper.getMainLooper());
        this.f6625c = null;
        if (!C2144d.C2145a.f6479a) {
            FutureTask<C2207l<T>> futureTask = new FutureTask<>(callable);
            this.f6624b = futureTask;
            f6623a.execute(futureTask);
            m6806b();
        } else if (C2144d.C2145a.f6488j) {
            try {
                f6623a.execute(new C2211a(callable));
            } catch (Throwable th) {
                if (C2144d.f6474a) {
                    throw th;
                }
            }
        } else {
            f6623a.execute(new C2211a(callable));
        }
    }
}
