package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.af */
public final class C56846af {
    @AbstractC27891c(mo46611a = "interest_list")

    /* renamed from: a */
    public final List<C57054w> f129448a;
    @AbstractC27891c(mo46611a = "recommend_group")

    /* renamed from: b */
    public final Integer f129449b;
    @AbstractC27891c(mo46611a = "special_type")

    /* renamed from: c */
    public final Integer f129450c;
    @AbstractC27891c(mo46611a = "select_duration")

    /* renamed from: d */
    public final Integer f129451d;
    @AbstractC27891c(mo46611a = "select_interest_type")

    /* renamed from: e */
    public final Integer f129452e;

    static {
        Covode.recordClassIndex(66731);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56846af)) {
            return false;
        }
        C56846af afVar = (C56846af) obj;
        return C89219l.m154714a(this.f129448a, afVar.f129448a) && C89219l.m154714a(this.f129449b, afVar.f129449b) && C89219l.m154714a(this.f129450c, afVar.f129450c) && C89219l.m154714a(this.f129451d, afVar.f129451d) && C89219l.m154714a(this.f129452e, afVar.f129452e);
    }

    public final int hashCode() {
        List<C57054w> list = this.f129448a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.f129449b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f129450c;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f129451d;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f129452e;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "SelectedInterestList(interest_list=" + this.f129448a + ", recommend_group=" + this.f129449b + ", special_type=" + this.f129450c + ", select_duration=" + this.f129451d + ", select_interest_type=" + this.f129452e + ")";
    }

    public /* synthetic */ C56846af(List list, Integer num, Integer num2, Integer num3) {
        this(list, num, num2, num3, 0);
    }

    private C56846af(List<C57054w> list, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f129448a = list;
        this.f129449b = num;
        this.f129450c = num2;
        this.f129451d = num3;
        this.f129452e = num4;
    }
}
