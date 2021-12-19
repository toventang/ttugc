package com.p2082ss.android.ugc.gamora.editor.toolbar;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.gamora.editor.C83395y;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState */
public final class EditToolbarState extends UiState {
    private final C83131a autoEnhanceStatus;
    private final String backTipText;
    private final Boolean backTipVisible;
    private final Boolean backVisible;
    private final List<C83395y> bottomBarItems;
    private final Integer bottomHeight;
    private final Boolean captionStatus;
    private final Drawable chooseMusicIcon;
    private final String chooseMusicText;
    private final C20526p hideMoreEvent;
    private final C20523m musicChooseState;
    private final C20526p refresh;
    private final C20526p refreshAudioEnhanceIcon;
    private final List<C83395y> titleBarItems;
    private final Integer topMargin;

    /* renamed from: ui */
    private final AbstractC23517a f185700ui;

    static {
        Covode.recordClassIndex(96975);
    }

    public static /* synthetic */ EditToolbarState copy$default(EditToolbarState editToolbarState, AbstractC23517a aVar, Boolean bool, Boolean bool2, String str, List list, List list2, C20526p pVar, String str2, Drawable drawable, Integer num, Integer num2, C20526p pVar2, C20526p pVar3, C20523m mVar, C83131a aVar2, Boolean bool3, int i, Object obj) {
        AbstractC23517a aVar3 = aVar;
        Boolean bool4 = bool;
        List list3 = list;
        String str3 = str;
        Boolean bool5 = bool2;
        String str4 = str2;
        C20526p pVar4 = pVar;
        List list4 = list2;
        Integer num3 = num2;
        Integer num4 = num;
        Drawable drawable2 = drawable;
        C20523m mVar2 = mVar;
        C20526p pVar5 = pVar3;
        C20526p pVar6 = pVar2;
        Boolean bool6 = bool3;
        C83131a aVar4 = aVar2;
        if ((i & 1) != 0) {
            aVar3 = editToolbarState.getUi();
        }
        if ((i & 2) != 0) {
            bool4 = editToolbarState.backVisible;
        }
        if ((i & 4) != 0) {
            bool5 = editToolbarState.backTipVisible;
        }
        if ((i & 8) != 0) {
            str3 = editToolbarState.backTipText;
        }
        if ((i & 16) != 0) {
            list3 = editToolbarState.titleBarItems;
        }
        if ((i & 32) != 0) {
            list4 = editToolbarState.bottomBarItems;
        }
        if ((i & 64) != 0) {
            pVar4 = editToolbarState.hideMoreEvent;
        }
        if ((i & 128) != 0) {
            str4 = editToolbarState.chooseMusicText;
        }
        if ((i & 256) != 0) {
            drawable2 = editToolbarState.chooseMusicIcon;
        }
        if ((i & 512) != 0) {
            num4 = editToolbarState.topMargin;
        }
        if ((i & 1024) != 0) {
            num3 = editToolbarState.bottomHeight;
        }
        if ((i & 2048) != 0) {
            pVar6 = editToolbarState.refresh;
        }
        if ((i & 4096) != 0) {
            pVar5 = editToolbarState.refreshAudioEnhanceIcon;
        }
        if ((i & 8192) != 0) {
            mVar2 = editToolbarState.musicChooseState;
        }
        if ((i & 16384) != 0) {
            aVar4 = editToolbarState.autoEnhanceStatus;
        }
        if ((i & 32768) != 0) {
            bool6 = editToolbarState.captionStatus;
        }
        return editToolbarState.copy(aVar3, bool4, bool5, str3, list3, list4, pVar4, str4, drawable2, num4, num3, pVar6, pVar5, mVar2, aVar4, bool6);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    public final Integer component10() {
        return this.topMargin;
    }

    public final Integer component11() {
        return this.bottomHeight;
    }

    public final C20526p component12() {
        return this.refresh;
    }

    public final C20526p component13() {
        return this.refreshAudioEnhanceIcon;
    }

    public final C20523m component14() {
        return this.musicChooseState;
    }

    public final C83131a component15() {
        return this.autoEnhanceStatus;
    }

    public final Boolean component16() {
        return this.captionStatus;
    }

    public final Boolean component2() {
        return this.backVisible;
    }

    public final Boolean component3() {
        return this.backTipVisible;
    }

    public final String component4() {
        return this.backTipText;
    }

    public final List<C83395y> component5() {
        return this.titleBarItems;
    }

    public final List<C83395y> component6() {
        return this.bottomBarItems;
    }

    public final C20526p component7() {
        return this.hideMoreEvent;
    }

    public final String component8() {
        return this.chooseMusicText;
    }

    public final Drawable component9() {
        return this.chooseMusicIcon;
    }

    public final EditToolbarState copy(AbstractC23517a aVar, Boolean bool, Boolean bool2, String str, List<C83395y> list, List<C83395y> list2, C20526p pVar, String str2, Drawable drawable, Integer num, Integer num2, C20526p pVar2, C20526p pVar3, C20523m mVar, C83131a aVar2, Boolean bool3) {
        C89219l.m154721d(aVar, "");
        return new EditToolbarState(aVar, bool, bool2, str, list, list2, pVar, str2, drawable, num, num2, pVar2, pVar3, mVar, aVar2, bool3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditToolbarState)) {
            return false;
        }
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return C89219l.m154714a(getUi(), editToolbarState.getUi()) && C89219l.m154714a(this.backVisible, editToolbarState.backVisible) && C89219l.m154714a(this.backTipVisible, editToolbarState.backTipVisible) && C89219l.m154714a(this.backTipText, editToolbarState.backTipText) && C89219l.m154714a(this.titleBarItems, editToolbarState.titleBarItems) && C89219l.m154714a(this.bottomBarItems, editToolbarState.bottomBarItems) && C89219l.m154714a(this.hideMoreEvent, editToolbarState.hideMoreEvent) && C89219l.m154714a(this.chooseMusicText, editToolbarState.chooseMusicText) && C89219l.m154714a(this.chooseMusicIcon, editToolbarState.chooseMusicIcon) && C89219l.m154714a(this.topMargin, editToolbarState.topMargin) && C89219l.m154714a(this.bottomHeight, editToolbarState.bottomHeight) && C89219l.m154714a(this.refresh, editToolbarState.refresh) && C89219l.m154714a(this.refreshAudioEnhanceIcon, editToolbarState.refreshAudioEnhanceIcon) && C89219l.m154714a(this.musicChooseState, editToolbarState.musicChooseState) && C89219l.m154714a(this.autoEnhanceStatus, editToolbarState.autoEnhanceStatus) && C89219l.m154714a(this.captionStatus, editToolbarState.captionStatus);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        Boolean bool = this.backVisible;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.backTipVisible;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str = this.backTipText;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        List<C83395y> list = this.titleBarItems;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<C83395y> list2 = this.bottomBarItems;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        C20526p pVar = this.hideMoreEvent;
        int hashCode7 = (hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str2 = this.chooseMusicText;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Drawable drawable = this.chooseMusicIcon;
        int hashCode9 = (hashCode8 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num = this.topMargin;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.bottomHeight;
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        C20526p pVar2 = this.refresh;
        int hashCode12 = (hashCode11 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        C20526p pVar3 = this.refreshAudioEnhanceIcon;
        int hashCode13 = (hashCode12 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        C20523m mVar = this.musicChooseState;
        int hashCode14 = (hashCode13 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C83131a aVar = this.autoEnhanceStatus;
        int hashCode15 = (hashCode14 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Boolean bool3 = this.captionStatus;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode15 + i;
    }

    public final String toString() {
        return "EditToolbarState(ui=" + getUi() + ", backVisible=" + this.backVisible + ", backTipVisible=" + this.backTipVisible + ", backTipText=" + this.backTipText + ", titleBarItems=" + this.titleBarItems + ", bottomBarItems=" + this.bottomBarItems + ", hideMoreEvent=" + this.hideMoreEvent + ", chooseMusicText=" + this.chooseMusicText + ", chooseMusicIcon=" + this.chooseMusicIcon + ", topMargin=" + this.topMargin + ", bottomHeight=" + this.bottomHeight + ", refresh=" + this.refresh + ", refreshAudioEnhanceIcon=" + this.refreshAudioEnhanceIcon + ", musicChooseState=" + this.musicChooseState + ", autoEnhanceStatus=" + this.autoEnhanceStatus + ", captionStatus=" + this.captionStatus + ")";
    }

    public final C83131a getAutoEnhanceStatus() {
        return this.autoEnhanceStatus;
    }

    public final String getBackTipText() {
        return this.backTipText;
    }

    public final Boolean getBackTipVisible() {
        return this.backTipVisible;
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final List<C83395y> getBottomBarItems() {
        return this.bottomBarItems;
    }

    public final Integer getBottomHeight() {
        return this.bottomHeight;
    }

    public final Boolean getCaptionStatus() {
        return this.captionStatus;
    }

    public final Drawable getChooseMusicIcon() {
        return this.chooseMusicIcon;
    }

    public final String getChooseMusicText() {
        return this.chooseMusicText;
    }

    public final C20526p getHideMoreEvent() {
        return this.hideMoreEvent;
    }

    public final C20523m getMusicChooseState() {
        return this.musicChooseState;
    }

    public final C20526p getRefresh() {
        return this.refresh;
    }

    public final C20526p getRefreshAudioEnhanceIcon() {
        return this.refreshAudioEnhanceIcon;
    }

    public final List<C83395y> getTitleBarItems() {
        return this.titleBarItems;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f185700ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditToolbarState(AbstractC23517a aVar, Boolean bool, Boolean bool2, String str, List<C83395y> list, List<C83395y> list2, C20526p pVar, String str2, Drawable drawable, Integer num, Integer num2, C20526p pVar2, C20526p pVar3, C20523m mVar, C83131a aVar2, Boolean bool3) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f185700ui = aVar;
        this.backVisible = bool;
        this.backTipVisible = bool2;
        this.backTipText = str;
        this.titleBarItems = list;
        this.bottomBarItems = list2;
        this.hideMoreEvent = pVar;
        this.chooseMusicText = str2;
        this.chooseMusicIcon = drawable;
        this.topMargin = num;
        this.bottomHeight = num2;
        this.refresh = pVar2;
        this.refreshAudioEnhanceIcon = pVar3;
        this.musicChooseState = mVar;
        this.autoEnhanceStatus = aVar2;
        this.captionStatus = bool3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditToolbarState(AbstractC23517a aVar, Boolean bool, Boolean bool2, String str, List list, List list2, C20526p pVar, String str2, Drawable drawable, Integer num, Integer num2, C20526p pVar2, C20526p pVar3, C20523m mVar, C83131a aVar2, Boolean bool3, int i, C89214g gVar) {
        this(aVar, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : pVar, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : drawable, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : pVar2, (i & 4096) != 0 ? null : pVar3, (i & 8192) != 0 ? null : mVar, (i & 16384) != 0 ? null : aVar2, (i & 32768) == 0 ? bool3 : null);
    }
}
