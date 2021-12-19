package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ad */
public final class C25764ad extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ Long f60890c = null;

    /* renamed from: d */
    private final /* synthetic */ String f60891d;

    /* renamed from: e */
    private final /* synthetic */ String f60892e;

    /* renamed from: f */
    private final /* synthetic */ Bundle f60893f;

    /* renamed from: g */
    private final /* synthetic */ boolean f60894g;

    /* renamed from: h */
    private final /* synthetic */ boolean f60895h;

    /* renamed from: i */
    private final /* synthetic */ C25939f f60896i;

    static {
        Covode.recordClassIndex(31179);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        long longValue;
        Long l = this.f60890c;
        if (l == null) {
            longValue = this.f61105a;
        } else {
            longValue = l.longValue();
        }
        this.f60896i.f61102h.logEvent(this.f60891d, this.f60892e, this.f60893f, this.f60894g, this.f60895h, longValue);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25764ad(C25939f fVar, String str, String str2, Bundle bundle, boolean z) {
        super(fVar);
        this.f60896i = fVar;
        this.f60891d = str;
        this.f60892e = str2;
        this.f60893f = bundle;
        this.f60894g = z;
        this.f60895h = true;
    }
}
