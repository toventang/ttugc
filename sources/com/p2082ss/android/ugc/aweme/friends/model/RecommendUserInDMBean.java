package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.RecommendUserInDMBean */
public final class RecommendUserInDMBean extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "log_pb")
    private final LogPbBean logPb;
    @AbstractC27891c(mo46611a = "users")
    private final List<User> users;

    static {
        Covode.recordClassIndex(60919);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.friends.model.RecommendUserInDMBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendUserInDMBean copy$default(RecommendUserInDMBean recommendUserInDMBean, List list, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendUserInDMBean.users;
        }
        if ((i & 2) != 0) {
            logPbBean = recommendUserInDMBean.logPb;
        }
        return recommendUserInDMBean.copy(list, logPbBean);
    }

    public final List<User> component1() {
        return this.users;
    }

    public final LogPbBean component2() {
        return this.logPb;
    }

    public final RecommendUserInDMBean copy(List<User> list, LogPbBean logPbBean) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(logPbBean, "");
        return new RecommendUserInDMBean(list, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendUserInDMBean)) {
            return false;
        }
        RecommendUserInDMBean recommendUserInDMBean = (RecommendUserInDMBean) obj;
        return C89219l.m154714a(this.users, recommendUserInDMBean.users) && C89219l.m154714a(this.logPb, recommendUserInDMBean.logPb);
    }

    public final int hashCode() {
        List<User> list = this.users;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "RecommendUserInDMBean(users=" + this.users + ", logPb=" + this.logPb + ")";
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public RecommendUserInDMBean(List<User> list, LogPbBean logPbBean) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(logPbBean, "");
        this.users = list;
        this.logPb = logPbBean;
    }
}
