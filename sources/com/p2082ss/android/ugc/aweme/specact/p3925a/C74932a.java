package com.p2082ss.android.ugc.aweme.specact.p3925a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.a.a */
public final class C74932a {
    @AbstractC27891c(mo46611a = "activity_id")

    /* renamed from: a */
    public final String f168456a;
    @AbstractC27891c(mo46611a = "resource_url")

    /* renamed from: b */
    public final String f168457b;
    @AbstractC27891c(mo46611a = "resource_md5")

    /* renamed from: c */
    public final String f168458c;

    static {
        Covode.recordClassIndex(87799);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74932a)) {
            return false;
        }
        C74932a aVar = (C74932a) obj;
        return C89219l.m154714a(this.f168456a, aVar.f168456a) && C89219l.m154714a(this.f168457b, aVar.f168457b) && C89219l.m154714a(this.f168458c, aVar.f168458c);
    }

    public final int hashCode() {
        String str = this.f168456a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f168457b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f168458c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "UniversalActivityVideoResource(activityId=" + this.f168456a + ", resourceUrl=" + this.f168457b + ", resourceMd5=" + this.f168458c + ")";
    }

    private /* synthetic */ C74932a() {
        this("", "", "");
    }

    private C74932a(String str, String str2, String str3) {
        this.f168456a = str;
        this.f168457b = str2;
        this.f168458c = str3;
    }
}
