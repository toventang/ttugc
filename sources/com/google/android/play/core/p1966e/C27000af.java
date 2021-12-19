package com.google.android.play.core.p1966e;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26918bi;
import com.google.android.play.core.p1966e.p1968b.C27018a;
import java.io.File;

/* renamed from: com.google.android.play.core.e.af */
public final class C27000af implements AbstractC26920bk<C26999ae> {

    /* renamed from: a */
    private final AbstractC26920bk<C27013as> f63899a;

    /* renamed from: b */
    private final AbstractC26920bk<C27018a> f63900b;

    /* renamed from: c */
    private final AbstractC26920bk<File> f63901c;

    static {
        Covode.recordClassIndex(32476);
    }

    public C27000af(AbstractC26920bk<C27013as> bkVar, AbstractC26920bk<C27018a> bkVar2, AbstractC26920bk<File> bkVar3) {
        this.f63899a = bkVar;
        this.f63900b = bkVar2;
        this.f63901c = bkVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26999ae mo44411a() {
        return new C26999ae(C26918bi.m53471b(this.f63899a), C26918bi.m53471b(this.f63900b), C26918bi.m53471b(this.f63901c));
    }
}
