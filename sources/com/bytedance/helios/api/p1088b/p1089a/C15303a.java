package com.bytedance.helios.api.p1088b.p1089a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.AbstractC15308f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.a.a */
public final class C15303a implements AbstractC15308f {

    /* renamed from: a */
    public final String f37321a;

    /* renamed from: b */
    public final String f37322b;

    static {
        Covode.recordClassIndex(17533);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15303a)) {
            return false;
        }
        C15303a aVar = (C15303a) obj;
        return C89219l.m154714a(this.f37321a, aVar.f37321a) && C89219l.m154714a(this.f37322b, aVar.f37322b);
    }

    public final int hashCode() {
        String str = this.f37321a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f37322b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AppOpsApmEvent(apiName=" + this.f37321a + ", opsName=" + this.f37322b + ")";
    }

    public C15303a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f37321a = str;
        this.f37322b = str2;
    }
}
