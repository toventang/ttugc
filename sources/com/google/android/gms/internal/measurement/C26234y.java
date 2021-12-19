package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.y */
public final class C26234y extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ String f61649c;

    /* renamed from: d */
    private final /* synthetic */ String f61650d;

    /* renamed from: e */
    private final /* synthetic */ boolean f61651e;

    /* renamed from: f */
    private final /* synthetic */ BinderC26218ov f61652f;

    /* renamed from: g */
    private final /* synthetic */ C25939f f61653g;

    static {
        Covode.recordClassIndex(31649);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: a */
    public final void mo42003a() {
        this.f61652f.mo42912a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61653g.f61102h.getUserProperties(this.f61649c, this.f61650d, this.f61651e, this.f61652f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26234y(C25939f fVar, String str, String str2, boolean z, BinderC26218ov ovVar) {
        super(fVar);
        this.f61653g = fVar;
        this.f61649c = str;
        this.f61650d = str2;
        this.f61651e = z;
        this.f61652f = ovVar;
    }
}
