package com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.b */
final /* synthetic */ class C45063b extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f105103a = new C45063b();

    static {
        Covode.recordClassIndex(53490);
    }

    C45063b() {
        super(PdpMainState.class, "loadingStatus", "getLoadingStatus()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((PdpMainState) obj).getLoadingStatus());
    }
}
