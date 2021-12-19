package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LinkPlan */
public class LinkPlan {
    @AbstractC27891c(mo46611a = "info")
    private String info;
    @AbstractC27891c(mo46611a = "publish")
    private String publish;
    @AbstractC27891c(mo46611a = "settings")
    private String settings;

    static {
        Covode.recordClassIndex(62370);
    }

    public String getInfo() {
        String str = this.info;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getPublish() {
        String str = this.publish;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getSettings() {
        String str = this.settings;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
