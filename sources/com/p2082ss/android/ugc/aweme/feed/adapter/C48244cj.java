package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoCaptionUpdateParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.cj */
public final class C48244cj implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<Integer> f111760a;

    /* renamed from: b */
    public final C12776a<String> f111761b;

    /* renamed from: c */
    public final C12776a<C89391z> f111762c;

    /* renamed from: d */
    public final C12776a<C89391z> f111763d;

    /* renamed from: e */
    public final C12776a<Aweme> f111764e;

    /* renamed from: f */
    public final C12776a<VideoItemParams> f111765f;

    /* renamed from: g */
    public final C12776a<VideoItemParams> f111766g;

    /* renamed from: h */
    public final C12776a<Integer> f111767h;

    /* renamed from: i */
    public final C12776a<VideoCaptionUpdateParams> f111768i;

    /* renamed from: j */
    public final C12776a<Boolean> f111769j;

    /* renamed from: k */
    public final C12776a<Boolean> f111770k;

    static {
        Covode.recordClassIndex(56986);
    }

    /* renamed from: a */
    private static C48244cj m91652a(C12776a<Integer> aVar, C12776a<String> aVar2, C12776a<C89391z> aVar3, C12776a<C89391z> aVar4, C12776a<? extends Aweme> aVar5, C12776a<? extends VideoItemParams> aVar6, C12776a<? extends VideoItemParams> aVar7, C12776a<Integer> aVar8, C12776a<VideoCaptionUpdateParams> aVar9, C12776a<Boolean> aVar10, C12776a<Boolean> aVar11) {
        return new C48244cj(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11);
    }

    /* renamed from: a */
    public static /* synthetic */ C48244cj m91653a(C48244cj cjVar, C12776a aVar, C12776a aVar2, C12776a aVar3, C12776a aVar4, C12776a aVar5, C12776a aVar6, C12776a aVar7, C12776a aVar8, C12776a aVar9, C12776a aVar10, C12776a aVar11, int i) {
        C12776a aVar12 = aVar11;
        C12776a aVar13 = aVar4;
        C12776a aVar14 = aVar3;
        C12776a aVar15 = aVar2;
        C12776a aVar16 = aVar;
        C12776a aVar17 = aVar5;
        C12776a aVar18 = aVar6;
        C12776a aVar19 = aVar7;
        C12776a aVar20 = aVar8;
        C12776a aVar21 = aVar9;
        C12776a aVar22 = aVar10;
        if ((i & 1) != 0) {
            aVar16 = cjVar.f111760a;
        }
        if ((i & 2) != 0) {
            aVar15 = cjVar.f111761b;
        }
        if ((i & 4) != 0) {
            aVar14 = cjVar.f111762c;
        }
        if ((i & 8) != 0) {
            aVar13 = cjVar.f111763d;
        }
        if ((i & 16) != 0) {
            aVar17 = cjVar.f111764e;
        }
        if ((i & 32) != 0) {
            aVar18 = cjVar.f111765f;
        }
        if ((i & 64) != 0) {
            aVar19 = cjVar.f111766g;
        }
        if ((i & 128) != 0) {
            aVar20 = cjVar.f111767h;
        }
        if ((i & 256) != 0) {
            aVar21 = cjVar.f111768i;
        }
        if ((i & 512) != 0) {
            aVar22 = cjVar.f111769j;
        }
        if ((i & 1024) != 0) {
            aVar12 = cjVar.f111770k;
        }
        return m91652a(aVar16, aVar15, aVar14, aVar13, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48244cj)) {
            return false;
        }
        C48244cj cjVar = (C48244cj) obj;
        return C89219l.m154714a(this.f111760a, cjVar.f111760a) && C89219l.m154714a(this.f111761b, cjVar.f111761b) && C89219l.m154714a(this.f111762c, cjVar.f111762c) && C89219l.m154714a(this.f111763d, cjVar.f111763d) && C89219l.m154714a(this.f111764e, cjVar.f111764e) && C89219l.m154714a(this.f111765f, cjVar.f111765f) && C89219l.m154714a(this.f111766g, cjVar.f111766g) && C89219l.m154714a(this.f111767h, cjVar.f111767h) && C89219l.m154714a(this.f111768i, cjVar.f111768i) && C89219l.m154714a(this.f111769j, cjVar.f111769j) && C89219l.m154714a(this.f111770k, cjVar.f111770k);
    }

    public final int hashCode() {
        C12776a<Integer> aVar = this.f111760a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C12776a<String> aVar2 = this.f111761b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar3 = this.f111762c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar4 = this.f111763d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        C12776a<Aweme> aVar5 = this.f111764e;
        int hashCode5 = (hashCode4 + (aVar5 != null ? aVar5.hashCode() : 0)) * 31;
        C12776a<VideoItemParams> aVar6 = this.f111765f;
        int hashCode6 = (hashCode5 + (aVar6 != null ? aVar6.hashCode() : 0)) * 31;
        C12776a<VideoItemParams> aVar7 = this.f111766g;
        int hashCode7 = (hashCode6 + (aVar7 != null ? aVar7.hashCode() : 0)) * 31;
        C12776a<Integer> aVar8 = this.f111767h;
        int hashCode8 = (hashCode7 + (aVar8 != null ? aVar8.hashCode() : 0)) * 31;
        C12776a<VideoCaptionUpdateParams> aVar9 = this.f111768i;
        int hashCode9 = (hashCode8 + (aVar9 != null ? aVar9.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar10 = this.f111769j;
        int hashCode10 = (hashCode9 + (aVar10 != null ? aVar10.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar11 = this.f111770k;
        if (aVar11 != null) {
            i = aVar11.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        return "VideoViewState(onPageSelectedEvent=" + this.f111760a + ", onHolderUnSelectedEvent=" + this.f111761b + ", onPageUnSelectedEvent=" + this.f111762c + ", onHolderPauseEvent=" + this.f111763d + ", doubleClickEvent=" + this.f111764e + ", updateLegacyBackupDataEvent=" + this.f111765f + ", updateLegacyDataEvent=" + this.f111766g + ", onHolderSelectedEvent=" + this.f111767h + ", updateCaptionTextEvent=" + this.f111768i + ", onProgressBarStateChangedEvent=" + this.f111769j + ", onBottomLayerClickedEvent=" + this.f111770k + ")";
    }

    public /* synthetic */ C48244cj() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.VideoItemParams> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.VideoItemParams> */
    /* JADX WARN: Multi-variable type inference failed */
    private C48244cj(C12776a<Integer> aVar, C12776a<String> aVar2, C12776a<C89391z> aVar3, C12776a<C89391z> aVar4, C12776a<? extends Aweme> aVar5, C12776a<? extends VideoItemParams> aVar6, C12776a<? extends VideoItemParams> aVar7, C12776a<Integer> aVar8, C12776a<VideoCaptionUpdateParams> aVar9, C12776a<Boolean> aVar10, C12776a<Boolean> aVar11) {
        this.f111760a = aVar;
        this.f111761b = aVar2;
        this.f111762c = aVar3;
        this.f111763d = aVar4;
        this.f111764e = aVar5;
        this.f111765f = aVar6;
        this.f111766g = aVar7;
        this.f111767h = aVar8;
        this.f111768i = aVar9;
        this.f111769j = aVar10;
        this.f111770k = aVar11;
    }
}
