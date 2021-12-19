package com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.GImage;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionItem;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ecommercebase.view.a.c */
public final class C45680c {
    static {
        Covode.recordClassIndex(54191);
    }

    /* renamed from: a */
    public static final boolean m88188a(PromotionItem promotionItem) {
        GImage icon;
        List<String> urls;
        Integer num = null;
        if (promotionItem != null) {
            num = promotionItem.getStyle();
        }
        if ((num != null && num.intValue() == 1) || promotionItem == null || (icon = promotionItem.getIcon()) == null || (urls = icon.getUrls()) == null || urls.isEmpty()) {
            return false;
        }
        return true;
    }
}
