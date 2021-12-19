package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig */
public class FEConfig {
    @AbstractC27891c(mo46611a = "fallback_url")
    private String fallbackUrl;
    @AbstractC27891c(mo46611a = "schema")
    private String schema;

    static {
        Covode.recordClassIndex(62349);
    }

    public String getFallbackUrl() {
        String str = this.fallbackUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getSchema() {
        String str = this.schema;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
