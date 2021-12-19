package com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.j */
public final class C35583j {

    /* renamed from: a */
    public EnumC35584k f83911a;

    /* renamed from: b */
    public EnumC35571c f83912b;

    /* renamed from: c */
    public EnumC35572d f83913c;

    /* renamed from: d */
    public String f83914d;

    /* renamed from: e */
    public String f83915e;

    /* renamed from: f */
    public final ChallengeDetailParam f83916f;

    static {
        Covode.recordClassIndex(42807);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35583j)) {
            return false;
        }
        C35583j jVar = (C35583j) obj;
        return C89219l.m154714a(this.f83911a, jVar.f83911a) && C89219l.m154714a(this.f83912b, jVar.f83912b) && C89219l.m154714a(this.f83913c, jVar.f83913c) && C89219l.m154714a(this.f83914d, jVar.f83914d) && C89219l.m154714a(this.f83915e, jVar.f83915e) && C89219l.m154714a(this.f83916f, jVar.f83916f);
    }

    public final int hashCode() {
        EnumC35584k kVar = this.f83911a;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        EnumC35571c cVar = this.f83912b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        EnumC35572d dVar = this.f83913c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str = this.f83914d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f83915e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ChallengeDetailParam challengeDetailParam = this.f83916f;
        if (challengeDetailParam != null) {
            i = challengeDetailParam.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "HeaderParam(headerType=" + this.f83911a + ", attrsType=" + this.f83912b + ", buttonType=" + this.f83913c + ", enterFrom=" + this.f83914d + ", processId=" + this.f83915e + ", detailParam=" + this.f83916f + ")";
    }

    public /* synthetic */ C35583j(String str, String str2, ChallengeDetailParam challengeDetailParam) {
        this(EnumC35584k.TYPE_NORMAL, EnumC35571c.TYPE_LINK, EnumC35572d.TYPE_NORMAL, str, str2, challengeDetailParam);
    }

    private C35583j(EnumC35584k kVar, EnumC35571c cVar, EnumC35572d dVar, String str, String str2, ChallengeDetailParam challengeDetailParam) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(challengeDetailParam, "");
        this.f83911a = kVar;
        this.f83912b = cVar;
        this.f83913c = dVar;
        this.f83914d = str;
        this.f83915e = str2;
        this.f83916f = challengeDetailParam;
    }
}
