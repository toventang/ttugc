package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p */
public final class C44087p implements Serializable {
    @AbstractC27891c(mo46611a = "payment_method_id")

    /* renamed from: a */
    private final String f102815a;
    @AbstractC27891c(mo46611a = "payment_method_token")

    /* renamed from: b */
    private final String f102816b;
    @AbstractC27891c(mo46611a = "payment_elements")

    /* renamed from: c */
    private List<C44084m> f102817c;
    @AbstractC27891c(mo46611a = "is_choose_save")

    /* renamed from: d */
    private final Boolean f102818d;

    static {
        Covode.recordClassIndex(52398);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C44087p copy$default(C44087p pVar, String str, String str2, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pVar.f102815a;
        }
        if ((i & 2) != 0) {
            str2 = pVar.f102816b;
        }
        if ((i & 4) != 0) {
            list = pVar.f102817c;
        }
        if ((i & 8) != 0) {
            bool = pVar.f102818d;
        }
        return pVar.copy(str, str2, list, bool);
    }

    public final String component1() {
        return this.f102815a;
    }

    public final String component2() {
        return this.f102816b;
    }

    public final List<C44084m> component3() {
        return this.f102817c;
    }

    public final Boolean component4() {
        return this.f102818d;
    }

    public final C44087p copy(String str, String str2, List<C44084m> list, Boolean bool) {
        return new C44087p(str, str2, list, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44087p)) {
            return false;
        }
        C44087p pVar = (C44087p) obj;
        return C89219l.m154714a(this.f102815a, pVar.f102815a) && C89219l.m154714a(this.f102816b, pVar.f102816b) && C89219l.m154714a(this.f102817c, pVar.f102817c) && C89219l.m154714a(this.f102818d, pVar.f102818d);
    }

    public final int hashCode() {
        String str = this.f102815a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102816b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C44084m> list = this.f102817c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.f102818d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "PaymentMethodInfo(id=" + this.f102815a + ", token=" + this.f102816b + ", paymentElements=" + this.f102817c + ", isChooseSave=" + this.f102818d + ")";
    }

    public final String getId() {
        return this.f102815a;
    }

    public final List<C44084m> getPaymentElements() {
        return this.f102817c;
    }

    public final String getToken() {
        return this.f102816b;
    }

    public final Boolean isChooseSave() {
        return this.f102818d;
    }

    public final void setPaymentElements(List<C44084m> list) {
        this.f102817c = list;
    }

    public C44087p(String str, String str2, List<C44084m> list, Boolean bool) {
        this.f102815a = str;
        this.f102816b = str2;
        this.f102817c = list;
        this.f102818d = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C44087p(String str, String str2, List list, Boolean bool, int i, C89214g gVar) {
        this(str, str2, (i & 4) != 0 ? null : list, bool);
    }
}
