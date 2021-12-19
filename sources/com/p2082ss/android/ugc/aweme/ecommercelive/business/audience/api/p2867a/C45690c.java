package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.GImage;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.c */
public final class C45690c {

    /* renamed from: i */
    public static final C45691a f106399i = new C45691a((byte) 0);
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public Integer f106400a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public String f106401b;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: c */
    public String f106402c;
    @AbstractC27891c(mo46611a = "from_price")

    /* renamed from: d */
    public String f106403d;
    @AbstractC27891c(mo46611a = "to_price")

    /* renamed from: e */
    public String f106404e;
    @AbstractC27891c(mo46611a = "buttons")

    /* renamed from: f */
    public List<C45689b> f106405f;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: g */
    public String f106406g;
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: h */
    public final GImage f106407h;

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.c$a */
    public static final class C45691a {
        static {
            Covode.recordClassIndex(54206);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.c$a$a */
        public static final class C45692a {

            /* renamed from: a */
            public static final String f106408a = "live_popup_card";

            /* renamed from: b */
            public static final C45692a f106409b = new C45692a();

            private C45692a() {
            }

            static {
                Covode.recordClassIndex(54207);
            }
        }

        private C45691a() {
        }

        public /* synthetic */ C45691a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(54205);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45690c)) {
            return false;
        }
        C45690c cVar = (C45690c) obj;
        return C89219l.m154714a(this.f106400a, cVar.f106400a) && C89219l.m154714a(this.f106401b, cVar.f106401b) && C89219l.m154714a(this.f106402c, cVar.f106402c) && C89219l.m154714a(this.f106403d, cVar.f106403d) && C89219l.m154714a(this.f106404e, cVar.f106404e) && C89219l.m154714a(this.f106405f, cVar.f106405f) && C89219l.m154714a(this.f106406g, cVar.f106406g) && C89219l.m154714a(this.f106407h, cVar.f106407h);
    }

    public final int hashCode() {
        Integer num = this.f106400a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f106401b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f106402c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f106403d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f106404e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<C45689b> list = this.f106405f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.f106406g;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        GImage gImage = this.f106407h;
        if (gImage != null) {
            i = gImage.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "FansPopUpData(type=" + this.f106400a + ", title=" + this.f106401b + ", content=" + this.f106402c + ", fromPrice=" + this.f106403d + ", toPrice=" + this.f106404e + ", buttons=" + this.f106405f + ", schema=" + this.f106406g + ", image=" + this.f106407h + ")";
    }
}
