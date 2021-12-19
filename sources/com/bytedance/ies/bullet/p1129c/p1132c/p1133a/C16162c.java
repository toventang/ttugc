package com.bytedance.ies.bullet.p1129c.p1132c.p1133a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.a.c */
public final class C16162c {

    /* renamed from: a */
    public final String f38917a;

    /* renamed from: b */
    public final Object f38918b;

    /* renamed from: c */
    public final AbstractC16192q.AbstractC16193a f38919c;

    /* renamed from: d */
    public final AbstractC89172b<Throwable, C89391z> f38920d;

    static {
        Covode.recordClassIndex(18455);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16162c)) {
            return false;
        }
        C16162c cVar = (C16162c) obj;
        return C89219l.m154714a(this.f38917a, cVar.f38917a) && C89219l.m154714a(this.f38918b, cVar.f38918b) && C89219l.m154714a(this.f38919c, cVar.f38919c) && C89219l.m154714a(this.f38920d, cVar.f38920d);
    }

    public final int hashCode() {
        String str = this.f38917a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Object obj = this.f38918b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        AbstractC16192q.AbstractC16193a aVar = this.f38919c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC89172b<Throwable, C89391z> bVar = this.f38920d;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "BridgeHandleUnit(funcName=" + this.f38917a + ", params=" + this.f38918b + ", callback=" + this.f38919c + ", reject=" + this.f38920d + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C16162c(String str, Object obj, AbstractC16192q.AbstractC16193a aVar, AbstractC89172b<? super Throwable, C89391z> bVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(obj, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(bVar, "");
        this.f38917a = str;
        this.f38918b = obj;
        this.f38919c = aVar;
        this.f38920d = bVar;
    }
}
