package com.p2082ss.android.ugc.aweme.ecommercebase.dto;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercebase.dto.a */
public final class C45672a {
    static {
        Covode.recordClassIndex(54182);
    }

    /* renamed from: a */
    public static final String m88178a(PromotionView promotionView, int i) {
        List<PromotionItem> d;
        C89219l.m154721d(promotionView, "");
        StringBuilder sb = new StringBuilder(64);
        List<PromotionItem> promotion_items = promotionView.getPromotion_items();
        if (!(promotion_items == null || (d = C89070n.m154571d((Iterable) promotion_items, i)) == null)) {
            for (PromotionItem promotionItem : d) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                String voucherId = promotionItem.getVoucherId();
                if (voucherId == null) {
                    voucherId = "-1";
                }
                sb.append(voucherId);
            }
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: b */
    public static final String m88179b(PromotionView promotionView, int i) {
        List<PromotionItem> d;
        C89219l.m154721d(promotionView, "");
        StringBuilder sb = new StringBuilder(64);
        List<PromotionItem> promotion_items = promotionView.getPromotion_items();
        if (!(promotion_items == null || (d = C89070n.m154571d((Iterable) promotion_items, i)) == null)) {
            for (PromotionItem promotionItem : d) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(promotionItem.getId());
            }
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: c */
    public static final String m88180c(PromotionView promotionView, int i) {
        List<PromotionItem> d;
        C89219l.m154721d(promotionView, "");
        StringBuilder sb = new StringBuilder(64);
        List<PromotionItem> promotion_items = promotionView.getPromotion_items();
        if (!(promotion_items == null || (d = C89070n.m154571d((Iterable) promotion_items, i)) == null)) {
            for (PromotionItem promotionItem : d) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(promotionItem.getName());
            }
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }
}
