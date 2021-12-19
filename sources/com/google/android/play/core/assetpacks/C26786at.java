package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26918bi;

/* renamed from: com.google.android.play.core.assetpacks.at */
public final class C26786at implements AbstractC26920bk<C26785as> {

    /* renamed from: a */
    private final AbstractC26920bk<C26769ac> f63501a;

    /* renamed from: b */
    private final AbstractC26920bk<AbstractC26857dj> f63502b;

    /* renamed from: c */
    private final AbstractC26920bk<C26878w> f63503c;

    /* renamed from: d */
    private final AbstractC26920bk<C26791ay> f63504d;

    static {
        Covode.recordClassIndex(32261);
    }

    public C26786at(AbstractC26920bk<C26769ac> bkVar, AbstractC26920bk<AbstractC26857dj> bkVar2, AbstractC26920bk<C26878w> bkVar3, AbstractC26920bk<C26791ay> bkVar4) {
        this.f63501a = bkVar;
        this.f63502b = bkVar2;
        this.f63503c = bkVar3;
        this.f63504d = bkVar4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26785as mo44411a() {
        return new C26785as(this.f63501a.mo44411a(), C26918bi.m53471b(this.f63502b), C26918bi.m53471b(this.f63503c), this.f63504d.mo44411a());
    }
}
