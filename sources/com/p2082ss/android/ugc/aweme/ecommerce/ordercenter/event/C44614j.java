package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.event.j */
public final class C44614j extends AbstractC44612i {

    /* renamed from: b */
    public static final C44615a f104080b = new C44615a((byte) 0);

    static {
        Covode.recordClassIndex(52981);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.event.j$a */
    public static final class C44615a {
        static {
            Covode.recordClassIndex(52982);
        }

        private C44615a() {
        }

        public /* synthetic */ C44615a(byte b) {
            this();
        }
    }

    public C44614j(Integer num) {
        super("tiktokec_ecommerce_centre_entry_click");
        LinkedHashMap<String, Object> linkedHashMap = this.f106050k;
        linkedHashMap.put("button_for", "orders");
        if (num != null && num.intValue() > 0) {
            linkedHashMap.put("copywriting", "review_orders");
            linkedHashMap.put("to_review_cnt", num);
        }
    }
}
