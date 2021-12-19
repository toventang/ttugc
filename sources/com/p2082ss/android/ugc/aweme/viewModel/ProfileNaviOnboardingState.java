package com.p2082ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.model.C60161t;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState */
public final class ProfileNaviOnboardingState implements AbstractC20368af {
    private C81391a onboardingStepState;
    private List<C60161t> starterAvatarList;
    private C60107b starterAvatarSelected;

    static {
        Covode.recordClassIndex(94702);
    }

    public ProfileNaviOnboardingState() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviOnboardingState copy$default(ProfileNaviOnboardingState profileNaviOnboardingState, C81391a aVar, List list, C60107b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = profileNaviOnboardingState.onboardingStepState;
        }
        if ((i & 2) != 0) {
            list = profileNaviOnboardingState.starterAvatarList;
        }
        if ((i & 4) != 0) {
            bVar = profileNaviOnboardingState.starterAvatarSelected;
        }
        return profileNaviOnboardingState.copy(aVar, list, bVar);
    }

    public final C81391a component1() {
        return this.onboardingStepState;
    }

    public final List<C60161t> component2() {
        return this.starterAvatarList;
    }

    public final C60107b component3() {
        return this.starterAvatarSelected;
    }

    public final ProfileNaviOnboardingState copy(C81391a aVar, List<C60161t> list, C60107b bVar) {
        C89219l.m154721d(aVar, "");
        return new ProfileNaviOnboardingState(aVar, list, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviOnboardingState)) {
            return false;
        }
        ProfileNaviOnboardingState profileNaviOnboardingState = (ProfileNaviOnboardingState) obj;
        return C89219l.m154714a(this.onboardingStepState, profileNaviOnboardingState.onboardingStepState) && C89219l.m154714a(this.starterAvatarList, profileNaviOnboardingState.starterAvatarList) && C89219l.m154714a(this.starterAvatarSelected, profileNaviOnboardingState.starterAvatarSelected);
    }

    public final int hashCode() {
        C81391a aVar = this.onboardingStepState;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<C60161t> list = this.starterAvatarList;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C60107b bVar = this.starterAvatarSelected;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ProfileNaviOnboardingState(onboardingStepState=" + this.onboardingStepState + ", starterAvatarList=" + this.starterAvatarList + ", starterAvatarSelected=" + this.starterAvatarSelected + ")";
    }

    public final C81391a getOnboardingStepState() {
        return this.onboardingStepState;
    }

    public final List<C60161t> getStarterAvatarList() {
        return this.starterAvatarList;
    }

    public final C60107b getStarterAvatarSelected() {
        return this.starterAvatarSelected;
    }

    public final void setStarterAvatarList(List<C60161t> list) {
        this.starterAvatarList = list;
    }

    public final void setStarterAvatarSelected(C60107b bVar) {
        this.starterAvatarSelected = bVar;
    }

    public final void setOnboardingStepState(C81391a aVar) {
        C89219l.m154721d(aVar, "");
        this.onboardingStepState = aVar;
    }

    public ProfileNaviOnboardingState(C81391a aVar, List<C60161t> list, C60107b bVar) {
        C89219l.m154721d(aVar, "");
        this.onboardingStepState = aVar;
        this.starterAvatarList = list;
        this.starterAvatarSelected = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviOnboardingState(C81391a aVar, List list, C60107b bVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new C81391a(null, 3) : aVar, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bVar);
    }
}
