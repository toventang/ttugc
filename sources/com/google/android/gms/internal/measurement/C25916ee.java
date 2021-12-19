package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ee */
public final class C25916ee<E> extends AbstractC25901dq<E> {

    /* renamed from: a */
    static final C25916ee<Object> f61067a = new C25916ee<>(new Object[0], 0, null, 0, 0);

    /* renamed from: b */
    private final transient Object[] f61068b;

    /* renamed from: c */
    private final transient Object[] f61069c;

    /* renamed from: d */
    private final transient int f61070d;

    /* renamed from: e */
    private final transient int f61071e;

    /* renamed from: f */
    private final transient int f61072f;

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
    @Override // com.google.android.gms.internal.measurement.AbstractC25901dq
    /* renamed from: e */
    public final boolean mo42328e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: a */
    public final Object[] mo42294a() {
        return this.f61068b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: c */
    public final int mo42298c() {
        return this.f61072f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25901dq
    public final int hashCode() {
        return this.f61071e;
    }

    public final int size() {
        return this.f61072f;
    }

    @Override // java.util.AbstractCollection, com.google.android.gms.internal.measurement.AbstractC25901dq, java.util.Collection, java.util.Set, com.google.android.gms.internal.measurement.AbstractC25894dj, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25901dq
    /* renamed from: f */
    public final AbstractC25893di<E> mo42330f() {
        return AbstractC25893di.m50110a(this.f61068b, this.f61072f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public final AbstractC25920ei<E> zzb() {
        return (AbstractC25920ei) zzc().iterator();
    }

    static {
        Covode.recordClassIndex(31331);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public final boolean contains(Object obj) {
        Object[] objArr = this.f61069c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = C25891dg.m50109a(obj);
        while (true) {
            int i = a & this.f61070d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: b */
    public final int mo42278b(Object[] objArr, int i) {
        System.arraycopy(this.f61068b, 0, objArr, i, this.f61072f);
        return i + this.f61072f;
    }

    C25916ee(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f61068b = objArr;
        this.f61069c = objArr2;
        this.f61070d = i2;
        this.f61071e = i;
        this.f61072f = i3;
    }
}
