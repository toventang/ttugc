package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoReqInfo */
public final class BindInfoReqInfo implements Serializable {
    @AbstractC27891c(mo46611a = "payment_method_id")
    private final String paymentMethodId;

    static {
        Covode.recordClassIndex(52378);
    }

    public BindInfoReqInfo() {
        this(null, 1, null);
    }

    public static /* synthetic */ BindInfoReqInfo copy$default(BindInfoReqInfo bindInfoReqInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindInfoReqInfo.paymentMethodId;
        }
        return bindInfoReqInfo.copy(str);
    }

    public final String component1() {
        return this.paymentMethodId;
    }

    public final BindInfoReqInfo copy(String str) {
        return new BindInfoReqInfo(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BindInfoReqInfo) && C89219l.m154714a(this.paymentMethodId, ((BindInfoReqInfo) obj).paymentMethodId);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.paymentMethodId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BindInfoReqInfo(paymentMethodId=" + this.paymentMethodId + ")";
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public BindInfoReqInfo(String str) {
        this.paymentMethodId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BindInfoReqInfo(String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str);
    }
}
