package com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.t */
final /* synthetic */ class C45081t extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f105121a = new C45081t();

    static {
        Covode.recordClassIndex(53508);
    }

    C45081t() {
        super(PdpMainState.class, "cartEntry", "getCartEntry()Lcom/ss/android/ugc/aweme/ecommerce/pdp/repository/dto/CartEntry;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((PdpMainState) obj).getCartEntry();
    }
}
