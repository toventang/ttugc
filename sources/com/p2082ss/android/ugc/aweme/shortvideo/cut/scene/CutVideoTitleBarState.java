package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20521k;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarState */
public final class CutVideoTitleBarState implements AbstractC20368af {
    private final C20521k animateTitleBarEvent;
    private final Boolean backEnable;
    private final Boolean backVisible;
    private final Boolean nextEnable;
    private final Boolean nextVisible;

    static {
        Covode.recordClassIndex(82584);
    }

    public CutVideoTitleBarState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CutVideoTitleBarState copy$default(CutVideoTitleBarState cutVideoTitleBarState, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C20521k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cutVideoTitleBarState.backVisible;
        }
        if ((i & 2) != 0) {
            bool2 = cutVideoTitleBarState.nextVisible;
        }
        if ((i & 4) != 0) {
            bool3 = cutVideoTitleBarState.backEnable;
        }
        if ((i & 8) != 0) {
            bool4 = cutVideoTitleBarState.nextEnable;
        }
        if ((i & 16) != 0) {
            kVar = cutVideoTitleBarState.animateTitleBarEvent;
        }
        return cutVideoTitleBarState.copy(bool, bool2, bool3, bool4, kVar);
    }

    public final Boolean component1() {
        return this.backVisible;
    }

    public final Boolean component2() {
        return this.nextVisible;
    }

    public final Boolean component3() {
        return this.backEnable;
    }

    public final Boolean component4() {
        return this.nextEnable;
    }

    public final C20521k component5() {
        return this.animateTitleBarEvent;
    }

    public final CutVideoTitleBarState copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C20521k kVar) {
        return new CutVideoTitleBarState(bool, bool2, bool3, bool4, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoTitleBarState)) {
            return false;
        }
        CutVideoTitleBarState cutVideoTitleBarState = (CutVideoTitleBarState) obj;
        return C89219l.m154714a(this.backVisible, cutVideoTitleBarState.backVisible) && C89219l.m154714a(this.nextVisible, cutVideoTitleBarState.nextVisible) && C89219l.m154714a(this.backEnable, cutVideoTitleBarState.backEnable) && C89219l.m154714a(this.nextEnable, cutVideoTitleBarState.nextEnable) && C89219l.m154714a(this.animateTitleBarEvent, cutVideoTitleBarState.animateTitleBarEvent);
    }

    public final int hashCode() {
        Boolean bool = this.backVisible;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.nextVisible;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.backEnable;
        int hashCode3 = (hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.nextEnable;
        int hashCode4 = (hashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        C20521k kVar = this.animateTitleBarEvent;
        if (kVar != null) {
            i = kVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CutVideoTitleBarState(backVisible=" + this.backVisible + ", nextVisible=" + this.nextVisible + ", backEnable=" + this.backEnable + ", nextEnable=" + this.nextEnable + ", animateTitleBarEvent=" + this.animateTitleBarEvent + ")";
    }

    public final C20521k getAnimateTitleBarEvent() {
        return this.animateTitleBarEvent;
    }

    public final Boolean getBackEnable() {
        return this.backEnable;
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final Boolean getNextEnable() {
        return this.nextEnable;
    }

    public final Boolean getNextVisible() {
        return this.nextVisible;
    }

    public CutVideoTitleBarState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C20521k kVar) {
        this.backVisible = bool;
        this.nextVisible = bool2;
        this.backEnable = bool3;
        this.nextEnable = bool4;
        this.animateTitleBarEvent = kVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoTitleBarState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C20521k kVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) == 0 ? kVar : null);
    }
}
