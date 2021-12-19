package com.bytedance.ies.bullet.p1129c.p1136e.p1137a;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ies.bullet.c.e.a.d */
public final class C16250d<T> implements AbstractC16249c<T> {

    /* renamed from: a */
    private WeakReference<T> f39039a;

    static {
        Covode.recordClassIndex(18543);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        WeakReference<T> weakReference = this.f39039a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f39039a = null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.p1137a.AbstractC16249c
    /* renamed from: b */
    public final T mo25823b() {
        WeakReference<T> weakReference = this.f39039a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C16250d(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f39039a = weakReference;
    }
}
