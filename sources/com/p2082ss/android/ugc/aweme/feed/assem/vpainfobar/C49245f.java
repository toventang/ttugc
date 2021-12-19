package com.p2082ss.android.ugc.aweme.feed.assem.vpainfobar;

import android.text.SpannableString;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.f */
public final class C49245f implements AbstractC12853j {

    /* renamed from: a */
    public final SpannableString f113233a;

    /* renamed from: b */
    public final int f113234b;

    /* renamed from: c */
    public final int f113235c;

    static {
        Covode.recordClassIndex(58041);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49245f)) {
            return false;
        }
        C49245f fVar = (C49245f) obj;
        return C89219l.m154714a(this.f113233a, fVar.f113233a) && this.f113234b == fVar.f113234b && this.f113235c == fVar.f113235c;
    }

    public final int hashCode() {
        SpannableString spannableString = this.f113233a;
        return ((((spannableString != null ? spannableString.hashCode() : 0) * 31) + this.f113234b) * 31) + this.f113235c;
    }

    public final String toString() {
        return "VPAInfoBarState(infoText=" + ((Object) this.f113233a) + ", contentVisible=" + this.f113234b + ", optOutBtnVisible=" + this.f113235c + ")";
    }

    public /* synthetic */ C49245f() {
        this(null, 8, 8);
    }

    public C49245f(SpannableString spannableString, int i, int i2) {
        this.f113233a = spannableString;
        this.f113234b = i;
        this.f113235c = i2;
    }
}
