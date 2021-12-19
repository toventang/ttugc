package com.bytedance.creativex.recorder.filter.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class FilterPanelState extends UiState {
    private final Map<EffectCategoryResponse, List<FilterBean>> data;
    private final boolean disableFilter;
    private final C20526p enterFilterBoxEvent;
    private final int pendingSelected;
    private final FilterBean selectedFilter;

    /* renamed from: ui */
    private final AbstractC23517a f34561ui;

    static {
        Covode.recordClassIndex(16329);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.creativex.recorder.filter.panel.FilterPanelState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterPanelState copy$default(FilterPanelState filterPanelState, AbstractC23517a aVar, FilterBean filterBean, boolean z, Map map, C20526p pVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = filterPanelState.getUi();
        }
        if ((i2 & 2) != 0) {
            filterBean = filterPanelState.selectedFilter;
        }
        if ((i2 & 4) != 0) {
            z = filterPanelState.disableFilter;
        }
        if ((i2 & 8) != 0) {
            map = filterPanelState.data;
        }
        if ((i2 & 16) != 0) {
            pVar = filterPanelState.enterFilterBoxEvent;
        }
        if ((i2 & 32) != 0) {
            i = filterPanelState.pendingSelected;
        }
        return filterPanelState.copy(aVar, filterBean, z, map, pVar, i);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final FilterBean component2() {
        return this.selectedFilter;
    }

    public final boolean component3() {
        return this.disableFilter;
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> component4() {
        return this.data;
    }

    public final C20526p component5() {
        return this.enterFilterBoxEvent;
    }

    public final int component6() {
        return this.pendingSelected;
    }

    public final FilterPanelState copy(AbstractC23517a aVar, FilterBean filterBean, boolean z, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, C20526p pVar, int i) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(map, "");
        return new FilterPanelState(aVar, filterBean, z, map, pVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterPanelState)) {
            return false;
        }
        FilterPanelState filterPanelState = (FilterPanelState) obj;
        return C89219l.m154714a(getUi(), filterPanelState.getUi()) && C89219l.m154714a(this.selectedFilter, filterPanelState.selectedFilter) && this.disableFilter == filterPanelState.disableFilter && C89219l.m154714a(this.data, filterPanelState.data) && C89219l.m154714a(this.enterFilterBoxEvent, filterPanelState.enterFilterBoxEvent) && this.pendingSelected == filterPanelState.pendingSelected;
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        FilterBean filterBean = this.selectedFilter;
        int hashCode2 = (hashCode + (filterBean != null ? filterBean.hashCode() : 0)) * 31;
        boolean z = this.disableFilter;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        Map<EffectCategoryResponse, List<FilterBean>> map = this.data;
        int hashCode3 = (i5 + (map != null ? map.hashCode() : 0)) * 31;
        C20526p pVar = this.enterFilterBoxEvent;
        if (pVar != null) {
            i = pVar.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.pendingSelected;
    }

    public final String toString() {
        return "FilterPanelState(ui=" + getUi() + ", selectedFilter=" + this.selectedFilter + ", disableFilter=" + this.disableFilter + ", data=" + this.data + ", enterFilterBoxEvent=" + this.enterFilterBoxEvent + ", pendingSelected=" + this.pendingSelected + ")";
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> getData() {
        return this.data;
    }

    public final boolean getDisableFilter() {
        return this.disableFilter;
    }

    public final C20526p getEnterFilterBoxEvent() {
        return this.enterFilterBoxEvent;
    }

    public final int getPendingSelected() {
        return this.pendingSelected;
    }

    public final FilterBean getSelectedFilter() {
        return this.selectedFilter;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f34561ui;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<? extends com.ss.android.ugc.aweme.filter.FilterBean>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterPanelState(AbstractC23517a aVar, FilterBean filterBean, boolean z, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, C20526p pVar, int i) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(map, "");
        this.f34561ui = aVar;
        this.selectedFilter = filterBean;
        this.disableFilter = z;
        this.data = map;
        this.enterFilterBoxEvent = pVar;
        this.pendingSelected = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterPanelState(AbstractC23517a aVar, FilterBean filterBean, boolean z, Map map, C20526p pVar, int i, int i2, C89214g gVar) {
        this(aVar, filterBean, z, map, (i2 & 16) != 0 ? null : pVar, (i2 & 32) != 0 ? Integer.MIN_VALUE : i);
    }
}
