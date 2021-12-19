package com.p2082ss.android.ugc.aweme.ftc.components.cutmusic;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutState */
public final class FTCEditMusicCutState extends UiState {
    private final C89386u<C70625d, Integer, Integer> musicWaveData;

    /* renamed from: ui */
    private final AbstractC23517a f119949ui;
    private final Integer videoLength;

    static {
        Covode.recordClassIndex(61445);
    }

    public FTCEditMusicCutState() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditMusicCutState copy$default(FTCEditMusicCutState fTCEditMusicCutState, C89386u uVar, Integer num, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            uVar = fTCEditMusicCutState.musicWaveData;
        }
        if ((i & 2) != 0) {
            num = fTCEditMusicCutState.videoLength;
        }
        if ((i & 4) != 0) {
            aVar = fTCEditMusicCutState.getUi();
        }
        return fTCEditMusicCutState.copy(uVar, num, aVar);
    }

    public final C89386u<C70625d, Integer, Integer> component1() {
        return this.musicWaveData;
    }

    public final Integer component2() {
        return this.videoLength;
    }

    public final AbstractC23517a component3() {
        return getUi();
    }

    public final FTCEditMusicCutState copy(C89386u<C70625d, Integer, Integer> uVar, Integer num, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new FTCEditMusicCutState(uVar, num, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditMusicCutState)) {
            return false;
        }
        FTCEditMusicCutState fTCEditMusicCutState = (FTCEditMusicCutState) obj;
        return C89219l.m154714a(this.musicWaveData, fTCEditMusicCutState.musicWaveData) && C89219l.m154714a(this.videoLength, fTCEditMusicCutState.videoLength) && C89219l.m154714a(getUi(), fTCEditMusicCutState.getUi());
    }

    public final int hashCode() {
        C89386u<C70625d, Integer, Integer> uVar = this.musicWaveData;
        int i = 0;
        int hashCode = (uVar != null ? uVar.hashCode() : 0) * 31;
        Integer num = this.videoLength;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "FTCEditMusicCutState(musicWaveData=" + this.musicWaveData + ", videoLength=" + this.videoLength + ", ui=" + getUi() + ")";
    }

    public final C89386u<C70625d, Integer, Integer> getMusicWaveData() {
        return this.musicWaveData;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f119949ui;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditMusicCutState(C89386u<C70625d, Integer, Integer> uVar, Integer num, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.musicWaveData = uVar;
        this.videoLength = num;
        this.f119949ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditMusicCutState(C89386u uVar, Integer num, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : uVar, (i & 2) != 0 ? null : num, (i & 4) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
