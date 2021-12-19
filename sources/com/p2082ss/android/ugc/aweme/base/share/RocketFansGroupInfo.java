package com.p2082ss.android.ugc.aweme.base.share;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo */
public class RocketFansGroupInfo implements Serializable {
    @AbstractC27891c(mo46611a = "download_url")
    public String downloadUrl;
    @AbstractC27891c(mo46611a = "schema")
    public String schema;
    @AbstractC27891c(mo46611a = "token")
    public String token;

    static {
        Covode.recordClassIndex(41617);
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getToken() {
        return this.token;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
