package com.bytedance.ies.powerlist.debug;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.debug.a */
public final class C17651a {

    /* renamed from: a */
    public final AbstractC89172b<C17652b, C89391z> f42216a;

    static {
        Covode.recordClassIndex(20205);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C17651a) && C89219l.m154714a(this.f42216a, ((C17651a) obj).f42216a);
        }
        return true;
    }

    public final int hashCode() {
        AbstractC89172b<C17652b, C89391z> bVar = this.f42216a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FpsAbility(onMonitorFps=" + this.f42216a + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.bytedance.ies.powerlist.debug.b, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17651a(AbstractC89172b<? super C17652b, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        this.f42216a = bVar;
    }
}
