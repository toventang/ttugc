package com.p2082ss.android.ugc.aweme.ecommerce.review;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.ecommerce.review.p2854a.AbstractC45150a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewState */
public final class ProductReviewState implements IListState<AbstractC45150a, C20465o> {
    private final AbstractC45150a.C45152b filterData;
    private final String productId;
    private final float rate;
    private final String selectFilterId;
    private final int state;
    private final ListState<AbstractC45150a, C20465o> substate;

    static {
        Covode.recordClassIndex(53540);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_review_ProductReviewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87758x7ebfc293(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductReviewState copy$default(ProductReviewState productReviewState, int i, String str, float f, String str2, AbstractC45150a.C45152b bVar, ListState listState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = productReviewState.state;
        }
        if ((i2 & 2) != 0) {
            str = productReviewState.selectFilterId;
        }
        if ((i2 & 4) != 0) {
            f = productReviewState.rate;
        }
        if ((i2 & 8) != 0) {
            str2 = productReviewState.productId;
        }
        if ((i2 & 16) != 0) {
            bVar = productReviewState.filterData;
        }
        if ((i2 & 32) != 0) {
            listState = productReviewState.getSubstate();
        }
        return productReviewState.copy(i, str, f, str2, bVar, listState);
    }

    public final int component1() {
        return this.state;
    }

    public final String component2() {
        return this.selectFilterId;
    }

    public final float component3() {
        return this.rate;
    }

    public final String component4() {
        return this.productId;
    }

    public final AbstractC45150a.C45152b component5() {
        return this.filterData;
    }

    public final ListState<AbstractC45150a, C20465o> component6() {
        return getSubstate();
    }

    public final ProductReviewState copy(int i, String str, float f, String str2, AbstractC45150a.C45152b bVar, ListState<AbstractC45150a, C20465o> listState) {
        C89219l.m154721d(str2, "");
        C89219l.m154721d(listState, "");
        return new ProductReviewState(i, str, f, str2, bVar, listState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductReviewState)) {
            return false;
        }
        ProductReviewState productReviewState = (ProductReviewState) obj;
        return this.state == productReviewState.state && C89219l.m154714a(this.selectFilterId, productReviewState.selectFilterId) && Float.compare(this.rate, productReviewState.rate) == 0 && C89219l.m154714a(this.productId, productReviewState.productId) && C89219l.m154714a(this.filterData, productReviewState.filterData) && C89219l.m154714a(getSubstate(), productReviewState.getSubstate());
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_review_ProductReviewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m87758x7ebfc293(this.state) * 31;
        String str = this.selectFilterId;
        int i = 0;
        int hashCode = (((com_ss_android_ugc_aweme_ecommerce_review_ProductReviewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + m87757x7ebfc293(this.rate)) * 31;
        String str2 = this.productId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AbstractC45150a.C45152b bVar = this.filterData;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        ListState<AbstractC45150a, C20465o> substate2 = getSubstate();
        if (substate2 != null) {
            i = substate2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ProductReviewState(state=" + this.state + ", selectFilterId=" + this.selectFilterId + ", rate=" + this.rate + ", productId=" + this.productId + ", filterData=" + this.filterData + ", substate=" + getSubstate() + ")";
    }

    public final AbstractC45150a.C45152b getFilterData() {
        return this.filterData;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final float getRate() {
        return this.rate;
    }

    public final String getSelectFilterId() {
        return this.selectFilterId;
    }

    public final int getState() {
        return this.state;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<AbstractC45150a, C20465o> getSubstate() {
        return this.substate;
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_review_ProductReviewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87757x7ebfc293(float f) {
        return Float.floatToIntBits(f);
    }

    public final NestedState<ListState<AbstractC45150a, C20465o>> newSubstate(ListState<AbstractC45150a, C20465o> listState) {
        C89219l.m154721d(listState, "");
        return copy$default(this, 0, null, 0.0f, null, null, listState, 31, null);
    }

    public ProductReviewState(int i, String str, float f, String str2, AbstractC45150a.C45152b bVar, ListState<AbstractC45150a, C20465o> listState) {
        C89219l.m154721d(str2, "");
        C89219l.m154721d(listState, "");
        this.state = i;
        this.selectFilterId = str;
        this.rate = f;
        this.productId = str2;
        this.filterData = bVar;
        this.substate = listState;
    }
}
