package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings */
public class EmailLoginSettings {
    @AbstractC27891c(mo46611a = "domain_recommendation")
    private List<String> domainRecommendation = new ArrayList();

    static {
        Covode.recordClassIndex(62348);
    }

    public List<String> getDomainRecommendation() {
        return this.domainRecommendation;
    }
}
