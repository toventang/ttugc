package com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarState */
public final class StoryEditToolbarState extends UiState {
    private final Boolean backIconVisible;
    private final Integer bottomHeight;
    private final Drawable chooseMusicIcon;
    private final String chooseMusicText;
    private final Boolean isSoundMute;
    private final Boolean muteIconVisible;
    private final Boolean publishBtnVisible;
    private final C20526p refresh;
    private final List<C77093o> titleBarItems;
    private final Boolean toolbarVisible;
    private final Integer topMargin;

    /* renamed from: ui */
    private final AbstractC23517a f172846ui;

    static {
        Covode.recordClassIndex(90041);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryEditToolbarState copy$default(StoryEditToolbarState storyEditToolbarState, AbstractC23517a aVar, List list, Integer num, Integer num2, C20526p pVar, String str, Drawable drawable, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = storyEditToolbarState.getUi();
        }
        if ((i & 2) != 0) {
            list = storyEditToolbarState.titleBarItems;
        }
        if ((i & 4) != 0) {
            num = storyEditToolbarState.topMargin;
        }
        if ((i & 8) != 0) {
            num2 = storyEditToolbarState.bottomHeight;
        }
        if ((i & 16) != 0) {
            pVar = storyEditToolbarState.refresh;
        }
        if ((i & 32) != 0) {
            str = storyEditToolbarState.chooseMusicText;
        }
        if ((i & 64) != 0) {
            drawable = storyEditToolbarState.chooseMusicIcon;
        }
        if ((i & 128) != 0) {
            bool = storyEditToolbarState.backIconVisible;
        }
        if ((i & 256) != 0) {
            bool2 = storyEditToolbarState.toolbarVisible;
        }
        if ((i & 512) != 0) {
            bool3 = storyEditToolbarState.publishBtnVisible;
        }
        if ((i & 1024) != 0) {
            bool4 = storyEditToolbarState.isSoundMute;
        }
        if ((i & 2048) != 0) {
            bool5 = storyEditToolbarState.muteIconVisible;
        }
        return storyEditToolbarState.copy(aVar, list, num, num2, pVar, str, drawable, bool, bool2, bool3, bool4, bool5);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final Boolean component10() {
        return this.publishBtnVisible;
    }

    public final Boolean component11() {
        return this.isSoundMute;
    }

    public final Boolean component12() {
        return this.muteIconVisible;
    }

    public final List<C77093o> component2() {
        return this.titleBarItems;
    }

    public final Integer component3() {
        return this.topMargin;
    }

    public final Integer component4() {
        return this.bottomHeight;
    }

    public final C20526p component5() {
        return this.refresh;
    }

    public final String component6() {
        return this.chooseMusicText;
    }

    public final Drawable component7() {
        return this.chooseMusicIcon;
    }

    public final Boolean component8() {
        return this.backIconVisible;
    }

    public final Boolean component9() {
        return this.toolbarVisible;
    }

    public final StoryEditToolbarState copy(AbstractC23517a aVar, List<C77093o> list, Integer num, Integer num2, C20526p pVar, String str, Drawable drawable, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        C89219l.m154721d(aVar, "");
        return new StoryEditToolbarState(aVar, list, num, num2, pVar, str, drawable, bool, bool2, bool3, bool4, bool5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditToolbarState)) {
            return false;
        }
        StoryEditToolbarState storyEditToolbarState = (StoryEditToolbarState) obj;
        return C89219l.m154714a(getUi(), storyEditToolbarState.getUi()) && C89219l.m154714a(this.titleBarItems, storyEditToolbarState.titleBarItems) && C89219l.m154714a(this.topMargin, storyEditToolbarState.topMargin) && C89219l.m154714a(this.bottomHeight, storyEditToolbarState.bottomHeight) && C89219l.m154714a(this.refresh, storyEditToolbarState.refresh) && C89219l.m154714a(this.chooseMusicText, storyEditToolbarState.chooseMusicText) && C89219l.m154714a(this.chooseMusicIcon, storyEditToolbarState.chooseMusicIcon) && C89219l.m154714a(this.backIconVisible, storyEditToolbarState.backIconVisible) && C89219l.m154714a(this.toolbarVisible, storyEditToolbarState.toolbarVisible) && C89219l.m154714a(this.publishBtnVisible, storyEditToolbarState.publishBtnVisible) && C89219l.m154714a(this.isSoundMute, storyEditToolbarState.isSoundMute) && C89219l.m154714a(this.muteIconVisible, storyEditToolbarState.muteIconVisible);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        List<C77093o> list = this.titleBarItems;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.topMargin;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.bottomHeight;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        C20526p pVar = this.refresh;
        int hashCode5 = (hashCode4 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str = this.chooseMusicText;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        Drawable drawable = this.chooseMusicIcon;
        int hashCode7 = (hashCode6 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Boolean bool = this.backIconVisible;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.toolbarVisible;
        int hashCode9 = (hashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.publishBtnVisible;
        int hashCode10 = (hashCode9 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.isSoundMute;
        int hashCode11 = (hashCode10 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.muteIconVisible;
        if (bool5 != null) {
            i = bool5.hashCode();
        }
        return hashCode11 + i;
    }

    public final String toString() {
        return "StoryEditToolbarState(ui=" + getUi() + ", titleBarItems=" + this.titleBarItems + ", topMargin=" + this.topMargin + ", bottomHeight=" + this.bottomHeight + ", refresh=" + this.refresh + ", chooseMusicText=" + this.chooseMusicText + ", chooseMusicIcon=" + this.chooseMusicIcon + ", backIconVisible=" + this.backIconVisible + ", toolbarVisible=" + this.toolbarVisible + ", publishBtnVisible=" + this.publishBtnVisible + ", isSoundMute=" + this.isSoundMute + ", muteIconVisible=" + this.muteIconVisible + ")";
    }

    public final Boolean getBackIconVisible() {
        return this.backIconVisible;
    }

    public final Integer getBottomHeight() {
        return this.bottomHeight;
    }

    public final Drawable getChooseMusicIcon() {
        return this.chooseMusicIcon;
    }

    public final String getChooseMusicText() {
        return this.chooseMusicText;
    }

    public final Boolean getMuteIconVisible() {
        return this.muteIconVisible;
    }

    public final Boolean getPublishBtnVisible() {
        return this.publishBtnVisible;
    }

    public final C20526p getRefresh() {
        return this.refresh;
    }

    public final List<C77093o> getTitleBarItems() {
        return this.titleBarItems;
    }

    public final Boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f172846ui;
    }

    public final Boolean isSoundMute() {
        return this.isSoundMute;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryEditToolbarState(AbstractC23517a aVar, List<C77093o> list, Integer num, Integer num2, C20526p pVar, String str, Drawable drawable, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f172846ui = aVar;
        this.titleBarItems = list;
        this.topMargin = num;
        this.bottomHeight = num2;
        this.refresh = pVar;
        this.chooseMusicText = str;
        this.chooseMusicIcon = drawable;
        this.backIconVisible = bool;
        this.toolbarVisible = bool2;
        this.publishBtnVisible = bool3;
        this.isSoundMute = bool4;
        this.muteIconVisible = bool5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryEditToolbarState(AbstractC23517a aVar, List list, Integer num, Integer num2, C20526p pVar, String str, Drawable drawable, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, C89214g gVar) {
        this(aVar, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : pVar, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : drawable, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : bool4, (i & 2048) == 0 ? bool5 : null);
    }
}
