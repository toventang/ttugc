package com.p2082ss.android.ugc.aweme.comment.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftStruct */
public final class GiftStruct {
    @AbstractC27891c(mo46611a = "describe")
    private final String describeMessage;
    @AbstractC27891c(mo46611a = "diamond_count")
    private final int diamondCount;
    @AbstractC27891c(mo46611a = "asset")
    private final UrlModel effectAsset;
    @AbstractC27891c(mo46611a = "icon")
    private final UrlModel iconList;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private final long f86225id;
    @AbstractC27891c(mo46611a = "image")
    private final UrlModel imageList;
    @AbstractC27891c(mo46611a = StringSet.name)
    private final String name;

    static {
        Covode.recordClassIndex(43774);
    }

    /* renamed from: com_ss_android_ugc_aweme_comment_gift_model_GiftStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m74249xc208abeb(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_comment_gift_model_GiftStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m74250xc208abeb(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ GiftStruct copy$default(GiftStruct giftStruct, long j, String str, String str2, int i, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = giftStruct.f86225id;
        }
        if ((i2 & 2) != 0) {
            str = giftStruct.name;
        }
        if ((i2 & 4) != 0) {
            str2 = giftStruct.describeMessage;
        }
        if ((i2 & 8) != 0) {
            i = giftStruct.diamondCount;
        }
        if ((i2 & 16) != 0) {
            urlModel = giftStruct.imageList;
        }
        if ((i2 & 32) != 0) {
            urlModel2 = giftStruct.iconList;
        }
        if ((i2 & 64) != 0) {
            urlModel3 = giftStruct.effectAsset;
        }
        return giftStruct.copy(j, str, str2, i, urlModel, urlModel2, urlModel3);
    }

    public final long component1() {
        return this.f86225id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.describeMessage;
    }

    public final int component4() {
        return this.diamondCount;
    }

    public final UrlModel component5() {
        return this.imageList;
    }

    public final UrlModel component6() {
        return this.iconList;
    }

    public final UrlModel component7() {
        return this.effectAsset;
    }

    public final GiftStruct copy(long j, String str, String str2, int i, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        C89219l.m154721d(str, "");
        return new GiftStruct(j, str, str2, i, urlModel, urlModel2, urlModel3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftStruct)) {
            return false;
        }
        GiftStruct giftStruct = (GiftStruct) obj;
        return this.f86225id == giftStruct.f86225id && C89219l.m154714a(this.name, giftStruct.name) && C89219l.m154714a(this.describeMessage, giftStruct.describeMessage) && this.diamondCount == giftStruct.diamondCount && C89219l.m154714a(this.imageList, giftStruct.imageList) && C89219l.m154714a(this.iconList, giftStruct.iconList) && C89219l.m154714a(this.effectAsset, giftStruct.effectAsset);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_comment_gift_model_GiftStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m74250xc208abeb(this.f86225id) * 31;
        String str = this.name;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_comment_gift_model_GiftStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.describeMessage;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m74249xc208abeb(this.diamondCount)) * 31;
        UrlModel urlModel = this.imageList;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.iconList;
        int hashCode4 = (hashCode3 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        UrlModel urlModel3 = this.effectAsset;
        if (urlModel3 != null) {
            i = urlModel3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "GiftStruct(id=" + this.f86225id + ", name=" + this.name + ", describeMessage=" + this.describeMessage + ", diamondCount=" + this.diamondCount + ", imageList=" + this.imageList + ", iconList=" + this.iconList + ", effectAsset=" + this.effectAsset + ")";
    }

    public final String getDescribeMessage() {
        return this.describeMessage;
    }

    public final int getDiamondCount() {
        return this.diamondCount;
    }

    public final UrlModel getEffectAsset() {
        return this.effectAsset;
    }

    public final UrlModel getIconList() {
        return this.iconList;
    }

    public final long getId() {
        return this.f86225id;
    }

    public final UrlModel getImageList() {
        return this.imageList;
    }

    public final String getName() {
        return this.name;
    }

    public GiftStruct(long j, String str, String str2, int i, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        C89219l.m154721d(str, "");
        this.f86225id = j;
        this.name = str;
        this.describeMessage = str2;
        this.diamondCount = i;
        this.imageList = urlModel;
        this.iconList = urlModel2;
        this.effectAsset = urlModel3;
    }
}
