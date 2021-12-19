package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeState */
public final class DuetLayoutModeState extends UiState {
    private final int changeDirectionMode;
    private final int chosenPosition;
    private final int guideMode;
    private final String toast;
    private final int touchGesture;

    /* renamed from: ui */
    private final AbstractC23517a f158149ui;

    static {
        Covode.recordClassIndex(83124);
    }

    public DuetLayoutModeState() {
        this(0, 0, 0, 0, null, null, 63, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutModeState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m124883xc877fb26(int i) {
        return i;
    }

    public static /* synthetic */ DuetLayoutModeState copy$default(DuetLayoutModeState duetLayoutModeState, int i, int i2, int i3, int i4, String str, AbstractC23517a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = duetLayoutModeState.changeDirectionMode;
        }
        if ((i5 & 2) != 0) {
            i2 = duetLayoutModeState.guideMode;
        }
        if ((i5 & 4) != 0) {
            i3 = duetLayoutModeState.touchGesture;
        }
        if ((i5 & 8) != 0) {
            i4 = duetLayoutModeState.chosenPosition;
        }
        if ((i5 & 16) != 0) {
            str = duetLayoutModeState.toast;
        }
        if ((i5 & 32) != 0) {
            aVar = duetLayoutModeState.getUi();
        }
        return duetLayoutModeState.copy(i, i2, i3, i4, str, aVar);
    }

    public final int component1() {
        return this.changeDirectionMode;
    }

    public final int component2() {
        return this.guideMode;
    }

    public final int component3() {
        return this.touchGesture;
    }

    public final int component4() {
        return this.chosenPosition;
    }

    public final String component5() {
        return this.toast;
    }

    public final AbstractC23517a component6() {
        return getUi();
    }

    public final DuetLayoutModeState copy(int i, int i2, int i3, int i4, String str, AbstractC23517a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        return new DuetLayoutModeState(i, i2, i3, i4, str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetLayoutModeState)) {
            return false;
        }
        DuetLayoutModeState duetLayoutModeState = (DuetLayoutModeState) obj;
        return this.changeDirectionMode == duetLayoutModeState.changeDirectionMode && this.guideMode == duetLayoutModeState.guideMode && this.touchGesture == duetLayoutModeState.touchGesture && this.chosenPosition == duetLayoutModeState.chosenPosition && C89219l.m154714a(this.toast, duetLayoutModeState.toast) && C89219l.m154714a(getUi(), duetLayoutModeState.getUi());
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutModeState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((m124883xc877fb26(this.changeDirectionMode) * 31) + m124883xc877fb26(this.guideMode)) * 31) + m124883xc877fb26(this.touchGesture)) * 31) + m124883xc877fb26(this.chosenPosition)) * 31;
        String str = this.toast;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutModeState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DuetLayoutModeState(changeDirectionMode=" + this.changeDirectionMode + ", guideMode=" + this.guideMode + ", touchGesture=" + this.touchGesture + ", chosenPosition=" + this.chosenPosition + ", toast=" + this.toast + ", ui=" + getUi() + ")";
    }

    public final int getChangeDirectionMode() {
        return this.changeDirectionMode;
    }

    public final int getChosenPosition() {
        return this.chosenPosition;
    }

    public final int getGuideMode() {
        return this.guideMode;
    }

    public final String getToast() {
        return this.toast;
    }

    public final int getTouchGesture() {
        return this.touchGesture;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f158149ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DuetLayoutModeState(int i, int i2, int i3, int i4, String str, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.changeDirectionMode = i;
        this.guideMode = i2;
        this.touchGesture = i3;
        this.chosenPosition = i4;
        this.toast = str;
        this.f158149ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DuetLayoutModeState(int i, int i2, int i3, int i4, String str, AbstractC23517a aVar, int i5, C89214g gVar) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? "" : str, (i5 & 32) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
