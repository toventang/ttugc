package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25335a.AbstractC25339d;
import com.google.android.gms.common.api.C25354h;
import com.google.android.gms.common.api.internal.C25446d;

/* renamed from: com.google.android.gms.common.api.internal.bf */
public final class C25396bf<O extends C25335a.AbstractC25339d> extends C25364aa {

    /* renamed from: b */
    private final C25354h<O> f60269b;

    static {
        Covode.recordClassIndex(30795);
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: a */
    public final void mo41522a(C25412bv bvVar) {
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: b */
    public final void mo41528b(C25412bv bvVar) {
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: b */
    public final Context mo41525b() {
        return this.f60269b.f60118a;
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: c */
    public final Looper mo41529c() {
        return this.f60269b.f60122e;
    }

    public C25396bf(C25354h<O> hVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f60269b = hVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: a */
    public final <A extends C25335a.AbstractC25337b, R extends AbstractC25485p, T extends C25446d.AbstractC25447a<R, A>> T mo41518a(T t) {
        return (T) this.f60269b.mo41509a(t);
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: b */
    public final <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41526b(T t) {
        return (T) this.f60269b.mo41511b(t);
    }
}
