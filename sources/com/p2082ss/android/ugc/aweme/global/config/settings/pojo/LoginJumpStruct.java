package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LoginJumpStruct */
public class LoginJumpStruct {
    @AbstractC27891c(mo46611a = "jump_type")
    private Integer jumpType;
    @AbstractC27891c(mo46611a = "jump_url")
    private String jumpUrl;
    @AbstractC27891c(mo46611a = "login_platform")
    private Integer loginPlatform;

    static {
        Covode.recordClassIndex(62376);
    }

    public Integer getJumpType() {
        Integer num = this.jumpType;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getJumpUrl() {
        String str = this.jumpUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getLoginPlatform() {
        Integer num = this.loginPlatform;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
