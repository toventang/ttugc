package com.bytedance.ies.xelement.bytedlottie.p1365a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.AbstractC21119k;
import com.bytedance.lottie.C21122n;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.bytedance.ies.xelement.bytedlottie.a.b */
public final class C19047b<T> {

    /* renamed from: a */
    public Executor f45125a;

    /* renamed from: b */
    final Set<AbstractC21119k<T>> f45126b;

    /* renamed from: c */
    public final FutureTask<C21122n<T>> f45127c;

    /* renamed from: d */
    public volatile C21122n<T> f45128d;

    /* renamed from: e */
    private Thread f45129e;

    /* renamed from: f */
    private final Set<AbstractC21119k<Throwable>> f45130f;

    /* renamed from: g */
    private final Handler f45131g;

    static {
        Covode.recordClassIndex(21810);
    }

    /* renamed from: c */
    private boolean m35392c() {
        Thread thread = this.f45129e;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private synchronized void m35391b() {
        MethodCollector.m26663i(116);
        if (m35392c() || this.f45128d != null) {
            MethodCollector.m26664o(116);
            return;
        }
        C190492 r1 = new Thread("LynxLottieTaskObserver") {
            /* class com.bytedance.ies.xelement.bytedlottie.p1365a.C19047b.C190492 */

            /* renamed from: b */
            private boolean f45134b;

            static {
                Covode.recordClassIndex(21812);
            }

            public final void run() {
                while (!isInterrupted() && !this.f45134b) {
                    if (C19047b.this.f45127c.isDone()) {
                        try {
                            C19047b bVar = C19047b.this;
                            bVar.mo30333a(bVar.f45127c.get());
                        } catch (InterruptedException | ExecutionException e) {
                            C19047b.this.mo30333a(new C21122n<>(e));
                        }
                        this.f45134b = true;
                        C19047b.this.mo30332a();
                    }
                }
            }
        };
        this.f45129e = r1;
        r1.start();
        MethodCollector.m26664o(116);
    }

    /* renamed from: a */
    public final synchronized void mo30332a() {
        MethodCollector.m26663i(121);
        if (!m35392c()) {
            MethodCollector.m26664o(121);
            return;
        }
        if (this.f45126b.isEmpty() || this.f45128d != null) {
            this.f45129e.interrupt();
            this.f45129e = null;
        }
        MethodCollector.m26664o(121);
    }

    public C19047b(Callable<C21122n<T>> callable) {
        this(callable, (byte) 0);
    }

    /* renamed from: a */
    public final void mo30333a(C21122n<T> nVar) {
        if (this.f45128d == null) {
            this.f45128d = nVar;
            this.f45131g.post(new Runnable() {
                /* class com.bytedance.ies.xelement.bytedlottie.p1365a.C19047b.RunnableC190481 */

                static {
                    Covode.recordClassIndex(21811);
                }

                public final void run() {
                    if (!(C19047b.this.f45128d == null || C19047b.this.f45127c.isCancelled())) {
                        C21122n<T> nVar = C19047b.this.f45128d;
                        if (nVar.f50100a != null) {
                            C19047b bVar = C19047b.this;
                            V v = nVar.f50100a;
                            for (AbstractC21119k kVar : new ArrayList(bVar.f45126b)) {
                                kVar.mo34447a(v);
                            }
                            return;
                        }
                        C19047b.this.mo30334a(nVar.f50101b);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: a */
    public final void mo30334a(Throwable th) {
        ArrayList<AbstractC21119k> arrayList = new ArrayList(this.f45130f);
        if (!arrayList.isEmpty()) {
            for (AbstractC21119k kVar : arrayList) {
                kVar.mo34447a(th);
            }
        }
    }

    private C19047b(Callable<C21122n<T>> callable, byte b) {
        this.f45125a = Executors.newCachedThreadPool();
        this.f45126b = new LinkedHashSet(1);
        this.f45130f = new LinkedHashSet(1);
        this.f45131g = new Handler(Looper.getMainLooper());
        this.f45128d = null;
        FutureTask<C21122n<T>> futureTask = new FutureTask<>(callable);
        this.f45127c = futureTask;
        this.f45125a.execute(futureTask);
        m35391b();
    }
}
