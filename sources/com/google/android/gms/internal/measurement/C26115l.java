package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.p1934b.BinderC25327b;

/* renamed from: com.google.android.gms.internal.measurement.l */
public final class C26115l extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ Activity f61493c;

    /* renamed from: d */
    private final /* synthetic */ String f61494d;

    /* renamed from: e */
    private final /* synthetic */ String f61495e;

    /* renamed from: f */
    private final /* synthetic */ C25939f f61496f;

    static {
        Covode.recordClassIndex(31530);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61496f.f61102h.setCurrentScreen(BinderC25327b.m48694a(this.f61493c), this.f61494d, this.f61495e, this.f61105a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26115l(C25939f fVar, Activity activity, String str, String str2) {
        super(fVar);
        this.f61496f = fVar;
        this.f61493c = activity;
        this.f61494d = str;
        this.f61495e = str2;
    }
}
