package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HotSearchDisplay */
public class HotSearchDisplay {
    @AbstractC27891c(mo46611a = "most_display_times")
    private Integer mostDisplayTimes;
    @AbstractC27891c(mo46611a = "one_display_intervals")
    private Long oneDisplayIntervals;
    @AbstractC27891c(mo46611a = "op_most_display_times")
    private Integer opMostDisplayTimes;
    @AbstractC27891c(mo46611a = "op_one_display_intervals")
    private Long opOneDisplayIntervals;

    static {
        Covode.recordClassIndex(62361);
    }

    public Integer getMostDisplayTimes() {
        Integer num = this.mostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Long getOneDisplayIntervals() {
        Long l = this.oneDisplayIntervals;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }

    public Integer getOpMostDisplayTimes() {
        Integer num = this.opMostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Long getOpOneDisplayIntervals() {
        Long l = this.opOneDisplayIntervals;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }
}
