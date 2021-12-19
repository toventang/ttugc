package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.l */
public final class C61638l {
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    public final String f139920a;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: b */
    public final String f139921b;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: c */
    public final String f139922c;
    @AbstractC27891c(mo46611a = "log_extra")

    /* renamed from: d */
    public final String f139923d;
    @AbstractC27891c(mo46611a = "source_type")

    /* renamed from: e */
    public final int f139924e;
    @AbstractC27891c(mo46611a = "source_name")

    /* renamed from: f */
    public final String f139925f;
    @AbstractC27891c(mo46611a = "source_icon")

    /* renamed from: g */
    public final UrlModel f139926g;

    static {
        Covode.recordClassIndex(72365);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61638l)) {
            return false;
        }
        C61638l lVar = (C61638l) obj;
        return C89219l.m154714a(this.f139920a, lVar.f139920a) && C89219l.m154714a(this.f139921b, lVar.f139921b) && C89219l.m154714a(this.f139922c, lVar.f139922c) && C89219l.m154714a(this.f139923d, lVar.f139923d) && this.f139924e == lVar.f139924e && C89219l.m154714a(this.f139925f, lVar.f139925f) && C89219l.m154714a(this.f139926g, lVar.f139926g);
    }

    public final int hashCode() {
        String str = this.f139920a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139921b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f139922c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f139923d;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f139924e) * 31;
        String str5 = this.f139925f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f139926g;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "TcmNotice(title=" + this.f139920a + ", content=" + this.f139921b + ", schemaUrl=" + this.f139922c + ", logExtra=" + this.f139923d + ", sourceType=" + this.f139924e + ", sourceName=" + this.f139925f + ", sourceIcon=" + this.f139926g + ")";
    }

    private /* synthetic */ C61638l() {
        this("", "", "", "", "");
    }

    private C61638l(String str, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f139920a = str;
        this.f139921b = str2;
        this.f139922c = str3;
        this.f139923d = str4;
        this.f139924e = 0;
        this.f139925f = str5;
        this.f139926g = null;
    }
}
