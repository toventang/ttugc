package com.p2082ss.android.ugc.aweme.qna.api;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.api.c */
public final class C66006c implements AbstractC12779c {

    /* renamed from: a */
    public final String f148592a;

    /* renamed from: b */
    public final String f148593b;

    /* renamed from: c */
    public final String f148594c;

    static {
        Covode.recordClassIndex(77512);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66006c)) {
            return false;
        }
        C66006c cVar = (C66006c) obj;
        return C89219l.m154714a(this.f148592a, cVar.f148592a) && C89219l.m154714a(this.f148593b, cVar.f148593b) && C89219l.m154714a(this.f148594c, cVar.f148594c);
    }

    public final int hashCode() {
        String str = this.f148592a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f148593b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f148594c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "QnaProfileDetail(enterFrom=" + this.f148592a + ", enterMethod=" + this.f148593b + ", authorId=" + this.f148594c + ")";
    }

    public C66006c(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f148592a = str;
        this.f148593b = str2;
        this.f148594c = str3;
    }
}
