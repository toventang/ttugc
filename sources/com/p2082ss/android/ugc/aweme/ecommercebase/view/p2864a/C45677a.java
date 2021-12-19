package com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.GImage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercebase.view.a.a */
public final class C45677a {

    /* renamed from: a */
    public final Integer f106337a;

    /* renamed from: b */
    public final String f106338b;

    /* renamed from: c */
    public final GImage f106339c;

    static {
        Covode.recordClassIndex(54188);
    }

    public C45677a() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45677a)) {
            return false;
        }
        C45677a aVar = (C45677a) obj;
        return C89219l.m154714a(this.f106337a, aVar.f106337a) && C89219l.m154714a(this.f106338b, aVar.f106338b) && C89219l.m154714a(this.f106339c, aVar.f106339c);
    }

    public final int hashCode() {
        Integer num = this.f106337a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f106338b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        GImage gImage = this.f106339c;
        if (gImage != null) {
            i = gImage.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CommonData(style=" + this.f106337a + ", text=" + this.f106338b + ", image=" + this.f106339c + ")";
    }

    private C45677a(Integer num, String str, GImage gImage) {
        this.f106337a = num;
        this.f106338b = str;
        this.f106339c = gImage;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45677a(Integer num, String str, GImage gImage, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : gImage);
    }
}
