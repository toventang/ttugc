package com.p2082ss.android.ugc.aweme.feed.assem.multitag;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.e */
public final class C48767e implements AbstractC12853j {

    /* renamed from: a */
    public final String f112631a;

    /* renamed from: b */
    public final int f112632b;

    static {
        Covode.recordClassIndex(57550);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48767e)) {
            return false;
        }
        C48767e eVar = (C48767e) obj;
        return C89219l.m154714a(this.f112631a, eVar.f112631a) && this.f112632b == eVar.f112632b;
    }

    public final int hashCode() {
        String str = this.f112631a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f112632b;
    }

    public final String toString() {
        return "VideoFeedMultiTagState(awemeId=" + this.f112631a + ", anchorType=" + this.f112632b + ")";
    }

    public /* synthetic */ C48767e() {
        this(null, 0);
    }

    private C48767e(String str, int i) {
        this.f112631a = str;
        this.f112632b = i;
    }

    /* renamed from: a */
    public static /* synthetic */ C48767e m92059a(C48767e eVar, String str, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = eVar.f112631a;
        }
        if ((i2 & 2) != 0) {
            i = eVar.f112632b;
        }
        return new C48767e(str, i);
    }
}
