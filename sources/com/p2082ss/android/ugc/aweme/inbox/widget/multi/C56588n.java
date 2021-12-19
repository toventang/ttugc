package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.n */
public final class C56588n {

    /* renamed from: a */
    public final EnumC56589o f129020a;

    /* renamed from: b */
    public final int f129021b;

    static {
        Covode.recordClassIndex(66411);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56588n)) {
            return false;
        }
        C56588n nVar = (C56588n) obj;
        return C89219l.m154714a(this.f129020a, nVar.f129020a) && this.f129021b == nVar.f129021b;
    }

    public final int hashCode() {
        EnumC56589o oVar = this.f129020a;
        return ((oVar != null ? oVar.hashCode() : 0) * 31) + this.f129021b;
    }

    public final String toString() {
        return "RedPoint(type=" + this.f129020a + ", unreadCount=" + this.f129021b + ")";
    }

    public /* synthetic */ C56588n(EnumC56589o oVar) {
        this(oVar, 0);
    }

    public C56588n(EnumC56589o oVar, int i) {
        C89219l.m154721d(oVar, "");
        this.f129020a = oVar;
        this.f129021b = i;
    }
}
