package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AdNoticeModel */
public final class AdNoticeModel implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")
    private final int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    private final String statusMsg = "";
    @AbstractC27891c(mo46611a = "subscription_status")
    private final int subscriptionStatus;

    static {
        Covode.recordClassIndex(58598);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final int getSubscriptionStatus() {
        return this.subscriptionStatus;
    }
}
