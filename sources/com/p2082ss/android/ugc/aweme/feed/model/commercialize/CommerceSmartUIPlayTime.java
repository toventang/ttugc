package com.p2082ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIPlayTime */
public final class CommerceSmartUIPlayTime implements Serializable {
    @AbstractC27891c(mo46611a = "package")
    private UrlPackage packageUrl;
    @AbstractC27891c(mo46611a = "params")
    private List<Integer> params;

    static {
        Covode.recordClassIndex(58781);
    }

    public final UrlPackage getPackageUrl() {
        return this.packageUrl;
    }

    public final List<Integer> getParams() {
        return this.params;
    }

    public final void setPackageUrl(UrlPackage urlPackage) {
        this.packageUrl = urlPackage;
    }

    public final void setParams(List<Integer> list) {
        this.params = list;
    }
}
