package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e */
public final class C70994e {

    /* renamed from: a */
    public final String f158906a;

    /* renamed from: b */
    public final String f158907b;

    /* renamed from: c */
    public final String f158908c;

    /* renamed from: d */
    public final boolean f158909d;

    /* renamed from: e */
    public final boolean f158910e;

    /* renamed from: f */
    public final boolean f158911f;

    /* renamed from: g */
    public final String f158912g;

    /* renamed from: h */
    public final String f158913h;

    /* renamed from: i */
    public final boolean f158914i;

    /* renamed from: j */
    public final boolean f158915j;

    /* renamed from: k */
    public final boolean f158916k;

    /* renamed from: l */
    public final long f158917l;

    /* renamed from: m */
    public final long f158918m;

    /* renamed from: n */
    public final String f158919n;

    /* renamed from: o */
    public final String f158920o;

    static {
        Covode.recordClassIndex(83488);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70994e)) {
            return false;
        }
        C70994e eVar = (C70994e) obj;
        return C89219l.m154714a(this.f158906a, eVar.f158906a) && C89219l.m154714a(this.f158907b, eVar.f158907b) && C89219l.m154714a(this.f158908c, eVar.f158908c) && this.f158909d == eVar.f158909d && this.f158910e == eVar.f158910e && this.f158911f == eVar.f158911f && C89219l.m154714a(this.f158912g, eVar.f158912g) && C89219l.m154714a(this.f158913h, eVar.f158913h) && this.f158914i == eVar.f158914i && this.f158915j == eVar.f158915j && this.f158916k == eVar.f158916k && this.f158917l == eVar.f158917l && this.f158918m == eVar.f158918m && C89219l.m154714a(this.f158919n, eVar.f158919n) && C89219l.m154714a(this.f158920o, eVar.f158920o);
    }

    public final String toString() {
        return "ChooseMusicParam(stickerMusicIdsJsonString=" + this.f158906a + ", firstStickerId=" + this.f158907b + ", firstStickerChallengeId=" + this.f158908c + ", allowClear=" + this.f158909d + ", isPhotoMvMode=" + this.f158910e + ", isMVThemeMusic=" + this.f158911f + ", shootWay=" + this.f158912g + ", creationId=" + this.f158913h + ", longVideo=" + this.f158914i + ", isBusinessSticker=" + this.f158915j + ", hideCancelMusic=" + this.f158916k + ", maxDuration=" + this.f158917l + ", videoLength=" + this.f158918m + ", missionId=" + this.f158919n + ", missionMusicId=" + this.f158920o + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.f158906a;
        int i7 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        String str2 = this.f158907b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        String str3 = this.f158908c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        boolean z = this.f158909d;
        int i11 = 1;
        if (z) {
            z = true;
        }
        int i12 = z ? 1 : 0;
        int i13 = z ? 1 : 0;
        int i14 = z ? 1 : 0;
        int i15 = (i10 + i12) * 31;
        boolean z2 = this.f158910e;
        if (z2) {
            z2 = true;
        }
        int i16 = z2 ? 1 : 0;
        int i17 = z2 ? 1 : 0;
        int i18 = z2 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z3 = this.f158911f;
        if (z3) {
            z3 = true;
        }
        int i20 = z3 ? 1 : 0;
        int i21 = z3 ? 1 : 0;
        int i22 = z3 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        String str4 = this.f158912g;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i24 = (i23 + i4) * 31;
        String str5 = this.f158913h;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i25 = (i24 + i5) * 31;
        boolean z4 = this.f158914i;
        if (z4) {
            z4 = true;
        }
        int i26 = z4 ? 1 : 0;
        int i27 = z4 ? 1 : 0;
        int i28 = z4 ? 1 : 0;
        int i29 = (i25 + i26) * 31;
        boolean z5 = this.f158915j;
        if (z5) {
            z5 = true;
        }
        int i30 = z5 ? 1 : 0;
        int i31 = z5 ? 1 : 0;
        int i32 = z5 ? 1 : 0;
        int i33 = (i29 + i30) * 31;
        if (!this.f158916k) {
            i11 = 0;
        }
        long j = this.f158917l;
        long j2 = this.f158918m;
        int i34 = (((((i33 + i11) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str6 = this.f158919n;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i35 = (i34 + i6) * 31;
        String str7 = this.f158920o;
        if (str7 != null) {
            i7 = str7.hashCode();
        }
        return i35 + i7;
    }

    public C70994e(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, boolean z4, boolean z5, boolean z6, long j, long j2, String str6, String str7) {
        this.f158906a = str;
        this.f158907b = str2;
        this.f158908c = str3;
        this.f158909d = z;
        this.f158910e = z2;
        this.f158911f = z3;
        this.f158912g = str4;
        this.f158913h = str5;
        this.f158914i = z4;
        this.f158915j = z5;
        this.f158916k = z6;
        this.f158917l = j;
        this.f158918m = j2;
        this.f158919n = str6;
        this.f158920o = str7;
    }
}
