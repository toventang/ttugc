package com.p2082ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.response.a */
public final class C57356a {
    @AbstractC27891c(mo46611a = "code")

    /* renamed from: a */
    public final int f130735a;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: b */
    public final String f130736b;
    @AbstractC27891c(mo46611a = "img")

    /* renamed from: c */
    public final String f130737c;

    static {
        Covode.recordClassIndex(67272);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57356a)) {
            return false;
        }
        C57356a aVar = (C57356a) obj;
        return this.f130735a == aVar.f130735a && C89219l.m154714a(this.f130736b, aVar.f130736b) && C89219l.m154714a(this.f130737c, aVar.f130737c);
    }

    public final int hashCode() {
        int i = this.f130735a * 31;
        String str = this.f130736b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f130737c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "KMVideoReportReason(code=" + this.f130735a + ", text=" + this.f130736b + ", img=" + this.f130737c + ")";
    }

    private /* synthetic */ C57356a() {
        this("", "");
    }

    private C57356a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f130735a = -1;
        this.f130736b = str;
        this.f130737c = str2;
    }
}
