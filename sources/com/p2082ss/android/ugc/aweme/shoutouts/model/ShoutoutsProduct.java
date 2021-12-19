package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsProduct */
public final class ShoutoutsProduct {
    @AbstractC27891c(mo46611a = "creator_uid")
    private final String creatorUid;
    @AbstractC27891c(mo46611a = "description")
    private final String description;
    @AbstractC27891c(mo46611a = "posted")
    private final boolean posted;
    @AbstractC27891c(mo46611a = "price")
    private final ShoutoutsPrice price;
    @AbstractC27891c(mo46611a = "product_id")
    private final String productId;
    @AbstractC27891c(mo46611a = "rating_avg")
    private final float ratingAvg;
    @AbstractC27891c(mo46611a = "rating_cnt")
    private final int ratingCnt;
    @AbstractC27891c(mo46611a = "restrict")
    private final ShoutoutsOrderRestrict restrict;
    @AbstractC27891c(mo46611a = "show_rating")
    private final boolean showRating;
    @AbstractC27891c(mo46611a = "sold_cnt")
    private final int soldCnt;
    @AbstractC27891c(mo46611a = "status")
    private final int status;
    @AbstractC27891c(mo46611a = "video_info")
    private final Aweme videoInfo;

    static {
        Covode.recordClassIndex(87216);
    }

    /* renamed from: com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsProduct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m130890xb55447f7(int i) {
        return i;
    }

    public static /* synthetic */ ShoutoutsProduct copy$default(ShoutoutsProduct shoutoutsProduct, Aweme aweme, ShoutoutsPrice shoutoutsPrice, String str, float f, int i, int i2, String str2, boolean z, boolean z2, ShoutoutsOrderRestrict shoutoutsOrderRestrict, int i3, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aweme = shoutoutsProduct.videoInfo;
        }
        if ((i4 & 2) != 0) {
            shoutoutsPrice = shoutoutsProduct.price;
        }
        if ((i4 & 4) != 0) {
            str = shoutoutsProduct.description;
        }
        if ((i4 & 8) != 0) {
            f = shoutoutsProduct.ratingAvg;
        }
        if ((i4 & 16) != 0) {
            i = shoutoutsProduct.ratingCnt;
        }
        if ((i4 & 32) != 0) {
            i2 = shoutoutsProduct.soldCnt;
        }
        if ((i4 & 64) != 0) {
            str2 = shoutoutsProduct.productId;
        }
        if ((i4 & 128) != 0) {
            z = shoutoutsProduct.showRating;
        }
        if ((i4 & 256) != 0) {
            z2 = shoutoutsProduct.posted;
        }
        if ((i4 & 512) != 0) {
            shoutoutsOrderRestrict = shoutoutsProduct.restrict;
        }
        if ((i4 & 1024) != 0) {
            i3 = shoutoutsProduct.status;
        }
        if ((i4 & 2048) != 0) {
            str3 = shoutoutsProduct.creatorUid;
        }
        return shoutoutsProduct.copy(aweme, shoutoutsPrice, str, f, i, i2, str2, z, z2, shoutoutsOrderRestrict, i3, str3);
    }

    public final Aweme component1() {
        return this.videoInfo;
    }

    public final ShoutoutsOrderRestrict component10() {
        return this.restrict;
    }

    public final int component11() {
        return this.status;
    }

    public final String component12() {
        return this.creatorUid;
    }

    public final ShoutoutsPrice component2() {
        return this.price;
    }

    public final String component3() {
        return this.description;
    }

    public final float component4() {
        return this.ratingAvg;
    }

    public final int component5() {
        return this.ratingCnt;
    }

    public final int component6() {
        return this.soldCnt;
    }

    public final String component7() {
        return this.productId;
    }

    public final boolean component8() {
        return this.showRating;
    }

    public final boolean component9() {
        return this.posted;
    }

    public final ShoutoutsProduct copy(Aweme aweme, ShoutoutsPrice shoutoutsPrice, String str, float f, int i, int i2, String str2, boolean z, boolean z2, ShoutoutsOrderRestrict shoutoutsOrderRestrict, int i3, String str3) {
        return new ShoutoutsProduct(aweme, shoutoutsPrice, str, f, i, i2, str2, z, z2, shoutoutsOrderRestrict, i3, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsProduct)) {
            return false;
        }
        ShoutoutsProduct shoutoutsProduct = (ShoutoutsProduct) obj;
        return C89219l.m154714a(this.videoInfo, shoutoutsProduct.videoInfo) && C89219l.m154714a(this.price, shoutoutsProduct.price) && C89219l.m154714a(this.description, shoutoutsProduct.description) && Float.compare(this.ratingAvg, shoutoutsProduct.ratingAvg) == 0 && this.ratingCnt == shoutoutsProduct.ratingCnt && this.soldCnt == shoutoutsProduct.soldCnt && C89219l.m154714a(this.productId, shoutoutsProduct.productId) && this.showRating == shoutoutsProduct.showRating && this.posted == shoutoutsProduct.posted && C89219l.m154714a(this.restrict, shoutoutsProduct.restrict) && this.status == shoutoutsProduct.status && C89219l.m154714a(this.creatorUid, shoutoutsProduct.creatorUid);
    }

    public final int hashCode() {
        Aweme aweme = this.videoInfo;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        ShoutoutsPrice shoutoutsPrice = this.price;
        int hashCode2 = (hashCode + (shoutoutsPrice != null ? shoutoutsPrice.hashCode() : 0)) * 31;
        String str = this.description;
        int hashCode3 = (((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + m130889xb55447f7(this.ratingAvg)) * 31) + m130890xb55447f7(this.ratingCnt)) * 31) + m130890xb55447f7(this.soldCnt)) * 31;
        String str2 = this.productId;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.showRating;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode4 + i3) * 31;
        if (!this.posted) {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        ShoutoutsOrderRestrict shoutoutsOrderRestrict = this.restrict;
        int hashCode5 = (((i7 + (shoutoutsOrderRestrict != null ? shoutoutsOrderRestrict.hashCode() : 0)) * 31) + m130890xb55447f7(this.status)) * 31;
        String str3 = this.creatorUid;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "ShoutoutsProduct(videoInfo=" + this.videoInfo + ", price=" + this.price + ", description=" + this.description + ", ratingAvg=" + this.ratingAvg + ", ratingCnt=" + this.ratingCnt + ", soldCnt=" + this.soldCnt + ", productId=" + this.productId + ", showRating=" + this.showRating + ", posted=" + this.posted + ", restrict=" + this.restrict + ", status=" + this.status + ", creatorUid=" + this.creatorUid + ")";
    }

    public final String getCreatorUid() {
        return this.creatorUid;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getPosted() {
        return this.posted;
    }

    public final ShoutoutsPrice getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final float getRatingAvg() {
        return this.ratingAvg;
    }

    public final int getRatingCnt() {
        return this.ratingCnt;
    }

    public final ShoutoutsOrderRestrict getRestrict() {
        return this.restrict;
    }

    public final boolean getShowRating() {
        return this.showRating;
    }

    public final int getSoldCnt() {
        return this.soldCnt;
    }

    public final int getStatus() {
        return this.status;
    }

    public final Aweme getVideoInfo() {
        return this.videoInfo;
    }

    /* renamed from: com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsProduct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m130889xb55447f7(float f) {
        return Float.floatToIntBits(f);
    }

    public ShoutoutsProduct(Aweme aweme, ShoutoutsPrice shoutoutsPrice, String str, float f, int i, int i2, String str2, boolean z, boolean z2, ShoutoutsOrderRestrict shoutoutsOrderRestrict, int i3, String str3) {
        this.videoInfo = aweme;
        this.price = shoutoutsPrice;
        this.description = str;
        this.ratingAvg = f;
        this.ratingCnt = i;
        this.soldCnt = i2;
        this.productId = str2;
        this.showRating = z;
        this.posted = z2;
        this.restrict = shoutoutsOrderRestrict;
        this.status = i3;
        this.creatorUid = str3;
    }
}
