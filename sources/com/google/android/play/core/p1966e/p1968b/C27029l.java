package com.google.android.play.core.p1966e.p1968b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1966e.C27006al;
import com.google.android.play.core.p1966e.C27016av;
import java.io.File;

/* renamed from: com.google.android.play.core.e.b.l */
public final class C27029l implements AbstractC26920bk<C27018a> {

    /* renamed from: a */
    private final AbstractC26920bk<Context> f63981a;

    /* renamed from: b */
    private final AbstractC26920bk<File> f63982b;

    /* renamed from: c */
    private final AbstractC26920bk<C27006al> f63983c;

    static {
        Covode.recordClassIndex(32505);
    }

    public C27029l(AbstractC26920bk<Context> bkVar, AbstractC26920bk<File> bkVar2, AbstractC26920bk<C27006al> bkVar3) {
        this.f63981a = bkVar;
        this.f63982b = bkVar2;
        this.f63983c = bkVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C27018a mo44411a() {
        return new C27018a(((C27016av) this.f63981a).mo44411a(), this.f63982b.mo44411a(), this.f63983c.mo44411a());
    }
}
