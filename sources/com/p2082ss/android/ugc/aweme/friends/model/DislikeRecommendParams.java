package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams */
public final class DislikeRecommendParams {
    public final String secUid;
    public final String uid;

    static {
        Covode.recordClassIndex(60885);
    }

    public static /* synthetic */ DislikeRecommendParams copy$default(DislikeRecommendParams dislikeRecommendParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dislikeRecommendParams.uid;
        }
        if ((i & 2) != 0) {
            str2 = dislikeRecommendParams.secUid;
        }
        return dislikeRecommendParams.copy(str, str2);
    }

    public final DislikeRecommendParams copy(String str, String str2) {
        C89219l.m154721d(str, "");
        return new DislikeRecommendParams(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DislikeRecommendParams)) {
            return false;
        }
        DislikeRecommendParams dislikeRecommendParams = (DislikeRecommendParams) obj;
        return C89219l.m154714a(this.uid, dislikeRecommendParams.uid) && C89219l.m154714a(this.secUid, dislikeRecommendParams.secUid);
    }

    public final int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUid;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DislikeRecommendParams(uid=" + this.uid + ", secUid=" + this.secUid + ")";
    }

    public DislikeRecommendParams(String str, String str2) {
        C89219l.m154721d(str, "");
        this.uid = str;
        this.secUid = str2;
    }
}
