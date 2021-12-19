package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.AbstractC27533u;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.c.h.a.i */
public abstract class AbstractFutureC27642i<V> extends AbstractC27533u implements Future<V> {
    static {
        Covode.recordClassIndex(33222);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Future<? extends V> mo45371c();

    protected AbstractFutureC27642i() {
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return (V) mo45371c().get();
    }

    public boolean isCancelled() {
        return mo45371c().isCancelled();
    }

    public boolean isDone() {
        return mo45371c().isDone();
    }

    public boolean cancel(boolean z) {
        return mo45371c().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return (V) mo45371c().get(j, timeUnit);
    }
}
