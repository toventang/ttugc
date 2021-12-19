package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.TCMInfo */
public final class TCMInfo implements Serializable {
    @AbstractC27891c(mo46611a = "review_status")
    private Integer reviewStatus = 0;

    static {
        Covode.recordClassIndex(58759);
    }

    public final Integer getReviewStatus() {
        return this.reviewStatus;
    }

    public final void setReviewStatus(Integer num) {
        this.reviewStatus = num;
    }
}
