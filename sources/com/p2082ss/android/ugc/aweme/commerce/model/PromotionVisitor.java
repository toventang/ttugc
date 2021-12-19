package com.p2082ss.android.ugc.aweme.commerce.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.PromotionVisitor */
public final class PromotionVisitor implements Serializable {
    @AbstractC27891c(mo46611a = "avatar")
    private List<? extends UrlModel> avatars;
    @AbstractC27891c(mo46611a = "count")
    private long count;

    static {
        Covode.recordClassIndex(44899);
    }

    public PromotionVisitor() {
        this(null, 0, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_commerce_model_PromotionVisitor_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m75637x243e4de6(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commerce.model.PromotionVisitor */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionVisitor copy$default(PromotionVisitor promotionVisitor, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = promotionVisitor.avatars;
        }
        if ((i & 2) != 0) {
            j = promotionVisitor.count;
        }
        return promotionVisitor.copy(list, j);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> */
    public final List<UrlModel> component1() {
        return this.avatars;
    }

    public final long component2() {
        return this.count;
    }

    public final PromotionVisitor copy(List<? extends UrlModel> list, long j) {
        C89219l.m154721d(list, "");
        return new PromotionVisitor(list, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionVisitor)) {
            return false;
        }
        PromotionVisitor promotionVisitor = (PromotionVisitor) obj;
        return C89219l.m154714a(this.avatars, promotionVisitor.avatars) && this.count == promotionVisitor.count;
    }

    public final int hashCode() {
        List<? extends UrlModel> list = this.avatars;
        return ((list != null ? list.hashCode() : 0) * 31) + m75637x243e4de6(this.count);
    }

    public final String toString() {
        return "PromotionVisitor(avatars=" + this.avatars + ", count=" + this.count + ")";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> */
    public final List<UrlModel> getAvatars() {
        return this.avatars;
    }

    public final long getCount() {
        return this.count;
    }

    public final void setCount(long j) {
        this.count = j;
    }

    public final void setAvatars(List<? extends UrlModel> list) {
        C89219l.m154721d(list, "");
        this.avatars = list;
    }

    public PromotionVisitor(List<? extends UrlModel> list, long j) {
        C89219l.m154721d(list, "");
        this.avatars = list;
        this.count = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PromotionVisitor(List list, long j, int i, C89214g gVar) {
        this((i & 1) != 0 ? C89086z.INSTANCE : list, (i & 2) != 0 ? 0 : j);
    }
}
