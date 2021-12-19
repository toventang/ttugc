package com.p2082ss.android.ugc.aweme.feed.model.upvote;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason */
public final class UpvoteReason implements Serializable {
    @AbstractC27891c(mo46611a = "item_id")
    public String itemId;
    @AbstractC27891c(mo46611a = "middle_count")
    public Integer middleCount;
    @AbstractC27891c(mo46611a = "middle_info")
    public long[] middleInfo;
    @AbstractC27891c(mo46611a = "reason_type")
    public Integer reasonType;
    @AbstractC27891c(mo46611a = "sub_type")
    public Integer subType;
    @AbstractC27891c(mo46611a = "user_id")
    public String userId;

    static {
        Covode.recordClassIndex(58845);
    }

    public UpvoteReason() {
    }

    public static /* synthetic */ UpvoteReason copy$default(UpvoteReason upvoteReason, Integer num, Integer num2, long[] jArr, Integer num3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = upvoteReason.reasonType;
        }
        if ((i & 2) != 0) {
            num2 = upvoteReason.subType;
        }
        if ((i & 4) != 0) {
            jArr = upvoteReason.middleInfo;
        }
        if ((i & 8) != 0) {
            num3 = upvoteReason.middleCount;
        }
        if ((i & 16) != 0) {
            str = upvoteReason.userId;
        }
        if ((i & 32) != 0) {
            str2 = upvoteReason.itemId;
        }
        return upvoteReason.copy(num, num2, jArr, num3, str, str2);
    }

    public final Integer component1() {
        return this.reasonType;
    }

    public final Integer component2() {
        return this.subType;
    }

    public final long[] component3() {
        return this.middleInfo;
    }

    public final Integer component4() {
        return this.middleCount;
    }

    public final String component5() {
        return this.userId;
    }

    public final String component6() {
        return this.itemId;
    }

    public final UpvoteReason copy(Integer num, Integer num2, long[] jArr, Integer num3, String str, String str2) {
        return new UpvoteReason(num, num2, jArr, num3, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvoteReason)) {
            return false;
        }
        UpvoteReason upvoteReason = (UpvoteReason) obj;
        return C89219l.m154714a(this.reasonType, upvoteReason.reasonType) && C89219l.m154714a(this.subType, upvoteReason.subType) && C89219l.m154714a(this.middleInfo, upvoteReason.middleInfo) && C89219l.m154714a(this.middleCount, upvoteReason.middleCount) && C89219l.m154714a(this.userId, upvoteReason.userId) && C89219l.m154714a(this.itemId, upvoteReason.itemId);
    }

    public final int hashCode() {
        Integer num = this.reasonType;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.subType;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        long[] jArr = this.middleInfo;
        int hashCode3 = (hashCode2 + (jArr != null ? Arrays.hashCode(jArr) : 0)) * 31;
        Integer num3 = this.middleCount;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str = this.userId;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.itemId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "UpvoteReason(reasonType=" + this.reasonType + ", subType=" + this.subType + ", middleInfo=" + Arrays.toString(this.middleInfo) + ", middleCount=" + this.middleCount + ", userId=" + this.userId + ", itemId=" + this.itemId + ")";
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Integer getMiddleCount() {
        return this.middleCount;
    }

    public final long[] getMiddleInfo() {
        return this.middleInfo;
    }

    public final Integer getReasonType() {
        return this.reasonType;
    }

    public final Integer getSubType() {
        return this.subType;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public UpvoteReason(Integer num, Integer num2, long[] jArr, Integer num3, String str, String str2) {
        this.reasonType = num;
        this.subType = num2;
        this.middleInfo = jArr;
        this.middleCount = num3;
        this.userId = str;
        this.itemId = str2;
    }
}
