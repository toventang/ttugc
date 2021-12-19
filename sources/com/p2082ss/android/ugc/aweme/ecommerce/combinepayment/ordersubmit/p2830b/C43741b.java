package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.b */
public final class C43741b {

    /* renamed from: a */
    public final String f101965a;

    /* renamed from: b */
    public final String f101966b;

    /* renamed from: c */
    public final Image f101967c;

    /* renamed from: d */
    public final String f101968d;

    /* renamed from: e */
    public final Image f101969e;

    static {
        Covode.recordClassIndex(52006);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43741b)) {
            return false;
        }
        C43741b bVar = (C43741b) obj;
        return C89219l.m154714a(this.f101965a, bVar.f101965a) && C89219l.m154714a(this.f101966b, bVar.f101966b) && C89219l.m154714a(this.f101967c, bVar.f101967c) && C89219l.m154714a(this.f101968d, bVar.f101968d) && C89219l.m154714a(this.f101969e, bVar.f101969e);
    }

    public final int hashCode() {
        String str = this.f101965a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101966b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.f101967c;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
        String str3 = this.f101968d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Image image2 = this.f101969e;
        if (image2 != null) {
            i = image2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "AnnounceVO(announcementId=" + this.f101965a + ", text=" + this.f101966b + ", icon=" + this.f101967c + ", link=" + this.f101968d + ", background=" + this.f101969e + ")";
    }

    public C43741b(String str, String str2, Image image, String str3, Image image2) {
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f101965a = str;
        this.f101966b = str2;
        this.f101967c = image;
        this.f101968d = str3;
        this.f101969e = image2;
    }
}
