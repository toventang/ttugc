package com.p2082ss.android.ugc.aweme.comment.p2489c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.c.a */
public final class C36385a implements AbstractC81914b {

    /* renamed from: a */
    public final Integer f86057a;

    /* renamed from: b */
    public final Integer f86058b;

    static {
        Covode.recordClassIndex(43680);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36385a)) {
            return false;
        }
        C36385a aVar = (C36385a) obj;
        return C89219l.m154714a(this.f86057a, aVar.f86057a) && C89219l.m154714a(this.f86058b, aVar.f86058b);
    }

    public final int hashCode() {
        Integer num = this.f86057a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f86058b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CachedCommentsExpandEvent(index=" + this.f86057a + ", distance=" + this.f86058b + ")";
    }

    public C36385a(Integer num, Integer num2) {
        this.f86057a = num;
        this.f86058b = num2;
    }
}
