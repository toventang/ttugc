package com.p2082ss.android.ugc.aweme.search.survey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.survey.e */
public final class C67756e {
    @AbstractC27891c(mo46611a = "survey_id")

    /* renamed from: a */
    public final String f151847a;
    @AbstractC27891c(mo46611a = "search_id")

    /* renamed from: b */
    public final String f151848b;
    @AbstractC27891c(mo46611a = "keyword")

    /* renamed from: c */
    public final String f151849c;
    @AbstractC27891c(mo46611a = "survey_answer_rating")

    /* renamed from: d */
    public final int f151850d;

    static {
        Covode.recordClassIndex(79407);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67756e)) {
            return false;
        }
        C67756e eVar = (C67756e) obj;
        return C89219l.m154714a(this.f151847a, eVar.f151847a) && C89219l.m154714a(this.f151848b, eVar.f151848b) && C89219l.m154714a(this.f151849c, eVar.f151849c) && this.f151850d == eVar.f151850d;
    }

    public final int hashCode() {
        String str = this.f151847a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f151848b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f151849c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f151850d;
    }

    public final String toString() {
        return "SurveySubmitParam(surveyId=" + this.f151847a + ", searchId=" + this.f151848b + ", keyword=" + this.f151849c + ", ratingAnswer=" + this.f151850d + ")";
    }

    public C67756e(String str, String str2, String str3, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f151847a = str;
        this.f151848b = str2;
        this.f151849c = str3;
        this.f151850d = i;
    }
}
