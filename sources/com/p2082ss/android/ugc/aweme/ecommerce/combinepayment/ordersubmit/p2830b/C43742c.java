package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c */
public final class C43742c {

    /* renamed from: a */
    public final C44086o f101970a;

    /* renamed from: b */
    public final List<C44086o> f101971b;

    /* renamed from: c */
    public final List<String> f101972c;

    /* renamed from: d */
    public final String f101973d;

    /* renamed from: e */
    public final boolean f101974e;

    /* renamed from: f */
    public final boolean f101975f;

    static {
        Covode.recordClassIndex(52007);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43742c)) {
            return false;
        }
        C43742c cVar = (C43742c) obj;
        return C89219l.m154714a(this.f101970a, cVar.f101970a) && C89219l.m154714a(this.f101971b, cVar.f101971b) && C89219l.m154714a(this.f101972c, cVar.f101972c) && C89219l.m154714a(this.f101973d, cVar.f101973d) && this.f101974e == cVar.f101974e && this.f101975f == cVar.f101975f;
    }

    public final int hashCode() {
        C44086o oVar = this.f101970a;
        int i = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        List<C44086o> list = this.f101971b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f101972c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f101973d;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f101974e;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        if (!this.f101975f) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public final String toString() {
        return "PaymentInfoVO(recommendedPayment=" + this.f101970a + ", paymentMethodList=" + this.f101971b + ", methodsPhotos=" + this.f101972c + ", paymentMethodText=" + this.f101973d + ", hasStoredMethod=" + this.f101974e + ", reachable=" + this.f101975f + ")";
    }

    public C43742c(C44086o oVar, List<C44086o> list, List<String> list2, String str, boolean z, boolean z2) {
        this.f101970a = oVar;
        this.f101971b = list;
        this.f101972c = list2;
        this.f101973d = str;
        this.f101974e = z;
        this.f101975f = z2;
    }
}
