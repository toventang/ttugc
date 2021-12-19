package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState */
public final class ChooseMediaState implements AbstractC20368af {
    private final C72059ad allMediaList;
    private final ClosingChooseMediaPageState closingChooseMediaPageState;
    private final boolean isChangeMusicDownloadSuccess;
    private final PreMusicState lastPreMusicState;
    private final MediaListState mediaListState;
    private final OpeningChooseMediaPageState openingChooseMediaPageState;
    private final C72059ad photoMediaList;
    private final PreMusicState preChangeMusicState;
    private final PreMusicState preMusicState;
    private final MediaState previewDockerAddMediaState;
    private final MediaState previewDockerDelMediaState;
    private final MediaListState previewDockerInitMediaList;
    private final MediaState previewMediaState;
    private final C20526p previewNextBtnClickState;
    private final MediaState previewNextBtnMediaState;
    private final String previewNextBtnState;
    private final PreviewSwapState previewSwapState;
    private final MediaState selectMediaState;
    private final MediaState unSelectMediaState;
    private final C72059ad videoMediaList;

    static {
        Covode.recordClassIndex(84647);
    }

    public ChooseMediaState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 1048575, null);
    }

    public static /* synthetic */ ChooseMediaState copy$default(ChooseMediaState chooseMediaState, MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3, PreMusicState preMusicState2, PreMusicState preMusicState3, PreMusicState preMusicState4, OpeningChooseMediaPageState openingChooseMediaPageState2, ClosingChooseMediaPageState closingChooseMediaPageState2, C72059ad adVar, C72059ad adVar2, C72059ad adVar3, boolean z, MediaListState mediaListState3, PreviewSwapState previewSwapState2, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, C20526p pVar, String str, int i, Object obj) {
        PreMusicState preMusicState5 = preMusicState4;
        PreMusicState preMusicState6 = preMusicState3;
        PreMusicState preMusicState7 = preMusicState2;
        MediaListState mediaListState4 = mediaListState2;
        MediaState mediaState7 = mediaState;
        MediaState mediaState8 = mediaState2;
        MediaState mediaState9 = mediaState3;
        MediaListState mediaListState5 = mediaListState3;
        boolean z2 = z;
        C72059ad adVar4 = adVar3;
        OpeningChooseMediaPageState openingChooseMediaPageState3 = openingChooseMediaPageState2;
        ClosingChooseMediaPageState closingChooseMediaPageState3 = closingChooseMediaPageState2;
        C72059ad adVar5 = adVar;
        C72059ad adVar6 = adVar2;
        C20526p pVar2 = pVar;
        PreviewSwapState previewSwapState3 = previewSwapState2;
        MediaState mediaState10 = mediaState4;
        String str2 = str;
        MediaState mediaState11 = mediaState5;
        MediaState mediaState12 = mediaState6;
        if ((i & 1) != 0) {
            mediaListState4 = chooseMediaState.mediaListState;
        }
        if ((i & 2) != 0) {
            mediaState7 = chooseMediaState.selectMediaState;
        }
        if ((i & 4) != 0) {
            mediaState8 = chooseMediaState.unSelectMediaState;
        }
        if ((i & 8) != 0) {
            mediaState9 = chooseMediaState.previewMediaState;
        }
        if ((i & 16) != 0) {
            preMusicState7 = chooseMediaState.preMusicState;
        }
        if ((i & 32) != 0) {
            preMusicState6 = chooseMediaState.preChangeMusicState;
        }
        if ((i & 64) != 0) {
            preMusicState5 = chooseMediaState.lastPreMusicState;
        }
        if ((i & 128) != 0) {
            openingChooseMediaPageState3 = chooseMediaState.openingChooseMediaPageState;
        }
        if ((i & 256) != 0) {
            closingChooseMediaPageState3 = chooseMediaState.closingChooseMediaPageState;
        }
        if ((i & 512) != 0) {
            adVar5 = chooseMediaState.allMediaList;
        }
        if ((i & 1024) != 0) {
            adVar6 = chooseMediaState.photoMediaList;
        }
        if ((i & 2048) != 0) {
            adVar4 = chooseMediaState.videoMediaList;
        }
        if ((i & 4096) != 0) {
            z2 = chooseMediaState.isChangeMusicDownloadSuccess;
        }
        if ((i & 8192) != 0) {
            mediaListState5 = chooseMediaState.previewDockerInitMediaList;
        }
        if ((i & 16384) != 0) {
            previewSwapState3 = chooseMediaState.previewSwapState;
        }
        if ((32768 & i) != 0) {
            mediaState10 = chooseMediaState.previewDockerDelMediaState;
        }
        if ((65536 & i) != 0) {
            mediaState11 = chooseMediaState.previewDockerAddMediaState;
        }
        if ((131072 & i) != 0) {
            mediaState12 = chooseMediaState.previewNextBtnMediaState;
        }
        if ((262144 & i) != 0) {
            pVar2 = chooseMediaState.previewNextBtnClickState;
        }
        if ((i & 524288) != 0) {
            str2 = chooseMediaState.previewNextBtnState;
        }
        return chooseMediaState.copy(mediaListState4, mediaState7, mediaState8, mediaState9, preMusicState7, preMusicState6, preMusicState5, openingChooseMediaPageState3, closingChooseMediaPageState3, adVar5, adVar6, adVar4, z2, mediaListState5, previewSwapState3, mediaState10, mediaState11, mediaState12, pVar2, str2);
    }

    public final MediaListState component1() {
        return this.mediaListState;
    }

    public final C72059ad component10() {
        return this.allMediaList;
    }

    public final C72059ad component11() {
        return this.photoMediaList;
    }

    public final C72059ad component12() {
        return this.videoMediaList;
    }

    public final boolean component13() {
        return this.isChangeMusicDownloadSuccess;
    }

    public final MediaListState component14() {
        return this.previewDockerInitMediaList;
    }

    public final PreviewSwapState component15() {
        return this.previewSwapState;
    }

    public final MediaState component16() {
        return this.previewDockerDelMediaState;
    }

    public final MediaState component17() {
        return this.previewDockerAddMediaState;
    }

    public final MediaState component18() {
        return this.previewNextBtnMediaState;
    }

    public final C20526p component19() {
        return this.previewNextBtnClickState;
    }

    public final MediaState component2() {
        return this.selectMediaState;
    }

    public final String component20() {
        return this.previewNextBtnState;
    }

    public final MediaState component3() {
        return this.unSelectMediaState;
    }

    public final MediaState component4() {
        return this.previewMediaState;
    }

    public final PreMusicState component5() {
        return this.preMusicState;
    }

    public final PreMusicState component6() {
        return this.preChangeMusicState;
    }

    public final PreMusicState component7() {
        return this.lastPreMusicState;
    }

    public final OpeningChooseMediaPageState component8() {
        return this.openingChooseMediaPageState;
    }

    public final ClosingChooseMediaPageState component9() {
        return this.closingChooseMediaPageState;
    }

    public final ChooseMediaState copy(MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3, PreMusicState preMusicState2, PreMusicState preMusicState3, PreMusicState preMusicState4, OpeningChooseMediaPageState openingChooseMediaPageState2, ClosingChooseMediaPageState closingChooseMediaPageState2, C72059ad adVar, C72059ad adVar2, C72059ad adVar3, boolean z, MediaListState mediaListState3, PreviewSwapState previewSwapState2, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, C20526p pVar, String str) {
        C89219l.m154721d(mediaListState2, "");
        C89219l.m154721d(mediaState, "");
        C89219l.m154721d(mediaState2, "");
        C89219l.m154721d(mediaState3, "");
        C89219l.m154721d(preMusicState2, "");
        C89219l.m154721d(preMusicState3, "");
        C89219l.m154721d(preMusicState4, "");
        C89219l.m154721d(openingChooseMediaPageState2, "");
        C89219l.m154721d(adVar, "");
        C89219l.m154721d(adVar2, "");
        C89219l.m154721d(adVar3, "");
        C89219l.m154721d(mediaListState3, "");
        C89219l.m154721d(previewSwapState2, "");
        C89219l.m154721d(mediaState4, "");
        C89219l.m154721d(mediaState5, "");
        C89219l.m154721d(mediaState6, "");
        return new ChooseMediaState(mediaListState2, mediaState, mediaState2, mediaState3, preMusicState2, preMusicState3, preMusicState4, openingChooseMediaPageState2, closingChooseMediaPageState2, adVar, adVar2, adVar3, z, mediaListState3, previewSwapState2, mediaState4, mediaState5, mediaState6, pVar, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooseMediaState)) {
            return false;
        }
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return C89219l.m154714a(this.mediaListState, chooseMediaState.mediaListState) && C89219l.m154714a(this.selectMediaState, chooseMediaState.selectMediaState) && C89219l.m154714a(this.unSelectMediaState, chooseMediaState.unSelectMediaState) && C89219l.m154714a(this.previewMediaState, chooseMediaState.previewMediaState) && C89219l.m154714a(this.preMusicState, chooseMediaState.preMusicState) && C89219l.m154714a(this.preChangeMusicState, chooseMediaState.preChangeMusicState) && C89219l.m154714a(this.lastPreMusicState, chooseMediaState.lastPreMusicState) && C89219l.m154714a(this.openingChooseMediaPageState, chooseMediaState.openingChooseMediaPageState) && C89219l.m154714a(this.closingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState) && C89219l.m154714a(this.allMediaList, chooseMediaState.allMediaList) && C89219l.m154714a(this.photoMediaList, chooseMediaState.photoMediaList) && C89219l.m154714a(this.videoMediaList, chooseMediaState.videoMediaList) && this.isChangeMusicDownloadSuccess == chooseMediaState.isChangeMusicDownloadSuccess && C89219l.m154714a(this.previewDockerInitMediaList, chooseMediaState.previewDockerInitMediaList) && C89219l.m154714a(this.previewSwapState, chooseMediaState.previewSwapState) && C89219l.m154714a(this.previewDockerDelMediaState, chooseMediaState.previewDockerDelMediaState) && C89219l.m154714a(this.previewDockerAddMediaState, chooseMediaState.previewDockerAddMediaState) && C89219l.m154714a(this.previewNextBtnMediaState, chooseMediaState.previewNextBtnMediaState) && C89219l.m154714a(this.previewNextBtnClickState, chooseMediaState.previewNextBtnClickState) && C89219l.m154714a(this.previewNextBtnState, chooseMediaState.previewNextBtnState);
    }

    public final int hashCode() {
        MediaListState mediaListState2 = this.mediaListState;
        int i = 0;
        int hashCode = (mediaListState2 != null ? mediaListState2.hashCode() : 0) * 31;
        MediaState mediaState = this.selectMediaState;
        int hashCode2 = (hashCode + (mediaState != null ? mediaState.hashCode() : 0)) * 31;
        MediaState mediaState2 = this.unSelectMediaState;
        int hashCode3 = (hashCode2 + (mediaState2 != null ? mediaState2.hashCode() : 0)) * 31;
        MediaState mediaState3 = this.previewMediaState;
        int hashCode4 = (hashCode3 + (mediaState3 != null ? mediaState3.hashCode() : 0)) * 31;
        PreMusicState preMusicState2 = this.preMusicState;
        int hashCode5 = (hashCode4 + (preMusicState2 != null ? preMusicState2.hashCode() : 0)) * 31;
        PreMusicState preMusicState3 = this.preChangeMusicState;
        int hashCode6 = (hashCode5 + (preMusicState3 != null ? preMusicState3.hashCode() : 0)) * 31;
        PreMusicState preMusicState4 = this.lastPreMusicState;
        int hashCode7 = (hashCode6 + (preMusicState4 != null ? preMusicState4.hashCode() : 0)) * 31;
        OpeningChooseMediaPageState openingChooseMediaPageState2 = this.openingChooseMediaPageState;
        int hashCode8 = (hashCode7 + (openingChooseMediaPageState2 != null ? openingChooseMediaPageState2.hashCode() : 0)) * 31;
        ClosingChooseMediaPageState closingChooseMediaPageState2 = this.closingChooseMediaPageState;
        int hashCode9 = (hashCode8 + (closingChooseMediaPageState2 != null ? closingChooseMediaPageState2.hashCode() : 0)) * 31;
        C72059ad adVar = this.allMediaList;
        int hashCode10 = (hashCode9 + (adVar != null ? adVar.hashCode() : 0)) * 31;
        C72059ad adVar2 = this.photoMediaList;
        int hashCode11 = (hashCode10 + (adVar2 != null ? adVar2.hashCode() : 0)) * 31;
        C72059ad adVar3 = this.videoMediaList;
        int hashCode12 = (hashCode11 + (adVar3 != null ? adVar3.hashCode() : 0)) * 31;
        boolean z = this.isChangeMusicDownloadSuccess;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode12 + i2) * 31;
        MediaListState mediaListState3 = this.previewDockerInitMediaList;
        int hashCode13 = (i5 + (mediaListState3 != null ? mediaListState3.hashCode() : 0)) * 31;
        PreviewSwapState previewSwapState2 = this.previewSwapState;
        int hashCode14 = (hashCode13 + (previewSwapState2 != null ? previewSwapState2.hashCode() : 0)) * 31;
        MediaState mediaState4 = this.previewDockerDelMediaState;
        int hashCode15 = (hashCode14 + (mediaState4 != null ? mediaState4.hashCode() : 0)) * 31;
        MediaState mediaState5 = this.previewDockerAddMediaState;
        int hashCode16 = (hashCode15 + (mediaState5 != null ? mediaState5.hashCode() : 0)) * 31;
        MediaState mediaState6 = this.previewNextBtnMediaState;
        int hashCode17 = (hashCode16 + (mediaState6 != null ? mediaState6.hashCode() : 0)) * 31;
        C20526p pVar = this.previewNextBtnClickState;
        int hashCode18 = (hashCode17 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str = this.previewNextBtnState;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode18 + i;
    }

    public final String toString() {
        return "ChooseMediaState(mediaListState=" + this.mediaListState + ", selectMediaState=" + this.selectMediaState + ", unSelectMediaState=" + this.unSelectMediaState + ", previewMediaState=" + this.previewMediaState + ", preMusicState=" + this.preMusicState + ", preChangeMusicState=" + this.preChangeMusicState + ", lastPreMusicState=" + this.lastPreMusicState + ", openingChooseMediaPageState=" + this.openingChooseMediaPageState + ", closingChooseMediaPageState=" + this.closingChooseMediaPageState + ", allMediaList=" + this.allMediaList + ", photoMediaList=" + this.photoMediaList + ", videoMediaList=" + this.videoMediaList + ", isChangeMusicDownloadSuccess=" + this.isChangeMusicDownloadSuccess + ", previewDockerInitMediaList=" + this.previewDockerInitMediaList + ", previewSwapState=" + this.previewSwapState + ", previewDockerDelMediaState=" + this.previewDockerDelMediaState + ", previewDockerAddMediaState=" + this.previewDockerAddMediaState + ", previewNextBtnMediaState=" + this.previewNextBtnMediaState + ", previewNextBtnClickState=" + this.previewNextBtnClickState + ", previewNextBtnState=" + this.previewNextBtnState + ")";
    }

    public final C72059ad getAllMediaList() {
        return this.allMediaList;
    }

    public final ClosingChooseMediaPageState getClosingChooseMediaPageState() {
        return this.closingChooseMediaPageState;
    }

    public final PreMusicState getLastPreMusicState() {
        return this.lastPreMusicState;
    }

    public final MediaListState getMediaListState() {
        return this.mediaListState;
    }

    public final OpeningChooseMediaPageState getOpeningChooseMediaPageState() {
        return this.openingChooseMediaPageState;
    }

    public final C72059ad getPhotoMediaList() {
        return this.photoMediaList;
    }

    public final PreMusicState getPreChangeMusicState() {
        return this.preChangeMusicState;
    }

    public final PreMusicState getPreMusicState() {
        return this.preMusicState;
    }

    public final MediaState getPreviewDockerAddMediaState() {
        return this.previewDockerAddMediaState;
    }

    public final MediaState getPreviewDockerDelMediaState() {
        return this.previewDockerDelMediaState;
    }

    public final MediaListState getPreviewDockerInitMediaList() {
        return this.previewDockerInitMediaList;
    }

    public final MediaState getPreviewMediaState() {
        return this.previewMediaState;
    }

    public final C20526p getPreviewNextBtnClickState() {
        return this.previewNextBtnClickState;
    }

    public final MediaState getPreviewNextBtnMediaState() {
        return this.previewNextBtnMediaState;
    }

    public final String getPreviewNextBtnState() {
        return this.previewNextBtnState;
    }

    public final PreviewSwapState getPreviewSwapState() {
        return this.previewSwapState;
    }

    public final MediaState getSelectMediaState() {
        return this.selectMediaState;
    }

    public final MediaState getUnSelectMediaState() {
        return this.unSelectMediaState;
    }

    public final C72059ad getVideoMediaList() {
        return this.videoMediaList;
    }

    public final boolean isChangeMusicDownloadSuccess() {
        return this.isChangeMusicDownloadSuccess;
    }

    public ChooseMediaState(MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3, PreMusicState preMusicState2, PreMusicState preMusicState3, PreMusicState preMusicState4, OpeningChooseMediaPageState openingChooseMediaPageState2, ClosingChooseMediaPageState closingChooseMediaPageState2, C72059ad adVar, C72059ad adVar2, C72059ad adVar3, boolean z, MediaListState mediaListState3, PreviewSwapState previewSwapState2, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, C20526p pVar, String str) {
        C89219l.m154721d(mediaListState2, "");
        C89219l.m154721d(mediaState, "");
        C89219l.m154721d(mediaState2, "");
        C89219l.m154721d(mediaState3, "");
        C89219l.m154721d(preMusicState2, "");
        C89219l.m154721d(preMusicState3, "");
        C89219l.m154721d(preMusicState4, "");
        C89219l.m154721d(openingChooseMediaPageState2, "");
        C89219l.m154721d(adVar, "");
        C89219l.m154721d(adVar2, "");
        C89219l.m154721d(adVar3, "");
        C89219l.m154721d(mediaListState3, "");
        C89219l.m154721d(previewSwapState2, "");
        C89219l.m154721d(mediaState4, "");
        C89219l.m154721d(mediaState5, "");
        C89219l.m154721d(mediaState6, "");
        this.mediaListState = mediaListState2;
        this.selectMediaState = mediaState;
        this.unSelectMediaState = mediaState2;
        this.previewMediaState = mediaState3;
        this.preMusicState = preMusicState2;
        this.preChangeMusicState = preMusicState3;
        this.lastPreMusicState = preMusicState4;
        this.openingChooseMediaPageState = openingChooseMediaPageState2;
        this.closingChooseMediaPageState = closingChooseMediaPageState2;
        this.allMediaList = adVar;
        this.photoMediaList = adVar2;
        this.videoMediaList = adVar3;
        this.isChangeMusicDownloadSuccess = z;
        this.previewDockerInitMediaList = mediaListState3;
        this.previewSwapState = previewSwapState2;
        this.previewDockerDelMediaState = mediaState4;
        this.previewDockerAddMediaState = mediaState5;
        this.previewNextBtnMediaState = mediaState6;
        this.previewNextBtnClickState = pVar;
        this.previewNextBtnState = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChooseMediaState(MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3, PreMusicState preMusicState2, PreMusicState preMusicState3, PreMusicState preMusicState4, OpeningChooseMediaPageState openingChooseMediaPageState2, ClosingChooseMediaPageState closingChooseMediaPageState2, C72059ad adVar, C72059ad adVar2, C72059ad adVar3, boolean z, MediaListState mediaListState3, PreviewSwapState previewSwapState2, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, C20526p pVar, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? new MediaListState(null, 0, 1, null) : mediaListState2, (i & 2) != 0 ? new MediaState(null, 0, 1, null) : mediaState, (i & 4) != 0 ? new MediaState(null, 0, 1, null) : mediaState2, (i & 8) != 0 ? new MediaState(null, 0, 1, null) : mediaState3, (i & 16) != 0 ? new PreMusicState(null, null, 3, null) : preMusicState2, (i & 32) != 0 ? new PreMusicState(null, null, 3, null) : preMusicState3, (i & 64) != 0 ? new PreMusicState(null, null, 3, null) : preMusicState4, (i & 128) != 0 ? OpeningChooseMediaPageState.NoSceneAnimation.INSTANCE : openingChooseMediaPageState2, (i & 256) != 0 ? ClosingChooseMediaPageState.Ready.INSTANCE : closingChooseMediaPageState2, (i & 512) != 0 ? C72216f.f161898a : adVar, (i & 1024) != 0 ? C72216f.f161898a : adVar2, (i & 2048) != 0 ? C72216f.f161898a : adVar3, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? new MediaListState(null, 0, 1, null) : mediaListState3, (i & 16384) != 0 ? new PreviewSwapState(null, null, 0, 3, null) : previewSwapState2, (32768 & i) != 0 ? new MediaState(null, 0, 1, null) : mediaState4, (65536 & i) != 0 ? new MediaState(null, 0, 1, null) : mediaState5, (131072 & i) != 0 ? new MediaState(null, 0, 1, null) : mediaState6, (262144 & i) != 0 ? null : pVar, (i & 524288) != 0 ? null : str);
    }
}
