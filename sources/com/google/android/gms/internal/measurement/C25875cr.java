package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.cr */
public final class C25875cr<T> implements AbstractC25871cn<T>, Serializable {

    /* renamed from: a */
    private final T f61004a;

    static {
        Covode.recordClassIndex(31290);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25871cn
    /* renamed from: a */
    public final T mo42201a() {
        return this.f61004a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f61004a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f61004a);
        return new StringBuilder(String.valueOf(valueOf).length() + 22).append("Suppliers.ofInstance(").append(valueOf).append(")").toString();
    }

    C25875cr(T t) {
        this.f61004a = t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25875cr) {
            return C25865ch.m50063a(this.f61004a, ((C25875cr) obj).f61004a);
        }
        return false;
    }
}
