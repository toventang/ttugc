package p077b;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b.i */
public class C1731i<TResult> {

    /* renamed from: a */
    public static final ExecutorService f5562a = C40780g.m82245b();

    /* renamed from: b */
    public static final Executor f5563b = C1724c.f5546a.f5547b;

    /* renamed from: c */
    public static final Executor f5564c = C1722b.f5541a.f5545b;

    /* renamed from: d */
    static volatile AbstractC1742a f5565d;

    /* renamed from: e */
    public static C1731i<?> f5566e = new C1731i<>((byte) 0);

    /* renamed from: n */
    private static C1731i<?> f5567n = new C1731i<>((Object) null);

    /* renamed from: o */
    private static C1731i<Boolean> f5568o = new C1731i<>((Boolean) true);

    /* renamed from: p */
    private static C1731i<Boolean> f5569p = new C1731i<>((Boolean) false);

    /* renamed from: f */
    private final Object f5570f = new Object();

    /* renamed from: g */
    private boolean f5571g;

    /* renamed from: h */
    private boolean f5572h;

    /* renamed from: i */
    private TResult f5573i;

    /* renamed from: j */
    private Exception f5574j;

    /* renamed from: k */
    private boolean f5575k;

    /* renamed from: l */
    private C1744k f5576l;

    /* renamed from: m */
    private List<AbstractC1729g<TResult, Void>> f5577m = new ArrayList();

    /* renamed from: b.i$a */
    public interface AbstractC1742a {
        static {
            Covode.recordClassIndex(1911);
        }
    }

    /* renamed from: a */
    public final boolean mo5535a() {
        boolean z;
        MethodCollector.m26663i(2675);
        synchronized (this.f5570f) {
            try {
                z = this.f5571g;
            } finally {
                MethodCollector.m26664o(2675);
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo5536a(long j, TimeUnit timeUnit) {
        boolean a;
        MethodCollector.m26663i(2686);
        synchronized (this.f5570f) {
            try {
                if (!mo5535a()) {
                    this.f5570f.wait(timeUnit.toMillis(j));
                }
                a = mo5535a();
            } finally {
                MethodCollector.m26664o(2686);
            }
        }
        return a;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: b.i<TResult>, b.i<TContinuationResult> */
    /* renamed from: a */
    public final <TContinuationResult> C1731i<TContinuationResult> mo5534a(final AbstractC1729g<TResult, TContinuationResult> gVar, final Executor executor, final C1726d dVar) {
        boolean a;
        MethodCollector.m26663i(4028);
        final C1743j jVar = new C1743j();
        synchronized (this.f5570f) {
            try {
                a = mo5535a();
                if (!a) {
                    this.f5577m.add(new AbstractC1729g<TResult, Void>() {
                        /* class p077b.C1731i.C17332 */

                        static {
                            Covode.recordClassIndex(1902);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Void then(C1731i<TResult> iVar) {
                            C1731i.m5637a(jVar, gVar, iVar, executor, dVar);
                            return null;
                        }
                    });
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(4028);
                throw th;
            }
        }
        if (a) {
            m5637a(jVar, gVar, this, executor, dVar);
        }
        C1731i iVar = (C1731i<TResult>) jVar.f5610a;
        MethodCollector.m26664o(4028);
        return iVar;
    }

    C1731i() {
    }

    /* renamed from: c */
    public final boolean mo5544c() {
        boolean z;
        MethodCollector.m26663i(2681);
        synchronized (this.f5570f) {
            try {
                if (mo5546e() != null) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(2681);
            }
        }
        return z;
    }

    /* renamed from: d */
    public final TResult mo5545d() {
        TResult tresult;
        MethodCollector.m26663i(2682);
        synchronized (this.f5570f) {
            try {
                tresult = this.f5573i;
            } finally {
                MethodCollector.m26664o(2682);
            }
        }
        return tresult;
    }

    /* renamed from: f */
    public final void mo5547f() {
        MethodCollector.m26663i(2685);
        synchronized (this.f5570f) {
            try {
                if (!mo5535a()) {
                    this.f5570f.wait();
                }
            } finally {
                MethodCollector.m26664o(2685);
            }
        }
    }

    static {
        Covode.recordClassIndex(1900);
    }

    /* renamed from: h */
    private void m5642h() {
        MethodCollector.m26663i(4317);
        synchronized (this.f5570f) {
            try {
                for (AbstractC1729g<TResult, Void> gVar : this.f5577m) {
                    try {
                        gVar.then(this);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception e2) {
                        RuntimeException runtimeException = new RuntimeException(e2);
                        MethodCollector.m26664o(4317);
                        throw runtimeException;
                    }
                }
                this.f5577m = null;
            } finally {
                MethodCollector.m26664o(4317);
            }
        }
        MethodCollector.m26664o(4317);
    }

    /* renamed from: e */
    public final Exception mo5546e() {
        Exception exc;
        MethodCollector.m26663i(2684);
        synchronized (this.f5570f) {
            try {
                if (this.f5574j != null) {
                    this.f5575k = true;
                    C1744k kVar = this.f5576l;
                    if (kVar != null) {
                        kVar.f5611a = null;
                        this.f5576l = null;
                    }
                }
                exc = this.f5574j;
            } finally {
                MethodCollector.m26664o(2684);
            }
        }
        return exc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo5548g() {
        MethodCollector.m26663i(4320);
        synchronized (this.f5570f) {
            try {
                if (this.f5571g) {
                    return false;
                }
                this.f5571g = true;
                this.f5572h = true;
                this.f5570f.notifyAll();
                m5642h();
                MethodCollector.m26664o(4320);
                return true;
            } finally {
                MethodCollector.m26664o(4320);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo5539b() {
        boolean z;
        MethodCollector.m26663i(2677);
        synchronized (this.f5570f) {
            try {
                z = this.f5572h;
            } finally {
                MethodCollector.m26664o(2677);
            }
        }
        return z;
    }

    /* renamed from: a */
    public static <TResult> C1731i<TResult> m5635a(Callable<TResult> callable) {
        return m5640b(callable, f5562a);
    }

    /* renamed from: b */
    public static <TResult> C1731i<TResult> m5639b(Callable<TResult> callable) {
        return m5640b(callable, f5563b);
    }

    /* renamed from: c */
    public final <TContinuationResult> C1731i<TContinuationResult> mo5542c(AbstractC1729g<TResult, TContinuationResult> gVar) {
        return mo5543c(gVar, f5563b);
    }

    /* renamed from: a */
    public static <TResult> C1731i<TResult> m5632a(Exception exc) {
        C1743j jVar = new C1743j();
        jVar.mo5556b(exc);
        return jVar.f5610a;
    }

    /* renamed from: b */
    public final <TContinuationResult> C1731i<TContinuationResult> mo5537b(AbstractC1729g<TResult, C1731i<TContinuationResult>> gVar) {
        return mo5538b(gVar, f5563b);
    }

    /* renamed from: a */
    public static <TResult> C1731i<List<TResult>> m5634a(final Collection<? extends C1731i<TResult>> collection) {
        return m5638b((Collection<? extends C1731i<?>>) collection).mo5542c(new AbstractC1729g<Void, List<TResult>>() {
            /* class p077b.C1731i.C17408 */

            static {
                Covode.recordClassIndex(1909);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i<Void> iVar) {
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (C1731i iVar2 : collection) {
                    arrayList.add(iVar2.mo5545d());
                }
                return arrayList;
            }
        });
    }

    private C1731i(byte b) {
        mo5548g();
    }

    /* renamed from: a */
    public static C1731i<Void> m5631a(long j) {
        ScheduledExecutorService d = C40780g.m82247d();
        if (j <= 0) {
            return m5633a((Object) null);
        }
        final C1743j jVar = new C1743j();
        d.schedule(new Runnable() {
            /* class p077b.C1731i.RunnableC17321 */

            static {
                Covode.recordClassIndex(1901);
            }

            public final void run() {
                jVar.mo5555a((Object) null);
            }
        }, j, TimeUnit.MILLISECONDS);
        return jVar.f5610a;
    }

    private C1731i(TResult tresult) {
        mo5541b((Object) tresult);
    }

    /* renamed from: a */
    public static <TResult> C1731i<TResult> m5633a(TResult tresult) {
        if (tresult == null) {
            return (C1731i<TResult>) f5567n;
        }
        if (tresult instanceof Boolean) {
            return tresult.booleanValue() ? (C1731i<TResult>) f5568o : (C1731i<TResult>) f5569p;
        }
        C1743j jVar = new C1743j();
        jVar.mo5557b((Object) tresult);
        return jVar.f5610a;
    }

    /* renamed from: b */
    public static C1731i<Void> m5638b(Collection<? extends C1731i<?>> collection) {
        if (collection.size() == 0) {
            return m5633a((Object) null);
        }
        final C1743j jVar = new C1743j();
        final ArrayList arrayList = new ArrayList();
        final Object obj = new Object();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends C1731i<?>> it = collection.iterator();
        while (it.hasNext()) {
            ((C1731i) it.next()).mo5532a((AbstractC1729g) new AbstractC1729g<Object, Void>() {
                /* class p077b.C1731i.C17419 */

                static {
                    Covode.recordClassIndex(1910);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1731i<Object> iVar) {
                    MethodCollector.m26663i(4107);
                    if (iVar.mo5544c()) {
                        synchronized (obj) {
                            try {
                                arrayList.add(iVar.mo5546e());
                            } catch (Throwable th) {
                                MethodCollector.m26664o(4107);
                                throw th;
                            }
                        }
                    }
                    if (iVar.mo5539b()) {
                        atomicBoolean.set(true);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (arrayList.size() != 0) {
                            if (arrayList.size() == 1) {
                                jVar.mo5556b((Exception) arrayList.get(0));
                            } else {
                                jVar.mo5556b((Exception) new C1721a(C1764a.m5928a("There were %d exceptions.", new Object[]{Integer.valueOf(arrayList.size())}), arrayList));
                            }
                        } else if (atomicBoolean.get()) {
                            jVar.mo5553a();
                        } else {
                            jVar.mo5557b((Object) null);
                        }
                    }
                    MethodCollector.m26664o(4107);
                    return null;
                }
            });
        }
        return jVar.f5610a;
    }

    /* renamed from: a */
    public final <TContinuationResult> C1731i<TContinuationResult> mo5532a(AbstractC1729g<TResult, TContinuationResult> gVar) {
        return mo5534a(gVar, f5563b, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo5540b(Exception exc) {
        MethodCollector.m26663i(4329);
        synchronized (this.f5570f) {
            try {
                if (this.f5571g) {
                    return false;
                }
                this.f5571g = true;
                this.f5574j = exc;
                this.f5575k = false;
                this.f5570f.notifyAll();
                m5642h();
                if (!this.f5575k && f5565d != null) {
                    this.f5576l = new C1744k(this);
                }
                MethodCollector.m26664o(4329);
                return true;
            } finally {
                MethodCollector.m26664o(4329);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo5541b(TResult tresult) {
        MethodCollector.m26663i(4323);
        synchronized (this.f5570f) {
            try {
                if (this.f5571g) {
                    return false;
                }
                this.f5571g = true;
                this.f5573i = tresult;
                this.f5570f.notifyAll();
                m5642h();
                MethodCollector.m26664o(4323);
                return true;
            } finally {
                MethodCollector.m26664o(4323);
            }
        }
    }

    /* renamed from: c */
    public final <TContinuationResult> C1731i<TContinuationResult> mo5543c(final AbstractC1729g<TResult, TContinuationResult> gVar, Executor executor) {
        return mo5538b(new AbstractC1729g<TResult, C1731i<TContinuationResult>>() {
            /* class p077b.C1731i.C17354 */

            /* renamed from: a */
            final /* synthetic */ C1726d f5589a = null;

            static {
                Covode.recordClassIndex(1904);
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                C1726d dVar = this.f5589a;
                if (dVar != null && dVar.f5551a.mo5525a()) {
                    return C1731i.f5566e;
                }
                if (iVar.mo5544c()) {
                    return C1731i.m5632a(iVar.mo5546e());
                }
                if (iVar.mo5539b()) {
                    return C1731i.f5566e;
                }
                return iVar.mo5532a(gVar);
            }
        }, executor);
    }

    /* renamed from: b */
    public static <TResult> C1731i<TResult> m5640b(final Callable<TResult> callable, Executor executor) {
        final C1743j jVar = new C1743j();
        try {
            executor.execute(new Runnable() {
                /* class p077b.C1731i.RunnableC17397 */

                /* renamed from: a */
                final /* synthetic */ C1726d f5601a = null;

                static {
                    Covode.recordClassIndex(1908);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: b.j */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    C1726d dVar = this.f5601a;
                    if (dVar == null || !dVar.f5551a.mo5525a()) {
                        try {
                            jVar.mo5557b(callable.call());
                        } catch (CancellationException unused) {
                            jVar.mo5553a();
                        } catch (Exception e) {
                            jVar.mo5556b(e);
                        }
                    } else {
                        jVar.mo5553a();
                    }
                }
            });
        } catch (Exception e) {
            jVar.mo5556b((Exception) new C1730h(e));
        }
        return jVar.f5610a;
    }

    /* renamed from: a */
    public static <TResult> C1731i<TResult> m5636a(Callable<TResult> callable, Executor executor) {
        return m5640b(callable, executor);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: b.i<TResult>, b.i<TContinuationResult> */
    /* renamed from: b */
    public final <TContinuationResult> C1731i<TContinuationResult> mo5538b(final AbstractC1729g<TResult, C1731i<TContinuationResult>> gVar, final Executor executor) {
        boolean a;
        MethodCollector.m26663i(4136);
        final C1743j jVar = new C1743j();
        synchronized (this.f5570f) {
            try {
                a = mo5535a();
                if (!a) {
                    this.f5577m.add(new AbstractC1729g<TResult, Void>() {
                        /* class p077b.C1731i.C17343 */

                        /* renamed from: d */
                        final /* synthetic */ C1726d f5587d = null;

                        static {
                            Covode.recordClassIndex(1903);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Void then(C1731i<TResult> iVar) {
                            C1731i.m5641b(jVar, gVar, iVar, executor, this.f5587d);
                            return null;
                        }
                    });
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(4136);
                throw th;
            }
        }
        if (a) {
            m5641b(jVar, gVar, this, executor, null);
        }
        C1731i iVar = (C1731i<TResult>) jVar.f5610a;
        MethodCollector.m26664o(4136);
        return iVar;
    }

    /* renamed from: a */
    public final <TContinuationResult> C1731i<TContinuationResult> mo5533a(AbstractC1729g<TResult, TContinuationResult> gVar, Executor executor) {
        return mo5534a(gVar, executor, null);
    }

    /* renamed from: b */
    public static <TContinuationResult, TResult> void m5641b(final C1743j<TContinuationResult> jVar, final AbstractC1729g<TResult, C1731i<TContinuationResult>> gVar, final C1731i<TResult> iVar, Executor executor, final C1726d dVar) {
        try {
            executor.execute(new Runnable() {
                /* class p077b.C1731i.RunnableC17376 */

                static {
                    Covode.recordClassIndex(1906);
                }

                public final void run() {
                    C1726d dVar = dVar;
                    if (dVar == null || !dVar.f5551a.mo5525a()) {
                        try {
                            C1731i iVar = (C1731i) gVar.then(iVar);
                            if (iVar == null) {
                                jVar.mo5557b((Object) null);
                            } else {
                                iVar.mo5532a((AbstractC1729g) new AbstractC1729g<TContinuationResult, Void>() {
                                    /* class p077b.C1731i.RunnableC17376.C17381 */

                                    static {
                                        Covode.recordClassIndex(1907);
                                    }

                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: b.j */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // p077b.AbstractC1729g
                                    public final /* synthetic */ Void then(C1731i iVar) {
                                        if (dVar != null && dVar.f5551a.mo5525a()) {
                                            jVar.mo5553a();
                                            return null;
                                        } else if (iVar.mo5539b()) {
                                            jVar.mo5553a();
                                            return null;
                                        } else if (iVar.mo5544c()) {
                                            jVar.mo5556b(iVar.mo5546e());
                                            return null;
                                        } else {
                                            jVar.mo5557b(iVar.mo5545d());
                                            return null;
                                        }
                                    }
                                });
                            }
                        } catch (CancellationException unused) {
                            jVar.mo5553a();
                        } catch (Exception e) {
                            jVar.mo5556b(e);
                        }
                    } else {
                        jVar.mo5553a();
                    }
                }
            });
        } catch (Exception e) {
            jVar.mo5556b(new C1730h(e));
        }
    }

    /* renamed from: a */
    public static <TContinuationResult, TResult> void m5637a(final C1743j<TContinuationResult> jVar, final AbstractC1729g<TResult, TContinuationResult> gVar, final C1731i<TResult> iVar, Executor executor, final C1726d dVar) {
        try {
            executor.execute(new Runnable() {
                /* class p077b.C1731i.RunnableC17365 */

                static {
                    Covode.recordClassIndex(1905);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: b.j */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    C1726d dVar = dVar;
                    if (dVar == null || !dVar.f5551a.mo5525a()) {
                        try {
                            jVar.mo5557b(gVar.then(iVar));
                        } catch (CancellationException unused) {
                            jVar.mo5553a();
                        } catch (Exception e) {
                            jVar.mo5556b(e);
                        }
                    } else {
                        jVar.mo5553a();
                    }
                }
            });
        } catch (Exception e) {
            jVar.mo5556b(new C1730h(e));
        }
    }
}
