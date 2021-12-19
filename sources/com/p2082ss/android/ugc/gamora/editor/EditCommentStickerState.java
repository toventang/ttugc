package com.p2082ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerState */
public final class EditCommentStickerState implements AbstractC20368af {
    private final C20521k hasCommentSticker;
    private final C20526p hideHelpBoxEvent;
    private final boolean inTimeEditView;
    private final C20526p removeCommentStickerEvent;

    static {
        Covode.recordClassIndex(95824);
    }

    public EditCommentStickerState() {
        this(null, false, null, null, 15, null);
    }

    public static /* synthetic */ EditCommentStickerState copy$default(EditCommentStickerState editCommentStickerState, C20526p pVar, boolean z, C20521k kVar, C20526p pVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = editCommentStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            z = editCommentStickerState.inTimeEditView;
        }
        if ((i & 4) != 0) {
            kVar = editCommentStickerState.hasCommentSticker;
        }
        if ((i & 8) != 0) {
            pVar2 = editCommentStickerState.removeCommentStickerEvent;
        }
        return editCommentStickerState.copy(pVar, z, kVar, pVar2);
    }

    public final C20526p component1() {
        return this.hideHelpBoxEvent;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final C20521k component3() {
        return this.hasCommentSticker;
    }

    public final C20526p component4() {
        return this.removeCommentStickerEvent;
    }

    public final EditCommentStickerState copy(C20526p pVar, boolean z, C20521k kVar, C20526p pVar2) {
        return new EditCommentStickerState(pVar, z, kVar, pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCommentStickerState)) {
            return false;
        }
        EditCommentStickerState editCommentStickerState = (EditCommentStickerState) obj;
        return C89219l.m154714a(this.hideHelpBoxEvent, editCommentStickerState.hideHelpBoxEvent) && this.inTimeEditView == editCommentStickerState.inTimeEditView && C89219l.m154714a(this.hasCommentSticker, editCommentStickerState.hasCommentSticker) && C89219l.m154714a(this.removeCommentStickerEvent, editCommentStickerState.removeCommentStickerEvent);
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
        C20521k kVar = this.hasCommentSticker;
        int hashCode2 = (i5 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C20526p pVar2 = this.removeCommentStickerEvent;
        if (pVar2 != null) {
            i = pVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EditCommentStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", inTimeEditView=" + this.inTimeEditView + ", hasCommentSticker=" + this.hasCommentSticker + ", removeCommentStickerEvent=" + this.removeCommentStickerEvent + ")";
    }

    public final C20521k getHasCommentSticker() {
        return this.hasCommentSticker;
    }

    public final C20526p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final C20526p getRemoveCommentStickerEvent() {
        return this.removeCommentStickerEvent;
    }

    public EditCommentStickerState(C20526p pVar, boolean z, C20521k kVar, C20526p pVar2) {
        this.hideHelpBoxEvent = pVar;
        this.inTimeEditView = z;
        this.hasCommentSticker = kVar;
        this.removeCommentStickerEvent = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditCommentStickerState(C20526p pVar, boolean z, C20521k kVar, C20526p pVar2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : kVar, (i & 8) != 0 ? null : pVar2);
    }
}
