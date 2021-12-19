package com.bytedance.android.livesdkapi.depend.model.p687c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.c.a */
public final class C11690a {

    /* renamed from: a */
    public String f27938a;

    /* renamed from: b */
    public String f27939b;

    /* renamed from: c */
    public String f27940c;

    static {
        Covode.recordClassIndex(13358);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11690a)) {
            return false;
        }
        C11690a aVar = (C11690a) obj;
        return C89219l.m154714a(this.f27938a, aVar.f27938a) && C89219l.m154714a(this.f27939b, aVar.f27939b) && C89219l.m154714a(this.f27940c, aVar.f27940c);
    }

    public final int hashCode() {
        String str = this.f27938a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27939b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27940c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "LivePlayerEntranceParam(enterFromMerge=" + this.f27938a + ", enterMethod=" + this.f27939b + ", enterAction=" + this.f27940c + ")";
    }

    public C11690a(String str, String str2, String str3) {
        this.f27938a = str;
        this.f27939b = str2;
        this.f27940c = str3;
    }
}
