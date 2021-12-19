package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectState */
public final class FTCEditEffectState extends UiState {
    private final Integer setVideoLength;

    /* renamed from: ui */
    private final AbstractC23517a f120013ui;

    static {
        Covode.recordClassIndex(61474);
    }

    public FTCEditEffectState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ FTCEditEffectState copy$default(FTCEditEffectState fTCEditEffectState, AbstractC23517a aVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = fTCEditEffectState.getUi();
        }
        if ((i & 2) != 0) {
            num = fTCEditEffectState.setVideoLength;
        }
        return fTCEditEffectState.copy(aVar, num);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final Integer component2() {
        return this.setVideoLength;
    }

    public final FTCEditEffectState copy(AbstractC23517a aVar, Integer num) {
        C89219l.m154721d(aVar, "");
        return new FTCEditEffectState(aVar, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditEffectState)) {
            return false;
        }
        FTCEditEffectState fTCEditEffectState = (FTCEditEffectState) obj;
        return C89219l.m154714a(getUi(), fTCEditEffectState.getUi()) && C89219l.m154714a(this.setVideoLength, fTCEditEffectState.setVideoLength);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        Integer num = this.setVideoLength;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FTCEditEffectState(ui=" + getUi() + ", setVideoLength=" + this.setVideoLength + ")";
    }

    public final Integer getSetVideoLength() {
        return this.setVideoLength;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f120013ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditEffectState(AbstractC23517a aVar, Integer num) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f120013ui = aVar;
        this.setVideoLength = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditEffectState(AbstractC23517a aVar, Integer num, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : num);
    }
}
