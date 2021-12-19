package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState */
public final class CutVideoState implements AbstractC20368af {
    private final C20526p nextEvent;
    private final C20526p quitEvent;

    static {
        Covode.recordClassIndex(82576);
    }

    public CutVideoState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CutVideoState copy$default(CutVideoState cutVideoState, C20526p pVar, C20526p pVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = cutVideoState.quitEvent;
        }
        if ((i & 2) != 0) {
            pVar2 = cutVideoState.nextEvent;
        }
        return cutVideoState.copy(pVar, pVar2);
    }

    public final C20526p component1() {
        return this.quitEvent;
    }

    public final C20526p component2() {
        return this.nextEvent;
    }

    public final CutVideoState copy(C20526p pVar, C20526p pVar2) {
        return new CutVideoState(pVar, pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoState)) {
            return false;
        }
        CutVideoState cutVideoState = (CutVideoState) obj;
        return C89219l.m154714a(this.quitEvent, cutVideoState.quitEvent) && C89219l.m154714a(this.nextEvent, cutVideoState.nextEvent);
    }

    public final int hashCode() {
        C20526p pVar = this.quitEvent;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        C20526p pVar2 = this.nextEvent;
        if (pVar2 != null) {
            i = pVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CutVideoState(quitEvent=" + this.quitEvent + ", nextEvent=" + this.nextEvent + ")";
    }

    public final C20526p getNextEvent() {
        return this.nextEvent;
    }

    public final C20526p getQuitEvent() {
        return this.quitEvent;
    }

    public CutVideoState(C20526p pVar, C20526p pVar2) {
        this.quitEvent = pVar;
        this.nextEvent = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoState(C20526p pVar, C20526p pVar2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : pVar2);
    }
}
