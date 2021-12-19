package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VideoAuth */
public class VideoAuth {
    @AbstractC27891c(mo46611a = "auth")
    private String auth;
    @AbstractC27891c(mo46611a = "code")
    private String code;

    static {
        Covode.recordClassIndex(62426);
    }

    public String getAuth() {
        String str = this.auth;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getCode() {
        String str = this.code;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
