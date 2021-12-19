package com.p2082ss.android.ugc.aweme.feed.model.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.search.SearchLiveCommdityStruct */
public final class SearchLiveCommdityStruct implements Serializable {
    @AbstractC27891c(mo46611a = "cover")
    private String cover;
    @AbstractC27891c(mo46611a = "height")
    private int height;
    @AbstractC27891c(mo46611a = "price")
    private String price = "";
    @AbstractC27891c(mo46611a = "product_id")
    private String productId;
    @AbstractC27891c(mo46611a = "promotion_id")
    private String promotionId;
    @AbstractC27891c(mo46611a = "scheme")
    private String scheme;
    @AbstractC27891c(mo46611a = "source")
    private String source;
    @AbstractC27891c(mo46611a = "title")
    private String title;

    static {
        Covode.recordClassIndex(58826);
    }

    public final String getCover() {
        return this.cover;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setCover(String str) {
        this.cover = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setPromotionId(String str) {
        this.promotionId = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setPrice(String str) {
        C89219l.m154721d(str, "");
        this.price = str;
    }
}
