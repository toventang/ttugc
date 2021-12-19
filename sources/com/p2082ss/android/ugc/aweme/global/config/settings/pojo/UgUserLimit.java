package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgUserLimit */
public class UgUserLimit {
    @AbstractC27891c(mo46611a = "active_days")
    private Integer activeDays;
    @AbstractC27891c(mo46611a = "show_for_active")
    private Boolean showForActive;

    static {
        Covode.recordClassIndex(62416);
    }

    public Integer getActiveDays() {
        Integer num = this.activeDays;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Boolean getShowForActive() {
        Boolean bool = this.showForActive;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
