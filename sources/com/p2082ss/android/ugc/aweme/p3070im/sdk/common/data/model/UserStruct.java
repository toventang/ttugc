package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.model.UserStruct */
public class UserStruct extends BaseResponse {
    @AbstractC27891c(mo46611a = "user")
    User user;

    static {
        Covode.recordClassIndex(65029);
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
