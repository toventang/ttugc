package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.iu */
public final class C26051iu implements Comparable<C26051iu>, Map.Entry<K, V> {

    /* renamed from: a */
    private final K f61359a;

    /* renamed from: b */
    private V f61360b;

    /* renamed from: c */
    private final /* synthetic */ C26042il f61361c;

    static {
        Covode.recordClassIndex(31466);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f61359a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f61360b;
    }

    public final int hashCode() {
        int hashCode;
        K k = this.f61359a;
        int i = 0;
        if (k == null) {
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
        }
        V v = this.f61360b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f61359a);
        String valueOf2 = String.valueOf(this.f61360b);
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f61361c.mo42718e();
        V v2 = this.f61360b;
        this.f61360b = v;
        return v2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C26051iu iuVar) {
        return ((Comparable) getKey()).compareTo(iuVar.getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!m50892a(this.f61359a, entry.getKey()) || !m50892a(this.f61360b, entry.getValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m50892a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    C26051iu(C26042il ilVar, Map.Entry<K, V> entry) {
        this(ilVar, entry.getKey(), entry.getValue());
    }

    C26051iu(C26042il ilVar, K k, V v) {
        this.f61361c = ilVar;
        this.f61359a = k;
        this.f61360b = v;
    }
}
