package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43749j;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43855i;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState */
public final class OrderSubmitState implements AbstractC20368af {
    public static final C43666a Companion = new C43666a((byte) 0);
    private final int abnormalStatus;
    private final List<Object> adapterList;
    private final C43855i bottomNotice;
    private final boolean checkPayment;
    private final C43750c currentPage;
    private final boolean hasAddress;
    private final int keyBoardCounterDiff;
    private final boolean loadSuccess;
    private final String message;
    private final Object networkErrorState;
    private final int orderShopCount;
    private final boolean orderSummaryPanelOpened;
    private final int pageLoadStatus;
    private final boolean reachableAny;
    private final int refreshCouponViewModel;
    private final Object resendOrderCreateAction;
    private final boolean showDialogState;
    private final boolean showDivider;
    private final C43749j summaryInfo;
    private final Object systemErrorState;
    private final String total;
    private final int totalItems;
    private C44085n userPaymentInfo;
    private final VoucherInfo voucherInfo;

    static {
        Covode.recordClassIndex(51928);
    }

    public OrderSubmitState() {
        this(0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777215, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86665x175209de(int i) {
        return i;
    }

    public static /* synthetic */ OrderSubmitState copy$default(OrderSubmitState orderSubmitState, int i, List list, C43749j jVar, boolean z, C44085n nVar, boolean z2, boolean z3, String str, String str2, int i2, int i3, int i4, Object obj, Object obj2, boolean z4, boolean z5, VoucherInfo voucherInfo2, int i5, C43750c cVar, boolean z6, int i6, C43855i iVar, Object obj3, boolean z7, int i7, Object obj4) {
        C43749j jVar2 = jVar;
        List<Object> list2 = list;
        int i8 = i;
        Object obj5 = obj2;
        boolean z8 = z3;
        boolean z9 = z2;
        C44085n nVar2 = nVar;
        boolean z10 = z;
        String str3 = str;
        String str4 = str2;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        Object obj6 = obj;
        VoucherInfo voucherInfo3 = voucherInfo2;
        boolean z11 = z5;
        boolean z12 = z4;
        C43750c cVar2 = cVar;
        boolean z13 = z6;
        int i12 = i6;
        C43855i iVar2 = iVar;
        Object obj7 = obj3;
        boolean z14 = z7;
        int i13 = i5;
        if ((i7 & 1) != 0) {
            i8 = orderSubmitState.pageLoadStatus;
        }
        if ((i7 & 2) != 0) {
            list2 = orderSubmitState.adapterList;
        }
        if ((i7 & 4) != 0) {
            jVar2 = orderSubmitState.summaryInfo;
        }
        if ((i7 & 8) != 0) {
            z10 = orderSubmitState.hasAddress;
        }
        if ((i7 & 16) != 0) {
            nVar2 = orderSubmitState.userPaymentInfo;
        }
        if ((i7 & 32) != 0) {
            z9 = orderSubmitState.reachableAny;
        }
        if ((i7 & 64) != 0) {
            z8 = orderSubmitState.orderSummaryPanelOpened;
        }
        if ((i7 & 128) != 0) {
            str3 = orderSubmitState.message;
        }
        if ((i7 & 256) != 0) {
            str4 = orderSubmitState.total;
        }
        if ((i7 & 512) != 0) {
            i9 = orderSubmitState.totalItems;
        }
        if ((i7 & 1024) != 0) {
            i10 = orderSubmitState.abnormalStatus;
        }
        if ((i7 & 2048) != 0) {
            i11 = orderSubmitState.keyBoardCounterDiff;
        }
        if ((i7 & 4096) != 0) {
            obj6 = orderSubmitState.networkErrorState;
        }
        if ((i7 & 8192) != 0) {
            obj5 = orderSubmitState.systemErrorState;
        }
        if ((i7 & 16384) != 0) {
            z12 = orderSubmitState.showDialogState;
        }
        if ((32768 & i7) != 0) {
            z11 = orderSubmitState.loadSuccess;
        }
        if ((65536 & i7) != 0) {
            voucherInfo3 = orderSubmitState.voucherInfo;
        }
        if ((131072 & i7) != 0) {
            i13 = orderSubmitState.refreshCouponViewModel;
        }
        if ((262144 & i7) != 0) {
            cVar2 = orderSubmitState.currentPage;
        }
        if ((524288 & i7) != 0) {
            z13 = orderSubmitState.checkPayment;
        }
        if ((1048576 & i7) != 0) {
            i12 = orderSubmitState.orderShopCount;
        }
        if ((2097152 & i7) != 0) {
            iVar2 = orderSubmitState.bottomNotice;
        }
        if ((4194304 & i7) != 0) {
            obj7 = orderSubmitState.resendOrderCreateAction;
        }
        if ((i7 & 8388608) != 0) {
            z14 = orderSubmitState.showDivider;
        }
        return orderSubmitState.copy(i8, list2, jVar2, z10, nVar2, z9, z8, str3, str4, i9, i10, i11, obj6, obj5, z12, z11, voucherInfo3, i13, cVar2, z13, i12, iVar2, obj7, z14);
    }

    public final int component1() {
        return this.pageLoadStatus;
    }

    public final int component10() {
        return this.totalItems;
    }

    public final int component11() {
        return this.abnormalStatus;
    }

    public final int component12() {
        return this.keyBoardCounterDiff;
    }

    public final Object component13() {
        return this.networkErrorState;
    }

    public final Object component14() {
        return this.systemErrorState;
    }

    public final boolean component15() {
        return this.showDialogState;
    }

    public final boolean component16() {
        return this.loadSuccess;
    }

    public final VoucherInfo component17() {
        return this.voucherInfo;
    }

    public final int component18() {
        return this.refreshCouponViewModel;
    }

    public final C43750c component19() {
        return this.currentPage;
    }

    public final List<Object> component2() {
        return this.adapterList;
    }

    public final boolean component20() {
        return this.checkPayment;
    }

    public final int component21() {
        return this.orderShopCount;
    }

    public final C43855i component22() {
        return this.bottomNotice;
    }

    public final Object component23() {
        return this.resendOrderCreateAction;
    }

    public final boolean component24() {
        return this.showDivider;
    }

    public final C43749j component3() {
        return this.summaryInfo;
    }

    public final boolean component4() {
        return this.hasAddress;
    }

    public final C44085n component5() {
        return this.userPaymentInfo;
    }

    public final boolean component6() {
        return this.reachableAny;
    }

    public final boolean component7() {
        return this.orderSummaryPanelOpened;
    }

    public final String component8() {
        return this.message;
    }

    public final String component9() {
        return this.total;
    }

    public final OrderSubmitState copy(int i, List<? extends Object> list, C43749j jVar, boolean z, C44085n nVar, boolean z2, boolean z3, String str, String str2, int i2, int i3, int i4, Object obj, Object obj2, boolean z4, boolean z5, VoucherInfo voucherInfo2, int i5, C43750c cVar, boolean z6, int i6, C43855i iVar, Object obj3, boolean z7) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new OrderSubmitState(i, list, jVar, z, nVar, z2, z3, str, str2, i2, i3, i4, obj, obj2, z4, z5, voucherInfo2, i5, cVar, z6, i6, iVar, obj3, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSubmitState)) {
            return false;
        }
        OrderSubmitState orderSubmitState = (OrderSubmitState) obj;
        return this.pageLoadStatus == orderSubmitState.pageLoadStatus && C89219l.m154714a(this.adapterList, orderSubmitState.adapterList) && C89219l.m154714a(this.summaryInfo, orderSubmitState.summaryInfo) && this.hasAddress == orderSubmitState.hasAddress && C89219l.m154714a(this.userPaymentInfo, orderSubmitState.userPaymentInfo) && this.reachableAny == orderSubmitState.reachableAny && this.orderSummaryPanelOpened == orderSubmitState.orderSummaryPanelOpened && C89219l.m154714a(this.message, orderSubmitState.message) && C89219l.m154714a(this.total, orderSubmitState.total) && this.totalItems == orderSubmitState.totalItems && this.abnormalStatus == orderSubmitState.abnormalStatus && this.keyBoardCounterDiff == orderSubmitState.keyBoardCounterDiff && C89219l.m154714a(this.networkErrorState, orderSubmitState.networkErrorState) && C89219l.m154714a(this.systemErrorState, orderSubmitState.systemErrorState) && this.showDialogState == orderSubmitState.showDialogState && this.loadSuccess == orderSubmitState.loadSuccess && C89219l.m154714a(this.voucherInfo, orderSubmitState.voucherInfo) && this.refreshCouponViewModel == orderSubmitState.refreshCouponViewModel && C89219l.m154714a(this.currentPage, orderSubmitState.currentPage) && this.checkPayment == orderSubmitState.checkPayment && this.orderShopCount == orderSubmitState.orderShopCount && C89219l.m154714a(this.bottomNotice, orderSubmitState.bottomNotice) && C89219l.m154714a(this.resendOrderCreateAction, orderSubmitState.resendOrderCreateAction) && this.showDivider == orderSubmitState.showDivider;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m86665x175209de(this.pageLoadStatus) * 31;
        List<Object> list = this.adapterList;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C43749j jVar = this.summaryInfo;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        boolean z = this.hasAddress;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        C44085n nVar = this.userPaymentInfo;
        int hashCode3 = (i6 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        boolean z2 = this.reachableAny;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode3 + i7) * 31;
        boolean z3 = this.orderSummaryPanelOpened;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        String str = this.message;
        int hashCode4 = (i14 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.total;
        int hashCode5 = (((((((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + m86665x175209de(this.totalItems)) * 31) + m86665x175209de(this.abnormalStatus)) * 31) + m86665x175209de(this.keyBoardCounterDiff)) * 31;
        Object obj = this.networkErrorState;
        int hashCode6 = (hashCode5 + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.systemErrorState;
        int hashCode7 = (hashCode6 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        boolean z4 = this.showDialogState;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (hashCode7 + i15) * 31;
        boolean z5 = this.loadSuccess;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        VoucherInfo voucherInfo2 = this.voucherInfo;
        int hashCode8 = (((i22 + (voucherInfo2 != null ? voucherInfo2.hashCode() : 0)) * 31) + m86665x175209de(this.refreshCouponViewModel)) * 31;
        C43750c cVar = this.currentPage;
        int hashCode9 = (hashCode8 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        boolean z6 = this.checkPayment;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((hashCode9 + i23) * 31) + m86665x175209de(this.orderShopCount)) * 31;
        C43855i iVar = this.bottomNotice;
        int hashCode10 = (com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        Object obj3 = this.resendOrderCreateAction;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        int i26 = (hashCode10 + i) * 31;
        if (!this.showDivider) {
            i2 = 0;
        }
        return i26 + i2;
    }

    public final String toString() {
        return "OrderSubmitState(pageLoadStatus=" + this.pageLoadStatus + ", adapterList=" + this.adapterList + ", summaryInfo=" + this.summaryInfo + ", hasAddress=" + this.hasAddress + ", userPaymentInfo=" + this.userPaymentInfo + ", reachableAny=" + this.reachableAny + ", orderSummaryPanelOpened=" + this.orderSummaryPanelOpened + ", message=" + this.message + ", total=" + this.total + ", totalItems=" + this.totalItems + ", abnormalStatus=" + this.abnormalStatus + ", keyBoardCounterDiff=" + this.keyBoardCounterDiff + ", networkErrorState=" + this.networkErrorState + ", systemErrorState=" + this.systemErrorState + ", showDialogState=" + this.showDialogState + ", loadSuccess=" + this.loadSuccess + ", voucherInfo=" + this.voucherInfo + ", refreshCouponViewModel=" + this.refreshCouponViewModel + ", currentPage=" + this.currentPage + ", checkPayment=" + this.checkPayment + ", orderShopCount=" + this.orderShopCount + ", bottomNotice=" + this.bottomNotice + ", resendOrderCreateAction=" + this.resendOrderCreateAction + ", showDivider=" + this.showDivider + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState$a */
    public static final class C43666a {
        static {
            Covode.recordClassIndex(51929);
        }

        private C43666a() {
        }

        public /* synthetic */ C43666a(byte b) {
            this();
        }
    }

    public final int getAbnormalStatus() {
        return this.abnormalStatus;
    }

    public final List<Object> getAdapterList() {
        return this.adapterList;
    }

    public final C43855i getBottomNotice() {
        return this.bottomNotice;
    }

    public final boolean getCheckPayment() {
        return this.checkPayment;
    }

    public final C43750c getCurrentPage() {
        return this.currentPage;
    }

    public final boolean getHasAddress() {
        return this.hasAddress;
    }

    public final int getKeyBoardCounterDiff() {
        return this.keyBoardCounterDiff;
    }

    public final boolean getLoadSuccess() {
        return this.loadSuccess;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Object getNetworkErrorState() {
        return this.networkErrorState;
    }

    public final int getOrderShopCount() {
        return this.orderShopCount;
    }

    public final boolean getOrderSummaryPanelOpened() {
        return this.orderSummaryPanelOpened;
    }

    public final int getPageLoadStatus() {
        return this.pageLoadStatus;
    }

    public final boolean getReachableAny() {
        return this.reachableAny;
    }

    public final int getRefreshCouponViewModel() {
        return this.refreshCouponViewModel;
    }

    public final Object getResendOrderCreateAction() {
        return this.resendOrderCreateAction;
    }

    public final boolean getShowDialogState() {
        return this.showDialogState;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final C43749j getSummaryInfo() {
        return this.summaryInfo;
    }

    public final Object getSystemErrorState() {
        return this.systemErrorState;
    }

    public final String getTotal() {
        return this.total;
    }

    public final int getTotalItems() {
        return this.totalItems;
    }

    public final C44085n getUserPaymentInfo() {
        return this.userPaymentInfo;
    }

    public final VoucherInfo getVoucherInfo() {
        return this.voucherInfo;
    }

    public final void setUserPaymentInfo(C44085n nVar) {
        this.userPaymentInfo = nVar;
    }

    public OrderSubmitState(int i, List<? extends Object> list, C43749j jVar, boolean z, C44085n nVar, boolean z2, boolean z3, String str, String str2, int i2, int i3, int i4, Object obj, Object obj2, boolean z4, boolean z5, VoucherInfo voucherInfo2, int i5, C43750c cVar, boolean z6, int i6, C43855i iVar, Object obj3, boolean z7) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.pageLoadStatus = i;
        this.adapterList = list;
        this.summaryInfo = jVar;
        this.hasAddress = z;
        this.userPaymentInfo = nVar;
        this.reachableAny = z2;
        this.orderSummaryPanelOpened = z3;
        this.message = str;
        this.total = str2;
        this.totalItems = i2;
        this.abnormalStatus = i3;
        this.keyBoardCounterDiff = i4;
        this.networkErrorState = obj;
        this.systemErrorState = obj2;
        this.showDialogState = z4;
        this.loadSuccess = z5;
        this.voucherInfo = voucherInfo2;
        this.refreshCouponViewModel = i5;
        this.currentPage = cVar;
        this.checkPayment = z6;
        this.orderShopCount = i6;
        this.bottomNotice = iVar;
        this.resendOrderCreateAction = obj3;
        this.showDivider = z7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderSubmitState(int r27, java.util.List r28, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43749j r29, boolean r30, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n r31, boolean r32, boolean r33, java.lang.String r34, java.lang.String r35, int r36, int r37, int r38, java.lang.Object r39, java.lang.Object r40, boolean r41, boolean r42, com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo r43, int r44, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43750c r45, boolean r46, int r47, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43855i r48, java.lang.Object r49, boolean r50, int r51, p4600h.p4611f.p4613b.C89214g r52) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState.<init>(int, java.util.List, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j, boolean, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, boolean, boolean, java.lang.String, java.lang.String, int, int, int, java.lang.Object, java.lang.Object, boolean, boolean, com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo, int, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.c, boolean, int, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.i, java.lang.Object, boolean, int, h.f.b.g):void");
    }
}
