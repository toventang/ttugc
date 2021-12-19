package com.bytedance.zoin.zstd;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: com.bytedance.zoin.zstd.a */
public abstract class AbstractC23755a implements Closeable {

    /* renamed from: a */
    static final AtomicIntegerFieldUpdater<AbstractC23755a> f56210a = AtomicIntegerFieldUpdater.newUpdater(AbstractC23755a.class, "b");

    /* renamed from: b */
    volatile int f56211b;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo39201b();

    AbstractC23755a() {
    }

    static {
        Covode.recordClassIndex(27863);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39216a() {
        int i;
        do {
            i = this.f56211b;
            if (i < 0) {
                throw new IllegalStateException("Closed");
            } else if (i == 0) {
                throw new IllegalStateException("Shared lock underflow");
            }
        } while (!f56210a.compareAndSet(this, i, i - 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f56211b != -1) {
                if (f56210a.compareAndSet(this, 0, -1)) {
                    mo39201b();
                    return;
                }
                throw new IllegalStateException("Attempt to close while in use");
            }
        }
    }
}
