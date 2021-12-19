package com.p2082ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState */
public final class ProfileNaviHubState implements AbstractC20368af {
    private boolean isContinueEditing;
    private boolean isCreateNewAvatar;
    private boolean isCreateProfileImage;
    private boolean isDoneCreatingProfileImage;
    private boolean isDoneNaviExperience;
    private boolean isNaviDeleted;
    private boolean isShowHub;
    private boolean shouldShowSwitcher;

    static {
        Covode.recordClassIndex(94685);
    }

    public ProfileNaviHubState() {
        this(false, false, false, false, false, false, false, false, 255, null);
    }

    public static /* synthetic */ ProfileNaviHubState copy$default(ProfileNaviHubState profileNaviHubState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z = profileNaviHubState.isCreateProfileImage;
        }
        if ((i & 2) != 0) {
            z2 = profileNaviHubState.isDoneCreatingProfileImage;
        }
        if ((i & 4) != 0) {
            z3 = profileNaviHubState.isContinueEditing;
        }
        if ((i & 8) != 0) {
            z4 = profileNaviHubState.isDoneNaviExperience;
        }
        if ((i & 16) != 0) {
            z5 = profileNaviHubState.isNaviDeleted;
        }
        if ((i & 32) != 0) {
            z6 = profileNaviHubState.isCreateNewAvatar;
        }
        if ((i & 64) != 0) {
            z7 = profileNaviHubState.isShowHub;
        }
        if ((i & 128) != 0) {
            z8 = profileNaviHubState.shouldShowSwitcher;
        }
        return profileNaviHubState.copy(z, z2, z3, z4, z5, z6, z7, z8);
    }

    public final boolean component1() {
        return this.isCreateProfileImage;
    }

    public final boolean component2() {
        return this.isDoneCreatingProfileImage;
    }

    public final boolean component3() {
        return this.isContinueEditing;
    }

    public final boolean component4() {
        return this.isDoneNaviExperience;
    }

    public final boolean component5() {
        return this.isNaviDeleted;
    }

    public final boolean component6() {
        return this.isCreateNewAvatar;
    }

    public final boolean component7() {
        return this.isShowHub;
    }

    public final boolean component8() {
        return this.shouldShowSwitcher;
    }

    public final ProfileNaviHubState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        return new ProfileNaviHubState(z, z2, z3, z4, z5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviHubState)) {
            return false;
        }
        ProfileNaviHubState profileNaviHubState = (ProfileNaviHubState) obj;
        return this.isCreateProfileImage == profileNaviHubState.isCreateProfileImage && this.isDoneCreatingProfileImage == profileNaviHubState.isDoneCreatingProfileImage && this.isContinueEditing == profileNaviHubState.isContinueEditing && this.isDoneNaviExperience == profileNaviHubState.isDoneNaviExperience && this.isNaviDeleted == profileNaviHubState.isNaviDeleted && this.isCreateNewAvatar == profileNaviHubState.isCreateNewAvatar && this.isShowHub == profileNaviHubState.isShowHub && this.shouldShowSwitcher == profileNaviHubState.shouldShowSwitcher;
    }

    public final int hashCode() {
        boolean z = this.isCreateProfileImage;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.isDoneCreatingProfileImage;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.isContinueEditing;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.isDoneNaviExperience;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        boolean z5 = this.isNaviDeleted;
        if (z5) {
            z5 = true;
        }
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        boolean z6 = this.isCreateNewAvatar;
        if (z6) {
            z6 = true;
        }
        int i22 = z6 ? 1 : 0;
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = (i21 + i22) * 31;
        boolean z7 = this.isShowHub;
        if (z7) {
            z7 = true;
        }
        int i26 = z7 ? 1 : 0;
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = (i25 + i26) * 31;
        if (!this.shouldShowSwitcher) {
            i = 0;
        }
        return i29 + i;
    }

    public final String toString() {
        return "ProfileNaviHubState(isCreateProfileImage=" + this.isCreateProfileImage + ", isDoneCreatingProfileImage=" + this.isDoneCreatingProfileImage + ", isContinueEditing=" + this.isContinueEditing + ", isDoneNaviExperience=" + this.isDoneNaviExperience + ", isNaviDeleted=" + this.isNaviDeleted + ", isCreateNewAvatar=" + this.isCreateNewAvatar + ", isShowHub=" + this.isShowHub + ", shouldShowSwitcher=" + this.shouldShowSwitcher + ")";
    }

    public final boolean getShouldShowSwitcher() {
        return this.shouldShowSwitcher;
    }

    public final boolean isContinueEditing() {
        return this.isContinueEditing;
    }

    public final boolean isCreateNewAvatar() {
        return this.isCreateNewAvatar;
    }

    public final boolean isCreateProfileImage() {
        return this.isCreateProfileImage;
    }

    public final boolean isDoneCreatingProfileImage() {
        return this.isDoneCreatingProfileImage;
    }

    public final boolean isDoneNaviExperience() {
        return this.isDoneNaviExperience;
    }

    public final boolean isNaviDeleted() {
        return this.isNaviDeleted;
    }

    public final boolean isShowHub() {
        return this.isShowHub;
    }

    public final void setContinueEditing(boolean z) {
        this.isContinueEditing = z;
    }

    public final void setCreateNewAvatar(boolean z) {
        this.isCreateNewAvatar = z;
    }

    public final void setCreateProfileImage(boolean z) {
        this.isCreateProfileImage = z;
    }

    public final void setDoneCreatingProfileImage(boolean z) {
        this.isDoneCreatingProfileImage = z;
    }

    public final void setDoneNaviExperience(boolean z) {
        this.isDoneNaviExperience = z;
    }

    public final void setNaviDeleted(boolean z) {
        this.isNaviDeleted = z;
    }

    public final void setShouldShowSwitcher(boolean z) {
        this.shouldShowSwitcher = z;
    }

    public final void setShowHub(boolean z) {
        this.isShowHub = z;
    }

    public ProfileNaviHubState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.isCreateProfileImage = z;
        this.isDoneCreatingProfileImage = z2;
        this.isContinueEditing = z3;
        this.isDoneNaviExperience = z4;
        this.isNaviDeleted = z5;
        this.isCreateNewAvatar = z6;
        this.isShowHub = z7;
        this.shouldShowSwitcher = z8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviHubState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) == 0 ? z8 : false);
    }
}
