package com.p2082ss.android.ugc.aweme.share.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.share.model.ShortenModel */
public class ShortenModel {
    private String data;
    private String message;
    private String reason;
    @AbstractC27891c(mo46611a = "shorten_url")
    private String shortenUrl;

    static {
        Covode.recordClassIndex(81659);
    }

    public String getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public String getReason() {
        return this.reason;
    }

    public String getShortenUrl() {
        return this.shortenUrl;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }
}
