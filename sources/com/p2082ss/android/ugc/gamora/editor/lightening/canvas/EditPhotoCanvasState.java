package com.p2082ss.android.ugc.gamora.editor.lightening.canvas;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.canvas.EditPhotoCanvasState */
public final class EditPhotoCanvasState extends UiState {

    /* renamed from: ui */
    private final AbstractC23517a f184298ui;

    static {
        Covode.recordClassIndex(96228);
    }

    public EditPhotoCanvasState() {
        this(null, 1, null);
    }

    public static /* synthetic */ EditPhotoCanvasState copy$default(EditPhotoCanvasState editPhotoCanvasState, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = editPhotoCanvasState.getUi();
        }
        return editPhotoCanvasState.copy(aVar);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final EditPhotoCanvasState copy(AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new EditPhotoCanvasState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EditPhotoCanvasState) && C89219l.m154714a(getUi(), ((UiState) obj).getUi());
        }
        return true;
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        if (ui != null) {
            return ui.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "EditPhotoCanvasState(ui=" + getUi() + ")";
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f184298ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoCanvasState(AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f184298ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditPhotoCanvasState(AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23519b() : aVar);
    }
}
