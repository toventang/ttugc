package com.p2082ss.android.ugc.aweme.feed.model.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.search.SearchShopStruct */
public final class SearchShopStruct implements Serializable {
    @AbstractC27891c(mo46611a = "height")
    private int height;
    @AbstractC27891c(mo46611a = "rawData")
    private String rawData;
    @AbstractC27891c(mo46611a = "scheme")
    private String scheme;

    static {
        Covode.recordClassIndex(58827);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getRawData() {
        return this.rawData;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setRawData(String str) {
        this.rawData = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }
}
