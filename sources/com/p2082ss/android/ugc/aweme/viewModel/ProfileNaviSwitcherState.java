package com.p2082ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState */
public final class ProfileNaviSwitcherState implements AbstractC20368af {
    private boolean hasListBeenUpdated;
    private boolean hasMore;
    private boolean hasNaviChanged;
    private ArrayList<C60107b> naviList;
    private boolean shouldCreateNewNavi;

    static {
        Covode.recordClassIndex(94723);
    }

    public ProfileNaviSwitcherState() {
        this(null, false, false, false, false, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviSwitcherState copy$default(ProfileNaviSwitcherState profileNaviSwitcherState, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = profileNaviSwitcherState.naviList;
        }
        if ((i & 2) != 0) {
            z = profileNaviSwitcherState.hasMore;
        }
        if ((i & 4) != 0) {
            z2 = profileNaviSwitcherState.hasListBeenUpdated;
        }
        if ((i & 8) != 0) {
            z3 = profileNaviSwitcherState.hasNaviChanged;
        }
        if ((i & 16) != 0) {
            z4 = profileNaviSwitcherState.shouldCreateNewNavi;
        }
        return profileNaviSwitcherState.copy(arrayList, z, z2, z3, z4);
    }

    public final ArrayList<C60107b> component1() {
        return this.naviList;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final boolean component3() {
        return this.hasListBeenUpdated;
    }

    public final boolean component4() {
        return this.hasNaviChanged;
    }

    public final boolean component5() {
        return this.shouldCreateNewNavi;
    }

    public final ProfileNaviSwitcherState copy(ArrayList<C60107b> arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        C89219l.m154721d(arrayList, "");
        return new ProfileNaviSwitcherState(arrayList, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviSwitcherState)) {
            return false;
        }
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) obj;
        return C89219l.m154714a(this.naviList, profileNaviSwitcherState.naviList) && this.hasMore == profileNaviSwitcherState.hasMore && this.hasListBeenUpdated == profileNaviSwitcherState.hasListBeenUpdated && this.hasNaviChanged == profileNaviSwitcherState.hasNaviChanged && this.shouldCreateNewNavi == profileNaviSwitcherState.shouldCreateNewNavi;
    }

    public final int hashCode() {
        ArrayList<C60107b> arrayList = this.naviList;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        boolean z = this.hasMore;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.hasListBeenUpdated;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.hasNaviChanged;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        if (!this.shouldCreateNewNavi) {
            i = 0;
        }
        return i13 + i;
    }

    public final String toString() {
        return "ProfileNaviSwitcherState(naviList=" + this.naviList + ", hasMore=" + this.hasMore + ", hasListBeenUpdated=" + this.hasListBeenUpdated + ", hasNaviChanged=" + this.hasNaviChanged + ", shouldCreateNewNavi=" + this.shouldCreateNewNavi + ")";
    }

    public final boolean getHasListBeenUpdated() {
        return this.hasListBeenUpdated;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getHasNaviChanged() {
        return this.hasNaviChanged;
    }

    public final ArrayList<C60107b> getNaviList() {
        return this.naviList;
    }

    public final boolean getShouldCreateNewNavi() {
        return this.shouldCreateNewNavi;
    }

    public final void setHasListBeenUpdated(boolean z) {
        this.hasListBeenUpdated = z;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setHasNaviChanged(boolean z) {
        this.hasNaviChanged = z;
    }

    public final void setShouldCreateNewNavi(boolean z) {
        this.shouldCreateNewNavi = z;
    }

    public final void setNaviList(ArrayList<C60107b> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.naviList = arrayList;
    }

    public ProfileNaviSwitcherState(ArrayList<C60107b> arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        C89219l.m154721d(arrayList, "");
        this.naviList = arrayList;
        this.hasMore = z;
        this.hasListBeenUpdated = z2;
        this.hasNaviChanged = z3;
        this.shouldCreateNewNavi = z4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviSwitcherState(ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false);
    }
}
