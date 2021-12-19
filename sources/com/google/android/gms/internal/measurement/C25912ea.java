package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ea */
final class C25912ea extends AbstractC25893di<Map.Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C25913eb f61058a;

    static {
        Covode.recordClassIndex(31327);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: d */
    public final boolean mo42300d() {
        return true;
    }

    public final int size() {
        return this.f61058a.f61060b;
    }

    C25912ea(C25913eb ebVar) {
        this.f61058a = ebVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C25866ci.m50064a(i, this.f61058a.f61060b);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.f61058a.f61059a[i2], this.f61058a.f61059a[i2 + 1]);
    }
}
