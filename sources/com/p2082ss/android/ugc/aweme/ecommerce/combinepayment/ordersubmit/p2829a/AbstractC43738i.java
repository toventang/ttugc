package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.i */
public abstract class AbstractC43738i extends AbstractC45535a {
    static {
        Covode.recordClassIndex(52003);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public HashMap<String, Object> mo73987a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        LinkedHashMap<String, Object> linkedHashMap = C43732h.f101921a;
        Object obj = linkedHashMap.get("source_page_type");
        if (obj != null) {
            hashMap.put("source_page_type", obj);
        }
        Object obj2 = linkedHashMap.get("anchor_show_type");
        if (obj2 != null) {
            hashMap.put("anchor_show_type", obj2);
        }
        Object obj3 = linkedHashMap.get("product_id");
        if (obj3 != null) {
            hashMap.put("product_id", obj3);
        }
        return hashMap;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC43738i(String str) {
        super(str);
        C89219l.m154721d(str, "");
    }
}
