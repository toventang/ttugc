package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.BABCRemoveMe */
public final class BABCRemoveMe implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")
    private final int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    private String statusMsg;

    static {
        Covode.recordClassIndex(58649);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
