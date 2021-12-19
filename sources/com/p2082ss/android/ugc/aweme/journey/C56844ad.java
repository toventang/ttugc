package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.ad */
public final class C56844ad {
    @AbstractC27891c(mo46611a = "steps")

    /* renamed from: a */
    public final List<C56840aa> f129440a;

    static {
        Covode.recordClassIndex(66729);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C56844ad) && C89219l.m154714a(this.f129440a, ((C56844ad) obj).f129440a);
        }
        return true;
    }

    public final int hashCode() {
        List<C56840aa> list = this.f129440a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OrderedFlow(steps=" + this.f129440a + ")";
    }
}
