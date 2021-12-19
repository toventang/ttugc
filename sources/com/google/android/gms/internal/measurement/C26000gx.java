package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.gx */
final class C26000gx<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    Map.Entry<K, C25998gv> f61270a;

    static {
        Covode.recordClassIndex(31415);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f61270a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f61270a.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    private C26000gx(Map.Entry<K, C25998gv> entry) {
        this.f61270a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof AbstractC26020hq) {
            C25998gv value = this.f61270a.getValue();
            AbstractC26020hq hqVar = value.f61276b;
            value.f61275a = null;
            value.f61277c = null;
            value.f61276b = (AbstractC26020hq) obj;
            return hqVar;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    /* synthetic */ C26000gx(Map.Entry entry, byte b) {
        this(entry);
    }
}
