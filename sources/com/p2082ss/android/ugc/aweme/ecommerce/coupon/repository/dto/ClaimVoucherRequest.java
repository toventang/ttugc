package com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.ClaimVoucherRequest */
public final class ClaimVoucherRequest {
    @AbstractC27891c(mo46611a = "request_source")
    private final int requestSource;
    @AbstractC27891c(mo46611a = "voucher_type_id")
    private final String voucherTypeID;

    static {
        Covode.recordClassIndex(52648);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_ClaimVoucherRequest_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87054x52438c23(int i) {
        return i;
    }

    public static /* synthetic */ ClaimVoucherRequest copy$default(ClaimVoucherRequest claimVoucherRequest, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = claimVoucherRequest.voucherTypeID;
        }
        if ((i2 & 2) != 0) {
            i = claimVoucherRequest.requestSource;
        }
        return claimVoucherRequest.copy(str, i);
    }

    public final String component1() {
        return this.voucherTypeID;
    }

    public final int component2() {
        return this.requestSource;
    }

    public final ClaimVoucherRequest copy(String str, int i) {
        C89219l.m154721d(str, "");
        return new ClaimVoucherRequest(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimVoucherRequest)) {
            return false;
        }
        ClaimVoucherRequest claimVoucherRequest = (ClaimVoucherRequest) obj;
        return C89219l.m154714a(this.voucherTypeID, claimVoucherRequest.voucherTypeID) && this.requestSource == claimVoucherRequest.requestSource;
    }

    public final int hashCode() {
        String str = this.voucherTypeID;
        return ((str != null ? str.hashCode() : 0) * 31) + m87054x52438c23(this.requestSource);
    }

    public final String toString() {
        return "ClaimVoucherRequest(voucherTypeID=" + this.voucherTypeID + ", requestSource=" + this.requestSource + ")";
    }

    public final int getRequestSource() {
        return this.requestSource;
    }

    public final String getVoucherTypeID() {
        return this.voucherTypeID;
    }

    public ClaimVoucherRequest(String str, int i) {
        C89219l.m154721d(str, "");
        this.voucherTypeID = str;
        this.requestSource = i;
    }
}
