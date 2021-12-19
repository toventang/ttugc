package com.bytedance.lottie;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.p1572b.C21671f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: com.bytedance.lottie.o */
public class C21123o<T> {

    /* renamed from: a */
    public static Executor f50102a = C21671f.m40615a();

    /* renamed from: b */
    final Set<AbstractC21119k<Throwable>> f50103b;

    /* renamed from: c */
    public final FutureTask<C21122n<T>> f50104c;

    /* renamed from: d */
    public volatile C21122n<T> f50105d;

    /* renamed from: e */
    private Thread f50106e;

    /* renamed from: f */
    private final Set<AbstractC21119k<T>> f50107f;

    /* renamed from: g */
    private final Handler f50108g;

    static {
        Covode.recordClassIndex(24739);
    }

    /* renamed from: c */
    private boolean m39788c() {
        Thread thread = this.f50106e;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private synchronized void m39787b() {
        MethodCollector.m26663i(9745);
        if (m39788c() || this.f50105d != null) {
            MethodCollector.m26664o(9745);
            return;
        }
        C211252 r1 = new Thread("LottieTaskObserver") {
            /* class com.bytedance.lottie.C21123o.C211252 */

            /* renamed from: b */
            private boolean f50111b;

            static {
                Covode.recordClassIndex(24741);
            }

            public final void run() {
                while (!isInterrupted() && !this.f50111b) {
                    if (C21123o.this.f50104c.isDone()) {
                        try {
                            C21123o oVar = C21123o.this;
                            oVar.mo34619a((C21122n) oVar.f50104c.get());
                        } catch (InterruptedException | ExecutionException e) {
                            C21123o.this.mo34619a((C21122n) new C21122n<>(e));
                        }
                        this.f50111b = true;
                        C21123o.this.mo34618a();
                    }
                }
            }
        };
        this.f50106e = r1;
        r1.start();
        MethodCollector.m26664o(9745);
    }

    /* renamed from: a */
    public final synchronized void mo34618a() {
        MethodCollector.m26663i(9746);
        if (!m39788c()) {
            MethodCollector.m26664o(9746);
            return;
        }
        if (this.f50107f.isEmpty() || this.f50105d != null) {
            this.f50106e.interrupt();
            this.f50106e = null;
        }
        MethodCollector.m26664o(9746);
    }

    public C21123o(Callable<C21122n<T>> callable) {
        this(callable, (byte) 0);
    }

    /* renamed from: a */
    public final void mo34619a(C21122n<T> nVar) {
        if (this.f50105d == null) {
            this.f50105d = nVar;
            this.f50108g.post(new Runnable() {
                /* class com.bytedance.lottie.C21123o.RunnableC211241 */

                static {
                    Covode.recordClassIndex(24740);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: com.bytedance.lottie.k */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    if (!(C21123o.this.f50105d == null || C21123o.this.f50104c.isCancelled())) {
                        C21122n<T> nVar = C21123o.this.f50105d;
                        if (nVar.f50100a != null) {
                            C21123o.this.mo34620a((Object) nVar.f50100a);
                            return;
                        }
                        C21123o oVar = C21123o.this;
                        Throwable th = nVar.f50101b;
                        ArrayList<AbstractC21119k> arrayList = new ArrayList(oVar.f50103b);
                        if (!arrayList.isEmpty()) {
                            for (AbstractC21119k kVar : arrayList) {
                                kVar.mo34447a(th);
                            }
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: b */
    public final synchronized C21123o<T> mo34621b(AbstractC21119k<T> kVar) {
        MethodCollector.m26663i(9595);
        this.f50107f.remove(kVar);
        mo34618a();
        MethodCollector.m26664o(9595);
        return this;
    }

    /* renamed from: d */
    public final synchronized C21123o<T> mo34623d(AbstractC21119k<Throwable> kVar) {
        MethodCollector.m26663i(9597);
        this.f50103b.remove(kVar);
        mo34618a();
        MethodCollector.m26664o(9597);
        return this;
    }

    /* renamed from: a */
    public final synchronized C21123o<T> mo34617a(AbstractC21119k<T> kVar) {
        MethodCollector.m26663i(9594);
        if (!(this.f50105d == null || this.f50105d.f50100a == null)) {
            kVar.mo34447a(this.f50105d.f50100a);
        }
        this.f50107f.add(kVar);
        m39787b();
        MethodCollector.m26664o(9594);
        return this;
    }

    /* renamed from: c */
    public final synchronized C21123o<T> mo34622c(AbstractC21119k<Throwable> kVar) {
        MethodCollector.m26663i(9596);
        if (!(this.f50105d == null || this.f50105d.f50101b == null)) {
            kVar.mo34447a(this.f50105d.f50101b);
        }
        this.f50103b.add(kVar);
        m39787b();
        MethodCollector.m26664o(9596);
        return this;
    }

    /* renamed from: a */
    public final synchronized void mo34620a(T t) {
        MethodCollector.m26663i(9744);
        for (AbstractC21119k kVar : new ArrayList(this.f50107f)) {
            kVar.mo34447a(t);
        }
        MethodCollector.m26664o(9744);
    }

    private C21123o(Callable<C21122n<T>> callable, byte b) {
        this.f50107f = new LinkedHashSet(1);
        this.f50103b = new LinkedHashSet(1);
        this.f50108g = new Handler(Looper.getMainLooper());
        this.f50105d = null;
        FutureTask<C21122n<T>> futureTask = new FutureTask<>(callable);
        this.f50104c = futureTask;
        f50102a.execute(futureTask);
        m39787b();
    }
}
