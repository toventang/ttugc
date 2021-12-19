package com.p2082ss.android.ugc.aweme.feed.assem.share;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.share.f */
public final class C49020f {

    /* renamed from: a */
    public final Drawable f112949a;

    /* renamed from: b */
    public final ViewGroup.LayoutParams f112950b;

    static {
        Covode.recordClassIndex(57811);
    }

    /* renamed from: a */
    public static C49020f m92185a(Drawable drawable, ViewGroup.LayoutParams layoutParams) {
        return new C49020f(drawable, layoutParams);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49020f)) {
            return false;
        }
        C49020f fVar = (C49020f) obj;
        return C89219l.m154714a(this.f112949a, fVar.f112949a) && C89219l.m154714a(this.f112950b, fVar.f112950b);
    }

    public final int hashCode() {
        Drawable drawable = this.f112949a;
        int i = 0;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        ViewGroup.LayoutParams layoutParams = this.f112950b;
        if (layoutParams != null) {
            i = layoutParams.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShareIconState(drawable=" + this.f112949a + ", layoutParams=" + this.f112950b + ")";
    }

    public /* synthetic */ C49020f() {
        this(null, null);
    }

    private C49020f(Drawable drawable, ViewGroup.LayoutParams layoutParams) {
        this.f112949a = drawable;
        this.f112950b = layoutParams;
    }
}
