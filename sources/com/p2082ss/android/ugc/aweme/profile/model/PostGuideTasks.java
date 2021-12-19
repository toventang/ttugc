package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.profile.model.PostGuideTasks */
public final class PostGuideTasks {
    public final int followCountFromRecommend;
    public final boolean isFollowTaskDone;
    public final boolean isProfileTaskDone;
    public final boolean isShootTaskDone;

    static {
        Covode.recordClassIndex(75195);
    }

    /* renamed from: com_ss_android_ugc_aweme_profile_model_PostGuideTasks_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m115454xaa82208d(int i) {
        return i;
    }

    public static /* synthetic */ PostGuideTasks copy$default(PostGuideTasks postGuideTasks, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = postGuideTasks.isFollowTaskDone;
        }
        if ((i2 & 2) != 0) {
            z2 = postGuideTasks.isShootTaskDone;
        }
        if ((i2 & 4) != 0) {
            z3 = postGuideTasks.isProfileTaskDone;
        }
        if ((i2 & 8) != 0) {
            i = postGuideTasks.followCountFromRecommend;
        }
        return postGuideTasks.copy(z, z2, z3, i);
    }

    public final PostGuideTasks copy(boolean z, boolean z2, boolean z3, int i) {
        return new PostGuideTasks(z, z2, z3, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostGuideTasks)) {
            return false;
        }
        PostGuideTasks postGuideTasks = (PostGuideTasks) obj;
        return this.isFollowTaskDone == postGuideTasks.isFollowTaskDone && this.isShootTaskDone == postGuideTasks.isShootTaskDone && this.isProfileTaskDone == postGuideTasks.isProfileTaskDone && this.followCountFromRecommend == postGuideTasks.followCountFromRecommend;
    }

    public final int hashCode() {
        boolean z = this.isFollowTaskDone;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.isShootTaskDone;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.isProfileTaskDone) {
            i = 0;
        }
        return ((i9 + i) * 31) + m115454xaa82208d(this.followCountFromRecommend);
    }

    public final String toString() {
        return "PostGuideTasks(isFollowTaskDone=" + this.isFollowTaskDone + ", isShootTaskDone=" + this.isShootTaskDone + ", isProfileTaskDone=" + this.isProfileTaskDone + ", followCountFromRecommend=" + this.followCountFromRecommend + ")";
    }

    public final boolean allAccomplish() {
        if (!this.isFollowTaskDone || !this.isShootTaskDone || !this.isProfileTaskDone) {
            return false;
        }
        return true;
    }

    public final int taskCountDone() {
        return (this.isFollowTaskDone ? 1 : 0) + (this.isShootTaskDone ? 1 : 0) + (this.isProfileTaskDone ? 1 : 0);
    }

    public PostGuideTasks(boolean z, boolean z2, boolean z3, int i) {
        this.isFollowTaskDone = z;
        this.isShootTaskDone = z2;
        this.isProfileTaskDone = z3;
        this.followCountFromRecommend = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostGuideTasks(boolean z, boolean z2, boolean z3, int i, int i2, C89214g gVar) {
        this(z, z2, z3, (i2 & 8) != 0 ? 0 : i);
    }
}
