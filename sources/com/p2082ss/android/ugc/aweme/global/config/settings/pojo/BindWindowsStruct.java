package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BindWindowsStruct */
public class BindWindowsStruct {
    @AbstractC27891c(mo46611a = "bind_desc")
    private String bindDesc;
    @AbstractC27891c(mo46611a = "bind_title")
    private String bindTitle;
    @AbstractC27891c(mo46611a = "interval")
    private Integer interval;
    @AbstractC27891c(mo46611a = "login_platform")
    private Integer loginPlatform;
    @AbstractC27891c(mo46611a = "open_window")
    private Boolean openWindow;
    @AbstractC27891c(mo46611a = "total_times")
    private Integer totalTimes;

    static {
        Covode.recordClassIndex(62332);
    }

    public String getBindDesc() {
        String str = this.bindDesc;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getBindTitle() {
        String str = this.bindTitle;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getInterval() {
        Integer num = this.interval;
        if (num != null) {
            return num;
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

    public Boolean getOpenWindow() {
        Boolean bool = this.openWindow;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Integer getTotalTimes() {
        Integer num = this.totalTimes;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
