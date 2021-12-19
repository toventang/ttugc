package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.p1934b.BinderC25327b;

/* renamed from: com.google.android.gms.internal.measurement.ag */
final class C25767ag extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ Activity f60902c;

    /* renamed from: d */
    private final /* synthetic */ C25939f.C25941b f60903d;

    static {
        Covode.recordClassIndex(31182);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        C25939f.this.f61102h.onActivityPaused(BinderC25327b.m48694a(this.f60902c), this.f61106b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25767ag(C25939f.C25941b bVar, Activity activity) {
        super(C25939f.this);
        this.f60903d = bVar;
        this.f60902c = activity;
    }
}
