package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.al */
public final class C38226al {
    @AbstractC27891c(mo46611a = "multiselect")

    /* renamed from: a */
    public final int f90311a;
    @AbstractC27891c(mo46611a = "depth")

    /* renamed from: b */
    public final int f90312b;
    @AbstractC27891c(mo46611a = "options")

    /* renamed from: c */
    public final List<C38225ak> f90313c;
    @AbstractC27891c(mo46611a = "selected")

    /* renamed from: d */
    public final List<Integer> f90314d;

    static {
        Covode.recordClassIndex(45710);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38226al)) {
            return false;
        }
        C38226al alVar = (C38226al) obj;
        return this.f90311a == alVar.f90311a && this.f90312b == alVar.f90312b && C89219l.m154714a(this.f90313c, alVar.f90313c) && C89219l.m154714a(this.f90314d, alVar.f90314d);
    }

    public final int hashCode() {
        int i = ((this.f90311a * 31) + this.f90312b) * 31;
        List<C38225ak> list = this.f90313c;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        List<Integer> list2 = this.f90314d;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OptionListParams(multiSelect=" + this.f90311a + ", depth=" + this.f90312b + ", options=" + this.f90313c + ", selected=" + this.f90314d + ")";
    }
}
