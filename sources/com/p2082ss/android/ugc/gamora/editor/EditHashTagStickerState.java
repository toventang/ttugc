package com.p2082ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditHashTagStickerState */
public final class EditHashTagStickerState implements AbstractC20368af {
    private final Boolean enableEdit;
    private final C20526p hideHelpBoxEvent;

    static {
        Covode.recordClassIndex(95831);
    }

    public EditHashTagStickerState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditHashTagStickerState copy$default(EditHashTagStickerState editHashTagStickerState, C20526p pVar, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = editHashTagStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            bool = editHashTagStickerState.enableEdit;
        }
        return editHashTagStickerState.copy(pVar, bool);
    }

    public final C20526p component1() {
        return this.hideHelpBoxEvent;
    }

    public final Boolean component2() {
        return this.enableEdit;
    }

    public final EditHashTagStickerState copy(C20526p pVar, Boolean bool) {
        return new EditHashTagStickerState(pVar, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditHashTagStickerState)) {
            return false;
        }
        EditHashTagStickerState editHashTagStickerState = (EditHashTagStickerState) obj;
        return C89219l.m154714a(this.hideHelpBoxEvent, editHashTagStickerState.hideHelpBoxEvent) && C89219l.m154714a(this.enableEdit, editHashTagStickerState.enableEdit);
    }

    public final int hashCode() {
        C20526p pVar = this.hideHelpBoxEvent;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        Boolean bool = this.enableEdit;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EditHashTagStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", enableEdit=" + this.enableEdit + ")";
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final C20526p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public EditHashTagStickerState(C20526p pVar, Boolean bool) {
        this.hideHelpBoxEvent = pVar;
        this.enableEdit = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditHashTagStickerState(C20526p pVar, Boolean bool, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : bool);
    }
}
