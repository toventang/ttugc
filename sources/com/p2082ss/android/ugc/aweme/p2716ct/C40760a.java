package com.p2082ss.android.ugc.aweme.p2716ct;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ct.a */
public final class C40760a {
    @AbstractC27891c(mo46611a = "dialog_id")

    /* renamed from: a */
    public int f95416a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public String f95417b;
    @AbstractC27891c(mo46611a = "question")

    /* renamed from: c */
    public String f95418c;
    @AbstractC27891c(mo46611a = "answer1")

    /* renamed from: d */
    public String f95419d;
    @AbstractC27891c(mo46611a = "answer2")

    /* renamed from: e */
    public String f95420e;
    @AbstractC27891c(mo46611a = "end_title")

    /* renamed from: f */
    public String f95421f;
    @AbstractC27891c(mo46611a = "end_sub_title")

    /* renamed from: g */
    public String f95422g;
    @AbstractC27891c(mo46611a = "orig_question")

    /* renamed from: h */
    public String f95423h;
    @AbstractC27891c(mo46611a = "original_id")

    /* renamed from: i */
    public int f95424i;
    @AbstractC27891c(mo46611a = "orig_answer1")

    /* renamed from: j */
    public String f95425j;
    @AbstractC27891c(mo46611a = "orig_answer2")

    /* renamed from: k */
    public String f95426k;

    static {
        Covode.recordClassIndex(48612);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40760a)) {
            return false;
        }
        C40760a aVar = (C40760a) obj;
        return this.f95416a == aVar.f95416a && C89219l.m154714a(this.f95417b, aVar.f95417b) && C89219l.m154714a(this.f95418c, aVar.f95418c) && C89219l.m154714a(this.f95419d, aVar.f95419d) && C89219l.m154714a(this.f95420e, aVar.f95420e) && C89219l.m154714a(this.f95421f, aVar.f95421f) && C89219l.m154714a(this.f95422g, aVar.f95422g) && C89219l.m154714a(this.f95423h, aVar.f95423h) && this.f95424i == aVar.f95424i && C89219l.m154714a(this.f95425j, aVar.f95425j) && C89219l.m154714a(this.f95426k, aVar.f95426k);
    }

    public final int hashCode() {
        int i = this.f95416a * 31;
        String str = this.f95417b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f95418c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f95419d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f95420e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f95421f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f95422g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f95423h;
        int hashCode7 = (((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.f95424i) * 31;
        String str8 = this.f95425j;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f95426k;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "SurveyData(dialogId=" + this.f95416a + ", title=" + this.f95417b + ", question=" + this.f95418c + ", answer1=" + this.f95419d + ", answer2=" + this.f95420e + ", resultTitle=" + this.f95421f + ", resultDesc=" + this.f95422g + ", originalQuestion=" + this.f95423h + ", originId=" + this.f95424i + ", originAnswer1=" + this.f95425j + ", originAnswer2=" + this.f95426k + ")";
    }
}
