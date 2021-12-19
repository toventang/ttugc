package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.ec */
final class C25914ec extends AbstractC25893di<Object> {

    /* renamed from: a */
    private final transient Object[] f61062a;

    /* renamed from: b */
    private final transient int f61063b;

    /* renamed from: c */
    private final transient int f61064c;

    static {
        Covode.recordClassIndex(31329);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: d */
    public final boolean mo42300d() {
        return true;
    }

    public final int size() {
        return this.f61064c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C25866ci.m50064a(i, this.f61064c);
        return this.f61062a[(i * 2) + this.f61063b];
    }

    C25914ec(Object[] objArr, int i, int i2) {
        this.f61062a = objArr;
        this.f61063b = i;
        this.f61064c = i2;
    }
}
