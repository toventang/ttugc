package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2006h.p2007a.AbstractC27620b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.c.h.a.o */
abstract class AbstractC27650o<V> extends AbstractC27641h<V> {

    /* renamed from: a */
    private static final Logger f65046a = Logger.getLogger(AbstractC27650o.class.getName());

    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.o$b */
    public static class C27652b<V> extends AbstractC27650o<V> {

        /* renamed from: a */
        static final C27652b<Object> f65047a = new C27652b<>(null);

        /* renamed from: b */
        private final V f65048b;

        @Override // java.util.concurrent.Future, com.google.p1998c.p2006h.p2007a.AbstractC27650o
        public final V get() {
            return this.f65048b;
        }

        static {
            Covode.recordClassIndex(33232);
        }

        public final String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + ((Object) this.f65048b) + "]]";
        }

        C27652b(V v) {
            this.f65048b = v;
        }
    }

    AbstractC27650o() {
    }

    static {
        Covode.recordClassIndex(33230);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.o$a */
    public static final class C27651a<V> extends AbstractC27620b.AbstractC27629h<V> {
        static {
            Covode.recordClassIndex(33231);
        }

        C27651a(Throwable th) {
            mo46226a(th);
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        C27245k.m54229a(timeUnit);
        return get();
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q
    /* renamed from: a */
    public final void mo5481a(Runnable runnable, Executor executor) {
        C27245k.m54230a(runnable, "Runnable was null.");
        C27245k.m54230a(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f65046a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }
}
