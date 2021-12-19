package com.p2082ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.m */
public final class C60215m {
    @AbstractC27891c(mo46611a = "product_type")

    /* renamed from: a */
    public final String f137257a;
    @AbstractC27891c(mo46611a = "product_id")

    /* renamed from: b */
    public final Long f137258b;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    public final String f137259c;
    @AbstractC27891c(mo46611a = "elastic_title")

    /* renamed from: d */
    public final String f137260d;
    @AbstractC27891c(mo46611a = "price_need_delete")

    /* renamed from: e */
    public final int f137261e;
    @AbstractC27891c(mo46611a = "format_price")

    /* renamed from: f */
    public String f137262f;
    @AbstractC27891c(mo46611a = "cover_url")

    /* renamed from: g */
    public final String f137263g;
    @AbstractC27891c(mo46611a = "elastic_url")

    /* renamed from: h */
    public final String f137264h;
    @AbstractC27891c(mo46611a = "platform")

    /* renamed from: i */
    public final Integer f137265i;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: j */
    public final String f137266j;
    @AbstractC27891c(mo46611a = "source_from")

    /* renamed from: k */
    public final String f137267k;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: l */
    public final String f137268l;
    @AbstractC27891c(mo46611a = "detail_url")

    /* renamed from: m */
    public final String f137269m;
    @AbstractC27891c(mo46611a = "need_preload")

    /* renamed from: n */
    public final Boolean f137270n;
    @AbstractC27891c(mo46611a = "load_method_type")

    /* renamed from: o */
    public final Integer f137271o;
    @AbstractC27891c(mo46611a = "product_base")

    /* renamed from: p */
    public final C60209i f137272p;

    static {
        Covode.recordClassIndex(70744);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60215m)) {
            return false;
        }
        C60215m mVar = (C60215m) obj;
        return C89219l.m154714a(this.f137257a, mVar.f137257a) && C89219l.m154714a(this.f137258b, mVar.f137258b) && C89219l.m154714a(this.f137259c, mVar.f137259c) && C89219l.m154714a(this.f137260d, mVar.f137260d) && this.f137261e == mVar.f137261e && C89219l.m154714a(this.f137262f, mVar.f137262f) && C89219l.m154714a(this.f137263g, mVar.f137263g) && C89219l.m154714a(this.f137264h, mVar.f137264h) && C89219l.m154714a(this.f137265i, mVar.f137265i) && C89219l.m154714a(this.f137266j, mVar.f137266j) && C89219l.m154714a(this.f137267k, mVar.f137267k) && C89219l.m154714a(this.f137268l, mVar.f137268l) && C89219l.m154714a(this.f137269m, mVar.f137269m) && C89219l.m154714a(this.f137270n, mVar.f137270n) && C89219l.m154714a(this.f137271o, mVar.f137271o) && C89219l.m154714a(this.f137272p, mVar.f137272p);
    }

    public final int hashCode() {
        String str = this.f137257a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.f137258b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.f137259c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f137260d;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f137261e) * 31;
        String str4 = this.f137262f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f137263g;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f137264h;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.f137265i;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        String str7 = this.f137266j;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f137267k;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f137268l;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f137269m;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Boolean bool = this.f137270n;
        int hashCode13 = (hashCode12 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.f137271o;
        int hashCode14 = (hashCode13 + (num2 != null ? num2.hashCode() : 0)) * 31;
        C60209i iVar = this.f137272p;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode14 + i;
    }

    public final String toString() {
        return "ShopWindowExtraModel(productType=" + this.f137257a + ", productId=" + this.f137258b + ", title=" + this.f137259c + ", elasticTitle=" + this.f137260d + ", price=" + this.f137261e + ", formatPrice=" + this.f137262f + ", coverUrl=" + this.f137263g + ", elasticUrl=" + this.f137264h + ", platform=" + this.f137265i + ", schema=" + this.f137266j + ", sourceFrom=" + this.f137267k + ", source=" + this.f137268l + ", detailUrl=" + this.f137269m + ", need_preload=" + this.f137270n + ", loadMethodType=" + this.f137271o + ", productBase=" + this.f137272p + ")";
    }

    public /* synthetic */ C60215m() {
        this(false);
    }

    private C60215m(Boolean bool) {
        this.f137257a = null;
        this.f137258b = null;
        this.f137259c = null;
        this.f137260d = null;
        this.f137261e = 0;
        this.f137262f = null;
        this.f137263g = null;
        this.f137264h = null;
        this.f137265i = null;
        this.f137266j = null;
        this.f137267k = null;
        this.f137268l = null;
        this.f137269m = null;
        this.f137270n = bool;
        this.f137271o = null;
        this.f137272p = null;
    }
}
