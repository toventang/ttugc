package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.InquiryStruct */
public class InquiryStruct implements Serializable {
    @AbstractC27891c(mo46611a = "desc")
    private String desc;
    @AbstractC27891c(mo46611a = "icon")
    private UrlModel icon;
    @AbstractC27891c(mo46611a = "open_url")
    private String openUrl;
    @AbstractC27891c(mo46611a = "web_url")
    private String webUrl;

    static {
        Covode.recordClassIndex(50460);
    }

    public String getDesc() {
        return this.desc;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }
}
