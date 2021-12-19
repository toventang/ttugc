package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.EncryptedVideoContent */
public final class EncryptedVideoContent implements Serializable {
    @AbstractC27891c(mo46611a = "skey")
    private String secretKey;
    @AbstractC27891c(mo46611a = "md5")
    private String sourceMD5;
    @AbstractC27891c(mo46611a = "tkey")
    private String tosKey;

    static {
        Covode.recordClassIndex(63431);
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSourceMD5() {
        return this.sourceMD5;
    }

    public final String getTosKey() {
        return this.tosKey;
    }

    public final void setSecretKey(String str) {
        this.secretKey = str;
    }

    public final void setSourceMD5(String str) {
        this.sourceMD5 = str;
    }

    public final void setTosKey(String str) {
        this.tosKey = str;
    }
}
