package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.fe */
public final class C46928fe {
    @AbstractC27891c(mo46611a = "rules")

    /* renamed from: a */
    public final List<C46961fz> f109361a = null;
    @AbstractC27891c(mo46611a = "interval")

    /* renamed from: b */
    public final int f109362b = 0;
    @AbstractC27891c(mo46611a = "frequency")

    /* renamed from: c */
    public final int f109363c = 0;
    @AbstractC27891c(mo46611a = "group")

    /* renamed from: d */
    public final int f109364d = 4;

    static {
        Covode.recordClassIndex(55529);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46928fe)) {
            return false;
        }
        C46928fe feVar = (C46928fe) obj;
        return C89219l.m154714a(this.f109361a, feVar.f109361a) && this.f109362b == feVar.f109362b && this.f109363c == feVar.f109363c && this.f109364d == feVar.f109364d;
    }

    public final int hashCode() {
        List<C46961fz> list = this.f109361a;
        return ((((((list != null ? list.hashCode() : 0) * 31) + this.f109362b) * 31) + this.f109363c) * 31) + this.f109364d;
    }

    public final String toString() {
        return "PopupRules(rules=" + this.f109361a + ", interval=" + this.f109362b + ", freq=" + this.f109363c + ", group=" + this.f109364d + ")";
    }

    private C46928fe() {
    }
}
