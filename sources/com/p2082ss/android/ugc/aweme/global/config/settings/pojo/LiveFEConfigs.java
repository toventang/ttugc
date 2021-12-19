package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveFEConfigs */
public class LiveFEConfigs {
    @AbstractC27891c(mo46611a = "honor_level")
    private HonorLevel honorLevel;

    static {
        Covode.recordClassIndex(62372);
    }

    public HonorLevel getHonorLevel() {
        HonorLevel honorLevel2 = this.honorLevel;
        if (honorLevel2 != null) {
            return honorLevel2;
        }
        throw new C16041a();
    }
}
