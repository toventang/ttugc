package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.event.k */
public final class C44616k extends AbstractC44612i {

    /* renamed from: b */
    public static final C44617a f104081b = new C44617a((byte) 0);

    static {
        Covode.recordClassIndex(52983);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.event.k$a */
    public static final class C44617a {
        static {
            Covode.recordClassIndex(52984);
        }

        private C44617a() {
        }

        public /* synthetic */ C44617a(byte b) {
            this();
        }
    }

    public C44616k(Integer num) {
        super("tiktokec_ecommerce_centre_entry_show");
        LinkedHashMap<String, Object> linkedHashMap = this.f106050k;
        if (num != null && num.intValue() > 0) {
            linkedHashMap.put("copywriting", "review_orders");
            linkedHashMap.put("to_review_cnt", num);
        }
    }
}
