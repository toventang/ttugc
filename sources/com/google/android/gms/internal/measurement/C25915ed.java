package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ed */
final class C25915ed<K> extends AbstractC25901dq<K> {

    /* renamed from: a */
    private final transient AbstractC25897dm<K, ?> f61065a;

    /* renamed from: b */
    private final transient AbstractC25893di<K> f61066b;

    static {
        Covode.recordClassIndex(31330);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: d */
    public final boolean mo42300d() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25901dq, com.google.android.gms.internal.measurement.AbstractC25894dj
    public final AbstractC25893di<K> zzc() {
        return this.f61066b;
    }

    @Override // java.util.AbstractCollection, com.google.android.gms.internal.measurement.AbstractC25901dq, java.util.Collection, java.util.Set, com.google.android.gms.internal.measurement.AbstractC25894dj, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public final int size() {
        return this.f61065a.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public final AbstractC25920ei<K> zzb() {
        return (AbstractC25920ei) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public final boolean contains(Object obj) {
        if (this.f61065a.get(obj) != null) {
            return true;
        }
        return false;
    }

    C25915ed(AbstractC25897dm<K, ?> dmVar, AbstractC25893di<K> diVar) {
        this.f61065a = dmVar;
        this.f61066b = diVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: b */
    public final int mo42278b(Object[] objArr, int i) {
        return zzc().mo42278b(objArr, i);
    }
}
