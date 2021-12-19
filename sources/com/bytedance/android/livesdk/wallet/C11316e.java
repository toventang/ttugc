package com.bytedance.android.livesdk.wallet;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.wallet.e */
public final class C11316e {

    /* renamed from: a */
    public final String f27067a;

    /* renamed from: b */
    public final String f27068b;

    /* renamed from: c */
    public final String f27069c;

    static {
        Covode.recordClassIndex(12954);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11316e)) {
            return false;
        }
        C11316e eVar = (C11316e) obj;
        return C89219l.m154714a(this.f27067a, eVar.f27067a) && C89219l.m154714a(this.f27068b, eVar.f27068b) && C89219l.m154714a(this.f27069c, eVar.f27069c);
    }

    public final int hashCode() {
        String str = this.f27067a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27068b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27069c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "PayResultInfo(productId=" + this.f27067a + ", orderId=" + this.f27068b + ", userId=" + this.f27069c + ")";
    }

    private /* synthetic */ C11316e() {
        this(null, null, null);
    }

    public C11316e(String str, String str2, String str3) {
        this.f27067a = str;
        this.f27068b = str2;
        this.f27069c = str3;
    }
}
