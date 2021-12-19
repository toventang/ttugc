package com.p2082ss.android.ugc.gamora.editor.multiedit;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.multiedit.MultiEditState */
public final class MultiEditState extends UiState {
    private final C20526p clearBackgroundMusic;
    private final C89378p<Boolean, Boolean> showOrHide;

    /* renamed from: ui */
    private final AbstractC23517a f184315ui;

    static {
        Covode.recordClassIndex(96237);
    }

    public MultiEditState() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.multiedit.MultiEditState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiEditState copy$default(MultiEditState multiEditState, C89378p pVar, C20526p pVar2, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = multiEditState.showOrHide;
        }
        if ((i & 2) != 0) {
            pVar2 = multiEditState.clearBackgroundMusic;
        }
        if ((i & 4) != 0) {
            aVar = multiEditState.getUi();
        }
        return multiEditState.copy(pVar, pVar2, aVar);
    }

    public final C89378p<Boolean, Boolean> component1() {
        return this.showOrHide;
    }

    public final C20526p component2() {
        return this.clearBackgroundMusic;
    }

    public final AbstractC23517a component3() {
        return getUi();
    }

    public final MultiEditState copy(C89378p<Boolean, Boolean> pVar, C20526p pVar2, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new MultiEditState(pVar, pVar2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiEditState)) {
            return false;
        }
        MultiEditState multiEditState = (MultiEditState) obj;
        return C89219l.m154714a(this.showOrHide, multiEditState.showOrHide) && C89219l.m154714a(this.clearBackgroundMusic, multiEditState.clearBackgroundMusic) && C89219l.m154714a(getUi(), multiEditState.getUi());
    }

    public final int hashCode() {
        C89378p<Boolean, Boolean> pVar = this.showOrHide;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        C20526p pVar2 = this.clearBackgroundMusic;
        int hashCode2 = (hashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "MultiEditState(showOrHide=" + this.showOrHide + ", clearBackgroundMusic=" + this.clearBackgroundMusic + ", ui=" + getUi() + ")";
    }

    public final C20526p getClearBackgroundMusic() {
        return this.clearBackgroundMusic;
    }

    public final C89378p<Boolean, Boolean> getShowOrHide() {
        return this.showOrHide;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f184315ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiEditState(C89378p<Boolean, Boolean> pVar, C20526p pVar2, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.showOrHide = pVar;
        this.clearBackgroundMusic = pVar2;
        this.f184315ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiEditState(C89378p pVar, C20526p pVar2, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : pVar2, (i & 4) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
