package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewUser */
public class UgNewUser {
    @AbstractC27891c(mo46611a = "active_time_limit")
    private Integer activeTimeLimit;
    @AbstractC27891c(mo46611a = "download_time_limit")
    private Integer downloadTimeLimit;

    static {
        Covode.recordClassIndex(62411);
    }

    public Integer getActiveTimeLimit() {
        Integer num = this.activeTimeLimit;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getDownloadTimeLimit() {
        Integer num = this.downloadTimeLimit;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
