package com.p2082ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicEditToolbarState */
public final class ReplaceMusicEditToolbarState extends UiState {
    private final Boolean backVisible;
    private final C20526p refresh;

    /* renamed from: ui */
    private final AbstractC23517a f185733ui;
    private final C20521k viewVisible;

    static {
        Covode.recordClassIndex(97002);
    }

    public static /* synthetic */ ReplaceMusicEditToolbarState copy$default(ReplaceMusicEditToolbarState replaceMusicEditToolbarState, AbstractC23517a aVar, Boolean bool, C20526p pVar, C20521k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = replaceMusicEditToolbarState.getUi();
        }
        if ((i & 2) != 0) {
            bool = replaceMusicEditToolbarState.backVisible;
        }
        if ((i & 4) != 0) {
            pVar = replaceMusicEditToolbarState.refresh;
        }
        if ((i & 8) != 0) {
            kVar = replaceMusicEditToolbarState.viewVisible;
        }
        return replaceMusicEditToolbarState.copy(aVar, bool, pVar, kVar);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final Boolean component2() {
        return this.backVisible;
    }

    public final C20526p component3() {
        return this.refresh;
    }

    public final C20521k component4() {
        return this.viewVisible;
    }

    public final ReplaceMusicEditToolbarState copy(AbstractC23517a aVar, Boolean bool, C20526p pVar, C20521k kVar) {
        C89219l.m154721d(aVar, "");
        return new ReplaceMusicEditToolbarState(aVar, bool, pVar, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceMusicEditToolbarState)) {
            return false;
        }
        ReplaceMusicEditToolbarState replaceMusicEditToolbarState = (ReplaceMusicEditToolbarState) obj;
        return C89219l.m154714a(getUi(), replaceMusicEditToolbarState.getUi()) && C89219l.m154714a(this.backVisible, replaceMusicEditToolbarState.backVisible) && C89219l.m154714a(this.refresh, replaceMusicEditToolbarState.refresh) && C89219l.m154714a(this.viewVisible, replaceMusicEditToolbarState.viewVisible);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        Boolean bool = this.backVisible;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        C20526p pVar = this.refresh;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C20521k kVar = this.viewVisible;
        if (kVar != null) {
            i = kVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ReplaceMusicEditToolbarState(ui=" + getUi() + ", backVisible=" + this.backVisible + ", refresh=" + this.refresh + ", viewVisible=" + this.viewVisible + ")";
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final C20526p getRefresh() {
        return this.refresh;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f185733ui;
    }

    public final C20521k getViewVisible() {
        return this.viewVisible;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReplaceMusicEditToolbarState(AbstractC23517a aVar, Boolean bool, C20526p pVar, C20521k kVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f185733ui = aVar;
        this.backVisible = bool;
        this.refresh = pVar;
        this.viewVisible = kVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReplaceMusicEditToolbarState(AbstractC23517a aVar, Boolean bool, C20526p pVar, C20521k kVar, int i, C89214g gVar) {
        this(aVar, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : pVar, (i & 8) != 0 ? null : kVar);
    }
}
