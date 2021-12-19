package com.p2082ss.android.ugc.aweme.ftc.components.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordState */
public final class FTCEditAudioRecordState extends UiState {

    /* renamed from: ui */
    private final AbstractC23517a f119812ui;

    static {
        Covode.recordClassIndex(61382);
    }

    public FTCEditAudioRecordState() {
        this(null, 1, null);
    }

    public static /* synthetic */ FTCEditAudioRecordState copy$default(FTCEditAudioRecordState fTCEditAudioRecordState, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = fTCEditAudioRecordState.getUi();
        }
        return fTCEditAudioRecordState.copy(aVar);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final FTCEditAudioRecordState copy(AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new FTCEditAudioRecordState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FTCEditAudioRecordState) && C89219l.m154714a(getUi(), ((UiState) obj).getUi());
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
        return "FTCEditAudioRecordState(ui=" + getUi() + ")";
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f119812ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditAudioRecordState(AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f119812ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditAudioRecordState(AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
