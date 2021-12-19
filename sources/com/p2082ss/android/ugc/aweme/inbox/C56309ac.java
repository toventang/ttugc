package com.p2082ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.ac */
public final class C56309ac extends AbstractC56310ad {

    /* renamed from: a */
    public final List<User> f128460a;

    /* renamed from: b */
    public final int f128461b;

    static {
        Covode.recordClassIndex(66127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56309ac)) {
            return false;
        }
        C56309ac acVar = (C56309ac) obj;
        return C89219l.m154714a(this.f128460a, acVar.f128460a) && this.f128461b == acVar.f128461b;
    }

    public final int hashCode() {
        List<User> list = this.f128460a;
        return ((list != null ? list.hashCode() : 0) * 31) + this.f128461b;
    }

    public final String toString() {
        return "RecommendUserAggregationPod(userList=" + this.f128460a + ", totalCount=" + this.f128461b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56309ac(List<? extends User> list, int i) {
        super(3);
        C89219l.m154721d(list, "");
        this.f128460a = list;
        this.f128461b = i;
    }
}
