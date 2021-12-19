package com.bytedance.android.livesdk.verify.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class QueryZhimaStatusResponse {
    @AbstractC27891c(mo46611a = "failed_reason")
    private String failedReason;
    @AbstractC27891c(mo46611a = "msg")
    private String message;
    @AbstractC27891c(mo46611a = "is_verified")
    private boolean passed;
    @AbstractC27891c(mo46611a = "status_code")
    private int statusCode;

    static {
        Covode.recordClassIndex(12934);
    }

    public String getFailedReason() {
        return this.failedReason;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean getPassed() {
        return this.passed;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
