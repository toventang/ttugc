package com.p2082ss.android.ugc.aweme.ecommerce.sku.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.a */
public final class C45429a {

    /* renamed from: a */
    public static final C45429a f105838a = new C45429a();

    private C45429a() {
    }

    static {
        Covode.recordClassIndex(53904);
    }

    /* renamed from: a */
    public static String m87999a(Integer num) {
        if (num == null) {
            return "unknow";
        }
        if (num.intValue() == 0) {
            return "select_sku_specs";
        }
        if (num.intValue() == 2) {
            return "add_to_cart";
        }
        if (num.intValue() == 1) {
            return "buy_now";
        }
        if (num.intValue() == 3) {
            return "cart_select_sku_specs";
        }
        return "unknow";
    }
}
