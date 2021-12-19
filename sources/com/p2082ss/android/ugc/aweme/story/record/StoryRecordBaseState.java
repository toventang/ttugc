package com.p2082ss.android.ugc.aweme.story.record;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.StoryRecordBaseState */
public final class StoryRecordBaseState implements AbstractC20368af {
    private final C20523m backFromEditPageResult;
    private final C20526p exit;
    private final C20521k forbidAlbumGesture;
    private final Boolean forbidDrawerScrollEvent;
    private final C20526p leftScroll;
    private final C20526p onAttachToScreen;
    private final C20526p onOpenCompletely;
    private final C20521k openAlbum;
    private final C20521k showOrHideCommonButtons;

    static {
        Covode.recordClassIndex(90485);
    }

    public StoryRecordBaseState() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ StoryRecordBaseState copy$default(StoryRecordBaseState storyRecordBaseState, C20523m mVar, C20526p pVar, Boolean bool, C20521k kVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, C20521k kVar2, C20521k kVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            mVar = storyRecordBaseState.backFromEditPageResult;
        }
        if ((i & 2) != 0) {
            pVar = storyRecordBaseState.exit;
        }
        if ((i & 4) != 0) {
            bool = storyRecordBaseState.forbidDrawerScrollEvent;
        }
        if ((i & 8) != 0) {
            kVar = storyRecordBaseState.forbidAlbumGesture;
        }
        if ((i & 16) != 0) {
            pVar2 = storyRecordBaseState.leftScroll;
        }
        if ((i & 32) != 0) {
            pVar3 = storyRecordBaseState.onAttachToScreen;
        }
        if ((i & 64) != 0) {
            pVar4 = storyRecordBaseState.onOpenCompletely;
        }
        if ((i & 128) != 0) {
            kVar2 = storyRecordBaseState.openAlbum;
        }
        if ((i & 256) != 0) {
            kVar3 = storyRecordBaseState.showOrHideCommonButtons;
        }
        return storyRecordBaseState.copy(mVar, pVar, bool, kVar, pVar2, pVar3, pVar4, kVar2, kVar3);
    }

    public final C20523m component1() {
        return this.backFromEditPageResult;
    }

    public final C20526p component2() {
        return this.exit;
    }

    public final Boolean component3() {
        return this.forbidDrawerScrollEvent;
    }

    public final C20521k component4() {
        return this.forbidAlbumGesture;
    }

    public final C20526p component5() {
        return this.leftScroll;
    }

    public final C20526p component6() {
        return this.onAttachToScreen;
    }

    public final C20526p component7() {
        return this.onOpenCompletely;
    }

    public final C20521k component8() {
        return this.openAlbum;
    }

    public final C20521k component9() {
        return this.showOrHideCommonButtons;
    }

    public final StoryRecordBaseState copy(C20523m mVar, C20526p pVar, Boolean bool, C20521k kVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, C20521k kVar2, C20521k kVar3) {
        return new StoryRecordBaseState(mVar, pVar, bool, kVar, pVar2, pVar3, pVar4, kVar2, kVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryRecordBaseState)) {
            return false;
        }
        StoryRecordBaseState storyRecordBaseState = (StoryRecordBaseState) obj;
        return C89219l.m154714a(this.backFromEditPageResult, storyRecordBaseState.backFromEditPageResult) && C89219l.m154714a(this.exit, storyRecordBaseState.exit) && C89219l.m154714a(this.forbidDrawerScrollEvent, storyRecordBaseState.forbidDrawerScrollEvent) && C89219l.m154714a(this.forbidAlbumGesture, storyRecordBaseState.forbidAlbumGesture) && C89219l.m154714a(this.leftScroll, storyRecordBaseState.leftScroll) && C89219l.m154714a(this.onAttachToScreen, storyRecordBaseState.onAttachToScreen) && C89219l.m154714a(this.onOpenCompletely, storyRecordBaseState.onOpenCompletely) && C89219l.m154714a(this.openAlbum, storyRecordBaseState.openAlbum) && C89219l.m154714a(this.showOrHideCommonButtons, storyRecordBaseState.showOrHideCommonButtons);
    }

    public final int hashCode() {
        C20523m mVar = this.backFromEditPageResult;
        int i = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        C20526p pVar = this.exit;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        Boolean bool = this.forbidDrawerScrollEvent;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        C20521k kVar = this.forbidAlbumGesture;
        int hashCode4 = (hashCode3 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C20526p pVar2 = this.leftScroll;
        int hashCode5 = (hashCode4 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        C20526p pVar3 = this.onAttachToScreen;
        int hashCode6 = (hashCode5 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        C20526p pVar4 = this.onOpenCompletely;
        int hashCode7 = (hashCode6 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        C20521k kVar2 = this.openAlbum;
        int hashCode8 = (hashCode7 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        C20521k kVar3 = this.showOrHideCommonButtons;
        if (kVar3 != null) {
            i = kVar3.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "StoryRecordBaseState(backFromEditPageResult=" + this.backFromEditPageResult + ", exit=" + this.exit + ", forbidDrawerScrollEvent=" + this.forbidDrawerScrollEvent + ", forbidAlbumGesture=" + this.forbidAlbumGesture + ", leftScroll=" + this.leftScroll + ", onAttachToScreen=" + this.onAttachToScreen + ", onOpenCompletely=" + this.onOpenCompletely + ", openAlbum=" + this.openAlbum + ", showOrHideCommonButtons=" + this.showOrHideCommonButtons + ")";
    }

    public final C20523m getBackFromEditPageResult() {
        return this.backFromEditPageResult;
    }

    public final C20526p getExit() {
        return this.exit;
    }

    public final C20521k getForbidAlbumGesture() {
        return this.forbidAlbumGesture;
    }

    public final Boolean getForbidDrawerScrollEvent() {
        return this.forbidDrawerScrollEvent;
    }

    public final C20526p getLeftScroll() {
        return this.leftScroll;
    }

    public final C20526p getOnAttachToScreen() {
        return this.onAttachToScreen;
    }

    public final C20526p getOnOpenCompletely() {
        return this.onOpenCompletely;
    }

    public final C20521k getOpenAlbum() {
        return this.openAlbum;
    }

    public final C20521k getShowOrHideCommonButtons() {
        return this.showOrHideCommonButtons;
    }

    public StoryRecordBaseState(C20523m mVar, C20526p pVar, Boolean bool, C20521k kVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, C20521k kVar2, C20521k kVar3) {
        this.backFromEditPageResult = mVar;
        this.exit = pVar;
        this.forbidDrawerScrollEvent = bool;
        this.forbidAlbumGesture = kVar;
        this.leftScroll = pVar2;
        this.onAttachToScreen = pVar3;
        this.onOpenCompletely = pVar4;
        this.openAlbum = kVar2;
        this.showOrHideCommonButtons = kVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryRecordBaseState(C20523m mVar, C20526p pVar, Boolean bool, C20521k kVar, C20526p pVar2, C20526p pVar3, C20526p pVar4, C20521k kVar2, C20521k kVar3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : mVar, (i & 2) != 0 ? null : pVar, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : kVar, (i & 16) != 0 ? null : pVar2, (i & 32) != 0 ? null : pVar3, (i & 64) != 0 ? null : pVar4, (i & 128) != 0 ? null : kVar2, (i & 256) == 0 ? kVar3 : null);
    }
}
