package com.p2082ss.android.ugc.aweme.qna.p3646d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.d.l */
public final class C66058l {

    /* renamed from: a */
    public final String f148757a;

    /* renamed from: b */
    public final C66025a f148758b;

    static {
        Covode.recordClassIndex(77564);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66058l)) {
            return false;
        }
        C66058l lVar = (C66058l) obj;
        return C89219l.m154714a(this.f148757a, lVar.f148757a) && C89219l.m154714a(this.f148758b, lVar.f148758b);
    }

    public final int hashCode() {
        String str = this.f148757a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C66025a aVar = this.f148758b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TranslationRequest(questionId=" + this.f148757a + ", multiTranslationBody=" + this.f148758b + ")";
    }

    public C66058l(String str, C66025a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.f148757a = str;
        this.f148758b = aVar;
    }
}
