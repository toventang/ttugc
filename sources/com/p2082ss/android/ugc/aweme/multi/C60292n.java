package com.p2082ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.n */
public final class C60292n {
    @AbstractC27891c(mo46611a = "anchor_show_type")

    /* renamed from: a */
    public String f137394a;
    @AbstractC27891c(mo46611a = "author_id")

    /* renamed from: b */
    public String f137395b;
    @AbstractC27891c(mo46611a = "enter_from_info")

    /* renamed from: c */
    public String f137396c;
    @AbstractC27891c(mo46611a = "product_id")

    /* renamed from: d */
    public String f137397d;
    @AbstractC27891c(mo46611a = "product_source")

    /* renamed from: e */
    public String f137398e;
    @AbstractC27891c(mo46611a = "source_content_id")

    /* renamed from: f */
    public String f137399f;
    @AbstractC27891c(mo46611a = "source_from")

    /* renamed from: g */
    public String f137400g;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: h */
    public String f137401h;
    @AbstractC27891c(mo46611a = "follow_status")

    /* renamed from: i */
    public String f137402i;
    @AbstractC27891c(mo46611a = "entrance_form")

    /* renamed from: j */
    public String f137403j;
    @AbstractC27891c(mo46611a = "source_page_type")

    /* renamed from: k */
    public String f137404k;
    @AbstractC27891c(mo46611a = "request_id")

    /* renamed from: l */
    public String f137405l;
    @AbstractC27891c(mo46611a = "is_self")

    /* renamed from: m */
    public Integer f137406m;
    @AbstractC27891c(mo46611a = "is_single_anchor")

    /* renamed from: n */
    public String f137407n;
    @AbstractC27891c(mo46611a = "is_ad")

    /* renamed from: o */
    public Integer f137408o;
    @AbstractC27891c(mo46611a = "ad_id")

    /* renamed from: p */
    public String f137409p;

    static {
        Covode.recordClassIndex(70824);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60292n)) {
            return false;
        }
        C60292n nVar = (C60292n) obj;
        return C89219l.m154714a(this.f137394a, nVar.f137394a) && C89219l.m154714a(this.f137395b, nVar.f137395b) && C89219l.m154714a(this.f137396c, nVar.f137396c) && C89219l.m154714a(this.f137397d, nVar.f137397d) && C89219l.m154714a(this.f137398e, nVar.f137398e) && C89219l.m154714a(this.f137399f, nVar.f137399f) && C89219l.m154714a(this.f137400g, nVar.f137400g) && C89219l.m154714a(this.f137401h, nVar.f137401h) && C89219l.m154714a(this.f137402i, nVar.f137402i) && C89219l.m154714a(this.f137403j, nVar.f137403j) && C89219l.m154714a(this.f137404k, nVar.f137404k) && C89219l.m154714a(this.f137405l, nVar.f137405l) && C89219l.m154714a(this.f137406m, nVar.f137406m) && C89219l.m154714a(this.f137407n, nVar.f137407n) && C89219l.m154714a(this.f137408o, nVar.f137408o) && C89219l.m154714a(this.f137409p, nVar.f137409p);
    }

    public final int hashCode() {
        String str = this.f137394a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f137395b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f137396c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f137397d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f137398e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f137399f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f137400g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f137401h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f137402i;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f137403j;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f137404k;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f137405l;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        Integer num = this.f137406m;
        int hashCode13 = (hashCode12 + (num != null ? num.hashCode() : 0)) * 31;
        String str13 = this.f137407n;
        int hashCode14 = (hashCode13 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Integer num2 = this.f137408o;
        int hashCode15 = (hashCode14 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str14 = this.f137409p;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return hashCode15 + i;
    }

    public final String toString() {
        return "TrackParams(anchor_show_type=" + this.f137394a + ", author_id=" + this.f137395b + ", enter_from_info=" + this.f137396c + ", product_id=" + this.f137397d + ", product_source=" + this.f137398e + ", source_content_id=" + this.f137399f + ", source_from=" + this.f137400g + ", source=" + this.f137401h + ", follow_status=" + this.f137402i + ", entrance_form=" + this.f137403j + ", source_page_type=" + this.f137404k + ", request_id=" + this.f137405l + ", is_self=" + this.f137406m + ", is_single_anchor=" + this.f137407n + ", is_ad=" + this.f137408o + ", ad_id=" + this.f137409p + ")";
    }

    private C60292n() {
        this.f137394a = null;
        this.f137395b = null;
        this.f137396c = null;
        this.f137397d = null;
        this.f137398e = null;
        this.f137399f = null;
        this.f137400g = null;
        this.f137401h = null;
        this.f137402i = null;
        this.f137403j = null;
        this.f137404k = null;
        this.f137405l = null;
        this.f137406m = null;
        this.f137407n = null;
        this.f137408o = null;
        this.f137409p = null;
    }

    public /* synthetic */ C60292n(byte b) {
        this();
    }
}
