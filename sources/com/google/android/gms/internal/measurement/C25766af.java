package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.p1934b.BinderC25327b;

/* renamed from: com.google.android.gms.internal.measurement.af */
final class C25766af extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ Activity f60899c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f60900d;

    /* renamed from: e */
    private final /* synthetic */ C25939f.C25941b f60901e;

    static {
        Covode.recordClassIndex(31181);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        C25939f.this.f61102h.onActivityCreated(BinderC25327b.m48694a(this.f60899c), this.f60900d, this.f61106b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25766af(C25939f.C25941b bVar, Activity activity, Bundle bundle) {
        super(C25939f.this);
        this.f60901e = bVar;
        this.f60899c = activity;
        this.f60900d = bundle;
    }
}
