package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.UserResponse */
public class UserResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "toast_back")
    private int action;
    private User user;

    static {
        Covode.recordClassIndex(74635);
    }

    public int getAction() {
        return this.action;
    }

    public User getUser() {
        return this.user;
    }

    public void setAction(int i) {
        this.action = i;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
