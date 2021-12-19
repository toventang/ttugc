package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;

/* renamed from: com.google.android.play.core.assetpacks.ad */
public final class C26770ad implements AbstractC26920bk<C26769ac> {

    /* renamed from: a */
    private final AbstractC26920bk<Context> f63431a;

    /* renamed from: b */
    private final AbstractC26920bk<C26827cg> f63432b;

    static {
        Covode.recordClassIndex(32245);
    }

    public C26770ad(AbstractC26920bk<Context> bkVar, AbstractC26920bk<C26827cg> bkVar2) {
        this.f63431a = bkVar;
        this.f63432b = bkVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26769ac mo44411a() {
        return new C26769ac(C26853df.m53319a(((C26853df) this.f63431a).f63710a), this.f63432b.mo44411a());
    }
}
