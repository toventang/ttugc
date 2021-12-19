package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20521k;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState */
public final class CutVideoMultiModeState implements AbstractC20368af {
    private final C20521k dismissAnimateEvent;
    private final C20521k showAnimateEvent;
    private final Integer value;

    static {
        Covode.recordClassIndex(82558);
    }

    public CutVideoMultiModeState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CutVideoMultiModeState copy$default(CutVideoMultiModeState cutVideoMultiModeState, Integer num, C20521k kVar, C20521k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = cutVideoMultiModeState.value;
        }
        if ((i & 2) != 0) {
            kVar = cutVideoMultiModeState.showAnimateEvent;
        }
        if ((i & 4) != 0) {
            kVar2 = cutVideoMultiModeState.dismissAnimateEvent;
        }
        return cutVideoMultiModeState.copy(num, kVar, kVar2);
    }

    public final Integer component1() {
        return this.value;
    }

    public final C20521k component2() {
        return this.showAnimateEvent;
    }

    public final C20521k component3() {
        return this.dismissAnimateEvent;
    }

    public final CutVideoMultiModeState copy(Integer num, C20521k kVar, C20521k kVar2) {
        return new CutVideoMultiModeState(num, kVar, kVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoMultiModeState)) {
            return false;
        }
        CutVideoMultiModeState cutVideoMultiModeState = (CutVideoMultiModeState) obj;
        return C89219l.m154714a(this.value, cutVideoMultiModeState.value) && C89219l.m154714a(this.showAnimateEvent, cutVideoMultiModeState.showAnimateEvent) && C89219l.m154714a(this.dismissAnimateEvent, cutVideoMultiModeState.dismissAnimateEvent);
    }

    public final int hashCode() {
        Integer num = this.value;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        C20521k kVar = this.showAnimateEvent;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C20521k kVar2 = this.dismissAnimateEvent;
        if (kVar2 != null) {
            i = kVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CutVideoMultiModeState(value=" + this.value + ", showAnimateEvent=" + this.showAnimateEvent + ", dismissAnimateEvent=" + this.dismissAnimateEvent + ")";
    }

    public final C20521k getDismissAnimateEvent() {
        return this.dismissAnimateEvent;
    }

    public final C20521k getShowAnimateEvent() {
        return this.showAnimateEvent;
    }

    public final Integer getValue() {
        return this.value;
    }

    public CutVideoMultiModeState(Integer num, C20521k kVar, C20521k kVar2) {
        this.value = num;
        this.showAnimateEvent = kVar;
        this.dismissAnimateEvent = kVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoMultiModeState(Integer num, C20521k kVar, C20521k kVar2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : kVar, (i & 4) != 0 ? null : kVar2);
    }
}
