package com.p2082ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerState */
public final class ProfileNaviSpinnerState implements AbstractC20368af {
    private boolean shouldShowSpinner;

    static {
        Covode.recordClassIndex(94719);
    }

    public ProfileNaviSpinnerState() {
        this(false, 1, null);
    }

    public static /* synthetic */ ProfileNaviSpinnerState copy$default(ProfileNaviSpinnerState profileNaviSpinnerState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = profileNaviSpinnerState.shouldShowSpinner;
        }
        return profileNaviSpinnerState.copy(z);
    }

    public final boolean component1() {
        return this.shouldShowSpinner;
    }

    public final ProfileNaviSpinnerState copy(boolean z) {
        return new ProfileNaviSpinnerState(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ProfileNaviSpinnerState) && this.shouldShowSpinner == ((ProfileNaviSpinnerState) obj).shouldShowSpinner;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.shouldShowSpinner;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "ProfileNaviSpinnerState(shouldShowSpinner=" + this.shouldShowSpinner + ")";
    }

    public final boolean getShouldShowSpinner() {
        return this.shouldShowSpinner;
    }

    public final void setShouldShowSpinner(boolean z) {
        this.shouldShowSpinner = z;
    }

    public ProfileNaviSpinnerState(boolean z) {
        this.shouldShowSpinner = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviSpinnerState(boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z);
    }
}
