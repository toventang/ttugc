package com.p2082ss.android.ugc.aweme.infoSticker.customsticker;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api.C56713a;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerState */
public final class EditPreviewStickerState implements AbstractC20368af {
    private final C20526p cancel;
    private final C20524n<Integer, Integer> compressBitmapEvent;
    private final CutoutData cutoutData;
    private final C56713a cutoutError;
    private final C20526p finishCutoutSticker;
    private final MediaModel mediaModel;
    private final C20526p selectImage;
    private final C20526p startCutoutSticker;
    private final C20526p useSticker;

    static {
        Covode.recordClassIndex(66510);
    }

    public EditPreviewStickerState() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditPreviewStickerState copy$default(EditPreviewStickerState editPreviewStickerState, C20526p pVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, MediaModel mediaModel2, C56713a aVar, C20526p pVar5, CutoutData cutoutData2, C20524n nVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = editPreviewStickerState.selectImage;
        }
        if ((i & 2) != 0) {
            pVar2 = editPreviewStickerState.useSticker;
        }
        if ((i & 4) != 0) {
            pVar3 = editPreviewStickerState.startCutoutSticker;
        }
        if ((i & 8) != 0) {
            pVar4 = editPreviewStickerState.finishCutoutSticker;
        }
        if ((i & 16) != 0) {
            mediaModel2 = editPreviewStickerState.mediaModel;
        }
        if ((i & 32) != 0) {
            aVar = editPreviewStickerState.cutoutError;
        }
        if ((i & 64) != 0) {
            pVar5 = editPreviewStickerState.cancel;
        }
        if ((i & 128) != 0) {
            cutoutData2 = editPreviewStickerState.cutoutData;
        }
        if ((i & 256) != 0) {
            nVar = editPreviewStickerState.compressBitmapEvent;
        }
        return editPreviewStickerState.copy(pVar, pVar2, pVar3, pVar4, mediaModel2, aVar, pVar5, cutoutData2, nVar);
    }

    public final C20526p component1() {
        return this.selectImage;
    }

    public final C20526p component2() {
        return this.useSticker;
    }

    public final C20526p component3() {
        return this.startCutoutSticker;
    }

    public final C20526p component4() {
        return this.finishCutoutSticker;
    }

    public final MediaModel component5() {
        return this.mediaModel;
    }

    public final C56713a component6() {
        return this.cutoutError;
    }

    public final C20526p component7() {
        return this.cancel;
    }

    public final CutoutData component8() {
        return this.cutoutData;
    }

    public final C20524n<Integer, Integer> component9() {
        return this.compressBitmapEvent;
    }

    public final EditPreviewStickerState copy(C20526p pVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, MediaModel mediaModel2, C56713a aVar, C20526p pVar5, CutoutData cutoutData2, C20524n<Integer, Integer> nVar) {
        return new EditPreviewStickerState(pVar, pVar2, pVar3, pVar4, mediaModel2, aVar, pVar5, cutoutData2, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPreviewStickerState)) {
            return false;
        }
        EditPreviewStickerState editPreviewStickerState = (EditPreviewStickerState) obj;
        return C89219l.m154714a(this.selectImage, editPreviewStickerState.selectImage) && C89219l.m154714a(this.useSticker, editPreviewStickerState.useSticker) && C89219l.m154714a(this.startCutoutSticker, editPreviewStickerState.startCutoutSticker) && C89219l.m154714a(this.finishCutoutSticker, editPreviewStickerState.finishCutoutSticker) && C89219l.m154714a(this.mediaModel, editPreviewStickerState.mediaModel) && C89219l.m154714a(this.cutoutError, editPreviewStickerState.cutoutError) && C89219l.m154714a(this.cancel, editPreviewStickerState.cancel) && C89219l.m154714a(this.cutoutData, editPreviewStickerState.cutoutData) && C89219l.m154714a(this.compressBitmapEvent, editPreviewStickerState.compressBitmapEvent);
    }

    public final int hashCode() {
        C20526p pVar = this.selectImage;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        C20526p pVar2 = this.useSticker;
        int hashCode2 = (hashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        C20526p pVar3 = this.startCutoutSticker;
        int hashCode3 = (hashCode2 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        C20526p pVar4 = this.finishCutoutSticker;
        int hashCode4 = (hashCode3 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        MediaModel mediaModel2 = this.mediaModel;
        int hashCode5 = (hashCode4 + (mediaModel2 != null ? mediaModel2.hashCode() : 0)) * 31;
        C56713a aVar = this.cutoutError;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C20526p pVar5 = this.cancel;
        int hashCode7 = (hashCode6 + (pVar5 != null ? pVar5.hashCode() : 0)) * 31;
        CutoutData cutoutData2 = this.cutoutData;
        int hashCode8 = (hashCode7 + (cutoutData2 != null ? cutoutData2.hashCode() : 0)) * 31;
        C20524n<Integer, Integer> nVar = this.compressBitmapEvent;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "EditPreviewStickerState(selectImage=" + this.selectImage + ", useSticker=" + this.useSticker + ", startCutoutSticker=" + this.startCutoutSticker + ", finishCutoutSticker=" + this.finishCutoutSticker + ", mediaModel=" + this.mediaModel + ", cutoutError=" + this.cutoutError + ", cancel=" + this.cancel + ", cutoutData=" + this.cutoutData + ", compressBitmapEvent=" + this.compressBitmapEvent + ")";
    }

    public final C20526p getCancel() {
        return this.cancel;
    }

    public final C20524n<Integer, Integer> getCompressBitmapEvent() {
        return this.compressBitmapEvent;
    }

    public final CutoutData getCutoutData() {
        return this.cutoutData;
    }

    public final C56713a getCutoutError() {
        return this.cutoutError;
    }

    public final C20526p getFinishCutoutSticker() {
        return this.finishCutoutSticker;
    }

    public final MediaModel getMediaModel() {
        return this.mediaModel;
    }

    public final C20526p getSelectImage() {
        return this.selectImage;
    }

    public final C20526p getStartCutoutSticker() {
        return this.startCutoutSticker;
    }

    public final C20526p getUseSticker() {
        return this.useSticker;
    }

    public EditPreviewStickerState(C20526p pVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, MediaModel mediaModel2, C56713a aVar, C20526p pVar5, CutoutData cutoutData2, C20524n<Integer, Integer> nVar) {
        this.selectImage = pVar;
        this.useSticker = pVar2;
        this.startCutoutSticker = pVar3;
        this.finishCutoutSticker = pVar4;
        this.mediaModel = mediaModel2;
        this.cutoutError = aVar;
        this.cancel = pVar5;
        this.cutoutData = cutoutData2;
        this.compressBitmapEvent = nVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditPreviewStickerState(C20526p pVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, MediaModel mediaModel2, C56713a aVar, C20526p pVar5, CutoutData cutoutData2, C20524n nVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : pVar2, (i & 4) != 0 ? null : pVar3, (i & 8) != 0 ? null : pVar4, (i & 16) != 0 ? null : mediaModel2, (i & 32) != 0 ? null : aVar, (i & 64) != 0 ? null : pVar5, (i & 128) != 0 ? null : cutoutData2, (i & 256) == 0 ? nVar : null);
    }
}
