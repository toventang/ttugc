package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.en */
public final class C25926en extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f61078a;

    static {
        Covode.recordClassIndex(31341);
    }

    public final int hashCode() {
        return this.f61078a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C25926en enVar = (C25926en) obj;
            if (this.f61078a == enVar.f61078a && get() == enVar.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C25926en(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f61078a = System.identityHashCode(th);
    }
}
