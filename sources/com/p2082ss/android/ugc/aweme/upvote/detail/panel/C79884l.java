package com.p2082ss.android.ugc.aweme.upvote.detail.panel;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.l */
public final class C79884l implements AbstractC12853j {

    /* renamed from: a */
    public final EnumC79894q f179118a;

    /* renamed from: b */
    public final boolean f179119b;

    /* renamed from: c */
    public final float f179120c;

    /* renamed from: d */
    public final C12776a<Boolean> f179121d;

    static {
        Covode.recordClassIndex(93109);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79884l)) {
            return false;
        }
        C79884l lVar = (C79884l) obj;
        return C89219l.m154714a(this.f179118a, lVar.f179118a) && this.f179119b == lVar.f179119b && Float.compare(this.f179120c, lVar.f179120c) == 0 && C89219l.m154714a(this.f179121d, lVar.f179121d);
    }

    public final String toString() {
        return "UpvoteDetailPanelState(status=" + this.f179118a + ", isSelfUpvoted=" + this.f179119b + ", sheetSlideOffset=" + this.f179120c + ", refreshEvent=" + this.f179121d + ")";
    }

    public final int hashCode() {
        int i;
        EnumC79894q qVar = this.f179118a;
        int i2 = 0;
        if (qVar != null) {
            i = qVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        boolean z = this.f179119b;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int floatToIntBits = (((i3 + i4) * 31) + Float.floatToIntBits(this.f179120c)) * 31;
        C12776a<Boolean> aVar = this.f179121d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return floatToIntBits + i2;
    }

    public C79884l(EnumC79894q qVar, boolean z, float f, C12776a<Boolean> aVar) {
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(aVar, "");
        this.f179118a = qVar;
        this.f179119b = z;
        this.f179120c = f;
        this.f179121d = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C79884l m138655a(C79884l lVar, EnumC79894q qVar, boolean z, float f, C12776a aVar, int i) {
        if ((i & 1) != 0) {
            qVar = lVar.f179118a;
        }
        if ((i & 2) != 0) {
            z = lVar.f179119b;
        }
        if ((i & 4) != 0) {
            f = lVar.f179120c;
        }
        if ((i & 8) != 0) {
            aVar = lVar.f179121d;
        }
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(aVar, "");
        return new C79884l(qVar, z, f, aVar);
    }
}
