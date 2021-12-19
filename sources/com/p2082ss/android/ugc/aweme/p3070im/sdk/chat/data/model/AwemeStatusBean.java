package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean */
public final class AwemeStatusBean implements Serializable {
    @AbstractC27891c(mo46611a = "item_id")
    private String awemeId;
    @AbstractC27891c(mo46611a = "status")
    private Integer status;
    @AbstractC27891c(mo46611a = "status_text")
    private String statusText;

    static {
        Covode.recordClassIndex(63418);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setStatusText(String str) {
        this.statusText = str;
    }
}
