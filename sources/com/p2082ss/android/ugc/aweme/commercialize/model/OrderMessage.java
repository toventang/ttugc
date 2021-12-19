package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.OrderMessage */
public final class OrderMessage implements Serializable {
    @AbstractC27891c(mo46611a = "msg_type")
    private Integer msgType;
    @AbstractC27891c(mo46611a = "status_code")
    private Integer statusCode;
    @AbstractC27891c(mo46611a = "toast_content")
    private String toastContent = "";
    @AbstractC27891c(mo46611a = "update_time")
    private long updateime;

    static {
        Covode.recordClassIndex(45694);
    }

    public final Integer getMsgType() {
        return this.msgType;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getToastContent() {
        return this.toastContent;
    }

    public final long getUpdateime() {
        return this.updateime;
    }

    public final void setMsgType(Integer num) {
        this.msgType = num;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setToastContent(String str) {
        this.toastContent = str;
    }

    public final void setUpdateime(long j) {
        this.updateime = j;
    }
}
