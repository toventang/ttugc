package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.t */
public final class C35919t {

    /* renamed from: a */
    public final AbstractC89171a<C89391z> f84772a;

    /* renamed from: b */
    public final AbstractC89172b<C35917s, C89391z> f84773b;

    static {
        Covode.recordClassIndex(43159);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35919t)) {
            return false;
        }
        C35919t tVar = (C35919t) obj;
        return C89219l.m154714a(this.f84772a, tVar.f84772a) && C89219l.m154714a(this.f84773b, tVar.f84773b);
    }

    public final int hashCode() {
        AbstractC89171a<C89391z> aVar = this.f84772a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        AbstractC89172b<C35917s, C89391z> bVar = this.f84773b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CloseChooseMusicEvent(closeAnimEndFun=" + this.f84772a + ", chooseMusicResultFun=" + this.f84773b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.choosemusic.model.s, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C35919t(AbstractC89171a<C89391z> aVar, AbstractC89172b<? super C35917s, C89391z> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f84772a = aVar;
        this.f84773b = bVar;
    }
}
