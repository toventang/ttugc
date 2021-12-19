package com.p2082ss.android.ugc.aweme.discover.lynx.container;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.container.a */
public final class C42201a {
    @AbstractC27891c(mo46611a = "card_type")

    /* renamed from: a */
    public final int f98364a;
    @AbstractC27891c(mo46611a = "dynamic_data")

    /* renamed from: b */
    public final C42345d f98365b;

    static {
        Covode.recordClassIndex(50141);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42201a)) {
            return false;
        }
        C42201a aVar = (C42201a) obj;
        return this.f98364a == aVar.f98364a && C89219l.m154714a(this.f98365b, aVar.f98365b);
    }

    public final int hashCode() {
        int i = this.f98364a * 31;
        C42345d dVar = this.f98365b;
        return i + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicData(cardType=" + this.f98364a + ", dynamicPatch=" + this.f98365b + ")";
    }

    public /* synthetic */ C42201a(C42345d dVar) {
        this(C42202b.f98366a, dVar);
    }

    private C42201a(int i, C42345d dVar) {
        C89219l.m154721d(dVar, "");
        this.f98364a = i;
        this.f98365b = dVar;
    }
}
