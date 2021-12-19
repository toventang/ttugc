package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.model.LikeListResponse */
public final class LikeListResponse extends BaseResponse implements Serializable {
    private final long cursor;
    private final boolean hasMore;
    private final boolean isShowLimit;
    private final List<User> likeList;

    static {
        Covode.recordClassIndex(43873);
    }

    public LikeListResponse() {
        this(false, 0, null, false, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_comment_model_LikeListResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m74400xe9f481db(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.model.LikeListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LikeListResponse copy$default(LikeListResponse likeListResponse, boolean z, long j, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = likeListResponse.hasMore;
        }
        if ((i & 2) != 0) {
            j = likeListResponse.cursor;
        }
        if ((i & 4) != 0) {
            list = likeListResponse.likeList;
        }
        if ((i & 8) != 0) {
            z2 = likeListResponse.isShowLimit;
        }
        return likeListResponse.copy(z, j, list, z2);
    }

    public final boolean component1() {
        return this.hasMore;
    }

    public final long component2() {
        return this.cursor;
    }

    public final List<User> component3() {
        return this.likeList;
    }

    public final boolean component4() {
        return this.isShowLimit;
    }

    public final LikeListResponse copy(boolean z, long j, List<User> list, boolean z2) {
        return new LikeListResponse(z, j, list, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeListResponse)) {
            return false;
        }
        LikeListResponse likeListResponse = (LikeListResponse) obj;
        return this.hasMore == likeListResponse.hasMore && this.cursor == likeListResponse.cursor && C89219l.m154714a(this.likeList, likeListResponse.likeList) && this.isShowLimit == likeListResponse.isShowLimit;
    }

    public final int hashCode() {
        boolean z = this.hasMore;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_comment_model_LikeListResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((i2 * 31) + m74400xe9f481db(this.cursor)) * 31;
        List<User> list = this.likeList;
        int hashCode = (com_ss_android_ugc_aweme_comment_model_LikeListResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        if (!this.isShowLimit) {
            i = 0;
        }
        return hashCode + i;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<User> getLikeList() {
        return this.likeList;
    }

    public final boolean isShowLimit() {
        return this.isShowLimit;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder("LikeListResponse{likeList:");
        List<User> list = this.likeList;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        return sb.append(num).append(", hasMore:").append(this.hasMore).append(", cursor:").append(this.cursor).append('}').toString();
    }

    public LikeListResponse(boolean z, long j, List<User> list, boolean z2) {
        this.hasMore = z;
        this.cursor = j;
        this.likeList = list;
        this.isShowLimit = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LikeListResponse(boolean z, long j, List list, boolean z2, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? null : list, (i & 8) != 0 ? false : z2);
    }
}
