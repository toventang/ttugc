package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse */
public class CommitRemarkNameResponse {
    @AbstractC27891c(mo46611a = "remark_name")
    public String remarkName;
    @AbstractC27891c(mo46611a = "status_code")
    public int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    public String statusMsg;

    static {
        Covode.recordClassIndex(75164);
    }

    public boolean isOK() {
        if (this.statusCode == 0) {
            return true;
        }
        return false;
    }
}
