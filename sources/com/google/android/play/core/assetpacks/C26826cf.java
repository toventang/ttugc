package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26918bi;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.cf */
public final class C26826cf implements AbstractC26920bk<C26825ce> {

    /* renamed from: a */
    private final AbstractC26920bk<C26769ac> f63630a;

    /* renamed from: b */
    private final AbstractC26920bk<AbstractC26857dj> f63631b;

    /* renamed from: c */
    private final AbstractC26920bk<C26806bm> f63632c;

    /* renamed from: d */
    private final AbstractC26920bk<Executor> f63633d;

    /* renamed from: e */
    private final AbstractC26920bk<C26791ay> f63634e;

    static {
        Covode.recordClassIndex(32301);
    }

    public C26826cf(AbstractC26920bk<C26769ac> bkVar, AbstractC26920bk<AbstractC26857dj> bkVar2, AbstractC26920bk<C26806bm> bkVar3, AbstractC26920bk<Executor> bkVar4, AbstractC26920bk<C26791ay> bkVar5) {
        this.f63630a = bkVar;
        this.f63631b = bkVar2;
        this.f63632c = bkVar3;
        this.f63633d = bkVar4;
        this.f63634e = bkVar5;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26825ce mo44411a() {
        C26769ac a = this.f63630a.mo44411a();
        return new C26825ce(a, C26918bi.m53471b(this.f63631b), this.f63632c.mo44411a(), C26918bi.m53471b(this.f63633d), this.f63634e.mo44411a());
    }
}
