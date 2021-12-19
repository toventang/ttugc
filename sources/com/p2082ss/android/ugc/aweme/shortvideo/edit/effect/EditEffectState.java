package com.p2082ss.android.ugc.aweme.shortvideo.edit.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.EditEffectState */
public final class EditEffectState extends UiState {
    private final C20526p refreshCoverEvent;
    private final C20526p regenerateReverseVideo;
    private final Integer setVideoLength;

    /* renamed from: ui */
    private final AbstractC23517a f158926ui;
    private final C20523m updateEffectTime;

    static {
        Covode.recordClassIndex(83490);
    }

    public EditEffectState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ EditEffectState copy$default(EditEffectState editEffectState, AbstractC23517a aVar, Integer num, C20526p pVar, C20526p pVar2, C20523m mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = editEffectState.getUi();
        }
        if ((i & 2) != 0) {
            num = editEffectState.setVideoLength;
        }
        if ((i & 4) != 0) {
            pVar = editEffectState.regenerateReverseVideo;
        }
        if ((i & 8) != 0) {
            pVar2 = editEffectState.refreshCoverEvent;
        }
        if ((i & 16) != 0) {
            mVar = editEffectState.updateEffectTime;
        }
        return editEffectState.copy(aVar, num, pVar, pVar2, mVar);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final Integer component2() {
        return this.setVideoLength;
    }

    public final C20526p component3() {
        return this.regenerateReverseVideo;
    }

    public final C20526p component4() {
        return this.refreshCoverEvent;
    }

    public final C20523m component5() {
        return this.updateEffectTime;
    }

    public final EditEffectState copy(AbstractC23517a aVar, Integer num, C20526p pVar, C20526p pVar2, C20523m mVar) {
        C89219l.m154721d(aVar, "");
        return new EditEffectState(aVar, num, pVar, pVar2, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditEffectState)) {
            return false;
        }
        EditEffectState editEffectState = (EditEffectState) obj;
        return C89219l.m154714a(getUi(), editEffectState.getUi()) && C89219l.m154714a(this.setVideoLength, editEffectState.setVideoLength) && C89219l.m154714a(this.regenerateReverseVideo, editEffectState.regenerateReverseVideo) && C89219l.m154714a(this.refreshCoverEvent, editEffectState.refreshCoverEvent) && C89219l.m154714a(this.updateEffectTime, editEffectState.updateEffectTime);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        Integer num = this.setVideoLength;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        C20526p pVar = this.regenerateReverseVideo;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C20526p pVar2 = this.refreshCoverEvent;
        int hashCode4 = (hashCode3 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        C20523m mVar = this.updateEffectTime;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "EditEffectState(ui=" + getUi() + ", setVideoLength=" + this.setVideoLength + ", regenerateReverseVideo=" + this.regenerateReverseVideo + ", refreshCoverEvent=" + this.refreshCoverEvent + ", updateEffectTime=" + this.updateEffectTime + ")";
    }

    public final C20526p getRefreshCoverEvent() {
        return this.refreshCoverEvent;
    }

    public final C20526p getRegenerateReverseVideo() {
        return this.regenerateReverseVideo;
    }

    public final Integer getSetVideoLength() {
        return this.setVideoLength;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f158926ui;
    }

    public final C20523m getUpdateEffectTime() {
        return this.updateEffectTime;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditEffectState(AbstractC23517a aVar, Integer num, C20526p pVar, C20526p pVar2, C20523m mVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f158926ui = aVar;
        this.setVideoLength = num;
        this.regenerateReverseVideo = pVar;
        this.refreshCoverEvent = pVar2;
        this.updateEffectTime = mVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditEffectState(AbstractC23517a aVar, Integer num, C20526p pVar, C20526p pVar2, C20523m mVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : pVar, (i & 8) != 0 ? null : pVar2, (i & 16) == 0 ? mVar : null);
    }
}
