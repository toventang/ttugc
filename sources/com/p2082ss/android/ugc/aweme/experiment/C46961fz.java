package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.fz */
public final class C46961fz {
    @AbstractC27891c(mo46611a = "stage")

    /* renamed from: a */
    public final List<Integer> f109441a = null;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: b */
    public final List<Integer> f109442b = null;

    static {
        Covode.recordClassIndex(55562);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46961fz)) {
            return false;
        }
        C46961fz fzVar = (C46961fz) obj;
        return C89219l.m154714a(this.f109441a, fzVar.f109441a) && C89219l.m154714a(this.f109442b, fzVar.f109442b);
    }

    public final int hashCode() {
        List<Integer> list = this.f109441a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Integer> list2 = this.f109442b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Rules(stage=" + this.f109441a + ", duration=" + this.f109442b + ")";
    }

    private C46961fz() {
    }
}
