package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.cl */
public final class C25869cl<T> extends AbstractC25867cj<T> {

    /* renamed from: a */
    private final T f60995a;

    static {
        Covode.recordClassIndex(31284);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25867cj
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25867cj
    public final T zzb() {
        return this.f60995a;
    }

    public final int hashCode() {
        return this.f60995a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f60995a);
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append("Optional.of(").append(valueOf).append(")").toString();
    }

    C25869cl(T t) {
        this.f60995a = t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25869cl) {
            return this.f60995a.equals(((C25869cl) obj).f60995a);
        }
        return false;
    }
}
