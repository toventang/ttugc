package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.h */
public final class C69265h {

    /* renamed from: a */
    public final AbstractC69693h f154815a;

    /* renamed from: b */
    public final int f154816b;

    static {
        Covode.recordClassIndex(81595);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69265h)) {
            return false;
        }
        C69265h hVar = (C69265h) obj;
        return C89219l.m154714a(this.f154815a, hVar.f154815a) && this.f154816b == hVar.f154816b;
    }

    public final int hashCode() {
        AbstractC69693h hVar = this.f154815a;
        return ((hVar != null ? hVar.hashCode() : 0) * 31) + this.f154816b;
    }

    public final String toString() {
        return "LivePrioritySheetAction(sheetAction=" + this.f154815a + ", priority=" + this.f154816b + ")";
    }

    public C69265h(AbstractC69693h hVar, int i) {
        C89219l.m154721d(hVar, "");
        this.f154815a = hVar;
        this.f154816b = i;
    }
}
