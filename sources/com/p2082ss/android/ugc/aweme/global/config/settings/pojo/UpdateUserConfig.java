package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UpdateUserConfig */
public class UpdateUserConfig {
    @AbstractC27891c(mo46611a = "wx_toast_content")
    private String wxToastContent;
    @AbstractC27891c(mo46611a = "wx_toast_enable")
    private Boolean wxToastEnable;
    @AbstractC27891c(mo46611a = "wx_toast_frequence")
    private Integer wxToastFrequence;
    @AbstractC27891c(mo46611a = "wx_toast_position")
    private Integer wxToastPosition;

    static {
        Covode.recordClassIndex(62418);
    }

    public String getWxToastContent() {
        String str = this.wxToastContent;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Boolean getWxToastEnable() {
        Boolean bool = this.wxToastEnable;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Integer getWxToastFrequence() {
        Integer num = this.wxToastFrequence;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getWxToastPosition() {
        Integer num = this.wxToastPosition;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
