package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState */
public final class CutVideoPreviewState implements AbstractC20368af {
    private final C20524n<Integer, Integer> resetSurfaceSizeEvent;
    private final C20526p restartProgress;
    private final Boolean surfaceEnable;
    private final C20523m updateBottomMarginEvent;
    private final C20526p updateVEDisplayEvent;

    static {
        Covode.recordClassIndex(82562);
    }

    public CutVideoPreviewState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CutVideoPreviewState copy$default(CutVideoPreviewState cutVideoPreviewState, C20526p pVar, Boolean bool, C20524n nVar, C20523m mVar, C20526p pVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = cutVideoPreviewState.restartProgress;
        }
        if ((i & 2) != 0) {
            bool = cutVideoPreviewState.surfaceEnable;
        }
        if ((i & 4) != 0) {
            nVar = cutVideoPreviewState.resetSurfaceSizeEvent;
        }
        if ((i & 8) != 0) {
            mVar = cutVideoPreviewState.updateBottomMarginEvent;
        }
        if ((i & 16) != 0) {
            pVar2 = cutVideoPreviewState.updateVEDisplayEvent;
        }
        return cutVideoPreviewState.copy(pVar, bool, nVar, mVar, pVar2);
    }

    public final C20526p component1() {
        return this.restartProgress;
    }

    public final Boolean component2() {
        return this.surfaceEnable;
    }

    public final C20524n<Integer, Integer> component3() {
        return this.resetSurfaceSizeEvent;
    }

    public final C20523m component4() {
        return this.updateBottomMarginEvent;
    }

    public final C20526p component5() {
        return this.updateVEDisplayEvent;
    }

    public final CutVideoPreviewState copy(C20526p pVar, Boolean bool, C20524n<Integer, Integer> nVar, C20523m mVar, C20526p pVar2) {
        return new CutVideoPreviewState(pVar, bool, nVar, mVar, pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoPreviewState)) {
            return false;
        }
        CutVideoPreviewState cutVideoPreviewState = (CutVideoPreviewState) obj;
        return C89219l.m154714a(this.restartProgress, cutVideoPreviewState.restartProgress) && C89219l.m154714a(this.surfaceEnable, cutVideoPreviewState.surfaceEnable) && C89219l.m154714a(this.resetSurfaceSizeEvent, cutVideoPreviewState.resetSurfaceSizeEvent) && C89219l.m154714a(this.updateBottomMarginEvent, cutVideoPreviewState.updateBottomMarginEvent) && C89219l.m154714a(this.updateVEDisplayEvent, cutVideoPreviewState.updateVEDisplayEvent);
    }

    public final int hashCode() {
        C20526p pVar = this.restartProgress;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        Boolean bool = this.surfaceEnable;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        C20524n<Integer, Integer> nVar = this.resetSurfaceSizeEvent;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C20523m mVar = this.updateBottomMarginEvent;
        int hashCode4 = (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C20526p pVar2 = this.updateVEDisplayEvent;
        if (pVar2 != null) {
            i = pVar2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CutVideoPreviewState(restartProgress=" + this.restartProgress + ", surfaceEnable=" + this.surfaceEnable + ", resetSurfaceSizeEvent=" + this.resetSurfaceSizeEvent + ", updateBottomMarginEvent=" + this.updateBottomMarginEvent + ", updateVEDisplayEvent=" + this.updateVEDisplayEvent + ")";
    }

    public final C20524n<Integer, Integer> getResetSurfaceSizeEvent() {
        return this.resetSurfaceSizeEvent;
    }

    public final C20526p getRestartProgress() {
        return this.restartProgress;
    }

    public final Boolean getSurfaceEnable() {
        return this.surfaceEnable;
    }

    public final C20523m getUpdateBottomMarginEvent() {
        return this.updateBottomMarginEvent;
    }

    public final C20526p getUpdateVEDisplayEvent() {
        return this.updateVEDisplayEvent;
    }

    public CutVideoPreviewState(C20526p pVar, Boolean bool, C20524n<Integer, Integer> nVar, C20523m mVar, C20526p pVar2) {
        this.restartProgress = pVar;
        this.surfaceEnable = bool;
        this.resetSurfaceSizeEvent = nVar;
        this.updateBottomMarginEvent = mVar;
        this.updateVEDisplayEvent = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoPreviewState(C20526p pVar, Boolean bool, C20524n nVar, C20523m mVar, C20526p pVar2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : nVar, (i & 8) != 0 ? null : mVar, (i & 16) == 0 ? pVar2 : null);
    }
}
