package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Anchor */
public final class Anchor implements Serializable {
    @AbstractC27891c(mo46611a = "anchor_id")
    public String anchorId;
    @AbstractC27891c(mo46611a = "anchor_info")
    public AnchorCommonStruct anchorInfo;
    @AbstractC27891c(mo46611a = "business_type")
    public Integer businessType = 0;
    @AbstractC27891c(mo46611a = "shop_link")
    public AnchorShopLinkStruct shopLinkStruct;
    @AbstractC27891c(mo46611a = "show_type")
    public Integer showType = 0;
    @AbstractC27891c(mo46611a = "wikipedia_info")
    public WikipediaInfo wikipediaInfo;

    static {
        Covode.recordClassIndex(58600);
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final AnchorCommonStruct getAnchorInfo() {
        return this.anchorInfo;
    }

    public final Integer getBusinessType() {
        return this.businessType;
    }

    public final AnchorShopLinkStruct getShopLinkStruct() {
        return this.shopLinkStruct;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public final WikipediaInfo getWikipediaInfo() {
        return this.wikipediaInfo;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setAnchorInfo(AnchorCommonStruct anchorCommonStruct) {
        this.anchorInfo = anchorCommonStruct;
    }

    public final void setBusinessType(Integer num) {
        this.businessType = num;
    }

    public final void setShopLinkStruct(AnchorShopLinkStruct anchorShopLinkStruct) {
        this.shopLinkStruct = anchorShopLinkStruct;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public final void setWikipediaInfo(WikipediaInfo wikipediaInfo2) {
        this.wikipediaInfo = wikipediaInfo2;
    }
}
