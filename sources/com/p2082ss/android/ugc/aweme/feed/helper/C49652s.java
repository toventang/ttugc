package com.p2082ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.s */
public final class C49652s {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public String f114284a;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: b */
    public int f114285b;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    public String f114286c;
    @AbstractC27891c(mo46611a = "options")

    /* renamed from: d */
    public C49649p[] f114287d;

    static {
        Covode.recordClassIndex(58499);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49652s)) {
            return false;
        }
        C49652s sVar = (C49652s) obj;
        return C89219l.m154714a(this.f114284a, sVar.f114284a) && this.f114285b == sVar.f114285b && C89219l.m154714a(this.f114286c, sVar.f114286c) && C89219l.m154714a(this.f114287d, sVar.f114287d);
    }

    public final int hashCode() {
        String str = this.f114284a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f114285b) * 31;
        String str2 = this.f114286c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C49649p[] pVarArr = this.f114287d;
        if (pVarArr != null) {
            i = Arrays.hashCode(pVarArr);
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Question(id=" + this.f114284a + ", type=" + this.f114285b + ", title=" + this.f114286c + ", options=" + Arrays.toString(this.f114287d) + ")";
    }

    private /* synthetic */ C49652s() {
        this("", 0, "", null);
    }

    public C49652s(String str, int i, String str2, C49649p[] pVarArr) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f114284a = str;
        this.f114285b = i;
        this.f114286c = str2;
        this.f114287d = pVarArr;
    }
}
