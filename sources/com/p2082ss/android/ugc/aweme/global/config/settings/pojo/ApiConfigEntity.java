package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity */
public class ApiConfigEntity {
    @AbstractC27891c(mo46611a = "api_name")
    private String apiName;
    @AbstractC27891c(mo46611a = "delay_time")
    private Long delayTime;
    @AbstractC27891c(mo46611a = "is_banned")
    private Boolean isBanned;

    static {
        Covode.recordClassIndex(62327);
    }

    public String getApiName() {
        return this.apiName;
    }

    public Long getDelayTime() {
        Long l = this.delayTime;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }

    public Boolean getIsBanned() {
        Boolean bool = this.isBanned;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
