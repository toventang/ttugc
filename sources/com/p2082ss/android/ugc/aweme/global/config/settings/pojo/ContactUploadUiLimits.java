package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ContactUploadUiLimits */
public class ContactUploadUiLimits {
    @AbstractC27891c(mo46611a = "max_close_times")
    private Integer maxCloseTimes;
    @AbstractC27891c(mo46611a = "max_display_times")
    private Integer maxDisplayTimes;

    static {
        Covode.recordClassIndex(62341);
    }

    public Integer getMaxCloseTimes() {
        Integer num = this.maxCloseTimes;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getMaxDisplayTimes() {
        Integer num = this.maxDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
