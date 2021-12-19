package com.p2082ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.l */
final /* synthetic */ class C45488l extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f105956a = new C45488l();

    static {
        Covode.recordClassIndex(53975);
    }

    C45488l() {
        super(SkuState.class, "lowStockWarning", "getLowStockWarning()Ljava/lang/String;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((SkuState) obj).getLowStockWarning();
    }
}
