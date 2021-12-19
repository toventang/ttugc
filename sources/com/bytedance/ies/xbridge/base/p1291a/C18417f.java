package com.bytedance.ies.xbridge.base.p1291a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.base.a.f */
public final class C18417f {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final String f44003a;
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: b */
    public final String f44004b;

    static {
        Covode.recordClassIndex(21089);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18417f)) {
            return false;
        }
        C18417f fVar = (C18417f) obj;
        return C89219l.m154714a(this.f44003a, fVar.f44003a) && C89219l.m154714a(this.f44004b, fVar.f44004b);
    }

    public final int hashCode() {
        String str = this.f44003a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f44004b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StorageValue(type=" + this.f44003a + ", value=" + this.f44004b + ")";
    }

    public C18417f(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f44003a = str;
        this.f44004b = str2;
    }
}
