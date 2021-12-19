package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.TradeEntranceInfo */
public final class TradeEntranceInfo implements Serializable {
    @AbstractC27891c(mo46611a = "schema")
    private String schema;
    @AbstractC27891c(mo46611a = "tips")
    private String tips;
    @AbstractC27891c(mo46611a = "to_review_count")
    private Integer toReviewCount;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final int type;

    static {
        Covode.recordClassIndex(52996);
    }

    public TradeEntranceInfo() {
        this(0, null, null, null, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_TradeEntranceInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87362x173abbdd(int i) {
        return i;
    }

    public static /* synthetic */ TradeEntranceInfo copy$default(TradeEntranceInfo tradeEntranceInfo, int i, String str, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tradeEntranceInfo.type;
        }
        if ((i2 & 2) != 0) {
            str = tradeEntranceInfo.tips;
        }
        if ((i2 & 4) != 0) {
            str2 = tradeEntranceInfo.schema;
        }
        if ((i2 & 8) != 0) {
            num = tradeEntranceInfo.toReviewCount;
        }
        return tradeEntranceInfo.copy(i, str, str2, num);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.tips;
    }

    public final String component3() {
        return this.schema;
    }

    public final Integer component4() {
        return this.toReviewCount;
    }

    public final TradeEntranceInfo copy(int i, String str, String str2, Integer num) {
        return new TradeEntranceInfo(i, str, str2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeEntranceInfo)) {
            return false;
        }
        TradeEntranceInfo tradeEntranceInfo = (TradeEntranceInfo) obj;
        return this.type == tradeEntranceInfo.type && C89219l.m154714a(this.tips, tradeEntranceInfo.tips) && C89219l.m154714a(this.schema, tradeEntranceInfo.schema) && C89219l.m154714a(this.toReviewCount, tradeEntranceInfo.toReviewCount);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_TradeEntranceInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m87362x173abbdd(this.type) * 31;
        String str = this.tips;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_TradeEntranceInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.toReviewCount;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "TradeEntranceInfo(type=" + this.type + ", tips=" + this.tips + ", schema=" + this.schema + ", toReviewCount=" + this.toReviewCount + ")";
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTips() {
        return this.tips;
    }

    public final Integer getToReviewCount() {
        return this.toReviewCount;
    }

    public final int getType() {
        return this.type;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTips(String str) {
        this.tips = str;
    }

    public final void setToReviewCount(Integer num) {
        this.toReviewCount = num;
    }

    public TradeEntranceInfo(int i, String str, String str2, Integer num) {
        this.type = i;
        this.tips = str;
        this.schema = str2;
        this.toReviewCount = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TradeEntranceInfo(int i, String str, String str2, Integer num, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? OrderEntranceType.CLOSE.ordinal() : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "aweme://ec/order_center" : str2, (i2 & 8) != 0 ? 0 : num);
    }
}
