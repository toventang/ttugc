package com.p2082ss.android.ugc.aweme.interest;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.interest.b */
public final class C56801b {

    /* renamed from: a */
    public final int f129363a;

    /* renamed from: b */
    public final String f129364b;

    /* renamed from: c */
    public final int f129365c;

    static {
        Covode.recordClassIndex(66667);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56801b)) {
            return false;
        }
        C56801b bVar = (C56801b) obj;
        return this.f129363a == bVar.f129363a && C89219l.m154714a(this.f129364b, bVar.f129364b) && this.f129365c == bVar.f129365c;
    }

    public final int hashCode() {
        int i = this.f129363a * 31;
        String str = this.f129364b;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.f129365c;
    }

    public final String toString() {
        return "SelectedInterestInfo(categoryPosition=" + this.f129363a + ", interestId=" + this.f129364b + ", interestPosition=" + this.f129365c + ")";
    }

    public C56801b(int i, String str, int i2) {
        C89219l.m154721d(str, "");
        this.f129363a = i;
        this.f129364b = str;
        this.f129365c = i2;
    }
}
