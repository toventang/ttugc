package com.bytedance.globalpayment.payment.common.lib;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.b */
public abstract class AbstractC15239b<T> {

    /* renamed from: a */
    private volatile T f37168a;

    static {
        Covode.recordClassIndex(17439);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo24697a();

    /* renamed from: b */
    public final T mo24698b() {
        if (this.f37168a == null) {
            synchronized (this) {
                if (this.f37168a == null) {
                    this.f37168a = mo24697a();
                }
            }
        }
        return this.f37168a;
    }
}
