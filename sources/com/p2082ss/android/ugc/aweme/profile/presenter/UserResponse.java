package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.UserResponse */
public final class UserResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "log_pb")
    private LogPbBean logPb;
    @AbstractC27891c(mo46611a = "user")
    private User user;

    static {
        Covode.recordClassIndex(75244);
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setUser(User user2) {
        this.user = user2;
    }
}
