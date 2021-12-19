package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.ImageInfo */
public class ImageInfo implements Serializable {
    @AbstractC27891c(mo46611a = "height")
    public int height;
    @AbstractC27891c(mo46611a = "label_large")
    public UrlModel labelLarge;
    @AbstractC27891c(mo46611a = "label_thumb")
    public UrlModel labelThumb;
    @AbstractC27891c(mo46611a = "width")
    public int width;

    static {
        Covode.recordClassIndex(58708);
    }

    public int getHeight() {
        return this.height;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
