package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo */
public class UserRateRemindInfo implements Serializable {
    @AbstractC27891c(mo46611a = "detail_link")
    String detailLink;
    @AbstractC27891c(mo46611a = "rate_record_id")
    long rateRecordId;
    @AbstractC27891c(mo46611a = "remind_text")
    String remindText;
    @AbstractC27891c(mo46611a = "show_day_limit")
    int showDayLimit;
    @AbstractC27891c(mo46611a = "show_detail_count_limit")
    int showDetailCountLimit;

    static {
        Covode.recordClassIndex(75238);
    }

    public String getDetailLink() {
        return this.detailLink;
    }

    public long getRateRecordId() {
        return this.rateRecordId;
    }

    public String getRemindText() {
        return this.remindText;
    }

    public int getShowDayLimit() {
        return this.showDayLimit;
    }

    public int getShowDetailCountLimit() {
        return this.showDetailCountLimit;
    }

    public void setDetailLink(String str) {
        this.detailLink = str;
    }

    public void setRateRecordId(long j) {
        this.rateRecordId = j;
    }

    public void setRemindText(String str) {
        this.remindText = str;
    }

    public void setShowDayLimit(int i) {
        this.showDayLimit = i;
    }

    public void setShowDetailCountLimit(int i) {
        this.showDetailCountLimit = i;
    }
}
