package com.p2082ss.android.p2141e;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.e.c */
public abstract class AbstractC29907c<T> {

    /* renamed from: a */
    private volatile T f71343a;

    static {
        Covode.recordClassIndex(36318);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo52218a();

    /* renamed from: b */
    public final T mo52219b() {
        if (this.f71343a == null) {
            synchronized (this) {
                if (this.f71343a == null) {
                    this.f71343a = mo52218a();
                }
            }
        }
        return this.f71343a;
    }
}
