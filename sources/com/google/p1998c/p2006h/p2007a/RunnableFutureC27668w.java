package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2006h.p2007a.AbstractC27620b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.c.h.a.w */
final class RunnableFutureC27668w<V> extends AbstractC27620b.AbstractC27629h<V> implements RunnableFuture<V> {

    /* renamed from: a */
    private volatile AbstractRunnableC27653p<?> f65062a;

    static {
        Covode.recordClassIndex(33248);
    }

    /* renamed from: com.google.c.h.a.w$a */
    final class C27669a extends AbstractRunnableC27653p<V> {

        /* renamed from: d */
        private final Callable<V> f65064d;

        static {
            Covode.recordClassIndex(33249);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractRunnableC27653p
        /* renamed from: a */
        public final boolean mo46274a() {
            return RunnableFutureC27668w.this.isDone();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractRunnableC27653p
        /* renamed from: b */
        public final V mo46275b() {
            return this.f65064d.call();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractRunnableC27653p
        /* renamed from: c */
        public final String mo46276c() {
            return this.f65064d.toString();
        }

        C27669a(Callable<V> callable) {
            this.f65064d = (Callable) C27245k.m54229a(callable);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractRunnableC27653p
        /* renamed from: a */
        public final void mo46273a(V v, Throwable th) {
            if (th == null) {
                RunnableFutureC27668w.this.mo46227b((Object) v);
            } else {
                RunnableFutureC27668w.this.mo46226a(th);
            }
        }
    }

    public final void run() {
        AbstractRunnableC27653p<?> pVar = this.f65062a;
        if (pVar != null) {
            pVar.run();
        }
        this.f65062a = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
    /* renamed from: a */
    public final String mo46220a() {
        AbstractRunnableC27653p<?> pVar = this.f65062a;
        if (pVar != null) {
            return "task=[" + pVar + "]";
        }
        return super.mo46220a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
    /* renamed from: b */
    public final void mo46222b() {
        AbstractRunnableC27653p<?> pVar;
        super.mo46222b();
        if (mo46230d() && (pVar = this.f65062a) != null) {
            Runnable runnable = (Runnable) pVar.get();
            if ((runnable instanceof Thread) && pVar.compareAndSet(runnable, AbstractRunnableC27653p.f65050b)) {
                ((Thread) runnable).interrupt();
                pVar.set(AbstractRunnableC27653p.f65049a);
            }
        }
        this.f65062a = null;
    }

    /* renamed from: a */
    static <V> RunnableFutureC27668w<V> m55312a(Callable<V> callable) {
        return new RunnableFutureC27668w<>(callable);
    }

    private RunnableFutureC27668w(Callable<V> callable) {
        this.f65062a = new C27669a(callable);
    }

    /* renamed from: a */
    static <V> RunnableFutureC27668w<V> m55311a(Runnable runnable, V v) {
        return new RunnableFutureC27668w<>(Executors.callable(runnable, v));
    }
}
