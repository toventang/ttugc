package com.p2082ss.android.ugc.gamora.editor.progressbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressState */
public final class EditPreviewProgressState extends UiState {
    private final C20526p changeVideoStatus;
    private final C20523m speedChange;
    private final C20524n<Integer, Integer> statusEvent;

    /* renamed from: ui */
    private final AbstractC23517a f184496ui;

    static {
        Covode.recordClassIndex(96339);
    }

    public EditPreviewProgressState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditPreviewProgressState copy$default(EditPreviewProgressState editPreviewProgressState, AbstractC23517a aVar, C20523m mVar, C20526p pVar, C20524n nVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = editPreviewProgressState.getUi();
        }
        if ((i & 2) != 0) {
            mVar = editPreviewProgressState.speedChange;
        }
        if ((i & 4) != 0) {
            pVar = editPreviewProgressState.changeVideoStatus;
        }
        if ((i & 8) != 0) {
            nVar = editPreviewProgressState.statusEvent;
        }
        return editPreviewProgressState.copy(aVar, mVar, pVar, nVar);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final C20523m component2() {
        return this.speedChange;
    }

    public final C20526p component3() {
        return this.changeVideoStatus;
    }

    public final C20524n<Integer, Integer> component4() {
        return this.statusEvent;
    }

    public final EditPreviewProgressState copy(AbstractC23517a aVar, C20523m mVar, C20526p pVar, C20524n<Integer, Integer> nVar) {
        C89219l.m154721d(aVar, "");
        return new EditPreviewProgressState(aVar, mVar, pVar, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPreviewProgressState)) {
            return false;
        }
        EditPreviewProgressState editPreviewProgressState = (EditPreviewProgressState) obj;
        return C89219l.m154714a(getUi(), editPreviewProgressState.getUi()) && C89219l.m154714a(this.speedChange, editPreviewProgressState.speedChange) && C89219l.m154714a(this.changeVideoStatus, editPreviewProgressState.changeVideoStatus) && C89219l.m154714a(this.statusEvent, editPreviewProgressState.statusEvent);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        C20523m mVar = this.speedChange;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C20526p pVar = this.changeVideoStatus;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C20524n<Integer, Integer> nVar = this.statusEvent;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "EditPreviewProgressState(ui=" + getUi() + ", speedChange=" + this.speedChange + ", changeVideoStatus=" + this.changeVideoStatus + ", statusEvent=" + this.statusEvent + ")";
    }

    public final C20526p getChangeVideoStatus() {
        return this.changeVideoStatus;
    }

    public final C20523m getSpeedChange() {
        return this.speedChange;
    }

    public final C20524n<Integer, Integer> getStatusEvent() {
        return this.statusEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f184496ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPreviewProgressState(AbstractC23517a aVar, C20523m mVar, C20526p pVar, C20524n<Integer, Integer> nVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f184496ui = aVar;
        this.speedChange = mVar;
        this.changeVideoStatus = pVar;
        this.statusEvent = nVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditPreviewProgressState(AbstractC23517a aVar, C20523m mVar, C20526p pVar, C20524n nVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : mVar, (i & 4) != 0 ? null : pVar, (i & 8) != 0 ? null : nVar);
    }
}
