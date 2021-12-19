package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerState */
public final class EditDonationStickerState implements AbstractC20368af {
    private final C20526p hideHelpBoxEvent;
    private final boolean inTimeEditView;

    static {
        Covode.recordClassIndex(83597);
    }

    public EditDonationStickerState() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ EditDonationStickerState copy$default(EditDonationStickerState editDonationStickerState, C20526p pVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = editDonationStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            z = editDonationStickerState.inTimeEditView;
        }
        return editDonationStickerState.copy(pVar, z);
    }

    public final C20526p component1() {
        return this.hideHelpBoxEvent;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final EditDonationStickerState copy(C20526p pVar, boolean z) {
        return new EditDonationStickerState(pVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditDonationStickerState)) {
            return false;
        }
        EditDonationStickerState editDonationStickerState = (EditDonationStickerState) obj;
        return C89219l.m154714a(this.hideHelpBoxEvent, editDonationStickerState.hideHelpBoxEvent) && this.inTimeEditView == editDonationStickerState.inTimeEditView;
    }

    public final int hashCode() {
        C20526p pVar = this.hideHelpBoxEvent;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        boolean z = this.inTimeEditView;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "EditDonationStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", inTimeEditView=" + this.inTimeEditView + ")";
    }

    public final C20526p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public EditDonationStickerState(C20526p pVar, boolean z) {
        this.hideHelpBoxEvent = pVar;
        this.inTimeEditView = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditDonationStickerState(C20526p pVar, boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? false : z);
    }
}
