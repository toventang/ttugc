package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f */
public final class C44077f {
    @AbstractC27891c(mo46611a = "redirect_url")

    /* renamed from: a */
    public final String f102756a;
    @AbstractC27891c(mo46611a = "pay_result")

    /* renamed from: b */
    public final EnumC44082k f102757b;
    @AbstractC27891c(mo46611a = "pay_error_toast")

    /* renamed from: c */
    public final C44079h f102758c;
    @AbstractC27891c(mo46611a = "package_name")

    /* renamed from: d */
    public final String f102759d = null;

    static {
        Covode.recordClassIndex(52388);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44077f)) {
            return false;
        }
        C44077f fVar = (C44077f) obj;
        return C89219l.m154714a(this.f102756a, fVar.f102756a) && C89219l.m154714a(this.f102757b, fVar.f102757b) && C89219l.m154714a(this.f102758c, fVar.f102758c) && C89219l.m154714a(this.f102759d, fVar.f102759d);
    }

    public final int hashCode() {
        String str = this.f102756a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        EnumC44082k kVar = this.f102757b;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C44079h hVar = this.f102758c;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        String str2 = this.f102759d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "NewPayInfo(redirectUrl=" + this.f102756a + ", payResult=" + this.f102757b + ", payErrorToast=" + this.f102758c + ", packageName=" + this.f102759d + ")";
    }

    public C44077f(String str, EnumC44082k kVar, C44079h hVar) {
        this.f102756a = str;
        this.f102757b = kVar;
        this.f102758c = hVar;
    }
}
