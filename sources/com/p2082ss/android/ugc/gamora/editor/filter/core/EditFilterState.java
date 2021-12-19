package com.p2082ss.android.ugc.gamora.editor.filter.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.filter.core.EditFilterState */
public final class EditFilterState extends UiState {
    private final C20526p cancelStatus;
    private final C20391d<FilterBean> curFilter;
    private final Map<EffectCategoryResponse, List<FilterBean>> data;
    private final C20521k panelShow;

    /* renamed from: ui */
    private final AbstractC23517a f183879ui;

    static {
        Covode.recordClassIndex(96020);
    }

    public EditFilterState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.filter.core.EditFilterState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditFilterState copy$default(EditFilterState editFilterState, C20521k kVar, C20391d dVar, C20526p pVar, Map map, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = editFilterState.panelShow;
        }
        if ((i & 2) != 0) {
            dVar = editFilterState.curFilter;
        }
        if ((i & 4) != 0) {
            pVar = editFilterState.cancelStatus;
        }
        if ((i & 8) != 0) {
            map = editFilterState.data;
        }
        if ((i & 16) != 0) {
            aVar = editFilterState.getUi();
        }
        return editFilterState.copy(kVar, dVar, pVar, map, aVar);
    }

    public final C20521k component1() {
        return this.panelShow;
    }

    public final C20391d<FilterBean> component2() {
        return this.curFilter;
    }

    public final C20526p component3() {
        return this.cancelStatus;
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> component4() {
        return this.data;
    }

    public final AbstractC23517a component5() {
        return getUi();
    }

    public final EditFilterState copy(C20521k kVar, C20391d<? extends FilterBean> dVar, C20526p pVar, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, AbstractC23517a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(aVar, "");
        return new EditFilterState(kVar, dVar, pVar, map, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFilterState)) {
            return false;
        }
        EditFilterState editFilterState = (EditFilterState) obj;
        return C89219l.m154714a(this.panelShow, editFilterState.panelShow) && C89219l.m154714a(this.curFilter, editFilterState.curFilter) && C89219l.m154714a(this.cancelStatus, editFilterState.cancelStatus) && C89219l.m154714a(this.data, editFilterState.data) && C89219l.m154714a(getUi(), editFilterState.getUi());
    }

    public final int hashCode() {
        C20521k kVar = this.panelShow;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        C20391d<FilterBean> dVar = this.curFilter;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C20526p pVar = this.cancelStatus;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        Map<EffectCategoryResponse, List<FilterBean>> map = this.data;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "EditFilterState(panelShow=" + this.panelShow + ", curFilter=" + this.curFilter + ", cancelStatus=" + this.cancelStatus + ", data=" + this.data + ", ui=" + getUi() + ")";
    }

    public final C20526p getCancelStatus() {
        return this.cancelStatus;
    }

    public final C20391d<FilterBean> getCurFilter() {
        return this.curFilter;
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> getData() {
        return this.data;
    }

    public final C20521k getPanelShow() {
        return this.panelShow;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f183879ui;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.filter.FilterBean> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<? extends com.ss.android.ugc.aweme.filter.FilterBean>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditFilterState(C20521k kVar, C20391d<? extends FilterBean> dVar, C20526p pVar, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(aVar, "");
        this.panelShow = kVar;
        this.curFilter = dVar;
        this.cancelStatus = pVar;
        this.data = map;
        this.f183879ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditFilterState(C20521k kVar, C20391d dVar, C20526p pVar, Map map, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : kVar, (i & 2) != 0 ? new C20391d(null) : dVar, (i & 4) == 0 ? pVar : null, (i & 8) != 0 ? C89041ag.m154415a() : map, (i & 16) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
