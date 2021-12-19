package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingLiveConfig */
public class ShoppingLiveConfig {
    @AbstractC27891c(mo46611a = "compatible_with_old_version")
    private Boolean compatibleWithOldVersion;

    static {
        Covode.recordClassIndex(62393);
    }

    public Boolean getCompatibleWithOldVersion() {
        Boolean bool = this.compatibleWithOldVersion;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
