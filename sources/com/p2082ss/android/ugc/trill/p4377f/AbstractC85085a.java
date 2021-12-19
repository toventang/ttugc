package com.p2082ss.android.ugc.trill.p4377f;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.trill.f.a */
public abstract class AbstractC85085a<T> {

    /* renamed from: a */
    private T f190370a;

    static {
        Covode.recordClassIndex(99108);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo130028a();

    /* renamed from: b */
    public final T mo130029b() {
        T t;
        synchronized (this) {
            if (this.f190370a == null) {
                this.f190370a = mo130028a();
            }
            t = this.f190370a;
        }
        return t;
    }
}
