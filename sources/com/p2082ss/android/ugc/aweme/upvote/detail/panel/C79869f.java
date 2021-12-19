package com.p2082ss.android.ugc.aweme.upvote.detail.panel;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.f */
public final class C79869f implements AbstractC12779c {

    /* renamed from: a */
    public final String f179095a;

    /* renamed from: b */
    public final String f179096b;

    /* renamed from: c */
    public final String f179097c;

    /* renamed from: d */
    public final boolean f179098d;

    static {
        Covode.recordClassIndex(93094);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79869f)) {
            return false;
        }
        C79869f fVar = (C79869f) obj;
        return C89219l.m154714a(this.f179095a, fVar.f179095a) && C89219l.m154714a(this.f179096b, fVar.f179096b) && C89219l.m154714a(this.f179097c, fVar.f179097c) && this.f179098d == fVar.f179098d;
    }

    public final int hashCode() {
        String str = this.f179095a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f179096b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f179097c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f179098d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "UpvoteDetailPanelInitData(aid=" + this.f179095a + ", vmIdentifier=" + this.f179096b + ", upvoteId=" + this.f179097c + ", firstTimeOpen=" + this.f179098d + ")";
    }

    public C79869f(String str, String str2, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f179095a = str;
        this.f179096b = str2;
        this.f179097c = str3;
        this.f179098d = z;
    }
}
