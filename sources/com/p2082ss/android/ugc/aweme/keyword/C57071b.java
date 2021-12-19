package com.p2082ss.android.ugc.aweme.keyword;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.keyword.b */
public final class C57071b {

    /* renamed from: a */
    public final String f129938a;

    /* renamed from: b */
    public final String f129939b;

    static {
        Covode.recordClassIndex(66965);
    }

    public C57071b() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57071b)) {
            return false;
        }
        C57071b bVar = (C57071b) obj;
        return C89219l.m154714a(this.f129938a, bVar.f129938a) && C89219l.m154714a(this.f129939b, bVar.f129939b);
    }

    public final int hashCode() {
        String str = this.f129938a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f129939b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchKeywordBean(keyword=" + this.f129938a + ", correctWord=" + this.f129939b + ")";
    }

    public C57071b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f129938a = str;
        this.f129939b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C57071b(String str, String str2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
