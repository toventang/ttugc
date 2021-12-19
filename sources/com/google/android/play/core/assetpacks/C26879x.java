package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.common.C26972c;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26918bi;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.x */
public final class C26879x implements AbstractC26920bk<C26878w> {

    /* renamed from: a */
    private final AbstractC26920bk<Context> f63776a;

    /* renamed from: b */
    private final AbstractC26920bk<C26806bm> f63777b;

    /* renamed from: c */
    private final AbstractC26920bk<C26788av> f63778c;

    /* renamed from: d */
    private final AbstractC26920bk<AbstractC26857dj> f63779d;

    /* renamed from: e */
    private final AbstractC26920bk<C26791ay> f63780e;

    /* renamed from: f */
    private final AbstractC26920bk<C26779am> f63781f;

    /* renamed from: g */
    private final AbstractC26920bk<C26972c> f63782g;

    /* renamed from: h */
    private final AbstractC26920bk<Executor> f63783h;

    /* renamed from: i */
    private final AbstractC26920bk<Executor> f63784i;

    static {
        Covode.recordClassIndex(32354);
    }

    public C26879x(AbstractC26920bk<Context> bkVar, AbstractC26920bk<C26806bm> bkVar2, AbstractC26920bk<C26788av> bkVar3, AbstractC26920bk<AbstractC26857dj> bkVar4, AbstractC26920bk<C26791ay> bkVar5, AbstractC26920bk<C26779am> bkVar6, AbstractC26920bk<C26972c> bkVar7, AbstractC26920bk<Executor> bkVar8, AbstractC26920bk<Executor> bkVar9) {
        this.f63776a = bkVar;
        this.f63777b = bkVar2;
        this.f63778c = bkVar3;
        this.f63779d = bkVar4;
        this.f63780e = bkVar5;
        this.f63781f = bkVar6;
        this.f63782g = bkVar7;
        this.f63783h = bkVar8;
        this.f63784i = bkVar9;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26878w mo44411a() {
        Context a = C26853df.m53319a(((C26853df) this.f63776a).f63710a);
        C26806bm a2 = this.f63777b.mo44411a();
        C26788av a3 = this.f63778c.mo44411a();
        AbstractC26916bg b = C26918bi.m53471b(this.f63779d);
        C26791ay a4 = this.f63780e.mo44411a();
        return new C26878w(a, a2, a3, b, a4, this.f63781f.mo44411a(), this.f63782g.mo44411a(), C26918bi.m53471b(this.f63783h), C26918bi.m53471b(this.f63784i));
    }
}
