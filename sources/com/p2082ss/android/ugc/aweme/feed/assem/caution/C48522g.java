package com.p2082ss.android.ugc.aweme.feed.assem.caution;

import android.text.SpannableString;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.g */
public final class C48522g implements AbstractC12853j {

    /* renamed from: a */
    public final boolean f112265a;

    /* renamed from: b */
    public final SpannableString f112266b;

    static {
        Covode.recordClassIndex(57298);
    }

    /* renamed from: a */
    public static C48522g m91922a(boolean z, SpannableString spannableString) {
        return new C48522g(z, spannableString);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48522g)) {
            return false;
        }
        C48522g gVar = (C48522g) obj;
        return this.f112265a == gVar.f112265a && C89219l.m154714a(this.f112266b, gVar.f112266b);
    }

    public final int hashCode() {
        boolean z = this.f112265a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        SpannableString spannableString = this.f112266b;
        return i4 + (spannableString != null ? spannableString.hashCode() : 0);
    }

    public final String toString() {
        return "VideoTopCautionState(visible=" + this.f112265a + ", text=" + ((Object) this.f112266b) + ")";
    }

    public /* synthetic */ C48522g() {
        this(false, null);
    }

    private C48522g(boolean z, SpannableString spannableString) {
        this.f112265a = z;
        this.f112266b = spannableString;
    }
}
