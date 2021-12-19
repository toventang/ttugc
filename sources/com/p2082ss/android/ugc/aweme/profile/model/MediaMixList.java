package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.MixStruct;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.model.MediaMixList */
public final class MediaMixList extends BaseResponse {
    @AbstractC27891c(mo46611a = "cursor")
    public final long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public final int hasMore;
    @AbstractC27891c(mo46611a = "mix_infos")
    public final List<MixStruct> mixInfos;

    static {
        Covode.recordClassIndex(75190);
    }

    /* renamed from: com_ss_android_ugc_aweme_profile_model_MediaMixList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m115452x6a4fab31(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_profile_model_MediaMixList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m115453x6a4fab31(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.profile.model.MediaMixList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaMixList copy$default(MediaMixList mediaMixList, List list, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = mediaMixList.mixInfos;
        }
        if ((i2 & 2) != 0) {
            j = mediaMixList.cursor;
        }
        if ((i2 & 4) != 0) {
            i = mediaMixList.hasMore;
        }
        return mediaMixList.copy(list, j, i);
    }

    public final MediaMixList copy(List<? extends MixStruct> list, long j, int i) {
        return new MediaMixList(list, j, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMixList)) {
            return false;
        }
        MediaMixList mediaMixList = (MediaMixList) obj;
        return C89219l.m154714a(this.mixInfos, mediaMixList.mixInfos) && this.cursor == mediaMixList.cursor && this.hasMore == mediaMixList.hasMore;
    }

    public final int hashCode() {
        List<MixStruct> list = this.mixInfos;
        return ((((list != null ? list.hashCode() : 0) * 31) + m115453x6a4fab31(this.cursor)) * 31) + m115452x6a4fab31(this.hasMore);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MediaMixList(mixInfos=" + this.mixInfos + ", cursor=" + this.cursor + ", hasMore=" + this.hasMore + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.MixStruct> */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaMixList(List<? extends MixStruct> list, long j, int i) {
        this.mixInfos = list;
        this.cursor = j;
        this.hasMore = i;
    }
}
