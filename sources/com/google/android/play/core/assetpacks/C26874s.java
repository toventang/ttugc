package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;

/* renamed from: com.google.android.play.core.assetpacks.s */
public final class C26874s implements AbstractC26920bk<C26873r> {

    /* renamed from: a */
    private final AbstractC26920bk<Context> f63758a;

    /* renamed from: b */
    private final AbstractC26920bk<C26791ay> f63759b;

    static {
        Covode.recordClassIndex(32349);
    }

    public C26874s(AbstractC26920bk<Context> bkVar, AbstractC26920bk<C26791ay> bkVar2) {
        this.f63758a = bkVar;
        this.f63759b = bkVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26873r mo44411a() {
        return new C26873r(C26853df.m53319a(((C26853df) this.f63758a).f63710a), this.f63759b.mo44411a());
    }
}
