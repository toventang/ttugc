package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel */
public final class AwemeRelationRecommendModel implements Serializable {
    @AbstractC27891c(mo46611a = "friend_type_str")
    public String friendTypeStr;
    @AbstractC27891c(mo46611a = "rec_type")
    public String recType;
    @AbstractC27891c(mo46611a = "recommend_type")
    public long recommendType;
    @AbstractC27891c(mo46611a = "relation_text_key")
    public String relationTextKey;

    static {
        Covode.recordClassIndex(58633);
    }

    public AwemeRelationRecommendModel() {
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_AwemeRelationRecommendModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93165x4dcd7348(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ AwemeRelationRecommendModel copy$default(AwemeRelationRecommendModel awemeRelationRecommendModel, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = awemeRelationRecommendModel.recommendType;
        }
        if ((i & 2) != 0) {
            str = awemeRelationRecommendModel.relationTextKey;
        }
        if ((i & 4) != 0) {
            str2 = awemeRelationRecommendModel.recType;
        }
        if ((i & 8) != 0) {
            str3 = awemeRelationRecommendModel.friendTypeStr;
        }
        return awemeRelationRecommendModel.copy(j, str, str2, str3);
    }

    public final long component1() {
        return this.recommendType;
    }

    public final String component2() {
        return this.relationTextKey;
    }

    public final String component3() {
        return this.recType;
    }

    public final String component4() {
        return this.friendTypeStr;
    }

    public final AwemeRelationRecommendModel copy(long j, String str, String str2, String str3) {
        return new AwemeRelationRecommendModel(j, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeRelationRecommendModel)) {
            return false;
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = (AwemeRelationRecommendModel) obj;
        return this.recommendType == awemeRelationRecommendModel.recommendType && C89219l.m154714a(this.relationTextKey, awemeRelationRecommendModel.relationTextKey) && C89219l.m154714a(this.recType, awemeRelationRecommendModel.recType) && C89219l.m154714a(this.friendTypeStr, awemeRelationRecommendModel.friendTypeStr);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_AwemeRelationRecommendModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m93165x4dcd7348(this.recommendType) * 31;
        String str = this.relationTextKey;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_AwemeRelationRecommendModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.recType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.friendTypeStr;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AwemeRelationRecommendModel(recommendType=" + this.recommendType + ", relationTextKey=" + this.relationTextKey + ", recType=" + this.recType + ", friendTypeStr=" + this.friendTypeStr + ")";
    }

    public final String getFriendTypeStr() {
        return this.friendTypeStr;
    }

    public final String getRecType() {
        return this.recType;
    }

    public final long getRecommendType() {
        return this.recommendType;
    }

    public final String getRelationTextKey() {
        return this.relationTextKey;
    }

    public final void setFriendTypeStr(String str) {
        this.friendTypeStr = str;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setRecommendType(long j) {
        this.recommendType = j;
    }

    public final void setRelationTextKey(String str) {
        this.relationTextKey = str;
    }

    public AwemeRelationRecommendModel(long j, String str, String str2, String str3) {
        this.recommendType = j;
        this.relationTextKey = str;
        this.recType = str2;
        this.friendTypeStr = str3;
    }
}
