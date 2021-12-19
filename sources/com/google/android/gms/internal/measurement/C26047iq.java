package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.iq */
public final class C26047iq extends C26052iv {

    /* renamed from: a */
    private final /* synthetic */ C26042il f61354a;

    static {
        Covode.recordClassIndex(31462);
    }

    @Override // java.util.AbstractCollection, com.google.android.gms.internal.measurement.C26052iv, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C26044in(this.f61354a, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C26047iq(C26042il ilVar) {
        super(ilVar, (byte) 0);
        this.f61354a = ilVar;
    }

    /* synthetic */ C26047iq(C26042il ilVar, byte b) {
        this(ilVar);
    }
}
