package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanAllConfig */
public class PublishSyncDuoshanAllConfig {
    @AbstractC27891c(mo46611a = "register_duoshan")
    private PublishSyncDuoshanConfig registerDuoshan;
    @AbstractC27891c(mo46611a = "ungister_duoshan")
    private PublishSyncDuoshanConfig ungisterDuoshan;

    static {
        Covode.recordClassIndex(62382);
    }

    public PublishSyncDuoshanConfig getRegisterDuoshan() {
        PublishSyncDuoshanConfig publishSyncDuoshanConfig = this.registerDuoshan;
        if (publishSyncDuoshanConfig != null) {
            return publishSyncDuoshanConfig;
        }
        throw new C16041a();
    }

    public PublishSyncDuoshanConfig getUngisterDuoshan() {
        PublishSyncDuoshanConfig publishSyncDuoshanConfig = this.ungisterDuoshan;
        if (publishSyncDuoshanConfig != null) {
            return publishSyncDuoshanConfig;
        }
        throw new C16041a();
    }
}
