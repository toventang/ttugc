package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RelativeUserInfo */
public class RelativeUserInfo implements Serializable {
    @AbstractC27891c(mo46611a = "avatar")
    public UrlModel avatar;
    @AbstractC27891c(mo46611a = "uid")
    public String uid;

    static {
        Covode.recordClassIndex(75205);
    }

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getUid() {
        return this.uid;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
