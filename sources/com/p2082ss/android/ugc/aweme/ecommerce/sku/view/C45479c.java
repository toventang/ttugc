package com.p2082ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.c */
final /* synthetic */ class C45479c extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f105947a = new C45479c();

    static {
        Covode.recordClassIndex(53966);
    }

    C45479c() {
        super(SkuState.class, "currentQuantity", "getCurrentQuantity()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((SkuState) obj).getCurrentQuantity());
    }
}
