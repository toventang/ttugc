package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.UploadContactsResult */
public class UploadContactsResult extends BaseResponse {
    @AbstractC27891c(mo46611a = "unregistered_contact")
    public List<ContactModel> contacts;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "registered_user")
    public List<User> users;

    static {
        Covode.recordClassIndex(60938);
    }
}
