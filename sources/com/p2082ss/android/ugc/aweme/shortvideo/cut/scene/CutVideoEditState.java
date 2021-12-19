package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState */
public final class CutVideoEditState implements AbstractC20368af {
    private final C20521k changeStickPointSlideModeEvent;
    private final Boolean editEnable;
    private final Boolean isEditVideoLength;
    private final C20526p refreshFrameMapEvent;
    private final C20526p updatePlayBoundaryEvent;

    static {
        Covode.recordClassIndex(82534);
    }

    public CutVideoEditState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CutVideoEditState copy$default(CutVideoEditState cutVideoEditState, C20526p pVar, Boolean bool, C20521k kVar, C20526p pVar2, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = cutVideoEditState.updatePlayBoundaryEvent;
        }
        if ((i & 2) != 0) {
            bool = cutVideoEditState.editEnable;
        }
        if ((i & 4) != 0) {
            kVar = cutVideoEditState.changeStickPointSlideModeEvent;
        }
        if ((i & 8) != 0) {
            pVar2 = cutVideoEditState.refreshFrameMapEvent;
        }
        if ((i & 16) != 0) {
            bool2 = cutVideoEditState.isEditVideoLength;
        }
        return cutVideoEditState.copy(pVar, bool, kVar, pVar2, bool2);
    }

    public final C20526p component1() {
        return this.updatePlayBoundaryEvent;
    }

    public final Boolean component2() {
        return this.editEnable;
    }

    public final C20521k component3() {
        return this.changeStickPointSlideModeEvent;
    }

    public final C20526p component4() {
        return this.refreshFrameMapEvent;
    }

    public final Boolean component5() {
        return this.isEditVideoLength;
    }

    public final CutVideoEditState copy(C20526p pVar, Boolean bool, C20521k kVar, C20526p pVar2, Boolean bool2) {
        return new CutVideoEditState(pVar, bool, kVar, pVar2, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoEditState)) {
            return false;
        }
        CutVideoEditState cutVideoEditState = (CutVideoEditState) obj;
        return C89219l.m154714a(this.updatePlayBoundaryEvent, cutVideoEditState.updatePlayBoundaryEvent) && C89219l.m154714a(this.editEnable, cutVideoEditState.editEnable) && C89219l.m154714a(this.changeStickPointSlideModeEvent, cutVideoEditState.changeStickPointSlideModeEvent) && C89219l.m154714a(this.refreshFrameMapEvent, cutVideoEditState.refreshFrameMapEvent) && C89219l.m154714a(this.isEditVideoLength, cutVideoEditState.isEditVideoLength);
    }

    public final int hashCode() {
        C20526p pVar = this.updatePlayBoundaryEvent;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        Boolean bool = this.editEnable;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        C20521k kVar = this.changeStickPointSlideModeEvent;
        int hashCode3 = (hashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C20526p pVar2 = this.refreshFrameMapEvent;
        int hashCode4 = (hashCode3 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        Boolean bool2 = this.isEditVideoLength;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CutVideoEditState(updatePlayBoundaryEvent=" + this.updatePlayBoundaryEvent + ", editEnable=" + this.editEnable + ", changeStickPointSlideModeEvent=" + this.changeStickPointSlideModeEvent + ", refreshFrameMapEvent=" + this.refreshFrameMapEvent + ", isEditVideoLength=" + this.isEditVideoLength + ")";
    }

    public final C20521k getChangeStickPointSlideModeEvent() {
        return this.changeStickPointSlideModeEvent;
    }

    public final Boolean getEditEnable() {
        return this.editEnable;
    }

    public final C20526p getRefreshFrameMapEvent() {
        return this.refreshFrameMapEvent;
    }

    public final C20526p getUpdatePlayBoundaryEvent() {
        return this.updatePlayBoundaryEvent;
    }

    public final Boolean isEditVideoLength() {
        return this.isEditVideoLength;
    }

    public CutVideoEditState(C20526p pVar, Boolean bool, C20521k kVar, C20526p pVar2, Boolean bool2) {
        this.updatePlayBoundaryEvent = pVar;
        this.editEnable = bool;
        this.changeStickPointSlideModeEvent = kVar;
        this.refreshFrameMapEvent = pVar2;
        this.isEditVideoLength = bool2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoEditState(C20526p pVar, Boolean bool, C20521k kVar, C20526p pVar2, Boolean bool2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : kVar, (i & 8) != 0 ? null : pVar2, (i & 16) == 0 ? bool2 : null);
    }
}
