package com.p2082ss.android.ugc.aweme.interest;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.journey.C57054w;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.interest.d */
public final class C56804d {
    @AbstractC27891c(mo46611a = "recommend_group")

    /* renamed from: a */
    public final Integer f129367a;
    @AbstractC27891c(mo46611a = "interest_list")

    /* renamed from: b */
    public final List<C57054w> f129368b;
    @AbstractC27891c(mo46611a = "select_duration")

    /* renamed from: c */
    public final int f129369c;

    static {
        Covode.recordClassIndex(66670);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56804d)) {
            return false;
        }
        C56804d dVar = (C56804d) obj;
        return C89219l.m154714a(this.f129367a, dVar.f129367a) && C89219l.m154714a(this.f129368b, dVar.f129368b) && this.f129369c == dVar.f129369c;
    }

    public final int hashCode() {
        Integer num = this.f129367a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<C57054w> list = this.f129368b;
        if (list != null) {
            i = list.hashCode();
        }
        return ((hashCode + i) * 31) + this.f129369c;
    }

    public final String toString() {
        return "UpdateInterestList(recommend_group=" + this.f129367a + ", interest_list=" + this.f129368b + ", select_duration=" + this.f129369c + ")";
    }

    public C56804d(Integer num, List<C57054w> list, int i) {
        C89219l.m154721d(list, "");
        this.f129367a = num;
        this.f129368b = list;
        this.f129369c = i;
    }
}
