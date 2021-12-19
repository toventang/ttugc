package com.p2082ss.android.ugc.aweme.question.p3666h.p3667a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.question.model.QuestionDetailParam;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.h.a.c */
public final class C66539c {

    /* renamed from: a */
    public EnumC66540d f149609a;

    /* renamed from: b */
    public EnumC66537a f149610b;

    /* renamed from: c */
    public EnumC66538b f149611c;

    /* renamed from: d */
    public String f149612d;

    /* renamed from: e */
    public String f149613e;

    /* renamed from: f */
    public final QuestionDetailParam f149614f;

    static {
        Covode.recordClassIndex(78082);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66539c)) {
            return false;
        }
        C66539c cVar = (C66539c) obj;
        return C89219l.m154714a(this.f149609a, cVar.f149609a) && C89219l.m154714a(this.f149610b, cVar.f149610b) && C89219l.m154714a(this.f149611c, cVar.f149611c) && C89219l.m154714a(this.f149612d, cVar.f149612d) && C89219l.m154714a(this.f149613e, cVar.f149613e) && C89219l.m154714a(this.f149614f, cVar.f149614f);
    }

    public final int hashCode() {
        EnumC66540d dVar = this.f149609a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        EnumC66537a aVar = this.f149610b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        EnumC66538b bVar = this.f149611c;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f149612d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f149613e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        QuestionDetailParam questionDetailParam = this.f149614f;
        if (questionDetailParam != null) {
            i = questionDetailParam.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "HeaderParam(headerType=" + this.f149609a + ", attrsType=" + this.f149610b + ", buttonType=" + this.f149611c + ", enterFrom=" + this.f149612d + ", processId=" + this.f149613e + ", detailParam=" + this.f149614f + ")";
    }

    public /* synthetic */ C66539c(String str, String str2, QuestionDetailParam questionDetailParam) {
        this(EnumC66540d.TYPE_NORMAL, EnumC66537a.TYPE_LINK, EnumC66538b.TYPE_NORMAL, str, str2, questionDetailParam);
    }

    private C66539c(EnumC66540d dVar, EnumC66537a aVar, EnumC66538b bVar, String str, String str2, QuestionDetailParam questionDetailParam) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(questionDetailParam, "");
        this.f149609a = dVar;
        this.f149610b = aVar;
        this.f149611c = bVar;
        this.f149612d = str;
        this.f149613e = str2;
        this.f149614f = questionDetailParam;
    }
}
