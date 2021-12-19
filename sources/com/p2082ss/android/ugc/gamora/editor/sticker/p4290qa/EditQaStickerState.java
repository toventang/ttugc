package com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.EditQaStickerState */
public final class EditQaStickerState extends UiState {
    private final Boolean enableEdit;
    private final C20526p hideHelpBoxEvent;

    /* renamed from: ui */
    private final AbstractC23517a f185413ui;
    private final float viewAlpha;

    static {
        Covode.recordClassIndex(96846);
    }

    public EditQaStickerState() {
        this(null, null, null, 0.0f, 15, null);
    }

    public static /* synthetic */ EditQaStickerState copy$default(EditQaStickerState editQaStickerState, AbstractC23517a aVar, C20526p pVar, Boolean bool, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = editQaStickerState.getUi();
        }
        if ((i & 2) != 0) {
            pVar = editQaStickerState.hideHelpBoxEvent;
        }
        if ((i & 4) != 0) {
            bool = editQaStickerState.enableEdit;
        }
        if ((i & 8) != 0) {
            f = editQaStickerState.viewAlpha;
        }
        return editQaStickerState.copy(aVar, pVar, bool, f);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final C20526p component2() {
        return this.hideHelpBoxEvent;
    }

    public final Boolean component3() {
        return this.enableEdit;
    }

    public final float component4() {
        return this.viewAlpha;
    }

    public final EditQaStickerState copy(AbstractC23517a aVar, C20526p pVar, Boolean bool, float f) {
        C89219l.m154721d(aVar, "");
        return new EditQaStickerState(aVar, pVar, bool, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditQaStickerState)) {
            return false;
        }
        EditQaStickerState editQaStickerState = (EditQaStickerState) obj;
        return C89219l.m154714a(getUi(), editQaStickerState.getUi()) && C89219l.m154714a(this.hideHelpBoxEvent, editQaStickerState.hideHelpBoxEvent) && C89219l.m154714a(this.enableEdit, editQaStickerState.enableEdit) && Float.compare(this.viewAlpha, editQaStickerState.viewAlpha) == 0;
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        C20526p pVar = this.hideHelpBoxEvent;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        Boolean bool = this.enableEdit;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode2 + i) * 31) + m143290xe9df9096(this.viewAlpha);
    }

    public final String toString() {
        return "EditQaStickerState(ui=" + getUi() + ", hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", enableEdit=" + this.enableEdit + ", viewAlpha=" + this.viewAlpha + ")";
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final C20526p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f185413ui;
    }

    public final float getViewAlpha() {
        return this.viewAlpha;
    }

    /* renamed from: com_ss_android_ugc_gamora_editor_sticker_qa_EditQaStickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m143290xe9df9096(float f) {
        return Float.floatToIntBits(f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditQaStickerState(AbstractC23517a aVar, C20526p pVar, Boolean bool, float f) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f185413ui = aVar;
        this.hideHelpBoxEvent = pVar;
        this.enableEdit = bool;
        this.viewAlpha = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditQaStickerState(AbstractC23517a aVar, C20526p pVar, Boolean bool, float f, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : pVar, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? 1.0f : f);
    }
}
