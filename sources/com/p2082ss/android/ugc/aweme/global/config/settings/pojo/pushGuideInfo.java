package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.pushGuideInfo */
public class pushGuideInfo {
    @AbstractC27891c(mo46611a = "close_count_limit")
    private Integer closeCountLimit = 3;
    @AbstractC27891c(mo46611a = "showup_interval")
    private Integer showupInterval = 15;

    static {
        Covode.recordClassIndex(62433);
    }

    public Integer getCloseCountLimit() {
        return this.closeCountLimit;
    }

    public Integer getShowupInterval() {
        return this.showupInterval;
    }
}
