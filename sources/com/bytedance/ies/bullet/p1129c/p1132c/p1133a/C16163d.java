package com.bytedance.ies.bullet.p1129c.p1132c.p1133a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.a.d */
public final class C16163d {

    /* renamed from: a */
    public final AbstractC16187m f38921a;

    /* renamed from: b */
    public final boolean f38922b = false;

    static {
        Covode.recordClassIndex(18456);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16163d)) {
            return false;
        }
        C16163d dVar = (C16163d) obj;
        return C89219l.m154714a(this.f38921a, dVar.f38921a) && this.f38922b == dVar.f38922b;
    }

    public final int hashCode() {
        AbstractC16187m mVar = this.f38921a;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        boolean z = this.f38922b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "BridgeMergeOperation(otherRegistry=" + this.f38921a + ", useOthersOnConflict=" + this.f38922b + ")";
    }

    public C16163d(AbstractC16187m mVar) {
        C89219l.m154719c(mVar, "");
        this.f38921a = mVar;
    }
}
