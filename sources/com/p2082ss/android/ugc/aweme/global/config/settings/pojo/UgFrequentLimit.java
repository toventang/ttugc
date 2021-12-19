package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgFrequentLimit */
public class UgFrequentLimit {
    @AbstractC27891c(mo46611a = "days_no_show")
    private Integer daysNoShow;
    @AbstractC27891c(mo46611a = "days_window")
    private Integer daysWindow;
    @AbstractC27891c(mo46611a = "max_close")
    private Integer maxClose;

    static {
        Covode.recordClassIndex(62408);
    }

    public Integer getDaysNoShow() {
        Integer num = this.daysNoShow;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getDaysWindow() {
        Integer num = this.daysWindow;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getMaxClose() {
        Integer num = this.maxClose;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
