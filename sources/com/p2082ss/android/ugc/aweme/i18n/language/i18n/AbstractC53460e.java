package com.p2082ss.android.ugc.aweme.i18n.language.i18n;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.i18n.e */
public abstract class AbstractC53460e<T> {

    /* renamed from: a */
    private T f122698a;

    static {
        Covode.recordClassIndex(63030);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo90027a();

    /* renamed from: b */
    public final T mo90028b() {
        T t;
        synchronized (this) {
            if (this.f122698a == null) {
                this.f122698a = mo90027a();
            }
            t = this.f122698a;
        }
        return t;
    }
}
