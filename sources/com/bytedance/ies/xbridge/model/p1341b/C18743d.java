package com.bytedance.ies.xbridge.model.p1341b;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ies.xbridge.model.b.d */
public final class C18743d<T> implements AbstractC18740a<T> {

    /* renamed from: a */
    private WeakReference<T> f44527a;

    static {
        Covode.recordClassIndex(21437);
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18409e
    /* renamed from: a */
    public final void mo29439a() {
        WeakReference<T> weakReference = this.f44527a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f44527a = null;
    }

    @Override // com.bytedance.ies.xbridge.model.p1341b.AbstractC18740a
    /* renamed from: b */
    public final T mo29768b() {
        WeakReference<T> weakReference = this.f44527a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C18743d(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f44527a = weakReference;
    }
}
