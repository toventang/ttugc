package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchStruct */
public class VisionSearchStruct {
    @AbstractC27891c(mo46611a = "privacy")
    private VisionSearchPrivacy privacy;

    static {
        Covode.recordClassIndex(62429);
    }

    public VisionSearchPrivacy getPrivacy() {
        VisionSearchPrivacy visionSearchPrivacy = this.privacy;
        if (visionSearchPrivacy != null) {
            return visionSearchPrivacy;
        }
        throw new C16041a();
    }
}
