package com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelState */
public final class StoryEditEffectPanelState extends UiState {
    private final C20526p clipRefreshEvent;

    /* renamed from: ui */
    private final AbstractC23517a f172709ui;

    static {
        Covode.recordClassIndex(89973);
    }

    public StoryEditEffectPanelState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ StoryEditEffectPanelState copy$default(StoryEditEffectPanelState storyEditEffectPanelState, AbstractC23517a aVar, C20526p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = storyEditEffectPanelState.getUi();
        }
        if ((i & 2) != 0) {
            pVar = storyEditEffectPanelState.clipRefreshEvent;
        }
        return storyEditEffectPanelState.copy(aVar, pVar);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final C20526p component2() {
        return this.clipRefreshEvent;
    }

    public final StoryEditEffectPanelState copy(AbstractC23517a aVar, C20526p pVar) {
        C89219l.m154721d(aVar, "");
        return new StoryEditEffectPanelState(aVar, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditEffectPanelState)) {
            return false;
        }
        StoryEditEffectPanelState storyEditEffectPanelState = (StoryEditEffectPanelState) obj;
        return C89219l.m154714a(getUi(), storyEditEffectPanelState.getUi()) && C89219l.m154714a(this.clipRefreshEvent, storyEditEffectPanelState.clipRefreshEvent);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        C20526p pVar = this.clipRefreshEvent;
        if (pVar != null) {
            i = pVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StoryEditEffectPanelState(ui=" + getUi() + ", clipRefreshEvent=" + this.clipRefreshEvent + ")";
    }

    public final C20526p getClipRefreshEvent() {
        return this.clipRefreshEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f172709ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryEditEffectPanelState(AbstractC23517a aVar, C20526p pVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f172709ui = aVar;
        this.clipRefreshEvent = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryEditEffectPanelState(AbstractC23517a aVar, C20526p pVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : pVar);
    }
}
