package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanConfig */
public class PublishSyncDuoshanConfig {
    @AbstractC27891c(mo46611a = "content")
    private String content;
    @AbstractC27891c(mo46611a = "h5_str")
    private String h5Str;
    @AbstractC27891c(mo46611a = "h5_url")
    private String h5Url;
    @AbstractC27891c(mo46611a = "title")
    private String title;

    static {
        Covode.recordClassIndex(62383);
    }

    public String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getH5Str() {
        String str = this.h5Str;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getH5Url() {
        String str = this.h5Url;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
