package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.a */
public final class C56833a {
    @AbstractC27891c(mo46611a = "multiselect")

    /* renamed from: a */
    public final Boolean f129422a;
    @AbstractC27891c(mo46611a = "options")

    /* renamed from: b */
    public final List<C56843ac> f129423b;

    static {
        Covode.recordClassIndex(66718);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56833a)) {
            return false;
        }
        C56833a aVar = (C56833a) obj;
        return C89219l.m154714a(this.f129422a, aVar.f129422a) && C89219l.m154714a(this.f129423b, aVar.f129423b);
    }

    public final int hashCode() {
        Boolean bool = this.f129422a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<C56843ac> list = this.f129423b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Choices(multiselect=" + this.f129422a + ", options=" + this.f129423b + ")";
    }
}
