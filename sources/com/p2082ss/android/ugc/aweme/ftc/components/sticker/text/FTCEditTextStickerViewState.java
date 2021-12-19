package com.p2082ss.android.ugc.aweme.ftc.components.sticker.text;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewState */
public final class FTCEditTextStickerViewState extends UiState {
    private final C20524n<TextStickerData, Boolean> addSticker;
    private final C20391d<AbstractC89183m<C46239q, C46239q, C89391z>> changeToTopListener;
    private final C20526p dismissHitText;
    private final boolean inTimeEditView;
    private final C20526p reloadStickerEvent;
    private final C20526p removeAllStickerEvent;
    private final C20526p resetGuideViewVisibilityEvent;
    private final C20391d<C46239q> showInputView;
    private final C20391d<C46239q> sticker2Top;
    private final C20391d<C89378p<Integer, Integer>> targetCanvasSize;
    private final C20391d<AbstractC46118d> textStickerEditListener;
    private final C20391d<AbstractC46119e> textStickerListener;
    private final C20391d<AbstractC45872e> textStickerMob;
    private final C20391d<AbstractC89172b<C46239q, C89391z>> timeClickListener;

    /* renamed from: ui */
    private final AbstractC23517a f120521ui;
    private final C20526p updateLayoutSizeEvent;

    static {
        Covode.recordClassIndex(61698);
    }

    public FTCEditTextStickerViewState() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public static /* synthetic */ FTCEditTextStickerViewState copy$default(FTCEditTextStickerViewState fTCEditTextStickerViewState, AbstractC23517a aVar, boolean z, C20391d dVar, C20526p pVar, C20524n nVar, C20526p pVar2, C20391d dVar2, C20391d dVar3, C20391d dVar4, C20391d dVar5, C20391d dVar6, C20391d dVar7, C20391d dVar8, C20526p pVar3, C20526p pVar4, C20526p pVar5, int i, Object obj) {
        AbstractC23517a aVar2 = aVar;
        boolean z2 = z;
        C20524n nVar2 = nVar;
        C20526p pVar6 = pVar;
        C20391d<C46239q> dVar9 = dVar;
        C20391d dVar10 = dVar3;
        C20391d dVar11 = dVar2;
        C20526p pVar7 = pVar2;
        C20391d dVar12 = dVar6;
        C20391d dVar13 = dVar5;
        C20391d dVar14 = dVar4;
        C20526p pVar8 = pVar3;
        C20391d dVar15 = dVar8;
        C20391d dVar16 = dVar7;
        C20526p pVar9 = pVar5;
        C20526p pVar10 = pVar4;
        if ((i & 1) != 0) {
            aVar2 = fTCEditTextStickerViewState.getUi();
        }
        if ((i & 2) != 0) {
            z2 = fTCEditTextStickerViewState.inTimeEditView;
        }
        if ((i & 4) != 0) {
            dVar9 = fTCEditTextStickerViewState.sticker2Top;
        }
        if ((i & 8) != 0) {
            pVar6 = fTCEditTextStickerViewState.dismissHitText;
        }
        if ((i & 16) != 0) {
            nVar2 = fTCEditTextStickerViewState.addSticker;
        }
        if ((i & 32) != 0) {
            pVar7 = fTCEditTextStickerViewState.reloadStickerEvent;
        }
        if ((i & 64) != 0) {
            dVar11 = fTCEditTextStickerViewState.textStickerListener;
        }
        if ((i & 128) != 0) {
            dVar10 = fTCEditTextStickerViewState.changeToTopListener;
        }
        if ((i & 256) != 0) {
            dVar14 = fTCEditTextStickerViewState.textStickerEditListener;
        }
        if ((i & 512) != 0) {
            dVar13 = fTCEditTextStickerViewState.timeClickListener;
        }
        if ((i & 1024) != 0) {
            dVar12 = fTCEditTextStickerViewState.textStickerMob;
        }
        if ((i & 2048) != 0) {
            dVar16 = fTCEditTextStickerViewState.targetCanvasSize;
        }
        if ((i & 4096) != 0) {
            dVar15 = fTCEditTextStickerViewState.showInputView;
        }
        if ((i & 8192) != 0) {
            pVar8 = fTCEditTextStickerViewState.removeAllStickerEvent;
        }
        if ((i & 16384) != 0) {
            pVar10 = fTCEditTextStickerViewState.updateLayoutSizeEvent;
        }
        if ((i & 32768) != 0) {
            pVar9 = fTCEditTextStickerViewState.resetGuideViewVisibilityEvent;
        }
        return fTCEditTextStickerViewState.copy(aVar2, z2, dVar9, pVar6, nVar2, pVar7, dVar11, dVar10, dVar14, dVar13, dVar12, dVar16, dVar15, pVar8, pVar10, pVar9);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final C20391d<AbstractC89172b<C46239q, C89391z>> component10() {
        return this.timeClickListener;
    }

    public final C20391d<AbstractC45872e> component11() {
        return this.textStickerMob;
    }

    public final C20391d<C89378p<Integer, Integer>> component12() {
        return this.targetCanvasSize;
    }

    public final C20391d<C46239q> component13() {
        return this.showInputView;
    }

    public final C20526p component14() {
        return this.removeAllStickerEvent;
    }

    public final C20526p component15() {
        return this.updateLayoutSizeEvent;
    }

    public final C20526p component16() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final C20391d<C46239q> component3() {
        return this.sticker2Top;
    }

    public final C20526p component4() {
        return this.dismissHitText;
    }

    public final C20524n<TextStickerData, Boolean> component5() {
        return this.addSticker;
    }

    public final C20526p component6() {
        return this.reloadStickerEvent;
    }

    public final C20391d<AbstractC46119e> component7() {
        return this.textStickerListener;
    }

    public final C20391d<AbstractC89183m<C46239q, C46239q, C89391z>> component8() {
        return this.changeToTopListener;
    }

    public final C20391d<AbstractC46118d> component9() {
        return this.textStickerEditListener;
    }

    public final FTCEditTextStickerViewState copy(AbstractC23517a aVar, boolean z, C20391d<? extends C46239q> dVar, C20526p pVar, C20524n<TextStickerData, Boolean> nVar, C20526p pVar2, C20391d<? extends AbstractC46119e> dVar2, C20391d<? extends AbstractC89183m<? super C46239q, ? super C46239q, C89391z>> dVar3, C20391d<? extends AbstractC46118d> dVar4, C20391d<? extends AbstractC89172b<? super C46239q, C89391z>> dVar5, C20391d<? extends AbstractC45872e> dVar6, C20391d<C89378p<Integer, Integer>> dVar7, C20391d<? extends C46239q> dVar8, C20526p pVar3, C20526p pVar4, C20526p pVar5) {
        C89219l.m154721d(aVar, "");
        return new FTCEditTextStickerViewState(aVar, z, dVar, pVar, nVar, pVar2, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, pVar3, pVar4, pVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditTextStickerViewState)) {
            return false;
        }
        FTCEditTextStickerViewState fTCEditTextStickerViewState = (FTCEditTextStickerViewState) obj;
        return C89219l.m154714a(getUi(), fTCEditTextStickerViewState.getUi()) && this.inTimeEditView == fTCEditTextStickerViewState.inTimeEditView && C89219l.m154714a(this.sticker2Top, fTCEditTextStickerViewState.sticker2Top) && C89219l.m154714a(this.dismissHitText, fTCEditTextStickerViewState.dismissHitText) && C89219l.m154714a(this.addSticker, fTCEditTextStickerViewState.addSticker) && C89219l.m154714a(this.reloadStickerEvent, fTCEditTextStickerViewState.reloadStickerEvent) && C89219l.m154714a(this.textStickerListener, fTCEditTextStickerViewState.textStickerListener) && C89219l.m154714a(this.changeToTopListener, fTCEditTextStickerViewState.changeToTopListener) && C89219l.m154714a(this.textStickerEditListener, fTCEditTextStickerViewState.textStickerEditListener) && C89219l.m154714a(this.timeClickListener, fTCEditTextStickerViewState.timeClickListener) && C89219l.m154714a(this.textStickerMob, fTCEditTextStickerViewState.textStickerMob) && C89219l.m154714a(this.targetCanvasSize, fTCEditTextStickerViewState.targetCanvasSize) && C89219l.m154714a(this.showInputView, fTCEditTextStickerViewState.showInputView) && C89219l.m154714a(this.removeAllStickerEvent, fTCEditTextStickerViewState.removeAllStickerEvent) && C89219l.m154714a(this.updateLayoutSizeEvent, fTCEditTextStickerViewState.updateLayoutSizeEvent) && C89219l.m154714a(this.resetGuideViewVisibilityEvent, fTCEditTextStickerViewState.resetGuideViewVisibilityEvent);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        boolean z = this.inTimeEditView;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        C20391d<C46239q> dVar = this.sticker2Top;
        int hashCode2 = (i5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C20526p pVar = this.dismissHitText;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C20524n<TextStickerData, Boolean> nVar = this.addSticker;
        int hashCode4 = (hashCode3 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C20526p pVar2 = this.reloadStickerEvent;
        int hashCode5 = (hashCode4 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        C20391d<AbstractC46119e> dVar2 = this.textStickerListener;
        int hashCode6 = (hashCode5 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        C20391d<AbstractC89183m<C46239q, C46239q, C89391z>> dVar3 = this.changeToTopListener;
        int hashCode7 = (hashCode6 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31;
        C20391d<AbstractC46118d> dVar4 = this.textStickerEditListener;
        int hashCode8 = (hashCode7 + (dVar4 != null ? dVar4.hashCode() : 0)) * 31;
        C20391d<AbstractC89172b<C46239q, C89391z>> dVar5 = this.timeClickListener;
        int hashCode9 = (hashCode8 + (dVar5 != null ? dVar5.hashCode() : 0)) * 31;
        C20391d<AbstractC45872e> dVar6 = this.textStickerMob;
        int hashCode10 = (hashCode9 + (dVar6 != null ? dVar6.hashCode() : 0)) * 31;
        C20391d<C89378p<Integer, Integer>> dVar7 = this.targetCanvasSize;
        int hashCode11 = (hashCode10 + (dVar7 != null ? dVar7.hashCode() : 0)) * 31;
        C20391d<C46239q> dVar8 = this.showInputView;
        int hashCode12 = (hashCode11 + (dVar8 != null ? dVar8.hashCode() : 0)) * 31;
        C20526p pVar3 = this.removeAllStickerEvent;
        int hashCode13 = (hashCode12 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        C20526p pVar4 = this.updateLayoutSizeEvent;
        int hashCode14 = (hashCode13 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        C20526p pVar5 = this.resetGuideViewVisibilityEvent;
        if (pVar5 != null) {
            i = pVar5.hashCode();
        }
        return hashCode14 + i;
    }

    public final String toString() {
        return "FTCEditTextStickerViewState(ui=" + getUi() + ", inTimeEditView=" + this.inTimeEditView + ", sticker2Top=" + this.sticker2Top + ", dismissHitText=" + this.dismissHitText + ", addSticker=" + this.addSticker + ", reloadStickerEvent=" + this.reloadStickerEvent + ", textStickerListener=" + this.textStickerListener + ", changeToTopListener=" + this.changeToTopListener + ", textStickerEditListener=" + this.textStickerEditListener + ", timeClickListener=" + this.timeClickListener + ", textStickerMob=" + this.textStickerMob + ", targetCanvasSize=" + this.targetCanvasSize + ", showInputView=" + this.showInputView + ", removeAllStickerEvent=" + this.removeAllStickerEvent + ", updateLayoutSizeEvent=" + this.updateLayoutSizeEvent + ", resetGuideViewVisibilityEvent=" + this.resetGuideViewVisibilityEvent + ")";
    }

    public final C20524n<TextStickerData, Boolean> getAddSticker() {
        return this.addSticker;
    }

    public final C20391d<AbstractC89183m<C46239q, C46239q, C89391z>> getChangeToTopListener() {
        return this.changeToTopListener;
    }

    public final C20526p getDismissHitText() {
        return this.dismissHitText;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final C20526p getReloadStickerEvent() {
        return this.reloadStickerEvent;
    }

    public final C20526p getRemoveAllStickerEvent() {
        return this.removeAllStickerEvent;
    }

    public final C20526p getResetGuideViewVisibilityEvent() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final C20391d<C46239q> getShowInputView() {
        return this.showInputView;
    }

    public final C20391d<C46239q> getSticker2Top() {
        return this.sticker2Top;
    }

    public final C20391d<C89378p<Integer, Integer>> getTargetCanvasSize() {
        return this.targetCanvasSize;
    }

    public final C20391d<AbstractC46118d> getTextStickerEditListener() {
        return this.textStickerEditListener;
    }

    public final C20391d<AbstractC46119e> getTextStickerListener() {
        return this.textStickerListener;
    }

    public final C20391d<AbstractC45872e> getTextStickerMob() {
        return this.textStickerMob;
    }

    public final C20391d<AbstractC89172b<C46239q, C89391z>> getTimeClickListener() {
        return this.timeClickListener;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f120521ui;
    }

    public final C20526p getUpdateLayoutSizeEvent() {
        return this.updateLayoutSizeEvent;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.e> */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.bytedance.jedi.arch.d<? extends h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z>> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z>> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.d.e> */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditTextStickerViewState(AbstractC23517a aVar, boolean z, C20391d<? extends C46239q> dVar, C20526p pVar, C20524n<TextStickerData, Boolean> nVar, C20526p pVar2, C20391d<? extends AbstractC46119e> dVar2, C20391d<? extends AbstractC89183m<? super C46239q, ? super C46239q, C89391z>> dVar3, C20391d<? extends AbstractC46118d> dVar4, C20391d<? extends AbstractC89172b<? super C46239q, C89391z>> dVar5, C20391d<? extends AbstractC45872e> dVar6, C20391d<C89378p<Integer, Integer>> dVar7, C20391d<? extends C46239q> dVar8, C20526p pVar3, C20526p pVar4, C20526p pVar5) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f120521ui = aVar;
        this.inTimeEditView = z;
        this.sticker2Top = dVar;
        this.dismissHitText = pVar;
        this.addSticker = nVar;
        this.reloadStickerEvent = pVar2;
        this.textStickerListener = dVar2;
        this.changeToTopListener = dVar3;
        this.textStickerEditListener = dVar4;
        this.timeClickListener = dVar5;
        this.textStickerMob = dVar6;
        this.targetCanvasSize = dVar7;
        this.showInputView = dVar8;
        this.removeAllStickerEvent = pVar3;
        this.updateLayoutSizeEvent = pVar4;
        this.resetGuideViewVisibilityEvent = pVar5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditTextStickerViewState(AbstractC23517a aVar, boolean z, C20391d dVar, C20526p pVar, C20524n nVar, C20526p pVar2, C20391d dVar2, C20391d dVar3, C20391d dVar4, C20391d dVar5, C20391d dVar6, C20391d dVar7, C20391d dVar8, C20526p pVar3, C20526p pVar4, C20526p pVar5, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : pVar, (i & 16) != 0 ? null : nVar, (i & 32) != 0 ? null : pVar2, (i & 64) != 0 ? null : dVar2, (i & 128) != 0 ? null : dVar3, (i & 256) != 0 ? null : dVar4, (i & 512) != 0 ? null : dVar5, (i & 1024) != 0 ? null : dVar6, (i & 2048) != 0 ? null : dVar7, (i & 4096) != 0 ? null : dVar8, (i & 8192) != 0 ? null : pVar3, (i & 16384) != 0 ? null : pVar4, (i & 32768) != 0 ? null : pVar5);
    }
}
