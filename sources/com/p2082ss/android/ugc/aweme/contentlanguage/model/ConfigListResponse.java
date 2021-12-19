package com.p2082ss.android.ugc.aweme.contentlanguage.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse */
public class ConfigListResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "content_languages")
    List<C68343a> contentLanguage;

    static {
        Covode.recordClassIndex(48019);
    }

    public List<C68343a> getContentLanguage() {
        return this.contentLanguage;
    }

    public void setContentLanguage(List<C68343a> list) {
        this.contentLanguage = list;
    }
}
