package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerState */
public final class FTCEditInfoStickerState extends UiState {
    private final C20391d<StickerItemModel> clickStickerItemEvent;
    private final C20524n<Float, Long> editViewAnimEvent;
    private final C20525o<Float, Float, Float> editViewLayoutEvent;
    private final C20526p hideHelpBoxEvent;
    private final C20524n<Integer, Integer> resetVideoLengthEvent;

    /* renamed from: ui */
    private final AbstractC23517a f120284ui;

    static {
        Covode.recordClassIndex(61606);
    }

    public FTCEditInfoStickerState() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditInfoStickerState copy$default(FTCEditInfoStickerState fTCEditInfoStickerState, AbstractC23517a aVar, C20526p pVar, C20524n nVar, C20391d dVar, C20524n nVar2, C20525o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = fTCEditInfoStickerState.getUi();
        }
        if ((i & 2) != 0) {
            pVar = fTCEditInfoStickerState.hideHelpBoxEvent;
        }
        if ((i & 4) != 0) {
            nVar = fTCEditInfoStickerState.resetVideoLengthEvent;
        }
        if ((i & 8) != 0) {
            dVar = fTCEditInfoStickerState.clickStickerItemEvent;
        }
        if ((i & 16) != 0) {
            nVar2 = fTCEditInfoStickerState.editViewAnimEvent;
        }
        if ((i & 32) != 0) {
            oVar = fTCEditInfoStickerState.editViewLayoutEvent;
        }
        return fTCEditInfoStickerState.copy(aVar, pVar, nVar, dVar, nVar2, oVar);
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

    public final FTCEditInfoStickerState copy(AbstractC23517a aVar, C20526p pVar, C20524n<Integer, Integer> nVar, C20391d<? extends StickerItemModel> dVar, C20524n<Float, Long> nVar2, C20525o<Float, Float, Float> oVar) {
        C89219l.m154721d(aVar, "");
        return new FTCEditInfoStickerState(aVar, pVar, nVar, dVar, nVar2, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditInfoStickerState)) {
            return false;
        }
        FTCEditInfoStickerState fTCEditInfoStickerState = (FTCEditInfoStickerState) obj;
        return C89219l.m154714a(getUi(), fTCEditInfoStickerState.getUi()) && C89219l.m154714a(this.hideHelpBoxEvent, fTCEditInfoStickerState.hideHelpBoxEvent) && C89219l.m154714a(this.resetVideoLengthEvent, fTCEditInfoStickerState.resetVideoLengthEvent) && C89219l.m154714a(this.clickStickerItemEvent, fTCEditInfoStickerState.clickStickerItemEvent) && C89219l.m154714a(this.editViewAnimEvent, fTCEditInfoStickerState.editViewAnimEvent) && C89219l.m154714a(this.editViewLayoutEvent, fTCEditInfoStickerState.editViewLayoutEvent);
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
        if (oVar != null) {
            i = oVar.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "FTCEditInfoStickerState(ui=" + getUi() + ", hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", resetVideoLengthEvent=" + this.resetVideoLengthEvent + ", clickStickerItemEvent=" + this.clickStickerItemEvent + ", editViewAnimEvent=" + this.editViewAnimEvent + ", editViewLayoutEvent=" + this.editViewLayoutEvent + ")";
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

    public final C20524n<Integer, Integer> getResetVideoLengthEvent() {
        return this.resetVideoLengthEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f120284ui;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditInfoStickerState(AbstractC23517a aVar, C20526p pVar, C20524n<Integer, Integer> nVar, C20391d<? extends StickerItemModel> dVar, C20524n<Float, Long> nVar2, C20525o<Float, Float, Float> oVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f120284ui = aVar;
        this.hideHelpBoxEvent = pVar;
        this.resetVideoLengthEvent = nVar;
        this.clickStickerItemEvent = dVar;
        this.editViewAnimEvent = nVar2;
        this.editViewLayoutEvent = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditInfoStickerState(AbstractC23517a aVar, C20526p pVar, C20524n nVar, C20391d dVar, C20524n nVar2, C20525o oVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : pVar, (i & 4) != 0 ? null : nVar, (i & 8) != 0 ? null : dVar, (i & 16) != 0 ? null : nVar2, (i & 32) == 0 ? oVar : null);
    }
}
