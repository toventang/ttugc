package com.p2082ss.android.ugc.aweme.p2388bg;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bg.e */
public final class C34829e {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final String f82272a;
    @AbstractC27891c(mo46611a = "background_image_url")

    /* renamed from: b */
    public final String f82273b;
    @AbstractC27891c(mo46611a = "title_image_url")

    /* renamed from: c */
    public final String f82274c;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: d */
    public final String f82275d;
    @AbstractC27891c(mo46611a = "sub_title")

    /* renamed from: e */
    public final String f82276e;
    @AbstractC27891c(mo46611a = "mask")

    /* renamed from: f */
    public final String f82277f;
    @AbstractC27891c(mo46611a = "btn_label")

    /* renamed from: g */
    public final String f82278g;
    @AbstractC27891c(mo46611a = "rand_time")

    /* renamed from: h */
    public final long f82279h;
    @AbstractC27891c(mo46611a = "complete_id")

    /* renamed from: i */
    public final String f82280i;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: j */
    public final String f82281j;
    @AbstractC27891c(mo46611a = "time_range")

    /* renamed from: k */
    public final C34828d[] f82282k;
    @AbstractC27891c(mo46611a = "primary_btn")

    /* renamed from: l */
    public final C34827c f82283l;
    @AbstractC27891c(mo46611a = "secondary_btn")

    /* renamed from: m */
    public final C34827c f82284m;

    static {
        Covode.recordClassIndex(41837);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34829e)) {
            return false;
        }
        C34829e eVar = (C34829e) obj;
        return C89219l.m154714a(this.f82272a, eVar.f82272a) && C89219l.m154714a(this.f82273b, eVar.f82273b) && C89219l.m154714a(this.f82274c, eVar.f82274c) && C89219l.m154714a(this.f82275d, eVar.f82275d) && C89219l.m154714a(this.f82276e, eVar.f82276e) && C89219l.m154714a(this.f82277f, eVar.f82277f) && C89219l.m154714a(this.f82278g, eVar.f82278g) && this.f82279h == eVar.f82279h && C89219l.m154714a(this.f82280i, eVar.f82280i) && C89219l.m154714a(this.f82281j, eVar.f82281j) && C89219l.m154714a(this.f82282k, eVar.f82282k) && C89219l.m154714a(this.f82283l, eVar.f82283l) && C89219l.m154714a(this.f82284m, eVar.f82284m);
    }

    public final String toString() {
        return "KproPopupSetting(type=" + this.f82272a + ", backGroundImageUrl=" + this.f82273b + ", title_image_url=" + this.f82274c + ", title=" + this.f82275d + ", sub_title=" + this.f82276e + ", mask=" + this.f82277f + ", btn_label=" + this.f82278g + ", rand_time=" + this.f82279h + ", complete_id=" + this.f82280i + ", url=" + this.f82281j + ", time_range=" + Arrays.toString(this.f82282k) + ", primaryBtn=" + this.f82283l + ", secondaryBtn=" + this.f82284m + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str = this.f82272a;
        int i12 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i13 = i * 31;
        String str2 = this.f82273b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (i13 + i2) * 31;
        String str3 = this.f82274c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 31;
        String str4 = this.f82275d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 31;
        String str5 = this.f82276e;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 31;
        String str6 = this.f82277f;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 31;
        String str7 = this.f82278g;
        if (str7 != null) {
            i7 = str7.hashCode();
        } else {
            i7 = 0;
        }
        long j = this.f82279h;
        int i19 = (((i18 + i7) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str8 = this.f82280i;
        if (str8 != null) {
            i8 = str8.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 31;
        String str9 = this.f82281j;
        if (str9 != null) {
            i9 = str9.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 31;
        C34828d[] dVarArr = this.f82282k;
        if (dVarArr != null) {
            i10 = Arrays.hashCode(dVarArr);
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 31;
        C34827c cVar = this.f82283l;
        if (cVar != null) {
            i11 = cVar.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 31;
        C34827c cVar2 = this.f82284m;
        if (cVar2 != null) {
            i12 = cVar2.hashCode();
        }
        return i23 + i12;
    }
}
