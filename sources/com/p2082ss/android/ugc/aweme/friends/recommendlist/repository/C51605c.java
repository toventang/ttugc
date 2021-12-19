package com.p2082ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.c */
public final class C51605c {

    /* renamed from: a */
    public final String f118912a;

    /* renamed from: b */
    public final Integer f118913b;

    /* renamed from: c */
    public final Integer f118914c;

    static {
        Covode.recordClassIndex(60948);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51605c)) {
            return false;
        }
        C51605c cVar = (C51605c) obj;
        return C89219l.m154714a(this.f118912a, cVar.f118912a) && C89219l.m154714a(this.f118913b, cVar.f118913b) && C89219l.m154714a(this.f118914c, cVar.f118914c);
    }

    public final int hashCode() {
        String str = this.f118912a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f118913b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f118914c;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "MutualListUserRequestParams(secUid=" + this.f118912a + ", cursor=" + this.f118913b + ", mutualType=" + this.f118914c + ")";
    }
}
