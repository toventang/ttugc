package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.j */
public final class C61636j {
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    public final String f139913a;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: b */
    public final String f139914b;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: c */
    public final String f139915c;
    @AbstractC27891c(mo46611a = "image_url")

    /* renamed from: d */
    public final UrlModel f139916d;

    static {
        Covode.recordClassIndex(72363);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61636j)) {
            return false;
        }
        C61636j jVar = (C61636j) obj;
        return C89219l.m154714a(this.f139913a, jVar.f139913a) && C89219l.m154714a(this.f139914b, jVar.f139914b) && C89219l.m154714a(this.f139915c, jVar.f139915c) && C89219l.m154714a(this.f139916d, jVar.f139916d);
    }

    public final int hashCode() {
        String str = this.f139913a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139914b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f139915c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f139916d;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "PromoteNotice(title=" + this.f139913a + ", content=" + this.f139914b + ", schemaUrl=" + this.f139915c + ", imageUrl=" + this.f139916d + ")";
    }

    private /* synthetic */ C61636j() {
        this("", "", "");
    }

    private C61636j(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f139913a = str;
        this.f139914b = str2;
        this.f139915c = str3;
        this.f139916d = null;
    }
}
