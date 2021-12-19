package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.play.core.b.ba */
final class C26910ba extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f63796a;

    static {
        Covode.recordClassIndex(32385);
    }

    public C26910ba(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f63796a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C26910ba baVar = (C26910ba) obj;
            return this.f63796a == baVar.f63796a && get() == baVar.get();
        }
    }

    public final int hashCode() {
        return this.f63796a;
    }
}
