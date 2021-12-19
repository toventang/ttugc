package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.SimpleShopSeedingModel */
public final class SimpleShopSeedingModel implements Serializable {
    @AbstractC27891c(mo46611a = "cover")
    private final String cover;
    @AbstractC27891c(mo46611a = "seed_id")
    private final String seedId;
    @AbstractC27891c(mo46611a = "seed_tag")
    private final String seedTag;
    @AbstractC27891c(mo46611a = "title")
    private final String title;
    @AbstractC27891c(mo46611a = "url")
    private final String url;
    @AbstractC27891c(mo46611a = "views")
    private final String views;

    static {
        Covode.recordClassIndex(58755);
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getSeedId() {
        return this.seedId;
    }

    public final String getSeedTag() {
        return this.seedTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getViews() {
        return this.views;
    }
}
