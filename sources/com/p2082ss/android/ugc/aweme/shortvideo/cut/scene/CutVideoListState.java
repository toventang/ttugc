package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListState */
public final class CutVideoListState implements AbstractC20368af {
    private final C20521k animateRecyclerViewEvent;
    private final Boolean cancelEnable;
    private final C20526p deleteSegEvent;
    private final C20521k dismissSegAnimateEvent;
    private final C20521k dismissSingleAnimateEvent;
    private final Boolean saveEnable;
    private final C20521k showSegAnimateEvent;
    private final C20521k showSingleAnimateEvent;
    private final Boolean singleVideoEditVisible;
    private final C20521k updateSpeedCheckEvent;

    static {
        Covode.recordClassIndex(82541);
    }

    public CutVideoListState() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ CutVideoListState copy$default(CutVideoListState cutVideoListState, C20526p pVar, C20521k kVar, Boolean bool, Boolean bool2, C20521k kVar2, C20521k kVar3, C20521k kVar4, C20521k kVar5, Boolean bool3, C20521k kVar6, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = cutVideoListState.deleteSegEvent;
        }
        if ((i & 2) != 0) {
            kVar = cutVideoListState.updateSpeedCheckEvent;
        }
        if ((i & 4) != 0) {
            bool = cutVideoListState.saveEnable;
        }
        if ((i & 8) != 0) {
            bool2 = cutVideoListState.cancelEnable;
        }
        if ((i & 16) != 0) {
            kVar2 = cutVideoListState.showSegAnimateEvent;
        }
        if ((i & 32) != 0) {
            kVar3 = cutVideoListState.dismissSegAnimateEvent;
        }
        if ((i & 64) != 0) {
            kVar4 = cutVideoListState.showSingleAnimateEvent;
        }
        if ((i & 128) != 0) {
            kVar5 = cutVideoListState.dismissSingleAnimateEvent;
        }
        if ((i & 256) != 0) {
            bool3 = cutVideoListState.singleVideoEditVisible;
        }
        if ((i & 512) != 0) {
            kVar6 = cutVideoListState.animateRecyclerViewEvent;
        }
        return cutVideoListState.copy(pVar, kVar, bool, bool2, kVar2, kVar3, kVar4, kVar5, bool3, kVar6);
    }

    public final C20526p component1() {
        return this.deleteSegEvent;
    }

    public final C20521k component10() {
        return this.animateRecyclerViewEvent;
    }

    public final C20521k component2() {
        return this.updateSpeedCheckEvent;
    }

    public final Boolean component3() {
        return this.saveEnable;
    }

    public final Boolean component4() {
        return this.cancelEnable;
    }

    public final C20521k component5() {
        return this.showSegAnimateEvent;
    }

    public final C20521k component6() {
        return this.dismissSegAnimateEvent;
    }

    public final C20521k component7() {
        return this.showSingleAnimateEvent;
    }

    public final C20521k component8() {
        return this.dismissSingleAnimateEvent;
    }

    public final Boolean component9() {
        return this.singleVideoEditVisible;
    }

    public final CutVideoListState copy(C20526p pVar, C20521k kVar, Boolean bool, Boolean bool2, C20521k kVar2, C20521k kVar3, C20521k kVar4, C20521k kVar5, Boolean bool3, C20521k kVar6) {
        return new CutVideoListState(pVar, kVar, bool, bool2, kVar2, kVar3, kVar4, kVar5, bool3, kVar6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoListState)) {
            return false;
        }
        CutVideoListState cutVideoListState = (CutVideoListState) obj;
        return C89219l.m154714a(this.deleteSegEvent, cutVideoListState.deleteSegEvent) && C89219l.m154714a(this.updateSpeedCheckEvent, cutVideoListState.updateSpeedCheckEvent) && C89219l.m154714a(this.saveEnable, cutVideoListState.saveEnable) && C89219l.m154714a(this.cancelEnable, cutVideoListState.cancelEnable) && C89219l.m154714a(this.showSegAnimateEvent, cutVideoListState.showSegAnimateEvent) && C89219l.m154714a(this.dismissSegAnimateEvent, cutVideoListState.dismissSegAnimateEvent) && C89219l.m154714a(this.showSingleAnimateEvent, cutVideoListState.showSingleAnimateEvent) && C89219l.m154714a(this.dismissSingleAnimateEvent, cutVideoListState.dismissSingleAnimateEvent) && C89219l.m154714a(this.singleVideoEditVisible, cutVideoListState.singleVideoEditVisible) && C89219l.m154714a(this.animateRecyclerViewEvent, cutVideoListState.animateRecyclerViewEvent);
    }

    public final int hashCode() {
        C20526p pVar = this.deleteSegEvent;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        C20521k kVar = this.updateSpeedCheckEvent;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        Boolean bool = this.saveEnable;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.cancelEnable;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        C20521k kVar2 = this.showSegAnimateEvent;
        int hashCode5 = (hashCode4 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        C20521k kVar3 = this.dismissSegAnimateEvent;
        int hashCode6 = (hashCode5 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        C20521k kVar4 = this.showSingleAnimateEvent;
        int hashCode7 = (hashCode6 + (kVar4 != null ? kVar4.hashCode() : 0)) * 31;
        C20521k kVar5 = this.dismissSingleAnimateEvent;
        int hashCode8 = (hashCode7 + (kVar5 != null ? kVar5.hashCode() : 0)) * 31;
        Boolean bool3 = this.singleVideoEditVisible;
        int hashCode9 = (hashCode8 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        C20521k kVar6 = this.animateRecyclerViewEvent;
        if (kVar6 != null) {
            i = kVar6.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "CutVideoListState(deleteSegEvent=" + this.deleteSegEvent + ", updateSpeedCheckEvent=" + this.updateSpeedCheckEvent + ", saveEnable=" + this.saveEnable + ", cancelEnable=" + this.cancelEnable + ", showSegAnimateEvent=" + this.showSegAnimateEvent + ", dismissSegAnimateEvent=" + this.dismissSegAnimateEvent + ", showSingleAnimateEvent=" + this.showSingleAnimateEvent + ", dismissSingleAnimateEvent=" + this.dismissSingleAnimateEvent + ", singleVideoEditVisible=" + this.singleVideoEditVisible + ", animateRecyclerViewEvent=" + this.animateRecyclerViewEvent + ")";
    }

    public final C20521k getAnimateRecyclerViewEvent() {
        return this.animateRecyclerViewEvent;
    }

    public final Boolean getCancelEnable() {
        return this.cancelEnable;
    }

    public final C20526p getDeleteSegEvent() {
        return this.deleteSegEvent;
    }

    public final C20521k getDismissSegAnimateEvent() {
        return this.dismissSegAnimateEvent;
    }

    public final C20521k getDismissSingleAnimateEvent() {
        return this.dismissSingleAnimateEvent;
    }

    public final Boolean getSaveEnable() {
        return this.saveEnable;
    }

    public final C20521k getShowSegAnimateEvent() {
        return this.showSegAnimateEvent;
    }

    public final C20521k getShowSingleAnimateEvent() {
        return this.showSingleAnimateEvent;
    }

    public final Boolean getSingleVideoEditVisible() {
        return this.singleVideoEditVisible;
    }

    public final C20521k getUpdateSpeedCheckEvent() {
        return this.updateSpeedCheckEvent;
    }

    public CutVideoListState(C20526p pVar, C20521k kVar, Boolean bool, Boolean bool2, C20521k kVar2, C20521k kVar3, C20521k kVar4, C20521k kVar5, Boolean bool3, C20521k kVar6) {
        this.deleteSegEvent = pVar;
        this.updateSpeedCheckEvent = kVar;
        this.saveEnable = bool;
        this.cancelEnable = bool2;
        this.showSegAnimateEvent = kVar2;
        this.dismissSegAnimateEvent = kVar3;
        this.showSingleAnimateEvent = kVar4;
        this.dismissSingleAnimateEvent = kVar5;
        this.singleVideoEditVisible = bool3;
        this.animateRecyclerViewEvent = kVar6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoListState(C20526p pVar, C20521k kVar, Boolean bool, Boolean bool2, C20521k kVar2, C20521k kVar3, C20521k kVar4, C20521k kVar5, Boolean bool3, C20521k kVar6, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : kVar, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : kVar2, (i & 32) != 0 ? null : kVar3, (i & 64) != 0 ? null : kVar4, (i & 128) != 0 ? null : kVar5, (i & 256) != 0 ? null : bool3, (i & 512) == 0 ? kVar6 : null);
    }
}
