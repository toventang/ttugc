package com.p2082ss.android.ugc.aweme.ftc.components.sticker.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20525o;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState */
public final class FTCEditStickerState extends UiState {
    private final C20524n<Float, Long> pollTextAnimEvent;
    private final C20525o<Float, Float, Float> pollTextLayoutEvent;
    private final Integer pollingTopMargin;

    /* renamed from: ui */
    private final AbstractC23517a f120182ui;

    static {
        Covode.recordClassIndex(61545);
    }

    public FTCEditStickerState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditStickerState copy$default(FTCEditStickerState fTCEditStickerState, AbstractC23517a aVar, Integer num, C20524n nVar, C20525o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = fTCEditStickerState.getUi();
        }
        if ((i & 2) != 0) {
            num = fTCEditStickerState.pollingTopMargin;
        }
        if ((i & 4) != 0) {
            nVar = fTCEditStickerState.pollTextAnimEvent;
        }
        if ((i & 8) != 0) {
            oVar = fTCEditStickerState.pollTextLayoutEvent;
        }
        return fTCEditStickerState.copy(aVar, num, nVar, oVar);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final Integer component2() {
        return this.pollingTopMargin;
    }

    public final C20524n<Float, Long> component3() {
        return this.pollTextAnimEvent;
    }

    public final C20525o<Float, Float, Float> component4() {
        return this.pollTextLayoutEvent;
    }

    public final FTCEditStickerState copy(AbstractC23517a aVar, Integer num, C20524n<Float, Long> nVar, C20525o<Float, Float, Float> oVar) {
        C89219l.m154721d(aVar, "");
        return new FTCEditStickerState(aVar, num, nVar, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditStickerState)) {
            return false;
        }
        FTCEditStickerState fTCEditStickerState = (FTCEditStickerState) obj;
        return C89219l.m154714a(getUi(), fTCEditStickerState.getUi()) && C89219l.m154714a(this.pollingTopMargin, fTCEditStickerState.pollingTopMargin) && C89219l.m154714a(this.pollTextAnimEvent, fTCEditStickerState.pollTextAnimEvent) && C89219l.m154714a(this.pollTextLayoutEvent, fTCEditStickerState.pollTextLayoutEvent);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        Integer num = this.pollingTopMargin;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        C20524n<Float, Long> nVar = this.pollTextAnimEvent;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C20525o<Float, Float, Float> oVar = this.pollTextLayoutEvent;
        if (oVar != null) {
            i = oVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "FTCEditStickerState(ui=" + getUi() + ", pollingTopMargin=" + this.pollingTopMargin + ", pollTextAnimEvent=" + this.pollTextAnimEvent + ", pollTextLayoutEvent=" + this.pollTextLayoutEvent + ")";
    }

    public final C20524n<Float, Long> getPollTextAnimEvent() {
        return this.pollTextAnimEvent;
    }

    public final C20525o<Float, Float, Float> getPollTextLayoutEvent() {
        return this.pollTextLayoutEvent;
    }

    public final Integer getPollingTopMargin() {
        return this.pollingTopMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f120182ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditStickerState(AbstractC23517a aVar, Integer num, C20524n<Float, Long> nVar, C20525o<Float, Float, Float> oVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f120182ui = aVar;
        this.pollingTopMargin = num;
        this.pollTextAnimEvent = nVar;
        this.pollTextLayoutEvent = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditStickerState(AbstractC23517a aVar, Integer num, C20524n nVar, C20525o oVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : nVar, (i & 8) != 0 ? null : oVar);
    }
}
