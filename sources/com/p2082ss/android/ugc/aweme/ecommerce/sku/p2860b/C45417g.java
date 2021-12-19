package com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.g */
final /* synthetic */ class C45417g extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f105822a = new C45417g();

    static {
        Covode.recordClassIndex(53891);
    }

    C45417g() {
        super(SkuState.class, "showLoadingView", "getShowLoadingView()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((SkuState) obj).getShowLoadingView());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((SkuState) obj).setShowLoadingView(((Boolean) obj2).booleanValue());
    }
}
