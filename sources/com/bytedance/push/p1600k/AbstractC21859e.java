package com.bytedance.push.p1600k;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.push.k.e */
public abstract class AbstractC21859e<T> {

    /* renamed from: a */
    private volatile T f51785a;

    static {
        Covode.recordClassIndex(25511);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract T mo35536e();

    /* renamed from: f */
    public final T mo35537f() {
        if (this.f51785a == null) {
            synchronized (this) {
                if (this.f51785a == null) {
                    this.f51785a = mo35536e();
                }
            }
        }
        return this.f51785a;
    }
}
