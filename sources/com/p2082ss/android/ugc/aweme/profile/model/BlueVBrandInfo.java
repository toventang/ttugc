package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo */
public class BlueVBrandInfo implements Serializable {
    @AbstractC27891c(mo46611a = "brand_id")
    public int brandId;
    @AbstractC27891c(mo46611a = "brand_name")
    public String brandName;
    @AbstractC27891c(mo46611a = "category_id")
    public int categoryId;
    @AbstractC27891c(mo46611a = "category_name")
    public String categoryName;
    @AbstractC27891c(mo46611a = "heat")
    public long heat;
    @AbstractC27891c(mo46611a = "logo_url")
    public UrlModel logoUrl;
    @AbstractC27891c(mo46611a = "rank")
    public int rank;
    @AbstractC27891c(mo46611a = "rank_diff")
    public int rankDiff;
    @AbstractC27891c(mo46611a = "tag_name")
    public String tagName;

    static {
        Covode.recordClassIndex(75159);
    }

    public int getBrandId() {
        return this.brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public long getHeat() {
        return this.heat;
    }

    public UrlModel getLogoUrl() {
        return this.logoUrl;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRankDiff() {
        return this.rankDiff;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setBrandId(int i) {
        this.brandId = i;
    }

    public void setBrandName(String str) {
        this.brandName = str;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setHeat(long j) {
        this.heat = j;
    }

    public void setLogoUrl(UrlModel urlModel) {
        this.logoUrl = urlModel;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setRankDiff(int i) {
        this.rankDiff = i;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }
}
