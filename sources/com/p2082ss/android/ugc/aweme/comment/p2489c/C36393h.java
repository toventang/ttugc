package com.p2082ss.android.ugc.aweme.comment.p2489c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.c.h */
public final class C36393h {

    /* renamed from: a */
    public final EnumC36396k f86073a;

    /* renamed from: b */
    public final C36394i f86074b;

    static {
        Covode.recordClassIndex(43688);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36393h)) {
            return false;
        }
        C36393h hVar = (C36393h) obj;
        return C89219l.m154714a(this.f86073a, hVar.f86073a) && C89219l.m154714a(this.f86074b, hVar.f86074b);
    }

    public final int hashCode() {
        EnumC36396k kVar = this.f86073a;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        C36394i iVar = this.f86074b;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PinEvent(status=" + this.f86073a + ", notice=" + this.f86074b + ")";
    }

    public C36393h(EnumC36396k kVar, C36394i iVar) {
        C89219l.m154721d(kVar, "");
        this.f86073a = kVar;
        this.f86074b = iVar;
    }
}
