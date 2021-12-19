package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25632i;

/* renamed from: com.google.android.gms.common.api.internal.v */
final class C25472v implements AbstractC25626c<TResult> {

    /* renamed from: a */
    private final /* synthetic */ C25632i f60462a;

    /* renamed from: b */
    private final /* synthetic */ C25441cv f60463b;

    static {
        Covode.recordClassIndex(30871);
    }

    @Override // com.google.android.gms.p1940d.AbstractC25626c
    /* renamed from: a */
    public final void mo36732a(AbstractC25631h<TResult> hVar) {
        this.f60463b.f60386b.remove(this.f60462a);
    }

    C25472v(C25441cv cvVar, C25632i iVar) {
        this.f60463b = cvVar;
        this.f60462a = iVar;
    }
}
