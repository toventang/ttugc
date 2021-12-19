package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.bi */
final /* synthetic */ class C25839bi implements AbstractC25837bg {

    /* renamed from: a */
    private final C25840bj f60958a;

    /* renamed from: b */
    private final String f60959b;

    static {
        Covode.recordClassIndex(31254);
    }

    C25839bi(C25840bj bjVar, String str) {
        this.f60958a = bjVar;
        this.f60959b = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25837bg
    /* renamed from: a */
    public final Object mo42196a() {
        C25840bj bjVar = this.f60958a;
        return C25828ay.m50011a(bjVar.f60961a.getContentResolver(), this.f60959b);
    }
}
