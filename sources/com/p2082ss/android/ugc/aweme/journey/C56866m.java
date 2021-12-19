package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.m */
public final class C56866m {
    @AbstractC27891c(mo46611a = "skip_pages")

    /* renamed from: a */
    public final List<Integer> f129492a;

    static {
        Covode.recordClassIndex(66752);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C56866m) && C89219l.m154714a(this.f129492a, ((C56866m) obj).f129492a);
        }
        return true;
    }

    public final int hashCode() {
        List<Integer> list = this.f129492a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "JourneyFlow(skip_pages=" + this.f129492a + ")";
    }
}
