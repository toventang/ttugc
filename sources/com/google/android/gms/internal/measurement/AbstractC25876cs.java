package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.cs */
abstract class AbstractC25876cs<K, V> implements AbstractC25906dv<K, V> {

    /* renamed from: a */
    private transient Map<K, Collection<V>> f61005a;

    static {
        Covode.recordClassIndex(31291);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Map<K, Collection<V>> mo42227a();

    AbstractC25876cs() {
    }

    public int hashCode() {
        return zza().hashCode();
    }

    public String toString() {
        return zza().toString();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25906dv
    public Map<K, Collection<V>> zza() {
        Map<K, Collection<V>> map = this.f61005a;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> a = mo42227a();
        this.f61005a = a;
        return a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25906dv) {
            return zza().equals(((AbstractC25906dv) obj).zza());
        }
        return false;
    }

    public boolean zza(Object obj) {
        for (Collection<V> collection : zza().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
