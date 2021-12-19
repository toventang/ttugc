package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.ae */
public final class C56845ae {
    @AbstractC27891c(mo46611a = "need_popup")

    /* renamed from: a */
    public final Boolean f129441a;
    @AbstractC27891c(mo46611a = "header")

    /* renamed from: b */
    public final String f129442b;
    @AbstractC27891c(mo46611a = "title1")

    /* renamed from: c */
    public final String f129443c;
    @AbstractC27891c(mo46611a = "desc1")

    /* renamed from: d */
    public final String f129444d;
    @AbstractC27891c(mo46611a = "title2")

    /* renamed from: e */
    public final String f129445e;
    @AbstractC27891c(mo46611a = "desc2")

    /* renamed from: f */
    public final String f129446f;
    @AbstractC27891c(mo46611a = "footer")

    /* renamed from: g */
    public final String f129447g;

    static {
        Covode.recordClassIndex(66730);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56845ae)) {
            return false;
        }
        C56845ae aeVar = (C56845ae) obj;
        return C89219l.m154714a(this.f129441a, aeVar.f129441a) && C89219l.m154714a(this.f129442b, aeVar.f129442b) && C89219l.m154714a(this.f129443c, aeVar.f129443c) && C89219l.m154714a(this.f129444d, aeVar.f129444d) && C89219l.m154714a(this.f129445e, aeVar.f129445e) && C89219l.m154714a(this.f129446f, aeVar.f129446f) && C89219l.m154714a(this.f129447g, aeVar.f129447g);
    }

    public final int hashCode() {
        Boolean bool = this.f129441a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f129442b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f129443c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f129444d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f129445e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f129446f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f129447g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "PersAdStruct(needPopup=" + this.f129441a + ", header=" + this.f129442b + ", title1=" + this.f129443c + ", desc1=" + this.f129444d + ", title2=" + this.f129445e + ", desc2=" + this.f129446f + ", footer=" + this.f129447g + ")";
    }

    private /* synthetic */ C56845ae() {
        this(false, "", "", "", "", "", "");
    }

    private C56845ae(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f129441a = bool;
        this.f129442b = str;
        this.f129443c = str2;
        this.f129444d = str3;
        this.f129445e = str4;
        this.f129446f = str5;
        this.f129447g = str6;
    }
}
