package com.p2082ss.android.ugc.aweme.sticker.panel;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.h */
public final class C75572h {

    /* renamed from: a */
    public int f169827a;

    /* renamed from: b */
    public int f169828b;

    /* renamed from: c */
    public AbstractC89172b<? super ViewGroup, ? extends View> f169829c;

    /* renamed from: d */
    public AbstractC89172b<? super ViewGroup, ? extends View> f169830d;

    /* renamed from: e */
    public AbstractC89172b<? super ViewGroup, ? extends View> f169831e;

    /* renamed from: f */
    public AbstractC89172b<? super ViewGroup, ? extends C89378p<? extends View, ? extends View>> f169832f;

    /* renamed from: g */
    public C75575k f169833g;

    /* renamed from: h */
    public boolean f169834h;

    /* renamed from: i */
    public boolean f169835i;

    /* renamed from: j */
    public boolean f169836j;

    /* renamed from: k */
    public AbstractC89172b<? super ViewGroup, ? extends View> f169837k;

    /* renamed from: l */
    public AbstractC89172b<? super ViewGroup, ? extends View> f169838l;

    static {
        Covode.recordClassIndex(88496);
    }

    public C75572h() {
        this(0, 0, null, false, false, false, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75572h)) {
            return false;
        }
        C75572h hVar = (C75572h) obj;
        return this.f169827a == hVar.f169827a && this.f169828b == hVar.f169828b && C89219l.m154714a(this.f169829c, hVar.f169829c) && C89219l.m154714a(this.f169830d, hVar.f169830d) && C89219l.m154714a(this.f169831e, hVar.f169831e) && C89219l.m154714a(this.f169832f, hVar.f169832f) && C89219l.m154714a(this.f169833g, hVar.f169833g) && this.f169834h == hVar.f169834h && this.f169835i == hVar.f169835i && this.f169836j == hVar.f169836j && C89219l.m154714a(this.f169837k, hVar.f169837k) && C89219l.m154714a(this.f169838l, hVar.f169838l);
    }

    public final int hashCode() {
        int i = ((this.f169827a * 31) + this.f169828b) * 31;
        AbstractC89172b<? super ViewGroup, ? extends View> bVar = this.f169829c;
        int i2 = 0;
        int hashCode = (i + (bVar != null ? bVar.hashCode() : 0)) * 31;
        AbstractC89172b<? super ViewGroup, ? extends View> bVar2 = this.f169830d;
        int hashCode2 = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        AbstractC89172b<? super ViewGroup, ? extends View> bVar3 = this.f169831e;
        int hashCode3 = (hashCode2 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        AbstractC89172b<? super ViewGroup, ? extends C89378p<? extends View, ? extends View>> bVar4 = this.f169832f;
        int hashCode4 = (hashCode3 + (bVar4 != null ? bVar4.hashCode() : 0)) * 31;
        C75575k kVar = this.f169833g;
        int hashCode5 = (hashCode4 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        boolean z = this.f169834h;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode5 + i4) * 31;
        boolean z2 = this.f169835i;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        if (!this.f169836j) {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        AbstractC89172b<? super ViewGroup, ? extends View> bVar5 = this.f169837k;
        int hashCode6 = (i12 + (bVar5 != null ? bVar5.hashCode() : 0)) * 31;
        AbstractC89172b<? super ViewGroup, ? extends View> bVar6 = this.f169838l;
        if (bVar6 != null) {
            i2 = bVar6.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "StickerListViewConfigure(spanCount=" + this.f169827a + ", viewCacheSize=" + this.f169828b + ", loadingView=" + this.f169829c + ", emptyView=" + this.f169830d + ", favoriteEmptyView=" + this.f169831e + ", errorRetryView=" + this.f169832f + ", stickerViewHolderConfigure=" + this.f169833g + ", lazyRenderStickerData=" + this.f169834h + ", lazyLoadViewPager=" + this.f169835i + ", stopImageLoadWhenScroll=" + this.f169836j + ", headerViewProvider=" + this.f169837k + ", footerViewProvider=" + this.f169838l + ")";
    }

    private C75572h(int i, int i2, C75575k kVar, boolean z, boolean z2, boolean z3) {
        C89219l.m154721d(kVar, "");
        this.f169827a = i;
        this.f169828b = i2;
        this.f169829c = null;
        this.f169830d = null;
        this.f169831e = null;
        this.f169832f = null;
        this.f169833g = kVar;
        this.f169834h = z;
        this.f169835i = z2;
        this.f169836j = z3;
        this.f169837k = null;
        this.f169838l = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C75572h(int i, int i2, C75575k kVar, boolean z, boolean z2, boolean z3, int i3) {
        this((i3 & 1) != 0 ? 5 : i, (i3 & 2) == 0 ? i2 : 5, (i3 & 64) != 0 ? new C75575k((byte) 0) : kVar, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? false : z2, (i3 & 512) != 0 ? false : z3);
    }
}
