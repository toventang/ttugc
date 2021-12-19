package com.p2082ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditMentionStickerState */
public final class EditMentionStickerState implements AbstractC20368af {
    private final Boolean enableEdit;
    private final C20526p hideHelpBoxEvent;
    private final boolean inTimeEditView;

    static {
        Covode.recordClassIndex(95836);
    }

    public EditMentionStickerState() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ EditMentionStickerState copy$default(EditMentionStickerState editMentionStickerState, C20526p pVar, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = editMentionStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            z = editMentionStickerState.inTimeEditView;
        }
        if ((i & 4) != 0) {
            bool = editMentionStickerState.enableEdit;
        }
        return editMentionStickerState.copy(pVar, z, bool);
    }

    public final C20526p component1() {
        return this.hideHelpBoxEvent;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final Boolean component3() {
        return this.enableEdit;
    }

    public final EditMentionStickerState copy(C20526p pVar, boolean z, Boolean bool) {
        return new EditMentionStickerState(pVar, z, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditMentionStickerState)) {
            return false;
        }
        EditMentionStickerState editMentionStickerState = (EditMentionStickerState) obj;
        return C89219l.m154714a(this.hideHelpBoxEvent, editMentionStickerState.hideHelpBoxEvent) && this.inTimeEditView == editMentionStickerState.inTimeEditView && C89219l.m154714a(this.enableEdit, editMentionStickerState.enableEdit);
    }

    public final int hashCode() {
        C20526p pVar = this.hideHelpBoxEvent;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        boolean z = this.inTimeEditView;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        Boolean bool = this.enableEdit;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "EditMentionStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", inTimeEditView=" + this.inTimeEditView + ", enableEdit=" + this.enableEdit + ")";
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final C20526p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public EditMentionStickerState(C20526p pVar, boolean z, Boolean bool) {
        this.hideHelpBoxEvent = pVar;
        this.inTimeEditView = z;
        this.enableEdit = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditMentionStickerState(C20526p pVar, boolean z, Boolean bool, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : bool);
    }
}
