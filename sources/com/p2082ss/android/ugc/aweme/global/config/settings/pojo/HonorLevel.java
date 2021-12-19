package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HonorLevel */
public class HonorLevel {
    @AbstractC27891c(mo46611a = "schema")
    private String schema;

    static {
        Covode.recordClassIndex(62360);
    }

    public String getSchema() {
        String str = this.schema;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
