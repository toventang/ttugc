package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;

/* renamed from: com.google.android.play.core.assetpacks.bq */
public final class C26810bq implements AbstractC26920bk<C26809bp> {

    /* renamed from: a */
    private final AbstractC26920bk<C26806bm> f63580a;

    /* renamed from: b */
    private final AbstractC26920bk<C26769ac> f63581b;

    /* renamed from: c */
    private final AbstractC26920bk<C26776aj> f63582c;

    static {
        Covode.recordClassIndex(32285);
    }

    public C26810bq(AbstractC26920bk<C26806bm> bkVar, AbstractC26920bk<C26769ac> bkVar2, AbstractC26920bk<C26776aj> bkVar3) {
        this.f63580a = bkVar;
        this.f63581b = bkVar2;
        this.f63582c = bkVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26809bp mo44411a() {
        return new C26809bp(this.f63580a.mo44411a(), this.f63581b.mo44411a(), this.f63582c.mo44411a());
    }
}
