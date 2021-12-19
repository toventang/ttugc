package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AssociativeEmoticonAll */
public class AssociativeEmoticonAll {
    @AbstractC27891c(mo46611a = "show")
    private Integer show;
    @AbstractC27891c(mo46611a = "sourceMessage")
    private String sourceMessage;

    static {
        Covode.recordClassIndex(62329);
    }

    public Integer getShow() {
        return this.show;
    }

    public String getSourceMessage() {
        return this.sourceMessage;
    }

    public AssociativeEmoticonAll(Integer num, String str) {
        this.show = num;
        this.sourceMessage = str;
    }
}
