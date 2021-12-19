package com.bytedance.android.livesdk.wallet;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.wallet.g */
public final class C11318g {

    /* renamed from: a */
    public String f27071a;

    /* renamed from: b */
    public String f27072b;

    static {
        Covode.recordClassIndex(12956);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11318g)) {
            return false;
        }
        C11318g gVar = (C11318g) obj;
        return C89219l.m154714a(this.f27071a, gVar.f27071a) && C89219l.m154714a(this.f27072b, gVar.f27072b);
    }

    public final int hashCode() {
        String str = this.f27071a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27072b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RechargeFailInfo(productId=" + this.f27071a + ", orderId=" + this.f27072b + ")";
    }

    private /* synthetic */ C11318g() {
        this("", "");
    }

    public C11318g(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f27071a = str;
        this.f27072b = str2;
    }
}
