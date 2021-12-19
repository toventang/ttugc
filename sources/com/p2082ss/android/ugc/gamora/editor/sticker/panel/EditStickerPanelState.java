package com.p2082ss.android.ugc.gamora.editor.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelState */
public final class EditStickerPanelState extends UiState {
    private final String enterMethod;
    private final C20524n<Effect, String> launchChooseImageActivityEvent;
    private final C20524n<Effect, String> selectEffectEvent;
    private final C20521k stickerViewVisibleEvent;
    private final C20526p temperatureErrorEvent;

    /* renamed from: ui */
    private final AbstractC23517a f185261ui;

    static {
        Covode.recordClassIndex(96759);
    }

    public EditStickerPanelState() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditStickerPanelState copy$default(EditStickerPanelState editStickerPanelState, C20521k kVar, C20524n nVar, C20526p pVar, C20524n nVar2, String str, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = editStickerPanelState.stickerViewVisibleEvent;
        }
        if ((i & 2) != 0) {
            nVar = editStickerPanelState.selectEffectEvent;
        }
        if ((i & 4) != 0) {
            pVar = editStickerPanelState.temperatureErrorEvent;
        }
        if ((i & 8) != 0) {
            nVar2 = editStickerPanelState.launchChooseImageActivityEvent;
        }
        if ((i & 16) != 0) {
            str = editStickerPanelState.enterMethod;
        }
        if ((i & 32) != 0) {
            aVar = editStickerPanelState.getUi();
        }
        return editStickerPanelState.copy(kVar, nVar, pVar, nVar2, str, aVar);
    }

    public final C20521k component1() {
        return this.stickerViewVisibleEvent;
    }

    public final C20524n<Effect, String> component2() {
        return this.selectEffectEvent;
    }

    public final C20526p component3() {
        return this.temperatureErrorEvent;
    }

    public final C20524n<Effect, String> component4() {
        return this.launchChooseImageActivityEvent;
    }

    public final String component5() {
        return this.enterMethod;
    }

    public final AbstractC23517a component6() {
        return getUi();
    }

    public final EditStickerPanelState copy(C20521k kVar, C20524n<Effect, String> nVar, C20526p pVar, C20524n<Effect, String> nVar2, String str, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new EditStickerPanelState(kVar, nVar, pVar, nVar2, str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditStickerPanelState)) {
            return false;
        }
        EditStickerPanelState editStickerPanelState = (EditStickerPanelState) obj;
        return C89219l.m154714a(this.stickerViewVisibleEvent, editStickerPanelState.stickerViewVisibleEvent) && C89219l.m154714a(this.selectEffectEvent, editStickerPanelState.selectEffectEvent) && C89219l.m154714a(this.temperatureErrorEvent, editStickerPanelState.temperatureErrorEvent) && C89219l.m154714a(this.launchChooseImageActivityEvent, editStickerPanelState.launchChooseImageActivityEvent) && C89219l.m154714a(this.enterMethod, editStickerPanelState.enterMethod) && C89219l.m154714a(getUi(), editStickerPanelState.getUi());
    }

    public final int hashCode() {
        C20521k kVar = this.stickerViewVisibleEvent;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        C20524n<Effect, String> nVar = this.selectEffectEvent;
        int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C20526p pVar = this.temperatureErrorEvent;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C20524n<Effect, String> nVar2 = this.launchChooseImageActivityEvent;
        int hashCode4 = (hashCode3 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        String str = this.enterMethod;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "EditStickerPanelState(stickerViewVisibleEvent=" + this.stickerViewVisibleEvent + ", selectEffectEvent=" + this.selectEffectEvent + ", temperatureErrorEvent=" + this.temperatureErrorEvent + ", launchChooseImageActivityEvent=" + this.launchChooseImageActivityEvent + ", enterMethod=" + this.enterMethod + ", ui=" + getUi() + ")";
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final C20524n<Effect, String> getLaunchChooseImageActivityEvent() {
        return this.launchChooseImageActivityEvent;
    }

    public final C20524n<Effect, String> getSelectEffectEvent() {
        return this.selectEffectEvent;
    }

    public final C20521k getStickerViewVisibleEvent() {
        return this.stickerViewVisibleEvent;
    }

    public final C20526p getTemperatureErrorEvent() {
        return this.temperatureErrorEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f185261ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditStickerPanelState(C20521k kVar, C20524n<Effect, String> nVar, C20526p pVar, C20524n<Effect, String> nVar2, String str, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.stickerViewVisibleEvent = kVar;
        this.selectEffectEvent = nVar;
        this.temperatureErrorEvent = pVar;
        this.launchChooseImageActivityEvent = nVar2;
        this.enterMethod = str;
        this.f185261ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditStickerPanelState(C20521k kVar, C20524n nVar, C20526p pVar, C20524n nVar2, String str, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : kVar, (i & 2) != 0 ? null : nVar, (i & 4) != 0 ? null : pVar, (i & 8) != 0 ? null : nVar2, (i & 16) == 0 ? str : null, (i & 32) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
