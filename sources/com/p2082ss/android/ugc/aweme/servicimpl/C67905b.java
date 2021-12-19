package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.b */
public final class C67905b {

    /* renamed from: a */
    public final AbstractC89171a<Boolean> f152094a;

    /* renamed from: b */
    public final ShortVideoContext f152095b;

    /* renamed from: c */
    public final AbstractC89171a<C89391z> f152096c;

    /* renamed from: d */
    public final AbstractC89172b<Boolean, C89391z> f152097d;

    /* renamed from: e */
    public final AbstractC89172b<Integer, Integer> f152098e;

    static {
        Covode.recordClassIndex(80074);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67905b)) {
            return false;
        }
        C67905b bVar = (C67905b) obj;
        return C89219l.m154714a(this.f152094a, bVar.f152094a) && C89219l.m154714a(this.f152095b, bVar.f152095b) && C89219l.m154714a(this.f152096c, bVar.f152096c) && C89219l.m154714a(this.f152097d, bVar.f152097d) && C89219l.m154714a(this.f152098e, bVar.f152098e);
    }

    public final int hashCode() {
        AbstractC89171a<Boolean> aVar = this.f152094a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        ShortVideoContext shortVideoContext = this.f152095b;
        int hashCode2 = (hashCode + (shortVideoContext != null ? shortVideoContext.hashCode() : 0)) * 31;
        AbstractC89171a<C89391z> aVar2 = this.f152096c;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        AbstractC89172b<Boolean, C89391z> bVar = this.f152097d;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        AbstractC89172b<Integer, Integer> bVar2 = this.f152098e;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "AddLiveModuleFunctionContext(isSupportLive=" + this.f152094a + ", shortVideoContext=" + this.f152095b + ", mobWithoutLiveForSetting=" + this.f152096c + ", mobWithoutLiveForApi=" + this.f152097d + ", getLiveIndex=" + this.f152098e + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public C67905b(AbstractC89171a<Boolean> aVar, ShortVideoContext shortVideoContext, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC89172b<? super Integer, Integer> bVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f152094a = aVar;
        this.f152095b = shortVideoContext;
        this.f152096c = aVar2;
        this.f152097d = bVar;
        this.f152098e = bVar2;
    }
}
