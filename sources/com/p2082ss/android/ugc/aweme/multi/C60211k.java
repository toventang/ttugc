package com.p2082ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.k */
public final class C60211k {
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: a */
    public final String f137246a;

    /* renamed from: b */
    public final C60215m f137247b;
    @AbstractC27891c(mo46611a = "keyword")

    /* renamed from: c */
    public final String f137248c;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: d */
    public final String f137249d;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: e */
    public final Integer f137250e;
    @AbstractC27891c(mo46611a = "platform")

    /* renamed from: f */
    public final Integer f137251f;
    @AbstractC27891c(mo46611a = "log_extra")

    /* renamed from: g */
    public final String f137252g;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: h */
    public final String f137253h;

    static {
        Covode.recordClassIndex(70740);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60211k)) {
            return false;
        }
        C60211k kVar = (C60211k) obj;
        return C89219l.m154714a(this.f137246a, kVar.f137246a) && C89219l.m154714a(this.f137247b, kVar.f137247b) && C89219l.m154714a(this.f137248c, kVar.f137248c) && C89219l.m154714a(this.f137249d, kVar.f137249d) && C89219l.m154714a(this.f137250e, kVar.f137250e) && C89219l.m154714a(this.f137251f, kVar.f137251f) && C89219l.m154714a(this.f137252g, kVar.f137252g) && C89219l.m154714a(this.f137253h, kVar.f137253h);
    }

    public final int hashCode() {
        String str = this.f137246a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C60215m mVar = this.f137247b;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        String str2 = this.f137248c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f137249d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f137250e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f137251f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str4 = this.f137252g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f137253h;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "ShopWindowAnchorModel(extra=" + this.f137246a + ", extraData=" + this.f137247b + ", keyword=" + this.f137248c + ", id=" + this.f137249d + ", type=" + this.f137250e + ", platform=" + this.f137251f + ", logExtra=" + this.f137252g + ", schema=" + this.f137253h + ")";
    }

    private /* synthetic */ C60211k() {
        this("", new C60215m(), "", "", null, null, "", "");
    }

    public C60211k(String str, C60215m mVar, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f137246a = str;
        this.f137247b = mVar;
        this.f137248c = str2;
        this.f137249d = str3;
        this.f137250e = num;
        this.f137251f = num2;
        this.f137252g = str4;
        this.f137253h = str5;
    }
}
