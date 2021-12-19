package com.p2082ss.android.ugc.aweme.i18n.p3062a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.i18n.a.b */
public abstract class AbstractC53435b<T> {

    /* renamed from: a */
    private T f122649a;

    static {
        Covode.recordClassIndex(63004);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo90003a();

    /* renamed from: b */
    public final T mo90004b() {
        T t;
        synchronized (this) {
            t = this.f122649a;
            if (t == null) {
                t = mo90003a();
                this.f122649a = t;
            }
        }
        return t;
    }
}
