package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.o */
public final class C44786o {

    /* renamed from: a */
    public final Image f104491a;

    /* renamed from: b */
    public final String f104492b;

    /* renamed from: c */
    public final Long f104493c;

    /* renamed from: d */
    public final String f104494d;

    /* renamed from: e */
    public final String f104495e;

    static {
        Covode.recordClassIndex(53172);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44786o)) {
            return false;
        }
        C44786o oVar = (C44786o) obj;
        return C89219l.m154714a(this.f104491a, oVar.f104491a) && C89219l.m154714a(this.f104492b, oVar.f104492b) && C89219l.m154714a(this.f104493c, oVar.f104493c) && C89219l.m154714a(this.f104494d, oVar.f104494d) && C89219l.m154714a(this.f104495e, oVar.f104495e);
    }

    public final int hashCode() {
        Image image = this.f104491a;
        int i = 0;
        int hashCode = (image != null ? image.hashCode() : 0) * 31;
        String str = this.f104492b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.f104493c;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.f104494d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104495e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "ShopProfileVO(shopImage=" + this.f104491a + ", shopName=" + this.f104492b + ", shopCount=" + this.f104493c + ", shopRate=" + this.f104494d + ", link=" + this.f104495e + ")";
    }

    public C44786o(Image image, String str, Long l, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f104491a = image;
        this.f104492b = str;
        this.f104493c = l;
        this.f104494d = str2;
        this.f104495e = str3;
    }
}
