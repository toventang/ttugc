package com.p2082ss.android.ugc.aweme.feed.assem.desc;

import android.text.SpannableStringBuilder;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.l */
public final class C48650l implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<SpannableStringBuilder> f112473a;

    /* renamed from: b */
    public final boolean f112474b;

    /* renamed from: c */
    public final boolean f112475c;

    /* renamed from: d */
    public final boolean f112476d;

    /* renamed from: e */
    public final C48591a f112477e;

    /* renamed from: f */
    public final C12776a<Boolean> f112478f;

    /* renamed from: g */
    public final C12776a<Boolean> f112479g;

    static {
        Covode.recordClassIndex(57429);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48650l)) {
            return false;
        }
        C48650l lVar = (C48650l) obj;
        return C89219l.m154714a(this.f112473a, lVar.f112473a) && this.f112474b == lVar.f112474b && this.f112475c == lVar.f112475c && this.f112476d == lVar.f112476d && C89219l.m154714a(this.f112477e, lVar.f112477e) && C89219l.m154714a(this.f112478f, lVar.f112478f) && C89219l.m154714a(this.f112479g, lVar.f112479g);
    }

    public final int hashCode() {
        C12776a<SpannableStringBuilder> aVar = this.f112473a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        boolean z = this.f112474b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f112475c;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f112476d) {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        C48591a aVar2 = this.f112477e;
        int hashCode2 = (i11 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar3 = this.f112478f;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar4 = this.f112479g;
        if (aVar4 != null) {
            i = aVar4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "VideoDescState(sync2StateEvent=" + this.f112473a + ", isShowVideoDesc=" + this.f112474b + ", isShowSplitVideoPartDescForFeed=" + this.f112475c + ", isShowMixDesNumForFeed=" + this.f112476d + ", toggleAnimationState=" + this.f112477e + ", needOperateDesc=" + this.f112478f + ", showNoNetWorkToast=" + this.f112479g + ")";
    }

    public /* synthetic */ C48650l() {
        this(null, false, false, false, null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends android.text.SpannableStringBuilder> */
    /* JADX WARN: Multi-variable type inference failed */
    private C48650l(C12776a<? extends SpannableStringBuilder> aVar, boolean z, boolean z2, boolean z3, C48591a aVar2, C12776a<Boolean> aVar3, C12776a<Boolean> aVar4) {
        this.f112473a = aVar;
        this.f112474b = z;
        this.f112475c = z2;
        this.f112476d = z3;
        this.f112477e = aVar2;
        this.f112478f = aVar3;
        this.f112479g = aVar4;
    }

    /* renamed from: a */
    public static /* synthetic */ C48650l m91989a(C48650l lVar, C12776a aVar, boolean z, boolean z2, boolean z3, C48591a aVar2, C12776a aVar3, C12776a aVar4, int i) {
        C12776a aVar5 = aVar4;
        C12776a aVar6 = aVar3;
        C48591a aVar7 = aVar2;
        C12776a aVar8 = aVar;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i & 1) != 0) {
            aVar8 = lVar.f112473a;
        }
        if ((i & 2) != 0) {
            z4 = lVar.f112474b;
        }
        if ((i & 4) != 0) {
            z5 = lVar.f112475c;
        }
        if ((i & 8) != 0) {
            z6 = lVar.f112476d;
        }
        if ((i & 16) != 0) {
            aVar7 = lVar.f112477e;
        }
        if ((i & 32) != 0) {
            aVar6 = lVar.f112478f;
        }
        if ((i & 64) != 0) {
            aVar5 = lVar.f112479g;
        }
        return new C48650l(aVar8, z4, z5, z6, aVar7, aVar6, aVar5);
    }
}
