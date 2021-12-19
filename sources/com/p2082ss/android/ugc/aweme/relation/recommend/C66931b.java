package com.p2082ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66991l;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.relation.recommend.b */
public final class C66931b extends C66990k {

    /* renamed from: a */
    public final String f150224a;

    /* renamed from: b */
    public final String f150225b;

    static {
        Covode.recordClassIndex(78508);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66931b)) {
            return false;
        }
        C66931b bVar = (C66931b) obj;
        return C89219l.m154714a(this.f150224a, bVar.f150224a) && C89219l.m154714a(this.f150225b, bVar.f150225b);
    }

    public final int hashCode() {
        String str = this.f150224a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f150225b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "HeaderItem(title=" + this.f150224a + ", subTitle=" + this.f150225b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66931b(String str, String str2) {
        super(C66991l.EnumC66992a.HEADER);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f150224a = str;
        this.f150225b = str2;
    }
}
