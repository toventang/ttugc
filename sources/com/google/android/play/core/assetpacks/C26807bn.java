package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26918bi;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.bn */
public final class C26807bn implements AbstractC26920bk<C26806bm> {

    /* renamed from: a */
    private final AbstractC26920bk<C26769ac> f63570a;

    /* renamed from: b */
    private final AbstractC26920bk<AbstractC26857dj> f63571b;

    /* renamed from: c */
    private final AbstractC26920bk<C26791ay> f63572c;

    /* renamed from: d */
    private final AbstractC26920bk<Executor> f63573d;

    static {
        Covode.recordClassIndex(32282);
    }

    public C26807bn(AbstractC26920bk<C26769ac> bkVar, AbstractC26920bk<AbstractC26857dj> bkVar2, AbstractC26920bk<C26791ay> bkVar3, AbstractC26920bk<Executor> bkVar4) {
        this.f63570a = bkVar;
        this.f63571b = bkVar2;
        this.f63572c = bkVar3;
        this.f63573d = bkVar4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26806bm mo44411a() {
        C26769ac a = this.f63570a.mo44411a();
        return new C26806bm(a, C26918bi.m53471b(this.f63571b), this.f63572c.mo44411a(), C26918bi.m53471b(this.f63573d));
    }
}
