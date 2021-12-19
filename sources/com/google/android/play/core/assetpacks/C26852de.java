package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26896an;
import com.google.android.play.core.p1963b.C26918bi;

/* renamed from: com.google.android.play.core.assetpacks.de */
public final class C26852de implements AbstractC26920bk<AbstractC26857dj> {

    /* renamed from: a */
    private final AbstractC26920bk<Context> f63707a;

    /* renamed from: b */
    private final AbstractC26920bk<C26873r> f63708b;

    /* renamed from: c */
    private final AbstractC26920bk<C26814bu> f63709c;

    static {
        Covode.recordClassIndex(32327);
    }

    public C26852de(AbstractC26920bk<Context> bkVar, AbstractC26920bk<C26873r> bkVar2, AbstractC26920bk<C26814bu> bkVar3) {
        this.f63707a = bkVar;
        this.f63708b = bkVar2;
        this.f63709c = bkVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ AbstractC26857dj mo44411a() {
        Object a = C26848da.m53315a(C26853df.m53319a(((C26853df) this.f63707a).f63710a)) == null ? C26918bi.m53471b(this.f63708b).mo44603a() : C26918bi.m53471b(this.f63709c).mo44603a();
        C26896an.m53419a(a);
        return a;
    }
}
