package com.p2082ss.android.ugc.aweme.comment.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.ah */
public final class C36215ah {

    /* renamed from: a */
    public final String f85527a;

    /* renamed from: b */
    public final Aweme f85528b;

    /* renamed from: c */
    public final String f85529c;

    static {
        Covode.recordClassIndex(43481);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36215ah)) {
            return false;
        }
        C36215ah ahVar = (C36215ah) obj;
        return C89219l.m154714a(this.f85527a, ahVar.f85527a) && C89219l.m154714a(this.f85528b, ahVar.f85528b) && C89219l.m154714a(this.f85529c, ahVar.f85529c);
    }

    public final int hashCode() {
        String str = this.f85527a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Aweme aweme = this.f85528b;
        int hashCode2 = (hashCode + (aweme != null ? aweme.hashCode() : 0)) * 31;
        String str2 = this.f85529c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "LikeParams(aid=" + this.f85527a + ", aweme=" + this.f85528b + ", enterFrom=" + this.f85529c + ")";
    }

    public /* synthetic */ C36215ah() {
        this("", null, "");
    }

    public C36215ah(String str, Aweme aweme, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f85527a = str;
        this.f85528b = aweme;
        this.f85529c = str2;
    }
}
