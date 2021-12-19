package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20391d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState */
public final class ChangeDuetLayoutState implements AbstractC20368af {
    private final C20391d<Effect> effect;
    private final C20391d<Integer> layoutDirection;

    static {
        Covode.recordClassIndex(83118);
    }

    public ChangeDuetLayoutState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeDuetLayoutState copy$default(ChangeDuetLayoutState changeDuetLayoutState, C20391d dVar, C20391d dVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = changeDuetLayoutState.effect;
        }
        if ((i & 2) != 0) {
            dVar2 = changeDuetLayoutState.layoutDirection;
        }
        return changeDuetLayoutState.copy(dVar, dVar2);
    }

    public final C20391d<Effect> component1() {
        return this.effect;
    }

    public final C20391d<Integer> component2() {
        return this.layoutDirection;
    }

    public final ChangeDuetLayoutState copy(C20391d<? extends Effect> dVar, C20391d<Integer> dVar2) {
        return new ChangeDuetLayoutState(dVar, dVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeDuetLayoutState)) {
            return false;
        }
        ChangeDuetLayoutState changeDuetLayoutState = (ChangeDuetLayoutState) obj;
        return C89219l.m154714a(this.effect, changeDuetLayoutState.effect) && C89219l.m154714a(this.layoutDirection, changeDuetLayoutState.layoutDirection);
    }

    public final int hashCode() {
        C20391d<Effect> dVar = this.effect;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        C20391d<Integer> dVar2 = this.layoutDirection;
        if (dVar2 != null) {
            i = dVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ChangeDuetLayoutState(effect=" + this.effect + ", layoutDirection=" + this.layoutDirection + ")";
    }

    public final C20391d<Effect> getEffect() {
        return this.effect;
    }

    public final C20391d<Integer> getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChangeDuetLayoutState(C20391d<? extends Effect> dVar, C20391d<Integer> dVar2) {
        this.effect = dVar;
        this.layoutDirection = dVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangeDuetLayoutState(C20391d dVar, C20391d dVar2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : dVar, (i & 2) != 0 ? null : dVar2);
    }
}
