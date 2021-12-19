package com.p2082ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.commercialize.UrlPackage */
public final class UrlPackage implements Serializable {
    @AbstractC27891c(mo46611a = "Android")
    private String androidUrl;
    @AbstractC27891c(mo46611a = "iOS")
    private String iosUrl;

    static {
        Covode.recordClassIndex(58785);
    }

    public final String getAndroidUrl() {
        return this.androidUrl;
    }

    public final String getIosUrl() {
        return this.iosUrl;
    }

    public final void setAndroidUrl(String str) {
        this.androidUrl = str;
    }

    public final void setIosUrl(String str) {
        this.iosUrl = str;
    }
}
