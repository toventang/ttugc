package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bc */
public final class C48200bc implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<Boolean> f111663a;

    /* renamed from: b */
    public final C12776a<Integer> f111664b;

    /* renamed from: c */
    public final C12776a<Boolean> f111665c;

    /* renamed from: d */
    public final C12776a<C89391z> f111666d;

    /* renamed from: e */
    public final C12776a<C89391z> f111667e;

    /* renamed from: f */
    public final C12776a<C89391z> f111668f;

    /* renamed from: g */
    public final C12776a<C89391z> f111669g;

    /* renamed from: h */
    public final C12776a<Float> f111670h;

    /* renamed from: i */
    public final Double f111671i;

    /* renamed from: j */
    public final C12776a<Aweme> f111672j;

    static {
        Covode.recordClassIndex(56942);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48200bc)) {
            return false;
        }
        C48200bc bcVar = (C48200bc) obj;
        return C89219l.m154714a(this.f111663a, bcVar.f111663a) && C89219l.m154714a(this.f111664b, bcVar.f111664b) && C89219l.m154714a(this.f111665c, bcVar.f111665c) && C89219l.m154714a(this.f111666d, bcVar.f111666d) && C89219l.m154714a(this.f111667e, bcVar.f111667e) && C89219l.m154714a(this.f111668f, bcVar.f111668f) && C89219l.m154714a(this.f111669g, bcVar.f111669g) && C89219l.m154714a(this.f111670h, bcVar.f111670h) && C89219l.m154714a(this.f111671i, bcVar.f111671i) && C89219l.m154714a(this.f111672j, bcVar.f111672j);
    }

    public final int hashCode() {
        C12776a<Boolean> aVar = this.f111663a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C12776a<Integer> aVar2 = this.f111664b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar3 = this.f111665c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar4 = this.f111666d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar5 = this.f111667e;
        int hashCode5 = (hashCode4 + (aVar5 != null ? aVar5.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar6 = this.f111668f;
        int hashCode6 = (hashCode5 + (aVar6 != null ? aVar6.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar7 = this.f111669g;
        int hashCode7 = (hashCode6 + (aVar7 != null ? aVar7.hashCode() : 0)) * 31;
        C12776a<Float> aVar8 = this.f111670h;
        int hashCode8 = (hashCode7 + (aVar8 != null ? aVar8.hashCode() : 0)) * 31;
        Double d = this.f111671i;
        int hashCode9 = (hashCode8 + (d != null ? d.hashCode() : 0)) * 31;
        C12776a<Aweme> aVar9 = this.f111672j;
        if (aVar9 != null) {
            i = aVar9.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "VideoPlayState(playAnimationEvent=" + this.f111663a + ", pauseAnimationEvent=" + this.f111664b + ", stopAnimationEvent=" + this.f111665c + ", onRenderReadyEvent=" + this.f111666d + ", onRenderFirstFrameEvent=" + this.f111667e + ", onPlayCompletedFirstTime=" + this.f111668f + ", onResumePlayEvent=" + this.f111669g + ", playProgressEvent=" + this.f111670h + ", playGetDurationEvent=" + this.f111671i + ", resumePlayEvent=" + this.f111672j + ")";
    }

    public /* synthetic */ C48200bc() {
        this(new C12776a(false), new C12776a(0), new C12776a(false), null, null, null, null, null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    private C48200bc(C12776a<Boolean> aVar, C12776a<Integer> aVar2, C12776a<Boolean> aVar3, C12776a<C89391z> aVar4, C12776a<C89391z> aVar5, C12776a<C89391z> aVar6, C12776a<C89391z> aVar7, C12776a<Float> aVar8, Double d, C12776a<? extends Aweme> aVar9) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        this.f111663a = aVar;
        this.f111664b = aVar2;
        this.f111665c = aVar3;
        this.f111666d = aVar4;
        this.f111667e = aVar5;
        this.f111668f = aVar6;
        this.f111669g = aVar7;
        this.f111670h = aVar8;
        this.f111671i = d;
        this.f111672j = aVar9;
    }

    /* renamed from: a */
    public static /* synthetic */ C48200bc m91541a(C48200bc bcVar, C12776a aVar, C12776a aVar2, C12776a aVar3, C12776a aVar4, C12776a aVar5, C12776a aVar6, C12776a aVar7, C12776a aVar8, Double d, C12776a aVar9, int i) {
        C12776a aVar10 = aVar4;
        C12776a aVar11 = aVar3;
        C12776a aVar12 = aVar2;
        C12776a aVar13 = aVar;
        C12776a aVar14 = aVar5;
        C12776a aVar15 = aVar6;
        C12776a aVar16 = aVar7;
        C12776a aVar17 = aVar8;
        Double d2 = d;
        C12776a aVar18 = aVar9;
        if ((i & 1) != 0) {
            aVar13 = bcVar.f111663a;
        }
        if ((i & 2) != 0) {
            aVar12 = bcVar.f111664b;
        }
        if ((i & 4) != 0) {
            aVar11 = bcVar.f111665c;
        }
        if ((i & 8) != 0) {
            aVar10 = bcVar.f111666d;
        }
        if ((i & 16) != 0) {
            aVar14 = bcVar.f111667e;
        }
        if ((i & 32) != 0) {
            aVar15 = bcVar.f111668f;
        }
        if ((i & 64) != 0) {
            aVar16 = bcVar.f111669g;
        }
        if ((i & 128) != 0) {
            aVar17 = bcVar.f111670h;
        }
        if ((i & 256) != 0) {
            d2 = bcVar.f111671i;
        }
        if ((i & 512) != 0) {
            aVar18 = bcVar.f111672j;
        }
        C89219l.m154721d(aVar13, "");
        C89219l.m154721d(aVar12, "");
        C89219l.m154721d(aVar11, "");
        return new C48200bc(aVar13, aVar12, aVar11, aVar10, aVar14, aVar15, aVar16, aVar17, d2, aVar18);
    }
}
