package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.ClaCrowdsourcingEntrypoints */
public final class ClaCrowdsourcingEntrypoints {
    @AbstractC27891c(mo46611a = "is_enrolled")
    private boolean isEnrolled;
    @AbstractC27891c(mo46611a = "is_opt_out")
    private boolean isOptOut;
    @AbstractC27891c(mo46611a = "is_targeted_user")
    private boolean isTargetedUser;
    @AbstractC27891c(mo46611a = "pass_ags")
    private boolean passAgs;
    @AbstractC27891c(mo46611a = "subtitle_type")
    private C46984gq subtitleType;

    static {
        Covode.recordClassIndex(55268);
    }

    public ClaCrowdsourcingEntrypoints() {
        this(false, false, false, false, null, 31, null);
    }

    private final boolean component1() {
        return this.isEnrolled;
    }

    public static /* synthetic */ ClaCrowdsourcingEntrypoints copy$default(ClaCrowdsourcingEntrypoints claCrowdsourcingEntrypoints, boolean z, boolean z2, boolean z3, boolean z4, C46984gq gqVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = claCrowdsourcingEntrypoints.isEnrolled;
        }
        if ((i & 2) != 0) {
            z2 = claCrowdsourcingEntrypoints.isOptOut;
        }
        if ((i & 4) != 0) {
            z3 = claCrowdsourcingEntrypoints.isTargetedUser;
        }
        if ((i & 8) != 0) {
            z4 = claCrowdsourcingEntrypoints.passAgs;
        }
        if ((i & 16) != 0) {
            gqVar = claCrowdsourcingEntrypoints.subtitleType;
        }
        return claCrowdsourcingEntrypoints.copy(z, z2, z3, z4, gqVar);
    }

    public final boolean component2() {
        return this.isOptOut;
    }

    public final boolean component3() {
        return this.isTargetedUser;
    }

    public final boolean component4() {
        return this.passAgs;
    }

    public final C46984gq component5() {
        return this.subtitleType;
    }

    public final ClaCrowdsourcingEntrypoints copy(boolean z, boolean z2, boolean z3, boolean z4, C46984gq gqVar) {
        C89219l.m154721d(gqVar, "");
        return new ClaCrowdsourcingEntrypoints(z, z2, z3, z4, gqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaCrowdsourcingEntrypoints)) {
            return false;
        }
        ClaCrowdsourcingEntrypoints claCrowdsourcingEntrypoints = (ClaCrowdsourcingEntrypoints) obj;
        return this.isEnrolled == claCrowdsourcingEntrypoints.isEnrolled && this.isOptOut == claCrowdsourcingEntrypoints.isOptOut && this.isTargetedUser == claCrowdsourcingEntrypoints.isTargetedUser && this.passAgs == claCrowdsourcingEntrypoints.passAgs && C89219l.m154714a(this.subtitleType, claCrowdsourcingEntrypoints.subtitleType);
    }

    public final int hashCode() {
        boolean z = this.isEnrolled;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.isOptOut;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.isTargetedUser;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        if (!this.passAgs) {
            i = 0;
        }
        int i14 = (i13 + i) * 31;
        C46984gq gqVar = this.subtitleType;
        return i14 + (gqVar != null ? gqVar.hashCode() : 0);
    }

    public final String toString() {
        return "ClaCrowdsourcingEntrypoints(isEnrolled=" + this.isEnrolled + ", isOptOut=" + this.isOptOut + ", isTargetedUser=" + this.isTargetedUser + ", passAgs=" + this.passAgs + ", subtitleType=" + this.subtitleType + ")";
    }

    public final boolean getPassAgs() {
        return this.passAgs;
    }

    public final C46984gq getSubtitleType() {
        return this.subtitleType;
    }

    public final boolean isOptOut() {
        return this.isOptOut;
    }

    public final boolean isTargetedUser() {
        return this.isTargetedUser;
    }

    public final boolean isEnrolled() {
        if (C47036n.f109585a || this.isEnrolled) {
            return true;
        }
        return false;
    }

    public final void setOptOut(boolean z) {
        this.isOptOut = z;
    }

    public final void setPassAgs(boolean z) {
        this.passAgs = z;
    }

    public final void setTargetedUser(boolean z) {
        this.isTargetedUser = z;
    }

    public final void setSubtitleType(C46984gq gqVar) {
        C89219l.m154721d(gqVar, "");
        this.subtitleType = gqVar;
    }

    public ClaCrowdsourcingEntrypoints(boolean z, boolean z2, boolean z3, boolean z4, C46984gq gqVar) {
        C89219l.m154721d(gqVar, "");
        this.isEnrolled = z;
        this.isOptOut = z2;
        this.isTargetedUser = z3;
        this.passAgs = z4;
        this.subtitleType = gqVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClaCrowdsourcingEntrypoints(boolean z, boolean z2, boolean z3, boolean z4, C46984gq gqVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? new C46984gq() : gqVar);
    }
}
