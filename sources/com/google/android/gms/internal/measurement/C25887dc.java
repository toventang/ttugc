package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.dc */
final class C25887dc extends AbstractC25877ct<K, V> {

    /* renamed from: a */
    private final K f61024a;

    /* renamed from: b */
    private int f61025b;

    /* renamed from: c */
    private final /* synthetic */ C25881cx f61026c;

    static {
        Covode.recordClassIndex(31302);
    }

    @Override // java.util.Map.Entry, com.google.android.gms.internal.measurement.AbstractC25877ct
    public final K getKey() {
        return this.f61024a;
    }

    /* renamed from: a */
    private final void m50101a() {
        int i = this.f61025b;
        if (i == -1 || i >= this.f61026c.size() || !C25865ch.m50063a(this.f61024a, this.f61026c.f61010d[this.f61025b])) {
            this.f61025b = this.f61026c.mo42241a(this.f61024a);
        }
    }

    @Override // java.util.Map.Entry, com.google.android.gms.internal.measurement.AbstractC25877ct
    public final V getValue() {
        Map b = this.f61026c.mo42245b();
        if (b != null) {
            return (V) b.get(this.f61024a);
        }
        m50101a();
        if (this.f61025b == -1) {
            return null;
        }
        return (V) this.f61026c.f61011e[this.f61025b];
    }

    @Override // java.util.Map.Entry, com.google.android.gms.internal.measurement.AbstractC25877ct
    public final V setValue(V v) {
        Map b = this.f61026c.mo42245b();
        if (b != null) {
            return (V) b.put(this.f61024a, v);
        }
        m50101a();
        if (this.f61025b == -1) {
            this.f61026c.put(this.f61024a, v);
            return null;
        }
        V v2 = (V) this.f61026c.f61011e[this.f61025b];
        this.f61026c.f61011e[this.f61025b] = v;
        return v2;
    }

    C25887dc(C25881cx cxVar, int i) {
        this.f61026c = cxVar;
        this.f61024a = (K) cxVar.f61010d[i];
        this.f61025b = i;
    }
}
