package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.p1934b.BinderC25327b;

/* renamed from: com.google.android.gms.internal.measurement.ak */
final class C25771ak extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ Activity f60911c;

    /* renamed from: d */
    private final /* synthetic */ C25939f.C25941b f60912d;

    static {
        Covode.recordClassIndex(31186);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        C25939f.this.f61102h.onActivityDestroyed(BinderC25327b.m48694a(this.f60911c), this.f61106b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25771ak(C25939f.C25941b bVar, Activity activity) {
        super(C25939f.this);
        this.f60912d = bVar;
        this.f60911c = activity;
    }
}
