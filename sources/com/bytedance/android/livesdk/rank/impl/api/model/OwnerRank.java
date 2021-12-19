package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class OwnerRank {
    @AbstractC27891c(mo46611a = "gap_description")
    private final C9698b gapDescription;
    @AbstractC27891c(mo46611a = "gap_score")
    private final long gapScore;
    @AbstractC27891c(mo46611a = "rank")
    private final int rank;
    @AbstractC27891c(mo46611a = "rank_str")
    private final String rankStr;
    @AbstractC27891c(mo46611a = "score")
    private final long score;
    @AbstractC27891c(mo46611a = "user")
    private final User user;

    static {
        Covode.recordClassIndex(11933);
    }

    public OwnerRank() {
        this(null, 0, null, null, 0, 0, 63, null);
    }

    /* renamed from: com_bytedance_android_livesdk_rank_impl_api_model_OwnerRank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m18858x383bb03d(int i) {
        return i;
    }

    /* renamed from: com_bytedance_android_livesdk_rank_impl_api_model_OwnerRank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m18859x383bb03d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ OwnerRank copy$default(OwnerRank ownerRank, User user2, int i, String str, C9698b bVar, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user2 = ownerRank.user;
        }
        if ((i2 & 2) != 0) {
            i = ownerRank.rank;
        }
        if ((i2 & 4) != 0) {
            str = ownerRank.rankStr;
        }
        if ((i2 & 8) != 0) {
            bVar = ownerRank.gapDescription;
        }
        if ((i2 & 16) != 0) {
            j = ownerRank.score;
        }
        if ((i2 & 32) != 0) {
            j2 = ownerRank.gapScore;
        }
        return ownerRank.copy(user2, i, str, bVar, j, j2);
    }

    public final User component1() {
        return this.user;
    }

    public final int component2() {
        return this.rank;
    }

    public final String component3() {
        return this.rankStr;
    }

    public final C9698b component4() {
        return this.gapDescription;
    }

    public final long component5() {
        return this.score;
    }

    public final long component6() {
        return this.gapScore;
    }

    public final OwnerRank copy(User user2, int i, String str, C9698b bVar, long j, long j2) {
        C89219l.m154721d(user2, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        return new OwnerRank(user2, i, str, bVar, j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerRank)) {
            return false;
        }
        OwnerRank ownerRank = (OwnerRank) obj;
        return C89219l.m154714a(this.user, ownerRank.user) && this.rank == ownerRank.rank && C89219l.m154714a(this.rankStr, ownerRank.rankStr) && C89219l.m154714a(this.gapDescription, ownerRank.gapDescription) && this.score == ownerRank.score && this.gapScore == ownerRank.gapScore;
    }

    public final int hashCode() {
        User user2 = this.user;
        int i = 0;
        int hashCode = (((user2 != null ? user2.hashCode() : 0) * 31) + m18858x383bb03d(this.rank)) * 31;
        String str = this.rankStr;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C9698b bVar = this.gapDescription;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return ((((hashCode2 + i) * 31) + m18859x383bb03d(this.score)) * 31) + m18859x383bb03d(this.gapScore);
    }

    public final String toString() {
        return "OwnerRank(user=" + this.user + ", rank=" + this.rank + ", rankStr=" + this.rankStr + ", gapDescription=" + this.gapDescription + ", score=" + this.score + ", gapScore=" + this.gapScore + ")";
    }

    public final C9698b getGapDescription() {
        return this.gapDescription;
    }

    public final long getGapScore() {
        return this.gapScore;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getRankStr() {
        return this.rankStr;
    }

    public final long getScore() {
        return this.score;
    }

    public final User getUser() {
        return this.user;
    }

    public OwnerRank(User user2, int i, String str, C9698b bVar, long j, long j2) {
        C89219l.m154721d(user2, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.user = user2;
        this.rank = i;
        this.rankStr = str;
        this.gapDescription = bVar;
        this.score = j;
        this.gapScore = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OwnerRank(User user2, int i, String str, C9698b bVar, long j, long j2, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? new User() : user2, (i2 & 2) != 0 ? Integer.MIN_VALUE : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? new C9698b() : bVar, (i2 & 16) != 0 ? 0 : j, (i2 & 32) == 0 ? j2 : 0);
    }
}
