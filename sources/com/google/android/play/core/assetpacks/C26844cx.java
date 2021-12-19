package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26918bi;
import com.google.android.play.core.p1966e.C27006al;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.cx */
public final class C26844cx implements AbstractC26920bk<C26843cw> {

    /* renamed from: a */
    private final AbstractC26920bk<C26769ac> f63693a;

    /* renamed from: b */
    private final AbstractC26920bk<AbstractC26857dj> f63694b;

    /* renamed from: c */
    private final AbstractC26920bk<C26878w> f63695c;

    /* renamed from: d */
    private final AbstractC26920bk<C27006al> f63696d;

    /* renamed from: e */
    private final AbstractC26920bk<C26806bm> f63697e;

    /* renamed from: f */
    private final AbstractC26920bk<C26791ay> f63698f;

    /* renamed from: g */
    private final AbstractC26920bk<C26779am> f63699g;

    /* renamed from: h */
    private final AbstractC26920bk<Executor> f63700h;

    static {
        Covode.recordClassIndex(32319);
    }

    public C26844cx(AbstractC26920bk<C26769ac> bkVar, AbstractC26920bk<AbstractC26857dj> bkVar2, AbstractC26920bk<C26878w> bkVar3, AbstractC26920bk<C27006al> bkVar4, AbstractC26920bk<C26806bm> bkVar5, AbstractC26920bk<C26791ay> bkVar6, AbstractC26920bk<C26779am> bkVar7, AbstractC26920bk<Executor> bkVar8) {
        this.f63693a = bkVar;
        this.f63694b = bkVar2;
        this.f63695c = bkVar3;
        this.f63696d = bkVar4;
        this.f63697e = bkVar5;
        this.f63698f = bkVar6;
        this.f63699g = bkVar7;
        this.f63700h = bkVar8;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26843cw mo44411a() {
        C26769ac a = this.f63693a.mo44411a();
        AbstractC26916bg b = C26918bi.m53471b(this.f63694b);
        C26878w a2 = this.f63695c.mo44411a();
        C26806bm a3 = this.f63697e.mo44411a();
        C26791ay a4 = this.f63698f.mo44411a();
        return new C26843cw(a, b, a2, this.f63696d.mo44411a(), a3, a4, this.f63699g.mo44411a(), C26918bi.m53471b(this.f63700h));
    }
}
