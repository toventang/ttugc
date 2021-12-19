package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.eb */
final class C25913eb<K, V> extends AbstractC25901dq<Map.Entry<K, V>> {

    /* renamed from: a */
    final transient Object[] f61059a;

    /* renamed from: b */
    final transient int f61060b;

    /* renamed from: c */
    private final transient AbstractC25897dm<K, V> f61061c;

    static {
        Covode.recordClassIndex(31328);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: d */
    public final boolean mo42300d() {
        return true;
    }

    public final int size() {
        return this.f61060b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25901dq
    /* renamed from: f */
    public final AbstractC25893di<Map.Entry<K, V>> mo42330f() {
        return new C25912ea(this);
    }

    @Override // java.util.AbstractCollection, com.google.android.gms.internal.measurement.AbstractC25901dq, java.util.Collection, java.util.Set, com.google.android.gms.internal.measurement.AbstractC25894dj, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public final AbstractC25920ei<Map.Entry<K, V>> zzb() {
        return (AbstractC25920ei) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f61061c.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: b */
    public final int mo42278b(Object[] objArr, int i) {
        return zzc().mo42278b(objArr, i);
    }

    C25913eb(AbstractC25897dm<K, V> dmVar, Object[] objArr, int i) {
        this.f61061c = dmVar;
        this.f61059a = objArr;
        this.f61060b = i;
    }
}
