package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: org.greenrobot.eventbus.v */
public final class C90269v {

    /* renamed from: a */
    final Object f205057a;

    /* renamed from: b */
    final C90266t f205058b;

    /* renamed from: c */
    volatile boolean f205059c = true;

    static {
        Covode.recordClassIndex(106540);
    }

    public final int hashCode() {
        return this.f205057a.hashCode() + this.f205058b.f205042h.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C90269v) {
            C90269v vVar = (C90269v) obj;
            if (this.f205057a != vVar.f205057a || !this.f205058b.equals(vVar.f205058b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    C90269v(Object obj, C90266t tVar) {
        this.f205057a = obj;
        this.f205058b = tVar;
    }
}
