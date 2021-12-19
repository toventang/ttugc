package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.AdCoverTitle */
public class AdCoverTitle implements Serializable, Cloneable {
    @AbstractC27891c(mo46611a = "title")
    public String title;
    @AbstractC27891c(mo46611a = "web_url")
    public String webUrl;

    static {
        Covode.recordClassIndex(75148);
    }

    public String getTitle() {
        return this.title;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
