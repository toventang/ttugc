package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.OriginChannelTab */
public class OriginChannelTab {
    @AbstractC27891c(mo46611a = "channel_tab_id")
    private Integer channelTabId;
    @AbstractC27891c(mo46611a = "i18n_name")
    private String i18nName;
    @AbstractC27891c(mo46611a = StringSet.name)
    private String name;

    static {
        Covode.recordClassIndex(62380);
    }

    public Integer getChannelTabId() {
        return this.channelTabId;
    }

    public String getI18nName() {
        return this.i18nName;
    }

    public String getName() {
        return this.name;
    }
}
