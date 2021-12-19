package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner */
public class UgLoginBanner {
    @AbstractC27891c(mo46611a = "resource_url")
    private UrlModel resourceUrl;
    @AbstractC27891c(mo46611a = "text")
    private String text;

    static {
        Covode.recordClassIndex(62409);
    }

    public UrlModel getResourceUrl() {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C16041a();
    }

    public String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
