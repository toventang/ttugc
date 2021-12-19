package com.p2082ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4519d.p4520a.p4522b.p4527e.C88024a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState */
public final class ProfileNaviCreatorState implements AbstractC20368af {
    private boolean isAnimationFileGenerated;
    private boolean isBackPressed;
    private boolean isContinueEditing;
    private boolean isDoneCreatingProfileImage;
    private C88024a newWorkRequest;
    private String profileImageBackgroundColor;
    private boolean shouldGenerateAnimation;
    private boolean shouldSetAsProfileImage;
    private boolean shouldShowSetProfileView;

    static {
        Covode.recordClassIndex(94630);
    }

    public ProfileNaviCreatorState() {
        this(null, false, false, false, false, false, false, false, null, 511, null);
    }

    public static /* synthetic */ ProfileNaviCreatorState copy$default(ProfileNaviCreatorState profileNaviCreatorState, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C88024a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviCreatorState.profileImageBackgroundColor;
        }
        if ((i & 2) != 0) {
            z = profileNaviCreatorState.isDoneCreatingProfileImage;
        }
        if ((i & 4) != 0) {
            z2 = profileNaviCreatorState.isBackPressed;
        }
        if ((i & 8) != 0) {
            z3 = profileNaviCreatorState.isContinueEditing;
        }
        if ((i & 16) != 0) {
            z4 = profileNaviCreatorState.shouldShowSetProfileView;
        }
        if ((i & 32) != 0) {
            z5 = profileNaviCreatorState.shouldGenerateAnimation;
        }
        if ((i & 64) != 0) {
            z6 = profileNaviCreatorState.shouldSetAsProfileImage;
        }
        if ((i & 128) != 0) {
            z7 = profileNaviCreatorState.isAnimationFileGenerated;
        }
        if ((i & 256) != 0) {
            aVar = profileNaviCreatorState.newWorkRequest;
        }
        return profileNaviCreatorState.copy(str, z, z2, z3, z4, z5, z6, z7, aVar);
    }

    public final String component1() {
        return this.profileImageBackgroundColor;
    }

    public final boolean component2() {
        return this.isDoneCreatingProfileImage;
    }

    public final boolean component3() {
        return this.isBackPressed;
    }

    public final boolean component4() {
        return this.isContinueEditing;
    }

    public final boolean component5() {
        return this.shouldShowSetProfileView;
    }

    public final boolean component6() {
        return this.shouldGenerateAnimation;
    }

    public final boolean component7() {
        return this.shouldSetAsProfileImage;
    }

    public final boolean component8() {
        return this.isAnimationFileGenerated;
    }

    public final C88024a component9() {
        return this.newWorkRequest;
    }

    public final ProfileNaviCreatorState copy(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C88024a aVar) {
        return new ProfileNaviCreatorState(str, z, z2, z3, z4, z5, z6, z7, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviCreatorState)) {
            return false;
        }
        ProfileNaviCreatorState profileNaviCreatorState = (ProfileNaviCreatorState) obj;
        return C89219l.m154714a(this.profileImageBackgroundColor, profileNaviCreatorState.profileImageBackgroundColor) && this.isDoneCreatingProfileImage == profileNaviCreatorState.isDoneCreatingProfileImage && this.isBackPressed == profileNaviCreatorState.isBackPressed && this.isContinueEditing == profileNaviCreatorState.isContinueEditing && this.shouldShowSetProfileView == profileNaviCreatorState.shouldShowSetProfileView && this.shouldGenerateAnimation == profileNaviCreatorState.shouldGenerateAnimation && this.shouldSetAsProfileImage == profileNaviCreatorState.shouldSetAsProfileImage && this.isAnimationFileGenerated == profileNaviCreatorState.isAnimationFileGenerated && C89219l.m154714a(this.newWorkRequest, profileNaviCreatorState.newWorkRequest);
    }

    public final int hashCode() {
        String str = this.profileImageBackgroundColor;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isDoneCreatingProfileImage;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.isBackPressed;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.isContinueEditing;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.shouldShowSetProfileView;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.shouldGenerateAnimation;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        boolean z6 = this.shouldSetAsProfileImage;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        if (!this.isAnimationFileGenerated) {
            i2 = 0;
        }
        int i27 = (i26 + i2) * 31;
        C88024a aVar = this.newWorkRequest;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i27 + i;
    }

    public final String toString() {
        return "ProfileNaviCreatorState(profileImageBackgroundColor=" + this.profileImageBackgroundColor + ", isDoneCreatingProfileImage=" + this.isDoneCreatingProfileImage + ", isBackPressed=" + this.isBackPressed + ", isContinueEditing=" + this.isContinueEditing + ", shouldShowSetProfileView=" + this.shouldShowSetProfileView + ", shouldGenerateAnimation=" + this.shouldGenerateAnimation + ", shouldSetAsProfileImage=" + this.shouldSetAsProfileImage + ", isAnimationFileGenerated=" + this.isAnimationFileGenerated + ", newWorkRequest=" + this.newWorkRequest + ")";
    }

    public final C88024a getNewWorkRequest() {
        return this.newWorkRequest;
    }

    public final String getProfileImageBackgroundColor() {
        return this.profileImageBackgroundColor;
    }

    public final boolean getShouldGenerateAnimation() {
        return this.shouldGenerateAnimation;
    }

    public final boolean getShouldSetAsProfileImage() {
        return this.shouldSetAsProfileImage;
    }

    public final boolean getShouldShowSetProfileView() {
        return this.shouldShowSetProfileView;
    }

    public final boolean isAnimationFileGenerated() {
        return this.isAnimationFileGenerated;
    }

    public final boolean isBackPressed() {
        return this.isBackPressed;
    }

    public final boolean isContinueEditing() {
        return this.isContinueEditing;
    }

    public final boolean isDoneCreatingProfileImage() {
        return this.isDoneCreatingProfileImage;
    }

    public final void setAnimationFileGenerated(boolean z) {
        this.isAnimationFileGenerated = z;
    }

    public final void setBackPressed(boolean z) {
        this.isBackPressed = z;
    }

    public final void setContinueEditing(boolean z) {
        this.isContinueEditing = z;
    }

    public final void setDoneCreatingProfileImage(boolean z) {
        this.isDoneCreatingProfileImage = z;
    }

    public final void setNewWorkRequest(C88024a aVar) {
        this.newWorkRequest = aVar;
    }

    public final void setProfileImageBackgroundColor(String str) {
        this.profileImageBackgroundColor = str;
    }

    public final void setShouldGenerateAnimation(boolean z) {
        this.shouldGenerateAnimation = z;
    }

    public final void setShouldSetAsProfileImage(boolean z) {
        this.shouldSetAsProfileImage = z;
    }

    public final void setShouldShowSetProfileView(boolean z) {
        this.shouldShowSetProfileView = z;
    }

    public ProfileNaviCreatorState(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C88024a aVar) {
        this.profileImageBackgroundColor = str;
        this.isDoneCreatingProfileImage = z;
        this.isBackPressed = z2;
        this.isContinueEditing = z3;
        this.shouldShowSetProfileView = z4;
        this.shouldGenerateAnimation = z5;
        this.shouldSetAsProfileImage = z6;
        this.isAnimationFileGenerated = z7;
        this.newWorkRequest = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviCreatorState(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C88024a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) == 0 ? z7 : false, (i & 256) == 0 ? aVar : null);
    }
}
