package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j */
public final class C43749j {

    /* renamed from: a */
    public final List<C43748i> f102008a;

    static {
        Covode.recordClassIndex(52014);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C43749j) && C89219l.m154714a(this.f102008a, ((C43749j) obj).f102008a);
        }
        return true;
    }

    public final int hashCode() {
        List<C43748i> list = this.f102008a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SummaryVO(billItems=" + this.f102008a + ")";
    }

    public C43749j(List<C43748i> list) {
        C89219l.m154721d(list, "");
        this.f102008a = list;
    }
}
