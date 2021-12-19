package com.google.android.gms.internal.p1948g;

import com.bytedance.covode.number.Covode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.g.m */
public final class C25753m extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f60874a;

    static {
        Covode.recordClassIndex(31168);
    }

    public final int hashCode() {
        return this.f60874a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C25753m mVar = (C25753m) obj;
            if (this.f60874a == mVar.f60874a && get() == mVar.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C25753m(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f60874a = System.identityHashCode(th);
    }
}
