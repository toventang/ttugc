package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.p1934b.BinderC25327b;

/* renamed from: com.google.android.gms.internal.measurement.ac */
public final class C25763ac extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ String f60885c;

    /* renamed from: d */
    private final /* synthetic */ String f60886d;

    /* renamed from: e */
    private final /* synthetic */ Object f60887e;

    /* renamed from: f */
    private final /* synthetic */ boolean f60888f = true;

    /* renamed from: g */
    private final /* synthetic */ C25939f f60889g;

    static {
        Covode.recordClassIndex(31178);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f60889g.f61102h.setUserProperty(this.f60885c, this.f60886d, BinderC25327b.m48694a(this.f60887e), this.f60888f, this.f61105a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25763ac(C25939f fVar, String str, String str2, Object obj) {
        super(fVar);
        this.f60889g = fVar;
        this.f60885c = str;
        this.f60886d = str2;
        this.f60887e = obj;
    }
}
