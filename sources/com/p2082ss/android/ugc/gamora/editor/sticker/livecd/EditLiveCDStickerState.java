package com.p2082ss.android.ugc.gamora.editor.sticker.livecd;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerState */
public final class EditLiveCDStickerState extends UiState {
    private final Boolean enableEdit;
    private final C20526p hideHelpBoxEvent;
    private final C20526p reloadInteractStickerStruct;

    /* renamed from: ui */
    private final AbstractC23517a f185215ui;
    private final float viewAlpha;

    static {
        Covode.recordClassIndex(96729);
    }

    public EditLiveCDStickerState() {
        this(null, null, 0.0f, null, null, 31, null);
    }

    public static /* synthetic */ EditLiveCDStickerState copy$default(EditLiveCDStickerState editLiveCDStickerState, C20526p pVar, Boolean bool, float f, C20526p pVar2, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = editLiveCDStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            bool = editLiveCDStickerState.enableEdit;
        }
        if ((i & 4) != 0) {
            f = editLiveCDStickerState.viewAlpha;
        }
        if ((i & 8) != 0) {
            pVar2 = editLiveCDStickerState.reloadInteractStickerStruct;
        }
        if ((i & 16) != 0) {
            aVar = editLiveCDStickerState.getUi();
        }
        return editLiveCDStickerState.copy(pVar, bool, f, pVar2, aVar);
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

    public final C20526p component4() {
        return this.reloadInteractStickerStruct;
    }

    public final AbstractC23517a component5() {
        return getUi();
    }

    public final EditLiveCDStickerState copy(C20526p pVar, Boolean bool, float f, C20526p pVar2, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new EditLiveCDStickerState(pVar, bool, f, pVar2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditLiveCDStickerState)) {
            return false;
        }
        EditLiveCDStickerState editLiveCDStickerState = (EditLiveCDStickerState) obj;
        return C89219l.m154714a(this.hideHelpBoxEvent, editLiveCDStickerState.hideHelpBoxEvent) && C89219l.m154714a(this.enableEdit, editLiveCDStickerState.enableEdit) && Float.compare(this.viewAlpha, editLiveCDStickerState.viewAlpha) == 0 && C89219l.m154714a(this.reloadInteractStickerStruct, editLiveCDStickerState.reloadInteractStickerStruct) && C89219l.m154714a(getUi(), editLiveCDStickerState.getUi());
    }

    public final int hashCode() {
        C20526p pVar = this.hideHelpBoxEvent;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        Boolean bool = this.enableEdit;
        int hashCode2 = (((hashCode + (bool != null ? bool.hashCode() : 0)) * 31) + m143123xe96fbef6(this.viewAlpha)) * 31;
        C20526p pVar2 = this.reloadInteractStickerStruct;
        int hashCode3 = (hashCode2 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "EditLiveCDStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", enableEdit=" + this.enableEdit + ", viewAlpha=" + this.viewAlpha + ", reloadInteractStickerStruct=" + this.reloadInteractStickerStruct + ", ui=" + getUi() + ")";
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final C20526p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final C20526p getReloadInteractStickerStruct() {
        return this.reloadInteractStickerStruct;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f185215ui;
    }

    public final float getViewAlpha() {
        return this.viewAlpha;
    }

    /* renamed from: com_ss_android_ugc_gamora_editor_sticker_livecd_EditLiveCDStickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m143123xe96fbef6(float f) {
        return Float.floatToIntBits(f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditLiveCDStickerState(C20526p pVar, Boolean bool, float f, C20526p pVar2, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.hideHelpBoxEvent = pVar;
        this.enableEdit = bool;
        this.viewAlpha = f;
        this.reloadInteractStickerStruct = pVar2;
        this.f185215ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditLiveCDStickerState(C20526p pVar, Boolean bool, float f, C20526p pVar2, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? 1.0f : f, (i & 8) == 0 ? pVar2 : null, (i & 16) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
