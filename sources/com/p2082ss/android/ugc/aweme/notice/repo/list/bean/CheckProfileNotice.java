package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice */
public final class CheckProfileNotice {
    @AbstractC27891c(mo46611a = "count")
    private final int countOfUser;
    @AbstractC27891c(mo46611a = "create_time")
    private final long createTime;
    @AbstractC27891c(mo46611a = "users")
    private final List<User> users;

    static {
        Covode.recordClassIndex(72325);
    }

    public CheckProfileNotice() {
        this(0, null, 0, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_CheckProfileNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111632xd64359bc(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_CheckProfileNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111633xd64359bc(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckProfileNotice copy$default(CheckProfileNotice checkProfileNotice, int i, List list, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = checkProfileNotice.countOfUser;
        }
        if ((i2 & 2) != 0) {
            list = checkProfileNotice.users;
        }
        if ((i2 & 4) != 0) {
            j = checkProfileNotice.createTime;
        }
        return checkProfileNotice.copy(i, list, j);
    }

    public final int component1() {
        return this.countOfUser;
    }

    public final List<User> component2() {
        return this.users;
    }

    public final long component3() {
        return this.createTime;
    }

    public final CheckProfileNotice copy(int i, List<? extends User> list, long j) {
        return new CheckProfileNotice(i, list, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckProfileNotice)) {
            return false;
        }
        CheckProfileNotice checkProfileNotice = (CheckProfileNotice) obj;
        return this.countOfUser == checkProfileNotice.countOfUser && C89219l.m154714a(this.users, checkProfileNotice.users) && this.createTime == checkProfileNotice.createTime;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notice_repo_list_bean_CheckProfileNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m111632xd64359bc(this.countOfUser) * 31;
        List<User> list = this.users;
        return ((com_ss_android_ugc_aweme_notice_repo_list_bean_CheckProfileNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31) + m111633xd64359bc(this.createTime);
    }

    public final String toString() {
        return "CheckProfileNotice(countOfUser=" + this.countOfUser + ", users=" + this.users + ", createTime=" + this.createTime + ")";
    }

    public final int getCountOfUser() {
        return this.countOfUser;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckProfileNotice(int i, List<? extends User> list, long j) {
        this.countOfUser = i;
        this.users = list;
        this.createTime = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckProfileNotice(int i, List list, long j, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? 0 : j);
    }
}
