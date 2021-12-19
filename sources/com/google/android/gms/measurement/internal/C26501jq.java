package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.jq */
public final class C26501jq implements AbstractC26356eh {

    /* renamed from: a */
    private final /* synthetic */ String f62383a;

    /* renamed from: b */
    private final /* synthetic */ C26498jo f62384b;

    static {
        Covode.recordClassIndex(31923);
    }

    C26501jq(C26498jo joVar, String str) {
        this.f62384b = joVar;
        this.f62383a = str;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26356eh
    /* renamed from: a */
    public final void mo43180a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f62384b.mo43463a(i, th, bArr);
    }
}
