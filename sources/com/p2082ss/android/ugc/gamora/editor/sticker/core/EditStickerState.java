package com.p2082ss.android.ugc.gamora.editor.sticker.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20525o;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerState */
public final class EditStickerState extends UiState {
    public static final C82582a Companion = new C82582a((byte) 0);
    private final C20525o<Float, Float, Float> captionLayoutEvent;
    private final C20525o<Float, Float, Float> commentStickerLayoutEvent;
    private final C20521k enableDirectEditEvent;
    private final C20523m hideAllHelpBoxEvent;
    private final C20525o<Float, Float, Float> liveCDLayoutEvent;
    private final C20521k onEditClipChangedEvent;
    private final C20524n<Effect, String> onStickerChoose;
    private final C20526p onStickerDismiss;
    private final C20526p onStickerShow;
    private final C20524n<Float, Long> pollTextAnimEvent;
    private final C20525o<Float, Float, Float> pollTextLayoutEvent;
    private final Integer pollingTopMargin;
    private final C20526p refreshVideoSource;
    private final C20526p removeAllTTS;
    private final C20523m removeStickerByTypeEvent;
    private final C20526p showTextSticker;
    private final C20525o<Boolean, Boolean, AbstractC89171a<C89391z>> stickerCompileEvent;

    /* renamed from: ui */
    private final AbstractC23517a f184681ui;
    private final C20524n<Integer, Boolean> updateStickerTime;
    private final C20524n<Integer, Integer> videoLengthUpdateEvent;
    private final C20521k viewRenderStickerVisibleEvent;

    static {
        Covode.recordClassIndex(96427);
    }

    public EditStickerState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public static /* synthetic */ EditStickerState copy$default(EditStickerState editStickerState, AbstractC23517a aVar, Integer num, C20524n nVar, C20525o oVar, C20525o oVar2, C20525o oVar3, C20525o oVar4, C20523m mVar, C20523m mVar2, C20526p pVar, C20524n nVar2, C20526p pVar2, C20526p pVar3, C20521k kVar, C20521k kVar2, C20525o oVar5, C20521k kVar3, C20524n nVar3, C20526p pVar4, C20524n nVar4, C20526p pVar5, int i, Object obj) {
        AbstractC23517a aVar2 = aVar;
        C20525o<Float, Float, Float> oVar6 = oVar3;
        Integer num2 = num;
        C20524n<Float, Long> nVar5 = nVar;
        C20525o<Float, Float, Float> oVar7 = oVar;
        C20525o<Float, Float, Float> oVar8 = oVar2;
        C20521k kVar4 = kVar;
        C20526p pVar6 = pVar3;
        C20526p pVar7 = pVar2;
        C20524n nVar6 = nVar2;
        C20525o<Float, Float, Float> oVar9 = oVar4;
        C20523m mVar3 = mVar;
        C20523m mVar4 = mVar2;
        C20526p pVar8 = pVar;
        C20524n nVar7 = nVar4;
        C20526p pVar9 = pVar4;
        C20521k kVar5 = kVar2;
        C20525o oVar10 = oVar5;
        C20521k kVar6 = kVar3;
        C20526p pVar10 = pVar5;
        C20524n nVar8 = nVar3;
        if ((i & 1) != 0) {
            aVar2 = editStickerState.getUi();
        }
        if ((i & 2) != 0) {
            num2 = editStickerState.pollingTopMargin;
        }
        if ((i & 4) != 0) {
            nVar5 = editStickerState.pollTextAnimEvent;
        }
        if ((i & 8) != 0) {
            oVar7 = editStickerState.pollTextLayoutEvent;
        }
        if ((i & 16) != 0) {
            oVar8 = editStickerState.liveCDLayoutEvent;
        }
        if ((i & 32) != 0) {
            oVar6 = editStickerState.commentStickerLayoutEvent;
        }
        if ((i & 64) != 0) {
            oVar9 = editStickerState.captionLayoutEvent;
        }
        if ((i & 128) != 0) {
            mVar3 = editStickerState.hideAllHelpBoxEvent;
        }
        if ((i & 256) != 0) {
            mVar4 = editStickerState.removeStickerByTypeEvent;
        }
        if ((i & 512) != 0) {
            pVar8 = editStickerState.showTextSticker;
        }
        if ((i & 1024) != 0) {
            nVar6 = editStickerState.onStickerChoose;
        }
        if ((i & 2048) != 0) {
            pVar7 = editStickerState.onStickerShow;
        }
        if ((i & 4096) != 0) {
            pVar6 = editStickerState.onStickerDismiss;
        }
        if ((i & 8192) != 0) {
            kVar4 = editStickerState.onEditClipChangedEvent;
        }
        if ((i & 16384) != 0) {
            kVar5 = editStickerState.enableDirectEditEvent;
        }
        if ((32768 & i) != 0) {
            oVar10 = editStickerState.stickerCompileEvent;
        }
        if ((65536 & i) != 0) {
            kVar6 = editStickerState.viewRenderStickerVisibleEvent;
        }
        if ((131072 & i) != 0) {
            nVar8 = editStickerState.videoLengthUpdateEvent;
        }
        if ((262144 & i) != 0) {
            pVar9 = editStickerState.refreshVideoSource;
        }
        if ((524288 & i) != 0) {
            nVar7 = editStickerState.updateStickerTime;
        }
        if ((i & 1048576) != 0) {
            pVar10 = editStickerState.removeAllTTS;
        }
        return editStickerState.copy(aVar2, num2, nVar5, oVar7, oVar8, oVar6, oVar9, mVar3, mVar4, pVar8, nVar6, pVar7, pVar6, kVar4, kVar5, oVar10, kVar6, nVar8, pVar9, nVar7, pVar10);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final C20526p component10() {
        return this.showTextSticker;
    }

    public final C20524n<Effect, String> component11() {
        return this.onStickerChoose;
    }

    public final C20526p component12() {
        return this.onStickerShow;
    }

    public final C20526p component13() {
        return this.onStickerDismiss;
    }

    public final C20521k component14() {
        return this.onEditClipChangedEvent;
    }

    public final C20521k component15() {
        return this.enableDirectEditEvent;
    }

    public final C20525o<Boolean, Boolean, AbstractC89171a<C89391z>> component16() {
        return this.stickerCompileEvent;
    }

    public final C20521k component17() {
        return this.viewRenderStickerVisibleEvent;
    }

    public final C20524n<Integer, Integer> component18() {
        return this.videoLengthUpdateEvent;
    }

    public final C20526p component19() {
        return this.refreshVideoSource;
    }

    public final Integer component2() {
        return this.pollingTopMargin;
    }

    public final C20524n<Integer, Boolean> component20() {
        return this.updateStickerTime;
    }

    public final C20526p component21() {
        return this.removeAllTTS;
    }

    public final C20524n<Float, Long> component3() {
        return this.pollTextAnimEvent;
    }

    public final C20525o<Float, Float, Float> component4() {
        return this.pollTextLayoutEvent;
    }

    public final C20525o<Float, Float, Float> component5() {
        return this.liveCDLayoutEvent;
    }

    public final C20525o<Float, Float, Float> component6() {
        return this.commentStickerLayoutEvent;
    }

    public final C20525o<Float, Float, Float> component7() {
        return this.captionLayoutEvent;
    }

    public final C20523m component8() {
        return this.hideAllHelpBoxEvent;
    }

    public final C20523m component9() {
        return this.removeStickerByTypeEvent;
    }

    public final EditStickerState copy(AbstractC23517a aVar, Integer num, C20524n<Float, Long> nVar, C20525o<Float, Float, Float> oVar, C20525o<Float, Float, Float> oVar2, C20525o<Float, Float, Float> oVar3, C20525o<Float, Float, Float> oVar4, C20523m mVar, C20523m mVar2, C20526p pVar, C20524n<Effect, String> nVar2, C20526p pVar2, C20526p pVar3, C20521k kVar, C20521k kVar2, C20525o<Boolean, Boolean, AbstractC89171a<C89391z>> oVar5, C20521k kVar3, C20524n<Integer, Integer> nVar3, C20526p pVar4, C20524n<Integer, Boolean> nVar4, C20526p pVar5) {
        C89219l.m154721d(aVar, "");
        return new EditStickerState(aVar, num, nVar, oVar, oVar2, oVar3, oVar4, mVar, mVar2, pVar, nVar2, pVar2, pVar3, kVar, kVar2, oVar5, kVar3, nVar3, pVar4, nVar4, pVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditStickerState)) {
            return false;
        }
        EditStickerState editStickerState = (EditStickerState) obj;
        return C89219l.m154714a(getUi(), editStickerState.getUi()) && C89219l.m154714a(this.pollingTopMargin, editStickerState.pollingTopMargin) && C89219l.m154714a(this.pollTextAnimEvent, editStickerState.pollTextAnimEvent) && C89219l.m154714a(this.pollTextLayoutEvent, editStickerState.pollTextLayoutEvent) && C89219l.m154714a(this.liveCDLayoutEvent, editStickerState.liveCDLayoutEvent) && C89219l.m154714a(this.commentStickerLayoutEvent, editStickerState.commentStickerLayoutEvent) && C89219l.m154714a(this.captionLayoutEvent, editStickerState.captionLayoutEvent) && C89219l.m154714a(this.hideAllHelpBoxEvent, editStickerState.hideAllHelpBoxEvent) && C89219l.m154714a(this.removeStickerByTypeEvent, editStickerState.removeStickerByTypeEvent) && C89219l.m154714a(this.showTextSticker, editStickerState.showTextSticker) && C89219l.m154714a(this.onStickerChoose, editStickerState.onStickerChoose) && C89219l.m154714a(this.onStickerShow, editStickerState.onStickerShow) && C89219l.m154714a(this.onStickerDismiss, editStickerState.onStickerDismiss) && C89219l.m154714a(this.onEditClipChangedEvent, editStickerState.onEditClipChangedEvent) && C89219l.m154714a(this.enableDirectEditEvent, editStickerState.enableDirectEditEvent) && C89219l.m154714a(this.stickerCompileEvent, editStickerState.stickerCompileEvent) && C89219l.m154714a(this.viewRenderStickerVisibleEvent, editStickerState.viewRenderStickerVisibleEvent) && C89219l.m154714a(this.videoLengthUpdateEvent, editStickerState.videoLengthUpdateEvent) && C89219l.m154714a(this.refreshVideoSource, editStickerState.refreshVideoSource) && C89219l.m154714a(this.updateStickerTime, editStickerState.updateStickerTime) && C89219l.m154714a(this.removeAllTTS, editStickerState.removeAllTTS);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        Integer num = this.pollingTopMargin;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        C20524n<Float, Long> nVar = this.pollTextAnimEvent;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C20525o<Float, Float, Float> oVar = this.pollTextLayoutEvent;
        int hashCode4 = (hashCode3 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        C20525o<Float, Float, Float> oVar2 = this.liveCDLayoutEvent;
        int hashCode5 = (hashCode4 + (oVar2 != null ? oVar2.hashCode() : 0)) * 31;
        C20525o<Float, Float, Float> oVar3 = this.commentStickerLayoutEvent;
        int hashCode6 = (hashCode5 + (oVar3 != null ? oVar3.hashCode() : 0)) * 31;
        C20525o<Float, Float, Float> oVar4 = this.captionLayoutEvent;
        int hashCode7 = (hashCode6 + (oVar4 != null ? oVar4.hashCode() : 0)) * 31;
        C20523m mVar = this.hideAllHelpBoxEvent;
        int hashCode8 = (hashCode7 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C20523m mVar2 = this.removeStickerByTypeEvent;
        int hashCode9 = (hashCode8 + (mVar2 != null ? mVar2.hashCode() : 0)) * 31;
        C20526p pVar = this.showTextSticker;
        int hashCode10 = (hashCode9 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C20524n<Effect, String> nVar2 = this.onStickerChoose;
        int hashCode11 = (hashCode10 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        C20526p pVar2 = this.onStickerShow;
        int hashCode12 = (hashCode11 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        C20526p pVar3 = this.onStickerDismiss;
        int hashCode13 = (hashCode12 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        C20521k kVar = this.onEditClipChangedEvent;
        int hashCode14 = (hashCode13 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C20521k kVar2 = this.enableDirectEditEvent;
        int hashCode15 = (hashCode14 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        C20525o<Boolean, Boolean, AbstractC89171a<C89391z>> oVar5 = this.stickerCompileEvent;
        int hashCode16 = (hashCode15 + (oVar5 != null ? oVar5.hashCode() : 0)) * 31;
        C20521k kVar3 = this.viewRenderStickerVisibleEvent;
        int hashCode17 = (hashCode16 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        C20524n<Integer, Integer> nVar3 = this.videoLengthUpdateEvent;
        int hashCode18 = (hashCode17 + (nVar3 != null ? nVar3.hashCode() : 0)) * 31;
        C20526p pVar4 = this.refreshVideoSource;
        int hashCode19 = (hashCode18 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        C20524n<Integer, Boolean> nVar4 = this.updateStickerTime;
        int hashCode20 = (hashCode19 + (nVar4 != null ? nVar4.hashCode() : 0)) * 31;
        C20526p pVar5 = this.removeAllTTS;
        if (pVar5 != null) {
            i = pVar5.hashCode();
        }
        return hashCode20 + i;
    }

    public final String toString() {
        return "EditStickerState(ui=" + getUi() + ", pollingTopMargin=" + this.pollingTopMargin + ", pollTextAnimEvent=" + this.pollTextAnimEvent + ", pollTextLayoutEvent=" + this.pollTextLayoutEvent + ", liveCDLayoutEvent=" + this.liveCDLayoutEvent + ", commentStickerLayoutEvent=" + this.commentStickerLayoutEvent + ", captionLayoutEvent=" + this.captionLayoutEvent + ", hideAllHelpBoxEvent=" + this.hideAllHelpBoxEvent + ", removeStickerByTypeEvent=" + this.removeStickerByTypeEvent + ", showTextSticker=" + this.showTextSticker + ", onStickerChoose=" + this.onStickerChoose + ", onStickerShow=" + this.onStickerShow + ", onStickerDismiss=" + this.onStickerDismiss + ", onEditClipChangedEvent=" + this.onEditClipChangedEvent + ", enableDirectEditEvent=" + this.enableDirectEditEvent + ", stickerCompileEvent=" + this.stickerCompileEvent + ", viewRenderStickerVisibleEvent=" + this.viewRenderStickerVisibleEvent + ", videoLengthUpdateEvent=" + this.videoLengthUpdateEvent + ", refreshVideoSource=" + this.refreshVideoSource + ", updateStickerTime=" + this.updateStickerTime + ", removeAllTTS=" + this.removeAllTTS + ")";
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerState$a */
    public static final class C82582a {
        static {
            Covode.recordClassIndex(96428);
        }

        private C82582a() {
        }

        public /* synthetic */ C82582a(byte b) {
            this();
        }
    }

    public final C20525o<Float, Float, Float> getCaptionLayoutEvent() {
        return this.captionLayoutEvent;
    }

    public final C20525o<Float, Float, Float> getCommentStickerLayoutEvent() {
        return this.commentStickerLayoutEvent;
    }

    public final C20521k getEnableDirectEditEvent() {
        return this.enableDirectEditEvent;
    }

    public final C20523m getHideAllHelpBoxEvent() {
        return this.hideAllHelpBoxEvent;
    }

    public final C20525o<Float, Float, Float> getLiveCDLayoutEvent() {
        return this.liveCDLayoutEvent;
    }

    public final C20521k getOnEditClipChangedEvent() {
        return this.onEditClipChangedEvent;
    }

    public final C20524n<Effect, String> getOnStickerChoose() {
        return this.onStickerChoose;
    }

    public final C20526p getOnStickerDismiss() {
        return this.onStickerDismiss;
    }

    public final C20526p getOnStickerShow() {
        return this.onStickerShow;
    }

    public final C20524n<Float, Long> getPollTextAnimEvent() {
        return this.pollTextAnimEvent;
    }

    public final C20525o<Float, Float, Float> getPollTextLayoutEvent() {
        return this.pollTextLayoutEvent;
    }

    public final Integer getPollingTopMargin() {
        return this.pollingTopMargin;
    }

    public final C20526p getRefreshVideoSource() {
        return this.refreshVideoSource;
    }

    public final C20526p getRemoveAllTTS() {
        return this.removeAllTTS;
    }

    public final C20523m getRemoveStickerByTypeEvent() {
        return this.removeStickerByTypeEvent;
    }

    public final C20526p getShowTextSticker() {
        return this.showTextSticker;
    }

    public final C20525o<Boolean, Boolean, AbstractC89171a<C89391z>> getStickerCompileEvent() {
        return this.stickerCompileEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f184681ui;
    }

    public final C20524n<Integer, Boolean> getUpdateStickerTime() {
        return this.updateStickerTime;
    }

    public final C20524n<Integer, Integer> getVideoLengthUpdateEvent() {
        return this.videoLengthUpdateEvent;
    }

    public final C20521k getViewRenderStickerVisibleEvent() {
        return this.viewRenderStickerVisibleEvent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditStickerState(AbstractC23517a aVar, Integer num, C20524n<Float, Long> nVar, C20525o<Float, Float, Float> oVar, C20525o<Float, Float, Float> oVar2, C20525o<Float, Float, Float> oVar3, C20525o<Float, Float, Float> oVar4, C20523m mVar, C20523m mVar2, C20526p pVar, C20524n<Effect, String> nVar2, C20526p pVar2, C20526p pVar3, C20521k kVar, C20521k kVar2, C20525o<Boolean, Boolean, AbstractC89171a<C89391z>> oVar5, C20521k kVar3, C20524n<Integer, Integer> nVar3, C20526p pVar4, C20524n<Integer, Boolean> nVar4, C20526p pVar5) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f184681ui = aVar;
        this.pollingTopMargin = num;
        this.pollTextAnimEvent = nVar;
        this.pollTextLayoutEvent = oVar;
        this.liveCDLayoutEvent = oVar2;
        this.commentStickerLayoutEvent = oVar3;
        this.captionLayoutEvent = oVar4;
        this.hideAllHelpBoxEvent = mVar;
        this.removeStickerByTypeEvent = mVar2;
        this.showTextSticker = pVar;
        this.onStickerChoose = nVar2;
        this.onStickerShow = pVar2;
        this.onStickerDismiss = pVar3;
        this.onEditClipChangedEvent = kVar;
        this.enableDirectEditEvent = kVar2;
        this.stickerCompileEvent = oVar5;
        this.viewRenderStickerVisibleEvent = kVar3;
        this.videoLengthUpdateEvent = nVar3;
        this.refreshVideoSource = pVar4;
        this.updateStickerTime = nVar4;
        this.removeAllTTS = pVar5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditStickerState(AbstractC23517a aVar, Integer num, C20524n nVar, C20525o oVar, C20525o oVar2, C20525o oVar3, C20525o oVar4, C20523m mVar, C20523m mVar2, C20526p pVar, C20524n nVar2, C20526p pVar2, C20526p pVar3, C20521k kVar, C20521k kVar2, C20525o oVar5, C20521k kVar3, C20524n nVar3, C20526p pVar4, C20524n nVar4, C20526p pVar5, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : nVar, (i & 8) != 0 ? null : oVar, (i & 16) != 0 ? null : oVar2, (i & 32) != 0 ? null : oVar3, (i & 64) != 0 ? null : oVar4, (i & 128) != 0 ? null : mVar, (i & 256) != 0 ? null : mVar2, (i & 512) != 0 ? null : pVar, (i & 1024) != 0 ? null : nVar2, (i & 2048) != 0 ? null : pVar2, (i & 4096) != 0 ? null : pVar3, (i & 8192) != 0 ? null : kVar, (i & 16384) != 0 ? null : kVar2, (32768 & i) != 0 ? null : oVar5, (65536 & i) != 0 ? null : kVar3, (131072 & i) != 0 ? null : nVar3, (262144 & i) != 0 ? null : pVar4, (524288 & i) != 0 ? null : nVar4, (i & 1048576) != 0 ? null : pVar5);
    }
}
