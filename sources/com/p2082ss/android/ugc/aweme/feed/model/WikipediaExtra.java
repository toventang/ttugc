package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.WikipediaExtra */
public final class WikipediaExtra implements Serializable {
    @AbstractC27891c(mo46611a = "language")
    private String language = "";
    @AbstractC27891c(mo46611a = "review_status")
    private Integer status = 0;
    @AbstractC27891c(mo46611a = "warning_msg")
    private String warningMsg = "";

    static {
        Covode.recordClassIndex(58778);
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getWarningMsg() {
        return this.warningMsg;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setWarningMsg(String str) {
        this.warningMsg = str;
    }
}
