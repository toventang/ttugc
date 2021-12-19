package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26918bi;

/* renamed from: com.google.android.play.core.assetpacks.ck */
public final class C26831ck implements AbstractC26920bk<C26830cj> {

    /* renamed from: a */
    private final AbstractC26920bk<C26769ac> f63650a;

    /* renamed from: b */
    private final AbstractC26920bk<AbstractC26857dj> f63651b;

    static {
        Covode.recordClassIndex(32306);
    }

    public C26831ck(AbstractC26920bk<C26769ac> bkVar, AbstractC26920bk<AbstractC26857dj> bkVar2) {
        this.f63650a = bkVar;
        this.f63651b = bkVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26830cj mo44411a() {
        return new C26830cj(this.f63650a.mo44411a(), C26918bi.m53471b(this.f63651b));
    }
}
