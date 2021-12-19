package com.p2082ss.android.ugc.aweme.feed.assem.videocomment;

import android.graphics.drawable.Drawable;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.n */
public final class C49216n implements AbstractC12853j {

    /* renamed from: a */
    public final Drawable f113199a;

    /* renamed from: b */
    public final int f113200b;

    /* renamed from: c */
    public final boolean f113201c;

    /* renamed from: d */
    public final String f113202d;

    /* renamed from: e */
    public final int f113203e;

    /* renamed from: f */
    public final int f113204f;

    static {
        Covode.recordClassIndex(58011);
    }

    /* renamed from: a */
    public static C49216n m92281a(Drawable drawable, int i, boolean z, String str, int i2, int i3) {
        C89219l.m154721d(str, "");
        return new C49216n(drawable, i, z, str, i2, i3);
    }

    /* renamed from: a */
    public static /* synthetic */ C49216n m92282a(C49216n nVar, Drawable drawable, int i, boolean z, String str, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i2;
        Drawable drawable2 = drawable;
        int i7 = i;
        boolean z2 = z;
        String str2 = str;
        if ((i4 & 1) != 0) {
            drawable2 = nVar.f113199a;
        }
        if ((i4 & 2) != 0) {
            i7 = nVar.f113200b;
        }
        if ((i4 & 4) != 0) {
            z2 = nVar.f113201c;
        }
        if ((i4 & 8) != 0) {
            str2 = nVar.f113202d;
        }
        if ((i4 & 16) != 0) {
            i6 = nVar.f113203e;
        }
        if ((i4 & 32) != 0) {
            i5 = nVar.f113204f;
        }
        return m92281a(drawable2, i7, z2, str2, i6, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49216n)) {
            return false;
        }
        C49216n nVar = (C49216n) obj;
        return C89219l.m154714a(this.f113199a, nVar.f113199a) && this.f113200b == nVar.f113200b && this.f113201c == nVar.f113201c && C89219l.m154714a(this.f113202d, nVar.f113202d) && this.f113203e == nVar.f113203e && this.f113204f == nVar.f113204f;
    }

    public final int hashCode() {
        Drawable drawable = this.f113199a;
        int i = 0;
        int hashCode = (((drawable != null ? drawable.hashCode() : 0) * 31) + this.f113200b) * 31;
        boolean z = this.f113201c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        String str = this.f113202d;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((i5 + i) * 31) + this.f113203e) * 31) + this.f113204f;
    }

    public final String toString() {
        return "VideoCommentState(commentImageDrawable=" + this.f113199a + ", commentGiftVisible=" + this.f113200b + ", commentGiftAnimate=" + this.f113201c + ", commentCountText=" + this.f113202d + ", commentCountVisible=" + this.f113203e + ", commentLayoutVisible=" + this.f113204f + ")";
    }

    public /* synthetic */ C49216n() {
        this(null, 8, false, "", 8, 0);
    }

    private C49216n(Drawable drawable, int i, boolean z, String str, int i2, int i3) {
        C89219l.m154721d(str, "");
        this.f113199a = drawable;
        this.f113200b = i;
        this.f113201c = z;
        this.f113202d = str;
        this.f113203e = i2;
        this.f113204f = i3;
    }
}
