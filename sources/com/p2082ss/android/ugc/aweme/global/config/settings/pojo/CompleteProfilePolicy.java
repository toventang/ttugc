package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CompleteProfilePolicy */
public class CompleteProfilePolicy {
    @AbstractC27891c(mo46611a = "interval")
    private Integer interval;
    @AbstractC27891c(mo46611a = "times")
    private Integer times;

    static {
        Covode.recordClassIndex(62340);
    }

    public Integer getInterval() {
        Integer num = this.interval;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getTimes() {
        Integer num = this.times;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
