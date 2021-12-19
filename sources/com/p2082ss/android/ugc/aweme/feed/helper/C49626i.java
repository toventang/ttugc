package com.p2082ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.i */
public final class C49626i {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public String f114198a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public String f114199b;
    @AbstractC27891c(mo46611a = "cancel_text")

    /* renamed from: c */
    public String f114200c;
    @AbstractC27891c(mo46611a = "submit_text")

    /* renamed from: d */
    public String f114201d;
    @AbstractC27891c(mo46611a = "questions")

    /* renamed from: e */
    public C49652s[] f114202e;

    static {
        Covode.recordClassIndex(58473);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49626i)) {
            return false;
        }
        C49626i iVar = (C49626i) obj;
        return C89219l.m154714a(this.f114198a, iVar.f114198a) && C89219l.m154714a(this.f114199b, iVar.f114199b) && C89219l.m154714a(this.f114200c, iVar.f114200c) && C89219l.m154714a(this.f114201d, iVar.f114201d) && C89219l.m154714a(this.f114202e, iVar.f114202e);
    }

    public final int hashCode() {
        String str = this.f114198a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f114199b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f114200c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f114201d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C49652s[] sVarArr = this.f114202e;
        if (sVarArr != null) {
            i = Arrays.hashCode(sVarArr);
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "FeedSurvey(id=" + this.f114198a + ", title=" + this.f114199b + ", cancelText=" + this.f114200c + ", submitText=" + this.f114201d + ", questions=" + Arrays.toString(this.f114202e) + ")";
    }

    private /* synthetic */ C49626i() {
        this("", "", "", "", null);
    }

    public C49626i(String str, String str2, String str3, String str4, C49652s[] sVarArr) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f114198a = str;
        this.f114199b = str2;
        this.f114200c = str3;
        this.f114201d = str4;
        this.f114202e = sVarArr;
    }
}
