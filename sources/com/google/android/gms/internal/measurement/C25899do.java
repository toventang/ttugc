package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.do */
public class C25899do<K, V> extends AbstractC25879cv<K, V> implements Serializable {

    /* renamed from: a */
    private final transient AbstractC25897dm<K, ? extends AbstractC25894dj<V>> f61041a;

    /* renamed from: b */
    private final transient int f61042b;

    static {
        Covode.recordClassIndex(31314);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25876cs, com.google.android.gms.internal.measurement.AbstractC25906dv
    public final /* synthetic */ Map zza() {
        return this.f61041a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25876cs
    /* renamed from: a */
    public final Map<K, Collection<V>> mo42227a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25876cs
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25876cs
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25876cs
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25876cs
    public final boolean zza(Object obj) {
        if (obj == null || !super.zza(obj)) {
            return false;
        }
        return true;
    }

    C25899do(AbstractC25897dm<K, ? extends AbstractC25894dj<V>> dmVar, int i) {
        this.f61041a = dmVar;
        this.f61042b = i;
    }
}
