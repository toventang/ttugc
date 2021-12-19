package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BusinessEC */
public class BusinessEC {
    @AbstractC27891c(mo46611a = "page_eshop_toolbox")
    private String pageEshopToolbox;
    @AbstractC27891c(mo46611a = "page_home")
    private String pageHome;

    static {
        Covode.recordClassIndex(62334);
    }

    public String getPageEshopToolbox() {
        String str = this.pageEshopToolbox;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getPageHome() {
        String str = this.pageHome;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
