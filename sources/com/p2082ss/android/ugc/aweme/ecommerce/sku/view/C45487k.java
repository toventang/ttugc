package com.p2082ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.k */
final /* synthetic */ class C45487k extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f105955a = new C45487k();

    static {
        Covode.recordClassIndex(53974);
    }

    C45487k() {
        super(SkuState.class, "currentPrice", "getCurrentPrice()Ljava/lang/String;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((SkuState) obj).getCurrentPrice();
    }
}
