package com.p2082ss.android.ugc.aweme.deeplink;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.w */
public final class C41069w {

    /* renamed from: a */
    public final String f96002a;

    /* renamed from: b */
    public final String f96003b;

    static {
        Covode.recordClassIndex(48939);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41069w)) {
            return false;
        }
        C41069w wVar = (C41069w) obj;
        return C89219l.m154714a(this.f96002a, wVar.f96002a) && C89219l.m154714a(this.f96003b, wVar.f96003b);
    }

    public final int hashCode() {
        String str = this.f96002a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f96003b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProcessResult(targetNodeName=" + this.f96002a + ", result=" + this.f96003b + ")";
    }

    public C41069w(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f96002a = str;
        this.f96003b = str2;
    }
}
