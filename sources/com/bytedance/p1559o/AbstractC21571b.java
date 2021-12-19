package com.bytedance.p1559o;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.o.b */
public abstract class AbstractC21571b<T> {

    /* renamed from: a */
    private volatile T f51171a;

    static {
        Covode.recordClassIndex(25212);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo35237b();

    /* renamed from: a */
    public final T mo35236a() {
        if (this.f51171a == null) {
            synchronized (this) {
                if (this.f51171a == null) {
                    this.f51171a = mo35237b();
                }
            }
        }
        return this.f51171a;
    }
}
