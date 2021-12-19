package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.cj */
public abstract class AbstractC25867cj<T> implements Serializable {
    static {
        Covode.recordClassIndex(31282);
    }

    public abstract boolean zza();

    public abstract T zzb();

    AbstractC25867cj() {
    }

    public static <T> AbstractC25867cj<T> zzc() {
        return C25864cg.f60994a;
    }

    public static <T> AbstractC25867cj<T> zza(T t) {
        return new C25869cl(C25866ci.m50065a(t));
    }
}
