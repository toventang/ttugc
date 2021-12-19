package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;

/* renamed from: h.m.g */
public final class C89342g {

    /* renamed from: a */
    public final String f203007a;

    /* renamed from: b */
    public final C89269g f203008b;

    static {
        Covode.recordClassIndex(105426);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89342g)) {
            return false;
        }
        C89342g gVar = (C89342g) obj;
        return C89219l.m154714a(this.f203007a, gVar.f203007a) && C89219l.m154714a(this.f203008b, gVar.f203008b);
    }

    public final int hashCode() {
        String str = this.f203007a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C89269g gVar = this.f203008b;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f203007a + ", range=" + this.f203008b + ")";
    }

    public C89342g(String str, C89269g gVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(gVar, "");
        this.f203007a = str;
        this.f203008b = gVar;
    }
}
