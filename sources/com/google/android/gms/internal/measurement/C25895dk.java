package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.dk */
public final class C25895dk<E> extends AbstractC25893di<E> {

    /* renamed from: a */
    private final transient AbstractC25893di<E> f61032a;

    static {
        Covode.recordClassIndex(31310);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25893di
    public final AbstractC25893di<E> zzd() {
        return this.f61032a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: d */
    public final boolean mo42300d() {
        return this.f61032a.mo42300d();
    }

    public final int size() {
        return this.f61032a.size();
    }

    C25895dk(AbstractC25893di<E> diVar) {
        this.f61032a = diVar;
    }

    /* renamed from: a */
    private final int m50117a(int i) {
        return (size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj, com.google.android.gms.internal.measurement.AbstractC25893di
    public final boolean contains(Object obj) {
        return this.f61032a.contains(obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25893di
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f61032a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return m50117a(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25893di
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f61032a.indexOf(obj);
        if (indexOf >= 0) {
            return m50117a(indexOf);
        }
        return -1;
    }

    @Override // java.util.List
    public final E get(int i) {
        C25866ci.m50064a(i, size());
        return this.f61032a.get(m50117a(i));
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25893di
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25893di
    public final AbstractC25893di<E> zza(int i, int i2) {
        C25866ci.m50068a(i, i2, size());
        return ((AbstractC25893di) this.f61032a.subList(size() - i2, size() - i)).zzd();
    }
}
