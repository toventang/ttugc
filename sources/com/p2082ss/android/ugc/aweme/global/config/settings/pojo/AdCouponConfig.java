package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdCouponConfig */
public class AdCouponConfig {
    @AbstractC27891c(mo46611a = "show")
    private Integer show;

    static {
        Covode.recordClassIndex(62323);
    }

    public Integer getShow() {
        Integer num = this.show;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
