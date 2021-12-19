package com.p2082ss.android.ugc.gamora.editor.cutmusic;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.EditMusicCutState */
public final class EditMusicCutState extends UiState {
    private final C20391d<C89386u<C70625d, Integer, Integer>> musicWaveData;

    /* renamed from: ui */
    private final AbstractC23517a f183692ui;
    private final Integer videoLength;

    static {
        Covode.recordClassIndex(95927);
    }

    public EditMusicCutState() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.cutmusic.EditMusicCutState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditMusicCutState copy$default(EditMusicCutState editMusicCutState, C20391d dVar, Integer num, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = editMusicCutState.musicWaveData;
        }
        if ((i & 2) != 0) {
            num = editMusicCutState.videoLength;
        }
        if ((i & 4) != 0) {
            aVar = editMusicCutState.getUi();
        }
        return editMusicCutState.copy(dVar, num, aVar);
    }

    public final C20391d<C89386u<C70625d, Integer, Integer>> component1() {
        return this.musicWaveData;
    }

    public final Integer component2() {
        return this.videoLength;
    }

    public final AbstractC23517a component3() {
        return getUi();
    }

    public final EditMusicCutState copy(C20391d<C89386u<C70625d, Integer, Integer>> dVar, Integer num, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new EditMusicCutState(dVar, num, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditMusicCutState)) {
            return false;
        }
        EditMusicCutState editMusicCutState = (EditMusicCutState) obj;
        return C89219l.m154714a(this.musicWaveData, editMusicCutState.musicWaveData) && C89219l.m154714a(this.videoLength, editMusicCutState.videoLength) && C89219l.m154714a(getUi(), editMusicCutState.getUi());
    }

    public final int hashCode() {
        C20391d<C89386u<C70625d, Integer, Integer>> dVar = this.musicWaveData;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        Integer num = this.videoLength;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EditMusicCutState(musicWaveData=" + this.musicWaveData + ", videoLength=" + this.videoLength + ", ui=" + getUi() + ")";
    }

    public final C20391d<C89386u<C70625d, Integer, Integer>> getMusicWaveData() {
        return this.musicWaveData;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f183692ui;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditMusicCutState(C20391d<C89386u<C70625d, Integer, Integer>> dVar, Integer num, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.musicWaveData = dVar;
        this.videoLength = num;
        this.f183692ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditMusicCutState(C20391d dVar, Integer num, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : dVar, (i & 2) != 0 ? null : num, (i & 4) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
