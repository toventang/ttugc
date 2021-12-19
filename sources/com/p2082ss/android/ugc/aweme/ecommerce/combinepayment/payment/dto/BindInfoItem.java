package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoItem */
public final class BindInfoItem {
    @AbstractC27891c(mo46611a = "payment_method_bind_url")
    private final String paymentMethodBindUrl;
    @AbstractC27891c(mo46611a = "payment_method_id")
    private final String paymentMethodId;

    static {
        Covode.recordClassIndex(52377);
    }

    public BindInfoItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ BindInfoItem copy$default(BindInfoItem bindInfoItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindInfoItem.paymentMethodId;
        }
        if ((i & 2) != 0) {
            str2 = bindInfoItem.paymentMethodBindUrl;
        }
        return bindInfoItem.copy(str, str2);
    }

    public final String component1() {
        return this.paymentMethodId;
    }

    public final String component2() {
        return this.paymentMethodBindUrl;
    }

    public final BindInfoItem copy(String str, String str2) {
        return new BindInfoItem(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindInfoItem)) {
            return false;
        }
        BindInfoItem bindInfoItem = (BindInfoItem) obj;
        return C89219l.m154714a(this.paymentMethodId, bindInfoItem.paymentMethodId) && C89219l.m154714a(this.paymentMethodBindUrl, bindInfoItem.paymentMethodBindUrl);
    }

    public final int hashCode() {
        String str = this.paymentMethodId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.paymentMethodBindUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BindInfoItem(paymentMethodId=" + this.paymentMethodId + ", paymentMethodBindUrl=" + this.paymentMethodBindUrl + ")";
    }

    public final String getPaymentMethodBindUrl() {
        return this.paymentMethodBindUrl;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public BindInfoItem(String str, String str2) {
        this.paymentMethodId = str;
        this.paymentMethodBindUrl = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BindInfoItem(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
