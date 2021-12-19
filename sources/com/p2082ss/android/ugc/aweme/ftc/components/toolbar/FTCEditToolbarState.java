package com.p2082ss.android.ugc.aweme.ftc.components.toolbar;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.gamora.editor.C83395y;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState */
public final class FTCEditToolbarState extends UiState {
    private final String backTipText;
    private final Boolean backTipVisible;
    private final Boolean backVisible;
    private final List<C83395y> bottomBarItems;
    private final Integer bottomHeight;
    private final Drawable chooseMusicIcon;
    private final String chooseMusicText;
    private final C20526p hideMoreEvent;
    private final List<C83395y> titleBarItems;
    private final Integer topMargin;

    /* renamed from: ui */
    private final AbstractC23517a f120624ui;

    static {
        Covode.recordClassIndex(61751);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditToolbarState copy$default(FTCEditToolbarState fTCEditToolbarState, AbstractC23517a aVar, Boolean bool, Boolean bool2, String str, List list, List list2, C20526p pVar, String str2, Drawable drawable, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = fTCEditToolbarState.getUi();
        }
        if ((i & 2) != 0) {
            bool = fTCEditToolbarState.backVisible;
        }
        if ((i & 4) != 0) {
            bool2 = fTCEditToolbarState.backTipVisible;
        }
        if ((i & 8) != 0) {
            str = fTCEditToolbarState.backTipText;
        }
        if ((i & 16) != 0) {
            list = fTCEditToolbarState.titleBarItems;
        }
        if ((i & 32) != 0) {
            list2 = fTCEditToolbarState.bottomBarItems;
        }
        if ((i & 64) != 0) {
            pVar = fTCEditToolbarState.hideMoreEvent;
        }
        if ((i & 128) != 0) {
            str2 = fTCEditToolbarState.chooseMusicText;
        }
        if ((i & 256) != 0) {
            drawable = fTCEditToolbarState.chooseMusicIcon;
        }
        if ((i & 512) != 0) {
            num = fTCEditToolbarState.topMargin;
        }
        if ((i & 1024) != 0) {
            num2 = fTCEditToolbarState.bottomHeight;
        }
        return fTCEditToolbarState.copy(aVar, bool, bool2, str, list, list2, pVar, str2, drawable, num, num2);
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

    public final FTCEditToolbarState copy(AbstractC23517a aVar, Boolean bool, Boolean bool2, String str, List<C83395y> list, List<C83395y> list2, C20526p pVar, String str2, Drawable drawable, Integer num, Integer num2) {
        C89219l.m154721d(aVar, "");
        return new FTCEditToolbarState(aVar, bool, bool2, str, list, list2, pVar, str2, drawable, num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditToolbarState)) {
            return false;
        }
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return C89219l.m154714a(getUi(), fTCEditToolbarState.getUi()) && C89219l.m154714a(this.backVisible, fTCEditToolbarState.backVisible) && C89219l.m154714a(this.backTipVisible, fTCEditToolbarState.backTipVisible) && C89219l.m154714a(this.backTipText, fTCEditToolbarState.backTipText) && C89219l.m154714a(this.titleBarItems, fTCEditToolbarState.titleBarItems) && C89219l.m154714a(this.bottomBarItems, fTCEditToolbarState.bottomBarItems) && C89219l.m154714a(this.hideMoreEvent, fTCEditToolbarState.hideMoreEvent) && C89219l.m154714a(this.chooseMusicText, fTCEditToolbarState.chooseMusicText) && C89219l.m154714a(this.chooseMusicIcon, fTCEditToolbarState.chooseMusicIcon) && C89219l.m154714a(this.topMargin, fTCEditToolbarState.topMargin) && C89219l.m154714a(this.bottomHeight, fTCEditToolbarState.bottomHeight);
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
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        return "FTCEditToolbarState(ui=" + getUi() + ", backVisible=" + this.backVisible + ", backTipVisible=" + this.backTipVisible + ", backTipText=" + this.backTipText + ", titleBarItems=" + this.titleBarItems + ", bottomBarItems=" + this.bottomBarItems + ", hideMoreEvent=" + this.hideMoreEvent + ", chooseMusicText=" + this.chooseMusicText + ", chooseMusicIcon=" + this.chooseMusicIcon + ", topMargin=" + this.topMargin + ", bottomHeight=" + this.bottomHeight + ")";
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

    public final Drawable getChooseMusicIcon() {
        return this.chooseMusicIcon;
    }

    public final String getChooseMusicText() {
        return this.chooseMusicText;
    }

    public final C20526p getHideMoreEvent() {
        return this.hideMoreEvent;
    }

    public final List<C83395y> getTitleBarItems() {
        return this.titleBarItems;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f120624ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditToolbarState(AbstractC23517a aVar, Boolean bool, Boolean bool2, String str, List<C83395y> list, List<C83395y> list2, C20526p pVar, String str2, Drawable drawable, Integer num, Integer num2) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f120624ui = aVar;
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
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditToolbarState(AbstractC23517a aVar, Boolean bool, Boolean bool2, String str, List list, List list2, C20526p pVar, String str2, Drawable drawable, Integer num, Integer num2, int i, C89214g gVar) {
        this(aVar, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : pVar, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : drawable, (i & 512) != 0 ? null : num, (i & 1024) == 0 ? num2 : null);
    }
}
