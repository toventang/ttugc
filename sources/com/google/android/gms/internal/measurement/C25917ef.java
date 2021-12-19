package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ef */
public final class C25917ef<E> extends AbstractC25901dq<E> {

    /* renamed from: a */
    private final transient E f61073a;

    /* renamed from: b */
    private transient int f61074b;

    static {
        Covode.recordClassIndex(31332);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: d */
    public final boolean mo42300d() {
        return false;
    }

    public final int size() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25901dq
    /* renamed from: e */
    public final boolean mo42328e() {
        if (this.f61074b != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25901dq
    /* renamed from: f */
    public final AbstractC25893di<E> mo42330f() {
        return AbstractC25893di.zza(this.f61073a);
    }

    @Override // java.util.AbstractCollection, com.google.android.gms.internal.measurement.AbstractC25901dq, java.util.Collection, java.util.Set, com.google.android.gms.internal.measurement.AbstractC25894dj, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public final AbstractC25920ei<E> zzb() {
        return new C25907dw(this.f61073a);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25901dq
    public final int hashCode() {
        int i = this.f61074b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f61073a.hashCode();
        this.f61074b = hashCode;
        return hashCode;
    }

    public final String toString() {
        String obj = this.f61073a.toString();
        return new StringBuilder(String.valueOf(obj).length() + 2).append('[').append(obj).append(']').toString();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public final boolean contains(Object obj) {
        return this.f61073a.equals(obj);
    }

    C25917ef(E e) {
        this.f61073a = (E) C25866ci.m50065a(e);
    }

    C25917ef(E e, int i) {
        this.f61073a = e;
        this.f61074b = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: b */
    public final int mo42278b(Object[] objArr, int i) {
        objArr[i] = this.f61073a;
        return i + 1;
    }
}
