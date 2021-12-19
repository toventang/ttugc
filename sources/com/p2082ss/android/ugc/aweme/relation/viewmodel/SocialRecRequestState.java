package com.p2082ss.android.ugc.aweme.relation.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState */
public final class SocialRecRequestState implements AbstractC20368af {
    private final FriendList<? extends User> friends;
    private final boolean isNeedActualPopUp;
    private final int isNewVersionSynced;
    private final boolean isOverStayTime;
    private final boolean isSkipByCancel;
    private final boolean isSkipByEmptyData;
    private final boolean isSkipByException;
    private final boolean isSync;
    private final boolean needNewVersionRecShow;
    private final int newVersionSyncClick;

    static {
        Covode.recordClassIndex(78625);
    }

    public SocialRecRequestState() {
        this(false, false, false, false, false, false, null, 0, 0, false, 1023, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_relation_viewmodel_SocialRecRequestState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m118741xbf3abb96(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialRecRequestState copy$default(SocialRecRequestState socialRecRequestState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList friendList, int i, int i2, boolean z7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = socialRecRequestState.isSkipByException;
        }
        if ((i3 & 2) != 0) {
            z2 = socialRecRequestState.isSkipByEmptyData;
        }
        if ((i3 & 4) != 0) {
            z3 = socialRecRequestState.isSkipByCancel;
        }
        if ((i3 & 8) != 0) {
            z4 = socialRecRequestState.isSync;
        }
        if ((i3 & 16) != 0) {
            z5 = socialRecRequestState.isOverStayTime;
        }
        if ((i3 & 32) != 0) {
            z6 = socialRecRequestState.isNeedActualPopUp;
        }
        if ((i3 & 64) != 0) {
            friendList = socialRecRequestState.friends;
        }
        if ((i3 & 128) != 0) {
            i = socialRecRequestState.newVersionSyncClick;
        }
        if ((i3 & 256) != 0) {
            i2 = socialRecRequestState.isNewVersionSynced;
        }
        if ((i3 & 512) != 0) {
            z7 = socialRecRequestState.needNewVersionRecShow;
        }
        return socialRecRequestState.copy(z, z2, z3, z4, z5, z6, friendList, i, i2, z7);
    }

    public final boolean component1() {
        return this.isSkipByException;
    }

    public final boolean component10() {
        return this.needNewVersionRecShow;
    }

    public final boolean component2() {
        return this.isSkipByEmptyData;
    }

    public final boolean component3() {
        return this.isSkipByCancel;
    }

    public final boolean component4() {
        return this.isSync;
    }

    public final boolean component5() {
        return this.isOverStayTime;
    }

    public final boolean component6() {
        return this.isNeedActualPopUp;
    }

    public final FriendList<? extends User> component7() {
        return this.friends;
    }

    public final int component8() {
        return this.newVersionSyncClick;
    }

    public final int component9() {
        return this.isNewVersionSynced;
    }

    public final SocialRecRequestState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList<? extends User> friendList, int i, int i2, boolean z7) {
        return new SocialRecRequestState(z, z2, z3, z4, z5, z6, friendList, i, i2, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialRecRequestState)) {
            return false;
        }
        SocialRecRequestState socialRecRequestState = (SocialRecRequestState) obj;
        return this.isSkipByException == socialRecRequestState.isSkipByException && this.isSkipByEmptyData == socialRecRequestState.isSkipByEmptyData && this.isSkipByCancel == socialRecRequestState.isSkipByCancel && this.isSync == socialRecRequestState.isSync && this.isOverStayTime == socialRecRequestState.isOverStayTime && this.isNeedActualPopUp == socialRecRequestState.isNeedActualPopUp && C89219l.m154714a(this.friends, socialRecRequestState.friends) && this.newVersionSyncClick == socialRecRequestState.newVersionSyncClick && this.isNewVersionSynced == socialRecRequestState.isNewVersionSynced && this.needNewVersionRecShow == socialRecRequestState.needNewVersionRecShow;
    }

    public final int hashCode() {
        boolean z = this.isSkipByException;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.isSkipByEmptyData;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.isSkipByCancel;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.isSync;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        boolean z5 = this.isOverStayTime;
        if (z5) {
            z5 = true;
        }
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        boolean z6 = this.isNeedActualPopUp;
        if (z6) {
            z6 = true;
        }
        int i22 = z6 ? 1 : 0;
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = (i21 + i22) * 31;
        FriendList<? extends User> friendList = this.friends;
        int hashCode = (((((i25 + (friendList != null ? friendList.hashCode() : 0)) * 31) + m118741xbf3abb96(this.newVersionSyncClick)) * 31) + m118741xbf3abb96(this.isNewVersionSynced)) * 31;
        if (!this.needNewVersionRecShow) {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SocialRecRequestState(isSkipByException=" + this.isSkipByException + ", isSkipByEmptyData=" + this.isSkipByEmptyData + ", isSkipByCancel=" + this.isSkipByCancel + ", isSync=" + this.isSync + ", isOverStayTime=" + this.isOverStayTime + ", isNeedActualPopUp=" + this.isNeedActualPopUp + ", friends=" + this.friends + ", newVersionSyncClick=" + this.newVersionSyncClick + ", isNewVersionSynced=" + this.isNewVersionSynced + ", needNewVersionRecShow=" + this.needNewVersionRecShow + ")";
    }

    public final FriendList<? extends User> getFriends() {
        return this.friends;
    }

    public final boolean getNeedNewVersionRecShow() {
        return this.needNewVersionRecShow;
    }

    public final int getNewVersionSyncClick() {
        return this.newVersionSyncClick;
    }

    public final boolean isNeedActualPopUp() {
        return this.isNeedActualPopUp;
    }

    public final int isNewVersionSynced() {
        return this.isNewVersionSynced;
    }

    public final boolean isOverStayTime() {
        return this.isOverStayTime;
    }

    public final boolean isSkipByCancel() {
        return this.isSkipByCancel;
    }

    public final boolean isSkipByEmptyData() {
        return this.isSkipByEmptyData;
    }

    public final boolean isSkipByException() {
        return this.isSkipByException;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public SocialRecRequestState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList<? extends User> friendList, int i, int i2, boolean z7) {
        this.isSkipByException = z;
        this.isSkipByEmptyData = z2;
        this.isSkipByCancel = z3;
        this.isSync = z4;
        this.isOverStayTime = z5;
        this.isNeedActualPopUp = z6;
        this.friends = friendList;
        this.newVersionSyncClick = i;
        this.isNewVersionSynced = i2;
        this.needNewVersionRecShow = z7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SocialRecRequestState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList friendList, int i, int i2, boolean z7, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? false : z5, (i3 & 32) != 0 ? false : z6, (i3 & 64) != 0 ? null : friendList, (i3 & 128) != 0 ? -1 : i, (i3 & 256) == 0 ? i2 : -1, (i3 & 512) == 0 ? z7 : false);
    }
}
