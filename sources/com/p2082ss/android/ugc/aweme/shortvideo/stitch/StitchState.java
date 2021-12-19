package com.p2082ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchState */
public final class StitchState implements AbstractC20368af {
    private final C20526p hideIntroduceEvent;
    private final C20526p quitEvent;
    private final C20526p showIntroduceEvent;
    private final C20526p showTrimmingNextGuideEvent;
    private final C20526p showTrimmingViewGuideEvent;

    static {
        Covode.recordClassIndex(85831);
    }

    public StitchState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ StitchState copy$default(StitchState stitchState, C20526p pVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, C20526p pVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = stitchState.showIntroduceEvent;
        }
        if ((i & 2) != 0) {
            pVar2 = stitchState.hideIntroduceEvent;
        }
        if ((i & 4) != 0) {
            pVar3 = stitchState.showTrimmingViewGuideEvent;
        }
        if ((i & 8) != 0) {
            pVar4 = stitchState.showTrimmingNextGuideEvent;
        }
        if ((i & 16) != 0) {
            pVar5 = stitchState.quitEvent;
        }
        return stitchState.copy(pVar, pVar2, pVar3, pVar4, pVar5);
    }

    public final C20526p component1() {
        return this.showIntroduceEvent;
    }

    public final C20526p component2() {
        return this.hideIntroduceEvent;
    }

    public final C20526p component3() {
        return this.showTrimmingViewGuideEvent;
    }

    public final C20526p component4() {
        return this.showTrimmingNextGuideEvent;
    }

    public final C20526p component5() {
        return this.quitEvent;
    }

    public final StitchState copy(C20526p pVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, C20526p pVar5) {
        return new StitchState(pVar, pVar2, pVar3, pVar4, pVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchState)) {
            return false;
        }
        StitchState stitchState = (StitchState) obj;
        return C89219l.m154714a(this.showIntroduceEvent, stitchState.showIntroduceEvent) && C89219l.m154714a(this.hideIntroduceEvent, stitchState.hideIntroduceEvent) && C89219l.m154714a(this.showTrimmingViewGuideEvent, stitchState.showTrimmingViewGuideEvent) && C89219l.m154714a(this.showTrimmingNextGuideEvent, stitchState.showTrimmingNextGuideEvent) && C89219l.m154714a(this.quitEvent, stitchState.quitEvent);
    }

    public final int hashCode() {
        C20526p pVar = this.showIntroduceEvent;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        C20526p pVar2 = this.hideIntroduceEvent;
        int hashCode2 = (hashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        C20526p pVar3 = this.showTrimmingViewGuideEvent;
        int hashCode3 = (hashCode2 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        C20526p pVar4 = this.showTrimmingNextGuideEvent;
        int hashCode4 = (hashCode3 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        C20526p pVar5 = this.quitEvent;
        if (pVar5 != null) {
            i = pVar5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "StitchState(showIntroduceEvent=" + this.showIntroduceEvent + ", hideIntroduceEvent=" + this.hideIntroduceEvent + ", showTrimmingViewGuideEvent=" + this.showTrimmingViewGuideEvent + ", showTrimmingNextGuideEvent=" + this.showTrimmingNextGuideEvent + ", quitEvent=" + this.quitEvent + ")";
    }

    public final C20526p getHideIntroduceEvent() {
        return this.hideIntroduceEvent;
    }

    public final C20526p getQuitEvent() {
        return this.quitEvent;
    }

    public final C20526p getShowIntroduceEvent() {
        return this.showIntroduceEvent;
    }

    public final C20526p getShowTrimmingNextGuideEvent() {
        return this.showTrimmingNextGuideEvent;
    }

    public final C20526p getShowTrimmingViewGuideEvent() {
        return this.showTrimmingViewGuideEvent;
    }

    public StitchState(C20526p pVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, C20526p pVar5) {
        this.showIntroduceEvent = pVar;
        this.hideIntroduceEvent = pVar2;
        this.showTrimmingViewGuideEvent = pVar3;
        this.showTrimmingNextGuideEvent = pVar4;
        this.quitEvent = pVar5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StitchState(C20526p pVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, C20526p pVar5, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : pVar2, (i & 4) != 0 ? null : pVar3, (i & 8) != 0 ? null : pVar4, (i & 16) == 0 ? pVar5 : null);
    }
}
