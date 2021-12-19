package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LogPbBean */
public class LogPbBean {
    @AbstractC27891c(mo46611a = "impr_id")
    private String imprId;

    static {
        Covode.recordClassIndex(62375);
    }

    public String getImprId() {
        String str = this.imprId;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
