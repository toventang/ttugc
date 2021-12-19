package com.p2082ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.common.C39219x;
import com.p2082ss.android.ugc.aweme.common.C39220y;
import com.p2082ss.android.ugc.aweme.model.AbstractC60142d;
import com.p2082ss.android.ugc.aweme.model.AbstractC60162u;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState */
public final class ProfileNaviEditorState implements AbstractC20368af {
    private boolean animationStarted;
    private C39220y currentMessage;
    private C39219x editCategory;
    private String headStickerPath;
    private boolean isDoneEditing;
    private boolean isQuitEditing;
    private boolean naviDoneLoading;
    private List<? extends AbstractC60142d> parentCategoryList;
    private boolean setUpConfigChanged;
    private List<? extends AbstractC60162u> tabList;

    static {
        Covode.recordClassIndex(94659);
    }

    public ProfileNaviEditorState() {
        this(null, null, null, null, null, false, false, false, false, false, 1023, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviEditorState copy$default(ProfileNaviEditorState profileNaviEditorState, List list, List list2, C39220y yVar, String str, C39219x xVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = profileNaviEditorState.tabList;
        }
        if ((i & 2) != 0) {
            list2 = profileNaviEditorState.parentCategoryList;
        }
        if ((i & 4) != 0) {
            yVar = profileNaviEditorState.currentMessage;
        }
        if ((i & 8) != 0) {
            str = profileNaviEditorState.headStickerPath;
        }
        if ((i & 16) != 0) {
            xVar = profileNaviEditorState.editCategory;
        }
        if ((i & 32) != 0) {
            z = profileNaviEditorState.naviDoneLoading;
        }
        if ((i & 64) != 0) {
            z2 = profileNaviEditorState.animationStarted;
        }
        if ((i & 128) != 0) {
            z3 = profileNaviEditorState.isDoneEditing;
        }
        if ((i & 256) != 0) {
            z4 = profileNaviEditorState.isQuitEditing;
        }
        if ((i & 512) != 0) {
            z5 = profileNaviEditorState.setUpConfigChanged;
        }
        return profileNaviEditorState.copy(list, list2, yVar, str, xVar, z, z2, z3, z4, z5);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.model.u>, java.util.List<com.ss.android.ugc.aweme.model.u> */
    public final List<AbstractC60162u> component1() {
        return this.tabList;
    }

    public final boolean component10() {
        return this.setUpConfigChanged;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.model.d>, java.util.List<com.ss.android.ugc.aweme.model.d> */
    public final List<AbstractC60142d> component2() {
        return this.parentCategoryList;
    }

    public final C39220y component3() {
        return this.currentMessage;
    }

    public final String component4() {
        return this.headStickerPath;
    }

    public final C39219x component5() {
        return this.editCategory;
    }

    public final boolean component6() {
        return this.naviDoneLoading;
    }

    public final boolean component7() {
        return this.animationStarted;
    }

    public final boolean component8() {
        return this.isDoneEditing;
    }

    public final boolean component9() {
        return this.isQuitEditing;
    }

    public final ProfileNaviEditorState copy(List<? extends AbstractC60162u> list, List<? extends AbstractC60142d> list2, C39220y yVar, String str, C39219x xVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new ProfileNaviEditorState(list, list2, yVar, str, xVar, z, z2, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviEditorState)) {
            return false;
        }
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) obj;
        return C89219l.m154714a(this.tabList, profileNaviEditorState.tabList) && C89219l.m154714a(this.parentCategoryList, profileNaviEditorState.parentCategoryList) && C89219l.m154714a(this.currentMessage, profileNaviEditorState.currentMessage) && C89219l.m154714a(this.headStickerPath, profileNaviEditorState.headStickerPath) && C89219l.m154714a(this.editCategory, profileNaviEditorState.editCategory) && this.naviDoneLoading == profileNaviEditorState.naviDoneLoading && this.animationStarted == profileNaviEditorState.animationStarted && this.isDoneEditing == profileNaviEditorState.isDoneEditing && this.isQuitEditing == profileNaviEditorState.isQuitEditing && this.setUpConfigChanged == profileNaviEditorState.setUpConfigChanged;
    }

    public final int hashCode() {
        List<? extends AbstractC60162u> list = this.tabList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<? extends AbstractC60142d> list2 = this.parentCategoryList;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        C39220y yVar = this.currentMessage;
        int hashCode3 = (hashCode2 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        String str = this.headStickerPath;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        C39219x xVar = this.editCategory;
        if (xVar != null) {
            i = xVar.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.naviDoneLoading;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.animationStarted;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.isDoneEditing;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.isQuitEditing;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        if (!this.setUpConfigChanged) {
            i3 = 0;
        }
        return i19 + i3;
    }

    public final String toString() {
        return "ProfileNaviEditorState(tabList=" + this.tabList + ", parentCategoryList=" + this.parentCategoryList + ", currentMessage=" + this.currentMessage + ", headStickerPath=" + this.headStickerPath + ", editCategory=" + this.editCategory + ", naviDoneLoading=" + this.naviDoneLoading + ", animationStarted=" + this.animationStarted + ", isDoneEditing=" + this.isDoneEditing + ", isQuitEditing=" + this.isQuitEditing + ", setUpConfigChanged=" + this.setUpConfigChanged + ")";
    }

    public final boolean getAnimationStarted() {
        return this.animationStarted;
    }

    public final C39220y getCurrentMessage() {
        return this.currentMessage;
    }

    public final C39219x getEditCategory() {
        return this.editCategory;
    }

    public final String getHeadStickerPath() {
        return this.headStickerPath;
    }

    public final boolean getNaviDoneLoading() {
        return this.naviDoneLoading;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.model.d>, java.util.List<com.ss.android.ugc.aweme.model.d> */
    public final List<AbstractC60142d> getParentCategoryList() {
        return this.parentCategoryList;
    }

    public final boolean getSetUpConfigChanged() {
        return this.setUpConfigChanged;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.model.u>, java.util.List<com.ss.android.ugc.aweme.model.u> */
    public final List<AbstractC60162u> getTabList() {
        return this.tabList;
    }

    public final boolean isDoneEditing() {
        return this.isDoneEditing;
    }

    public final boolean isQuitEditing() {
        return this.isQuitEditing;
    }

    public final void setAnimationStarted(boolean z) {
        this.animationStarted = z;
    }

    public final void setCurrentMessage(C39220y yVar) {
        this.currentMessage = yVar;
    }

    public final void setDoneEditing(boolean z) {
        this.isDoneEditing = z;
    }

    public final void setEditCategory(C39219x xVar) {
        this.editCategory = xVar;
    }

    public final void setHeadStickerPath(String str) {
        this.headStickerPath = str;
    }

    public final void setNaviDoneLoading(boolean z) {
        this.naviDoneLoading = z;
    }

    public final void setParentCategoryList(List<? extends AbstractC60142d> list) {
        this.parentCategoryList = list;
    }

    public final void setQuitEditing(boolean z) {
        this.isQuitEditing = z;
    }

    public final void setSetUpConfigChanged(boolean z) {
        this.setUpConfigChanged = z;
    }

    public final void setTabList(List<? extends AbstractC60162u> list) {
        this.tabList = list;
    }

    public ProfileNaviEditorState(List<? extends AbstractC60162u> list, List<? extends AbstractC60142d> list2, C39220y yVar, String str, C39219x xVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.tabList = list;
        this.parentCategoryList = list2;
        this.currentMessage = yVar;
        this.headStickerPath = str;
        this.editCategory = xVar;
        this.naviDoneLoading = z;
        this.animationStarted = z2;
        this.isDoneEditing = z3;
        this.isQuitEditing = z4;
        this.setUpConfigChanged = z5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviEditorState(List list, List list2, C39220y yVar, String str, C39219x xVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : yVar, (i & 8) != 0 ? null : str, (i & 16) == 0 ? xVar : null, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) == 0 ? z5 : false);
    }
}
