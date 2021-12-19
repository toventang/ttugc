package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h */
public final class C44064h {

    /* renamed from: a */
    public final C44086o f102707a;

    /* renamed from: b */
    public boolean f102708b;

    /* renamed from: c */
    public int f102709c;

    static {
        Covode.recordClassIndex(52370);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C44064h m86903a(C44086o oVar, boolean z, int i) {
        C89219l.m154721d(oVar, "");
        return new C44064h(oVar, z, i);
    }

    public final int hashCode() {
        C44086o oVar = this.f102707a;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        boolean z = this.f102708b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((hashCode + i) * 31) + this.f102709c;
    }

    public final String toString() {
        return "PaymentMethodVO(paymentMethod=" + this.f102707a + ", need_verify=" + this.f102708b + ", rank=" + this.f102709c + ")";
    }

    public /* synthetic */ C44064h(C44086o oVar) {
        this(oVar, false, 0);
    }

    public final boolean equals(Object obj) {
        if (System.identityHashCode(this) == System.identityHashCode(obj)) {
            return true;
        }
        return false;
    }

    private C44064h(C44086o oVar, boolean z, int i) {
        C89219l.m154721d(oVar, "");
        this.f102707a = oVar;
        this.f102708b = z;
        this.f102709c = i;
    }
}
