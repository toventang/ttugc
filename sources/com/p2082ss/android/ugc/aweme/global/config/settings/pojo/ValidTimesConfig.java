package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ValidTimesConfig */
public class ValidTimesConfig {
    @AbstractC27891c(mo46611a = "end_time")
    private Long endTime = 0L;
    @AbstractC27891c(mo46611a = "start_time")
    private Long startTime = 0L;

    static {
        Covode.recordClassIndex(62424);
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public Long getStartTime() {
        return this.startTime;
    }
}
