package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.gq */
public final class C46984gq {
    @AbstractC27891c(mo46611a = "source_language")

    /* renamed from: a */
    public String f109483a;
    @AbstractC27891c(mo46611a = "target_language")

    /* renamed from: b */
    public String f109484b;
    @AbstractC27891c(mo46611a = "version")

    /* renamed from: c */
    public String f109485c;

    static {
        Covode.recordClassIndex(55585);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46984gq)) {
            return false;
        }
        C46984gq gqVar = (C46984gq) obj;
        return C89219l.m154714a(this.f109483a, gqVar.f109483a) && C89219l.m154714a(this.f109484b, gqVar.f109484b) && C89219l.m154714a(this.f109485c, gqVar.f109485c);
    }

    public final int hashCode() {
        String str = this.f109483a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f109484b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f109485c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SubtitleType(sourceLanguage=" + this.f109483a + ", targetLanguage=" + this.f109484b + ", version=" + this.f109485c + ")";
    }

    public /* synthetic */ C46984gq() {
        this("", "", "");
    }

    private C46984gq(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f109483a = str;
        this.f109484b = str2;
        this.f109485c = str3;
    }
}
