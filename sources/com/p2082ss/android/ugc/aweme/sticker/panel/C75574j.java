package com.p2082ss.android.ugc.aweme.sticker.panel;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.j */
public final class C75574j {

    /* renamed from: a */
    public int f169839a;

    /* renamed from: b */
    public int f169840b;

    /* renamed from: c */
    public C75520e f169841c;

    /* renamed from: d */
    public int f169842d;

    /* renamed from: e */
    public int f169843e;

    /* renamed from: f */
    public int f169844f;

    /* renamed from: g */
    public int f169845g;

    /* renamed from: h */
    public int f169846h;

    /* renamed from: i */
    public boolean f169847i;

    /* renamed from: j */
    public long f169848j;

    /* renamed from: k */
    public boolean f169849k;

    /* renamed from: l */
    public C75522g f169850l;

    /* renamed from: m */
    public C75572h f169851m;

    /* renamed from: n */
    public final boolean f169852n;

    /* renamed from: o */
    public final boolean f169853o;

    /* renamed from: p */
    public final boolean f169854p;

    /* renamed from: q */
    public final boolean f169855q;

    static {
        Covode.recordClassIndex(88498);
    }

    public C75574j() {
        this(0, 0, null, 0, 0, 0, false, 0, false, null, null, false, false, false, 131071);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75574j)) {
            return false;
        }
        C75574j jVar = (C75574j) obj;
        return this.f169839a == jVar.f169839a && this.f169840b == jVar.f169840b && C89219l.m154714a(this.f169841c, jVar.f169841c) && this.f169842d == jVar.f169842d && this.f169843e == jVar.f169843e && this.f169844f == jVar.f169844f && this.f169845g == jVar.f169845g && this.f169846h == jVar.f169846h && this.f169847i == jVar.f169847i && this.f169848j == jVar.f169848j && this.f169849k == jVar.f169849k && C89219l.m154714a(this.f169850l, jVar.f169850l) && C89219l.m154714a(this.f169851m, jVar.f169851m) && this.f169852n == jVar.f169852n && this.f169853o == jVar.f169853o && this.f169854p == jVar.f169854p && this.f169855q == jVar.f169855q;
    }

    public final int hashCode() {
        int i = ((this.f169839a * 31) + this.f169840b) * 31;
        C75520e eVar = this.f169841c;
        int i2 = 0;
        int hashCode = (((((((((((i + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f169842d) * 31) + this.f169843e) * 31) + this.f169844f) * 31) + this.f169845g) * 31) + this.f169846h) * 31;
        boolean z = this.f169847i;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        long j = this.f169848j;
        int i7 = (((hashCode + i4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z2 = this.f169849k;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        C75522g gVar = this.f169850l;
        int hashCode2 = (i11 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        C75572h hVar = this.f169851m;
        if (hVar != null) {
            i2 = hVar.hashCode();
        }
        int i12 = (hashCode2 + i2) * 31;
        boolean z3 = this.f169852n;
        if (z3) {
            z3 = true;
        }
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = z3 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        boolean z4 = this.f169853o;
        if (z4) {
            z4 = true;
        }
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = z4 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        boolean z5 = this.f169854p;
        if (z5) {
            z5 = true;
        }
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = z5 ? 1 : 0;
        int i24 = (i20 + i21) * 31;
        if (!this.f169855q) {
            i3 = 0;
        }
        return i24 + i3;
    }

    public final String toString() {
        return "StickerViewConfigure(tabBackgroundDrawableRes=" + this.f169839a + ", panelBackgroundDrawableRes=" + this.f169840b + ", reverseCameraConfigure=" + this.f169841c + ", tagLayoutTopMargin=" + this.f169842d + ", stickerViewHeight=" + this.f169843e + ", favoriteTintColor=" + this.f169844f + ", searchEffectType=" + this.f169845g + ", searchTypeTT=" + this.f169846h + ", isLockStickerEnable=" + this.f169847i + ", stickerTransitionStartDuration=" + this.f169848j + ", isTabModeRelatedToTabCount=" + this.f169849k + ", stickerContentViewConfig=" + this.f169850l + ", stickerListViewConfigure=" + this.f169851m + ", enableText=" + this.f169852n + ", isTextMarquee=" + this.f169853o + ", enableStyleRecommend=" + this.f169854p + ", propSearchOptimized=" + this.f169855q + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C75574j(int i, int i2, C75520e eVar, int i3, int i4, int i5, boolean z, long j, boolean z2, C75522g gVar, C75572h hVar, boolean z3, boolean z4, boolean z5, int i6) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? null : eVar, 0, 0, (i6 & 32) != 0 ? -1 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) != 0 ? false : z, (i6 & 512) != 0 ? 490 : j, (i6 & 1024) != 0 ? true : z2, (i6 & 2048) != 0 ? new C75522g() : gVar, (i6 & 4096) != 0 ? new C75572h(0, 0, null, false, false, false, 4095) : hVar, false, (i6 & 16384) != 0 ? false : z4, (i6 & 32768) != 0 ? true : z5, false);
    }

    public C75574j(int i, int i2, C75520e eVar, int i3, int i4, int i5, int i6, int i7, boolean z, long j, boolean z2, C75522g gVar, C75572h hVar, boolean z3, boolean z4, boolean z5, boolean z6) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(hVar, "");
        this.f169839a = i;
        this.f169840b = i2;
        this.f169841c = eVar;
        this.f169842d = i3;
        this.f169843e = i4;
        this.f169844f = i5;
        this.f169845g = i6;
        this.f169846h = i7;
        this.f169847i = z;
        this.f169848j = j;
        this.f169849k = z2;
        this.f169850l = gVar;
        this.f169851m = hVar;
        this.f169852n = z3;
        this.f169853o = z4;
        this.f169854p = z5;
        this.f169855q = z6;
    }
}
