package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.ax.a.af */
public final class C34307af<T> implements AbstractC34339l<T> {

    /* renamed from: a */
    private WeakReference<T> f81147a;

    static {
        Covode.recordClassIndex(41251);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34339l
    /* renamed from: a */
    public final T mo60751a() {
        WeakReference<T> weakReference = this.f81147a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34339l
    /* renamed from: b */
    public final void mo60752b() {
        WeakReference<T> weakReference = this.f81147a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f81147a = null;
    }

    public C34307af(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f81147a = weakReference;
    }
}
