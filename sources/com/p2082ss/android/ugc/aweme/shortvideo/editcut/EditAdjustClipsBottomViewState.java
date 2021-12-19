package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState */
public final class EditAdjustClipsBottomViewState implements AbstractC20368af {
    public static final C71550a Companion = new C71550a((byte) 0);
    private final C20391d<List<VideoSegment>> addVideosEvent;
    private final int currentEditIndex;
    private final int currentEditOriginIndex;
    private final int currentTabIndex;
    private final C20524n<Integer, VideoSegment> deleteVideoEvent;
    private final Integer editState;
    private final Boolean focusEditMode;
    private final Boolean isMusicSyncMode;
    private final C20526p modeChangeEvent;
    private final C20391d<C71796s> restoreEditEvent;
    private final C20526p restoreMusicSyncEvent;
    private final Float scale;
    private final C20526p seekDoneEvent;
    private final Float selectTime;
    private final int stickPointStatus;
    private final C20524n<Integer, VideoSegment> updateVideoEvent;

    static {
        Covode.recordClassIndex(84094);
    }

    public EditAdjustClipsBottomViewState() {
        this(0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_editcut_EditAdjustClipsBottomViewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m126450x2e84d93f(int i) {
        return i;
    }

    public static /* synthetic */ EditAdjustClipsBottomViewState copy$default(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState, int i, int i2, int i3, int i4, Boolean bool, Float f, Float f2, Integer num, Boolean bool2, C20524n nVar, C20524n nVar2, C20391d dVar, C20391d dVar2, C20526p pVar, C20526p pVar2, C20526p pVar3, int i5, Object obj) {
        int i6 = i2;
        int i7 = i;
        Boolean bool3 = bool;
        int i8 = i4;
        int i9 = i3;
        Integer num2 = num;
        Float f3 = f2;
        Float f4 = f;
        C20524n nVar3 = nVar2;
        C20524n nVar4 = nVar;
        Boolean bool4 = bool2;
        C20526p pVar4 = pVar;
        C20391d dVar3 = dVar2;
        C20391d dVar4 = dVar;
        C20526p pVar5 = pVar3;
        C20526p pVar6 = pVar2;
        if ((i5 & 1) != 0) {
            i7 = editAdjustClipsBottomViewState.currentEditIndex;
        }
        if ((i5 & 2) != 0) {
            i6 = editAdjustClipsBottomViewState.currentEditOriginIndex;
        }
        if ((i5 & 4) != 0) {
            i9 = editAdjustClipsBottomViewState.currentTabIndex;
        }
        if ((i5 & 8) != 0) {
            i8 = editAdjustClipsBottomViewState.stickPointStatus;
        }
        if ((i5 & 16) != 0) {
            bool3 = editAdjustClipsBottomViewState.isMusicSyncMode;
        }
        if ((i5 & 32) != 0) {
            f4 = editAdjustClipsBottomViewState.scale;
        }
        if ((i5 & 64) != 0) {
            f3 = editAdjustClipsBottomViewState.selectTime;
        }
        if ((i5 & 128) != 0) {
            num2 = editAdjustClipsBottomViewState.editState;
        }
        if ((i5 & 256) != 0) {
            bool4 = editAdjustClipsBottomViewState.focusEditMode;
        }
        if ((i5 & 512) != 0) {
            nVar4 = editAdjustClipsBottomViewState.deleteVideoEvent;
        }
        if ((i5 & 1024) != 0) {
            nVar3 = editAdjustClipsBottomViewState.updateVideoEvent;
        }
        if ((i5 & 2048) != 0) {
            dVar4 = editAdjustClipsBottomViewState.restoreEditEvent;
        }
        if ((i5 & 4096) != 0) {
            dVar3 = editAdjustClipsBottomViewState.addVideosEvent;
        }
        if ((i5 & 8192) != 0) {
            pVar4 = editAdjustClipsBottomViewState.modeChangeEvent;
        }
        if ((i5 & 16384) != 0) {
            pVar6 = editAdjustClipsBottomViewState.seekDoneEvent;
        }
        if ((i5 & 32768) != 0) {
            pVar5 = editAdjustClipsBottomViewState.restoreMusicSyncEvent;
        }
        return editAdjustClipsBottomViewState.copy(i7, i6, i9, i8, bool3, f4, f3, num2, bool4, nVar4, nVar3, dVar4, dVar3, pVar4, pVar6, pVar5);
    }

    public final int component1() {
        return this.currentEditIndex;
    }

    public final C20524n<Integer, VideoSegment> component10() {
        return this.deleteVideoEvent;
    }

    public final C20524n<Integer, VideoSegment> component11() {
        return this.updateVideoEvent;
    }

    public final C20391d<C71796s> component12() {
        return this.restoreEditEvent;
    }

    public final C20391d<List<VideoSegment>> component13() {
        return this.addVideosEvent;
    }

    public final C20526p component14() {
        return this.modeChangeEvent;
    }

    public final C20526p component15() {
        return this.seekDoneEvent;
    }

    public final C20526p component16() {
        return this.restoreMusicSyncEvent;
    }

    public final int component2() {
        return this.currentEditOriginIndex;
    }

    public final int component3() {
        return this.currentTabIndex;
    }

    public final int component4() {
        return this.stickPointStatus;
    }

    public final Boolean component5() {
        return this.isMusicSyncMode;
    }

    public final Float component6() {
        return this.scale;
    }

    public final Float component7() {
        return this.selectTime;
    }

    public final Integer component8() {
        return this.editState;
    }

    public final Boolean component9() {
        return this.focusEditMode;
    }

    public final EditAdjustClipsBottomViewState copy(int i, int i2, int i3, int i4, Boolean bool, Float f, Float f2, Integer num, Boolean bool2, C20524n<Integer, VideoSegment> nVar, C20524n<Integer, VideoSegment> nVar2, C20391d<C71796s> dVar, C20391d<? extends List<? extends VideoSegment>> dVar2, C20526p pVar, C20526p pVar2, C20526p pVar3) {
        return new EditAdjustClipsBottomViewState(i, i2, i3, i4, bool, f, f2, num, bool2, nVar, nVar2, dVar, dVar2, pVar, pVar2, pVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAdjustClipsBottomViewState)) {
            return false;
        }
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) obj;
        return this.currentEditIndex == editAdjustClipsBottomViewState.currentEditIndex && this.currentEditOriginIndex == editAdjustClipsBottomViewState.currentEditOriginIndex && this.currentTabIndex == editAdjustClipsBottomViewState.currentTabIndex && this.stickPointStatus == editAdjustClipsBottomViewState.stickPointStatus && C89219l.m154714a(this.isMusicSyncMode, editAdjustClipsBottomViewState.isMusicSyncMode) && C89219l.m154714a(this.scale, editAdjustClipsBottomViewState.scale) && C89219l.m154714a(this.selectTime, editAdjustClipsBottomViewState.selectTime) && C89219l.m154714a(this.editState, editAdjustClipsBottomViewState.editState) && C89219l.m154714a(this.focusEditMode, editAdjustClipsBottomViewState.focusEditMode) && C89219l.m154714a(this.deleteVideoEvent, editAdjustClipsBottomViewState.deleteVideoEvent) && C89219l.m154714a(this.updateVideoEvent, editAdjustClipsBottomViewState.updateVideoEvent) && C89219l.m154714a(this.restoreEditEvent, editAdjustClipsBottomViewState.restoreEditEvent) && C89219l.m154714a(this.addVideosEvent, editAdjustClipsBottomViewState.addVideosEvent) && C89219l.m154714a(this.modeChangeEvent, editAdjustClipsBottomViewState.modeChangeEvent) && C89219l.m154714a(this.seekDoneEvent, editAdjustClipsBottomViewState.seekDoneEvent) && C89219l.m154714a(this.restoreMusicSyncEvent, editAdjustClipsBottomViewState.restoreMusicSyncEvent);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shortvideo_editcut_EditAdjustClipsBottomViewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((m126450x2e84d93f(this.currentEditIndex) * 31) + m126450x2e84d93f(this.currentEditOriginIndex)) * 31) + m126450x2e84d93f(this.currentTabIndex)) * 31) + m126450x2e84d93f(this.stickPointStatus)) * 31;
        Boolean bool = this.isMusicSyncMode;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_shortvideo_editcut_EditAdjustClipsBottomViewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Float f = this.scale;
        int hashCode2 = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        Float f2 = this.selectTime;
        int hashCode3 = (hashCode2 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Integer num = this.editState;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool2 = this.focusEditMode;
        int hashCode5 = (hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        C20524n<Integer, VideoSegment> nVar = this.deleteVideoEvent;
        int hashCode6 = (hashCode5 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C20524n<Integer, VideoSegment> nVar2 = this.updateVideoEvent;
        int hashCode7 = (hashCode6 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        C20391d<C71796s> dVar = this.restoreEditEvent;
        int hashCode8 = (hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C20391d<List<VideoSegment>> dVar2 = this.addVideosEvent;
        int hashCode9 = (hashCode8 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        C20526p pVar = this.modeChangeEvent;
        int hashCode10 = (hashCode9 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C20526p pVar2 = this.seekDoneEvent;
        int hashCode11 = (hashCode10 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        C20526p pVar3 = this.restoreMusicSyncEvent;
        if (pVar3 != null) {
            i = pVar3.hashCode();
        }
        return hashCode11 + i;
    }

    public final String toString() {
        return "EditAdjustClipsBottomViewState(currentEditIndex=" + this.currentEditIndex + ", currentEditOriginIndex=" + this.currentEditOriginIndex + ", currentTabIndex=" + this.currentTabIndex + ", stickPointStatus=" + this.stickPointStatus + ", isMusicSyncMode=" + this.isMusicSyncMode + ", scale=" + this.scale + ", selectTime=" + this.selectTime + ", editState=" + this.editState + ", focusEditMode=" + this.focusEditMode + ", deleteVideoEvent=" + this.deleteVideoEvent + ", updateVideoEvent=" + this.updateVideoEvent + ", restoreEditEvent=" + this.restoreEditEvent + ", addVideosEvent=" + this.addVideosEvent + ", modeChangeEvent=" + this.modeChangeEvent + ", seekDoneEvent=" + this.seekDoneEvent + ", restoreMusicSyncEvent=" + this.restoreMusicSyncEvent + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState$a */
    public static final class C71550a {
        static {
            Covode.recordClassIndex(84095);
        }

        private C71550a() {
        }

        public /* synthetic */ C71550a(byte b) {
            this();
        }
    }

    public final C20391d<List<VideoSegment>> getAddVideosEvent() {
        return this.addVideosEvent;
    }

    public final int getCurrentEditIndex() {
        return this.currentEditIndex;
    }

    public final int getCurrentEditOriginIndex() {
        return this.currentEditOriginIndex;
    }

    public final int getCurrentTabIndex() {
        return this.currentTabIndex;
    }

    public final C20524n<Integer, VideoSegment> getDeleteVideoEvent() {
        return this.deleteVideoEvent;
    }

    public final Integer getEditState() {
        return this.editState;
    }

    public final Boolean getFocusEditMode() {
        return this.focusEditMode;
    }

    public final C20526p getModeChangeEvent() {
        return this.modeChangeEvent;
    }

    public final C20391d<C71796s> getRestoreEditEvent() {
        return this.restoreEditEvent;
    }

    public final C20526p getRestoreMusicSyncEvent() {
        return this.restoreMusicSyncEvent;
    }

    public final Float getScale() {
        return this.scale;
    }

    public final C20526p getSeekDoneEvent() {
        return this.seekDoneEvent;
    }

    public final Float getSelectTime() {
        return this.selectTime;
    }

    public final int getStickPointStatus() {
        return this.stickPointStatus;
    }

    public final C20524n<Integer, VideoSegment> getUpdateVideoEvent() {
        return this.updateVideoEvent;
    }

    public final Boolean isMusicSyncMode() {
        return this.isMusicSyncMode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.bytedance.jedi.arch.d<? extends java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment>> */
    /* JADX WARN: Multi-variable type inference failed */
    public EditAdjustClipsBottomViewState(int i, int i2, int i3, int i4, Boolean bool, Float f, Float f2, Integer num, Boolean bool2, C20524n<Integer, VideoSegment> nVar, C20524n<Integer, VideoSegment> nVar2, C20391d<C71796s> dVar, C20391d<? extends List<? extends VideoSegment>> dVar2, C20526p pVar, C20526p pVar2, C20526p pVar3) {
        this.currentEditIndex = i;
        this.currentEditOriginIndex = i2;
        this.currentTabIndex = i3;
        this.stickPointStatus = i4;
        this.isMusicSyncMode = bool;
        this.scale = f;
        this.selectTime = f2;
        this.editState = num;
        this.focusEditMode = bool2;
        this.deleteVideoEvent = nVar;
        this.updateVideoEvent = nVar2;
        this.restoreEditEvent = dVar;
        this.addVideosEvent = dVar2;
        this.modeChangeEvent = pVar;
        this.seekDoneEvent = pVar2;
        this.restoreMusicSyncEvent = pVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditAdjustClipsBottomViewState(int i, int i2, int i3, int i4, Boolean bool, Float f, Float f2, Integer num, Boolean bool2, C20524n nVar, C20524n nVar2, C20391d dVar, C20391d dVar2, C20526p pVar, C20526p pVar2, C20526p pVar3, int i5, C89214g gVar) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) == 0 ? i2 : 0, (i5 & 4) != 0 ? 1 : i3, (i5 & 8) == 0 ? i4 : 1, (i5 & 16) != 0 ? null : bool, (i5 & 32) != 0 ? null : f, (i5 & 64) != 0 ? null : f2, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? null : bool2, (i5 & 512) != 0 ? null : nVar, (i5 & 1024) != 0 ? null : nVar2, (i5 & 2048) != 0 ? null : dVar, (i5 & 4096) != 0 ? null : dVar2, (i5 & 8192) != 0 ? null : pVar, (i5 & 16384) != 0 ? null : pVar2, (i5 & 32768) != 0 ? null : pVar3);
    }
}
