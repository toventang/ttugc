package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.fk */
public final class C25952fk {

    /* renamed from: a */
    public final AbstractC25958fq f61120a;

    /* renamed from: b */
    private final byte[] f61121b;

    static {
        Covode.recordClassIndex(31367);
    }

    /* renamed from: a */
    public final AbstractC25943fb mo42426a() {
        this.f61120a.mo42515b();
        return new C25954fm(this.f61121b);
    }

    private C25952fk(int i) {
        byte[] bArr = new byte[i];
        this.f61121b = bArr;
        this.f61120a = AbstractC25958fq.m50367a(bArr);
    }

    /* synthetic */ C25952fk(int i, byte b) {
        this(i);
    }
}
