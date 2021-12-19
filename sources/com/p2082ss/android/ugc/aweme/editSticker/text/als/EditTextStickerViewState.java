package com.p2082ss.android.ugc.aweme.editSticker.text.als;

import android.text.TextWatcher;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20523m;
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

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewState */
public final class EditTextStickerViewState extends UiState {
    private final C20524n<TextStickerData, Boolean> addSticker;
    private final C20391d<TextWatcher> addTextChangeListenerEvent;
    private final C20391d<String> addTextStickerViaString;
    private final C20391d<C89378p<TextStickerData, String>> afterChangeTextAutoRead;
    private final C20526p cancelNewStickerRead;
    private final C20521k changeTextEditPageReadIcon;
    private final C20391d<AbstractC89183m<C46239q, C46239q, C89391z>> changeToTopListener;
    private final C20526p dismissHitText;
    private final C20391d<C46239q> editTextSticker;
    private final C20521k enableDirectEditEvent;
    private final C20391d<String> fakeTextDataAndRead;
    private final C20521k forceHideReadItemEvent;
    private final C20521k getNowStringGoToReadWithFake;
    private final C20391d<C46239q> goReadTextStickerScene;
    private final C20391d<View.OnClickListener> guideListener;
    private final C20521k guideViewVisibility;
    private final boolean inTimeEditView;
    private final C20521k muteReadText;
    private final C20391d<AbstractC89172b<C46239q, C89391z>> readTextClickListener;
    private final C20526p reloadStickerEvent;
    private final C20526p removeAllStickerEvent;
    private final C20526p removeAllTTS;
    private final C20391d<C46239q> removeTextSticker;
    private final C20526p resetGuideViewVisibilityEvent;
    private final C20391d<C46239q> showInputView;
    private final C20391d<C46239q> sticker2Top;
    private final C20391d<C89378p<Integer, Integer>> targetCanvasSize;
    private final C20391d<AbstractC46118d> textStickerEditListener;
    private final C20391d<AbstractC46119e> textStickerListener;
    private final C20391d<AbstractC45872e> textStickerMob;
    private final C20391d<AbstractC89172b<C46239q, C89391z>> timeClickListener;

    /* renamed from: ui */
    private final AbstractC23517a f107185ui;
    private final C20526p updateLayoutSizeEvent;
    private final C20523m updateStickerTime;

    static {
        Covode.recordClassIndex(54570);
    }

    public EditTextStickerViewState() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    public static /* synthetic */ EditTextStickerViewState copy$default(EditTextStickerViewState editTextStickerViewState, AbstractC23517a aVar, boolean z, C20391d dVar, C20526p pVar, C20524n nVar, C20391d dVar2, C20526p pVar2, C20391d dVar3, C20391d dVar4, C20391d dVar5, C20391d dVar6, C20391d dVar7, C20391d dVar8, C20391d dVar9, C20391d dVar10, C20391d dVar11, C20526p pVar3, C20526p pVar4, C20521k kVar, C20526p pVar5, C20521k kVar2, C20391d dVar12, C20526p pVar6, C20391d dVar13, C20521k kVar3, C20521k kVar4, C20391d dVar14, C20521k kVar5, C20521k kVar6, C20391d dVar15, C20391d dVar16, C20391d dVar17, C20523m mVar, C20526p pVar7, int i, int i2, Object obj) {
        AbstractC23517a aVar2 = aVar;
        C20391d<C89378p<Integer, Integer>> dVar18 = dVar9;
        C20391d<AbstractC45872e> dVar19 = dVar8;
        C20391d<AbstractC89172b<C46239q, C89391z>> dVar20 = dVar7;
        C20524n<TextStickerData, Boolean> nVar2 = nVar;
        C20526p pVar8 = pVar;
        C20391d<C46239q> dVar21 = dVar;
        boolean z2 = z;
        C20391d<View.OnClickListener> dVar22 = dVar2;
        C20526p pVar9 = pVar2;
        C20391d<AbstractC46119e> dVar23 = dVar3;
        C20391d<AbstractC89183m<C46239q, C46239q, C89391z>> dVar24 = dVar4;
        C20391d<AbstractC46118d> dVar25 = dVar5;
        C20391d<AbstractC89172b<C46239q, C89391z>> dVar26 = dVar6;
        C20391d dVar27 = dVar16;
        C20391d dVar28 = dVar15;
        C20521k kVar7 = kVar6;
        C20521k kVar8 = kVar5;
        C20391d dVar29 = dVar14;
        C20391d dVar30 = dVar17;
        C20521k kVar9 = kVar4;
        C20521k kVar10 = kVar3;
        C20526p pVar10 = pVar4;
        C20526p pVar11 = pVar3;
        C20526p pVar12 = pVar7;
        C20391d<C46239q> dVar31 = dVar11;
        C20391d<C46239q> dVar32 = dVar10;
        C20521k kVar11 = kVar;
        C20526p pVar13 = pVar5;
        C20523m mVar2 = mVar;
        C20521k kVar12 = kVar2;
        C20391d dVar33 = dVar12;
        C20526p pVar14 = pVar6;
        C20391d dVar34 = dVar13;
        if ((i & 1) != 0) {
            aVar2 = editTextStickerViewState.getUi();
        }
        if ((i & 2) != 0) {
            z2 = editTextStickerViewState.inTimeEditView;
        }
        if ((i & 4) != 0) {
            dVar21 = editTextStickerViewState.sticker2Top;
        }
        if ((i & 8) != 0) {
            pVar8 = editTextStickerViewState.dismissHitText;
        }
        if ((i & 16) != 0) {
            nVar2 = editTextStickerViewState.addSticker;
        }
        if ((i & 32) != 0) {
            dVar22 = editTextStickerViewState.guideListener;
        }
        if ((i & 64) != 0) {
            pVar9 = editTextStickerViewState.reloadStickerEvent;
        }
        if ((i & 128) != 0) {
            dVar23 = editTextStickerViewState.textStickerListener;
        }
        if ((i & 256) != 0) {
            dVar24 = editTextStickerViewState.changeToTopListener;
        }
        if ((i & 512) != 0) {
            dVar25 = editTextStickerViewState.textStickerEditListener;
        }
        if ((i & 1024) != 0) {
            dVar26 = editTextStickerViewState.timeClickListener;
        }
        if ((i & 2048) != 0) {
            dVar20 = editTextStickerViewState.readTextClickListener;
        }
        if ((i & 4096) != 0) {
            dVar19 = editTextStickerViewState.textStickerMob;
        }
        if ((i & 8192) != 0) {
            dVar18 = editTextStickerViewState.targetCanvasSize;
        }
        if ((i & 16384) != 0) {
            dVar32 = editTextStickerViewState.showInputView;
        }
        if ((32768 & i) != 0) {
            dVar31 = editTextStickerViewState.editTextSticker;
        }
        if ((65536 & i) != 0) {
            pVar11 = editTextStickerViewState.removeAllStickerEvent;
        }
        if ((131072 & i) != 0) {
            pVar10 = editTextStickerViewState.updateLayoutSizeEvent;
        }
        if ((262144 & i) != 0) {
            kVar11 = editTextStickerViewState.guideViewVisibility;
        }
        if ((524288 & i) != 0) {
            pVar13 = editTextStickerViewState.resetGuideViewVisibilityEvent;
        }
        if ((1048576 & i) != 0) {
            kVar12 = editTextStickerViewState.forceHideReadItemEvent;
        }
        if ((2097152 & i) != 0) {
            dVar33 = editTextStickerViewState.goReadTextStickerScene;
        }
        if ((4194304 & i) != 0) {
            pVar14 = editTextStickerViewState.cancelNewStickerRead;
        }
        if ((8388608 & i) != 0) {
            dVar34 = editTextStickerViewState.fakeTextDataAndRead;
        }
        if ((16777216 & i) != 0) {
            kVar10 = editTextStickerViewState.getNowStringGoToReadWithFake;
        }
        if ((33554432 & i) != 0) {
            kVar9 = editTextStickerViewState.changeTextEditPageReadIcon;
        }
        if ((67108864 & i) != 0) {
            dVar29 = editTextStickerViewState.afterChangeTextAutoRead;
        }
        if ((134217728 & i) != 0) {
            kVar8 = editTextStickerViewState.muteReadText;
        }
        if ((268435456 & i) != 0) {
            kVar7 = editTextStickerViewState.enableDirectEditEvent;
        }
        if ((536870912 & i) != 0) {
            dVar28 = editTextStickerViewState.addTextChangeListenerEvent;
        }
        if ((1073741824 & i) != 0) {
            dVar27 = editTextStickerViewState.addTextStickerViaString;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            dVar30 = editTextStickerViewState.removeTextSticker;
        }
        if ((i2 & 1) != 0) {
            mVar2 = editTextStickerViewState.updateStickerTime;
        }
        if ((i2 & 2) != 0) {
            pVar12 = editTextStickerViewState.removeAllTTS;
        }
        return editTextStickerViewState.copy(aVar2, z2, dVar21, pVar8, nVar2, dVar22, pVar9, dVar23, dVar24, dVar25, dVar26, dVar20, dVar19, dVar18, dVar32, dVar31, pVar11, pVar10, kVar11, pVar13, kVar12, dVar33, pVar14, dVar34, kVar10, kVar9, dVar29, kVar8, kVar7, dVar28, dVar27, dVar30, mVar2, pVar12);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final C20391d<AbstractC46118d> component10() {
        return this.textStickerEditListener;
    }

    public final C20391d<AbstractC89172b<C46239q, C89391z>> component11() {
        return this.timeClickListener;
    }

    public final C20391d<AbstractC89172b<C46239q, C89391z>> component12() {
        return this.readTextClickListener;
    }

    public final C20391d<AbstractC45872e> component13() {
        return this.textStickerMob;
    }

    public final C20391d<C89378p<Integer, Integer>> component14() {
        return this.targetCanvasSize;
    }

    public final C20391d<C46239q> component15() {
        return this.showInputView;
    }

    public final C20391d<C46239q> component16() {
        return this.editTextSticker;
    }

    public final C20526p component17() {
        return this.removeAllStickerEvent;
    }

    public final C20526p component18() {
        return this.updateLayoutSizeEvent;
    }

    public final C20521k component19() {
        return this.guideViewVisibility;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final C20526p component20() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final C20521k component21() {
        return this.forceHideReadItemEvent;
    }

    public final C20391d<C46239q> component22() {
        return this.goReadTextStickerScene;
    }

    public final C20526p component23() {
        return this.cancelNewStickerRead;
    }

    public final C20391d<String> component24() {
        return this.fakeTextDataAndRead;
    }

    public final C20521k component25() {
        return this.getNowStringGoToReadWithFake;
    }

    public final C20521k component26() {
        return this.changeTextEditPageReadIcon;
    }

    public final C20391d<C89378p<TextStickerData, String>> component27() {
        return this.afterChangeTextAutoRead;
    }

    public final C20521k component28() {
        return this.muteReadText;
    }

    public final C20521k component29() {
        return this.enableDirectEditEvent;
    }

    public final C20391d<C46239q> component3() {
        return this.sticker2Top;
    }

    public final C20391d<TextWatcher> component30() {
        return this.addTextChangeListenerEvent;
    }

    public final C20391d<String> component31() {
        return this.addTextStickerViaString;
    }

    public final C20391d<C46239q> component32() {
        return this.removeTextSticker;
    }

    public final C20523m component33() {
        return this.updateStickerTime;
    }

    public final C20526p component34() {
        return this.removeAllTTS;
    }

    public final C20526p component4() {
        return this.dismissHitText;
    }

    public final C20524n<TextStickerData, Boolean> component5() {
        return this.addSticker;
    }

    public final C20391d<View.OnClickListener> component6() {
        return this.guideListener;
    }

    public final C20526p component7() {
        return this.reloadStickerEvent;
    }

    public final C20391d<AbstractC46119e> component8() {
        return this.textStickerListener;
    }

    public final C20391d<AbstractC89183m<C46239q, C46239q, C89391z>> component9() {
        return this.changeToTopListener;
    }

    public final EditTextStickerViewState copy(AbstractC23517a aVar, boolean z, C20391d<? extends C46239q> dVar, C20526p pVar, C20524n<TextStickerData, Boolean> nVar, C20391d<? extends View.OnClickListener> dVar2, C20526p pVar2, C20391d<? extends AbstractC46119e> dVar3, C20391d<? extends AbstractC89183m<? super C46239q, ? super C46239q, C89391z>> dVar4, C20391d<? extends AbstractC46118d> dVar5, C20391d<? extends AbstractC89172b<? super C46239q, C89391z>> dVar6, C20391d<? extends AbstractC89172b<? super C46239q, C89391z>> dVar7, C20391d<? extends AbstractC45872e> dVar8, C20391d<C89378p<Integer, Integer>> dVar9, C20391d<? extends C46239q> dVar10, C20391d<? extends C46239q> dVar11, C20526p pVar3, C20526p pVar4, C20521k kVar, C20526p pVar5, C20521k kVar2, C20391d<? extends C46239q> dVar12, C20526p pVar6, C20391d<String> dVar13, C20521k kVar3, C20521k kVar4, C20391d<C89378p<TextStickerData, String>> dVar14, C20521k kVar5, C20521k kVar6, C20391d<? extends TextWatcher> dVar15, C20391d<String> dVar16, C20391d<? extends C46239q> dVar17, C20523m mVar, C20526p pVar7) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(kVar5, "");
        return new EditTextStickerViewState(aVar, z, dVar, pVar, nVar, dVar2, pVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, pVar3, pVar4, kVar, pVar5, kVar2, dVar12, pVar6, dVar13, kVar3, kVar4, dVar14, kVar5, kVar6, dVar15, dVar16, dVar17, mVar, pVar7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditTextStickerViewState)) {
            return false;
        }
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return C89219l.m154714a(getUi(), editTextStickerViewState.getUi()) && this.inTimeEditView == editTextStickerViewState.inTimeEditView && C89219l.m154714a(this.sticker2Top, editTextStickerViewState.sticker2Top) && C89219l.m154714a(this.dismissHitText, editTextStickerViewState.dismissHitText) && C89219l.m154714a(this.addSticker, editTextStickerViewState.addSticker) && C89219l.m154714a(this.guideListener, editTextStickerViewState.guideListener) && C89219l.m154714a(this.reloadStickerEvent, editTextStickerViewState.reloadStickerEvent) && C89219l.m154714a(this.textStickerListener, editTextStickerViewState.textStickerListener) && C89219l.m154714a(this.changeToTopListener, editTextStickerViewState.changeToTopListener) && C89219l.m154714a(this.textStickerEditListener, editTextStickerViewState.textStickerEditListener) && C89219l.m154714a(this.timeClickListener, editTextStickerViewState.timeClickListener) && C89219l.m154714a(this.readTextClickListener, editTextStickerViewState.readTextClickListener) && C89219l.m154714a(this.textStickerMob, editTextStickerViewState.textStickerMob) && C89219l.m154714a(this.targetCanvasSize, editTextStickerViewState.targetCanvasSize) && C89219l.m154714a(this.showInputView, editTextStickerViewState.showInputView) && C89219l.m154714a(this.editTextSticker, editTextStickerViewState.editTextSticker) && C89219l.m154714a(this.removeAllStickerEvent, editTextStickerViewState.removeAllStickerEvent) && C89219l.m154714a(this.updateLayoutSizeEvent, editTextStickerViewState.updateLayoutSizeEvent) && C89219l.m154714a(this.guideViewVisibility, editTextStickerViewState.guideViewVisibility) && C89219l.m154714a(this.resetGuideViewVisibilityEvent, editTextStickerViewState.resetGuideViewVisibilityEvent) && C89219l.m154714a(this.forceHideReadItemEvent, editTextStickerViewState.forceHideReadItemEvent) && C89219l.m154714a(this.goReadTextStickerScene, editTextStickerViewState.goReadTextStickerScene) && C89219l.m154714a(this.cancelNewStickerRead, editTextStickerViewState.cancelNewStickerRead) && C89219l.m154714a(this.fakeTextDataAndRead, editTextStickerViewState.fakeTextDataAndRead) && C89219l.m154714a(this.getNowStringGoToReadWithFake, editTextStickerViewState.getNowStringGoToReadWithFake) && C89219l.m154714a(this.changeTextEditPageReadIcon, editTextStickerViewState.changeTextEditPageReadIcon) && C89219l.m154714a(this.afterChangeTextAutoRead, editTextStickerViewState.afterChangeTextAutoRead) && C89219l.m154714a(this.muteReadText, editTextStickerViewState.muteReadText) && C89219l.m154714a(this.enableDirectEditEvent, editTextStickerViewState.enableDirectEditEvent) && C89219l.m154714a(this.addTextChangeListenerEvent, editTextStickerViewState.addTextChangeListenerEvent) && C89219l.m154714a(this.addTextStickerViaString, editTextStickerViewState.addTextStickerViaString) && C89219l.m154714a(this.removeTextSticker, editTextStickerViewState.removeTextSticker) && C89219l.m154714a(this.updateStickerTime, editTextStickerViewState.updateStickerTime) && C89219l.m154714a(this.removeAllTTS, editTextStickerViewState.removeAllTTS);
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
        C20391d<View.OnClickListener> dVar2 = this.guideListener;
        int hashCode5 = (hashCode4 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        C20526p pVar2 = this.reloadStickerEvent;
        int hashCode6 = (hashCode5 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        C20391d<AbstractC46119e> dVar3 = this.textStickerListener;
        int hashCode7 = (hashCode6 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31;
        C20391d<AbstractC89183m<C46239q, C46239q, C89391z>> dVar4 = this.changeToTopListener;
        int hashCode8 = (hashCode7 + (dVar4 != null ? dVar4.hashCode() : 0)) * 31;
        C20391d<AbstractC46118d> dVar5 = this.textStickerEditListener;
        int hashCode9 = (hashCode8 + (dVar5 != null ? dVar5.hashCode() : 0)) * 31;
        C20391d<AbstractC89172b<C46239q, C89391z>> dVar6 = this.timeClickListener;
        int hashCode10 = (hashCode9 + (dVar6 != null ? dVar6.hashCode() : 0)) * 31;
        C20391d<AbstractC89172b<C46239q, C89391z>> dVar7 = this.readTextClickListener;
        int hashCode11 = (hashCode10 + (dVar7 != null ? dVar7.hashCode() : 0)) * 31;
        C20391d<AbstractC45872e> dVar8 = this.textStickerMob;
        int hashCode12 = (hashCode11 + (dVar8 != null ? dVar8.hashCode() : 0)) * 31;
        C20391d<C89378p<Integer, Integer>> dVar9 = this.targetCanvasSize;
        int hashCode13 = (hashCode12 + (dVar9 != null ? dVar9.hashCode() : 0)) * 31;
        C20391d<C46239q> dVar10 = this.showInputView;
        int hashCode14 = (hashCode13 + (dVar10 != null ? dVar10.hashCode() : 0)) * 31;
        C20391d<C46239q> dVar11 = this.editTextSticker;
        int hashCode15 = (hashCode14 + (dVar11 != null ? dVar11.hashCode() : 0)) * 31;
        C20526p pVar3 = this.removeAllStickerEvent;
        int hashCode16 = (hashCode15 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        C20526p pVar4 = this.updateLayoutSizeEvent;
        int hashCode17 = (hashCode16 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        C20521k kVar = this.guideViewVisibility;
        int hashCode18 = (hashCode17 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C20526p pVar5 = this.resetGuideViewVisibilityEvent;
        int hashCode19 = (hashCode18 + (pVar5 != null ? pVar5.hashCode() : 0)) * 31;
        C20521k kVar2 = this.forceHideReadItemEvent;
        int hashCode20 = (hashCode19 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        C20391d<C46239q> dVar12 = this.goReadTextStickerScene;
        int hashCode21 = (hashCode20 + (dVar12 != null ? dVar12.hashCode() : 0)) * 31;
        C20526p pVar6 = this.cancelNewStickerRead;
        int hashCode22 = (hashCode21 + (pVar6 != null ? pVar6.hashCode() : 0)) * 31;
        C20391d<String> dVar13 = this.fakeTextDataAndRead;
        int hashCode23 = (hashCode22 + (dVar13 != null ? dVar13.hashCode() : 0)) * 31;
        C20521k kVar3 = this.getNowStringGoToReadWithFake;
        int hashCode24 = (hashCode23 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        C20521k kVar4 = this.changeTextEditPageReadIcon;
        int hashCode25 = (hashCode24 + (kVar4 != null ? kVar4.hashCode() : 0)) * 31;
        C20391d<C89378p<TextStickerData, String>> dVar14 = this.afterChangeTextAutoRead;
        int hashCode26 = (hashCode25 + (dVar14 != null ? dVar14.hashCode() : 0)) * 31;
        C20521k kVar5 = this.muteReadText;
        int hashCode27 = (hashCode26 + (kVar5 != null ? kVar5.hashCode() : 0)) * 31;
        C20521k kVar6 = this.enableDirectEditEvent;
        int hashCode28 = (hashCode27 + (kVar6 != null ? kVar6.hashCode() : 0)) * 31;
        C20391d<TextWatcher> dVar15 = this.addTextChangeListenerEvent;
        int hashCode29 = (hashCode28 + (dVar15 != null ? dVar15.hashCode() : 0)) * 31;
        C20391d<String> dVar16 = this.addTextStickerViaString;
        int hashCode30 = (hashCode29 + (dVar16 != null ? dVar16.hashCode() : 0)) * 31;
        C20391d<C46239q> dVar17 = this.removeTextSticker;
        int hashCode31 = (hashCode30 + (dVar17 != null ? dVar17.hashCode() : 0)) * 31;
        C20523m mVar = this.updateStickerTime;
        int hashCode32 = (hashCode31 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C20526p pVar7 = this.removeAllTTS;
        if (pVar7 != null) {
            i = pVar7.hashCode();
        }
        return hashCode32 + i;
    }

    public final String toString() {
        return "EditTextStickerViewState(ui=" + getUi() + ", inTimeEditView=" + this.inTimeEditView + ", sticker2Top=" + this.sticker2Top + ", dismissHitText=" + this.dismissHitText + ", addSticker=" + this.addSticker + ", guideListener=" + this.guideListener + ", reloadStickerEvent=" + this.reloadStickerEvent + ", textStickerListener=" + this.textStickerListener + ", changeToTopListener=" + this.changeToTopListener + ", textStickerEditListener=" + this.textStickerEditListener + ", timeClickListener=" + this.timeClickListener + ", readTextClickListener=" + this.readTextClickListener + ", textStickerMob=" + this.textStickerMob + ", targetCanvasSize=" + this.targetCanvasSize + ", showInputView=" + this.showInputView + ", editTextSticker=" + this.editTextSticker + ", removeAllStickerEvent=" + this.removeAllStickerEvent + ", updateLayoutSizeEvent=" + this.updateLayoutSizeEvent + ", guideViewVisibility=" + this.guideViewVisibility + ", resetGuideViewVisibilityEvent=" + this.resetGuideViewVisibilityEvent + ", forceHideReadItemEvent=" + this.forceHideReadItemEvent + ", goReadTextStickerScene=" + this.goReadTextStickerScene + ", cancelNewStickerRead=" + this.cancelNewStickerRead + ", fakeTextDataAndRead=" + this.fakeTextDataAndRead + ", getNowStringGoToReadWithFake=" + this.getNowStringGoToReadWithFake + ", changeTextEditPageReadIcon=" + this.changeTextEditPageReadIcon + ", afterChangeTextAutoRead=" + this.afterChangeTextAutoRead + ", muteReadText=" + this.muteReadText + ", enableDirectEditEvent=" + this.enableDirectEditEvent + ", addTextChangeListenerEvent=" + this.addTextChangeListenerEvent + ", addTextStickerViaString=" + this.addTextStickerViaString + ", removeTextSticker=" + this.removeTextSticker + ", updateStickerTime=" + this.updateStickerTime + ", removeAllTTS=" + this.removeAllTTS + ")";
    }

    public final C20524n<TextStickerData, Boolean> getAddSticker() {
        return this.addSticker;
    }

    public final C20391d<TextWatcher> getAddTextChangeListenerEvent() {
        return this.addTextChangeListenerEvent;
    }

    public final C20391d<String> getAddTextStickerViaString() {
        return this.addTextStickerViaString;
    }

    public final C20391d<C89378p<TextStickerData, String>> getAfterChangeTextAutoRead() {
        return this.afterChangeTextAutoRead;
    }

    public final C20526p getCancelNewStickerRead() {
        return this.cancelNewStickerRead;
    }

    public final C20521k getChangeTextEditPageReadIcon() {
        return this.changeTextEditPageReadIcon;
    }

    public final C20391d<AbstractC89183m<C46239q, C46239q, C89391z>> getChangeToTopListener() {
        return this.changeToTopListener;
    }

    public final C20526p getDismissHitText() {
        return this.dismissHitText;
    }

    public final C20391d<C46239q> getEditTextSticker() {
        return this.editTextSticker;
    }

    public final C20521k getEnableDirectEditEvent() {
        return this.enableDirectEditEvent;
    }

    public final C20391d<String> getFakeTextDataAndRead() {
        return this.fakeTextDataAndRead;
    }

    public final C20521k getForceHideReadItemEvent() {
        return this.forceHideReadItemEvent;
    }

    public final C20521k getGetNowStringGoToReadWithFake() {
        return this.getNowStringGoToReadWithFake;
    }

    public final C20391d<C46239q> getGoReadTextStickerScene() {
        return this.goReadTextStickerScene;
    }

    public final C20391d<View.OnClickListener> getGuideListener() {
        return this.guideListener;
    }

    public final C20521k getGuideViewVisibility() {
        return this.guideViewVisibility;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final C20521k getMuteReadText() {
        return this.muteReadText;
    }

    public final C20391d<AbstractC89172b<C46239q, C89391z>> getReadTextClickListener() {
        return this.readTextClickListener;
    }

    public final C20526p getReloadStickerEvent() {
        return this.reloadStickerEvent;
    }

    public final C20526p getRemoveAllStickerEvent() {
        return this.removeAllStickerEvent;
    }

    public final C20526p getRemoveAllTTS() {
        return this.removeAllTTS;
    }

    public final C20391d<C46239q> getRemoveTextSticker() {
        return this.removeTextSticker;
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
        return this.f107185ui;
    }

    public final C20526p getUpdateLayoutSizeEvent() {
        return this.updateLayoutSizeEvent;
    }

    public final C20523m getUpdateStickerTime() {
        return this.updateStickerTime;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.bytedance.jedi.arch.d<? extends android.view.View$OnClickListener> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.e> */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.bytedance.jedi.arch.d<? extends h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z>> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z>> */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z>> */
    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.d.e> */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX DEBUG: Multi-variable search result rejected for r33v0, resolved type: com.bytedance.jedi.arch.d<? extends android.text.TextWatcher> */
    /* JADX DEBUG: Multi-variable search result rejected for r35v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditTextStickerViewState(AbstractC23517a aVar, boolean z, C20391d<? extends C46239q> dVar, C20526p pVar, C20524n<TextStickerData, Boolean> nVar, C20391d<? extends View.OnClickListener> dVar2, C20526p pVar2, C20391d<? extends AbstractC46119e> dVar3, C20391d<? extends AbstractC89183m<? super C46239q, ? super C46239q, C89391z>> dVar4, C20391d<? extends AbstractC46118d> dVar5, C20391d<? extends AbstractC89172b<? super C46239q, C89391z>> dVar6, C20391d<? extends AbstractC89172b<? super C46239q, C89391z>> dVar7, C20391d<? extends AbstractC45872e> dVar8, C20391d<C89378p<Integer, Integer>> dVar9, C20391d<? extends C46239q> dVar10, C20391d<? extends C46239q> dVar11, C20526p pVar3, C20526p pVar4, C20521k kVar, C20526p pVar5, C20521k kVar2, C20391d<? extends C46239q> dVar12, C20526p pVar6, C20391d<String> dVar13, C20521k kVar3, C20521k kVar4, C20391d<C89378p<TextStickerData, String>> dVar14, C20521k kVar5, C20521k kVar6, C20391d<? extends TextWatcher> dVar15, C20391d<String> dVar16, C20391d<? extends C46239q> dVar17, C20523m mVar, C20526p pVar7) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(kVar5, "");
        this.f107185ui = aVar;
        this.inTimeEditView = z;
        this.sticker2Top = dVar;
        this.dismissHitText = pVar;
        this.addSticker = nVar;
        this.guideListener = dVar2;
        this.reloadStickerEvent = pVar2;
        this.textStickerListener = dVar3;
        this.changeToTopListener = dVar4;
        this.textStickerEditListener = dVar5;
        this.timeClickListener = dVar6;
        this.readTextClickListener = dVar7;
        this.textStickerMob = dVar8;
        this.targetCanvasSize = dVar9;
        this.showInputView = dVar10;
        this.editTextSticker = dVar11;
        this.removeAllStickerEvent = pVar3;
        this.updateLayoutSizeEvent = pVar4;
        this.guideViewVisibility = kVar;
        this.resetGuideViewVisibilityEvent = pVar5;
        this.forceHideReadItemEvent = kVar2;
        this.goReadTextStickerScene = dVar12;
        this.cancelNewStickerRead = pVar6;
        this.fakeTextDataAndRead = dVar13;
        this.getNowStringGoToReadWithFake = kVar3;
        this.changeTextEditPageReadIcon = kVar4;
        this.afterChangeTextAutoRead = dVar14;
        this.muteReadText = kVar5;
        this.enableDirectEditEvent = kVar6;
        this.addTextChangeListenerEvent = dVar15;
        this.addTextStickerViaString = dVar16;
        this.removeTextSticker = dVar17;
        this.updateStickerTime = mVar;
        this.removeAllTTS = pVar7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditTextStickerViewState(AbstractC23517a aVar, boolean z, C20391d dVar, C20526p pVar, C20524n nVar, C20391d dVar2, C20526p pVar2, C20391d dVar3, C20391d dVar4, C20391d dVar5, C20391d dVar6, C20391d dVar7, C20391d dVar8, C20391d dVar9, C20391d dVar10, C20391d dVar11, C20526p pVar3, C20526p pVar4, C20521k kVar, C20526p pVar5, C20521k kVar2, C20391d dVar12, C20526p pVar6, C20391d dVar13, C20521k kVar3, C20521k kVar4, C20391d dVar14, C20521k kVar5, C20521k kVar6, C20391d dVar15, C20391d dVar16, C20391d dVar17, C20523m mVar, C20526p pVar7, int i, int i2, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : pVar, (i & 16) != 0 ? null : nVar, (i & 32) != 0 ? null : dVar2, (i & 64) != 0 ? null : pVar2, (i & 128) != 0 ? null : dVar3, (i & 256) != 0 ? null : dVar4, (i & 512) != 0 ? null : dVar5, (i & 1024) != 0 ? null : dVar6, (i & 2048) != 0 ? null : dVar7, (i & 4096) != 0 ? null : dVar8, (i & 8192) != 0 ? null : dVar9, (i & 16384) != 0 ? null : dVar10, (32768 & i) != 0 ? null : dVar11, (65536 & i) != 0 ? null : pVar3, (131072 & i) != 0 ? null : pVar4, (262144 & i) != 0 ? null : kVar, (524288 & i) != 0 ? null : pVar5, (1048576 & i) != 0 ? null : kVar2, (2097152 & i) != 0 ? null : dVar12, (4194304 & i) != 0 ? null : pVar6, (8388608 & i) != 0 ? null : dVar13, (16777216 & i) != 0 ? null : kVar3, (33554432 & i) != 0 ? null : kVar4, (67108864 & i) != 0 ? null : dVar14, (134217728 & i) != 0 ? new C20521k(false) : kVar5, (268435456 & i) != 0 ? null : kVar6, (536870912 & i) != 0 ? null : dVar15, (1073741824 & i) != 0 ? null : dVar16, (i & Integer.MIN_VALUE) != 0 ? null : dVar17, (i2 & 1) != 0 ? null : mVar, (i2 & 2) != 0 ? null : pVar7);
    }
}
