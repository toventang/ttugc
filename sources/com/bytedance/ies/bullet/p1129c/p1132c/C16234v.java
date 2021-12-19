package com.bytedance.ies.bullet.p1129c.p1132c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.v */
public final class C16234v {

    /* renamed from: a */
    public final AbstractC16208i f39029a;

    /* renamed from: b */
    public final boolean f39030b;

    static {
        Covode.recordClassIndex(18527);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16234v)) {
            return false;
        }
        C16234v vVar = (C16234v) obj;
        return C89219l.m154714a(this.f39029a, vVar.f39029a) && this.f39030b == vVar.f39030b;
    }

    public final int hashCode() {
        AbstractC16208i iVar = this.f39029a;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        boolean z = this.f39030b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "KitProcessResult(instance=" + this.f39029a + ", isNewInstance=" + this.f39030b + ")";
    }

    public C16234v(AbstractC16208i iVar, boolean z) {
        C89219l.m154719c(iVar, "");
        this.f39029a = iVar;
        this.f39030b = z;
    }
}
