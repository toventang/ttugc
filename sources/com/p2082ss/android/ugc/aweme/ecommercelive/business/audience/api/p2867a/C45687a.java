package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2871a.p2872a.C45804a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.a */
public final class C45687a {

    /* renamed from: w */
    public static final C45688a f106374w = new C45688a((byte) 0);
    @AbstractC27891c(mo46611a = "product_id")

    /* renamed from: a */
    public final String f106375a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public final String f106376b;
    @AbstractC27891c(mo46611a = "cover")

    /* renamed from: c */
    public final C45804a f106377c;
    @AbstractC27891c(mo46611a = "img")

    /* renamed from: d */
    public final List<C45804a> f106378d;
    @AbstractC27891c(mo46611a = "currency")

    /* renamed from: e */
    public final String f106379e;
    @AbstractC27891c(mo46611a = "detail_url")

    /* renamed from: f */
    public final String f106380f;
    @AbstractC27891c(mo46611a = "product_status")

    /* renamed from: g */
    public final int f106381g;
    @AbstractC27891c(mo46611a = "addition_id")

    /* renamed from: h */
    public final String f106382h;
    @AbstractC27891c(mo46611a = "elastic_title")

    /* renamed from: i */
    public final String f106383i;
    @AbstractC27891c(mo46611a = "elastic_img")

    /* renamed from: j */
    public final List<C45804a> f106384j;
    @AbstractC27891c(mo46611a = "platform")

    /* renamed from: k */
    public final int f106385k;
    @AbstractC27891c(mo46611a = "format_price")

    /* renamed from: l */
    public final String f106386l;
    @AbstractC27891c(mo46611a = "format_market_price")

    /* renamed from: m */
    public final String f106387m;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: n */
    public final String f106388n;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: o */
    public final String f106389o;
    @AbstractC27891c(mo46611a = "source_from")

    /* renamed from: p */
    public final int f106390p;
    @AbstractC27891c(mo46611a = "format_origin_price")

    /* renamed from: q */
    public final String f106391q;
    @AbstractC27891c(mo46611a = "format_available_price")

    /* renamed from: r */
    public final String f106392r;

    /* renamed from: s */
    public boolean f106393s;
    @AbstractC27891c(mo46611a = "flash_sale_info")

    /* renamed from: t */
    public final C45695f f106394t;
    @AbstractC27891c(mo46611a = "promotion_logos")

    /* renamed from: u */
    public final List<C45697h> f106395u;
    @AbstractC27891c(mo46611a = "promotion_view")

    /* renamed from: v */
    public final PromotionView f106396v;

    static {
        Covode.recordClassIndex(54202);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45687a)) {
            return false;
        }
        C45687a aVar = (C45687a) obj;
        return C89219l.m154714a(this.f106375a, aVar.f106375a) && C89219l.m154714a(this.f106376b, aVar.f106376b) && C89219l.m154714a(this.f106377c, aVar.f106377c) && C89219l.m154714a(this.f106378d, aVar.f106378d) && C89219l.m154714a(this.f106379e, aVar.f106379e) && C89219l.m154714a(this.f106380f, aVar.f106380f) && this.f106381g == aVar.f106381g && C89219l.m154714a(this.f106382h, aVar.f106382h) && C89219l.m154714a(this.f106383i, aVar.f106383i) && C89219l.m154714a(this.f106384j, aVar.f106384j) && this.f106385k == aVar.f106385k && C89219l.m154714a(this.f106386l, aVar.f106386l) && C89219l.m154714a(this.f106387m, aVar.f106387m) && C89219l.m154714a(this.f106388n, aVar.f106388n) && C89219l.m154714a(this.f106389o, aVar.f106389o) && this.f106390p == aVar.f106390p && C89219l.m154714a(this.f106391q, aVar.f106391q) && C89219l.m154714a(this.f106392r, aVar.f106392r) && this.f106393s == aVar.f106393s && C89219l.m154714a(this.f106394t, aVar.f106394t) && C89219l.m154714a(this.f106395u, aVar.f106395u) && C89219l.m154714a(this.f106396v, aVar.f106396v);
    }

    public final int hashCode() {
        String str = this.f106375a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f106376b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C45804a aVar = this.f106377c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List<C45804a> list = this.f106378d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.f106379e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f106380f;
        int hashCode6 = (((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f106381g) * 31;
        String str5 = this.f106382h;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f106383i;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<C45804a> list2 = this.f106384j;
        int hashCode9 = (((hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.f106385k) * 31;
        String str7 = this.f106386l;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f106387m;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f106388n;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f106389o;
        int hashCode13 = (((hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.f106390p) * 31;
        String str11 = this.f106391q;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f106392r;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        boolean z = this.f106393s;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode15 + i2) * 31;
        C45695f fVar = this.f106394t;
        int hashCode16 = (i5 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        List<C45697h> list3 = this.f106395u;
        int hashCode17 = (hashCode16 + (list3 != null ? list3.hashCode() : 0)) * 31;
        PromotionView promotionView = this.f106396v;
        if (promotionView != null) {
            i = promotionView.hashCode();
        }
        return hashCode17 + i;
    }

    public final String toString() {
        return "AudienceProduct(productId=" + this.f106375a + ", title=" + this.f106376b + ", cover=" + this.f106377c + ", img=" + this.f106378d + ", currency=" + this.f106379e + ", detailUrl=" + this.f106380f + ", productStatus=" + this.f106381g + ", additionId=" + this.f106382h + ", elasticTitle=" + this.f106383i + ", elasticImg=" + this.f106384j + ", platform=" + this.f106385k + ", formatPrice=" + this.f106386l + ", formatMarketPrice=" + this.f106387m + ", source=" + this.f106388n + ", schema=" + this.f106389o + ", source_from=" + this.f106390p + ", formatOriginPrice=" + this.f106391q + ", formatAvailablePrice=" + this.f106392r + ", isIntroduce=" + this.f106393s + ", flashSaleInfo=" + this.f106394t + ", promotionLogos=" + this.f106395u + ", promotionView=" + this.f106396v + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.a$a */
    public static final class C45688a {
        static {
            Covode.recordClassIndex(54203);
        }

        private C45688a() {
        }

        public /* synthetic */ C45688a(byte b) {
            this();
        }
    }
}
