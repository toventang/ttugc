package com.p2082ss.android.ugc.aweme.mix.createmix;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.C59528a;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.mix.createmix.j */
final /* synthetic */ class C59489j extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f135790a = new C59489j();

    static {
        Covode.recordClassIndex(69882);
    }

    C59489j() {
        super(C59528a.class, "isCreateFlag", "isCreateFlag()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((C59528a) obj).f135842k);
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((C59528a) obj).f135842k = ((Boolean) obj2).booleanValue();
    }
}
