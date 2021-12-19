package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.p */
public final class C44787p {
    static {
        Covode.recordClassIndex(53173);
    }

    /* renamed from: a */
    public static final C44786o m87503a(ProductPackStruct productPackStruct) {
        Image image;
        String str;
        String str2;
        String str3;
        C89219l.m154721d(productPackStruct, "");
        SellerInfo sellerInfo = productPackStruct.f104676d;
        Long l = null;
        if (sellerInfo != null) {
            image = sellerInfo.f104706c;
        } else {
            image = null;
        }
        SellerInfo sellerInfo2 = productPackStruct.f104676d;
        if (sellerInfo2 == null || (str = sellerInfo2.f104705b) == null) {
            str = "";
        }
        SellerInfo sellerInfo3 = productPackStruct.f104676d;
        if (sellerInfo3 != null) {
            l = sellerInfo3.f104707d;
        }
        SellerInfo sellerInfo4 = productPackStruct.f104676d;
        if (sellerInfo4 == null || (str2 = sellerInfo4.f104708e) == null) {
            str2 = "";
        }
        SellerInfo sellerInfo5 = productPackStruct.f104676d;
        if (sellerInfo5 == null || (str3 = sellerInfo5.f104709f) == null) {
            str3 = "";
        }
        return new C44786o(image, str, l, str2, str3);
    }
}
