package com.bytedance.android.livesdk.util.rxutils;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.AbstractC88409ah;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.AbstractC88978s;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88985y;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.a */
public final class C11121a<T> implements AbstractC88409ah<T, T>, AbstractC88978s<T, T>, AbstractC88985y<T, T> {

    /* renamed from: a */
    C88411a f26734a;

    static {
        Covode.recordClassIndex(12746);
    }

    public C11121a(C88411a aVar) {
        this.f26734a = aVar;
    }

    @Override // p4560f.p4561a.AbstractC88409ah
    /* renamed from: a */
    public final AbstractC88408ag<T> mo17919a(AbstractC88403ab<T> abVar) {
        return abVar.mo142913a((AbstractC88433f<? super AbstractC88412b>) new C11188c(this));
    }

    @Override // p4560f.p4561a.AbstractC88978s
    /* renamed from: a */
    public final AbstractC88977r<T> mo17920a(AbstractC88973n<T> nVar) {
        return nVar.mo143247c(new C11189d(this));
    }

    @Override // p4560f.p4561a.AbstractC88985y
    /* renamed from: a */
    public final AbstractC88984x<T> mo17921a(AbstractC88979t<T> tVar) {
        return tVar.mo143285c(new C11182b(this));
    }
}
