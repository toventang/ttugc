package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.NewYearConfig */
public class NewYearConfig {
    @AbstractC27891c(mo46611a = "auto_fold_vv_count")
    private Integer autoFoldVvCount;
    @AbstractC27891c(mo46611a = "disabled")
    private Boolean disabled;
    @AbstractC27891c(mo46611a = "max_amount")
    private Integer maxAmount;
    @AbstractC27891c(mo46611a = "newyear_test_domain")
    private String newyearTestDomain;
    @AbstractC27891c(mo46611a = "newyear_test_switch")
    private Boolean newyearTestSwitch;
    @AbstractC27891c(mo46611a = "show_newyear_fresh_button")
    private Boolean showNewyearFreshButton;
    @AbstractC27891c(mo46611a = "token")
    private String token;

    static {
        Covode.recordClassIndex(62379);
    }

    public Integer getAutoFoldVvCount() {
        Integer num = this.autoFoldVvCount;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Boolean getDisabled() {
        Boolean bool = this.disabled;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Integer getMaxAmount() {
        Integer num = this.maxAmount;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getNewyearTestDomain() {
        String str = this.newyearTestDomain;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Boolean getNewyearTestSwitch() {
        Boolean bool = this.newyearTestSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getShowNewyearFreshButton() {
        Boolean bool = this.showNewyearFreshButton;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public String getToken() {
        String str = this.token;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
