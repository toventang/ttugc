package com.facebook.common.p1830b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.common.b.h */
public abstract class AbstractRunnableC24073h<T> implements Runnable {

    /* renamed from: a */
    protected final AtomicInteger f57011a = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(28200);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39637a(Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39638a(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo39639b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo39640b(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo39641c();

    /* renamed from: a */
    public final void mo39636a() {
        if (this.f57011a.compareAndSet(0, 2)) {
            mo39639b();
        }
    }

    public final void run() {
        if (this.f57011a.compareAndSet(0, 1)) {
            try {
                T c = mo39641c();
                this.f57011a.set(3);
                try {
                    mo39638a((Object) c);
                } finally {
                    mo39640b(c);
                }
            } catch (Exception e) {
                this.f57011a.set(4);
                mo39637a(e);
            }
        }
    }
}
