package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.cz */
final class C25883cz extends AbstractC25885da<Map.Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C25881cx f61018a;

    static {
        Covode.recordClassIndex(31298);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25883cz(C25881cx cxVar) {
        super(cxVar, (byte) 0);
        this.f61018a = cxVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25885da
    /* renamed from: a */
    public final /* synthetic */ Object mo42239a(int i) {
        return new C25887dc(this.f61018a, i);
    }
}
