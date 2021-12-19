package com.bytedance.android.livesdk.wallet;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.wallet.a */
public final class C11309a {

    /* renamed from: a */
    public final String f27042a;

    /* renamed from: b */
    public final String f27043b;

    static {
        Covode.recordClassIndex(12947);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11309a)) {
            return false;
        }
        C11309a aVar = (C11309a) obj;
        return C89219l.m154714a(this.f27042a, aVar.f27042a) && C89219l.m154714a(this.f27043b, aVar.f27043b);
    }

    public final int hashCode() {
        String str = this.f27042a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27043b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AmazonUserdata(mUserId=" + this.f27042a + ", mUserMarkPlace=" + this.f27043b + ")";
    }

    public C11309a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f27042a = str;
        this.f27043b = str2;
    }
}
