package com.p2082ss.android.ugc.aweme.ftc.components.corner;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerState */
public final class FTCEditCornerState extends UiState {
    private final Integer bottomMargin;
    private final Boolean cornerVisible;
    private final Integer topMargin;

    /* renamed from: ui */
    private final AbstractC23517a f119927ui;

    static {
        Covode.recordClassIndex(61427);
    }

    public FTCEditCornerState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FTCEditCornerState copy$default(FTCEditCornerState fTCEditCornerState, Boolean bool, Integer num, Integer num2, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = fTCEditCornerState.cornerVisible;
        }
        if ((i & 2) != 0) {
            num = fTCEditCornerState.topMargin;
        }
        if ((i & 4) != 0) {
            num2 = fTCEditCornerState.bottomMargin;
        }
        if ((i & 8) != 0) {
            aVar = fTCEditCornerState.getUi();
        }
        return fTCEditCornerState.copy(bool, num, num2, aVar);
    }

    public final Boolean component1() {
        return this.cornerVisible;
    }

    public final Integer component2() {
        return this.topMargin;
    }

    public final Integer component3() {
        return this.bottomMargin;
    }

    public final AbstractC23517a component4() {
        return getUi();
    }

    public final FTCEditCornerState copy(Boolean bool, Integer num, Integer num2, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new FTCEditCornerState(bool, num, num2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditCornerState)) {
            return false;
        }
        FTCEditCornerState fTCEditCornerState = (FTCEditCornerState) obj;
        return C89219l.m154714a(this.cornerVisible, fTCEditCornerState.cornerVisible) && C89219l.m154714a(this.topMargin, fTCEditCornerState.topMargin) && C89219l.m154714a(this.bottomMargin, fTCEditCornerState.bottomMargin) && C89219l.m154714a(getUi(), fTCEditCornerState.getUi());
    }

    public final int hashCode() {
        Boolean bool = this.cornerVisible;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.topMargin;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.bottomMargin;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "FTCEditCornerState(cornerVisible=" + this.cornerVisible + ", topMargin=" + this.topMargin + ", bottomMargin=" + this.bottomMargin + ", ui=" + getUi() + ")";
    }

    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    public final Boolean getCornerVisible() {
        return this.cornerVisible;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f119927ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditCornerState(Boolean bool, Integer num, Integer num2, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.cornerVisible = bool;
        this.topMargin = num;
        this.bottomMargin = num2;
        this.f119927ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditCornerState(Boolean bool, Integer num, Integer num2, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
