package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class Rank {
    @AbstractC27891c(mo46611a = "combo_badge")
    private final ImageModel comboBadge;
    @AbstractC27891c(mo46611a = "combo_count")
    private final int comboCount;
    @AbstractC27891c(mo46611a = "rank")
    private final int rank;
    @AbstractC27891c(mo46611a = "room_id")
    private final long roomId;
    @AbstractC27891c(mo46611a = "score")
    private final long score;
    @AbstractC27891c(mo46611a = "score_description")
    private final String scoreDescription;
    @AbstractC27891c(mo46611a = "user")
    private final User user;

    static {
        Covode.recordClassIndex(11934);
    }

    public Rank() {
        this(null, 0, null, 0, 0, null, 0, 127, null);
    }

    /* renamed from: com_bytedance_android_livesdk_rank_impl_api_model_Rank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m18860xe9afa15e(int i) {
        return i;
    }

    /* renamed from: com_bytedance_android_livesdk_rank_impl_api_model_Rank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m18861xe9afa15e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ Rank copy$default(Rank rank2, User user2, int i, String str, long j, long j2, ImageModel imageModel, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            user2 = rank2.user;
        }
        if ((i3 & 2) != 0) {
            i = rank2.rank;
        }
        if ((i3 & 4) != 0) {
            str = rank2.scoreDescription;
        }
        if ((i3 & 8) != 0) {
            j = rank2.roomId;
        }
        if ((i3 & 16) != 0) {
            j2 = rank2.score;
        }
        if ((i3 & 32) != 0) {
            imageModel = rank2.comboBadge;
        }
        if ((i3 & 64) != 0) {
            i2 = rank2.comboCount;
        }
        return rank2.copy(user2, i, str, j, j2, imageModel, i2);
    }

    public final User component1() {
        return this.user;
    }

    public final int component2() {
        return this.rank;
    }

    public final String component3() {
        return this.scoreDescription;
    }

    public final long component4() {
        return this.roomId;
    }

    public final long component5() {
        return this.score;
    }

    public final ImageModel component6() {
        return this.comboBadge;
    }

    public final int component7() {
        return this.comboCount;
    }

    public final Rank copy(User user2, int i, String str, long j, long j2, ImageModel imageModel, int i2) {
        C89219l.m154721d(user2, "");
        C89219l.m154721d(str, "");
        return new Rank(user2, i, str, j, j2, imageModel, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rank)) {
            return false;
        }
        Rank rank2 = (Rank) obj;
        return C89219l.m154714a(this.user, rank2.user) && this.rank == rank2.rank && C89219l.m154714a(this.scoreDescription, rank2.scoreDescription) && this.roomId == rank2.roomId && this.score == rank2.score && C89219l.m154714a(this.comboBadge, rank2.comboBadge) && this.comboCount == rank2.comboCount;
    }

    public final int hashCode() {
        User user2 = this.user;
        int i = 0;
        int hashCode = (((user2 != null ? user2.hashCode() : 0) * 31) + m18860xe9afa15e(this.rank)) * 31;
        String str = this.scoreDescription;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + m18861xe9afa15e(this.roomId)) * 31) + m18861xe9afa15e(this.score)) * 31;
        ImageModel imageModel = this.comboBadge;
        if (imageModel != null) {
            i = imageModel.hashCode();
        }
        return ((hashCode2 + i) * 31) + m18860xe9afa15e(this.comboCount);
    }

    public final String toString() {
        return "Rank(user=" + this.user + ", rank=" + this.rank + ", scoreDescription=" + this.scoreDescription + ", roomId=" + this.roomId + ", score=" + this.score + ", comboBadge=" + this.comboBadge + ", comboCount=" + this.comboCount + ")";
    }

    public final ImageModel getComboBadge() {
        return this.comboBadge;
    }

    public final int getComboCount() {
        return this.comboCount;
    }

    public final int getRank() {
        return this.rank;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getScore() {
        return this.score;
    }

    public final String getScoreDescription() {
        return this.scoreDescription;
    }

    public final User getUser() {
        return this.user;
    }

    public Rank(User user2, int i, String str, long j, long j2, ImageModel imageModel, int i2) {
        C89219l.m154721d(user2, "");
        C89219l.m154721d(str, "");
        this.user = user2;
        this.rank = i;
        this.scoreDescription = str;
        this.roomId = j;
        this.score = j2;
        this.comboBadge = imageModel;
        this.comboCount = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Rank(User user2, int i, String str, long j, long j2, ImageModel imageModel, int i2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? new User() : user2, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? Long.MIN_VALUE : j, (i3 & 16) != 0 ? 0 : j2, (i3 & 32) != 0 ? null : imageModel, (i3 & 64) == 0 ? i2 : 0);
    }
}
