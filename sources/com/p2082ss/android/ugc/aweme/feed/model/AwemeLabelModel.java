package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeLabelModel */
public class AwemeLabelModel implements Serializable {
    @AbstractC27891c(mo46611a = "label_type")
    public int labelType;
    @AbstractC27891c(mo46611a = "label_url")
    public UrlModel urlModels;

    static {
        Covode.recordClassIndex(58629);
    }

    public AwemeLabelModel() {
    }

    public int getLabelType() {
        return this.labelType;
    }

    public UrlModel getUrlModels() {
        return this.urlModels;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setUrlModels(UrlModel urlModel) {
        this.urlModels = urlModel;
    }

    public AwemeLabelModel(UrlModel urlModel, int i) {
        this.urlModels = urlModel;
        this.labelType = i;
    }
}
