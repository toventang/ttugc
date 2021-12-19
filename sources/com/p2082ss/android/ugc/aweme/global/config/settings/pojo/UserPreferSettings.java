package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserPreferSettings */
public class UserPreferSettings {
    @AbstractC27891c(mo46611a = "display_time")
    private Integer displayTime;
    @AbstractC27891c(mo46611a = "n")

    /* renamed from: n */
    private Integer f121694n;
    @AbstractC27891c(mo46611a = "t")

    /* renamed from: t */
    private Integer f121695t;
    @AbstractC27891c(mo46611a = "v")

    /* renamed from: v */
    private Integer f121696v;

    static {
        Covode.recordClassIndex(62422);
    }

    public Integer getDisplayTime() {
        Integer num = this.displayTime;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getN() {
        Integer num = this.f121694n;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getT() {
        Integer num = this.f121695t;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getV() {
        Integer num = this.f121696v;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
