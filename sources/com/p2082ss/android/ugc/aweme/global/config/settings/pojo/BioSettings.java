package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BioSettings */
public class BioSettings {
    @AbstractC27891c(mo46611a = "enable_bio_email")
    private Boolean enableBioEmail;
    @AbstractC27891c(mo46611a = "enable_bio_url")
    private Boolean enableBioUrl;

    static {
        Covode.recordClassIndex(62333);
    }

    public Boolean getEnableBioEmail() {
        Boolean bool = this.enableBioEmail;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getEnableBioUrl() {
        Boolean bool = this.enableBioUrl;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
