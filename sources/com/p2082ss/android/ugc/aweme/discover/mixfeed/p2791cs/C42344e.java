package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.e */
public final class C42344e {

    /* renamed from: a */
    public final int f98644a;

    /* renamed from: b */
    public final EnumC42343d f98645b;

    static {
        Covode.recordClassIndex(50289);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42344e)) {
            return false;
        }
        C42344e eVar = (C42344e) obj;
        return this.f98644a == eVar.f98644a && C89219l.m154714a(this.f98645b, eVar.f98645b);
    }

    public final int hashCode() {
        int i = this.f98644a * 31;
        EnumC42343d dVar = this.f98645b;
        return i + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "ClickSearchFetchState(awemeIndex=" + this.f98644a + ", stage=" + this.f98645b + ")";
    }

    public C42344e(int i, EnumC42343d dVar) {
        C89219l.m154721d(dVar, "");
        this.f98644a = i;
        this.f98645b = dVar;
    }
}
