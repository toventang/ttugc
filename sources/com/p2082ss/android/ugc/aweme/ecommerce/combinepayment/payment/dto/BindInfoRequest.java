package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoRequest */
public final class BindInfoRequest implements Serializable {
    @AbstractC27891c(mo46611a = "payment_method_list")
    private final List<BindInfoReqInfo> paymentMethodList;

    static {
        Covode.recordClassIndex(52379);
    }

    public BindInfoRequest() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindInfoRequest copy$default(BindInfoRequest bindInfoRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bindInfoRequest.paymentMethodList;
        }
        return bindInfoRequest.copy(list);
    }

    public final List<BindInfoReqInfo> component1() {
        return this.paymentMethodList;
    }

    public final BindInfoRequest copy(List<BindInfoReqInfo> list) {
        return new BindInfoRequest(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BindInfoRequest) && C89219l.m154714a(this.paymentMethodList, ((BindInfoRequest) obj).paymentMethodList);
        }
        return true;
    }

    public final int hashCode() {
        List<BindInfoReqInfo> list = this.paymentMethodList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BindInfoRequest(paymentMethodList=" + this.paymentMethodList + ")";
    }

    public final List<BindInfoReqInfo> getPaymentMethodList() {
        return this.paymentMethodList;
    }

    public BindInfoRequest(List<BindInfoReqInfo> list) {
        this.paymentMethodList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BindInfoRequest(List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list);
    }
}
