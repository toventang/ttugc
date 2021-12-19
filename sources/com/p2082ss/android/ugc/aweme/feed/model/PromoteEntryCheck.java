package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck */
public final class PromoteEntryCheck implements Serializable {
    @AbstractC27891c(mo46611a = "promote_status")
    private Integer promoteStatus = 0;
    @AbstractC27891c(mo46611a = "status_code")
    private int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    private String statusMsg;
    @AbstractC27891c(mo46611a = "url")
    private String url = "";

    static {
        Covode.recordClassIndex(58748);
    }

    public final Integer getPromoteStatus() {
        return this.promoteStatus;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setPromoteStatus(Integer num) {
        this.promoteStatus = num;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
