package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchPrivacyLink */
public class VisionSearchPrivacyLink {
    @AbstractC27891c(mo46611a = "link_text")
    private String linkText;
    @AbstractC27891c(mo46611a = "link_url")
    private String linkUrl;

    static {
        Covode.recordClassIndex(62428);
    }

    public String getLinkText() {
        String str = this.linkText;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getLinkUrl() {
        String str = this.linkUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
