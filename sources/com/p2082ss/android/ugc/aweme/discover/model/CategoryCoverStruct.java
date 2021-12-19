package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CategoryCoverStruct */
public class CategoryCoverStruct implements Serializable {
    private static final long serialVersionUID = 1;
    @AbstractC27891c(mo46611a = "aweme_id")
    private String awemeId;
    @AbstractC27891c(mo46611a = "cover")
    private UrlModel cover;
    @AbstractC27891c(mo46611a = "dynamic_cover")
    private UrlModel dynamicCover;

    static {
        Covode.recordClassIndex(50429);
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }
}
