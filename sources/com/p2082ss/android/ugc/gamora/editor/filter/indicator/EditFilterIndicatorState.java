package com.p2082ss.android.ugc.gamora.editor.filter.indicator;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorState */
public final class EditFilterIndicatorState extends UiState {
    private final FilterBean currentFilter;
    private final boolean isAutoUse;
    private final boolean isShowPrompt;

    /* renamed from: ui */
    private final AbstractC23517a f183971ui;

    static {
        Covode.recordClassIndex(96065);
    }

    public static /* synthetic */ EditFilterIndicatorState copy$default(EditFilterIndicatorState editFilterIndicatorState, boolean z, boolean z2, FilterBean filterBean, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = editFilterIndicatorState.isAutoUse;
        }
        if ((i & 2) != 0) {
            z2 = editFilterIndicatorState.isShowPrompt;
        }
        if ((i & 4) != 0) {
            filterBean = editFilterIndicatorState.currentFilter;
        }
        if ((i & 8) != 0) {
            aVar = editFilterIndicatorState.getUi();
        }
        return editFilterIndicatorState.copy(z, z2, filterBean, aVar);
    }

    public final boolean component1() {
        return this.isAutoUse;
    }

    public final boolean component2() {
        return this.isShowPrompt;
    }

    public final FilterBean component3() {
        return this.currentFilter;
    }

    public final AbstractC23517a component4() {
        return getUi();
    }

    public final EditFilterIndicatorState copy(boolean z, boolean z2, FilterBean filterBean, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new EditFilterIndicatorState(z, z2, filterBean, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFilterIndicatorState)) {
            return false;
        }
        EditFilterIndicatorState editFilterIndicatorState = (EditFilterIndicatorState) obj;
        return this.isAutoUse == editFilterIndicatorState.isAutoUse && this.isShowPrompt == editFilterIndicatorState.isShowPrompt && C89219l.m154714a(this.currentFilter, editFilterIndicatorState.currentFilter) && C89219l.m154714a(getUi(), editFilterIndicatorState.getUi());
    }

    public final int hashCode() {
        boolean z = this.isAutoUse;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.isShowPrompt) {
            i = 0;
        }
        int i6 = (i5 + i) * 31;
        FilterBean filterBean = this.currentFilter;
        int i7 = 0;
        int hashCode = (i6 + (filterBean != null ? filterBean.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i7 = ui.hashCode();
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "EditFilterIndicatorState(isAutoUse=" + this.isAutoUse + ", isShowPrompt=" + this.isShowPrompt + ", currentFilter=" + this.currentFilter + ", ui=" + getUi() + ")";
    }

    public final FilterBean getCurrentFilter() {
        return this.currentFilter;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f183971ui;
    }

    public final boolean isAutoUse() {
        return this.isAutoUse;
    }

    public final boolean isShowPrompt() {
        return this.isShowPrompt;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditFilterIndicatorState(boolean z, boolean z2, FilterBean filterBean, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.isAutoUse = z;
        this.isShowPrompt = z2;
        this.currentFilter = filterBean;
        this.f183971ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditFilterIndicatorState(boolean z, boolean z2, FilterBean filterBean, AbstractC23517a aVar, int i, C89214g gVar) {
        this(z, z2, (i & 4) != 0 ? null : filterBean, (i & 8) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
