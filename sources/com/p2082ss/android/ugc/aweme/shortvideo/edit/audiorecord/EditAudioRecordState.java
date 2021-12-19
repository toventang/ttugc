package com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordState */
public final class EditAudioRecordState extends UiState {
    private final C20526p clearAudioData;

    /* renamed from: ui */
    private final AbstractC23517a f158696ui;

    static {
        Covode.recordClassIndex(83376);
    }

    public EditAudioRecordState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditAudioRecordState copy$default(EditAudioRecordState editAudioRecordState, AbstractC23517a aVar, C20526p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = editAudioRecordState.getUi();
        }
        if ((i & 2) != 0) {
            pVar = editAudioRecordState.clearAudioData;
        }
        return editAudioRecordState.copy(aVar, pVar);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final C20526p component2() {
        return this.clearAudioData;
    }

    public final EditAudioRecordState copy(AbstractC23517a aVar, C20526p pVar) {
        C89219l.m154721d(aVar, "");
        return new EditAudioRecordState(aVar, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAudioRecordState)) {
            return false;
        }
        EditAudioRecordState editAudioRecordState = (EditAudioRecordState) obj;
        return C89219l.m154714a(getUi(), editAudioRecordState.getUi()) && C89219l.m154714a(this.clearAudioData, editAudioRecordState.clearAudioData);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        C20526p pVar = this.clearAudioData;
        if (pVar != null) {
            i = pVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EditAudioRecordState(ui=" + getUi() + ", clearAudioData=" + this.clearAudioData + ")";
    }

    public final C20526p getClearAudioData() {
        return this.clearAudioData;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f158696ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditAudioRecordState(AbstractC23517a aVar, C20526p pVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f158696ui = aVar;
        this.clearAudioData = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditAudioRecordState(AbstractC23517a aVar, C20526p pVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : pVar);
    }
}
