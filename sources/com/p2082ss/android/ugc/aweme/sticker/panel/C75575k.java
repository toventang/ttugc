package com.p2082ss.android.ugc.aweme.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.k */
public final class C75575k {

    /* renamed from: a */
    public boolean f169856a;

    /* renamed from: b */
    public int f169857b;

    /* renamed from: c */
    public float f169858c;

    /* renamed from: d */
    public int f169859d;

    /* renamed from: e */
    public float f169860e;

    /* renamed from: f */
    public float f169861f;

    /* renamed from: g */
    public float f169862g;

    /* renamed from: h */
    public float f169863h;

    /* renamed from: i */
    public float f169864i;

    /* renamed from: j */
    public float f169865j;

    /* renamed from: k */
    public int f169866k;

    /* renamed from: l */
    public int f169867l;

    /* renamed from: m */
    public boolean f169868m;

    /* renamed from: n */
    public AbstractC89172b<? super C85035a.C85036a, C89391z> f169869n;

    /* renamed from: o */
    public boolean f169870o;

    /* renamed from: p */
    public boolean f169871p;

    /* renamed from: q */
    public int f169872q;

    /* renamed from: r */
    public int f169873r;

    /* renamed from: s */
    public boolean f169874s;

    /* renamed from: t */
    public boolean f169875t;

    static {
        Covode.recordClassIndex(88499);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75575k)) {
            return false;
        }
        C75575k kVar = (C75575k) obj;
        return this.f169856a == kVar.f169856a && this.f169857b == kVar.f169857b && Float.compare(this.f169858c, kVar.f169858c) == 0 && this.f169859d == kVar.f169859d && Float.compare(this.f169860e, kVar.f169860e) == 0 && Float.compare(this.f169861f, kVar.f169861f) == 0 && Float.compare(this.f169862g, kVar.f169862g) == 0 && Float.compare(this.f169863h, kVar.f169863h) == 0 && Float.compare(this.f169864i, kVar.f169864i) == 0 && Float.compare(this.f169865j, kVar.f169865j) == 0 && this.f169866k == kVar.f169866k && this.f169867l == kVar.f169867l && this.f169868m == kVar.f169868m && C89219l.m154714a(this.f169869n, kVar.f169869n) && this.f169870o == kVar.f169870o && this.f169871p == kVar.f169871p && this.f169872q == kVar.f169872q && this.f169873r == kVar.f169873r && this.f169874s == kVar.f169874s && this.f169875t == kVar.f169875t;
    }

    public final int hashCode() {
        boolean z = this.f169856a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int floatToIntBits = ((((((((((((((((((((((i2 * 31) + this.f169857b) * 31) + Float.floatToIntBits(this.f169858c)) * 31) + this.f169859d) * 31) + Float.floatToIntBits(this.f169860e)) * 31) + Float.floatToIntBits(this.f169861f)) * 31) + Float.floatToIntBits(this.f169862g)) * 31) + Float.floatToIntBits(this.f169863h)) * 31) + Float.floatToIntBits(this.f169864i)) * 31) + Float.floatToIntBits(this.f169865j)) * 31) + this.f169866k) * 31) + this.f169867l) * 31;
        boolean z2 = this.f169868m;
        if (z2) {
            z2 = true;
        }
        int i5 = z2 ? 1 : 0;
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = (floatToIntBits + i5) * 31;
        AbstractC89172b<? super C85035a.C85036a, C89391z> bVar = this.f169869n;
        int hashCode = (i8 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        boolean z3 = this.f169870o;
        if (z3) {
            z3 = true;
        }
        int i9 = z3 ? 1 : 0;
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = (hashCode + i9) * 31;
        boolean z4 = this.f169871p;
        if (z4) {
            z4 = true;
        }
        int i13 = z4 ? 1 : 0;
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = (((((i12 + i13) * 31) + this.f169872q) * 31) + this.f169873r) * 31;
        boolean z5 = this.f169874s;
        if (z5) {
            z5 = true;
        }
        int i17 = z5 ? 1 : 0;
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        if (!this.f169875t) {
            i = 0;
        }
        return i20 + i;
    }

    public final String toString() {
        return "StickerViewHolderConfigure(isCircle=" + this.f169856a + ", borderColorRes=" + this.f169857b + ", roundRadius=" + this.f169858c + ", borderWidth=" + this.f169859d + ", imageWidth=" + this.f169860e + ", imageHeight=" + this.f169861f + ", stickerViewWidth=" + this.f169862g + ", stickerViewHeight=" + this.f169863h + ", containerWidth=" + this.f169864i + ", containerHeight=" + this.f169865j + ", downloadIconRes=" + this.f169866k + ", loadingIconRes=" + this.f169867l + ", enableItemScale=" + this.f169868m + ", stickerViewBuilder=" + this.f169869n + ", enableText=" + this.f169870o + ", isTextMarquee=" + this.f169871p + ", textMarinTop=" + this.f169872q + ", textMarinBottom=" + this.f169873r + ", enableDotView=" + this.f169874s + ", enableDynamicIcon=" + this.f169875t + ")";
    }

    private C75575k() {
        this.f169856a = false;
        this.f169857b = R.color.pv;
        this.f169858c = 8.0f;
        this.f169859d = 2;
        this.f169860e = 54.0f;
        this.f169861f = 54.0f;
        this.f169862g = -2.0f;
        this.f169863h = -2.0f;
        this.f169864i = -1.0f;
        this.f169865j = -2.0f;
        this.f169866k = R.drawable.bnt;
        this.f169867l = R.drawable.bnu;
        this.f169868m = true;
        this.f169869n = null;
        this.f169870o = false;
        this.f169871p = false;
        this.f169872q = 4;
        this.f169873r = 0;
        this.f169874s = true;
        this.f169875t = false;
    }

    public /* synthetic */ C75575k(byte b) {
        this();
    }
}
