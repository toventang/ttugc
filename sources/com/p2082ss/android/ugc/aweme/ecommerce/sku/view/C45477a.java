package com.p2082ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.a */
final /* synthetic */ class C45477a extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f105945a = new C45477a();

    static {
        Covode.recordClassIndex(53964);
    }

    C45477a() {
        super(SkuState.class, "addToCartButton", "getAddToCartButton()Lcom/ss/android/ugc/aweme/ecommerce/sku/model/dto/AddToCartButton;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((SkuState) obj).getAddToCartButton();
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((SkuState) obj).setAddToCartButton((AddToCartButton) obj2);
    }
}
