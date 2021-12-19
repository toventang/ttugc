package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct */
public final class MatchedFriendStruct implements Serializable {
    @AbstractC27891c(mo46611a = "external_recommend_reason")
    public ExternalRecommendReasonStruct externalRecommendReasonStruct;
    @AbstractC27891c(mo46611a = "mutual_struct")
    public MutualStruct mMutualStruct;
    @AbstractC27891c(mo46611a = "rec_type")
    public String recType;
    @AbstractC27891c(mo46611a = "recommend_reason")
    public String recommendReason;
    @AbstractC27891c(mo46611a = "relation_type")
    public String relationType;

    static {
        Covode.recordClassIndex(75189);
    }

    public MatchedFriendStruct() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MatchedFriendStruct copy$default(MatchedFriendStruct matchedFriendStruct, String str, String str2, String str3, MutualStruct mutualStruct, ExternalRecommendReasonStruct externalRecommendReasonStruct2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchedFriendStruct.recommendReason;
        }
        if ((i & 2) != 0) {
            str2 = matchedFriendStruct.recType;
        }
        if ((i & 4) != 0) {
            str3 = matchedFriendStruct.relationType;
        }
        if ((i & 8) != 0) {
            mutualStruct = matchedFriendStruct.mMutualStruct;
        }
        if ((i & 16) != 0) {
            externalRecommendReasonStruct2 = matchedFriendStruct.externalRecommendReasonStruct;
        }
        return matchedFriendStruct.copy(str, str2, str3, mutualStruct, externalRecommendReasonStruct2);
    }

    public final String component1() {
        return this.recommendReason;
    }

    public final String component2() {
        return this.recType;
    }

    public final String component3() {
        return this.relationType;
    }

    public final MutualStruct component4() {
        return this.mMutualStruct;
    }

    public final ExternalRecommendReasonStruct component5() {
        return this.externalRecommendReasonStruct;
    }

    public final MatchedFriendStruct copy(String str, String str2, String str3, MutualStruct mutualStruct, ExternalRecommendReasonStruct externalRecommendReasonStruct2) {
        return new MatchedFriendStruct(str, str2, str3, mutualStruct, externalRecommendReasonStruct2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchedFriendStruct)) {
            return false;
        }
        MatchedFriendStruct matchedFriendStruct = (MatchedFriendStruct) obj;
        return C89219l.m154714a(this.recommendReason, matchedFriendStruct.recommendReason) && C89219l.m154714a(this.recType, matchedFriendStruct.recType) && C89219l.m154714a(this.relationType, matchedFriendStruct.relationType) && C89219l.m154714a(this.mMutualStruct, matchedFriendStruct.mMutualStruct) && C89219l.m154714a(this.externalRecommendReasonStruct, matchedFriendStruct.externalRecommendReasonStruct);
    }

    public final int hashCode() {
        String str = this.recommendReason;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.recType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.relationType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        MutualStruct mutualStruct = this.mMutualStruct;
        int hashCode4 = (hashCode3 + (mutualStruct != null ? mutualStruct.hashCode() : 0)) * 31;
        ExternalRecommendReasonStruct externalRecommendReasonStruct2 = this.externalRecommendReasonStruct;
        if (externalRecommendReasonStruct2 != null) {
            i = externalRecommendReasonStruct2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "MatchedFriendStruct(recommendReason=" + this.recommendReason + ", recType=" + this.recType + ", relationType=" + this.relationType + ", mMutualStruct=" + this.mMutualStruct + ", externalRecommendReasonStruct=" + this.externalRecommendReasonStruct + ")";
    }

    public final ExternalRecommendReasonStruct getExternalRecommendReasonStruct() {
        return this.externalRecommendReasonStruct;
    }

    public final MutualStruct getMMutualStruct() {
        return this.mMutualStruct;
    }

    public final String getRecType() {
        return this.recType;
    }

    public final String getRecommendReason() {
        return this.recommendReason;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public final void setExternalRecommendReasonStruct(ExternalRecommendReasonStruct externalRecommendReasonStruct2) {
        this.externalRecommendReasonStruct = externalRecommendReasonStruct2;
    }

    public final void setMMutualStruct(MutualStruct mutualStruct) {
        this.mMutualStruct = mutualStruct;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public final void setRelationType(String str) {
        this.relationType = str;
    }

    public MatchedFriendStruct(String str, String str2, String str3, MutualStruct mutualStruct, ExternalRecommendReasonStruct externalRecommendReasonStruct2) {
        this.recommendReason = str;
        this.recType = str2;
        this.relationType = str3;
        this.mMutualStruct = mutualStruct;
        this.externalRecommendReasonStruct = externalRecommendReasonStruct2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MatchedFriendStruct(String str, String str2, String str3, MutualStruct mutualStruct, ExternalRecommendReasonStruct externalRecommendReasonStruct2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : mutualStruct, (i & 16) == 0 ? externalRecommendReasonStruct2 : null);
    }
}
