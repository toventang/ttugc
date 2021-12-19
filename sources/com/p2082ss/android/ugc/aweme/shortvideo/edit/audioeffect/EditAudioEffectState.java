package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.EditAudioEffectState */
public final class EditAudioEffectState extends UiState {
    private final C20526p clearAudioEffect;

    /* renamed from: ui */
    private final AbstractC23517a f158574ui;

    static {
        Covode.recordClassIndex(83309);
    }

    public EditAudioEffectState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditAudioEffectState copy$default(EditAudioEffectState editAudioEffectState, C20526p pVar, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = editAudioEffectState.clearAudioEffect;
        }
        if ((i & 2) != 0) {
            aVar = editAudioEffectState.getUi();
        }
        return editAudioEffectState.copy(pVar, aVar);
    }

    public final C20526p component1() {
        return this.clearAudioEffect;
    }

    public final AbstractC23517a component2() {
        return getUi();
    }

    public final EditAudioEffectState copy(C20526p pVar, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new EditAudioEffectState(pVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAudioEffectState)) {
            return false;
        }
        EditAudioEffectState editAudioEffectState = (EditAudioEffectState) obj;
        return C89219l.m154714a(this.clearAudioEffect, editAudioEffectState.clearAudioEffect) && C89219l.m154714a(getUi(), editAudioEffectState.getUi());
    }

    public final int hashCode() {
        C20526p pVar = this.clearAudioEffect;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EditAudioEffectState(clearAudioEffect=" + this.clearAudioEffect + ", ui=" + getUi() + ")";
    }

    public final C20526p getClearAudioEffect() {
        return this.clearAudioEffect;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f158574ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditAudioEffectState(C20526p pVar, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.clearAudioEffect = pVar;
        this.f158574ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditAudioEffectState(C20526p pVar, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
