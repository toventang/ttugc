package com.p2082ss.android.ugc.gamora.editor.sticker.info;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20525o;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerState */
public final class EditInfoStickerState extends UiState {
    private final C20391d<StickerItemModel> clickStickerItemEvent;
    private final C20524n<Float, Long> editViewAnimEvent;
    private final C20525o<Float, Float, Float> editViewLayoutEvent;
    private final C20526p hideHelpBoxEvent;
    private final C20526p refreshVideoSource;
    private final C20524n<Integer, Integer> resetVideoLengthEvent;

    /* renamed from: ui */
    private final AbstractC23517a f185142ui;

    static {
        Covode.recordClassIndex(96685);
    }

    public EditInfoStickerState() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditInfoStickerState copy$default(EditInfoStickerState editInfoStickerState, AbstractC23517a aVar, C20526p pVar, C20524n nVar, C20391d dVar, C20524n nVar2, C20525o oVar, C20526p pVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = editInfoStickerState.getUi();
        }
        if ((i & 2) != 0) {
            pVar = editInfoStickerState.hideHelpBoxEvent;
        }
        if ((i & 4) != 0) {
            nVar = editInfoStickerState.resetVideoLengthEvent;
        }
        if ((i & 8) != 0) {
            dVar = editInfoStickerState.clickStickerItemEvent;
        }
        if ((i & 16) != 0) {
            nVar2 = editInfoStickerState.editViewAnimEvent;
        }
        if ((i & 32) != 0) {
            oVar = editInfoStickerState.editViewLayoutEvent;
        }
        if ((i & 64) != 0) {
            pVar2 = editInfoStickerState.refreshVideoSource;
        }
        return editInfoStickerState.copy(aVar, pVar, nVar, dVar, nVar2, oVar, pVar2);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final C20526p component2() {
        return this.hideHelpBoxEvent;
    }

    public final C20524n<Integer, Integer> component3() {
        return this.resetVideoLengthEvent;
    }

    public final C20391d<StickerItemModel> component4() {
        return this.clickStickerItemEvent;
    }

    public final C20524n<Float, Long> component5() {
        return this.editViewAnimEvent;
    }

    public final C20525o<Float, Float, Float> component6() {
        return this.editViewLayoutEvent;
    }

    public final C20526p component7() {
        return this.refreshVideoSource;
    }

    public final EditInfoStickerState copy(AbstractC23517a aVar, C20526p pVar, C20524n<Integer, Integer> nVar, C20391d<? extends StickerItemModel> dVar, C20524n<Float, Long> nVar2, C20525o<Float, Float, Float> oVar, C20526p pVar2) {
        C89219l.m154721d(aVar, "");
        return new EditInfoStickerState(aVar, pVar, nVar, dVar, nVar2, oVar, pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditInfoStickerState)) {
            return false;
        }
        EditInfoStickerState editInfoStickerState = (EditInfoStickerState) obj;
        return C89219l.m154714a(getUi(), editInfoStickerState.getUi()) && C89219l.m154714a(this.hideHelpBoxEvent, editInfoStickerState.hideHelpBoxEvent) && C89219l.m154714a(this.resetVideoLengthEvent, editInfoStickerState.resetVideoLengthEvent) && C89219l.m154714a(this.clickStickerItemEvent, editInfoStickerState.clickStickerItemEvent) && C89219l.m154714a(this.editViewAnimEvent, editInfoStickerState.editViewAnimEvent) && C89219l.m154714a(this.editViewLayoutEvent, editInfoStickerState.editViewLayoutEvent) && C89219l.m154714a(this.refreshVideoSource, editInfoStickerState.refreshVideoSource);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        C20526p pVar = this.hideHelpBoxEvent;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C20524n<Integer, Integer> nVar = this.resetVideoLengthEvent;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C20391d<StickerItemModel> dVar = this.clickStickerItemEvent;
        int hashCode4 = (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C20524n<Float, Long> nVar2 = this.editViewAnimEvent;
        int hashCode5 = (hashCode4 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        C20525o<Float, Float, Float> oVar = this.editViewLayoutEvent;
        int hashCode6 = (hashCode5 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        C20526p pVar2 = this.refreshVideoSource;
        if (pVar2 != null) {
            i = pVar2.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "EditInfoStickerState(ui=" + getUi() + ", hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", resetVideoLengthEvent=" + this.resetVideoLengthEvent + ", clickStickerItemEvent=" + this.clickStickerItemEvent + ", editViewAnimEvent=" + this.editViewAnimEvent + ", editViewLayoutEvent=" + this.editViewLayoutEvent + ", refreshVideoSource=" + this.refreshVideoSource + ")";
    }

    public final C20391d<StickerItemModel> getClickStickerItemEvent() {
        return this.clickStickerItemEvent;
    }

    public final C20524n<Float, Long> getEditViewAnimEvent() {
        return this.editViewAnimEvent;
    }

    public final C20525o<Float, Float, Float> getEditViewLayoutEvent() {
        return this.editViewLayoutEvent;
    }

    public final C20526p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final C20526p getRefreshVideoSource() {
        return this.refreshVideoSource;
    }

    public final C20524n<Integer, Integer> getResetVideoLengthEvent() {
        return this.resetVideoLengthEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f185142ui;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditInfoStickerState(AbstractC23517a aVar, C20526p pVar, C20524n<Integer, Integer> nVar, C20391d<? extends StickerItemModel> dVar, C20524n<Float, Long> nVar2, C20525o<Float, Float, Float> oVar, C20526p pVar2) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f185142ui = aVar;
        this.hideHelpBoxEvent = pVar;
        this.resetVideoLengthEvent = nVar;
        this.clickStickerItemEvent = dVar;
        this.editViewAnimEvent = nVar2;
        this.editViewLayoutEvent = oVar;
        this.refreshVideoSource = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditInfoStickerState(AbstractC23517a aVar, C20526p pVar, C20524n nVar, C20391d dVar, C20524n nVar2, C20525o oVar, C20526p pVar2, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : pVar, (i & 4) != 0 ? null : nVar, (i & 8) != 0 ? null : dVar, (i & 16) != 0 ? null : nVar2, (i & 32) != 0 ? null : oVar, (i & 64) == 0 ? pVar2 : null);
    }
}
