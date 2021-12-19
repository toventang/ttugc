package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.dl */
final class C25896dl<E> extends AbstractC25874cq<E> {

    /* renamed from: a */
    private final AbstractC25893di<E> f61033a;

    static {
        Covode.recordClassIndex(31311);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC25874cq
    /* renamed from: a */
    public final E mo42217a(int i) {
        return this.f61033a.get(i);
    }

    C25896dl(AbstractC25893di<E> diVar, int i) {
        super(diVar.size(), i);
        this.f61033a = diVar;
    }
}
