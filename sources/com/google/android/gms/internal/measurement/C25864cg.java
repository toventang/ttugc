package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.cg */
public final class C25864cg<T> extends AbstractC25867cj<T> {

    /* renamed from: a */
    static final C25864cg<Object> f60994a = new C25864cg<>();

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25867cj
    public final boolean zza() {
        return false;
    }

    private C25864cg() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25867cj
    public final T zzb() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    static {
        Covode.recordClassIndex(31279);
    }
}
