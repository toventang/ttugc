package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.p1934b.BinderC25327b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.x */
public final class C26233x extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ int f61643c = 5;

    /* renamed from: d */
    private final /* synthetic */ String f61644d;

    /* renamed from: e */
    private final /* synthetic */ Object f61645e;

    /* renamed from: f */
    private final /* synthetic */ Object f61646f;

    /* renamed from: g */
    private final /* synthetic */ Object f61647g;

    /* renamed from: h */
    private final /* synthetic */ C25939f f61648h;

    static {
        Covode.recordClassIndex(31648);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61648h.f61102h.logHealthData(this.f61643c, this.f61644d, BinderC25327b.m48694a(this.f61645e), BinderC25327b.m48694a(this.f61646f), BinderC25327b.m48694a(this.f61647g));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26233x(C25939f fVar, String str, Object obj) {
        super(false);
        this.f61648h = fVar;
        this.f61644d = str;
        this.f61645e = obj;
    }
}
