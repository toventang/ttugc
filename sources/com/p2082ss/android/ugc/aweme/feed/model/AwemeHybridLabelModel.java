package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel */
public final class AwemeHybridLabelModel implements Serializable {
    @AbstractC27891c(mo46611a = "background_color")
    public String backgroundColor;
    @AbstractC27891c(mo46611a = "image")
    public UrlModel imageUrl;
    @AbstractC27891c(mo46611a = "ref_url")
    public String refUrl;
    @AbstractC27891c(mo46611a = "text")
    public String text;
    @AbstractC27891c(mo46611a = "text_color")
    public String textColor;

    static {
        Covode.recordClassIndex(58628);
    }

    public AwemeHybridLabelModel() {
    }

    public static /* synthetic */ AwemeHybridLabelModel copy$default(AwemeHybridLabelModel awemeHybridLabelModel, String str, String str2, String str3, UrlModel urlModel, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeHybridLabelModel.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = awemeHybridLabelModel.text;
        }
        if ((i & 4) != 0) {
            str3 = awemeHybridLabelModel.textColor;
        }
        if ((i & 8) != 0) {
            urlModel = awemeHybridLabelModel.imageUrl;
        }
        if ((i & 16) != 0) {
            str4 = awemeHybridLabelModel.refUrl;
        }
        return awemeHybridLabelModel.copy(str, str2, str3, urlModel, str4);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.textColor;
    }

    public final UrlModel component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.refUrl;
    }

    public final AwemeHybridLabelModel copy(String str, String str2, String str3, UrlModel urlModel, String str4) {
        return new AwemeHybridLabelModel(str, str2, str3, urlModel, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeHybridLabelModel)) {
            return false;
        }
        AwemeHybridLabelModel awemeHybridLabelModel = (AwemeHybridLabelModel) obj;
        return C89219l.m154714a(this.backgroundColor, awemeHybridLabelModel.backgroundColor) && C89219l.m154714a(this.text, awemeHybridLabelModel.text) && C89219l.m154714a(this.textColor, awemeHybridLabelModel.textColor) && C89219l.m154714a(this.imageUrl, awemeHybridLabelModel.imageUrl) && C89219l.m154714a(this.refUrl, awemeHybridLabelModel.refUrl);
    }

    public final int hashCode() {
        String str = this.backgroundColor;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.textColor;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.imageUrl;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str4 = this.refUrl;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "AwemeHybridLabelModel(backgroundColor=" + this.backgroundColor + ", text=" + this.text + ", textColor=" + this.textColor + ", imageUrl=" + this.imageUrl + ", refUrl=" + this.refUrl + ")";
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public final String getRefUrl() {
        return this.refUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public final void setRefUrl(String str) {
        this.refUrl = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public AwemeHybridLabelModel(String str, String str2, String str3, UrlModel urlModel, String str4) {
        this.backgroundColor = str;
        this.text = str2;
        this.textColor = str3;
        this.imageUrl = urlModel;
        this.refUrl = str4;
    }
}
