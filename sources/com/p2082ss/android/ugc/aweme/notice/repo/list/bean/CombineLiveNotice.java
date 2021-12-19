package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice */
public final class CombineLiveNotice {
    @AbstractC27891c(mo46611a = "room_info")
    private final C28022o roomInfo;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final int type;
    @AbstractC27891c(mo46611a = "owner")
    private final User user;

    static {
        Covode.recordClassIndex(72326);
    }

    public CombineLiveNotice() {
        this(null, 0, null, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_CombineLiveNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111634xb6c6b4d0(int i) {
        return i;
    }

    public static /* synthetic */ CombineLiveNotice copy$default(CombineLiveNotice combineLiveNotice, User user2, int i, C28022o oVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user2 = combineLiveNotice.user;
        }
        if ((i2 & 2) != 0) {
            i = combineLiveNotice.type;
        }
        if ((i2 & 4) != 0) {
            oVar = combineLiveNotice.roomInfo;
        }
        return combineLiveNotice.copy(user2, i, oVar);
    }

    public final User component1() {
        return this.user;
    }

    public final int component2() {
        return this.type;
    }

    public final C28022o component3() {
        return this.roomInfo;
    }

    public final CombineLiveNotice copy(User user2, int i, C28022o oVar) {
        return new CombineLiveNotice(user2, i, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombineLiveNotice)) {
            return false;
        }
        CombineLiveNotice combineLiveNotice = (CombineLiveNotice) obj;
        return C89219l.m154714a(this.user, combineLiveNotice.user) && this.type == combineLiveNotice.type && C89219l.m154714a(this.roomInfo, combineLiveNotice.roomInfo);
    }

    public final int hashCode() {
        User user2 = this.user;
        int i = 0;
        int hashCode = (((user2 != null ? user2.hashCode() : 0) * 31) + m111634xb6c6b4d0(this.type)) * 31;
        C28022o oVar = this.roomInfo;
        if (oVar != null) {
            i = oVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CombineLiveNotice(user=" + this.user + ", type=" + this.type + ", roomInfo=" + this.roomInfo + ")";
    }

    public final C28022o getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public CombineLiveNotice(User user2, int i, C28022o oVar) {
        this.user = user2;
        this.type = i;
        this.roomInfo = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CombineLiveNotice(User user2, int i, C28022o oVar, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : user2, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : oVar);
    }
}
