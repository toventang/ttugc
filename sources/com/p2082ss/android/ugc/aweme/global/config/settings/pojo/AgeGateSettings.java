package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AgeGateSettings */
public class AgeGateSettings {
    @AbstractC27891c(mo46611a = "initial_date")
    private Integer initialDate;

    static {
        Covode.recordClassIndex(62326);
    }

    public Integer getInitialDate() {
        Integer num = this.initialDate;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
