package com.p2082ss.android.ugc.aweme.search.ecom.p3688a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.a.a */
public final class C67394a {
    @AbstractC27891c(mo46611a = "product_id")

    /* renamed from: a */
    public final String f150985a = null;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public final String f150986b = null;
    @AbstractC27891c(mo46611a = "cover")

    /* renamed from: c */
    public final String f150987c = null;
    @AbstractC27891c(mo46611a = "elastic_title")

    /* renamed from: d */
    public final String f150988d = null;
    @AbstractC27891c(mo46611a = "img")

    /* renamed from: e */
    public final List<String> f150989e = null;
    @AbstractC27891c(mo46611a = "format_price")

    /* renamed from: f */
    public final String f150990f = null;
    @AbstractC27891c(mo46611a = "activity_info")

    /* renamed from: g */
    public final C67395a f150991g = null;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: h */
    public final String f150992h = null;
    @AbstractC27891c(mo46611a = "detail_url")

    /* renamed from: i */
    public final String f150993i = null;
    @AbstractC27891c(mo46611a = "platform")

    /* renamed from: j */
    public final Integer f150994j = null;
    @AbstractC27891c(mo46611a = "source_from")

    /* renamed from: k */
    public final String f150995k = null;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: l */
    public final String f150996l = null;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: m */
    public final C67396b f150997m = null;

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.a.a$b */
    public static final class C67396b {
        @AbstractC27891c(mo46611a = "is_pinned")

        /* renamed from: a */
        public final int f151000a;

        static {
            Covode.recordClassIndex(79029);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C67396b) && this.f151000a == ((C67396b) obj).f151000a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f151000a;
        }

        public final String toString() {
            return "ExtraInfo(isPinned=" + this.f151000a + ")";
        }
    }

    static {
        Covode.recordClassIndex(79027);
    }

    public final int hashCode() {
        String str = this.f150985a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f150986b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f150987c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f150988d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.f150989e;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.f150990f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        C67395a aVar = this.f150991g;
        int hashCode7 = (hashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str6 = this.f150992h;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f150993i;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Integer num = this.f150994j;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        String str8 = this.f150995k;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f150996l;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        C67396b bVar = this.f150997m;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode12 + i;
    }

    public final String toString() {
        return "Product(id=" + this.f150985a + ", title=" + this.f150986b + ", cover=" + this.f150987c + ", elasticTitle=" + this.f150988d + ", imgUrlList=" + this.f150989e + ", formatPrice=" + this.f150990f + ", activityInfo=" + this.f150991g + ", schema=" + this.f150992h + ", detailUrl=" + this.f150993i + ", platform=" + this.f150994j + ", sourceFrom=" + this.f150995k + ", source=" + this.f150996l + ", extra=" + this.f150997m + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.a.a$a */
    public static final class C67395a {
        @AbstractC27891c(mo46611a = StringSet.name)

        /* renamed from: a */
        public final String f150998a = null;
        @AbstractC27891c(mo46611a = "icon")

        /* renamed from: b */
        public final UrlModel f150999b = null;

        static {
            Covode.recordClassIndex(79028);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C67395a)) {
                return false;
            }
            C67395a aVar = (C67395a) obj;
            return C89219l.m154714a(this.f150998a, aVar.f150998a) && C89219l.m154714a(this.f150999b, aVar.f150999b);
        }

        public final int hashCode() {
            String str = this.f150998a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            UrlModel urlModel = this.f150999b;
            if (urlModel != null) {
                i = urlModel.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "ActivityInfo(name=" + this.f150998a + ", iconUrl=" + this.f150999b + ")";
        }

        private C67395a() {
        }
    }

    private C67394a() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C67394a) {
            return C89219l.m154714a((Object) ((C67394a) obj).f150985a, (Object) this.f150985a);
        }
        return false;
    }
}
