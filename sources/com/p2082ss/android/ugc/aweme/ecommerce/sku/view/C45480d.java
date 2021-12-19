package com.p2082ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.d */
final /* synthetic */ class C45480d extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f105948a = new C45480d();

    static {
        Covode.recordClassIndex(53967);
    }

    C45480d() {
        super(SkuState.class, "currentMaxQuantity", "getCurrentMaxQuantity()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((SkuState) obj).getCurrentMaxQuantity());
    }
}
