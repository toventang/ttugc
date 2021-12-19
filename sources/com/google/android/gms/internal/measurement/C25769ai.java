package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.p1934b.BinderC25327b;

/* renamed from: com.google.android.gms.internal.measurement.ai */
final class C25769ai extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ Activity f60906c;

    /* renamed from: d */
    private final /* synthetic */ BinderC26218ov f60907d;

    /* renamed from: e */
    private final /* synthetic */ C25939f.C25941b f60908e;

    static {
        Covode.recordClassIndex(31184);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        C25939f.this.f61102h.onActivitySaveInstanceState(BinderC25327b.m48694a(this.f60906c), this.f60907d, this.f61106b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25769ai(C25939f.C25941b bVar, Activity activity, BinderC26218ov ovVar) {
        super(C25939f.this);
        this.f60908e = bVar;
        this.f60906c = activity;
        this.f60907d = ovVar;
    }
}
