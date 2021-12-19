package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.c */
public final class C44773c {
    static {
        Covode.recordClassIndex(53159);
    }

    /* renamed from: a */
    public static final C44772b m87496a(ProductPackStruct productPackStruct) {
        List list;
        C89219l.m154721d(productPackStruct, "");
        ProductBase productBase = productPackStruct.f104677e;
        if (productBase == null || (list = productBase.f104660d) == null) {
            list = C89086z.INSTANCE;
        }
        return new C44772b(list);
    }
}
