package com.p2082ss.android.ugc.gamora.editor.progress;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.progress.EditProgressState */
public final class EditProgressState extends UiState {
    private final C20523m disablePause;

    /* renamed from: ui */
    private final AbstractC23517a f184451ui;

    static {
        Covode.recordClassIndex(96316);
    }

    public EditProgressState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditProgressState copy$default(EditProgressState editProgressState, AbstractC23517a aVar, C20523m mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = editProgressState.getUi();
        }
        if ((i & 2) != 0) {
            mVar = editProgressState.disablePause;
        }
        return editProgressState.copy(aVar, mVar);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final C20523m component2() {
        return this.disablePause;
    }

    public final EditProgressState copy(AbstractC23517a aVar, C20523m mVar) {
        C89219l.m154721d(aVar, "");
        return new EditProgressState(aVar, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProgressState)) {
            return false;
        }
        EditProgressState editProgressState = (EditProgressState) obj;
        return C89219l.m154714a(getUi(), editProgressState.getUi()) && C89219l.m154714a(this.disablePause, editProgressState.disablePause);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        C20523m mVar = this.disablePause;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EditProgressState(ui=" + getUi() + ", disablePause=" + this.disablePause + ")";
    }

    public final C20523m getDisablePause() {
        return this.disablePause;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f184451ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditProgressState(AbstractC23517a aVar, C20523m mVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f184451ui = aVar;
        this.disablePause = mVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditProgressState(AbstractC23517a aVar, C20523m mVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : mVar);
    }
}
