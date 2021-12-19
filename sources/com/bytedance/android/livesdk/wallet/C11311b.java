package com.bytedance.android.livesdk.wallet;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.wallet.b */
public final class C11311b {

    /* renamed from: a */
    public final String f27052a;

    /* renamed from: b */
    public final String f27053b;

    static {
        Covode.recordClassIndex(12949);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11311b)) {
            return false;
        }
        C11311b bVar = (C11311b) obj;
        return C89219l.m154714a(this.f27052a, bVar.f27052a) && C89219l.m154714a(this.f27053b, bVar.f27053b);
    }

    public final int hashCode() {
        String str = this.f27052a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27053b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CheckOrderResultInfo(productId=" + this.f27052a + ", orderId=" + this.f27053b + ")";
    }

    private /* synthetic */ C11311b() {
        this(null, null);
    }

    public C11311b(String str, String str2) {
        this.f27052a = str;
        this.f27053b = str2;
    }
}
