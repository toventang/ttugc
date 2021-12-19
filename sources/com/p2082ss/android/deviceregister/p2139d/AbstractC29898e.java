package com.p2082ss.android.deviceregister.p2139d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.deviceregister.d.e */
public abstract class AbstractC29898e<T> {

    /* renamed from: a */
    private volatile T f71335a;

    static {
        Covode.recordClassIndex(36308);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo52170a(Object... objArr);

    /* renamed from: b */
    public final T mo52185b(Object... objArr) {
        if (this.f71335a == null) {
            synchronized (this) {
                if (this.f71335a == null) {
                    this.f71335a = mo52170a(objArr);
                }
            }
        }
        return this.f71335a;
    }
}
