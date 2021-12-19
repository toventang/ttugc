package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.c */
public final class C36956c {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public final long f87024a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    public final String f87025b;
    @AbstractC27891c(mo46611a = "describe")

    /* renamed from: c */
    public final String f87026c;
    @AbstractC27891c(mo46611a = "diamond_count")

    /* renamed from: d */
    public final long f87027d;
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: e */
    public final UrlModel f87028e;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: f */
    public final UrlModel f87029f;
    @AbstractC27891c(mo46611a = "asset")

    /* renamed from: g */
    public final UrlModel f87030g;
    @AbstractC27891c(mo46611a = "icon_medium")

    /* renamed from: h */
    public final UrlModel f87031h;
    @AbstractC27891c(mo46611a = "icon_large")

    /* renamed from: i */
    public final UrlModel f87032i;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: j */
    public final Integer f87033j;

    static {
        Covode.recordClassIndex(44304);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36956c)) {
            return false;
        }
        C36956c cVar = (C36956c) obj;
        return this.f87024a == cVar.f87024a && C89219l.m154714a(this.f87025b, cVar.f87025b) && C89219l.m154714a(this.f87026c, cVar.f87026c) && this.f87027d == cVar.f87027d && C89219l.m154714a(this.f87028e, cVar.f87028e) && C89219l.m154714a(this.f87029f, cVar.f87029f) && C89219l.m154714a(this.f87030g, cVar.f87030g) && C89219l.m154714a(this.f87031h, cVar.f87031h) && C89219l.m154714a(this.f87032i, cVar.f87032i) && C89219l.m154714a(this.f87033j, cVar.f87033j);
    }

    public final String toString() {
        return "GiftPageItem(id=" + this.f87024a + ", name=" + this.f87025b + ", describe=" + this.f87026c + ", diamondCount=" + this.f87027d + ", imageURL=" + this.f87028e + ", iconURL=" + this.f87029f + ", assetURL=" + this.f87030g + ", iconMedium=" + this.f87031h + ", iconLarge=" + this.f87032i + ", type=" + this.f87033j + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j = this.f87024a;
        int i8 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f87025b;
        int i9 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = (i8 + i) * 31;
        String str2 = this.f87026c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f87027d;
        int i11 = (((i10 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        UrlModel urlModel = this.f87028e;
        if (urlModel != null) {
            i3 = urlModel.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        UrlModel urlModel2 = this.f87029f;
        if (urlModel2 != null) {
            i4 = urlModel2.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        UrlModel urlModel3 = this.f87030g;
        if (urlModel3 != null) {
            i5 = urlModel3.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        UrlModel urlModel4 = this.f87031h;
        if (urlModel4 != null) {
            i6 = urlModel4.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 31;
        UrlModel urlModel5 = this.f87032i;
        if (urlModel5 != null) {
            i7 = urlModel5.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 31;
        Integer num = this.f87033j;
        if (num != null) {
            i9 = num.hashCode();
        }
        return i16 + i9;
    }
}
