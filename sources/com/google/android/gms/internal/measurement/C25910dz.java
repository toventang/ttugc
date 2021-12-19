package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.dz */
public final class C25910dz<E> extends AbstractC25893di<E> {

    /* renamed from: a */
    static final AbstractC25893di<Object> f61055a = new C25910dz(new Object[0], 0);

    /* renamed from: b */
    private final transient Object[] f61056b;

    /* renamed from: c */
    private final transient int f61057c;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: b */
    public final int mo42297b() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: d */
    public final boolean mo42300d() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: a */
    public final Object[] mo42294a() {
        return this.f61056b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: c */
    public final int mo42298c() {
        return this.f61057c;
    }

    public final int size() {
        return this.f61057c;
    }

    static {
        Covode.recordClassIndex(31325);
    }

    @Override // java.util.List
    public final E get(int i) {
        C25866ci.m50064a(i, this.f61057c);
        return (E) this.f61056b[i];
    }

    C25910dz(Object[] objArr, int i) {
        this.f61056b = objArr;
        this.f61057c = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj, com.google.android.gms.internal.measurement.AbstractC25893di
    /* renamed from: b */
    public final int mo42278b(Object[] objArr, int i) {
        System.arraycopy(this.f61056b, 0, objArr, i, this.f61057c);
        return i + this.f61057c;
    }
}
