package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ak */
public final class C38225ak {
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    public final String f90309a;
    @AbstractC27891c(mo46611a = "children")

    /* renamed from: b */
    public final List<C38225ak> f90310b;

    static {
        Covode.recordClassIndex(45709);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38225ak)) {
            return false;
        }
        C38225ak akVar = (C38225ak) obj;
        return C89219l.m154714a(this.f90309a, akVar.f90309a) && C89219l.m154714a(this.f90310b, akVar.f90310b);
    }

    public final int hashCode() {
        String str = this.f90309a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C38225ak> list = this.f90310b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OptionListItemParams(name=" + this.f90309a + ", children=" + this.f90310b + ")";
    }
}
