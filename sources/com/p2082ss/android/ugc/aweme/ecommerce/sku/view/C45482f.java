package com.p2082ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.f */
final /* synthetic */ class C45482f extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f105950a = new C45482f();

    static {
        Covode.recordClassIndex(53969);
    }

    C45482f() {
        super(SkuState.class, "currentImage", "getCurrentImage()Lcom/ss/android/ugc/aweme/ecommerce/api/model/Image;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((SkuState) obj).getCurrentImage();
    }
}
