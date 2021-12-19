package com.bytedance.android.livesdk.p604qa;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.ai */
public final class C10191ai {
    @AbstractC27891c(mo46611a = "unanswered_list")

    /* renamed from: a */
    public final C10190ah f24699a;
    @AbstractC27891c(mo46611a = "answered_list")

    /* renamed from: b */
    public C10190ah f24700b;
    @AbstractC27891c(mo46611a = "current_question")

    /* renamed from: c */
    public C10188af f24701c;

    static {
        Covode.recordClassIndex(11757);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10191ai)) {
            return false;
        }
        C10191ai aiVar = (C10191ai) obj;
        return C89219l.m154714a(this.f24699a, aiVar.f24699a) && C89219l.m154714a(this.f24700b, aiVar.f24700b) && C89219l.m154714a(this.f24701c, aiVar.f24701c);
    }

    public final int hashCode() {
        C10190ah ahVar = this.f24699a;
        int i = 0;
        int hashCode = (ahVar != null ? ahVar.hashCode() : 0) * 31;
        C10190ah ahVar2 = this.f24700b;
        int hashCode2 = (hashCode + (ahVar2 != null ? ahVar2.hashCode() : 0)) * 31;
        C10188af afVar = this.f24701c;
        if (afVar != null) {
            i = afVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "QuestionListResponse(unansweredList=" + this.f24699a + ", answeredList=" + this.f24700b + ", currentQuestion=" + this.f24701c + ")";
    }

    private /* synthetic */ C10191ai() {
        this(new C10190ah(), new C10190ah(), new C10188af(null, 7));
    }

    private C10191ai(C10190ah ahVar, C10190ah ahVar2, C10188af afVar) {
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(ahVar2, "");
        C89219l.m154721d(afVar, "");
        this.f24699a = ahVar;
        this.f24700b = ahVar2;
        this.f24701c = afVar;
    }
}
