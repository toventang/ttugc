package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.cw */
final class C25880cw extends AbstractC25885da<K> {

    /* renamed from: a */
    private final /* synthetic */ C25881cx f61006a;

    static {
        Covode.recordClassIndex(31295);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25880cw(C25881cx cxVar) {
        super(cxVar, (byte) 0);
        this.f61006a = cxVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25885da
    /* renamed from: a */
    public final K mo42239a(int i) {
        return (K) this.f61006a.f61010d[i];
    }
}
