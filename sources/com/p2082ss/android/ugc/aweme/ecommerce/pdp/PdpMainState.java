package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44771a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState */
public final class PdpMainState implements AbstractC20368af {
    private final AddToCartButton addToCartButton;
    private final C44771a bottomBarVO;
    private final float bottomSheetSlideOffset;
    private final CartEntry cartEntry;
    private final C44674a cartTip;
    private final List<Object> contentList;
    private final boolean dismiss;
    private final boolean firstHeaderImageReady;
    private final Long flashSaleCountDown;
    private final Integer flashSaleState;
    private final C44770d focusTabAction;
    private final boolean isFullScreen;
    private final int loadingStatus;
    private final ProductDetailReview reviewInfo;
    private final int scrollOffset;
    private final int sheetState;

    static {
        Covode.recordClassIndex(53020);
    }

    public PdpMainState() {
        this(false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65535, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87372xa06e3a2d(int i) {
        return i;
    }

    public static /* synthetic */ PdpMainState copy$default(PdpMainState pdpMainState, boolean z, C44771a aVar, boolean z2, int i, ProductDetailReview productDetailReview, List list, float f, int i2, C44770d dVar, int i3, boolean z3, Integer num, Long l, C44674a aVar2, CartEntry cartEntry2, AddToCartButton addToCartButton2, int i4, Object obj) {
        C44771a aVar3 = aVar;
        boolean z4 = z;
        ProductDetailReview productDetailReview2 = productDetailReview;
        int i5 = i;
        boolean z5 = z2;
        int i6 = i2;
        float f2 = f;
        List list2 = list;
        boolean z6 = z3;
        int i7 = i3;
        C44770d dVar2 = dVar;
        C44674a aVar4 = aVar2;
        Long l2 = l;
        Integer num2 = num;
        AddToCartButton addToCartButton3 = addToCartButton2;
        CartEntry cartEntry3 = cartEntry2;
        if ((i4 & 1) != 0) {
            z4 = pdpMainState.isFullScreen;
        }
        if ((i4 & 2) != 0) {
            aVar3 = pdpMainState.bottomBarVO;
        }
        if ((i4 & 4) != 0) {
            z5 = pdpMainState.dismiss;
        }
        if ((i4 & 8) != 0) {
            i5 = pdpMainState.sheetState;
        }
        if ((i4 & 16) != 0) {
            productDetailReview2 = pdpMainState.reviewInfo;
        }
        if ((i4 & 32) != 0) {
            list2 = pdpMainState.contentList;
        }
        if ((i4 & 64) != 0) {
            f2 = pdpMainState.bottomSheetSlideOffset;
        }
        if ((i4 & 128) != 0) {
            i6 = pdpMainState.scrollOffset;
        }
        if ((i4 & 256) != 0) {
            dVar2 = pdpMainState.focusTabAction;
        }
        if ((i4 & 512) != 0) {
            i7 = pdpMainState.loadingStatus;
        }
        if ((i4 & 1024) != 0) {
            z6 = pdpMainState.firstHeaderImageReady;
        }
        if ((i4 & 2048) != 0) {
            num2 = pdpMainState.flashSaleState;
        }
        if ((i4 & 4096) != 0) {
            l2 = pdpMainState.flashSaleCountDown;
        }
        if ((i4 & 8192) != 0) {
            aVar4 = pdpMainState.cartTip;
        }
        if ((i4 & 16384) != 0) {
            cartEntry3 = pdpMainState.cartEntry;
        }
        if ((i4 & 32768) != 0) {
            addToCartButton3 = pdpMainState.addToCartButton;
        }
        return pdpMainState.copy(z4, aVar3, z5, i5, productDetailReview2, list2, f2, i6, dVar2, i7, z6, num2, l2, aVar4, cartEntry3, addToCartButton3);
    }

    public final boolean component1() {
        return this.isFullScreen;
    }

    public final int component10() {
        return this.loadingStatus;
    }

    public final boolean component11() {
        return this.firstHeaderImageReady;
    }

    public final Integer component12() {
        return this.flashSaleState;
    }

    public final Long component13() {
        return this.flashSaleCountDown;
    }

    public final C44674a component14() {
        return this.cartTip;
    }

    public final CartEntry component15() {
        return this.cartEntry;
    }

    public final AddToCartButton component16() {
        return this.addToCartButton;
    }

    public final C44771a component2() {
        return this.bottomBarVO;
    }

    public final boolean component3() {
        return this.dismiss;
    }

    public final int component4() {
        return this.sheetState;
    }

    public final ProductDetailReview component5() {
        return this.reviewInfo;
    }

    public final List<Object> component6() {
        return this.contentList;
    }

    public final float component7() {
        return this.bottomSheetSlideOffset;
    }

    public final int component8() {
        return this.scrollOffset;
    }

    public final C44770d component9() {
        return this.focusTabAction;
    }

    public final PdpMainState copy(boolean z, C44771a aVar, boolean z2, int i, ProductDetailReview productDetailReview, List<? extends Object> list, float f, int i2, C44770d dVar, int i3, boolean z3, Integer num, Long l, C44674a aVar2, CartEntry cartEntry2, AddToCartButton addToCartButton2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(dVar, "");
        return new PdpMainState(z, aVar, z2, i, productDetailReview, list, f, i2, dVar, i3, z3, num, l, aVar2, cartEntry2, addToCartButton2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpMainState)) {
            return false;
        }
        PdpMainState pdpMainState = (PdpMainState) obj;
        return this.isFullScreen == pdpMainState.isFullScreen && C89219l.m154714a(this.bottomBarVO, pdpMainState.bottomBarVO) && this.dismiss == pdpMainState.dismiss && this.sheetState == pdpMainState.sheetState && C89219l.m154714a(this.reviewInfo, pdpMainState.reviewInfo) && C89219l.m154714a(this.contentList, pdpMainState.contentList) && Float.compare(this.bottomSheetSlideOffset, pdpMainState.bottomSheetSlideOffset) == 0 && this.scrollOffset == pdpMainState.scrollOffset && C89219l.m154714a(this.focusTabAction, pdpMainState.focusTabAction) && this.loadingStatus == pdpMainState.loadingStatus && this.firstHeaderImageReady == pdpMainState.firstHeaderImageReady && C89219l.m154714a(this.flashSaleState, pdpMainState.flashSaleState) && C89219l.m154714a(this.flashSaleCountDown, pdpMainState.flashSaleCountDown) && C89219l.m154714a(this.cartTip, pdpMainState.cartTip) && C89219l.m154714a(this.cartEntry, pdpMainState.cartEntry) && C89219l.m154714a(this.addToCartButton, pdpMainState.addToCartButton);
    }

    public final int hashCode() {
        boolean z = this.isFullScreen;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        C44771a aVar = this.bottomBarVO;
        int i6 = 0;
        int hashCode = (i5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z2 = this.dismiss;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode + i7) * 31) + m87372xa06e3a2d(this.sheetState)) * 31;
        ProductDetailReview productDetailReview = this.reviewInfo;
        int hashCode2 = (com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (productDetailReview != null ? productDetailReview.hashCode() : 0)) * 31;
        List<Object> list = this.contentList;
        int hashCode3 = (((((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + m87371xa06e3a2d(this.bottomSheetSlideOffset)) * 31) + m87372xa06e3a2d(this.scrollOffset)) * 31;
        C44770d dVar = this.focusTabAction;
        int hashCode4 = (((hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31) + m87372xa06e3a2d(this.loadingStatus)) * 31;
        if (!this.firstHeaderImageReady) {
            i = 0;
        }
        int i10 = (hashCode4 + i) * 31;
        Integer num = this.flashSaleState;
        int hashCode5 = (i10 + (num != null ? num.hashCode() : 0)) * 31;
        Long l = this.flashSaleCountDown;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        C44674a aVar2 = this.cartTip;
        int hashCode7 = (hashCode6 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        CartEntry cartEntry2 = this.cartEntry;
        int hashCode8 = (hashCode7 + (cartEntry2 != null ? cartEntry2.hashCode() : 0)) * 31;
        AddToCartButton addToCartButton2 = this.addToCartButton;
        if (addToCartButton2 != null) {
            i6 = addToCartButton2.hashCode();
        }
        return hashCode8 + i6;
    }

    public final String toString() {
        return "PdpMainState(isFullScreen=" + this.isFullScreen + ", bottomBarVO=" + this.bottomBarVO + ", dismiss=" + this.dismiss + ", sheetState=" + this.sheetState + ", reviewInfo=" + this.reviewInfo + ", contentList=" + this.contentList + ", bottomSheetSlideOffset=" + this.bottomSheetSlideOffset + ", scrollOffset=" + this.scrollOffset + ", focusTabAction=" + this.focusTabAction + ", loadingStatus=" + this.loadingStatus + ", firstHeaderImageReady=" + this.firstHeaderImageReady + ", flashSaleState=" + this.flashSaleState + ", flashSaleCountDown=" + this.flashSaleCountDown + ", cartTip=" + this.cartTip + ", cartEntry=" + this.cartEntry + ", addToCartButton=" + this.addToCartButton + ")";
    }

    public final AddToCartButton getAddToCartButton() {
        return this.addToCartButton;
    }

    public final C44771a getBottomBarVO() {
        return this.bottomBarVO;
    }

    public final float getBottomSheetSlideOffset() {
        return this.bottomSheetSlideOffset;
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final C44674a getCartTip() {
        return this.cartTip;
    }

    public final List<Object> getContentList() {
        return this.contentList;
    }

    public final boolean getDismiss() {
        return this.dismiss;
    }

    public final boolean getFirstHeaderImageReady() {
        return this.firstHeaderImageReady;
    }

    public final Long getFlashSaleCountDown() {
        return this.flashSaleCountDown;
    }

    public final Integer getFlashSaleState() {
        return this.flashSaleState;
    }

    public final C44770d getFocusTabAction() {
        return this.focusTabAction;
    }

    public final int getLoadingStatus() {
        return this.loadingStatus;
    }

    public final ProductDetailReview getReviewInfo() {
        return this.reviewInfo;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final int getSheetState() {
        return this.sheetState;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87371xa06e3a2d(float f) {
        return Float.floatToIntBits(f);
    }

    public PdpMainState(boolean z, C44771a aVar, boolean z2, int i, ProductDetailReview productDetailReview, List<? extends Object> list, float f, int i2, C44770d dVar, int i3, boolean z3, Integer num, Long l, C44674a aVar2, CartEntry cartEntry2, AddToCartButton addToCartButton2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(dVar, "");
        this.isFullScreen = z;
        this.bottomBarVO = aVar;
        this.dismiss = z2;
        this.sheetState = i;
        this.reviewInfo = productDetailReview;
        this.contentList = list;
        this.bottomSheetSlideOffset = f;
        this.scrollOffset = i2;
        this.focusTabAction = dVar;
        this.loadingStatus = i3;
        this.firstHeaderImageReady = z3;
        this.flashSaleState = num;
        this.flashSaleCountDown = l;
        this.cartTip = aVar2;
        this.cartEntry = cartEntry2;
        this.addToCartButton = addToCartButton2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PdpMainState(boolean z, C44771a aVar, boolean z2, int i, ProductDetailReview productDetailReview, List list, float f, int i2, C44770d dVar, int i3, boolean z3, Integer num, Long l, C44674a aVar2, CartEntry cartEntry2, AddToCartButton addToCartButton2, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? null : aVar, (i4 & 4) != 0 ? false : z2, (i4 & 8) != 0 ? 4 : i, (i4 & 16) != 0 ? null : productDetailReview, (i4 & 32) != 0 ? C89086z.INSTANCE : list, (i4 & 64) != 0 ? 0.0f : f, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? new C44770d(0, false) : dVar, (i4 & 512) != 0 ? 0 : i3, (i4 & 1024) == 0 ? z3 : false, (i4 & 2048) != 0 ? null : num, (i4 & 4096) != 0 ? null : l, (i4 & 8192) != 0 ? null : aVar2, (i4 & 16384) != 0 ? null : cartEntry2, (i4 & 32768) != 0 ? null : addToCartButton2);
    }
}
