package com.p2082ss.android.ugc.tools.p4346h.p4347a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.a.q */
public final class C84460q {

    /* renamed from: a */
    public final String f188791a;

    /* renamed from: b */
    public final String f188792b;

    static {
        Covode.recordClassIndex(98425);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84460q)) {
            return false;
        }
        C84460q qVar = (C84460q) obj;
        return C89219l.m154714a(this.f188791a, qVar.f188791a) && C89219l.m154714a(this.f188792b, qVar.f188792b);
    }

    public final int hashCode() {
        String str = this.f188791a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f188792b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SimpleDownloaderKey(url=" + this.f188791a + ", destFilePath=" + this.f188792b + ")";
    }

    public C84460q(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f188791a = str;
        this.f188792b = str2;
    }
}
