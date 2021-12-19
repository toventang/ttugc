package com.p2082ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.friends.model.UnRegisteredUser */
public class UnRegisteredUser {
    @AbstractC27891c(mo46611a = "invite_status")
    public int inviteStatus;
    @AbstractC27891c(mo46611a = "mobile_id")
    public String mobileId;
    @AbstractC27891c(mo46611a = "remark_name")
    public String remarkName;

    static {
        Covode.recordClassIndex(60937);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof UnRegisteredUser) && TextUtils.equals(this.mobileId, ((UnRegisteredUser) obj).mobileId)) {
            return super.equals(obj);
        }
        return false;
    }
}
