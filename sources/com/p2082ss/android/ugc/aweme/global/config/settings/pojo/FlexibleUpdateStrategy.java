package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FlexibleUpdateStrategy */
public class FlexibleUpdateStrategy {
    @AbstractC27891c(mo46611a = "allow_show_all_times")
    private Integer allowShowAllTimes = 0;
    @AbstractC27891c(mo46611a = "interval_days")
    private Integer intervalDays = 0;

    static {
        Covode.recordClassIndex(62352);
    }

    public Integer getAllowShowAllTimes() {
        return this.allowShowAllTimes;
    }

    public Integer getIntervalDays() {
        return this.intervalDays;
    }
}
