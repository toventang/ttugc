package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveLabelDisplaySettings */
public class LiveLabelDisplaySettings {
    @AbstractC27891c(mo46611a = "display_duration")
    private Long displayDuration;
    @AbstractC27891c(mo46611a = "display_intervals")
    private Long displayIntervals;
    @AbstractC27891c(mo46611a = "most_display_times")
    private Integer mostDisplayTimes;

    static {
        Covode.recordClassIndex(62374);
    }

    public Long getDisplayDuration() {
        Long l = this.displayDuration;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }

    public Long getDisplayIntervals() {
        Long l = this.displayIntervals;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }

    public Integer getMostDisplayTimes() {
        Integer num = this.mostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
