package com.p2082ss.android.ugc.gamora.editor.sticker.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.EditDuetStickerState */
public final class EditDuetStickerState extends UiState {
    private final Boolean enableEdit;
    private final C20526p hideHelpBoxEvent;

    /* renamed from: ui */
    private final AbstractC23517a f185104ui;
    private final float viewAlpha;

    static {
        Covode.recordClassIndex(96662);
    }

    public EditDuetStickerState() {
        this(null, null, 0.0f, null, 15, null);
    }

    public static /* synthetic */ EditDuetStickerState copy$default(EditDuetStickerState editDuetStickerState, C20526p pVar, Boolean bool, float f, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = editDuetStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            bool = editDuetStickerState.enableEdit;
        }
        if ((i & 4) != 0) {
            f = editDuetStickerState.viewAlpha;
        }
        if ((i & 8) != 0) {
            aVar = editDuetStickerState.getUi();
        }
        return editDuetStickerState.copy(pVar, bool, f, aVar);
    }

    public final C20526p component1() {
        return this.hideHelpBoxEvent;
    }

    public final Boolean component2() {
        return this.enableEdit;
    }

    public final float component3() {
        return this.viewAlpha;
    }

    public final AbstractC23517a component4() {
        return getUi();
    }

    public final EditDuetStickerState copy(C20526p pVar, Boolean bool, float f, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new EditDuetStickerState(pVar, bool, f, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditDuetStickerState)) {
            return false;
        }
        EditDuetStickerState editDuetStickerState = (EditDuetStickerState) obj;
        return C89219l.m154714a(this.hideHelpBoxEvent, editDuetStickerState.hideHelpBoxEvent) && C89219l.m154714a(this.enableEdit, editDuetStickerState.enableEdit) && Float.compare(this.viewAlpha, editDuetStickerState.viewAlpha) == 0 && C89219l.m154714a(getUi(), editDuetStickerState.getUi());
    }

    public final int hashCode() {
        C20526p pVar = this.hideHelpBoxEvent;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        Boolean bool = this.enableEdit;
        int hashCode2 = (((hashCode + (bool != null ? bool.hashCode() : 0)) * 31) + m142999x287f13d6(this.viewAlpha)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EditDuetStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", enableEdit=" + this.enableEdit + ", viewAlpha=" + this.viewAlpha + ", ui=" + getUi() + ")";
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final C20526p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f185104ui;
    }

    public final float getViewAlpha() {
        return this.viewAlpha;
    }

    /* renamed from: com_ss_android_ugc_gamora_editor_sticker_duet_EditDuetStickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m142999x287f13d6(float f) {
        return Float.floatToIntBits(f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditDuetStickerState(C20526p pVar, Boolean bool, float f, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.hideHelpBoxEvent = pVar;
        this.enableEdit = bool;
        this.viewAlpha = f;
        this.f185104ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditDuetStickerState(C20526p pVar, Boolean bool, float f, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? 1.0f : f, (i & 8) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
