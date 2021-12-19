package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CdnDomainRefresh */
public class CdnDomainRefresh {
    @AbstractC27891c(mo46611a = "keepalive_timeout")
    private Integer keepaliveTimeout;
    @AbstractC27891c(mo46611a = "refresh_interval")
    private Integer refreshInterval;
    @AbstractC27891c(mo46611a = "refresh_switch")
    private Boolean refreshSwitch;

    static {
        Covode.recordClassIndex(62337);
    }

    public Integer getKeepaliveTimeout() {
        Integer num = this.keepaliveTimeout;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getRefreshInterval() {
        Integer num = this.refreshInterval;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Boolean getRefreshSwitch() {
        Boolean bool = this.refreshSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
